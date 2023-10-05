package org.DataType;

public class EMP {
	private void empdetial() {
	byte age = 23;
	short atmpin = 1234;
	int accountnumber = 123456789;
	long mobilenumber = 123456789;
	float percentage = 99.8941147f;
	double per = 99.1111111111111;
	char initial = 'R';
	String name="suriya";
	boolean status = true;
	System.out.println("age="+age+"/n"+"atmpin="+atmpin+"\n"+"accountnumber="+"\n"+accountnumber+"\n"+"mobilenumber="+mobilenumber+"\n"+"percentage="+percentage+"\n"+"per="+per+"\n"+"initial="+initial+"\n"+"name="+name+"\n"+"status="+status);
	}
 
public static void main(String[] args)
{
	EMP v = new EMP();
	v.empdetial();
}

}
