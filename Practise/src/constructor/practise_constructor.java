package constructor;

public class practise_constructor {
	private String a;
	
    practise_constructor(){
	
    }
	 practise_constructor( practise_constructor b){
		 this.a=b.a;
		 
	 }
	
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
	
	@Override
	public String toString() {
		return "practise_constructor [a=" + a + "]";
	}

}
