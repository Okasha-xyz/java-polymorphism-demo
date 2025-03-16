package withoutpolymorphism;

public class MainNonPoly {
    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();
        service.startDelivery("truck");
        service.startDelivery("bicycle");
    }
}

class Truck {
    void deliverByTruck() {
        System.out.println("Delivering by Truck...");
    }
}

class Bicycle {
    void deliverByBicycle() {
        System.out.println("Delivering by Bicycle...");
    }
}

class DeliveryService {
    void startDelivery(String transportType) {
        if (transportType.equals("truck")) {
            new Truck().deliverByTruck();
        } else if (transportType.equals("bicycle")) {
            new Bicycle().deliverByBicycle();
        }
    }
}