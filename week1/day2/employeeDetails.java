package week1.day2;

public class employeeDetails {
	public void employeename(String name) {
		String Name = name;
		System.out.println(Name);

	}
	public void employeeid(int a) {
		int Id=a;
	    System.out.println(Id);
	}
	public void employeeaddress(String address) {
		System.out.println(address);
	}
	public void employeemobilenumber(long b) {
    System.out.println(b);

}public static void main(String[]args) {
	employeeDetails details= new employeeDetails();
	   System.out.print("employee Name-"); details.employeename("Rakshitha");
	   System.out.print("employee Id -");  details.employeename("20067");
	   System.out.print("employee Address -");   details.employeename("kumbakonam");
	   System.out.print("employee Mobile Number -");  details.employeename("9574236912");

}

}

