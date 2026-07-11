import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public  class MaquinaCarro {
    public static int velMax ;
    static ArrayList<Carro> carros = new ArrayList<>();

    public MaquinaCarro(){

    }

    public static void CriarCarro(String nome, int velMax){
        Carro novoCarro = new Carro(nome, velMax);
        carros.add(novoCarro);
    }

    //Imprimir carros
    public static void ImprimirCarros(){
            for (Carro carro : carros){
                carro.ImprimirCarro();
                carro.Correr();

           }

    }
    //imprimir vencedor
    public static  void imprimirVencedor(){
       Carro maisVeloz = Collections.max(
              carros,
                Comparator.comparing( c -> c.velMax)
        );
        Carro.vencedor = maisVeloz.getNome();
        Carro.ImprimirVencedor();
    }
}
