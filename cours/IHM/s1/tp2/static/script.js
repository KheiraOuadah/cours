function changeId(data) {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            var result = JSON.parse(xmlhttp.responseText) // récupère la liste
            if (result){

            }

        }
    }
    xmlhttp.open("GET", "/api/client?codeClient=" + data, true);
    xmlhttp.send();
}

function getClientDetails(codeClient){
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function (){
        console.log(xmlhttp.readyState);

    }
}