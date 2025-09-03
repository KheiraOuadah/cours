DROP TABLE IF EXISTS Ligne;
DROP TABLE IF EXISTS Commande;
DROP TABLE IF EXISTS Client;
DROP TABLE IF EXISTS Article;


CREATE TABLE IF NOT EXISTS Article(
    idArticle INT NOT NULL AUTO_INCREMENT,
    designation VARCHAR(100),
    prix DECIMAL (6,2),
    PRIMARY KEY (idArticle)
);

CREATE TABLE IF NOT EXISTS Client(
    idClient INT NOT NULL AUTO_INCREMENT,
    nom VARCHAR(100),
    ville VARCHAR(100),
    PRIMARY KEY(idClient)
);

CREATE TABLE IF NOT EXISTS Commande(
    idCommande INT NOT NULL AUTO_INCREMENT,
    dateCommande DATE,
    idClient INT NOT NULL,
    PRIMARY KEY (idCommande),
    CONSTRAINT fk_commande_client FOREIGN KEY (idClient) REFERENCES Client(idClient)
);

CREATE TABLE IF NOT EXISTS Ligne(
    idCommande INT NOT NULL,
    idArticle INT NOT NULL,
    quantite INT,
    PRIMARY KEY (idCommande, idArticle),
    CONSTRAINT fk_ligne_commande FOREIGN KEY (idCommande) REFERENCES Commande(idCommande),
    CONSTRAINT fk_ligne_article FOREIGN KEY (idArticle) REFERENCES Article(idArticle)
);

## 2

LOAD DATA LOCAL INFILE '/home/kouadah/Documents/cours/millet/s2/tp1/Article.csv' INTO TABLE Article FIELDS TERMINATED BY ',';
LOAD DATA LOCAL INFILE '/home/kouadah/Documents/cours/millet/s2/tp1/Client.csv' INTO TABLE Client FIELDS TERMINATED BY ',';
LOAD DATA LOCAL INFILE '/home/kouadah/Documents/cours/millet/s2/tp1/Commande.csv' INTO TABLE Commande FIELDS TERMINATED BY ',';
LOAD DATA LOCAL INFILE '/home/kouadah/Documents/cours/millet/s2/tp1/Ligne.csv' INTO TABLE Ligne FIELDS TERMINATED BY ',';


## 4

# ALTER TABLE Commande DROP FOREIGN KEY fk_commande_client;
# ALTER TABLE Ligne DROP FOREIGN KEY fk_ligne_commande;
# ALTER TABLE Ligne DROP FOREIGN KEY fk_ligne_article;
#
#
# ALTER TABLE Commande ADD CONSTRAINT fk_ligne_commande FOREIGN KEY (idClient)
# REFERENCES Client(idClient) ON DELETE CASCADE;
# ALTER TABLE Ligne ADD CONSTRAINT fk_commande_client FOREIGN KEY (idCommande)
# REFERENCES Commande(idCommande) ON DELETE CASCADE;
# ALTER TABLE Ligne ADD CONSTRAINT fk_ligne_article FOREIGN KEY (idArticle)
# REFERENCES Article(idArticle) ON DELETE CASCADE;
#
# SHOW CREATE table Commande;
# SHOW CREATE table Ligne;
#
# DELETE FROM Client WHERE nom LIKE "Mutz";
## sert à supprimer tous les enregistrements reliés à Mutz

## 5
# R1
SELECT nom
FROM Client
WHERE ville = 'Belfort' AND (nom LIKE 'm%' OR nom LIKE 'e%' OR nom LIKE 'd%'OR nom LIKE 'M%' OR nom LIKE 'E%' OR nom LIKE 'D%')
ORDER BY nom ASC;

# R2
SELECT designation,prix
FROM Article
WHERE (prix BETWEEN 6 AND 10) AND designation LIKE '%lég%'
ORDER BY designation ASC;

################## à part
# Les jointures internes.
# Les enregistrements sont retournés quand la condition est vraie dans les 2 tables.
SELECT *
FROM Client  -- *Syntaxe actuelle*
INNER JOIN Commande
ON Client.idClient = Commande.idClient; # pareil que join on
###########################

# R3
SELECT Client.nom, Commande.dateCommande
FROM Client
INNER JOIN Commande
ON Client.idClient = Commande.idClient
WHERE Client.nom = 'Mutz'
ORDER BY dateCommande ASC;

# R4

