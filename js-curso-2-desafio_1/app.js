let titulo = document.querySelector('h1');
titulo.innerHTML = "Hora do Desafio";

function consoleMSG() {
    console.log("O botão foi clicado");
}

function alertaMSG() {
    alert("Eu amo JS");
}

function promptMSG() {
    let cidade = prompt("Digite o nome de uma cidade.");
    alert(`Estive em ${cidade} e lembrei de você`)
}

function soma() {
    var numero1 = parseInt(prompt("Digite um numero: "));
    var numero2 = parseInt(prompt("Digite outro numero: "));

    let soma = numero1 + numero2;

    alert(`A soma entre ${numero1} + ${numero2} = ${soma}`)
}