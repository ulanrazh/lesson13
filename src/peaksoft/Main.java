package peaksoft;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Laptop laptop = new Laptop();
        laptop.setLaptopName("Lenovo");
        laptop.setMemory(-512);
        laptop.setColor("Black");
        laptop.setCpu("Ryzen 5 5500U"); //Пробелы принимает

        laptop.turnOn();
        laptop.showInfo();
        laptop.turnOff();

        //Space between objects
        System.out.println("");

        Student student = new Student();
        student.setName("Ulan");
        student.setGroup("Java 5");
        student.setAge((byte) 105);
        student.setLaptop(laptop);

        student.showInfo();
//        student.playInfo();
//        student.studyInfo();

        Peaksoft peaksoft = new Peaksoft();
        peaksoft.setName("Peaksoft");
        String[] rooms = {"Facebook", "Apple", "SpaceX",
                "Google", "Starlink", "Staff room", "Cafeteria"};
        peaksoft.setRooms(rooms);
        Student[] students = {student};
        peaksoft.setStudents(students);
        peaksoft.showInfo();



    }
}
