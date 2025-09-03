### Processus

### Protocoles

### HTTP

### FTP

### Courrier électronique
Messages sortants et entrants stockés sur le serveur de messagerie qui est associé à un nom de domaine (ex : @toto.fr)
transfert entre client/serveur et serveur/serveur se fait via SMTP. 
Adresse mail (nom de domaine) déclaré par DNS.
Un serveur, pour communiquer avec un autre, ouvre une connexion TCP. Puis envoie le message sur la connexion. 

SMTP (Simple Mail Transfert Protocol)
Received : chaque serveur ayant reçu le message y ajoute une ligne -> on peut retracer le chemin suivi par un message.

délimiteur : sépare le texte du mail des pièces jointes et sépare également les pièces jointes entre elles pour les différenciées.

POP (Post Office Protocol) ressemble à une boite au lettre : sort tous les email reçus et coupe la connexion (plus la possibilité de les retrouver sur le serveur).
IMAP : plutôt laisser les messages sur le serveur distant donc nécessité de garder la connexion avec celui-ci.

vulnérabilité aux spam et aux usurpations d'identité.

chiffrement symétrique : même clé secrète (inconvénient : attaquant à juste à découvrir clé secrète)
/ asymétrique : clé privée (ordi1) clé publique (ordi2), clé publique chiffre données et clé privée les déchiffre. (ordi 1 un génère les deux clés et envoie clé publique à ordi 2)
Authentification du proprio d'une clé publique : clé publique signé par une Autorité de Certification
