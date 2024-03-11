package lab4_var2_7;

// Интерфейс Врач
interface Doctor {
    void treatPatient();
}

// Класс Хирург, реализующий интерфейс Врач
class Surgeon implements Doctor {
    @Override
    public void treatPatient() {
        System.out.println("Хирург проводит операцию");
    }
}

// Класс Нейрохирург, наследующий от Хирурга
class Neurosurgeon extends Surgeon {
    @Override
    public void treatPatient() {
        System.out.println("Нейрохирург проводит нейрохирургическую операцию");
    }
}
