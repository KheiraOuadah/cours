DROP TABLE IF EXISTS Employe;
DROP TABLE IF EXISTS Departement_usine;


CREATE TABLE Departement_usine (
    id_departement INT NOT NULL AUTO_INCREMENT,
    nom_departement VARCHAR(100),
    logo VARCHAR(100),
    PRIMARY KEY (id_departement)
);
CREATE TABLE Employe(
    id_employe INT NOT NULL AUTO_INCREMENT,
    nom_employe VARCHAR(100),
    ville_dept VARCHAR(100),
    date_embauche DATE,
    indice NUMERIC,
    salaire NUMERIC,
    photo VARCHAR(100),
    departement_id INT NOT NULL,
    PRIMARY KEY (id_employe),
    FOREIGN KEY (departement_id) REFERENCES Departement_usine(id_departement)
);


INSERT INTO Departement_usine (id_departement, nom_departement, logo)
VALUES
(NULL, 'Production','logo_production.png'),
(NULL, 'Marketing','logo_marketing.png'),
(NULL, 'Méthode','logo_methode.png'),
(NULL, 'Recherche et développement','logo_recherche_et_developpement.png');


INSERT INTO Employe(id_employe,nom_employe,ville_dept,date_embauche,indice,salaire, photo, departement_id) VALUES
    (NULL,'Gauthier', 'Belfort', '2011-09-06', 395, 2500 ,'employe1.png', 2),
    (NULL,'Peslier', 'Valdois', '2009-02-01', 375, 2800 ,'employe2.png', 1),
    (NULL,'Rousselet', 'Savoyeux', '2010-05-15', 295, 2000 ,'employe3.png', 3),
    (NULL,'Perez', 'Besançon', '2009-02-01', 255, 1500 ,'employe4.png', 1),
    (NULL,'Benatti', 'Pont-de-Planches', '2011-09-06', 285, 1900 ,'employe5.png', 3),
    (NULL,'Thiebaud', 'Frotey', '2011-09-06', 295, 2000 ,'employe6.png', 1),
    (NULL,'Gauthier', 'Valdoie', '2007-04-02', 285, 1900 ,'employe7.png', 3),
    (NULL,'Lambert', 'Belfort', '2012-03-01', 345, 2200 ,'employe8.png', 2),
    (NULL,'Dupond', 'Besancon', '2011-02-04', 275, 1800 ,'employe9.png', 1),
    (NULL,'Durand', 'Vesoul', '2011-02-04', 205, 1200 ,'no_photo.jpg', 1),
    (NULL,'Lapierre', 'Valdoie', '2012-07-25', 295, 2000 ,'employe10.png', 1),
    (NULL,'Philippe', 'Belfort', '2011-03-21', 345, 2200 ,'employe11.png', 2);


SELECT COUNT(Employe.id_employe) AS Nbre_employés ,
       Employe.departement_id

FROM Employe
JOIN Departement_usine ON Employe.departement_id = Departement_usine.id_departement
GROUP BY Employe.departement_id ;