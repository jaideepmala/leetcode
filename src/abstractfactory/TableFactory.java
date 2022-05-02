package abstractfactory;

public class TableFactory implements AbstractFactory {
    int length;
    String shape;
    TableFactory(int length,String shape){
        this.length=length;
        this.shape=shape;
    }
    @Override
    public Products createProducts() {
        return new Table(length,shape);
    }
}
