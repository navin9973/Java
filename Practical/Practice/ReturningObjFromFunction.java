package Practice;

class Demoo {
	int value;

	Demoo(int v) {
		value = v;

	}

	Demoo demofun() {
		Demoo D = new Demoo(value + 10);
		return D;

	}
}

public class ReturningObjFromFunction {
	public static void main(String arg[]) {

		Demoo obj1 = new Demoo(2);
		Demoo obj2;
		obj2 = obj1.demofun();
		System.out.println("obj1.value " + obj1.value );
		System.out.println("obj2.value " + obj2.value );

	}

}
