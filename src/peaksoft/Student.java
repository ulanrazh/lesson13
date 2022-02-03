package peaksoft;

import java.util.InvalidPropertiesFormatException;

public class Student {
    private String name;
    private byte age;
    private String group;
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.matches("[A-Za-z]*")) {
            System.err.println("Invalid student name: [" + name + "]");
        } else {
            this.name = name;
        }
    }

    public byte getAge() {
        return age;
        }

    public void setAge ( byte age) {
            if (age < 0 || age > 100) {
                System.err.println("Invalid student age: [" + age + "]");
            } else {
                this.age = age;
            }
        }

    public String getGroup () {
        return group;
        }

        public void setGroup (String group) {
            if (!group.matches("^[a-zA-Z0-9]+.*$")) {
                System.err.println("Invalid wrong student group: [" + group + "]");
            } else {
                this.group = group;
            }
        }

        public void showInfo() {
            System.out.println("Student info:");
            System.out.println("Student name: " + name);
            System.out.println("Student age: " + age);
            System.out.println("Student group: " + group);
            System.out.println("Student laptop: ");
            laptop.showInfo();

        }
        public void playInfo() {
            System.out.println("Student " + name + " is playing game");
        }
        public void studyInfo() {
            System.out.println("Student " + name + " is studying code");
        }


    }

