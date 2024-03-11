package lab4_var1_8;

import java.util.ArrayList;

interface ComputerService {
    void setOperatingSystem(String os);
    void setProcessor(String processor);
    void setRAM(int ram);

    String getOperatingSystem();
    String getProcessor();
    int getRAM();
}

public class ComputerDirectory {
    private final ArrayList<ComputerInfo> computerInfoList = new ArrayList<>();

    public void addComputerInfo(String os, String processor, int ram) {
        ComputerInfo info = new ComputerInfo();
        info.setOperatingSystem(os);
        info.setProcessor(processor);
        info.setRAM(ram);
        computerInfoList.add(info);
    }

    public ArrayList<ComputerInfo> getComputerInfoList() {
        return computerInfoList;
    }

    public static class ComputerInfo implements ComputerService {
        private String operatingSystem;
        private String processor;
        private int ram;

        @Override
        public void setOperatingSystem(String os) {
            this.operatingSystem = os;
        }

        @Override
        public void setProcessor(String processor) {
            this.processor = processor;
        }

        @Override
        public void setRAM(int ram) {
            this.ram = ram;
        }

        public String getOperatingSystem() {
            return operatingSystem;
        }

        public String getProcessor() {
            return processor;
        }

        public int getRAM() {
            return ram;
        }
    }
}