function preprocess() {
    window.addEventListener('hashchange', function () {
        showPage(window.location.hash);
    });
}

/**
 * Fonction utilitaire pour la navigation static
 * @param page
 */
function showPage(page){
    hideAll();
    showDiv(page);
}

/**
 * Hide All component ui inside body as div is hash not coresponding
 */
function hideAll(){
    divContent = document.getElementById("body").children;
    for(let i=0; i<divContent.length; i++){
        divContent.item(i).hidden=true;
    }
}

/**
 * Accessing the static content via hash url
 * @param div
 */
function showDiv(div){
    document.getElementById(div.replace("#","")).hidden=false;
}