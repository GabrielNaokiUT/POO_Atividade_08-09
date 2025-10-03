public class Veiculo {

    String tipo;
    String marca;
    String modelo;
    int ano;

    public Veiculo(String tipo){
        this.tipo = tipo;
    }
    public void tipo(){
        System.out.println(tipo);
    }
    public void acelerar(){
        System.out.println("O veículo está acelerando!");
    }
    public void frear(){
        System.out.println("O veículo está freando!");
    }
    public void mostrarinfo(){
        System.out.println( "Marca: " + marca + ", modelo: " + modelo + ", ano: " + ano + ".");
    }
}
