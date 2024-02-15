package lab3_var4_7;

import java.util.Objects;


public class User {

    private int number;

    private double balance;
    private double debtForCalls;
    private Service[] services;
    private String state;
    public User(int number, double balance, double debtForCalls, Service[] services) {
        this.number = number;
        this.balance = balance;
        this.debtForCalls = debtForCalls;
        this.services = services;
        this.state = "On";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDebtForCalls() {
        return debtForCalls;
    }

    public void setDebtForCalls(double debtForCalls) {
        this.debtForCalls = debtForCalls;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] newServices) {
        this.services = newServices;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(
                String.format("""
                        User: {
                        \tnumber: %d;
                        \tbalance: %.3f;
                        \tdebtForCalls: %.3f;
                        \tstate: %s;
                        """,
                        getNumber(), getBalance(), getDebtForCalls(), getState()
                )
        );
        for (Service service : getServices()) {
            result.append("\t").append(service.toString()).append("\n");
        }
        result.append("}");
        return result.toString();
    }

    public void checkBalance() {
        double debt = debtForCalls;
        for (Service service : this.services) {
            debt = debt + service.getCost();
        }
        if (debt > getBalance()) {
            setState("Off");
        } else {
            setBalance(getBalance() - debt);
            setState("On");
        }
    }

    public void serviceOff(String name) {
        int counter = 0;
        for (Service service : this.services) {
            if (!Objects.equals(service.getName(), name)) counter++;
        }
        Service[] newServices = new Service[counter];

        counter = 0;
        for (Service service : this.services) {
            if (!Objects.equals(service.getName(), name)) {
                newServices[counter] = service;
                counter++;
            }
        }
        setServices(newServices);
    }
}
