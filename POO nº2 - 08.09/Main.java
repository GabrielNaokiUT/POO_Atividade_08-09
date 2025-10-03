public class Main {

    public static void main(String[] args) {
        Moto motorcycle = new Moto("- Moto:");
        motorcycle.marca = "Honda";
        motorcycle.modelo = "Xre";
        motorcycle.ano = 2023;
        motorcycle.Cilindradras = 300;
    
        Carro car = new Carro("- Carro:");
        car.marca = "Honda";
        car.modelo = "Civic";
        car.ano = 2021;
        car.portas = 4;
    
        Caminhao truck = new Caminhao("- Caminhão: ");
        truck.marca = "Volvo";
        truck.modelo = "Fh 540";
        truck.ano = 2020;
        truck.carga = 80;

        motorcycle.tipo();
        System.out.println();
        motorcycle.mostrarinfo();
        motorcycle.acelerar();
        motorcycle.frear();
        System.out.println();

        car.tipo();
        System.out.println();
        car.mostrarinfo();
        car.acelerar();
        car.frear();
        System.out.println();

        truck.tipo();
        System.out.println();
        truck.mostrarinfo();
        truck.acelerar();
        truck.frear();
    }


}




