package lab4_var2_7;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Surgeon();
        Doctor doctor2 = new Neurosurgeon();

        doctor1.treatPatient();
        doctor2.treatPatient();
    }
}