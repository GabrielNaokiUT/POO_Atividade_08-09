public class Funcionario {
    String nome;
    String cargo;
    double sal;
    String especialidade;

    public Funcionario(String nome){
        this.nome = nome;
    }
    public void nome(){
        System.out.println(nome);
    }
    public void mostrarinfo(){
        System.out.println("Cargo: " + cargo + ", Salário: R$ " + sal );
    }
}
