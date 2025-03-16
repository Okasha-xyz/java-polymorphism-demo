package withpolymorphism;

public class MainPoly {
    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();
        service.startDelivery(new Truck());
        service.startDelivery(new Bicycle());
    }
}
interface Transport {
    void deliver();
}

class Truck implements Transport {
    public void deliver() {
        System.out.println("Delivering by Truck...");
    }
}

class Bicycle implements Transport {
    public void deliver() {
        System.out.println("Delivering by Bicycle...");
    }
}

class DeliveryService {
    void startDelivery(Transport transport) {
        transport.deliver();
    }
}