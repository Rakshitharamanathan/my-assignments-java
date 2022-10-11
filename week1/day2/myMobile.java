package week1.day2;

public class myMobile {
	public void sendMessage() {
		System.out.println("SentMessage");
	}
	public void shareDocument() {
		System.out.println("ShareDocument");
	}
	public void call() {
		System.out.println("call");
	}
	public static void main(String[]args) {
		myMobile mobile=new myMobile();
		mobile.sendMessage();
		mobile.shareDocument();
		mobile.call();
	}

}