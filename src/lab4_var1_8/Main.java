package lab4_var1_8;

public class Main {
    public static void main(String[] args) {
        ComputerDirectory computerDirectory = new ComputerDirectory();

        // Добавляем информацию о компьютерах
        computerDirectory.addComputerInfo("Windows 10", "Intel Core i7", 16);
        computerDirectory.addComputerInfo("macOS Catalina", "Apple M1", 8);

        // Выводим информацию о компьютерах
        for (ComputerDirectory.ComputerInfo computerInfo : computerDirectory.getComputerInfoList()) {
            System.out.println("Operating System: " + computerInfo.getOperatingSystem());
            System.out.println("Processor: " + computerInfo.getProcessor());
            System.out.println("RAM: " + computerInfo.getRAM() + "GB");
            System.out.println();
        }
    }
}