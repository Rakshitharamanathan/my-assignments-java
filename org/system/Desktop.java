package org.system;

public class Desktop extends computer  {
	public void desktopsize() {
		System.out.println("15.6inch");
	}
	public static void main(String[] args) {
		Desktop des=new Desktop();
		des.computermodel();
		des.desktopsize();
	} 
}

