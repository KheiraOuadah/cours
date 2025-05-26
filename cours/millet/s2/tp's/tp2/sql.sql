DROP TABLE IF EXISTS classement;
DROP TABLE IF EXISTS comporte;
DROP TABLE IF EXISTS skieur;
DROP TABLE IF EXISTS competition;
DROP TABLE IF EXISTS specialite;
DROP TABLE IF EXISTS station;

CREATE TABLE IF NOT EXISTS station
(
    idStation  INT AUTO_INCREMENT,
    nomStation VARCHAR(255),
    altitude   INT,
    pays       VARCHAR(255),
    PRIMARY KEY (idStation)
);
CREATE TABLE IF NOT EXISTS specialite
(
    idSpecialite      INT AUTO_INCREMENT,
    libelleSpecialite VARCHAR(255),
    PRIMARY KEY (idSpecialite)
);
CREATE TABLE IF NOT EXISTS competition
(
    idCompetition INT AUTO_INCREMENT,
    libelleCompet VARCHAR(255),
    dateComp      DATE,
    station_id    INT,
    PRIMARY KEY (idCompetition),
    CONSTRAINT fk_competition_station FOREIGN KEY (station_id)
        REFERENCES station (idStation)
);
CREATE TABLE IF NOT EXISTS skieur
(
    idSkieur      INT AUTO_INCREMENT,
    nomSkieur     VARCHAR(255),
    specialite_id INT,
    station_id    INT,
    PRIMARY KEY (idSkieur),
    CONSTRAINT fk_skieur_specialite FOREIGN KEY (specialite_id)
        REFERENCES specialite (idSpecialite),
    CONSTRAINT fk_skieur_station FOREIGN KEY (station_id)
        REFERENCES station (idStation)
);
CREATE TABLE IF NOT EXISTS comporte
(
    competition_id INT,
    specialite_id  INT,
    PRIMARY KEY (competition_id, specialite_id),
    CONSTRAINT fk_comporte_competition FOREIGN KEY (competition_id)
        REFERENCES competition (idCompetition),
    CONSTRAINT fk_comporte_specialite FOREIGN KEY (specialite_id)
        REFERENCES specialite (idSpecialite)
);
CREATE TABLE IF NOT EXISTS classement
(
    skieur_id      INT,
    competition_id INT,
    classement     INT NOT NULL,
    PRIMARY KEY (skieur_id, competition_id),
    CONSTRAINT fk_classement_skieur FOREIGN KEY (skieur_id)
        REFERENCES skieur (idSkieur),
    CONSTRAINT fk_classement_competition FOREIGN KEY (competition_id)
        REFERENCES competition (idCompetition)
);

-- LOAD DATA --

LOAD DATA LOCAL INFILE '/home/kouadah/Documents/cours/millet/s2/tp2/STATION.csv' INTO TABLE station FIELDS TERMINATED BY ',';
LOAD DATA LOCAL INFILE '/home/kouadah/Documents/cours/millet/s2/tp2/SPECIALITE.csv' INTO TABLE specialite FIELDS TERMINATED BY ',';
LOAD DATA LOCAL INFILE '/home/kouadah/Documents/cours/millet/s2/tp2/COMPETITION.csv' INTO TABLE competition FIELDS TERMINATED BY ',';
LOAD DATA LOCAL INFILE '/home/kouadah/Documents/cours/millet/s2/tp2/SKIEUR.csv' INTO TABLE skieur FIELDS TERMINATED BY ',';
LOAD DATA LOCAL INFILE '/home/kouadah/Documents/cours/millet/s2/tp2/COMPORTE.csv' INTO TABLE comporte FIELDS TERMINATED BY ',';
LOAD DATA LOCAL INFILE '/home/kouadah/Documents/cours/millet/s2/tp2/CLASSEMENT.csv' INTO TABLE classement FIELDS TERMINATED BY ',';


-- 2 --
# 1
SELECT COUNT(DISTINCT skieur_id)
FROM classement;

# 2
SELECT skieur.nomSkieur, station.nomStation
FROM skieur
         JOIN station
              ON skieur.station_id = station.idStation
ORDER BY nomStation ASC;

# 3
SELECT skieur.nomSkieur, classement.classement, competition.libelleCompet
FROM classement
         JOIN skieur ON skieur.idSkieur = classement.skieur_id
         JOIN competition ON competition.idCompetition = classement.competition_id
ORDER BY libelleCompet ASC;

# 4
SELECT competition.libelleCompet, skieur.nomSkieur
FROM classement
         JOIN competition ON competition.idCompetition = classement.competition_id
         JOIN station ON station.idStation = competition.station_id
         JOIN skieur ON skieur.idSkieur = classement.skieur_id
WHERE classement.classement = 1
  AND station.nomStation = 'Tignes';

# 5
SELECT station.idStation, station.nomStation, COUNT(competition.idCompetition) AS nbrDeCompet
FROM station
         JOIN competition ON competition.station_id = station.idStation
GROUP BY station.idStation, station.nomStation
ORDER BY nomStation ASC;

# 6
SELECT skieur.idSkieur, skieur.nomSkieur, COUNT(classement.skieur_id) AS NbreDeVictoires
FROM classement
         JOIN skieur ON classement.skieur_id = skieur.idSkieur
         JOIN competition ON classement.competition_id = competition.idCompetition
         JOIN station ON competition.station_id = station.idStation
WHERE classement.classement = 1
  AND station.nomStation = 'Tignes'
GROUP BY skieur.idSkieur, skieur.nomSkieur;

# 7 nom skieur ayant tjr terminé 1er
SELECT nomSkieur
FROM skieur
JOIN classement ON skieur.idSkieur = classement.skieur_id
GROUP BY nomSkieur
HAVING MAX(classement.classement) = 1;

#WHERE classement.classement = 1 ;

# SET FOREIGN_KEY_CHECKS = 0;
# TRUNCATE ;
# SET FOREIGN_KEY_CHECKS = 1;














