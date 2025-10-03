class Gerente extends Funcionario {
    double bonus;

    public Gerente(String nome){
        super(nome);
    }

    @Override
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Bonificação: R$" + bonus);
    }
}
