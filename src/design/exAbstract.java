package design;

public  abstract class exAbstract {
    static String storeName = "Macys";
    public final String businessName="Just Corp";
    public final String wish= "For all wellwisher";
    public String address= "8511 34th Avenue";
    public void storeOpen(){
        System.out.println(storeName +"  Will open soon");
        System.out.println(address +"  is my add current address");

    }
    public abstract void hospitalDescription();
    public void hospitalEstablished(){
        System.out.println("this hospital establidhed in 1545");
    }

    public abstract void setPerformance(int i);

    public abstract void setDepartment(String medicine);

    public void  calculateYearlySalary() {

    }

   // public abstract calculateEmployeeMonthlyPension();
}
