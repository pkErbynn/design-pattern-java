package after;

public class Main {
    // passing service class instance to client is what's missing in Dependency Inversion
    // thus, Dependency Injection improves Dependency Inversion
    public static void main(String[] args) {
        IService service = new Service();   // injector...programming to an interface
        Client client = new Client(service);    // Constructor injection
        client.greetOut();
        client.setService(service);     // Setter injection
    }
}

class Service implements IService{
    public void greet(){
        System.out.println("Greet");
    }
}

interface IService {
    public void greet();
}

class Client {
    private IService service;

    public Client(IService service){
        this.service = service;
    }

    public void greetOut(){
        service.greet();
    }

    public void setService(IService service){
        this.service = service;
    }
}

