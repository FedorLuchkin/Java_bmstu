package lab4_var1_7;

import java.util.ArrayList;


interface TransportService {
    void setTime(String time);
    void setRoute(String route);
    void setCost(double cost);

    String getTime();
    String getRoute();
    double getCost();
}

public class PublicTransportDirectory {
    private final ArrayList<TransportInfo> transportInfoList = new ArrayList<>();

    public void addTransportInfo(String time, String route, double cost) {
        TransportInfo info = new TransportInfo();
        info.setTime(time);
        info.setRoute(route);
        info.setCost(cost);
        transportInfoList.add(info);
    }

    public ArrayList<TransportInfo> getTransportInfoList() {
        return transportInfoList;
    }

    public static class TransportInfo implements TransportService {
        private String time;
        private String route;
        private double cost;

        @Override
        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public void setRoute(String route) {
            this.route = route;
        }

        @Override
        public void setCost(double cost) {
            this.cost = cost;
        }

        public String getTime() {
            return time;
        }

        public String getRoute() {
            return route;
        }

        public double getCost() {
            return cost;
        }
    }
}
