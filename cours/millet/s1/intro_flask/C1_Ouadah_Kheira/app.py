#! /usr/bin/python
# -*- coding:utf-8 -*-
from flask import Flask, request, render_template, redirect, url_for, abort, flash

app = Flask(__name__)
app.config["TEMPLATES_AUTO_RELOAD"] = True
app.secret_key = 'une cle(token) : grain de sel(any random string)'

departementsUsine = [
    {'id':1,'nomDepartement':'Production', 'logo': 'logo_production.png'},
    {'id':2,'nomDepartement':'Marketing', 'logo': 'logo_marketing.png'},
    {'id':3,'nomDepartement':'Méthode', 'logo': 'logo_methode.png'},
    {'id':4,'nomDepartement':'Recherche et développement', 'logo': 'logo_recherche_et_developpement.png'}
]

employes = [
    {'id':1,'nomEmploye':'Gauthier', 'villeDept':'Belfort', 'dateEmbauche':'2011-09-06', 'indice':'395' , 'salaire':'2500', 'photo':'employe1.png', 'departement_id':2},
    {'id':2,'nomEmploye':'Peslier', 'villeDept':'Valdoie', 'dateEmbauche':'2009-02-01', 'indice':'375' , 'salaire':'2800', 'photo':'employe2.png', 'departement_id':1},
    {'id':3,'nomEmploye':'Rousselet', 'villeDept':'Savoyeux', 'dateEmbauche':'2010-05-15', 'indice':'295' , 'salaire':'2000', 'photo':'employe3.png', 'departement_id':3},
    {'id':4,'nomEmploye':'Perez', 'villeDept':'Besançon', 'dateEmbauche':'2009-02-01', 'indice':'255' , 'salaire':'1500', 'photo':'employe4.png', 'departement_id':1},
    {'id':5,'nomEmploye':'Benatti', 'villeDept':'Pont-de-Planches', 'dateEmbauche':'2011-09-06', 'indice':'285' , 'salaire':'1900', 'photo':'employe5.png', 'departement_id':3},
    {'id':6,'nomEmploye':'Thiebaud', 'villeDept':'Frotey', 'dateEmbauche':'2011-09-06', 'indice':'295' , 'salaire':'2000', 'photo':'employe6.png', 'departement_id':1},
    {'id':7,'nomEmploye':'Gauthier', 'villeDept':'Valdoie', 'dateEmbauche':'2007-04-02', 'indice':'285' , 'salaire':'1900', 'photo':'employe7.png', 'departement_id':3},
    {'id':8,'nomEmploye':'Lambert' , 'villeDept':'Belfort', 'dateEmbauche':'2012-03-01', 'indice':'345' , 'salaire':'2200', 'photo':'employe8.png', 'departement_id':2},
    {'id':9,'nomEmploye':'Dupond' , 'villeDept':'Besancon', 'dateEmbauche':'2011-02-04', 'indice':'275' , 'salaire':'1800', 'photo':'employe9.png', 'departement_id':1},
    {'id':10,'nomEmploye':'Durand', 'villeDept':'Vesoul', 'dateEmbauche':'2011-02-04', 'indice':'205' , 'salaire':'1200', 'photo':'no_photo.jpeg', 'departement_id':1},
    {'id':11,'nomEmploye':'Lapierre', 'villeDept':'Valdoie', 'dateEmbauche':'2012-07-25', 'indice':'295' , 'salaire':'2000', 'photo':'employe10.png', 'departement_id':1},
    {'id':12,'nomEmploye':'Philippe', 'villeDept':'Belfort', 'dateEmbauche':'2011-03-21', 'indice':'345' , 'salaire':'2200', 'photo':'employe11.png', 'departement_id':2}
]

@app.route('/')
def show_layout():
    return render_template('layout.html')

@app.route('/departement-usine/show')
def show_departement():
    return render_template('departement-usine/show_departement.html', departementsUsine=departementsUsine)

@app.route('/departement-usine/add', methods=['GET'])
def add_departement():
    return render_template('departement-usine/add_departement.html')

@app.route('/departement-usine/add', methods=['POST'])
def valid_add_departement():
    nomDepartement = request.form.get('nomDepartement', '')
    logo = request.form.get('logo', '')
    print(u'département ajouté , nom du département :', nomDepartement, "nom du logo :", logo)
    message = u'type ajouté , --nomDepartement :'+nomDepartement +" --nom du logo :"+logo
    flash(message, 'alert-success')
    return redirect('/departement-usine/show')

