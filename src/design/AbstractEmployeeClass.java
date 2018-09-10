package design;

public abstract class AbstractEmployeeClass implements Employee{
    public final String CEO = "Abu Hanip";
    static String address = "31-10, 37th avenue, Long Island Road, NY";

    public void describeCompany() {
        System.out.println("In the year 2015 " + CEO + " founded the company located at " + address + ".");
    }
    public abstract void describeCompany(String Mission);
}
