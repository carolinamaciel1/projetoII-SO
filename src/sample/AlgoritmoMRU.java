package sample;

import java.util.LinkedList;

class AlgoritmoMRU extends AlgoritmoDeSubstituicao {

    public AlgoritmoMRU(int numeroDeQuadros) {
        super(numeroDeQuadros);
        // TODO Auto-generated constructor stub
        this.quadros = new LinkedList();

    }

    @Override
    public void inserir(String stringArray) {
        // TODO Auto-generated method stub
        String[] arrayAux = stringArray.split("W");
        String[] arrayAux2 = arrayAux[0].split("R");
        String pageNumber = arrayAux2[0];

        int tmp = quadros.indexOf(pageNumber);
        if (tmp == -1) {
            if (quadros.size() < numeroDeQuadros) {
                quadros.add(pageNumber);
            } else {

                quadros.remove(0);
                quadros.add(pageNumber);
            }
            numeroDeErros++;
        } else {
            quadros.remove(tmp);
            quadros.add(pageNumber);
            numeroDeAcertos++;
        }
    }

}