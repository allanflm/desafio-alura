function comprar() {
    let tipo = document.getElementById("tipo-ingresso");
    let qtd = parseInt(document.getElementById("qtd").value);

    if (tipo.value == "pista") {
        comprarPista(qtd);
    } else if (tipo.value = "superior") {
        comprarSuperio(qtd);
    } else {
        comprarInferio(qtd);
    }

}

function comprarPista(qtd) {
    let qtdPista = parseInt(document.getElementById("qtd-pista").textContent);
    if (qtd > qtdPista) {
        alert("Quantidade indisponivel para a pista")
    } else {
        qtdPista = qtdPista - qtd;
        document.getElementById("qtd-pista").textContent = qtdPista;
        alert("Compra realizada com sucesso!");
    }
}
function comprarInferio(qtd) {
    let qtdInferio = parseInt(document.getElementById("qtd-inferior").textContent);
    if (qtd > qtdInferio) {
        alert("Quantidade indisponivel para a pista")
    } else {
        qtdInferio = qtdInferio - qtd;
        document.getElementById("qtd-inferior").textContent = qtdInferio;
        alert("Compra realizada com sucesso!");
    }
}
function comprarSuperio(qtd) {
    let qtdSuperio = parseInt(document.getElementById("qtd-superior").textContent);
    if (qtd > qtdSuperio) {
        alert("Quantidade indisponivel para a pista")
    } else {
        qtdSuperio = qtdSuperio - qtd;
        document.getElementById("qtd-superior").textContent = qtdSuperio;
        alert("Compra realizada com sucesso!");
    }
}