public class Magpie2
{
	
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	public String getResponse(String statement)
	{
		String response = "";

		if (statement.length() == 0)
		{
			return "Say something damnit.";
		}

		if (findKeyword(statement, "no", 0) >= 0)
		{
			response = "Why so negative?";
		}

		else if (findKeyword(statement, "mother", 0) >= 0
				|| findKeyword(statement, "father", 0) >= 0
				|| findKeyword(statement, "sister", 0) >= 0
				|| findKeyword(statement, "brother", 0) >= 0)
		{
			response = "Tell me more about your family.";
		}

		else if (findKeyword(statement, "cat", 0) >= 0
				|| findKeyword(statement, "dog", 0) >= 0
				|| findKeyword(statement, "fish", 0) >= 0
				|| findKeyword(statement, "turtle", 0) >= 0)
		{
			response = "Tell me more about your pet.";		
		}

		else if (findKeyword(statement, "Robinette", 0) >= 0)
		{
			response = "He sounds like a pretty dank teacher.";
		}

		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
		  response = transformIWantToStatement(statement);
		}


		else
		{
			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0
				&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{
				response = getRandomResponse();
			}
		}

		return response;
	}

	private String transformIWantToStatement(String statement)
	{

		statement = statement.trim();
		String lastChar = statement.substring(statement.length() -1);

		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() -1);
		}

		int psn = findKeyword(statement, "I want to");
		String restOfStatement = statement.substring(psn + 9);
		return "What would it mean to" + restOfStatement + "?";

	}

	private String transformYouMeStatement(String statement)
	{

		statement = statement.trim();
		String lastChar = statement.substring(statement.length() -1);
		
		if(lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() -1);
		}
		
		int psnOfYou = findKeyword(statement, "you");
		int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe);
		return "What makes you think that I" + restOfStatement + "you?";

	}

	private int findKeyword(String statement, String goal, int startPos)
	{

		String phrase = statement.trim().toLowerCase();
		int psn = phrase.indexOf(goal.toLowerCase(), startPos);

		while (psn>=0)
		{
			String bef = " ";
			String af = " ";

			if (psn>0)
			{
				bef = phrase.substring(psn - 1, psn);
			}

			if(psn + goal.length() < phrase.length())
			{
				af = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
			}

			if(((bef.compareTo("a") < 0) || (bef.compareTo("z") > 0)) && ((af.compareTo("a") < 0) || (af.compareTo("z") > 0)))
			{
				return psn;
			}
			
			else
			{
				psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
			}
		}

		return -1;

	}

	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
