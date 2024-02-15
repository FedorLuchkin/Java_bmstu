package lab3_var4_8;

public class Voyage {
    private int state;

    public Voyage(int state){
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
        return String.format("voyage: {state: %d/10}", getState());
    }
}
