public class Day4 {
  
    int age;	
	public Day4(int initial_Age) {
        if (initial_Age < 0){
            System.out.println("This person is not valid, setting age to 0.");
        } else{
            age = initial_Age;
        }
	}

	public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else {
            if (age < 18){
                System.out.println("You are a teenager.");
            } else{
                System.out.println("You are old.");
            }
        }
	}

	public void yearPasses() {
        age++;
	}
}

