package week1.day2;

public class myCar {
	public void applyBreak() {
		System.out.println("Apply brake ");
	}
	public void applyGear() {
		System.out.println("Apply Gear");

	}
    public void switchOnAc() {
    	System.out.println("On Ac");
    }
    public void applyAcclerate() {
    	System.out.println("Apply Accelerate");
    }
     public static void main(String[]args) {
    	myCar Car=new myCar();
    	 Car.applyBreak();
    	 Car.applyGear();
    	 Car.switchOnAc();
    	 Car.applyAcclerate();

     }


}
