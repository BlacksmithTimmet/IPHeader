import Repository.*;


public class main {
	
	public static headerRepository headerRep = new headerRepository();

	public static void main(String[] args) {
		//System.out.println("Fuuu");
		headerRep.convertFromDezToBin(headerRep.headerInput());

	}

}
