package peaksoft;

public class Laptop {
    private String laptopName;
    private int memory;
    private String color;
    private String cpu;

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        if (!laptopName.matches("^[a-zA-Z0-9]+.*$")) {
            System.err.println("Invalid LAPTOP name: [" + laptopName + "]");
        } else {
            this.laptopName = laptopName;
        }
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        if (memory < 0) {
            System.err.println("Invalid memory set: [" + memory + "]"  + " (!It should be >0 and <1000)!");
        } else {
            this.memory = memory;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!laptopName.matches("[A-Za-z]*")) {
            System.err.println("Invalid LAPTOP name: [" + color + "]");
        } else {
            this.color = color;
        }
    }
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        if (!cpu.matches("^[a-zA-Z0-9]+.*$")) {
            System.err.println("Invalid CPU name: [" + cpu + "]");
        } else {
            this.cpu = cpu;
        }
    }

    public void showInfo() {
        System.out.printf("Laptop info: \n" +
                        "laptop name: %s \n" +
                        "laptop memory: %d gb \n" +
                        "laptop color: %s \n" +
                        "laptop cpu: %s\n",
                laptopName, memory, color, cpu);
    }
    public void turnOn() {
        System.out.println("Turn on " + laptopName);
    }
    public void turnOff() {
        System.out.println("Turn off " + laptopName);
    }
}
