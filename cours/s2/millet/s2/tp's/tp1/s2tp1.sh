#!/bin/bash
echo s2tp1_backup_$(date +%Y-%m-%d-%H.%M.%S).sql
mysqldump --host=localhost --user=kouadah --password=632415 --no-tablespaces BDD_kouadah > s2tp1_backup_$(date +%Y-%m-%d-%H.%M.%S).sql
