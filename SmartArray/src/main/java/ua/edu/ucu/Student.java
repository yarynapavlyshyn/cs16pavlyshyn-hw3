package ua.edu.ucu;

class Student {

    private double GPA;
    private int year;
    private String name;
    private String surname;

    public Student(String name, String surname, double GPA, int year) {
        this.GPA = GPA;
        this.year = year;
        this.name = name;
        this.surname = surname;
    }
    public double getGPA() {
        return GPA;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (Student.class != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (getName().equals(other.getName()) == false)
            return false;
        if (getSurname().equals(other.getSurname()) == false)
            return false;
        if (getYear() == (other.getYear()) == false)
            return false;
        if (getGPA() == (other.getGPA()) == false)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Student{name=" + name + ", surname=" + surname + ", " + "GPA=" + GPA + ", year=" + year + '}';
    }
}
