package exercises.technology;

public class Program {

    public static void main(String[] args) {
        Computer spike = new Computer(8,4,true);
        System.out.println(spike.getRam());
        System.out.println(spike.getNextId());

        Laptop wonky = new Laptop(4,6,false,78);
        System.out.println(wonky.getNextId());

    }
}
