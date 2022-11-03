package org.college;
import org.department.*;
public class Student extends Department {
	public void studentname() {
		System.out.println("rakshi");
	}
	public void Studentdept() {
		System.out.println("ECE");
	}
	public void Studentid() {
		System.out.println("FS12456");
	}
	public static void main(String[] args) {
		Student std=new Student();
		std.collegename();
		std.collegecode();
		std.collegerank();
		std.deptname();
		std.studentname();
		std.Studentdept();
		std.Studentid();
	}	
}

