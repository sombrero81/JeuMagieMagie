function refresh(){
    
    $('#listeCartes').load("../ajax_cartes_joueur_act");
}

$(document).ready(function(){
    
    setInterval( refresh, 1000 );
});