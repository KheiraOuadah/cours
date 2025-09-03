#! /usr/bin/python
# -*- coding:utf-8 -*-
import pymysql.cursors
from flask import Flask, request, render_template, redirect, url_for, abort, flash

app = Flask(__name__)
app.config["TEMPLATES_AUTO_RELOAD"] = True
app.secret_key = 'une cle(token) : grain de sel(any random string)'

from flask import session, g
import pymysql.cursors

def get_db():
    if 'db' not in g:
        g.db =  pymysql.connect(
            host="localhost",
            user="kouadah",
            password="632415",
            database="BDD_kouadah",
            charset='utf8mb4',
            cursorclass=pymysql.cursors.DictCursor
        )
    return g.db

@app.teardown_appcontext
def teardown_db(exception):
    db = g.pop('db', None)
    if db is not None:
        db.close()

#############################################################
@app.route('/')
def show_layout():
    return render_template('layout.html')

@app.route('/departement-usine/show', methods=['GET'])
def show_departement():
    mycursor = get_db().cursor()
    sql = ''' SELECT id_departement AS id,
    nom_departement AS nom,
    logo 
    FROM Departement_usine ;'''
    mycursor.execute(sql)
    departementsUsine = mycursor.fetchall()
    return render_template('departement-usine/show_departement.html', departementsUsine=departementsUsine)

@app.route('/departement-usine/add', methods=['GET'])
def add_departement():

    return render_template('departement-usine/add_departement.html')

@app.route('/departement-usine/add', methods=['POST'])
def valid_add_departement():
    nomDepartement = request.form.get('nomDepartement', '')
    logo = request.form.get('logo', '')
    mycursor = get_db().cursor()
    sql = '''INSERT INTO Departement_usine (nom_departement, logo) VALUES (%s, %s)'''
    mycursor.execute(sql, (nomDepartement, logo ) )
    get_db().commit()
    return redirect('/departement-usine/show')

@app.route('/departement-usine/delete', methods=['GET'])
def delete_departement():
    id = request.args.get('id', '')
    mycursor = get_db().cursor()
    sql = '''DELETE FROM Departement_usine WHERE id_departement = %s;'''
    mycursor.execute(sql,(id,))
    get_db().commit()

    return redirect('/departement-usine/show')

@app.route('/departement-usine/edit', methods=['GET'])
def edit_departement ():
    id = request.args.get('id', '')
    mycursor = get_db().cursor()
    sql = ''' SELECT id_departement AS id,
    nom_departement AS nom,
    logo 
    FROM Departement_usine 
    WHERE id_departement = %s ;'''
    mycursor.execute(sql, (id,))
    departementUsine = mycursor.fetchone()
    return render_template('departement-usine/edit_departement.html',departementUsine=departementUsine)

@app.route('/departement-usine/edit', methods=['POST'])
def valid_edit_departement():
    id = request.form['id']
    nomDepartement = request.form['nomDepartement']
    logo = request.form['logo']
    mycursor = get_db().cursor()
    sql = ''' UPDATE Departement_usine SET nom_departement = %s, logo = %s WHERE id_departement = %s '''
    mycursor.execute(sql, (nomDepartement, logo, id))
    get_db().commit()
    return redirect('/departement-usine/show')

@app.route('/employe/show')
def show_employe():
    mycursor = get_db().cursor()
    sql = ''' SELECT id_employe AS id,
        Departement_usine.id_departement AS id_dep,
        nom_employe AS nom,
        ville_dept AS ville,
        date_embauche,
        indice,
        salaire,
        photo
        FROM Employe 
        JOIN Departement_usine ON Employe.departement_id = Departement_usine.id_departement
        ORDER BY id ASC;'''
    mycursor.execute(sql)
    employes = mycursor.fetchall()
    return render_template('employe/show_employe.html', employes=employes)

@app.route('/employe/add', methods=['GET'])
def add_employe():
    mycursor = get_db().cursor()
    sql = ''' SELECT id_departement AS id,
    nom_departement AS nom
    FROM Departement_usine'''
    mycursor.execute(sql)
    employes = mycursor.fetchall()
    return render_template('employe/add_employe.html', employes=employes)

