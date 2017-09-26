
public class Entry {
	private String number;
	private String name;
	
	public Entry(String name, String number) {
		this.name = name;
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "name: " + name + ", number: " + number; 
	}

}
