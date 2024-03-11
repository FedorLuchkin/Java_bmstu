package lab4_var1_7;

public class Main {
    public static void main(String[] args) {
        PublicTransportDirectory transportDirectory = new PublicTransportDirectory();

        // Добавляем информацию о транспорте
        transportDirectory.addTransportInfo("10:00", "Маршрут 1", 2.50);
        transportDirectory.addTransportInfo("11:30", "Маршрут 2", 3.00);

        // Выводим информацию о транспорте
        for (PublicTransportDirectory.TransportInfo info : transportDirectory.getTransportInfoList()) {
            System.out.println("Time: " + info.getTime());
            System.out.println("Route: " + info.getRoute());
            System.out.println("Cost: " + info.getCost());
            System.out.println();
        }
    }
}
