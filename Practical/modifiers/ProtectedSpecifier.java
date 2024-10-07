package modifiers;
class Variables{
	static public int a = 7;
	static protected int b = 8;
	static private int c = 9;
	
	static void privateVar() {
		System.out.println("private :" + c);
	}
	
}

public class ProtectedSpecifier {
	public static void main(String args[]) {
		System.out.println("public "+ Variables.a);
		System.out.println("protected " + Variables.b);
//		System.out.println("private " + Variables.c);
		Variables.privateVar();
	}

}
