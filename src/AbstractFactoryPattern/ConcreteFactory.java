package AbstractFactoryPattern;

public class ConcreteFactory implements AbstractFactory {

    @Override
    public Elma getElma() {
        return new KirmiziElma();
    }

    @Override
    public Biber getBiber() {
        return new DolmaBiber();
    }
}
