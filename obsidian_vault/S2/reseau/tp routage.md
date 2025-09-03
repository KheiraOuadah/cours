https://cours-info.iut-bm.univ-fcomte.fr/upload/supports/S2/Service-Reseau/2024-2025/tp1.pdf

routage d'un paquet : acheminer paquet de machine source à machine destination.

Deux cas possible :

Machines appartiennent au même réseau => elles peuvent communiquer directement. Protocole ARP utilisé pour obtenir adresse MAC / physique associée à une adresse IP.
==> routage direct

Réseaux différents => trouver info de routage statique ou dynamique indiquant l'adresse du routeur de saut suivant. Acheminenement de proche en proche sans connaitre route complète. Donc adresse MAC du routeur qu'on trouvera dans la trame et pas adresse machine destination. Mais adresse IP de machine de destination pas celle du routeur. 
==> routage indirect

###### Anciennes commandes
Pour configurer une interface réseau sous Linux, on utilise la commande ifconfig.

https://cours-info.iut-bm.univ-fcomte.fr/upload/supports/S2/Service-Reseau/2024-2025/tp1-sae.pdf
configuration d'une machine virtuelle.
connexion ssh entre machine hôte et vm :
machine hôte peut se connecter à machine virtuelle mais pas l'inverse.

