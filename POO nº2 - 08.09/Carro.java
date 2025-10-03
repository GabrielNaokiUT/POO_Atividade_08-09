class Carro extends Veiculo {
    int portas;
    
    public Carro(String tipo){
        super(tipo);
    }
    
    @Override
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Nº de portas: " + portas);
    }
    public void acelerar(){
        System.out.println("O carro está acelerando!");
    }
    public void frear(){
        System.out.println("O carro está freando!");
    }
}
