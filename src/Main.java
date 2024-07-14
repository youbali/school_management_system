import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teachers teacher1 = new Teachers(1, "Oubali", 700);
        Teachers teacher2 = new Teachers(2, "Tanour", 600);
        Teachers teacher3 = new Teachers(3, "Badaoui", 750);

        List<Teachers> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        Students student1 = new Students(1, "Khadija", 2);
        Students student2 = new Students(2, "Amina", 1);
        Students student3 = new Students(3, "Fatem", 4);

        List<Students> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        School school1 = new School(teacherList, studentList);
        student1.payFees(523);
        student2.payFees(500);

        Teachers teacher4 = new Teachers(4,"Megan", 445);
        school1.addTeacher(teacher4);
        //teacher1.receiveSalary(teacher1.getSalary());
        //System.out.println("Money earnd is: "+school1.updateTotalMoneySpent(teacher4.getSalary0)+" $");
        System.out.println(teacher4);
        teacher4.receiveSalary(teacher4.getSalary());
        System.out.println(teacher4);

        
        
    }//main
}//class Main
