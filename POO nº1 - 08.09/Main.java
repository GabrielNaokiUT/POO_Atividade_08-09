public class Main {

    public static void main(String[] args){
        Funcionario eng = new Engenheiro("- Roberto: ");
        eng.nome();
        System.out.println();
        eng.sal = 10000;
        eng.cargo = "Engenheiro";
        eng.especialidade = "civil";
        eng.mostrarinfo();
        System.out.println(" ");

        Estagiario estg = new Estagiario("- Gabriel Naoki:");
        estg.nome();
        System.out.println();
        estg.sal = 1544.63;
        estg.desconto = 89.99;
        estg.cargo = "Estagiário";
        estg.mostrarinfo();
        System.out.println(" ");

        Gerente ger = new Gerente("- José:");
        ger.nome();
        System.out.println();
        ger.sal = 10500;
        ger.bonus = 1250.49;
        ger.cargo = "Gerente";
        ger.mostrarinfo();
    }
}
