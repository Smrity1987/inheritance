package constructor;

public class copy_constructor {

	public static void main(String[] args) {
		practise_constructor cons=new practise_constructor();
		cons.setA("smrity");

		
		practise_constructor cons2=new practise_constructor(cons);
		System.out.println(cons2.getA());

	}

}
