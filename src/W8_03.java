interface ShapeX{
	 String base ="This is Shape1";
	 void display1();
}
interface ShapeY extends ShapeX{
	 String base = " This is Shape2";
	 void display2();
}
class ShapeG implements ShapeY {
	
	@Override
	public void display1() {
		System.out.println("Circle: " +ShapeX.base);
	}
	@Override
	public void display2{
		System.out.println("Circle: " +ShapeY.base);
	}
}
public class W8_03 {
	public static void main (String arg[]) {
		ShapeG circle = new ShapeG();
		circle.display1();
		circle.display2();
	}

}



////Interface ShapeX is created
//interface ShapeX {
// String base = "This is Shape1";  // Implicitly public, static, and final
// void display1();
//}
//
////Interface ShapeY is created which extends ShapeX
//interface ShapeY extends ShapeX {
// String base = "This is Shape2";  // Implicitly public, static, and final
// void display2();
//}
//
////Class ShapeG is created which implements ShapeY
//class ShapeG implements ShapeY {
// // Overriding method in ShapeX interface
// @Override
// public void display1() {
//     System.out.println("Circle: " + ShapeX.base);
// }
// 
// // Implementing method in ShapeY interface
// @Override
// public void display2() {
//     System.out.println("Circle: " + ShapeY.base);
// }
//}
//
////Main class
//public class W08_P3 {
// public static void main(String[] args) {
//     // Object of class ShapeG is created and display methods are called
//     ShapeG circle = new ShapeG();
//     circle.display1();
//     circle.display2();
// }
//}
