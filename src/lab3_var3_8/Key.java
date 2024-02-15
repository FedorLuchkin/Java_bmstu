package lab3_var3_8;

import java.util.Objects;


public class Key {
    private String state;

    public Key(String state){
        this.setState(state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key key)) return false;
        return Objects.equals(key.getState(), getState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getState());
    }

    @Override
    public String toString() {
        return String.format("key: {state: '%s'}", getState());
    }

}
