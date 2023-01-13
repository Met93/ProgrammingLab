package Day35_Encapsulation;

public class CydeoStudents {
    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String secretCode;
    public static String programmingLanguage;
    static {
        schoolName="Cydeo";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";
    }
    public static void printSchoolName(){
        System.out.println("is school name "+schoolName);

    }
    public static void programmingLanguage(){
        System.out.println("Language is "+programmingLanguage);
    }
    public static void secretCode(){
        System.out.println("is secret code "+secretCode);
    }
    public void  attendClass(){
        System.out.println(name+ " is attending class");
    }
    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }

    /*
    create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()





Task:
	1. Create an Employee Class:
			private variables:
				name, gender, age, salary

			Encapsulate all the private fields

				1. Name can not be empty
				2. gender can not anything other than female or male
				3. age can not be less than 16, and greater than 90
				4. salary can not be zero or negative
     */
}
