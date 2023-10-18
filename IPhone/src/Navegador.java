public class Navegador {

    public int aba;
    public int quantidadeAbas;

    public void exibirPagina(int Numero_pagina) {
        System.out.println(aba);
    }

    public void adicionarNovaAba() {
        aba =+1;
        quantidadeAbas+=1;
    }
    public void atualizarPagina(int pagina) {
        this.aba = pagina;
    }

}
