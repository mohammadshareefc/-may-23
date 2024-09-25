

public class W8_01 {
	public static void main(String args[]) {
		java.util.Calendar calendar =java.util.Calendar.getInstance();
		int year = calendar.get(java.util.Calendar.YEAR);
		int month = calendar.get(java.util.Calendar.MONTH) + 1; // Months are 0-based in Calendar
        int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
		System.out.println("Current Year:" +year+ "-" + month + "-" + day);
	}

}






//public class W8_01 { 
//    public static void main(String[] args) {
//        // Create an instance of Calendar using fully qualified name
//        java.util.Calendar calendar = java.util.Calendar.getInstance();
//        
//        // Get the current year
//        int year = calendar.get(java.util.Calendar.YEAR);
//        
//        // Print the current year
//        System.out.println("Current Year: " + year);
//    }
//}
