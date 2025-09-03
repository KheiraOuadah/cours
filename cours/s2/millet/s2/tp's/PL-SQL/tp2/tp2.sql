DROP TABLE IF EXISTS Embauche;
DROP TABLE IF EXISTS Projet;
DROP TABLE IF EXISTS Grille_sal;
DROP TABLE IF EXISTS Employe;

CREATE TABLE Employe (
    NumSS INT(5) PRIMARY KEY,
    NomE VARCHAR(20),
    PrenomE VARCHAR(20),
    VilleE VARCHAR(20),
    DateNaiss DATE
);

CREATE TABLE Projet (
    NumProj INT(3) PRIMARY KEY,
    NomProj VARCHAR(20),
    RespProj INT,
    VilleP VARCHAR(20),
    Budget DECIMAL(10,2),
    FOREIGN KEY (RespProj) REFERENCES Employe(NumSS)
);

CREATE TABLE Grille_sal (
    profil VARCHAR(20) PRIMARY KEY,
    salaire DECIMAL(7,2)
);

CREATE TABLE Embauche (
    NumSS INT,
    NumProj INT,
    DateEmb DATE DEFAULT (CURRENT_DATE), -- curdate() , -- CURRENT_DATE,
    Profil VARCHAR(20),
    PRIMARY KEY (NumSS, NumProj, DateEmb),
    FOREIGN KEY (NumSS) REFERENCES Employe(NumSS),
    FOREIGN KEY (NumProj) REFERENCES Projet(NumProj),
    FOREIGN KEY (Profil) REFERENCES Grille_sal(profil)
);

INSERT INTO Employe (NumSS, NomE, PrenomE, VilleE, DateNaiss)
VALUES
(22334, 'Adam', 'Funk', 'Paris', STR_TO_DATE('01-12-1982', '%d-%m-%Y')),
(45566, 'Rachid', 'Allaoui', 'Lyon', STR_TO_DATE('13-04-1986', '%d-%m-%Y')),
(77889, 'Florent', 'Girac', 'Marseille', STR_TO_DATE('04-11-1990', '%d-%m-%Y')),
(90011, 'Mayla', 'Aoun', 'Lyon', STR_TO_DATE('26-03-1987', '%d-%m-%Y')),
(22233, 'Christine', 'Lara', 'Paris', STR_TO_DATE('09-08-1982', '%d-%m-%Y')),
(34445, 'Amel', 'Orlando', 'Lyon', STR_TO_DATE('14-02-1976', '%d-%m-%Y')),
(55666, 'Mohsen', 'Charef', 'Paris', STR_TO_DATE('28-05-1991', '%d-%m-%Y')),
(77788, 'Tim', 'Arabi', 'Marseille', STR_TO_DATE('08-06-1984', '%d-%m-%Y')),
(89990, 'Fernando', 'Lopez', 'Lyon', STR_TO_DATE('05-10-1993', '%d-%m-%Y')),
(11122, 'Alain', 'Tan Lee', 'Marseille', STR_TO_DATE('21-03-1994', '%d-%m-%Y')),
(11123, 'Franck', 'Morel', 'Lille', STR_TO_DATE('10-01-1945', '%d-%m-%Y')),
(11124, 'Albert', 'Maure', 'Paris', STR_TO_DATE('10-01-1948', '%d-%m-%Y')),
(11125, 'Beatrice', 'Malloire', 'Paris', STR_TO_DATE('10-01-1946', '%d-%m-%Y')),
(11126,'Christian', 'Millan', 'Paris', STR_TO_DATE('10-01-1947', '%d-%m-%Y'))
;


INSERT INTO Projet VALUES (123, 'ADOOP', 22334, 'Paris', 120000);
INSERT INTO Projet VALUES (757, 'SKALA', 45566, 'Lyon', 180000);
INSERT INTO Projet VALUES (890, 'BAJA', 22334, 'Paris', 24000);

INSERT INTO Grille_sal VALUES ('Admin', 80000);
INSERT INTO Grille_sal VALUES ('Deve', 45000);
INSERT INTO Grille_sal VALUES ('Tech', 35000);

