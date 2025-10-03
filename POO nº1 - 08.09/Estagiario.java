class Estagiario extends Funcionario {
    double desconto;

    public Estagiario(String nome){
        super(nome);
    }

    @Override
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Desconto: R$" + desconto);
    }
}
