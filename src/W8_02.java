interface First{
	default void show() {
		System.out.println("Default method implementation of First interface");
	}
}
interface Second{
	default void show() {
		System.out.println("Default Second interface");
	}
}
class W8_02 implements First, Second {
	public void show() {
		First.super.show();
		Second.super.show();
	}
	public static void main (String args[]) {
		W8_02 q = new W8_02();
		q.show();
	}

}
