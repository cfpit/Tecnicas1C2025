Algoritmo ej_6
	Escribir "cantidad de comensales: "
	Leer p
	Si p <= 200 Entonces
		Escribir "precio = ", p * 95, " $"
	SiNo
		Si p > 200 Y p <= 300 Entonces
			Escribir "precio = ", p * 85, " $"
		SiNo
			Escribir "precio = ", p * 75, " $"
		FinSi
	FinSi
FinAlgoritmo
