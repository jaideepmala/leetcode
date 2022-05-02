package abstractfactory;

public class Test {
    public  static  void main(String[] args){
        Chair ch = (Chair) Client.getProducts(new ChairFactory(1,"ch",3,"op"));
        System.out.println(ch.getOpt());
    }
}
