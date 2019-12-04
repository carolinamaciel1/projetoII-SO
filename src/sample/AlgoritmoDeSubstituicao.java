package sample;

import java.util.LinkedList;

abstract class AlgoritmoDeSubstituicao {
    protected int numeroDeAcertos;
    protected int numeroDeErros;
    protected int numeroDeQuadros;
    LinkedList quadros;

    public AlgoritmoDeSubstituicao(int numeroDeQuadros) {
        if (numeroDeQuadros < 0)
            throw new IllegalArgumentException();
        this.numeroDeQuadros = numeroDeQuadros;
        numeroDeAcertos = 0;
    }


    public int getPageFoundCount() {
        return numeroDeAcertos;
    }
    public int getPageFaultCount() {
        return numeroDeErros;
    }

    public abstract void inserir(String pageNumber);

    public void imprimirQuadros() {
        System.out.print("Quadros:  ");
        for (int i = 0; i < quadros.size(); i++) {
            System.out.print(quadros.get(i) + " ");
        }
        System.out.println();
    }
}
