-- Création de la table utilisateurs
DROP TABLE IF EXISTS utilisateurs;
CREATE TABLE utilisateurs (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50),
    prenom VARCHAR(50),
    age INT,
    majeur INT
);

DROP PROCEDURE IF EXISTS AjouterUtilisateur;
-- Création de la procédure stockée
DELIMITER //
CREATE PROCEDURE AjouterUtilisateur(IN nom_utilisateur VARCHAR(50),IN prenom_utilisateur VARCHAR(50),IN age_utilisateur INT)
BEGIN
    INSERT INTO utilisateurs (nom,prenom, age) VALUES (UPPER(nom_utilisateur),LOWER(prenom_utilisateur), age_utilisateur);
END //
DELIMITER ;

-- Appel de la procédure
CALL AjouterUtilisateur('Doe','John', 25);
CALL AjouterUtilisateur('Doe','Jane', 30);

-- Affichage du contenu de la table utilisateurs
SELECT * FROM utilisateurs;
###########################################################################

-- Création de la fonction
DELIMITER //
CREATE FUNCTION CalculerMoyenne(a DECIMAL(15,4), b DECIMAL(15,4))
RETURNS DECIMAL(15,4)
BEGIN
    DECLARE moyenne DECIMAL(5,2);
    SET moyenne = (a + b) / 2;
    RETURN moyenne;
END //
DELIMITER ;

-- Utilisation de la fonction
SELECT CalculerMoyenne(10, 20) AS MoyenneSet1;
SELECT CalculerMoyenne(5, 16.3333) AS MoyenneSet2;

DROP FUNCTION IF EXISTS CalculerMoyenne;
######################################################### EX 3

DROP PROCEDURE IF EXISTS MiseAJourAge;
-- Création de la procédure
DELIMITER //
CREATE PROCEDURE MiseAJourAge(IN id_utilisateur INT ,IN age_utilisateur INT)
BEGIN
    IF age_utilisateur >= 18 THEN
        update utilisateurs set majeur = 1,age = age_utilisateur where id = id_utilisateur;
    ELSE
        update utilisateurs set majeur = 0,age = age_utilisateur where id = id_utilisateur;
    END IF;
END //
DELIMITER ;

-- Appel de la procédure
CALL MiseAJourAge(1,20);
CALL MiseAJourAge(2,15);

########################################################### EX 4
-- Création de la table
DROP TABLE IF EXISTS nombres;
CREATE TABLE nombres (
    valeur INT
);
DROP PROCEDURE IF EXISTS RemplirNombres;

-- Insertion des valeurs de 1 à 10
DELIMITER //
CREATE PROCEDURE RemplirNombres()
BEGIN
    DECLARE i INT DEFAULT 1;
    WHILE i <= 10 DO
        INSERT INTO nombres (valeur) VALUES (i);
        SET i = i + 1;
    END WHILE;
END //
DELIMITER ;

-- Appel de la procédure
CALL RemplirNombres();

-- Affichage du contenu de la table
SELECT * FROM nombres;

############################################################## EX 5

-- Création de la table historique_utilisateurs
DROP TABLE IF EXISTS historique_utilisateurs;
CREATE TABLE historique_utilisateurs (
    id_utilisateur INT AUTO_INCREMENT PRIMARY KEY,
    nom_utilisateur VARCHAR(50),
    action VARCHAR(50)
);
DROP TRIGGER IF EXISTS  after_insert_utilisateur;

-- Création du déclencheur
DELIMITER //
CREATE TRIGGER after_insert_utilisateur
AFTER INSERT ON utilisateurs
FOR EACH ROW
BEGIN
    INSERT INTO historique_utilisateurs (id_utilisateur, nom_utilisateur, action)
    VALUES (NEW.id, NEW.nom, 'Ajout');
END //
DELIMITER ;
-- Ajout d'un utilisateur pour déclencher le déclencheur
INSERT INTO utilisateurs (nom, age) VALUES ('lionel', 28);


DROP TRIGGER IF EXISTS  before_insert_utilisateur;
DELIMITER //
CREATE TRIGGER before_insert_utilisateur
BEFORE INSERT ON utilisateurs
FOR EACH ROW
BEGIN
    SET NEW.nom = UPPER(NEW.nom);
    SET NEW.prenom = LOWER(NEW.prenom);
END //
DELIMITER ;

INSERT INTO utilisateurs (nom,prenom, age) VALUES ('sisi','nonon' ,28);
#Affichage du contenu de la table historique_utilisateurs
SELECT * FROM historique_utilisateurs;
SELECT * FROM utilisateurs;

#################################### EX6
DROP PROCEDURE IF EXISTS AfficherUtilisateurs ;
DELIMITER //
CREATE PROCEDURE AfficherUtilisateurs()
BEGIN
    DECLARE v_id INT;
    DECLARE v_nom VARCHAR(50);
    DECLARE v_age INT;
    DECLARE v_majeur INT;
    DECLARE v_utilisateur VARCHAR(255);
    DECLARE fin INT DEFAULT 0;
    DECLARE curs_utilisateur CURSOR FOR SELECT id,nom,age, majeur FROM utilisateurs;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET fin = 1;

    OPEN curs_utilisateur;
    FETCH curs_utilisateur INTO v_id,v_nom,v_age,v_majeur;
    WHILE (fin<>1) DO
        UPDATE utilisateurs SET age=age+1 WHERE id = v_id;
        SET v_utilisateur=CONCAT(v_id,' ; ', v_nom,' ; ',v_age+1,' ; ',IFNULL(v_majeur,''));
        SELECT v_utilisateur;
        FETCH curs_utilisateur INTO v_id,v_nom,v_age,v_majeur;
    END WHILE;
    CLOSE curs_utilisateur;
END //
DELIMITER ;

SELECT * FROM utilisateurs;
CALL AfficherUtilisateurs();
SELECT * FROM utilisateurs;

########################################################### ex 8
DROP TRIGGER IF EXISTS before_insert_utilisateur2;
DELIMITER //
CREATE TRIGGER before_insert_utilisateur2
BEFORE INSERT ON utilisateurs
FOR EACH ROW
BEGIN
    set NEW.nom = UPPER(NEW.nom);
    set NEW.prenom = LOWER(NEW.prenom);

    if NEW.age is not null then

        if NEW.age >= 18 then
            set NEW.majeur = 1;
        else
            set NEW.majeur = 0;
        end if;
    end if;
END //
DELIMITER ;

-- Test 1: Utilisateur majeur
INSERT INTO utilisateurs (nom, prenom, age) VALUES ('Dupond', 'Pierre', 28);
-- Test 2: Utilisateur mineur
INSERT INTO utilisateurs (nom, prenom, age) VALUES ('Durant', 'Paul', 17);
-- Test 3: Utilisateur sans âge spécifié
INSERT INTO utilisateurs (nom, prenom) VALUES ('Martin', 'Sophie');
-- Test 4: Utilisateur avec âge non numérique (générera une erreur)
INSERT INTO utilisateurs (nom, prenom, age) VALUES ('Leroy', 'Jean', 20);
-- Vérification des résultats
SELECT * FROM utilisateurs;
SELECT * FROM historique_utilisateurs;















