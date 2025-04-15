// Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

function ej2bis() {
	var n1, n2, n3;
	document.write("n1 = ",'<BR/>');
	n1 = prompt();
	document.write("n2 = ",'<BR/>');
	n2 = prompt();
	document.write("n3 = ",'<BR/>');
	n3 = prompt();
	if (n1>n2) {
		if (n1>n3) {
			document.write("n1 es el mayor",'<BR/>');
		}
	} else {
		if (n2>n3) {
			document.write("n2 es el mayor",'<BR/>');
		} else {
			document.write("n3 es el mayor",'<BR/>');
		}
	}
}

