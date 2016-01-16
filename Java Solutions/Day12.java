import java.util.Scanner;


public class Day12 {
	
	private class Student{
		   protected String firstName;
		   protected String lastName;
		   int phone;
		   Student(String fname,String lname,int p){
		         firstName=fname;
		         lastName=lname;
		         phone=p;
		       
		   }
		   public void display(){// display the details of the student
		       System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nPhone: "+phone); 
		   }

		}
	
	private class Grade extends Student{
		   private int score;
		   
		    public Grade(String firstName, String lastName, int phone, int score){
		        super(firstName, lastName, phone);
		        this.score = score;
		    }
		    
		    public char calculate() {
		        char grade;
		        
		        if (score < 40){
		            grade = 'D';
		        } else if (40 <= score && score < 60){
		            grade = 'B';
		        } else if (60 <= score && score < 75){
		            grade = 'A';
		        } else if (75 <= score && score < 90){
		            grade = 'E';
		        } else {
		            grade = 'O';
		        }
		        
		        return grade;
		    }
		}

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int phone = scanner.nextInt();
        int score = scanner.nextInt();
        Student student = new Grade(firstName,lastName,phone,score);
        student.display();
        Grade grade = (Grade)student;
        System.out.println("Grade: "+grade.calculate());
        scanner.close();
    }
}