@app.route('/departement-usine/delete', methods=['GET'])
def delete_departement():
    id = request.args.get('id', '')
    print ("un département supprimé, id :",id)
    message=u'un département supprimé, id : ' + id
    flash(message, 'alert-warning')
    return redirect('/departement-usine/show')

@app.route('/departement-usine/edit', methods=['GET'])
def edit_type_article():
    id = request.args.get('id', '')
    id=int(id)
    departementUsine = departementsUsine[id-1]
    return render_template('departement-usine/edit_departement.html',departementUsine=departementUsine)

@app.route('/departement-usine/edit', methods=['POST'])
def valid_edit_departement():
    nomDepartement = request.form.get('nomDepartement', '')
    id = request.form.get('id', '')
    print(u'Un département modifié, --id: ',id, " --nomDepartement :", nomDepartement)
    message=u'type article modifié, id: ' + id + " nomDepartement : " + nomDepartement
    flash(message, 'alert-success')
    return redirect('/departement-usine/show')

@app.route('/employe/show')
def show_employe():
    return render_template('employe/show_employe.html', employes=employes)

@app.route('/employe/add', methods=['GET'])
def add_employe():
    return render_template('employe/add_employe.html')

@app.route('/employe/add', methods=['POST'])
def valid_add_employe():
    nomEmploye = request.form.get('nomEmploye', '')
    villeDept = request.form.get('villeDept', '')
    dateEmbauche = request.form.get('dateEmbauche', '')
    indice = request.form.get('indice', '')
    salaire = request.form.get('salaire', '')
    photo = request.form.get('photo', '')
    departement_id = request.form.get('departement_id', '')
    message = u'employé modifié , ---nom:'+nomEmploye + '---- ville/département:' + villeDept + ' ---- date d\'embauche:' + dateEmbauche + ' ----indice:'+  indice + ' ----salaire:' + salaire + ' ---image:' + photo + ' ---departement_id' + departement_id
    print(message)
    flash(message, 'alert-success')
    return redirect('/employe/show')

@app.route('/employe/delete', methods=['GET'])
def delete_employe():
    id = request.args.get('id', '')
    message=u'un employé supprimé, id : ' + id
    flash(message, 'alert-warning')
    return redirect('/employe/show')

@app.route('/employe/edit', methods=['GET'])
def edit_employe():
    id = request.args.get('id', '')
    id=int(id)
    employe = employes[id-1]
    return render_template('employe/edit_employe.html', employe=employe)

@app.route('/employe/edit', methods=['POST'])
def valid_edit_employe():
    nomEmploye = request.form.get('nomEmploye', '')
    villeDept = request.form.get('villeDept', '')
    dateEmbauche = request.form.get('dateEmbauche', '')
    indice = request.form.get('indice', '')
    salaire = request.form.get('salaire', '')
    photo = request.form.get('photo', '')
    departement_id = request.form.get('departement_id', '')
    message = u'employé modifié , ---nom :'+nomEmploye + '---- ville/département :' + villeDept + ' ---- date d\'embauche :' + dateEmbauche + ' ----indice :'+  indice + ' ----salaire :' + salaire + ' ---image :' + photo + ' ---departement_id : ' + departement_id
    print(message)
    flash(message, 'alert-success')
    return redirect('/employe/show')

@app.route('/employe/filtre', methods=['GET'])
def filtre_employe():
    filter_word = request.args.get('filter_word', None)
    filter_value_min = request.args.get('filter_value_min', None)
    filter_value_max = request.args.get('filter_value_max', None)
    filter_items = request.args.getlist('filter_items', None)
    if filter_word and filter_word!="":
        message = u'filtre sur le mot : ' + filter_word
        flash(message, 'alert-success')
    if filter_value_min or filter_value_max:
        if filter_value_min.isdecimal() and filter_value_max.isdecimal():
            if int(filter_value_min) < int(filter_value_max):
                message = u'filtre sur la colonne avec un numérique entre : ' + filter_value_min + 'et ' + filter_value_max
                flash(message,'alert-success')
            else:
                message=u'le minimum doit être inférieur au maximum '
                flash(message,'alert-warning')
        else:
            message=u'le minimum doit être inférieur au maximum !'
            flash(message,'alert-warning')
    if filter_items and filter_items != []:
        message= u'case à cocher selectionnée : '
        for case in filter_items :
            message+=' id: '+case + ' '
        flash(message,'alert-success')
    return render_template('employe/front_employe_filtre_show.html', employes=employes)


if __name__ == '__main__':
    app.run()









