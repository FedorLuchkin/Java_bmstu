package lab3_var4_8;

public class Driver {

    private String state;
    private Voyage voyage;
    private Car car;

    public Driver(Voyage voyage, Car car) {
        this.setState("On");
        this.setVoyage(voyage);
        this.setCar(car);
    }

    public int[] getVoyageResults() {
        int[] result = new int[3];
        result[0] = getVoyage().getState();
        result[1] = getCar().getState();
        result[2] = makeRepairRequest(result[1]);
        return result;
    }

    private int makeRepairRequest(int carState) {
        return (carState < 4) ? 1 : 0;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Voyage getVoyage() {
        return voyage;
    }

    public void setVoyage(Voyage voyage) {
        this.voyage = voyage;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return String.format(
                "driver: {\n\t%s; \n\t%s;\n\tstate: '%s'\n}",
                getVoyage().toString(), getCar().toString(), getState()
        );
    }
}
