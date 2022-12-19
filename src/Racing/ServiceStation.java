package Racing;

import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue;

    private void add(Transport transport) {
        transport.offer(transport);
    }

    public void addCar(PassengerCars passengerCars) {
        queue.offer(passengerCars);
    }
        public void addTruck(Trucks trucks) {
            queue.offer(trucks);
    }

    public void doService() {
        if (!queue.isEmpty()) {
            Transport transport = queue.poll();
            transport.diagnostic();
        }
    }

}
