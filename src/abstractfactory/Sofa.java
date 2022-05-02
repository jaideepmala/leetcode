package abstractfactory;

public class Sofa extends Products{
    int length;
    String shape;
    Sofa(int length,String shape){
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
