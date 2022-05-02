package abstractfactory;

public class ChairFactory implements AbstractFactory {
    int length;
    String shape;
    int type;
    String opt;
    ChairFactory(int length,String shape, int type,String opt){
        this.length=length;
        this.shape=shape;
        this.type=type;
        this.opt=opt;
    }
    @Override
    public Products createProducts() {
        return new Chair.ChairBuilder(length,shape,type).setOpt(opt).build();
    }
}
