public class Main {
    public static void main(String[] args) {
       Project6 car = new Project6("Toyota", "CorollaCross", 2025, 130000);

       System.out.println(car.getMarca());
       System.out.println(car.getModelo());
       System.out.println(car.getAno());
       System.out.println("Valor de venda: " + car.valorVenda());
    }

}