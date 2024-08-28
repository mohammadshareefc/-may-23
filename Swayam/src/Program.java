
public class Program {
	public static void main(String args[]) {
		String word ="program";
		for(int i=0;i<word.length();i++) {
			for (int j=0;j<(word.length()-i-1);j++) {
				System.out.print(" ");
			}
			
			for(int j=(word.length()/2)-i;j<=(word.length()/2)+i;j++) {
				if(j >=0 && j < word.length()) {
					System.out.print(word.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
