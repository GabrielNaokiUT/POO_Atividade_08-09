class Caminhao extends Veiculo{
    int carga;

    public Caminhao(String tipo){
        super(tipo);
    }
    
    @Override
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Capacidade máxima de carga: " + carga + " toneladas");
    }
    public void acelerar(){
        System.out.println("O caminhão está acelerando!");
    }
    public void frear(){
        System.out.println("O caminhão está freando!");
    }
} 
