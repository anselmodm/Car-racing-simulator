public class Carro {
    static String vencedor;
    String nome;
    int velMax ;




    public Carro( String Nome, int VelMax){
        nome = Nome;
        velMax = VelMax;
    }
    //Gets e Sets


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    // Imprimir Carro
    public void ImprimirCarro(){
        System.out.println("-->Nome do carro: "+getNome() + ", Velocidade Máxima: "+ getVelMax() + "Km/h");
    }
    //imprimir vencedor
    public static void ImprimirVencedor(){
        System.out.println("\n*****PARABÉNS*****\n O carro vencedor é o "+Carro.vencedor);
    }

    //metodo correr
    public  void Correr(){

        double d = 500.0;
        double t = (d / velMax);
        int horas = (int)t;
        double resto = t - horas;
        int minutos = (int)(resto*60);
        double restoMinutos = (resto*60) - minutos;
        int segundos = (int)(restoMinutos*60);

        System.out.println("O "+ getNome()+" levou: "+horas+"h: " + minutos + "min: "+ segundos +"s, para percorrer "+d+" KM, a uma velocidade de "+ getVelMax()+"Km/h");



    }

}
