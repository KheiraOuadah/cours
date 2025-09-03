DROP TABLE IF EXISTS panier;
DROP TABLE IF EXISTS ligne;
DROP TABLE IF EXISTS commande;
DROP TABLE IF EXISTS article;
DROP TABLE IF EXISTS client;

CREATE TABLE IF NOT EXISTS article (
    id_article INT AUTO_INCREMENT
    , designation VARCHAR(255)
    , prix NUMERIC(19,4)
    , stock INT
    , PRIMARY KEY (id_article)
)CHARACTER SET 'utf8mb4' ;

CREATE TABLE IF NOT EXISTS client (
    id_client INT AUTO_INCREMENT
    , nom VARCHAR(25)
    , ville VARCHAR(25)
    , PRIMARY KEY (id_client)
)CHARACTER SET 'utf8mb4';

CREATE TABLE IF NOT EXISTS  commande (
    id_commande INT AUTO_INCREMENT
    , date_commande DATE
    , id_client INT
    , PRIMARY KEY (id_commande)
    , CONSTRAINT fk_commande_client_exo3 FOREIGN KEY (id_client) REFERENCES client(id_client)
)CHARACTER SET 'utf8mb4';

CREATE TABLE IF NOT EXISTS ligne (
    id_commande INT
    , id_article INT
    , quantite INT
    , PRIMARY KEY (id_commande,id_article)
    , CONSTRAINT fk_ligne_commande_exo3 FOREIGN KEY (id_commande) REFERENCES commande(id_commande)
    , CONSTRAINT fk_ligne_article_exo3 FOREIGN KEY (id_article) REFERENCES article(id_article)
);

CREATE TABLE IF NOT EXISTS panier (
    id_client INT
    , id_article INT
    , quantite INT
    , PRIMARY KEY (id_client,id_article)
    , CONSTRAINT fk_panier_client_exo3 FOREIGN KEY (id_client) REFERENCES client(id_client)
    , CONSTRAINT fk_panier_article_exo3 FOREIGN KEY (id_article) REFERENCES article(id_article)
);

INSERT INTO client VALUES
(1,'Mutz','Ruelisheim'),(2,'Rato','Besancon'),(3,'Goerig','Walheim'),(4,'Walter','Bretten'),
(5,'PAUTOT','Belfort'),(6,'PETIT','Belfort'),(7,'SAINT DIZIER','Sevenans'),(8,'SALVI','Offemont'),
(9,'TERRAT','Belfort'),(10,'TYRODE','Valdoie'),(11,'ALANKAYA','Bavilliers'),(12,'DAROSEY','Essert'),
(13,'duguet','Belfort'),(14,'ESSENBURGER','Belfort'),(15,'JAOUEN','Sevenans'),(16,'molin','Belfort'),
(17,'AMGHAR','Belfort'),(18,'BOUCHAUD','Belfort'),(19,'COTTARD','Belfort'),(20,'LAMOTTE','Belfort'),
(21,'METTEY','Belfort'),(22,'WOLF','Belfort'),(23,'BISMUTH','Belfort'),(24,'chaillet','Belfort'),(25,'DECOCK','Belfort');

INSERT INTO article VALUES
(1,'Gâteaux chocolat ( pâtisserie)',5.25,10),(2,'gâteau fraise (pâtisserie) ',5.25,10),(3,'Mouchoir ( hygiène)',2.54,10),
(4,'Coca cola ( boisson )',1.52,10),(5,'Salade ( légume ) ',2.00,10),(6,'Choux ( légume ) ',2.50,10),
(7,'Pomme de terre ( légume ) ',1.50,10),(8,'Tomate ( légume ) ',1.50,10),(9,'Haricot ( légume ) ',6.50,10),
(10,'Potiron ( légume ) ',3.00,10),(11,'Poireau ( légume ) ',1.50,10),(12,'Fenouil ( légume ) ',3.00,10),
(13,'Pissenlit ( légume ) ',5.00,10),(14,'Petit pois ( légume ) ',6.00,10),(15,'Poivron ( légume ) ',3.00,10),
(16,'Radis ( légume ) ',2.00,10),(17,'Pomme ( fruit ) ',3.00,10),(18,'Perrier ( 1L eau ) ',1.50,10),
(19,'Vittel ( 1L eau ) ',1.00,10);

