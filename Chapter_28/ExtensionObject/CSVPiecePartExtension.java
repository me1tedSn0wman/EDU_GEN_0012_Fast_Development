/*
28_39
*/

public class CSVPiecePartExtension implements CSVPartExtension
{
	private PiecePart itsPiecePart = null;
	public CSVPiecePartExtension(PiecePart part)
	{
		itsPiecePart = part;
	}
	
	public String getCSV()
	{
		StringBuffer b = new StringBuffer("PiecePart,");
		b.append(itsPiecePart.getPartNumber());
		b.append(",");
		b.append(itsPiecePart.getDescription());
		b.append(",");
		b.append(itsPiecePart.getCost());
		return b.toString();
		
	}
	
}