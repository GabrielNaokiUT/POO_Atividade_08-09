class Moto extends Veiculo{
    int Cilindradras;

    public Moto(String tipo){
        super(tipo);
    }
    
    @Override
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Cilindradras: " + Cilindradras + "cc");
    }
    public void acelerar(){
        System.out.println("A moto está acelerando!");
    }
    public void frear(){
        System.out.println("A moto está freando!");
    }
}