INSERT INTO commande VALUES
(1,'2023-04-11',3),
(2,'2023-12-11',2),
(3,'2024-01-28',4),
(4,'2023-09-19',1),
(5,'2019-04-11',3),
(6,'2023-12-11',2),
(7,'2023-03-28',4),
(8,'2023-12-09',1);

INSERT INTO ligne VALUES
(1,4,12),(1,9,4),(1,12,4),(1,15,4),
(2,3,6),(2,6,6),(2,7,6),(2,14,6),
(3,1,3),(3,11,3),(3,12,3),(3,16,3),
(4,2,27),(4,8,5),(4,10,5),(4,17,5),
(5,12,4),
(6,11,3),
(7,8,5),
(8,14,6);

INSERT INTO panier(id_client, id_article, quantite) VALUES
(1,4,4),(1,7,4),
(2,4,4),(2,19,4),
(3,7,4),(3,17,4),
(4,4,4),(4,7,4),(4,17,4),(4,19,4),
(5,4,4),(5,7,4),(5,17,4),(5,19,4),
(6,4,4),(6,7,4),(6,17,4),(6,19,4);

DROP PROCEDURE IF EXISTS creer_commande;
-- Procédure pour créer une commande à partir du panier d'un client
DELIMITER $$

DROP PROCEDURE IF EXISTS creer_commande$$

-- Procédure pour créer une commande à partir du panier d'un client
DELIMITER $$

DROP PROCEDURE IF EXISTS creer_commande$$

CREATE PROCEDURE creer_commande(IN p_id_client INT)
BEGIN
    -- Variables pour la gestion des erreurs et du curseur
    DECLARE v_done INT DEFAULT FALSE;
    DECLARE v_id_article INT;
    DECLARE v_quantite INT;
    DECLARE v_stock_disponible INT;
    DECLARE v_id_commande INT;
    DECLARE v_count_panier INT;

    -- Curseur pour parcourir le panier du client
    DECLARE panier_cursor CURSOR FOR
        SELECT id_article, quantite
        FROM panier
        WHERE id_client = p_id_client;

    -- Handler pour la fin du curseur
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET v_done = TRUE;

    -- Vérifier si le panier n'est pas vide
    SELECT COUNT(*) INTO v_count_panier
    FROM panier
    WHERE id_client = p_id_client;

    IF v_count_panier = 0 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Le panier est vide.';
    END IF;

    -- Vérifier le stock avant de créer la commande
    OPEN panier_cursor;
    check_stock_loop: WHILE NOT v_done DO
        FETCH panier_cursor INTO v_id_article, v_quantite;
        IF NOT v_done THEN
            SELECT stock INTO v_stock_disponible
            FROM article
            WHERE id_article = v_id_article;

            IF v_quantite > v_stock_disponible THEN
                CLOSE panier_cursor;
                SET @error_msg = CONCAT('Stock insuffisant pour l''article avec id ', v_id_article, ' avec comme stock ', v_stock_disponible);
                SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = @error_msg;
            END IF;
        END IF;
    END WHILE check_stock_loop;
    CLOSE panier_cursor;

    -- Réinitialiser le flag pour le deuxième parcours
    SET v_done = FALSE;

    -- Créer l'enregistrement dans la table commande
    INSERT INTO commande (date_commande, id_client)
    VALUES (CURDATE(), p_id_client);

    -- Récupérer l'ID de la commande créée
    SET v_id_commande = LAST_INSERT_ID();

    -- SOLUTION 1 : Avec curseur et boucle WHILE
    -- Ouvrir le curseur pour parcourir le panier
    OPEN panier_cursor;

    panier_loop: WHILE NOT v_done DO
        FETCH panier_cursor INTO v_id_article, v_quantite;

        IF NOT v_done THEN
            -- Insérer dans la table ligne
            INSERT INTO ligne (id_commande, id_article, quantite)
            VALUES (v_id_commande, v_id_article, v_quantite);

            -- Mettre à jour le stock
            UPDATE article
            SET stock = stock - v_quantite
            WHERE id_article = v_id_article;
        END IF;
    END WHILE panier_loop;

    -- Fermer le curseur
    CLOSE panier_cursor;

    -- Vider le panier du client
    DELETE FROM panier WHERE id_client = p_id_client;

END$$

DELIMITER ;

SET @id_client=1;
SELECT * FROM panier WHERE id_client=@id_client;
SELECT * FROM commande WHERE id_client=@id_client;
CALL creer_commande(@id_client);
SELECT * FROM commande WHERE id_client=@id_client;




