INSERT INTO Embauche VALUES (77889, 123, STR_TO_DATE('01-03-2014', '%d-%m-%Y'), 'Deve');
INSERT INTO Embauche VALUES (90011, 123, STR_TO_DATE('01-05-2014', '%d-%m-%Y'), 'Tech');
INSERT INTO Embauche VALUES (22233, 757, STR_TO_DATE('01-03-2014', '%d-%m-%Y'), 'Deve');

SELECT * FROM Employe;
/* EXO 1 */
# DROP PROCEDURE IF EXISTS SupprimerEmployesAges;
#
# DELIMITER //
# CREATE PROCEDURE SupprimerEmployesAges()
# BEGIN
#     DECLARE nb_suppr INT DEFAULT 0;
#     DELETE FROM Employe
#     WHERE TIMESTAMPDIFF(YEAR, DateNaiss, CURDATE()) >= 70;
#
#     SET nb_suppr = ROW_COUNT();
#
#     IF nb_suppr > 0 THEN
#         SELECT CONCAT(nb_suppr, ' employé(s) supprimé(s).') AS Message;
#     ELSE
#         SELECT 'Aucun employé supprimé.' AS Message;
#     END IF;
# END;
# //
# DELIMITER ;
#
# CALL SupprimerEmployesAges();

/* EXO 2 */
# pas de loupe !!
# DROP PROCEDURE IF EXISTS ModifierProfilsAvecP;
#
# DELIMITER //
#
# CREATE PROCEDURE ModifierProfilsAvecP()
# BEGIN
#     DECLARE i INT DEFAULT 0;
#     DECLARE total INT DEFAULT 0;
#     DECLARE oldProfil VARCHAR(20);
#
#     ALTER TABLE Embauche DROP FOREIGN KEY Embauche_ibfk_3;
#
#     CREATE TEMPORARY TABLE IF NOT EXISTS tmp_profils AS
#     SELECT profil FROM Grille_sal;
#
#     SELECT COUNT(*) INTO total FROM tmp_profils;
#
#     WHILE i < total DO
#         SELECT profil INTO oldProfil
#         FROM tmp_profils
#         LIMIT i, 1;
#
#         UPDATE Grille_sal
#         SET profil = CONCAT('P', oldProfil)
#         WHERE profil = oldProfil;
#
#         UPDATE Embauche
#         SET Profil = CONCAT('P', oldProfil)
#         WHERE Profil = oldProfil;
#
#         SET i = i + 1;
#     END WHILE;
#     DROP TEMPORARY TABLE IF EXISTS tmp_profils;
#
#     ALTER TABLE Embauche
#     ADD CONSTRAINT fk_Profil FOREIGN KEY (Profil)
#     REFERENCES Grille_sal(profil);
#
#     SELECT 'Les profils ont été modifiés avec succès.' AS Message;
# END;
# //
#
# DELIMITER ;
#
# CALL ModifierProfilsAvecP();

# SELECT profil, salaire
# FROM Grille_sal;

/* EXO4 */
DROP PROCEDURE IF EXISTS AfficherProjetsEtEmployes;

DELIMITER //

CREATE PROCEDURE AfficherProjetsEtEmployes()
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE i INT DEFAULT 0;
    DECLARE total INT DEFAULT 0;
    DECLARE v_NumProj INT;
    DECLARE v_NomProj VARCHAR(50);

    CREATE TEMPORARY TABLE IF NOT EXISTS tmp_projets AS
    SELECT NumProj, NomProj FROM Projet;

    SELECT COUNT(*) INTO total FROM tmp_projets;

    WHILE i < total DO

        SELECT NumProj, NomProj
        INTO v_NumProj, v_NomProj
        FROM tmp_projets
        LIMIT i, 1;

        SELECT CONCAT('Projet : ', v_NomProj) AS Projet;

        SELECT CONCAT('- Employé : ', e.NomE, ' ', e.PrenomE) AS Employe
        FROM Employe e
        JOIN Embauche em ON e.NumSS = em.NumSS
        WHERE em.NumProj = v_NumProj;

        SET i = i + 1;
    END WHILE;

    DROP TEMPORARY TABLE IF EXISTS tmp_projets;
END;
//
DELIMITER ;

CALL AfficherProjetsEtEmployes();







