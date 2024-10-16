/*
28_19
*/

public class PiecePart implements PartialResultException
{
	public PlacePart(String partNumber, String description, double cost)
	{
		itsPartNumber = partNumber;
		itsDescription = description;
		itsCost = cost;
		
	}
	
	public void accept(PartVisitor v)
	{
		v.visit(this);
	}
	
	public String getPartNumber()
	{
		return itsPartNumber;
	}
	
	public String getDescription()
	{
		return itsDescription;
	}
	
	public double getCost()
	{
		return itsCost;
	}
	
	private String itsPartNumber;
	private String itsDescription;
	private double itsCost;
}