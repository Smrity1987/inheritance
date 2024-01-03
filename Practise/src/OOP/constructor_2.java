package OOP;

public class constructor_2 {
String name,address;
int roll;
constructor_2(String n,int r,String a){
	name=n;
	roll=r;
	address=a;
}
 void display() {
	System.out.println("name = "+name);
	System.out.println("roll = "+roll);
	System.out.println("address = "+ address);
}
}
