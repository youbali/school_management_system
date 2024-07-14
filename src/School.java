import java.util.List;

public class School {
    private List<Students> students;
    private List<Teachers> teachers;
    private static int totalMoneyEarned;
    private static int totalMoneyspent;

    public School(List<Teachers> teachers, List<Students> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneyspent = 0;
    }// Constructor
    
    //@return the list of teachers int the school.
    public List<Teachers> getTeachers() {
        return teachers;
    }

    //@param teacher the teacher to be added.
    public void addTeacher(Teachers teacher) {
        teachers.add(teacher);
    }

    //@return the list of students in the school.
    public List<Students> getStudents() {
        return students;
    }

    //@param student the student to be added.
    public void addStudent(Students student) {
        students.add(student);
    }

    
    //@return the total money earned by the school.
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    //@param MoneyEarned money that is supposed to be  added
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    //@return the total money spent by the school.    
    public int getTotalMoneySpent() {
        return totalMoneyspent;
    }

    //@param moneySpent the money spent by school.
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
     }



}//class Scholl
