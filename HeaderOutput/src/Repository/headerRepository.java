package Repository;

import java.util.Scanner;

import Model.*;

public class headerRepository {
	
	private header ipHeader;
	private header ouputHeader;
	
	private boolean spellUnit;
	
	public headerRepository(){
		this.ipHeader = new header();
		this.ouputHeader = new header();
		
		this.spellUnit = false;
	}
	
	
	public void readOutHeaderString(header out) {
		System.out.println(out.getVersion());
		System.out.println(out.getIhl());
		System.out.println(out.getTos());
		System.out.println(out.getTot());
		System.out.println(out.getId());
		System.out.println(out.getFlags());
		System.out.println(out.getFragO());
		System.out.println(out.getTtl());
		System.out.println(out.getProtocol());
		System.out.println(out.getCheckSum());
		System.out.println(out.getSourcIP());
		System.out.println(out.getDestinationIP());
	}
	
	
	/*
	 * Parst übergebenen String in einen Interger Wert
	 * Rechnet diesen in binaer um und gibt Ihn als String zurück
	 */
	public String dezToBin(String dez){
		int calc = Integer.parseInt(dez);
		String bin = new String();
		
		while(calc != 0){
			bin = bin + (calc % 2);//Ausgabe der Restwerte
			calc=calc/2;//Ergebnis wird durch 2 dividiert
			
		}
		 String umgekehrt = new String();

		    for ( int j = bin.length()-1; j >= 0; j-- )
		      umgekehrt += bin.charAt(j);
		    
		return umgekehrt;
		
	}
	
	public header trimHeader(header in) {
		
		while(in.getVersion().length()<4) {
			in.setVersion("0" + in.getVersion());
		}
		while(in.getIhl().length()<4) {
			in.setIhl("0" + in.getIhl());
		}
		while(in.getFlags().length()<4) {
			in.setFlags("0" + in.getFlags());
		}
		
		
		while(in.getTos().length()<8) {
			in.setTos("0" + in.getTos());
		}
		while(in.getProtocol().length()<8) {
			in.setProtocol("0" + in.getProtocol());
		}
		while(in.getTtl().length()<8) {
			in.setTtl("0" + in.getTtl());	
		}
		
		
		while(in.getTot().length()<16) {
			in.setTot("0" + in.getTot());
		}
		while(in.getId().length()<16) {
			in.setId("0" + in.getId());
		}
		while(in.getCheckSum().length()<16) {
			in.setCheckSum("0" + in.getCheckSum());
		}
				
		return in;
	}
	
	
	/*
	 * Konvertiert alle Header Felder von Dezimal in Binarer um
	 */
	public header convertFromDezToBin(header in){
		//4 Bit 
		this.ouputHeader.setVersion(dezToBin(this.ipHeader.getVersion()));
		this.ouputHeader.setIhl(dezToBin(this.ipHeader.getIhl()));
		this.ouputHeader.setFlags(dezToBin(this.ipHeader.getFlags()));
		
		//8 Bit
		this.ouputHeader.setTos(dezToBin(this.ipHeader.getTos()));
		this.ouputHeader.setProtocol(dezToBin(this.ipHeader.getProtocol()));
		//16 Bit
		this.ouputHeader.setTot(dezToBin(this.ipHeader.getTot()));
		this.ouputHeader.setId(dezToBin(this.ipHeader.getId()));
		this.ouputHeader.setCheckSum(dezToBin(this.ipHeader.getCheckSum()));
		
		//12 Bit
		this.ouputHeader.setFragO(dezToBin(this.ipHeader.getFragO()));
		this.ouputHeader.setTtl(dezToBin(this.ipHeader.getTtl()));
		
		
		
		//Es Fehlen hier noch die source & destination IP Adressen da di noch umgeformt werden müssen
		this.ouputHeader.setSourcIP(this.ipHeader.getSourcIP());
		this.ouputHeader.setDestinationIP(this.ipHeader.getDestinationIP());
		
		
		
		readOutHeaderString(trimHeader(this.ouputHeader));
		return this.ouputHeader;
	}
	
	
	public boolean spellChecker(String test){
		
		boolean dezIp;
		//Prüfen ob Eingabe eine IP-Adresse in dezimaler schreibweise ist
		String patter = "(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})";
		if(test.matches(patter)==true){
			dezIp = true;
		}
		else{
			dezIp = false;
		}
		
		//Prüfen ob eingegebener String eine in Dezimaler Schreibweise ist
		   boolean ziffer;
		   int b = 0;
		   try {
		      b = Integer.parseInt(test);
		      ziffer = true;
		   } catch(NumberFormatException e)
		   {
		      //System.out.println(e.getMessage());
		      ziffer = false;
		      
		   }
		   return true;
	}
	
	
	
	public header headerInput(){
		//register Scanner for consol input
		Scanner sc = new Scanner(System.in);
		

		
		System.out.print("Eingabe Version: ");
		this.ipHeader.setVersion(sc.nextLine());
		
		System.out.print("IHL (Internet Header Length): ");
		this.ipHeader.setIhl(sc.nextLine());
		
		System.out.print("ToS (Type of Service): ");
		this.ipHeader.setTos(sc.nextLine());
		
		System.out.print("Paketlänge: ");
		this.ipHeader.setTot(sc.nextLine());
		
		System.out.print("Identifikation: ");
		this.ipHeader.setId(sc.nextLine());
		
		System.out.print("Flags: ");
		this.ipHeader.setFlags(sc.nextLine());
		
		System.out.print("Fragment-Offset: ");
		this.ipHeader.setFragO(sc.nextLine());
		
		System.out.print("TTL (Time to Live: )");
		this.ipHeader.setTtl(sc.nextLine());
		
		System.out.print("Protokol: ");
		this.ipHeader.setProtocol(sc.nextLine());
		
		System.out.print("Header Checksum: ");
		this.ipHeader.setCheckSum(sc.nextLine());
		spellChecker(this.ipHeader.getCheckSum());
		
		System.out.print("Quell-IP Adresse: ");
		this.ipHeader.setSourcIP(sc.nextLine());
		spellChecker(this.ipHeader.getSourcIP());
		
		System.out.print("Ziel-IP ADresse: ");
		this.ipHeader.setDestinationIP(sc.nextLine());
		sc.close();
		
		return this.ipHeader;
	}
	
	
}
