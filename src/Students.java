public class Students {
    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feestotal;

    //Constructor: to crete a new object by initialize the values
    public Students(int id, String name, int grade){
        this.feespaid = 0;
        this.feestotal = 3000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }//Constructor

    //Not going to alter tne Student's name
    public void setGrade(int going){
        this.grade = going;
    }

    public void updateFessPaid(int fees){
        feespaid += fees; // feespaid = feespaid + fess;
    }


}//class Students
