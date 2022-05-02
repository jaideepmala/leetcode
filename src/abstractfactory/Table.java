package abstractfactory;

public class Table extends Products {
    int length;
    String shape;
    Table(int length,String shape){
        this.length=length;
        this.shape=shape;
    }
    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public String getShape() {
        return this.shape;
    }
}
