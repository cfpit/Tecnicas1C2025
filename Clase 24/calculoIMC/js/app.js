document.addEventListener('DOMContentLoaded', function() {
    const calculateButton = document.getElementById('calculate-btn');
    const resultDiv = document.getElementById('result');

    calculateButton.addEventListener('click', function() {
        const peso = parseFloat(document.getElementById('peso').value);
        const altura = parseFloat(document.getElementById('altura').value);

        if (isNaN(peso) || isNaN(altura) || peso <= 0 || altura <= 0) {
            resultDiv.innerHTML = '<div class="alert alert-danger">Por favor, ingrese un peso y una altura válidos.</div>';
            return;
        }

        const imc = peso / (altura * altura);
        let categoria = '';

        if (imc < 18.5) categoria = 'Bajo peso';
        else if (imc < 25) categoria = 'Peso normal';
        else if (imc < 30) categoria = 'Sobrepeso';
        else categoria = 'Obesidad';

        resultDiv.innerHTML = `<div class="alert alert-success">Su IMC es <strong>${imc.toFixed(2)}</strong> (${categoria})</div>`;
    });
});