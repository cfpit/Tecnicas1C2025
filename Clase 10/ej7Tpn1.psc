Algoritmo ej7Tpn1
	Escribir "tipo:(a-b)?: "
	Leer ti
	Escribir "tamaño(1-2)?: "
	Leer ta
	Escribir "precio por kilo?: "
	Leer p
	Escribir "kilos del embarque?: "
	Leer k
	Si ti = 'a' Entonces
		Si ta = 1 Entonces
			Escribir "total = ", k * (p + 0.2)
		SiNo
			Escribir "total = ", k * (p + 0.3)
		FinSi
	SiNo
		Si ta = 1 Entonces
			Escribir "total = ",k * (p - 0.3)
		SiNo
			Escribir "total = ",k * (p - 0.5)
		FinSi
	FinSi
FinAlgoritmo
