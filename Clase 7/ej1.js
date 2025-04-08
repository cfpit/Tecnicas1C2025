// Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

function ej1() {
	var n1, n2;
	document.write("Ingrese n1: ",'<BR/>');
	n1 = prompt();
	document.write("Ingrese n2: ",'<BR/>');
	n2 = prompt();
	if (n1>n2) {
		document.write("n1 es mayor",'<BR/>');
	} else {
		if (n2>n1) {
			document.write("n2 es mayor",'<BR/>');
		} else {
			document.write("son iguales",'<BR/>');
		}
	}
}

