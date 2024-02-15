package lab3_var4_8;

public class Car {
    private int state;

    public Car(int state){
        this.setState(state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return String.format("car: {state: %d/10}", getState());
    }
}
