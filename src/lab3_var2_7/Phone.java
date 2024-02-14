package lab3_var2_7;


public class Phone implements Comparable<Phone> {
    public int id;
    public String lastname;
    public String firstname;
    public String surname;
    public String address;
    public int creditCard;
    public double debit;
    public double credit;

    public int cityCallsMinutes;
    public int longDistanceCallsMinutes;

    public Phone(int id, String lastname, String firstname, String surname,
                 String address, int creditCard, double debit, double credit,
                 int cityCallsMinutes, int longDistanceCallsMinutes) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.surname = surname;
        this.address = address;
        this.creditCard = creditCard;
        this.debit = debit;
        this.credit = credit;
        this.cityCallsMinutes = cityCallsMinutes;
        this.longDistanceCallsMinutes = longDistanceCallsMinutes;
    }

    @Override
    public String toString() {
        return String.format("""
                Phone = {
                \tid: %d; lastname: %s; firstname: %s; surname: %s;
                \taddress: %s; creditCard: %d;
                \tdebit: .3%f; credit: .3%f;
                \tcityCallsMinutes: %d; longDistanceCallsMinutes: %d
                }""",
                id, lastname, firstname, surname, address,creditCard, debit, credit, cityCallsMinutes, longDistanceCallsMinutes);
    }

    @Override
    public int compareTo(Phone p)
    {
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
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public int getCityCallsMinutes() {
        return cityCallsMinutes;
    }

    public void setCityCallsMinutes(int cityCallsMinutes) {
        this.cityCallsMinutes = cityCallsMinutes;
    }

    public int getLongDistanceCallsMinutes() {
        return longDistanceCallsMinutes;
    }

    public void setLongDistanceCallsMinutes(int longDistanceCallsMinutes) {
        this.longDistanceCallsMinutes = longDistanceCallsMinutes;
    }
}
