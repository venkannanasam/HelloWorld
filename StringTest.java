
public class StringTest {

	public static void main(String[] args) {
String b=new String("venkat");
String b1=b.intern();
System.out.println("b==b1"+ (b==b1));
System.out.println(b.equals(b1));
System.out.println(b.hashCode() + " "+ b1.hashCode());

String s="venkat";
String s1="venkat";
System.out.println("s==s1 "+ (s==s1));
System.out.println(s.hashCode() + " "+ s1.hashCode());
System.out.println(System.console());

	}

}
