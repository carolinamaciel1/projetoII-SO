package sample;

import java.util.Scanner;

public class Main{

    public static void main(String[] agrs){
        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a qtd de frames");
        String qtdeFramesInicial = scanner.nextLine();
        System.out.println("Qtde Frames inicial: " + qtdeFramesInicial);
        String qtdeFramesFinal = scanner.nextLine();
        System.out.println("Qtde Frames final: " + qtdeFramesFinal);

        System.out.println("Prossiga com a entrada");

        String referencia = scanner.nextLine();
        String[] stringReferencia = referencia.split("-");

        int qtdeFramesf = Integer.parseInt(qtdeFramesFinal); ;
        for(int qtdFramesi = Integer.parseInt(qtdeFramesInicial); qtdFramesi<=qtdeFramesf; qtdFramesi++) {
            AlgoritmoDeSubstituicao lru = new AlgoritmoMRU(qtdFramesi);
            System.out.println("Entradas: ");
            for (int i = 0; i < (stringReferencia.length); i++) {
                System.out.println(stringReferencia[i]);
                lru.inserir(stringReferencia[i]);
            }
            System.out.println("Page Faults: " + lru.getPageFaultCount());
            System.out.println("Page Acertos: " + lru.getPageFoundCount());
        }
    }



}
