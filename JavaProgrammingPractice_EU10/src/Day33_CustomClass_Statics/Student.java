package Day33_CustomClass_Statics;

public class Student {
    public String name;
    public char gender,grade;
    public int age,studentID;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }

    public Student(String name, char grade, int studentID) {
        this(name,studentID);
        this.grade=grade;

    }

    public Student(String name, char gender, int age, int studentID) {
        this(name,gender,studentID);
        this.age = age;

    }

    public Student(String name, char gender, char grade, int age, int studentID) {
        this(name,gender,age,studentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", studentID=" + studentID +
                '}';
    }
    /*
    1. Create a class called Student:
				Attributes:
					name, gender, age, studentID, grade

				Add a constructor that allows user to create object by setting the name of student

				Add a constructor that allows user to create object by setting the name and gender of the student

				Add a constructor that allows user to create object by setting the name and studentID of the student

				Add a constructor that allows user to create object by setting the name, studentID and grade of the student

				Add a constructor that allows user to create object by setting the name, gender and age of the student

				Add a constructor that allows user to create object by setting the name, gende, age and studentID of the student

				Add a constructor that allows user to create object by setting the name, gende, age, studentID and grade of the student

				Actions:
					toString()
					study()

     */
}
