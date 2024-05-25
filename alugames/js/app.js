function alterarStatus(id) {
    let gameClicado = document.getElementById(`game-${id}`);
    let imagem = gameClicado.querySelector(".dashboard__item__img");
    let botao = gameClicado.querySelector(".dashboard__item__buttond");
    let nomeJogo = gameClicado.querySelector(".dashboard__item__name");

    alert(nomeJogo.textContent);

}