package Dayy3;
class Department{
    String deptName;
    Department(String deptName){
        this.deptName=deptName;
    }
}
class College{
    String collName;
    Department department;
    College(String collName, Department department){
        this.collName=collName;
        this.department=department;
    }
}
public class AggregationDemo {
    public static void main(String[] args) {
        Department d=new Department("csd");
        College c=new College("biet",d);
    }
}
