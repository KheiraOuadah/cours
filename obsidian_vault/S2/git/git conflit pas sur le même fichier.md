kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/sae/but1s2_sae345$ git add .
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/sae/but1s2_sae345$ git commit -m "af
fichage commande coté admin " 
[main 5c0e91d] affichage commande coté admin
 3 files changed, 23 insertions(+), 17 deletions(-)
 delete mode 100644 "docx/.~lock.cahier_des_charges_KQb\303\251.odt#"
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/sae/but1s2_sae345$ git push
To https://github.com/Quentin0312/but1s2_sae345.git
 ! [rejected]        main -> main (fetch first)
error: impossible de pousser des références vers 'https://github.com/Quentin0312/but1s2_sae345.git'
astuce: Updates were rejected because the remote contains work that you do not
astuce: have locally. This is usually caused by another repository pushing to
astuce: the same ref. If you want to integrate the remote changes, use
astuce: 'git pull' before pushing again.
astuce: See the 'Note about fast-forwards' in 'git push --help' for details.
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/sae/but1s2_sae345$ git pull
remote: Enumerating objects: 7, done.
remote: Counting objects: 100% (7/7), done.
remote: Compressing objects: 100% (1/1), done.
remote: Total 4 (delta 3), reused 4 (delta 3), pack-reused 0 (from 0)
Dépaquetage des objets: 100% (4/4), 460 octets | 230.00 Kio/s, fait.
Depuis https://github.com/Quentin0312/but1s2_sae345
   27bbe61..961a79f  main       -> origin/main
astuce: Vous avez des branches divergentes et vous devez spécifier comment
astuce: les réconcilier. Vous pouvez le faire en lançant une des
astuce: commandes suivantes avant votre prochain tirage :
astuce: 
astuce:   git config pull.rebase false  # fusion
astuce:   git config pull.rebase true   # rebasage
astuce:   git config pull.ff only       # avance rapide seulement
astuce: 
astuce: Vous pouvez remplacer "git config" par "git config --global" pour que
astuce: ce soit l'option par défaut pour tous les dépôts. Vous pouvez aussi
astuce: passer --rebase, --no-rebase ou --ff-only sur la ligne de commande pour
astuce: remplacer à l'invocation la valeur par défaut configurée.
fatal: Besoin de spécifier comment réconcilier des branches divergentes.
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/sae/but1s2_sae345$ git status
Sur la branche main
Votre branche et 'origin/main' ont divergé,
et ont 1 et 1 commits différents chacune respectivement.
  (use "git pull" if you want to integrate the remote branch with yours)

rien à valider, la copie de travail est propre
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/sae/but1s2_sae345$ git rebase origin/main
Rebasage et mise à jour de refs/heads/main avec succès.
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/sae/but1s2_sae345$ git status
Sur la branche main
Votre branche est en avance sur 'origin/main' de 1 commit.
  (utilisez "git push" pour publier vos commits locaux)

rien à valider, la copie de travail est propre
kouadah@kouadah-HP-Laptop-17-cp0xxx:~/Documents/sae/but1s2_sae345$ git push
Énumération des objets: 17, fait.
Décompte des objets: 100% (17/17), fait.
Compression par delta en utilisant jusqu'à 12 fils d'exécution
Compression des objets: 100% (8/8), fait.
Écriture des objets: 100% (9/9), 1.07 Kio | 1.07 Mio/s, fait.
Total 9 (delta 6), réutilisés 0 (delta 0), réutilisés du pack 0
remote: Resolving deltas: 100% (6/6), completed with 6 local objects.
To https://github.com/Quentin0312/but1s2_sae345.git
   961a79f..a13a4e6  main -> main