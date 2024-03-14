package lab5_var2_7;


public class Phone implements Comparable<Phone> {
    private int id;
    private String lastname;
    private String firstname;
    private String surname;
    private String address;
    private int creditCard;
    private double debit;
    private double credit;

    private int cityCallsMinutes;
    private int longDistanceCallsMinutes;

    public Phone(int id, String lastname, String firstname, String surname,
                 String address, int creditCard, double debit, double credit,
                 int cityCallsMinutes, int longDistanceCallsMinutes) {
        try {
            this.setId(id);
            this.setLastname(lastname);
            this.setFirstname(firstname);
            this.setSurname(surname);
            this.setAddress(address);
            this.setCreditCard(creditCard);
            this.setDebit(debit);
            this.setCredit(credit);
            this.setCityCallsMinutes(cityCallsMinutes);
            this.setLongDistanceCallsMinutes(longDistanceCallsMinutes);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return String.format("""
                Phone = {
                \tid: %d; lastname: %s; firstname: %s; surname: %s;
                \taddress: %s; creditCard: %d;
                \tdebit: %.3f; credit: %.3f;
                \tcityCallsMinutes: %d; longDistanceCallsMinutes: %d
                }""",
                id, lastname, firstname, surname, address, creditCard, debit, credit, cityCallsMinutes, longDistanceCallsMinutes);
    }

    @Override
    public int compareTo(Phone p) {
        try {
            int result = this.getLastname().compareTo(p.getLastname());
            if (result != 0) {
                return result;
            } else {
                result = this.getFirstname().compareTo(p.getFirstname());
            }
            if (result != 0) {
                return result;
            } else {
                return this.getSurname().compareTo(p.getSurname());
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be a positive integer.");
        }
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        if (lastname == null || lastname.isEmpty()) {
            throw new IllegalArgumentException("Lastname cannot be null or empty.");
        }
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if (firstname == null || firstname.isEmpty()) {
            throw new IllegalArgumentException("Firstname cannot be null or empty.");
        }
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Surname cannot be null or empty.");
        }
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Address cannot be null or empty.");
        }
        this.address = address;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        if (creditCard <= 0) {
            throw new IllegalArgumentException("Credit card number must be a positive integer.");
        }
        this.creditCard = creditCard;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        if (debit < 0) {
            throw new IllegalArgumentException("Debit amount cannot be negative.");
        }
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        if (credit < 0) {
            throw new IllegalArgumentException("Credit amount cannot be negative.");
        }
        this.credit = credit;
    }

    public int getCityCallsMinutes() {
        return cityCallsMinutes;
    }

    public void setCityCallsMinutes(int cityCallsMinutes) {
        if (cityCallsMinutes < 0) {
            throw new IllegalArgumentException("City calls minutes cannot be negative.");
        }
        this.cityCallsMinutes = cityCallsMinutes;
    }

    public int getLongDistanceCallsMinutes() {
        return longDistanceCallsMinutes;
    }

    public void setLongDistanceCallsMinutes(int longDistanceCallsMinutes) {
        if (longDistanceCallsMinutes < 0) {
            throw new IllegalArgumentException("Long distance calls minutes cannot be negative.");
        }
        this.longDistanceCallsMinutes = longDistanceCallsMinutes;
    }
}
