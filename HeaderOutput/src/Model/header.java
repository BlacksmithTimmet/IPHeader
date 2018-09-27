package Model;

public class header {

	private String version; //4Bit
	private String ihl; //4Bit
	private String tos; //8Bit
	private String tot; //16Bit
	private String id; //16Bit
	private String flags; //4BBit
	private String fragO; //12Bit
	private String ttl; //8Bit
	private String protocol; //8Bit
	private String checkSum; //16Bit
	private String sourcIP; //32Bit
	private String destinationIP; //32Bit
	
	
	
	
	
	/*
	 * Konstruktoren für die Klasse header
	 */
	public header(String version, String ihl, String tos, String tot,
			String id, String flags, String fragO, String ttl, String protocol,
			String checkSum, String sourcIP, String destinationIP) {
		super();
		this.version = version;
		this.ihl = ihl;
		this.tos = tos;
		this.tot = tot;
		this.id = id;
		this.flags = flags;
		this.fragO = fragO;
		this.ttl = ttl;
		this.protocol = protocol;
		this.checkSum = checkSum;
		this.sourcIP = sourcIP;
		this.destinationIP = destinationIP;
	}
	
	
	public header() {
		this.version = null;
		this.ihl = null;
		this.tos = null;
		this.tot = null;
		this.id = null;
		this.flags = null;
		this.fragO = null;
		this.ttl = null;
		this.protocol = null;
		this.checkSum = null;
		this.sourcIP = null;
		this.destinationIP = null;
	}
	/*
	 * Setter und Getter
	 */
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getIhl() {
		return ihl;
	}
	public void setIhl(String ihl) {
		this.ihl = ihl;
	}
	public String getTos() {
		return tos;
	}
	public void setTos(String tos) {
		this.tos = tos;
	}
	public String getTot() {
		return tot;
	}
	public void setTot(String tot) {
		this.tot = tot;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFlags() {
		return flags;
	}
	public void setFlags(String flags) {
		this.flags = flags;
	}
	public String getFragO() {
		return fragO;
	}
	public void setFragO(String fragO) {
		this.fragO = fragO;
	}
	public String getTtl() {
		return ttl;
	}
	public void setTtl(String ttl) {
		this.ttl = ttl;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getCheckSum() {
		return checkSum;
	}
	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}
	public String getSourcIP() {
		return sourcIP;
	}
	public void setSourcIP(String sourcIP) {
		this.sourcIP = sourcIP;
	}
	public String getDestinationIP() {
		return destinationIP;
	}
	public void setDestinationIP(String destinationIP) {
		this.destinationIP = destinationIP;
	}
	
	
}
