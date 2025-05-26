```bash
./launcher.sh
bash: ./launcher.sh: Permission non accordée
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ ls -lah
total 40K
drwxrwxr-x 6 kouadah kouadah 4,0K déc.  13 14:07 .
drwxrwxr-x 5 kouadah kouadah 4,0K déc.  13 14:07 ..
-rw-rw-r-- 1 kouadah kouadah 7,2K déc.  13 14:02 app.py
drwxrwxr-x 4 kouadah kouadah 4,0K déc.  13 14:07 .idea
-rw-rw-r-- 1 kouadah kouadah   45 nov.  27 08:42 launcher.sh
drwxrwxr-x 2 kouadah kouadah 4,0K déc.  13 14:07 __pycache__
-rw-rw-r-- 1 kouadah kouadah 2,0K déc.   6 14:40 sql.sql
drwxrwxr-x 3 kouadah kouadah 4,0K déc.  13 14:07 static
drwxrwxr-x 4 kouadah kouadah 4,0K déc.  13 14:07 templates
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ chmod +x launcher.sh 
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ ./launcher.sh
./launcher.sh: ligne 1: flask : commande introuvable
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ flask --version
La commande « flask » n'a pas été trouvée, mais peut être installée avec :
sudo apt install python3-flask
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ sudo apt install python3-flask
[sudo] Mot de passe de kouadah : 
Lecture des listes de paquets... Fait
Construction de l'arbre des dépendances... Fait
Lecture des informations d'état... Fait      
Les paquets suivants ont été installés automatiquement et ne sont plus nécessaires :
  linux-headers-6.8.0-41 linux-headers-6.8.0-41-generic
  linux-image-6.8.0-41-generic linux-modules-6.8.0-41-generic
  linux-modules-extra-6.8.0-41-generic linux-tools-6.8.0-41
  linux-tools-6.8.0-41-generic
Veuillez utiliser « sudo apt autoremove » pour les supprimer.
Les paquets supplémentaires suivants seront installés : 
  javascript-common libjs-jquery python3-asgiref python3-itsdangerous
  python3-openssl python3-pyasyncore python3-pyinotify python3-simplejson
  python3-werkzeug
Paquets suggérés :
  python3-dotenv python-flask-doc python-openssl-doc python3-openssl-dbg
  python-pyinotify-doc ipython3 python-werkzeug-doc python3-lxml
  python3-watchdog
Les NOUVEAUX paquets suivants seront installés :
  javascript-common libjs-jquery python3-asgiref python3-flask
  python3-itsdangerous python3-openssl python3-pyasyncore python3-pyinotify
  python3-simplejson python3-werkzeug
0 mis à jour, 10 nouvellement installés, 0 à enlever et 20 non mis à jour.
Il est nécessaire de prendre 763 ko dans les archives.
Après cette opération, 2 897 ko d'espace disque supplémentaires seront utilisés.
Souhaitez-vous continuer ? [O/n] 
Réception de :1 http://archive.ubuntu.com/ubuntu noble/main amd64 javascript-common all 11+nmu1 [5 936 B]
Réception de :2 http://archive.ubuntu.com/ubuntu noble/main amd64 libjs-jquery all 3.6.1+dfsg+~3.5.14-1 [328 kB]
Réception de :3 http://archive.ubuntu.com/ubuntu noble/main amd64 python3-asgiref all 3.7.2-1 [24,8 kB]
Réception de :4 http://archive.ubuntu.com/ubuntu noble/main amd64 python3-itsdangerous all 2.1.2-4 [14,6 kB]
Réception de :5 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 python3-werkzeug all 3.0.1-3ubuntu0.2 [170 kB]
Réception de :6 http://archive.ubuntu.com/ubuntu noble/main amd64 python3-flask all 3.0.2-1ubuntu1 [82,9 kB]
Réception de :7 http://archive.ubuntu.com/ubuntu noble/main amd64 python3-openssl all 23.2.0-1 [47,8 kB]
Réception de :8 http://archive.ubuntu.com/ubuntu noble/main amd64 python3-pyasyncore all 1.0.2-2 [10,1 kB]
Réception de :9 http://archive.ubuntu.com/ubuntu noble/main amd64 python3-pyinotify all 0.9.6-2ubuntu1 [25,0 kB]
Réception de :10 http://archive.ubuntu.com/ubuntu noble/main amd64 python3-simplejson amd64 3.19.2-1build2 [54,5 kB]
763 ko réceptionnés en 2s (475 ko/s)            
Sélection du paquet javascript-common précédemment désélectionné.
(Lecture de la base de données... 233029 fichiers et répertoires déjà installés.
)
Préparation du dépaquetage de .../0-javascript-common_11+nmu1_all.deb ...
Dépaquetage de javascript-common (11+nmu1) ...
Sélection du paquet libjs-jquery précédemment désélectionné.
Préparation du dépaquetage de .../1-libjs-jquery_3.6.1+dfsg+~3.5.14-1_all.deb ..
.
Dépaquetage de libjs-jquery (3.6.1+dfsg+~3.5.14-1) ...
Sélection du paquet python3-asgiref précédemment désélectionné.
Préparation du dépaquetage de .../2-python3-asgiref_3.7.2-1_all.deb ...
Dépaquetage de python3-asgiref (3.7.2-1) ...
Sélection du paquet python3-itsdangerous précédemment désélectionné.
Préparation du dépaquetage de .../3-python3-itsdangerous_2.1.2-4_all.deb ...
Dépaquetage de python3-itsdangerous (2.1.2-4) ...
Sélection du paquet python3-werkzeug précédemment désélectionné.
Préparation du dépaquetage de .../4-python3-werkzeug_3.0.1-3ubuntu0.2_all.deb ..
.
Dépaquetage de python3-werkzeug (3.0.1-3ubuntu0.2) ...
Sélection du paquet python3-flask précédemment désélectionné.
Préparation du dépaquetage de .../5-python3-flask_3.0.2-1ubuntu1_all.deb ...
Dépaquetage de python3-flask (3.0.2-1ubuntu1) ...
Sélection du paquet python3-openssl précédemment désélectionné.
Préparation du dépaquetage de .../6-python3-openssl_23.2.0-1_all.deb ...
Dépaquetage de python3-openssl (23.2.0-1) ...
Sélection du paquet python3-pyasyncore précédemment désélectionné.
Préparation du dépaquetage de .../7-python3-pyasyncore_1.0.2-2_all.deb ...
Dépaquetage de python3-pyasyncore (1.0.2-2) ...
Sélection du paquet python3-pyinotify précédemment désélectionné.
Préparation du dépaquetage de .../8-python3-pyinotify_0.9.6-2ubuntu1_all.deb ...
Dépaquetage de python3-pyinotify (0.9.6-2ubuntu1) ...
Sélection du paquet python3-simplejson précédemment désélectionné.
Préparation du dépaquetage de .../9-python3-simplejson_3.19.2-1build2_amd64.deb 
...
Dépaquetage de python3-simplejson (3.19.2-1build2) ...
Paramétrage de javascript-common (11+nmu1) ...
apache2_invoke: Enable configuration javascript-common
Paramétrage de python3-openssl (23.2.0-1) ...
Paramétrage de python3-itsdangerous (2.1.2-4) ...
Paramétrage de python3-simplejson (3.19.2-1build2) ...
Paramétrage de python3-pyasyncore (1.0.2-2) ...
Paramétrage de libjs-jquery (3.6.1+dfsg+~3.5.14-1) ...
Paramétrage de python3-asgiref (3.7.2-1) ...
Paramétrage de python3-pyinotify (0.9.6-2ubuntu1) ...
Paramétrage de python3-werkzeug (3.0.1-3ubuntu0.2) ...
Paramétrage de python3-flask (3.0.2-1ubuntu1) ...
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ ./launcher.sh
Usage: flask run [OPTIONS]
Try 'flask run --help' for help.

Error: While importing 'app', an ImportError was raised:

Traceback (most recent call last):
  File "/usr/lib/python3/dist-packages/flask/cli.py", line 247, in locate_app
    __import__(module_name)
  File "/home/kouadah/Documents/recup/cours/millet/C1_Ouadah_Kheira/app.py", line 10, in <module>
    import pymysql.cursors
ModuleNotFoundError: No module named 'pymysql'

kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ pip  install PyMySQL
La commande « pip » n'a pas été trouvée, mais peut être installée avec :
sudo apt install python3-pip
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ udo apt install python3-pip
La commande « udo » n'a pas été trouvée, mais peut être installée avec :
sudo apt install udo
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ sudo apt install python3-pip
Lecture des listes de paquets... Fait
Construction de l'arbre des dépendances... Fait
Lecture des informations d'état... Fait      
Les paquets suivants ont été installés automatiquement et ne sont plus nécessaires :
  linux-headers-6.8.0-41 linux-headers-6.8.0-41-generic
  linux-image-6.8.0-41-generic linux-modules-6.8.0-41-generic
  linux-modules-extra-6.8.0-41-generic linux-tools-6.8.0-41
  linux-tools-6.8.0-41-generic
Veuillez utiliser « sudo apt autoremove » pour les supprimer.
Les paquets supplémentaires suivants seront installés : 
  binutils binutils-common binutils-x86-64-linux-gnu build-essential bzip2
  dpkg-dev fakeroot g++ g++-13 g++-13-x86-64-linux-gnu g++-x86-64-linux-gnu
  gcc gcc-13 gcc-13-x86-64-linux-gnu gcc-x86-64-linux-gnu
  libalgorithm-diff-perl libalgorithm-diff-xs-perl libalgorithm-merge-perl
  libasan8 libbinutils libcc1-0 libctf-nobfd0 libctf0 libdpkg-perl
  libexpat1-dev libfakeroot libfile-fcntllock-perl libgcc-13-dev libgprofng0
  libhwasan0 libitm1 libjs-sphinxdoc libjs-underscore liblsan0 libpython3-dev
  libpython3.12-dev libquadmath0 libsframe1 libstdc++-13-dev libtsan2
  libubsan1 lto-disabled-list make python3-dev python3-setuptools
  python3-wheel python3.12-dev zlib1g-dev
Paquets suggérés :
  binutils-doc gprofng-gui bzip2-doc debian-keyring g++-multilib
  g++-13-multilib gcc-13-doc gcc-multilib autoconf automake libtool flex bison
  gcc-doc gcc-13-multilib gcc-13-locales gdb-x86-64-linux-gnu bzr
  libstdc++-13-doc make-doc python-setuptools-doc
Les NOUVEAUX paquets suivants seront installés :
  binutils binutils-common binutils-x86-64-linux-gnu build-essential bzip2
  dpkg-dev fakeroot g++ g++-13 g++-13-x86-64-linux-gnu g++-x86-64-linux-gnu
  gcc gcc-13 gcc-13-x86-64-linux-gnu gcc-x86-64-linux-gnu
  libalgorithm-diff-perl libalgorithm-diff-xs-perl libalgorithm-merge-perl
  libasan8 libbinutils libcc1-0 libctf-nobfd0 libctf0 libdpkg-perl
  libexpat1-dev libfakeroot libfile-fcntllock-perl libgcc-13-dev libgprofng0
  libhwasan0 libitm1 libjs-sphinxdoc libjs-underscore liblsan0 libpython3-dev
  libpython3.12-dev libquadmath0 libsframe1 libstdc++-13-dev libtsan2
  libubsan1 lto-disabled-list make python3-dev python3-pip python3-setuptools
  python3-wheel python3.12-dev zlib1g-dev
0 mis à jour, 49 nouvellement installés, 0 à enlever et 20 non mis à jour.
Il est nécessaire de prendre 66,4 Mo dans les archives.
Après cette opération, 252 Mo d'espace disque supplémentaires seront utilisés.
Souhaitez-vous continuer ? [O/n] 
Réception de :1 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 binutils-common amd64 2.42-4ubuntu2.3 [239 kB]
Réception de :2 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libsframe1 amd64 2.42-4ubuntu2.3 [14,9 kB]
Réception de :3 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libbinutils amd64 2.42-4ubuntu2.3 [575 kB]
Réception de :4 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libctf-nobfd0 amd64 2.42-4ubuntu2.3 [97,1 kB]
Réception de :5 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libctf0 amd64 2.42-4ubuntu2.3 [94,5 kB]
Réception de :6 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libgprofng0 amd64 2.42-4ubuntu2.3 [849 kB]
Réception de :7 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 binutils-x86-64-linux-gnu amd64 2.42-4ubuntu2.3 [2 463 kB]
Réception de :8 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 binutils amd64 2.42-4ubuntu2.3 [18,1 kB]
Réception de :9 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libcc1-0 amd64 14.2.0-4ubuntu2~24.04 [48,0 kB]
Réception de :10 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libitm1 amd64 14.2.0-4ubuntu2~24.04 [29,7 kB]
Réception de :11 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libasan8 amd64 14.2.0-4ubuntu2~24.04 [3 031 kB]
Réception de :12 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 liblsan0 amd64 14.2.0-4ubuntu2~24.04 [1 322 kB]
Réception de :13 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libtsan2 amd64 14.2.0-4ubuntu2~24.04 [2 772 kB]
Réception de :14 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libubsan1 amd64 14.2.0-4ubuntu2~24.04 [1 184 kB]
Réception de :15 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libhwasan0 amd64 14.2.0-4ubuntu2~24.04 [1 641 kB]
Réception de :16 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libquadmath0 amd64 14.2.0-4ubuntu2~24.04 [153 kB]
Réception de :17 http://archive.ubuntu.com/ubuntu noble/main amd64 libgcc-13-dev amd64 13.2.0-23ubuntu4 [2 688 kB]
Réception de :18 http://archive.ubuntu.com/ubuntu noble/main amd64 gcc-13-x86-64-linux-gnu amd64 13.2.0-23ubuntu4 [21,9 MB]
Réception de :19 http://archive.ubuntu.com/ubuntu noble/main amd64 gcc-13 amd64 13.2.0-23ubuntu4 [482 kB]
Réception de :20 http://archive.ubuntu.com/ubuntu noble/main amd64 gcc-x86-64-linux-gnu amd64 4:13.2.0-7ubuntu1 [1 212 B]
Réception de :21 http://archive.ubuntu.com/ubuntu noble/main amd64 gcc amd64 4:13.2.0-7ubuntu1 [5 018 B]
Réception de :22 http://archive.ubuntu.com/ubuntu noble/main amd64 libstdc++-13-dev amd64 13.2.0-23ubuntu4 [2 399 kB]
Réception de :23 http://archive.ubuntu.com/ubuntu noble/main amd64 g++-13-x86-64-linux-gnu amd64 13.2.0-23ubuntu4 [12,5 MB]
Réception de :24 http://archive.ubuntu.com/ubuntu noble/main amd64 g++-13 amd64 13.2.0-23ubuntu4 [14,5 kB]
Réception de :25 http://archive.ubuntu.com/ubuntu noble/main amd64 g++-x86-64-linux-gnu amd64 4:13.2.0-7ubuntu1 [964 B]
Réception de :26 http://archive.ubuntu.com/ubuntu noble/main amd64 g++ amd64 4:13.2.0-7ubuntu1 [1 100 B]
Réception de :27 http://archive.ubuntu.com/ubuntu noble/main amd64 make amd64 4.3-4.1build2 [180 kB]
Réception de :28 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libdpkg-perl all 1.22.6ubuntu6.1 [269 kB]
Réception de :29 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 bzip2 amd64 1.0.8-5.1build0.1 [34,5 kB]
Réception de :30 http://archive.ubuntu.com/ubuntu noble/main amd64 lto-disabled-list all 47 [12,4 kB]
Réception de :31 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 dpkg-dev all 1.22.6ubuntu6.1 [1 074 kB]
Réception de :32 http://archive.ubuntu.com/ubuntu noble/main amd64 build-essential amd64 12.10ubuntu1 [4 928 B]
Réception de :33 http://archive.ubuntu.com/ubuntu noble/main amd64 libfakeroot amd64 1.33-1 [32,4 kB]
Réception de :34 http://archive.ubuntu.com/ubuntu noble/main amd64 fakeroot amd64 1.33-1 [67,2 kB]
Réception de :35 http://archive.ubuntu.com/ubuntu noble/main amd64 libalgorithm-diff-perl all 1.201-1 [41,8 kB]
Réception de :36 http://archive.ubuntu.com/ubuntu noble/main amd64 libalgorithm-diff-xs-perl amd64 0.04-8build3 [11,2 kB]
Réception de :37 http://archive.ubuntu.com/ubuntu noble/main amd64 libalgorithm-merge-perl all 0.08-5 [11,4 kB]
Réception de :38 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libexpat1-dev amd64 2.6.1-2ubuntu0.2 [998 kB]
Réception de :39 http://archive.ubuntu.com/ubuntu noble/main amd64 libfile-fcntllock-perl amd64 0.22-4ubuntu5 [30,7 kB]
Réception de :40 http://archive.ubuntu.com/ubuntu noble/main amd64 libjs-underscore all 1.13.4~dfsg+~1.11.4-3 [118 kB]
Réception de :41 http://archive.ubuntu.com/ubuntu noble/main amd64 libjs-sphinxdoc all 7.2.6-6 [149 kB]
Réception de :42 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 zlib1g-dev amd64 1:1.3.dfsg-3.1ubuntu2.1 [894 kB]
Réception de :43 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libpython3.12-dev amd64 3.12.3-1ubuntu0.3 [5 671 kB]
Réception de :44 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libpython3-dev amd64 3.12.3-0ubuntu2 [10,3 kB]
Réception de :45 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 python3.12-dev amd64 3.12.3-1ubuntu0.3 [498 kB]
Réception de :46 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 python3-dev amd64 3.12.3-0ubuntu2 [26,7 kB]
Réception de :47 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 python3-setuptools all 68.1.2-2ubuntu1.1 [396 kB]
Réception de :48 http://archive.ubuntu.com/ubuntu noble/universe amd64 python3-wheel all 0.42.0-2 [53,1 kB]
Réception de :49 http://archive.ubuntu.com/ubuntu noble-updates/universe amd64 python3-pip all 24.0+dfsg-1ubuntu1.1 [1 317 kB]
66,4 Mo réceptionnés en 11s (6 143 ko/s)                                       
Extraction des modèles depuis les paquets : 100%
Sélection du paquet binutils-common:amd64 précédemment désélectionné.
(Lecture de la base de données... 233324 fichiers et répertoires déjà installés.
)
Préparation du dépaquetage de .../00-binutils-common_2.42-4ubuntu2.3_amd64.deb .
..
Dépaquetage de binutils-common:amd64 (2.42-4ubuntu2.3) ...
Sélection du paquet libsframe1:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../01-libsframe1_2.42-4ubuntu2.3_amd64.deb ...
Dépaquetage de libsframe1:amd64 (2.42-4ubuntu2.3) ...
Sélection du paquet libbinutils:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../02-libbinutils_2.42-4ubuntu2.3_amd64.deb ...
Dépaquetage de libbinutils:amd64 (2.42-4ubuntu2.3) ...
Sélection du paquet libctf-nobfd0:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../03-libctf-nobfd0_2.42-4ubuntu2.3_amd64.deb ...
Dépaquetage de libctf-nobfd0:amd64 (2.42-4ubuntu2.3) ...
Sélection du paquet libctf0:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../04-libctf0_2.42-4ubuntu2.3_amd64.deb ...
Dépaquetage de libctf0:amd64 (2.42-4ubuntu2.3) ...
Sélection du paquet libgprofng0:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../05-libgprofng0_2.42-4ubuntu2.3_amd64.deb ...
Dépaquetage de libgprofng0:amd64 (2.42-4ubuntu2.3) ...
Sélection du paquet binutils-x86-64-linux-gnu précédemment désélectionné.
Préparation du dépaquetage de .../06-binutils-x86-64-linux-gnu_2.42-4ubuntu2.3_a
md64.deb ...
Dépaquetage de binutils-x86-64-linux-gnu (2.42-4ubuntu2.3) ...
Sélection du paquet binutils précédemment désélectionné.
Préparation du dépaquetage de .../07-binutils_2.42-4ubuntu2.3_amd64.deb ...
Dépaquetage de binutils (2.42-4ubuntu2.3) ...
Sélection du paquet libcc1-0:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../08-libcc1-0_14.2.0-4ubuntu2~24.04_amd64.deb ..
.
Dépaquetage de libcc1-0:amd64 (14.2.0-4ubuntu2~24.04) ...
Sélection du paquet libitm1:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../09-libitm1_14.2.0-4ubuntu2~24.04_amd64.deb ...
Dépaquetage de libitm1:amd64 (14.2.0-4ubuntu2~24.04) ...
Sélection du paquet libasan8:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../10-libasan8_14.2.0-4ubuntu2~24.04_amd64.deb ..
.
Dépaquetage de libasan8:amd64 (14.2.0-4ubuntu2~24.04) ...
Sélection du paquet liblsan0:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../11-liblsan0_14.2.0-4ubuntu2~24.04_amd64.deb ..
.
Dépaquetage de liblsan0:amd64 (14.2.0-4ubuntu2~24.04) ...
Sélection du paquet libtsan2:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../12-libtsan2_14.2.0-4ubuntu2~24.04_amd64.deb ..
.
Dépaquetage de libtsan2:amd64 (14.2.0-4ubuntu2~24.04) ...
Sélection du paquet libubsan1:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../13-libubsan1_14.2.0-4ubuntu2~24.04_amd64.deb .
..
Dépaquetage de libubsan1:amd64 (14.2.0-4ubuntu2~24.04) ...
Sélection du paquet libhwasan0:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../14-libhwasan0_14.2.0-4ubuntu2~24.04_amd64.deb 
...
Dépaquetage de libhwasan0:amd64 (14.2.0-4ubuntu2~24.04) ...
Sélection du paquet libquadmath0:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../15-libquadmath0_14.2.0-4ubuntu2~24.04_amd64.de
b ...
Dépaquetage de libquadmath0:amd64 (14.2.0-4ubuntu2~24.04) ...
Sélection du paquet libgcc-13-dev:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../16-libgcc-13-dev_13.2.0-23ubuntu4_amd64.deb ..
.
Dépaquetage de libgcc-13-dev:amd64 (13.2.0-23ubuntu4) ...
Sélection du paquet gcc-13-x86-64-linux-gnu précédemment désélectionné.
Préparation du dépaquetage de .../17-gcc-13-x86-64-linux-gnu_13.2.0-23ubuntu4_am
d64.deb ...
Dépaquetage de gcc-13-x86-64-linux-gnu (13.2.0-23ubuntu4) ...
Sélection du paquet gcc-13 précédemment désélectionné.
Préparation du dépaquetage de .../18-gcc-13_13.2.0-23ubuntu4_amd64.deb ...
Dépaquetage de gcc-13 (13.2.0-23ubuntu4) ...
Sélection du paquet gcc-x86-64-linux-gnu précédemment désélectionné.
Préparation du dépaquetage de .../19-gcc-x86-64-linux-gnu_4%3a13.2.0-7ubuntu1_am
d64.deb ...
Dépaquetage de gcc-x86-64-linux-gnu (4:13.2.0-7ubuntu1) ...
Sélection du paquet gcc précédemment désélectionné.
Préparation du dépaquetage de .../20-gcc_4%3a13.2.0-7ubuntu1_amd64.deb ...
Dépaquetage de gcc (4:13.2.0-7ubuntu1) ...
Sélection du paquet libstdc++-13-dev:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../21-libstdc++-13-dev_13.2.0-23ubuntu4_amd64.deb
 ...
Dépaquetage de libstdc++-13-dev:amd64 (13.2.0-23ubuntu4) ...
Sélection du paquet g++-13-x86-64-linux-gnu précédemment désélectionné.
Préparation du dépaquetage de .../22-g++-13-x86-64-linux-gnu_13.2.0-23ubuntu4_am
d64.deb ...
Dépaquetage de g++-13-x86-64-linux-gnu (13.2.0-23ubuntu4) ...
Sélection du paquet g++-13 précédemment désélectionné.
Préparation du dépaquetage de .../23-g++-13_13.2.0-23ubuntu4_amd64.deb ...
Dépaquetage de g++-13 (13.2.0-23ubuntu4) ...
Sélection du paquet g++-x86-64-linux-gnu précédemment désélectionné.
Préparation du dépaquetage de .../24-g++-x86-64-linux-gnu_4%3a13.2.0-7ubuntu1_am
d64.deb ...
Dépaquetage de g++-x86-64-linux-gnu (4:13.2.0-7ubuntu1) ...
Sélection du paquet g++ précédemment désélectionné.
Préparation du dépaquetage de .../25-g++_4%3a13.2.0-7ubuntu1_amd64.deb ...
Dépaquetage de g++ (4:13.2.0-7ubuntu1) ...
Sélection du paquet make précédemment désélectionné.
Préparation du dépaquetage de .../26-make_4.3-4.1build2_amd64.deb ...
Dépaquetage de make (4.3-4.1build2) ...
Sélection du paquet libdpkg-perl précédemment désélectionné.
Préparation du dépaquetage de .../27-libdpkg-perl_1.22.6ubuntu6.1_all.deb ...
Dépaquetage de libdpkg-perl (1.22.6ubuntu6.1) ...
Sélection du paquet bzip2 précédemment désélectionné.
Préparation du dépaquetage de .../28-bzip2_1.0.8-5.1build0.1_amd64.deb ...
Dépaquetage de bzip2 (1.0.8-5.1build0.1) ...
Sélection du paquet lto-disabled-list précédemment désélectionné.
Préparation du dépaquetage de .../29-lto-disabled-list_47_all.deb ...
Dépaquetage de lto-disabled-list (47) ...
Sélection du paquet dpkg-dev précédemment désélectionné.
Préparation du dépaquetage de .../30-dpkg-dev_1.22.6ubuntu6.1_all.deb ...
Dépaquetage de dpkg-dev (1.22.6ubuntu6.1) ...
Sélection du paquet build-essential précédemment désélectionné.
Préparation du dépaquetage de .../31-build-essential_12.10ubuntu1_amd64.deb ...
Dépaquetage de build-essential (12.10ubuntu1) ...
Sélection du paquet libfakeroot:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../32-libfakeroot_1.33-1_amd64.deb ...
Dépaquetage de libfakeroot:amd64 (1.33-1) ...
Sélection du paquet fakeroot précédemment désélectionné.
Préparation du dépaquetage de .../33-fakeroot_1.33-1_amd64.deb ...
Dépaquetage de fakeroot (1.33-1) ...
Sélection du paquet libalgorithm-diff-perl précédemment désélectionné.
Préparation du dépaquetage de .../34-libalgorithm-diff-perl_1.201-1_all.deb ...
Dépaquetage de libalgorithm-diff-perl (1.201-1) ...
Sélection du paquet libalgorithm-diff-xs-perl:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../35-libalgorithm-diff-xs-perl_0.04-8build3_amd6
4.deb ...
Dépaquetage de libalgorithm-diff-xs-perl:amd64 (0.04-8build3) ...
Sélection du paquet libalgorithm-merge-perl précédemment désélectionné.
Préparation du dépaquetage de .../36-libalgorithm-merge-perl_0.08-5_all.deb ...
Dépaquetage de libalgorithm-merge-perl (0.08-5) ...
Sélection du paquet libexpat1-dev:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../37-libexpat1-dev_2.6.1-2ubuntu0.2_amd64.deb ..
.
Dépaquetage de libexpat1-dev:amd64 (2.6.1-2ubuntu0.2) ...
Sélection du paquet libfile-fcntllock-perl précédemment désélectionné.
Préparation du dépaquetage de .../38-libfile-fcntllock-perl_0.22-4ubuntu5_amd64.
deb ...
Dépaquetage de libfile-fcntllock-perl (0.22-4ubuntu5) ...
Sélection du paquet libjs-underscore précédemment désélectionné.
Préparation du dépaquetage de .../39-libjs-underscore_1.13.4~dfsg+~1.11.4-3_all.
deb ...
Dépaquetage de libjs-underscore (1.13.4~dfsg+~1.11.4-3) ...
Sélection du paquet libjs-sphinxdoc précédemment désélectionné.
Préparation du dépaquetage de .../40-libjs-sphinxdoc_7.2.6-6_all.deb ...
Dépaquetage de libjs-sphinxdoc (7.2.6-6) ...
Sélection du paquet zlib1g-dev:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../41-zlib1g-dev_1%3a1.3.dfsg-3.1ubuntu2.1_amd64.
deb ...
Dépaquetage de zlib1g-dev:amd64 (1:1.3.dfsg-3.1ubuntu2.1) ...
Sélection du paquet libpython3.12-dev:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../42-libpython3.12-dev_3.12.3-1ubuntu0.3_amd64.d
eb ...
Dépaquetage de libpython3.12-dev:amd64 (3.12.3-1ubuntu0.3) ...
Sélection du paquet libpython3-dev:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../43-libpython3-dev_3.12.3-0ubuntu2_amd64.deb ..
.
Dépaquetage de libpython3-dev:amd64 (3.12.3-0ubuntu2) ...
Sélection du paquet python3.12-dev précédemment désélectionné.
Préparation du dépaquetage de .../44-python3.12-dev_3.12.3-1ubuntu0.3_amd64.deb 
...
Dépaquetage de python3.12-dev (3.12.3-1ubuntu0.3) ...
Sélection du paquet python3-dev précédemment désélectionné.
Préparation du dépaquetage de .../45-python3-dev_3.12.3-0ubuntu2_amd64.deb ...
Dépaquetage de python3-dev (3.12.3-0ubuntu2) ...
Sélection du paquet python3-setuptools précédemment désélectionné.
Préparation du dépaquetage de .../46-python3-setuptools_68.1.2-2ubuntu1.1_all.de
b ...
Dépaquetage de python3-setuptools (68.1.2-2ubuntu1.1) ...
Sélection du paquet python3-wheel précédemment désélectionné.
Préparation du dépaquetage de .../47-python3-wheel_0.42.0-2_all.deb ...
Dépaquetage de python3-wheel (0.42.0-2) ...
Sélection du paquet python3-pip précédemment désélectionné.
Préparation du dépaquetage de .../48-python3-pip_24.0+dfsg-1ubuntu1.1_all.deb ..
.
Dépaquetage de python3-pip (24.0+dfsg-1ubuntu1.1) ...
Paramétrage de lto-disabled-list (47) ...
Paramétrage de python3-setuptools (68.1.2-2ubuntu1.1) ...
Paramétrage de libfile-fcntllock-perl (0.22-4ubuntu5) ...
Paramétrage de libalgorithm-diff-perl (1.201-1) ...
Paramétrage de binutils-common:amd64 (2.42-4ubuntu2.3) ...
Paramétrage de libctf-nobfd0:amd64 (2.42-4ubuntu2.3) ...
Paramétrage de bzip2 (1.0.8-5.1build0.1) ...
Paramétrage de python3-wheel (0.42.0-2) ...
Paramétrage de libsframe1:amd64 (2.42-4ubuntu2.3) ...
Paramétrage de libfakeroot:amd64 (1.33-1) ...
Paramétrage de fakeroot (1.33-1) ...
update-alternatives: utilisation de « /usr/bin/fakeroot-sysv » pour fournir « /u
sr/bin/fakeroot » (fakeroot) en mode automatique
Paramétrage de libexpat1-dev:amd64 (2.6.1-2ubuntu0.2) ...
Paramétrage de make (4.3-4.1build2) ...
Paramétrage de libquadmath0:amd64 (14.2.0-4ubuntu2~24.04) ...
Paramétrage de python3-pip (24.0+dfsg-1ubuntu1.1) ...
Paramétrage de libdpkg-perl (1.22.6ubuntu6.1) ...
Paramétrage de libubsan1:amd64 (14.2.0-4ubuntu2~24.04) ...
Paramétrage de zlib1g-dev:amd64 (1:1.3.dfsg-3.1ubuntu2.1) ...
Paramétrage de libhwasan0:amd64 (14.2.0-4ubuntu2~24.04) ...
Paramétrage de libasan8:amd64 (14.2.0-4ubuntu2~24.04) ...
Paramétrage de libtsan2:amd64 (14.2.0-4ubuntu2~24.04) ...
Paramétrage de libbinutils:amd64 (2.42-4ubuntu2.3) ...
Paramétrage de libalgorithm-diff-xs-perl:amd64 (0.04-8build3) ...
Paramétrage de libcc1-0:amd64 (14.2.0-4ubuntu2~24.04) ...
Paramétrage de liblsan0:amd64 (14.2.0-4ubuntu2~24.04) ...
Paramétrage de libitm1:amd64 (14.2.0-4ubuntu2~24.04) ...
Paramétrage de libjs-underscore (1.13.4~dfsg+~1.11.4-3) ...
Paramétrage de libalgorithm-merge-perl (0.08-5) ...
Paramétrage de libctf0:amd64 (2.42-4ubuntu2.3) ...
Paramétrage de libpython3.12-dev:amd64 (3.12.3-1ubuntu0.3) ...
Paramétrage de libgprofng0:amd64 (2.42-4ubuntu2.3) ...
Paramétrage de python3.12-dev (3.12.3-1ubuntu0.3) ...
Paramétrage de libjs-sphinxdoc (7.2.6-6) ...
Paramétrage de libgcc-13-dev:amd64 (13.2.0-23ubuntu4) ...
Paramétrage de libstdc++-13-dev:amd64 (13.2.0-23ubuntu4) ...
Paramétrage de binutils-x86-64-linux-gnu (2.42-4ubuntu2.3) ...
Paramétrage de libpython3-dev:amd64 (3.12.3-0ubuntu2) ...
Paramétrage de gcc-13-x86-64-linux-gnu (13.2.0-23ubuntu4) ...
Paramétrage de binutils (2.42-4ubuntu2.3) ...
Paramétrage de dpkg-dev (1.22.6ubuntu6.1) ...
Paramétrage de python3-dev (3.12.3-0ubuntu2) ...
Paramétrage de gcc-13 (13.2.0-23ubuntu4) ...
Paramétrage de g++-13-x86-64-linux-gnu (13.2.0-23ubuntu4) ...
Paramétrage de gcc-x86-64-linux-gnu (4:13.2.0-7ubuntu1) ...
Paramétrage de gcc (4:13.2.0-7ubuntu1) ...
Paramétrage de g++-x86-64-linux-gnu (4:13.2.0-7ubuntu1) ...
Paramétrage de g++-13 (13.2.0-23ubuntu4) ...
Paramétrage de g++ (4:13.2.0-7ubuntu1) ...
update-alternatives: utilisation de « /usr/bin/g++ » pour fournir « /usr/bin/c++
 » (c++) en mode automatique
Paramétrage de build-essential (12.10ubuntu1) ...
Traitement des actions différées (« triggers ») pour man-db (2.12.0-4build2) ...
Traitement des actions différées (« triggers ») pour libc-bin (2.39-0ubuntu8.3) 
...
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ pip  install PyMySQL
error: externally-managed-environment

× This environment is externally managed
╰─> To install Python packages system-wide, try apt install
    python3-xyz, where xyz is the package you are trying to
    install.
    
    If you wish to install a non-Debian-packaged Python package,
    create a virtual environment using python3 -m venv path/to/venv.
    Then use path/to/venv/bin/python and path/to/venv/bin/pip. Make
    sure you have python3-full installed.
    
    If you wish to install a non-Debian packaged Python application,
    it may be easiest to use pipx install xyz, which will manage a
    virtual environment for you. Make sure you have pipx installed.
    
    See /usr/share/doc/python3.12/README.venv for more information.

note: If you believe this is a mistake, please contact your Python installation or OS distribution provider. You can override this, at the risk of breaking your Python installation or OS, by passing --break-system-packages.
hint: See PEP 668 for the detailed specification.
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ sudo apt-get install python3-pymysql
Lecture des listes de paquets... Fait
Construction de l'arbre des dépendances... Fait
Lecture des informations d'état... Fait      
Les paquets suivants ont été installés automatiquement et ne sont plus nécessaires :
  linux-headers-6.8.0-41 linux-headers-6.8.0-41-generic
  linux-image-6.8.0-41-generic linux-modules-6.8.0-41-generic
  linux-modules-extra-6.8.0-41-generic linux-tools-6.8.0-41
  linux-tools-6.8.0-41-generic
Veuillez utiliser « sudo apt autoremove » pour les supprimer.
Paquets suggérés :
  python-pymysql-doc
Les NOUVEAUX paquets suivants seront installés :
  python3-pymysql
0 mis à jour, 1 nouvellement installés, 0 à enlever et 20 non mis à jour.
Il est nécessaire de prendre 38,2 ko dans les archives.
Après cette opération, 169 ko d'espace disque supplémentaires seront utilisés.
Réception de :1 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 python3-pymysql all 1.0.2-2ubuntu1.1 [38,2 kB]
38,2 ko réceptionnés en 0s (90,5 ko/s)     
Sélection du paquet python3-pymysql précédemment désélectionné.
(Lecture de la base de données... 236762 fichiers et répertoires déjà installés.)
Préparation du dépaquetage de .../python3-pymysql_1.0.2-2ubuntu1.1_all.deb ...
Dépaquetage de python3-pymysql (1.0.2-2ubuntu1.1) ...
Paramétrage de python3-pymysql (1.0.2-2ubuntu1.1) ...
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ ./launcher.sh
 * Serving Flask app 'app'
 * Debug mode: on
WARNING: This is a development server. Do not use it in a production deployment. Use a production WSGI server instead.
 * Running on all addresses (0.0.0.0)
 * Running on http://127.0.0.1:5000
 * Running on http://172.21.230.100:5000
Press CTRL+C to quit
 * Restarting with stat
 * Debugger is active!
 * Debugger PIN: 136-052-748
127.0.0.1 - - [13/Dec/2024 14:29:08] "GET / HTTP/1.1" 200 -
127.0.0.1 - - [13/Dec/2024 14:29:08] "GET /static/mes_styles.css HTTP/1.1" 200 -
127.0.0.1 - - [13/Dec/2024 14:29:08] "GET /static/favicon.ico HTTP/1.1" 404 -
127.0.0.1 - - [13/Dec/2024 14:29:13] "GET /departement-usine/show HTTP/1.1" 500 -
Traceback (most recent call last):
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 613, in connect
    sock = socket.create_connection(
           ^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3.12/socket.py", line 828, in create_connection
    for res in getaddrinfo(host, port, 0, SOCK_STREAM):
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3.12/socket.py", line 963, in getaddrinfo
    for res in _socket.getaddrinfo(host, port, family, type, proto, flags):
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
socket.gaierror: [Errno -3] Temporary failure in name resolution

During handling of the above exception, another exception occurred:

Traceback (most recent call last):
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1488, in __call__
    return self.wsgi_app(environ, start_response)
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1466, in wsgi_app
    response = self.handle_exception(e)
               ^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1463, in wsgi_app
    response = self.full_dispatch_request()
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 872, in full_dispatch_request
    rv = self.handle_user_exception(e)
         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 870, in full_dispatch_request
    rv = self.dispatch_request()
         ^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 855, in dispatch_request
    return self.ensure_sync(self.view_functions[rule.endpoint])(**view_args)  # type: ignore[no-any-return]
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/home/kouadah/Documents/recup/cours/millet/C1_Ouadah_Kheira/app.py", line 37, in show_departement
    mycursor = get_db().cursor()
               ^^^^^^^^^^^^^^^^^
  File "/home/kouadah/Documents/recup/cours/millet/C1_Ouadah_Kheira/app.py", line 14, in get_db
    g.db =  pymysql.connect(
            ^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 353, in __init__
    self.connect()
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 664, in connect
    raise exc
pymysql.err.OperationalError: (2003, "Can't connect to MySQL server on 'serveurmysql' ([Errno -3] Temporary failure in name resolution)")
127.0.0.1 - - [13/Dec/2024 14:29:13] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=style.css HTTP/1.1" 200 -
127.0.0.1 - - [13/Dec/2024 14:29:13] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=debugger.js HTTP/1.1" 200 -
127.0.0.1 - - [13/Dec/2024 14:29:13] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=console.png HTTP/1.1" 200 -
127.0.0.1 - - [13/Dec/2024 14:29:13] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=console.png HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:29:16] "GET /employe/show HTTP/1.1" 500 -
Traceback (most recent call last):
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 613, in connect
    sock = socket.create_connection(
           ^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3.12/socket.py", line 828, in create_connection
    for res in getaddrinfo(host, port, 0, SOCK_STREAM):
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3.12/socket.py", line 963, in getaddrinfo
    for res in _socket.getaddrinfo(host, port, family, type, proto, flags):
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
socket.gaierror: [Errno -3] Temporary failure in name resolution

During handling of the above exception, another exception occurred:

Traceback (most recent call last):
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1488, in __call__
    return self.wsgi_app(environ, start_response)
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1466, in wsgi_app
    response = self.handle_exception(e)
               ^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1463, in wsgi_app
    response = self.full_dispatch_request()
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 872, in full_dispatch_request
    rv = self.handle_user_exception(e)
         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 870, in full_dispatch_request
    rv = self.dispatch_request()
         ^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 855, in dispatch_request
    return self.ensure_sync(self.view_functions[rule.endpoint])(**view_args)  # type: ignore[no-any-return]
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/home/kouadah/Documents/recup/cours/millet/C1_Ouadah_Kheira/app.py", line 85, in show_employe
    mycursor = get_db().cursor()
               ^^^^^^^^^^^^^^^^^
  File "/home/kouadah/Documents/recup/cours/millet/C1_Ouadah_Kheira/app.py", line 14, in get_db
    g.db =  pymysql.connect(
            ^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 353, in __init__
    self.connect()
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 664, in connect
    raise exc
pymysql.err.OperationalError: (2003, "Can't connect to MySQL server on 'serveurmysql' ([Errno -3] Temporary failure in name resolution)")
127.0.0.1 - - [13/Dec/2024 14:29:16] "GET /employe/show?__debugger__=yes&cmd=resource&f=style.css HTTP/1.1" 200 -
127.0.0.1 - - [13/Dec/2024 14:29:16] "GET /employe/show?__debugger__=yes&cmd=resource&f=debugger.js HTTP/1.1" 200 -
127.0.0.1 - - [13/Dec/2024 14:29:16] "GET /employe/show?__debugger__=yes&cmd=resource&f=console.png HTTP/1.1" 200 -
127.0.0.1 - - [13/Dec/2024 14:29:16] "GET /employe/show?__debugger__=yes&cmd=resource&f=console.png HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:30:45] "GET /departement-usine/show HTTP/1.1" 500 -
Traceback (most recent call last):
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 613, in connect
    sock = socket.create_connection(
           ^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3.12/socket.py", line 828, in create_connection
    for res in getaddrinfo(host, port, 0, SOCK_STREAM):
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3.12/socket.py", line 963, in getaddrinfo
    for res in _socket.getaddrinfo(host, port, family, type, proto, flags):
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
socket.gaierror: [Errno -3] Temporary failure in name resolution

During handling of the above exception, another exception occurred:

Traceback (most recent call last):
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1488, in __call__
    return self.wsgi_app(environ, start_response)
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1466, in wsgi_app
    response = self.handle_exception(e)
               ^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1463, in wsgi_app
    response = self.full_dispatch_request()
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 872, in full_dispatch_request
    rv = self.handle_user_exception(e)
         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 870, in full_dispatch_request
    rv = self.dispatch_request()
         ^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 855, in dispatch_request
    return self.ensure_sync(self.view_functions[rule.endpoint])(**view_args)  # type: ignore[no-any-return]
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/home/kouadah/Documents/recup/cours/millet/C1_Ouadah_Kheira/app.py", line 37, in show_departement
    mycursor = get_db().cursor()
               ^^^^^^^^^^^^^^^^^
  File "/home/kouadah/Documents/recup/cours/millet/C1_Ouadah_Kheira/app.py", line 14, in get_db
    g.db =  pymysql.connect(
            ^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 353, in __init__
    self.connect()
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 664, in connect
    raise exc
pymysql.err.OperationalError: (2003, "Can't connect to MySQL server on 'serveurmysql' ([Errno -3] Temporary failure in name resolution)")
127.0.0.1 - - [13/Dec/2024 14:30:45] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=style.css HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:30:45] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=debugger.js HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:30:45] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=console.png HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:35:59] "GET /departement-usine/show HTTP/1.1" 500 -
Traceback (most recent call last):
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 613, in connect
    sock = socket.create_connection(
           ^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3.12/socket.py", line 828, in create_connection
    for res in getaddrinfo(host, port, 0, SOCK_STREAM):
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3.12/socket.py", line 963, in getaddrinfo
    for res in _socket.getaddrinfo(host, port, family, type, proto, flags):
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
socket.gaierror: [Errno -3] Temporary failure in name resolution

During handling of the above exception, another exception occurred:

Traceback (most recent call last):
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1488, in __call__
    return self.wsgi_app(environ, start_response)
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1466, in wsgi_app
    response = self.handle_exception(e)
               ^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1463, in wsgi_app
    response = self.full_dispatch_request()
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 872, in full_dispatch_request
    rv = self.handle_user_exception(e)
         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 870, in full_dispatch_request
    rv = self.dispatch_request()
         ^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 855, in dispatch_request
    return self.ensure_sync(self.view_functions[rule.endpoint])(**view_args)  # type: ignore[no-any-return]
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/home/kouadah/Documents/recup/cours/millet/C1_Ouadah_Kheira/app.py", line 37, in show_departement
    def show_departement():
                   ^^^^^^^^
  File "/home/kouadah/Documents/recup/cours/millet/C1_Ouadah_Kheira/app.py", line 14, in get_db
    if 'db' not in g:
                ^^^^^
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 353, in __init__
    self.connect()
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 664, in connect
    raise exc
pymysql.err.OperationalError: (2003, "Can't connect to MySQL server on 'serveurmysql' ([Errno -3] Temporary failure in name resolution)")
127.0.0.1 - - [13/Dec/2024 14:35:59] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=style.css HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:35:59] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=debugger.js HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:35:59] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=console.png HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:35:59] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=console.png HTTP/1.1" 304 -
 * Detected change in '/home/kouadah/Documents/recup/cours/millet/C1_Ouadah_Kheira/app.py', reloading
 * Restarting with stat
 * Debugger is active!
 * Debugger PIN: 136-052-748
127.0.0.1 - - [13/Dec/2024 14:36:00] "GET /departement-usine/show HTTP/1.1" 500 -
Traceback (most recent call last):
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 613, in connect
    sock = socket.create_connection(
           ^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3.12/socket.py", line 828, in create_connection
    for res in getaddrinfo(host, port, 0, SOCK_STREAM):
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3.12/socket.py", line 963, in getaddrinfo
    for res in _socket.getaddrinfo(host, port, family, type, proto, flags):
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
socket.gaierror: [Errno -3] Temporary failure in name resolution

During handling of the above exception, another exception occurred:

Traceback (most recent call last):
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1488, in __call__
    return self.wsgi_app(environ, start_response)
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1466, in wsgi_app
    response = self.handle_exception(e)
               ^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1463, in wsgi_app
    response = self.full_dispatch_request()
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 872, in full_dispatch_request
    rv = self.handle_user_exception(e)
         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 870, in full_dispatch_request
    rv = self.dispatch_request()
         ^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 855, in dispatch_request
    return self.ensure_sync(self.view_functions[rule.endpoint])(**view_args)  # type: ignore[no-any-return]
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/home/kouadah/Documents/recup/cours/millet/C1_Ouadah_Kheira/app.py", line 38, in show_departement
    mycursor = get_db().cursor()
               ^^^^^^^^^^^^^^^^^
  File "/home/kouadah/Documents/recup/cours/millet/C1_Ouadah_Kheira/app.py", line 15, in get_db
    g.db =  pymysql.connect(
            ^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 353, in __init__
    self.connect()
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 664, in connect
    raise exc
pymysql.err.OperationalError: (2003, "Can't connect to MySQL server on 'serveurmysql' ([Errno -3] Temporary failure in name resolution)")
127.0.0.1 - - [13/Dec/2024 14:36:00] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=style.css HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:36:00] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=debugger.js HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:36:00] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=console.png HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:36:00] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=console.png HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:36:01] "GET /departement-usine/show HTTP/1.1" 500 -
Traceback (most recent call last):
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 613, in connect
    sock = socket.create_connection(
           ^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3.12/socket.py", line 828, in create_connection
    for res in getaddrinfo(host, port, 0, SOCK_STREAM):
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3.12/socket.py", line 963, in getaddrinfo
    for res in _socket.getaddrinfo(host, port, family, type, proto, flags):
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
socket.gaierror: [Errno -3] Temporary failure in name resolution

During handling of the above exception, another exception occurred:

Traceback (most recent call last):
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1488, in __call__
    return self.wsgi_app(environ, start_response)
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1466, in wsgi_app
    response = self.handle_exception(e)
               ^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 1463, in wsgi_app
    response = self.full_dispatch_request()
               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 872, in full_dispatch_request
    rv = self.handle_user_exception(e)
         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 870, in full_dispatch_request
    rv = self.dispatch_request()
         ^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/flask/app.py", line 855, in dispatch_request
    return self.ensure_sync(self.view_functions[rule.endpoint])(**view_args)  # type: ignore[no-any-return]
           ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/home/kouadah/Documents/recup/cours/millet/C1_Ouadah_Kheira/app.py", line 38, in show_departement
    mycursor = get_db().cursor()
               ^^^^^^^^^^^^^^^^^
  File "/home/kouadah/Documents/recup/cours/millet/C1_Ouadah_Kheira/app.py", line 15, in get_db
    g.db =  pymysql.connect(
            ^^^^^^^^^^^^^^^^
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 353, in __init__
    self.connect()
  File "/usr/lib/python3/dist-packages/pymysql/connections.py", line 664, in connect
    raise exc
pymysql.err.OperationalError: (2003, "Can't connect to MySQL server on 'serveurmysql' ([Errno -3] Temporary failure in name resolution)")
127.0.0.1 - - [13/Dec/2024 14:36:01] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=style.css HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:36:01] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=debugger.js HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:36:01] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=console.png HTTP/1.1" 304 -
127.0.0.1 - - [13/Dec/2024 14:36:01] "GET /departement-usine/show?__debugger__=yes&cmd=resource&f=console.png HTTP/1.1" 304 -
^Ckouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ mysql --version
La commande « mysql » n'a pas été trouvée, mais peut être installée avec :
sudo apt install mysql-client-core-8.0  # version 8.0.39-0ubuntu0.24.04.2, or
sudo apt install mariadb-client-core    # version 1:10.11.8-0ubuntu0.24.04.1
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ sudo apt install mysql-server
Lecture des listes de paquets... Fait
Construction de l'arbre des dépendances... Fait
Lecture des informations d'état... Fait      
Les paquets suivants ont été installés automatiquement et ne sont plus nécessaires :
  linux-headers-6.8.0-41 linux-headers-6.8.0-41-generic
  linux-image-6.8.0-41-generic linux-modules-6.8.0-41-generic
  linux-modules-extra-6.8.0-41-generic linux-tools-6.8.0-41
  linux-tools-6.8.0-41-generic
Veuillez utiliser « sudo apt autoremove » pour les supprimer.
Les paquets supplémentaires suivants seront installés : 
  libaio1t64 libevent-core-2.1-7t64 libevent-pthreads-2.1-7t64
  libhtml-template-perl libmecab2 libprotobuf-lite32t64 mecab-ipadic
  mecab-ipadic-utf8 mecab-utils mysql-client-8.0 mysql-client-core-8.0
  mysql-common mysql-server-8.0 mysql-server-core-8.0
Paquets suggérés :
  libipc-sharedcache-perl mailx tinyca
Les NOUVEAUX paquets suivants seront installés :
  libaio1t64 libevent-core-2.1-7t64 libevent-pthreads-2.1-7t64
  libhtml-template-perl libmecab2 libprotobuf-lite32t64 mecab-ipadic
  mecab-ipadic-utf8 mecab-utils mysql-client-8.0 mysql-client-core-8.0
  mysql-common mysql-server mysql-server-8.0 mysql-server-core-8.0
0 mis à jour, 15 nouvellement installés, 0 à enlever et 20 non mis à jour.
Il est nécessaire de prendre 29,0 Mo dans les archives.
Après cette opération, 241 Mo d'espace disque supplémentaires seront utilisés.
Souhaitez-vous continuer ? [O/n] 
Réception de :1 http://archive.ubuntu.com/ubuntu noble/main amd64 mysql-common all 5.8+1.1.0build1 [6 746 B]
Réception de :2 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 mysql-client-core-8.0 amd64 8.0.40-0ubuntu0.24.04.1 [2 765 kB]
Réception de :3 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 mysql-client-8.0 amd64 8.0.40-0ubuntu0.24.04.1 [22,5 kB]
Réception de :4 http://archive.ubuntu.com/ubuntu noble/main amd64 libaio1t64 amd64 0.3.113-6build1 [7 180 B]
Réception de :5 http://archive.ubuntu.com/ubuntu noble/main amd64 libevent-core-2.1-7t64 amd64 2.1.12-stable-9ubuntu2 [91,3 kB]
Réception de :6 http://archive.ubuntu.com/ubuntu noble/main amd64 libevent-pthreads-2.1-7t64 amd64 2.1.12-stable-9ubuntu2 [7 982 B]
Réception de :7 http://archive.ubuntu.com/ubuntu noble/main amd64 libmecab2 amd64 0.996-14ubuntu4 [201 kB]
Réception de :8 http://archive.ubuntu.com/ubuntu noble/main amd64 libprotobuf-lite32t64 amd64 3.21.12-8.2build1 [238 kB]
Réception de :9 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 mysql-server-core-8.0 amd64 8.0.40-0ubuntu0.24.04.1 [17,5 MB]
Réception de :10 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 mysql-server-8.0 amd64 8.0.40-0ubuntu0.24.04.1 [1 432 kB]
Réception de :11 http://archive.ubuntu.com/ubuntu noble/main amd64 libhtml-template-perl all 2.97-2 [60,2 kB]
Réception de :12 http://archive.ubuntu.com/ubuntu noble/main amd64 mecab-utils amd64 0.996-14ubuntu4 [4 804 B]
Réception de :13 http://archive.ubuntu.com/ubuntu noble/main amd64 mecab-ipadic all 2.7.0-20070801+main-3 [6 718 kB]
Réception de :14 http://archive.ubuntu.com/ubuntu noble/main amd64 mecab-ipadic-utf8 all 2.7.0-20070801+main-3 [4 384 B]
Réception de :15 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 mysql-server all 8.0.40-0ubuntu0.24.04.1 [9 524 B]
29,0 Mo réceptionnés en 7s (4 426 ko/s)                                        
Préconfiguration des paquets...
Sélection du paquet mysql-common précédemment désélectionné.
(Lecture de la base de données... 236790 fichiers et répertoires déjà installés.
)
Préparation du dépaquetage de .../0-mysql-common_5.8+1.1.0build1_all.deb ...
Dépaquetage de mysql-common (5.8+1.1.0build1) ...
Sélection du paquet mysql-client-core-8.0 précédemment désélectionné.
Préparation du dépaquetage de .../1-mysql-client-core-8.0_8.0.40-0ubuntu0.24.04.
1_amd64.deb ...
Dépaquetage de mysql-client-core-8.0 (8.0.40-0ubuntu0.24.04.1) ...
Sélection du paquet mysql-client-8.0 précédemment désélectionné.
Préparation du dépaquetage de .../2-mysql-client-8.0_8.0.40-0ubuntu0.24.04.1_amd
64.deb ...
Dépaquetage de mysql-client-8.0 (8.0.40-0ubuntu0.24.04.1) ...
Sélection du paquet libaio1t64:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../3-libaio1t64_0.3.113-6build1_amd64.deb ...
Dépaquetage de libaio1t64:amd64 (0.3.113-6build1) ...
Sélection du paquet libevent-core-2.1-7t64:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../4-libevent-core-2.1-7t64_2.1.12-stable-9ubuntu
2_amd64.deb ...
Dépaquetage de libevent-core-2.1-7t64:amd64 (2.1.12-stable-9ubuntu2) ...
Sélection du paquet libevent-pthreads-2.1-7t64:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../5-libevent-pthreads-2.1-7t64_2.1.12-stable-9ub
untu2_amd64.deb ...
Dépaquetage de libevent-pthreads-2.1-7t64:amd64 (2.1.12-stable-9ubuntu2) ...
Sélection du paquet libmecab2:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../6-libmecab2_0.996-14ubuntu4_amd64.deb ...
Dépaquetage de libmecab2:amd64 (0.996-14ubuntu4) ...
Sélection du paquet libprotobuf-lite32t64:amd64 précédemment désélectionné.
Préparation du dépaquetage de .../7-libprotobuf-lite32t64_3.21.12-8.2build1_amd6
4.deb ...
Dépaquetage de libprotobuf-lite32t64:amd64 (3.21.12-8.2build1) ...
Sélection du paquet mysql-server-core-8.0 précédemment désélectionné.
Préparation du dépaquetage de .../8-mysql-server-core-8.0_8.0.40-0ubuntu0.24.04.
1_amd64.deb ...
Dépaquetage de mysql-server-core-8.0 (8.0.40-0ubuntu0.24.04.1) ...
Paramétrage de mysql-common (5.8+1.1.0build1) ...
update-alternatives: utilisation de « /etc/mysql/my.cnf.fallback » pour fournir 
« /etc/mysql/my.cnf » (my.cnf) en mode automatique
Sélection du paquet mysql-server-8.0 précédemment désélectionné.
(Lecture de la base de données... 237020 fichiers et répertoires déjà installés.
)
Préparation du dépaquetage de .../0-mysql-server-8.0_8.0.40-0ubuntu0.24.04.1_amd
64.deb ...
Dépaquetage de mysql-server-8.0 (8.0.40-0ubuntu0.24.04.1) ...
Sélection du paquet libhtml-template-perl précédemment désélectionné.
Préparation du dépaquetage de .../1-libhtml-template-perl_2.97-2_all.deb ...
Dépaquetage de libhtml-template-perl (2.97-2) ...
Sélection du paquet mecab-utils précédemment désélectionné.
Préparation du dépaquetage de .../2-mecab-utils_0.996-14ubuntu4_amd64.deb ...
Dépaquetage de mecab-utils (0.996-14ubuntu4) ...
Sélection du paquet mecab-ipadic précédemment désélectionné.
Préparation du dépaquetage de .../3-mecab-ipadic_2.7.0-20070801+main-3_all.deb .
..
Dépaquetage de mecab-ipadic (2.7.0-20070801+main-3) ...
Sélection du paquet mecab-ipadic-utf8 précédemment désélectionné.
Préparation du dépaquetage de .../4-mecab-ipadic-utf8_2.7.0-20070801+main-3_all.
deb ...
Dépaquetage de mecab-ipadic-utf8 (2.7.0-20070801+main-3) ...
Sélection du paquet mysql-server précédemment désélectionné.
Préparation du dépaquetage de .../5-mysql-server_8.0.40-0ubuntu0.24.04.1_all.deb
 ...
Dépaquetage de mysql-server (8.0.40-0ubuntu0.24.04.1) ...
Paramétrage de libprotobuf-lite32t64:amd64 (3.21.12-8.2build1) ...
Paramétrage de libmecab2:amd64 (0.996-14ubuntu4) ...
Paramétrage de mysql-client-core-8.0 (8.0.40-0ubuntu0.24.04.1) ...
Paramétrage de libhtml-template-perl (2.97-2) ...
Paramétrage de mecab-utils (0.996-14ubuntu4) ...
Paramétrage de libaio1t64:amd64 (0.3.113-6build1) ...
Paramétrage de mysql-client-8.0 (8.0.40-0ubuntu0.24.04.1) ...
Paramétrage de libevent-core-2.1-7t64:amd64 (2.1.12-stable-9ubuntu2) ...
Paramétrage de mecab-ipadic (2.7.0-20070801+main-3) ...
Compiling IPA dictionary for Mecab.  This takes long time...
reading /usr/share/mecab/dic/ipadic/unk.def ... 40
emitting double-array: 100% |###########################################| 
/usr/share/mecab/dic/ipadic/model.def is not found. skipped.
reading /usr/share/mecab/dic/ipadic/Noun.adjv.csv ... 3328
reading /usr/share/mecab/dic/ipadic/Noun.name.csv ... 34202
reading /usr/share/mecab/dic/ipadic/Postp.csv ... 146
reading /usr/share/mecab/dic/ipadic/Others.csv ... 2
reading /usr/share/mecab/dic/ipadic/Adverb.csv ... 3032
reading /usr/share/mecab/dic/ipadic/Noun.demonst.csv ... 120
reading /usr/share/mecab/dic/ipadic/Interjection.csv ... 252
reading /usr/share/mecab/dic/ipadic/Prefix.csv ... 221
reading /usr/share/mecab/dic/ipadic/Noun.csv ... 60477
reading /usr/share/mecab/dic/ipadic/Adj.csv ... 27210
reading /usr/share/mecab/dic/ipadic/Noun.nai.csv ... 42
reading /usr/share/mecab/dic/ipadic/Suffix.csv ... 1393
reading /usr/share/mecab/dic/ipadic/Noun.verbal.csv ... 12146
reading /usr/share/mecab/dic/ipadic/Auxil.csv ... 199
reading /usr/share/mecab/dic/ipadic/Conjunction.csv ... 171
reading /usr/share/mecab/dic/ipadic/Verb.csv ... 130750
reading /usr/share/mecab/dic/ipadic/Noun.org.csv ... 16668
reading /usr/share/mecab/dic/ipadic/Noun.proper.csv ... 27328
reading /usr/share/mecab/dic/ipadic/Adnominal.csv ... 135
reading /usr/share/mecab/dic/ipadic/Postp-col.csv ... 91
reading /usr/share/mecab/dic/ipadic/Noun.place.csv ... 72999
reading /usr/share/mecab/dic/ipadic/Noun.number.csv ... 42
reading /usr/share/mecab/dic/ipadic/Noun.adverbal.csv ... 795
reading /usr/share/mecab/dic/ipadic/Noun.others.csv ... 151
reading /usr/share/mecab/dic/ipadic/Filler.csv ... 19
reading /usr/share/mecab/dic/ipadic/Symbol.csv ... 208
emitting double-array: 100% |###########################################| 
reading /usr/share/mecab/dic/ipadic/matrix.def ... 1316x1316
emitting matrix      : 100% |###########################################| 

done!
update-alternatives: utilisation de « /var/lib/mecab/dic/ipadic » pour fournir «
 /var/lib/mecab/dic/debian » (mecab-dictionary) en mode automatique
Paramétrage de libevent-pthreads-2.1-7t64:amd64 (2.1.12-stable-9ubuntu2) ...
Paramétrage de mysql-server-core-8.0 (8.0.40-0ubuntu0.24.04.1) ...
Paramétrage de mecab-ipadic-utf8 (2.7.0-20070801+main-3) ...
Compiling IPA dictionary for Mecab.  This takes long time...
reading /usr/share/mecab/dic/ipadic/unk.def ... 40
emitting double-array: 100% |###########################################| 
/usr/share/mecab/dic/ipadic/model.def is not found. skipped.
reading /usr/share/mecab/dic/ipadic/Noun.adjv.csv ... 3328
reading /usr/share/mecab/dic/ipadic/Noun.name.csv ... 34202
reading /usr/share/mecab/dic/ipadic/Postp.csv ... 146
reading /usr/share/mecab/dic/ipadic/Others.csv ... 2
reading /usr/share/mecab/dic/ipadic/Adverb.csv ... 3032
reading /usr/share/mecab/dic/ipadic/Noun.demonst.csv ... 120
reading /usr/share/mecab/dic/ipadic/Interjection.csv ... 252
reading /usr/share/mecab/dic/ipadic/Prefix.csv ... 221
reading /usr/share/mecab/dic/ipadic/Noun.csv ... 60477
reading /usr/share/mecab/dic/ipadic/Adj.csv ... 27210
reading /usr/share/mecab/dic/ipadic/Noun.nai.csv ... 42
reading /usr/share/mecab/dic/ipadic/Suffix.csv ... 1393
reading /usr/share/mecab/dic/ipadic/Noun.verbal.csv ... 12146
reading /usr/share/mecab/dic/ipadic/Auxil.csv ... 199
reading /usr/share/mecab/dic/ipadic/Conjunction.csv ... 171
reading /usr/share/mecab/dic/ipadic/Verb.csv ... 130750
reading /usr/share/mecab/dic/ipadic/Noun.org.csv ... 16668
reading /usr/share/mecab/dic/ipadic/Noun.proper.csv ... 27328
reading /usr/share/mecab/dic/ipadic/Adnominal.csv ... 135
reading /usr/share/mecab/dic/ipadic/Postp-col.csv ... 91
reading /usr/share/mecab/dic/ipadic/Noun.place.csv ... 72999
reading /usr/share/mecab/dic/ipadic/Noun.number.csv ... 42
reading /usr/share/mecab/dic/ipadic/Noun.adverbal.csv ... 795
reading /usr/share/mecab/dic/ipadic/Noun.others.csv ... 151
reading /usr/share/mecab/dic/ipadic/Filler.csv ... 19
reading /usr/share/mecab/dic/ipadic/Symbol.csv ... 208
emitting double-array: 100% |###########################################| 
reading /usr/share/mecab/dic/ipadic/matrix.def ... 1316x1316
emitting matrix      : 100% |###########################################| 

done!
update-alternatives: utilisation de « /var/lib/mecab/dic/ipadic-utf8 » pour four
nir « /var/lib/mecab/dic/debian » (mecab-dictionary) en mode automatique
Paramétrage de mysql-server-8.0 (8.0.40-0ubuntu0.24.04.1) ...
update-alternatives: utilisation de « /etc/mysql/mysql.cnf » pour fournir « /etc
/mysql/my.cnf » (my.cnf) en mode automatique
Renaming removed key_buffer and myisam-recover options (if present)
mysqld will log errors to /var/log/mysql/error.log
mysqld is running as pid 10899
Created symlink /etc/systemd/system/multi-user.target.wants/mysql.service → /usr
/lib/systemd/system/mysql.service.
Paramétrage de mysql-server (8.0.40-0ubuntu0.24.04.1) ...
Traitement des actions différées (« triggers ») pour man-db (2.12.0-4build2) ...
Traitement des actions différées (« triggers ») pour libc-bin (2.39-0ubuntu8.3) 
...
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ sudo systemctl enable mysql
Synchronizing state of mysql.service with SysV service script with /usr/lib/systemd/systemd-sysv-install.
Executing: /usr/lib/systemd/systemd-sysv-install enable mysql
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ sudo systemctl status mysql
● mysql.service - MySQL Community Server
     Loaded: loaded (/usr/lib/systemd/system/mysql.service; enabled; preset: en>
     Active: active (running) since Fri 2024-12-13 14:42:09 CET; 1min 5s ago
   Main PID: 11190 (mysqld)
     Status: "Server is operational"
      Tasks: 37 (limit: 18285)
     Memory: 364.0M (peak: 379.5M)
        CPU: 1.819s
     CGroup: /system.slice/mysql.service
             └─11190 /usr/sbin/mysqld

déc. 13 14:42:08 kouadah-HP-Laptop-17-cp0xxx systemd[1]: Starting mysql.service>
déc. 13 14:42:09 kouadah-HP-Laptop-17-cp0xxx systemd[1]: Started mysql.service >
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ CREATE USER 'kouadah'@'localhost' IDENTIFIED WITH mysql_native_password BY '632415';
CREATE : commande introuvable
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ sudo mysql
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.40-0ubuntu0.24.04.1 (Ubuntu)

Copyright (c) 2000, 2024, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> CREATE USER 'kouadah'@'localhost' IDENTIFIED WITH mysql_native_password BY '632415';
Query OK, 0 rows affected (0,01 sec)

mysql> CREATE DATABASE BDD_kouadah
    -> ;
Query OK, 1 row affected (0,00 sec)

mysql> SHOW TABLES;
ERROR 1046 (3D000): No database selected
mysql> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| BDD_kouadah        |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0,00 sec)

mysql> GRANT ALL ON BDD_kouadah.* TO 'kouadah'@'localhost';
Query OK, 0 rows affected (0,01 sec)

mysql> FLUSH PRIVILEGES ;
Query OK, 0 rows affected (0,00 sec)

mysql> exit
Bye
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/recup/cours/millet/C1_Ouadah_Kheira$ mysql -p
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 9
Server version: 8.0.40-0ubuntu0.24.04.1 (Ubuntu)

Copyright (c) 2000, 2024, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| BDD_kouadah        |
| information_schema |
| performance_schema |
+--------------------+
3 rows in set (0,01 sec)

mysql> exit
Bye
```

[plus d'info sur ce lien](https://doc.ubuntu-fr.org/mysql) 