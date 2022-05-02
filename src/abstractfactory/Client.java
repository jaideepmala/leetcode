package abstractfactory;

public class Client {
    public static Products getProducts(AbstractFactory abstractFactory){
        return abstractFactory.createProducts();
    }
}
