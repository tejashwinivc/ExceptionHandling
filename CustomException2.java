import java.util.Scanner;

class UnderAge extends Exception {

}

class OverAge extends Exception
{
	
}

class ElectionCommission {
	int age;

	void acceptInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age:");
		age = s.nextInt();
	}

	void checkVote() throws Exception {
		if (age >= 18 && age<=60) {
			System.out.println("Good, Go and caste your vote");
		}
		else if(age < 18) {
			UnderAge uE=new UnderAge();
			throw uE;
		}
		else {
			OverAge oE=new OverAge();
			throw oE;
		}
	}

}

class Government {
	void election() {
		ElectionCommission e = new ElectionCommission();
		try {
			e.acceptInput();
			e.checkVote();
		} catch (UnderAge uE) {
			System.out.println("You are too young to vote");
			
		}
		catch (OverAge oE)
		{
			System.out.println("You are to old to vote");
		}
		catch (Exception f)
		{
			System.out.println("***EXCEPTION***");
		}
	}
}

public class CustomException2 {

	public static void main(String[] args) {

		Government g = new Government();
		g.election();
	}

}
