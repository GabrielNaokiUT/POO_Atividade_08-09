public class Main {

    public static void main(String[] args){
        Animal dog = new Cachorro("Cachorro: Rex");
        dog.nome();          
        dog.fazerSom();
        System.out.println();
        Animal cat = new Gato("Gato: Tom");
        cat.nome();
        cat.fazerSom();
        System.out.println();
        Animal parrot = new Papagaio("Papagaio: Loro José");
        parrot.nome();
        parrot.fazerSom();
    }
}

