package abstractfactory;

public class SofaFactory implements AbstractFactory {
    int length;
    String shape;
    SofaFactory(int length,String shape){
        this.length=length;
        this.shape=shape;
    }
    @Override
    public Products createProducts() {
        return new Sofa(length,shape);
    }
}
