public class Teachers {
    private int id;
    private String name;
    private float salary;
    private float salaryEarned;

    //Constructor
    public Teachers(int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }//constructor

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public float getSalary(){
        return salary;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }

    public void receiveSalary(float salary){
        salaryEarned += salary;
    //    School.updateTotalMoneySpent(salary);
    }

    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far $"
                + salaryEarned;
    }

}//Class Teachers
