
public class order {

	private String type;
	private int quat;
	private int km;
	private float total;
	private int taxa;
	
	public order(String type, int quat, int km) {
		super();
		this.type = type.toUpperCase();
		this.quat = quat;
		this.km = km;
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuat() {
		return quat;
	}

	public void setQuat(int quat) {
		this.quat = quat;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public float getTotal() {

		float result = 0;
		
		String type = getType();
		
		if(type.contains("N")) {
			result = getQuat() * 15 + getTaxa();
			
		}if(type.contains("V")) {
			result = getQuat() * 12 + getTaxa();
			
		}
		return result;
	}

	public int getTaxa() {
		return taxa;
	}

	public void setTaxa(int taxa) {
		if(getKm() <= 3) {
			taxa = 0;
		}else if(getKm() > 3) {
			taxa = (getKm()*2) + 1;
		}
		this.taxa = taxa;
	}

	
	
	

	
	
}
