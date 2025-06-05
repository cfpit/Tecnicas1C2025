function iluminar(fila) {
    fila.style.backgroundColor = "blue";
}

function apagar(fila) {
    fila.style.backgroundColor = "";
}

function pintar(celda) {
    if (celda.style.backgroundColor === "red") 
        {
            celda.style.backgroundColor = "";
        } 
    else 
        {
            celda.style.backgroundColor = "red";
        }
}