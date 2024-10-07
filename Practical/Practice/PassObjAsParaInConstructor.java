package Practice;

class Add {
	private int a, b;

	Add(Add A) {
		a = A.a;
		b = A.b;
	}
	
	Add(int x, int y){
		a = x;
		b = y;
	}
	
	void sum() {
		int add = a + b;
		System.out.println(add);
	}

}

public class PassObjAsParaInConstructor {
	public static void main(String args[]) {
		Add A = new Add(15, 8);
		Add A1 = new Add(A);
		A1.sum();
	}

}
