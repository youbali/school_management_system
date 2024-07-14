public class Students {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //Constructor: to crete a new object by initialize the values
    public Students(int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 3000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }//Constructor

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    public int getFeesPaid(){
        return feesPaid;
    }

    public int getFeesTotal(){
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

     //Not going to alter tne Student's name
     public void setGrade(int grade){
        this.grade = grade;
    }

    public void payFees(int fees){
        feesPaid += fees; // feespaid = feespaid + fess;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public String toString(){
        return "Student*s name: "+name+
            "Total fees paid so far $ "+feesPaid+;
    }

}//class Students
