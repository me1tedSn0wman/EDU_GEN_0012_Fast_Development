/*
28_02
*/

public interface ModemVisitor
{
	public void visit(HayesModem modem);
	public void visit(ZoomModem modem);
	public void visit(ErnieModem modem);
}