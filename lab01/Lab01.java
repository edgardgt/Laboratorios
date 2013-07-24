/* lab01.java */
import java.util.*;
import java.io.*;
import laboratorios.lab01.teacher.*;
import laboratorios.lab01.student.*;
public class Lab01{
	
	// implement me
	// read a integer value from the command line, this number represents the amount of students for your classroom. Remember to pass the proper validations to the input.
	// instantiate one Student object for every student on your classroom.
	// instantiate one Teacher object for your classroom.
	// add your students to the teacher's list, then make a call to the teacher's teach() method.
	public static void main(String[] args)throws Exception{
		
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader teclado = new BufferedReader(isr);
		if (args.length < 1){
			System.out.println("Debe ingresar numero de alumnos");
			System.exit(0);
			}
	try{
			// read a integer value from the command line, this number represents the amount of students for your classroom. Remember to pass the proper validations to the input.
			//System.out.print("Amount of students for your classroom: ");
			//int amStudents = Integer.parseInt(teclado.readLine());
			int amStudents = Integer.parseInt(args[0]);
			System.out.println(amStudents);
			
			// instantiate one Student object for every student on your classroom.
			ArrayList<Student> studentList = new ArrayList <Student>();
			for( int i = 1 ; i <= amStudents ; i++ ){
				studentList.add (new Student("Student " + i));            
				}
			
			
			// add your students to the teacher's list, then make a call to the teacher's teach() method.
			Teacher instTeacher = new Teacher("Teacher");		
			
			for( int i = 0 ; i < studentList.size() ; i++ ){
				instTeacher.addStudent (studentList.get(i));
				}
			
			instTeacher.teach();
	}
	catch(NumberFormatException ex){
	   System.out.println("Debe ingresar valores numéricos");
		}
	}
}





