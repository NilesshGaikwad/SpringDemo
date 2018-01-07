package beans;

public class Test {
	
	private String gender;
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Test(){
		System.out.println("Test Constructor...");
	}
	
	public void disp(String name){
		System.out.println("Hello "+gender+" "+name);
		
	}
	

}
