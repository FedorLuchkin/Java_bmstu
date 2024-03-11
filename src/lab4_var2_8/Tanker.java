package lab4_var2_8;

// Интерфейс Корабль
interface Ship {
    void sail();
}

// Класс Грузовой Корабль, реализующий интерфейс Корабль
class CargoShip implements Ship {
    @Override
    public void sail() {
        System.out.println("Грузовой корабль плывет по морю");
    }
}

// Класс Танкер, наследующий от Грузового Корабля
class Tanker extends CargoShip {
    @Override
    public void sail() {
        System.out.println("Танкер перевозит нефтепродукты по морю");
    }
}
