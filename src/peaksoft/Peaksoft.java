package peaksoft;

public class Peaksoft {
    private String name;
    private String [] rooms;
    private Student[] students;

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Rooms: ");
        for (String room: rooms) {
            System.out.print(room + ",");
        }
        System.out.println("\nStudents: ");
        for (Student student: students) {
            student.showInfo();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getRooms() {
        return rooms;
    }

    public void setRooms(String[] rooms) {
        this.rooms = rooms;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
