
// console.log("Inicio del bucle while");
// document.write("Inicio del bucle while<br>");

// var cont = 1;

// while (cont <= 5) {
//     // console.log("Contador: " + cont);
//     document.write("Contador: " + cont + "<br>");
//     cont++;
// }

// console.log("Fin del bucle while");
// document.write("Fin del bucle while");

// document.write("Inicio del bucle do while<br>");
// document.write("Salida por condicion de corte<br>");
// var cont = 0;

// do 
// {
//     cont++;
//     document.write("Contador: " + cont + "<br>");
        
// } while (cont < 10);//condicion de corte

// document.write("Fin del bucle do while");


// document.write("variante salida por break<br>");
// var cont = 0;

// do 
// {
//     if(cont == 10) {
//         break;// sale del 1er bucle que encuentre
//     }
//     cont++;
//     document.write("Contador: " + cont + "<br>");
        
// } while (true);

// document.write("Fin del bucle do while");


// document.write("variante salida por flag o bandera<br>");
// var cont = 0;
// var flag = true;

// do 
// {
//     if(cont == 15) {
//         flag = false;// sale del 1er bucle que encuentre
//     }
//     cont++;
//     document.write("Contador: " + cont + "<br>");
        
// } while (false);

// document.write("Fin del bucle do while");


// document.write("Inicio del bucle for<br>");

// for (var cont = 1; cont <= 10; cont++) {  
//     if (cont != 2 && cont != 5  && cont != 9) {
//         document.write("Contador: " + cont + "<br>");     
//     }
// }

// document.write("Fin del bucle for<br>");


document.write("Inicio del bucle for<br>");

for (var cont = 1; cont <= 10; cont++) {  
    if (cont == 2 || cont == 5  || cont == 9) {
        continue;// salta a la siguiente iteracion
    }
    document.write("Contador: " + cont + "<br>");     
}

document.write("Fin del bucle for<br>");
