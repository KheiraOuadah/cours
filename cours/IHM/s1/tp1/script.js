function calcul() {
    var taille = document.getElementById("taille").value;
    var masse = document.getElementById("masse").value;
    var imc = masse / (taille ** 2);
    //alert("votre imc est égal à : " + imc);
    if (taille == "") {
        document.getElementById("tailleRes").innerHTML ="Vous devez entrer une donnée dans le champ taille pour calculer.";
        document.getElementById("taille").style.backgroundColor = "rgba(255,0,0,0.3)";
    }
    else if (masse == "") {
        document.getElementById("masseRes").innerHTML ="Vous devez entrer une donnée dans le champ masse pour calculer.";
        document.getElementById("masse").style.backgroundColor = "rgba(255,0,0,0.3)";
    }
    else if (isNaN(taille)){
        document.getElementById("tailleRes").innerHTML ="Vous devez entrer un entier dans le champ taille pour calculer.";
        document.getElementById("taille").style.backgroundColor = "rgba(255,0,0,0.3)";
    }
    else if (isNaN(masse)){
        document.getElementById("masseRes").innerHTML ="Vous devez entrer un entier dans le champ masse pour calculer.";
        document.getElementById("masse").style.backgroundColor = "rgba(255,0,0,0.3)";
    }
    else if (Math.sign(taille)== -1){
        document.getElementById("tailleRes").innerHTML ="Voux devez entrer un entier positif dans le champ taille !";
        document.getElementById("taille").style.backgroundColor = "rgba(255,0,0,0.3)";
    }
    else if (Math.sign(masse)== -1){
        document.getElementById("masseRes").innerHTML ="Voux devez entrer un entier positif dans le champ masse !";
        document.getElementById("masse").style.backgroundColor = "rgba(255,0,0,0.3)";
    }
    else {
        document.getElementById("tailleRes").innerHTML ="";
        document.getElementById("masseRes").innerHTML ="";
        document.getElementById("taille").style.backgroundColor = "rgba(0,255,0,0.3)";
        document.getElementById("masse").style.backgroundColor = "rgba(0,255,0,0.3)";
        if (imc < 18.5) {
            document.getElementById("resultat").innerHTML = "Votre imc est égal à " + imc + " : état maigre";
        }
        if (imc > 18.5 && imc < 25) {
            document.getElementById("resultat").innerHTML = "Votre imc est égal à " + imc + " : état normal";
        }
        if (imc > 25 && imc < 30) {
            document.getElementById("resultat").innerHTML = "Votre imc est égal à " + imc + " : état surpoids";
        }
        if (imc > 30 && imc < 35) {
            document.getElementById("resultat").innerHTML = "Votre imc est égal à " + imc + " : état d'obésité";
        }
        if (imc > 35 && imc <= 40) {
            document.getElementById("resultat").innerHTML = "Votre imc est égal à " + imc + " : état d'obésité sévère";
        }
    }

}

//effacer les données des champs de texte
function effacer() {
    document.getElementById("taille").value = "";
    document.getElementById("masse").value = "";
    document.getElementById("resultat").innerHTML = "";
    document.getElementById("tailleRes").innerHTML ="";
    document.getElementById("masseRes").innerHTML ="";
    document.getElementById("taille").style.backgroundColor = "";
    document.getElementById("masse").style.backgroundColor = "";
}

//Exécuter le calcul avec Ctrl+C
var isCtrl = false;
document.onkeyup = function (e) {
    if (e.key === 'Control')
        isCtrl = false;
}
document.onkeydown = function (e) {
    if (e.key === 'Control') isCtrl = true;
    if (e.key === 'c' && isCtrl == true) {
        calcul();
    }
}

function validation() {
    var taille = document.getElementById("taille").value;
    var masse = document.getElementById("masse").value;

    document.getElementById("tailleRes").innerHTML ="";
    document.getElementById("masseRes").innerHTML ="";
    document.getElementById("taille").style.backgroundColor = "";
    document.getElementById("masse").style.backgroundColor = "";
    if (isNaN(taille)){
        document.getElementById("tailleRes").innerHTML ="Vous devez entrer un entier dans le champ taille pour calculer.";
        document.getElementById("taille").style.backgroundColor = "rgba(255,0,0,0.3)";
    }
    if (isNaN(masse)){
        document.getElementById("masseRes").innerHTML ="Vous devez entrer un entier dans le champ masse pour calculer.";
        document.getElementById("masse").style.backgroundColor = "rgba(255,0,0,0.3)";
    }
    else if (Math.sign(taille)== -1){
        document.getElementById("tailleRes").innerHTML ="Voux devez entrer un entier positif dans le champ taille !";
        document.getElementById("taille").style.backgroundColor = "rgba(255,0,0,0.3)";
    }
    else if (Math.sign(masse)== -1){
        document.getElementById("masseRes").innerHTML ="Voux devez entrer un entier positif dans le champ masse !";
        document.getElementById("masse").style.backgroundColor = "rgba(255,0,0,0.3)";
    }
}