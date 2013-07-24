package laboratorios.lab01.teacher;
import java.util.*;
import laboratorios.lab01.student.*;

/* Teacher.java */
public class Teacher{
	// implement me
	String nameTeacher;
	ArrayList<Student> studentList = new ArrayList <Student>();
	
	public Teacher(String name){
		nameTeacher = new String (name);
	}
	
	// implement me
	// adds a student to the theacher (maybe using a list?)
	public void addStudent(Student s){
		studentList.add (s);
	}
	
	// implement me
	// prints the teacher's name plus the string " is teaching ".
	// it should also make a call to the learn() method for all theacher's students.
	public void teach(){
		System.out.println(nameTeacher + " is teaching ");
		
		for( int i = 0 ; i < studentList.size() ; i++ ){
            //System.out.println(studentList.get(i));
            studentList.get(i).learn();
            }
 
	}
	
	// implement me
	// returns the teacher's name
	public String toString(){
		return nameTeacher;
	}


	
}