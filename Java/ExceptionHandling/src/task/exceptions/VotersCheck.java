package task.exceptions;

public class VotersCheck {

	public static void main(String[] args) {
			try {
				int voters_age = 17;
				if(voters_age >= 18)
				{
					System.out.println("Valid to vote");
				}
				else
				{
					throw new VotersNotValidException();
				}
			}
			catch(VotersNotValidException e)
			{
				e.getVoters();
			}

	}

}
