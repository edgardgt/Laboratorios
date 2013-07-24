package laboratorios.lab01.student;
/* Student.java */
public class Student{
	// implement me
	String nameStudent;
	public Student(String name){
		nameStudent=new String(name);
	}
    
	// implement me
	// prints the student's name plus the text " is learning".
	public void learn(){
		System.out.println(nameStudent + " is learning");
	}
	
	// implement me
	// returns the student's name
	public String toString(){
	    return nameStudent;
	}
}