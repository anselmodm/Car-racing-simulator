import java.util.Scanner;

//@ADM_29JAN2026 Exercicio Módulo 3: POO. Corrida de carros
public class Main {
public static Scanner in = new Scanner(System.in);

    //Gravar
    public static void gravar(){

System.out.println("-----***** Lista de carros disponiveis para corrida *****-----\n1-Aston Martin DB9\n2-Audi TT 3.2 quattro\n3-BMW M3 GTR\n4-Cadillac CTS\n5-Ford Mustang GT");
System.out.println("-----*****  *****-----");
System.out.println("Podes escolher até 3 carros para corrida");
        for (int i = 1; i < 4;i++){
            System.out.println("Introduza o número do "+i+"° carro:");
            int carroC = Integer.parseInt(in.nextLine());;
            switch (carroC){
                case 1:
                    MaquinaCarro maquina1 = new MaquinaCarro();
                    maquina1.CriarCarro("Aston Martin DB9",240);
                    break;
                case 2:
                    MaquinaCarro maquina2 = new MaquinaCarro();
                    maquina2.CriarCarro("Audi TT 3.2 quattro",250);
                    break;
                case 3:
                    MaquinaCarro maquina3 = new MaquinaCarro();
                    maquina3.CriarCarro("BMW M3 GTR",280);
                    break;
                case 4:
                    MaquinaCarro maquina4 = new MaquinaCarro();
                    maquina4.CriarCarro("Cadillac CTS",200);
                    break;
                case 5:
                    MaquinaCarro maquina5 = new MaquinaCarro();
                    maquina5.CriarCarro("Ford Mustang GT",300);
                    break;

            }
        }

    }


    //Imprimir Carro
    public static void imprimir(){
        MaquinaCarro.ImprimirCarros();
        MaquinaCarro.imprimirVencedor();

    }

    public static void main(String[] args) {

        System.out.println("---***Menu Principal:***---:\n Opção A: Selecionar carros e iniciar a corrida \n B: Sair");
        String opçao = "";
        while (!opçao.equalsIgnoreCase("A")||!opçao.equalsIgnoreCase("B")) {
            opçao = in.nextLine();
            if (opçao.equalsIgnoreCase("A")) {

                gravar();
                imprimir();
                System.out.println("---***Menu Principal:***---:\n Opção A: Selecionar carros e iniciar a corrida \n B: Sair");

            } else if  (opçao.equalsIgnoreCase("B")) {


                System.out.println("Programa terminado pelo utilizador");
                System.exit(0);
            } else  {
                System.out.println("Opção invalidade. a resposta deve ser A ou B");

            }
        }

    }

}