@app.route('/employe/add', methods=['POST'])
def valid_add_employe():
    nomEmploye = request.form.get('nomEmploye', '')
    villeDept = request.form.get('villeDept', '')
    dateEmbauche = request.form.get('dateEmbauche', '')
    indice = request.form.get('indice', '')
    salaire = request.form.get('salaire', '')
    photo = request.form.get('photo', '')
    departement_id = request.form.get('departement_id', '')
    mycursor = get_db().cursor()
    sql = ''' INSERT INTO Employe (nom_employe, ville_dept, date_embauche, indice, salaire,photo, departement_id) VALUES (%s, %s, %s, %s, %s, %s, %s)'''
    mycursor.execute(sql, (nomEmploye,villeDept,dateEmbauche,indice,salaire,photo,departement_id))
    get_db().commit()
    return redirect('/employe/show')

@app.route('/employe/delete', methods=['GET'])
def delete_employe():
    id = request.args.get('id', '')
    mycursor = get_db().cursor()
    sql = ''' DELETE FROM Employe WHERE id_employe = %s '''
    mycursor.execute(sql, (id,))
    get_db().commit()
    return redirect('/employe/show')

@app.route('/employe/edit', methods=['GET'])
def edit_employe():
    id = request.args.get('id', '')
    mycursor = get_db().cursor()

    sql_employe = ''' SELECT id_employe AS id,
        Departement_usine.id_departement AS id_dep,
        Departement_usine.nom_departement AS nom_dep,
        nom_employe AS nom,
        ville_dept AS ville,
        date_embauche,
        indice,
        salaire,
        photo
        FROM Employe 
        JOIN Departement_usine ON Employe.departement_id = Departement_usine.id_departement
        WHERE id_employe = %s;'''
    mycursor.execute(sql_employe, (id,))
    employes = mycursor.fetchone()
    sql_dep = '''SELECT id_departement AS id_dep,
    nom_departement AS nom
    FROM Departement_usine '''
    mycursor.execute(sql_dep)
    dep = mycursor.fetchall()

    return render_template('employe/edit_employe.html', employes=employes, dep=dep)

@app.route('/employe/edit', methods=['POST'])
def valid_edit_employe():
    id = request.form.get('id', '')
    nomEmploye = request.form.get('nomEmploye', '')
    villeDept = request.form.get('villeDept', '')
    dateEmbauche = request.form.get('dateEmbauche', '')
    indice = request.form.get('indice', '')
    salaire = request.form.get('salaire', '')
    photo = request.form.get('photo', '')
    departement_id = request.form.get('departement_id', '')

    mycursor = get_db().cursor()
    sql = '''UPDATE Employe
    SET nom_employe = %s,
    ville_dept = %s,
    date_embauche = %s,
    indice = %s,
    salaire = %s,
    photo = %s,
    departement_id = %s
    WHERE id_employe = %s;'''
    mycursor.execute(sql,(nomEmploye,villeDept,dateEmbauche,indice,salaire,photo,departement_id,id))
    get_db().commit()
    return redirect('/employe/show')

@app.route('/employe/filtre', methods=['GET'])
def filtre_employe():
    mycursor = get_db().cursor()
    sql_salaire = '''SELECT
    Departement_usine.nom_departement AS Nom_Departement,
    SUM(Employe.salaire) AS Salaire_Total
    FROM
        Employe
    JOIN
        Departement_usine ON Employe.departement_id = Departement_usine.id_departement
    GROUP BY
        Departement_usine.id_departement, Departement_usine.nom_departement;'''
    mycursor.execute(sql_salaire)
    salaire = mycursor.fetchall()
    sql_employes = ''' SELECT COUNT(Employe.id_employe) AS Nbre_employes,
       Departement_usine.nom_departement AS departement
    FROM Employe
    JOIN Departement_usine ON Employe.departement_id = Departement_usine.id_departement
    GROUP BY Employe.departement_id ;'''
    mycursor.execute(sql_employes)
    employes = mycursor.fetchall()

    return render_template('employe/front_employe_filtre_show.html', employes=employes, salaire = salaire)


if __name__ == '__main__':
    app.run()









