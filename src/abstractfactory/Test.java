package abstractfactory;

public class Test {

    public static void main(String[] args) {



        AbstractFactory factory=new ConcreteFactory();
        Elma elma=factory.getElma();
        Biber biber=factory.getBiber();
        System.out.println(elma.getType());
        System.out.println(biber.getType());


        factory=new ConcreteFactory2();

        elma=factory.getElma();
        biber=factory.getBiber();
        System.out.println(elma.getType());
        System.out.println(biber.getType());





    }


}
