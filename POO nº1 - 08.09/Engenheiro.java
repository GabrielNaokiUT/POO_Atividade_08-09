class Engenheiro extends Funcionario {

    public Engenheiro(String nome){
        super(nome);
    }

    @Override
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Area: " + especialidade);
    }

    
}
