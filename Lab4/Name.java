
public class Name {
	
	String firstN;
	String middleN;
	String lastN;
	
	public Name(String fName, String mName, String lName)
	{
		firstN = fName;
		middleN = mName;
		lastN = lName;
	}
	
	public String getFirst()
	{
			return firstN;
	}

	public String getMiddle()
	{
			return middleN;
	}
	
	public String getLast()
	{
			return lastN;
	}
	
	public String firstMiddleLast()
	{
		return firstN + " " + middleN + " " + lastN;
	}
	
	public String lastFirstMiddle()
	{
		return lastN + ", " + firstN + " " + middleN;
	}
	
	public boolean equals(Name otherName)
	{
		if(firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast()))
			return true;
		return false;
	}
	
	public String initials()
	{
		String fn = firstN.substring(0, 1);
		String md = middleN.substring(0, 1);
		String ln = lastN.substring(0, 1);
		
		return fn + md + ln;
	}
	
	public int length()
	{
		int length;
		length = firstMiddleLast().length();
		return length;
	}
	
}
