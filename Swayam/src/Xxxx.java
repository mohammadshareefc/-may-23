public class Xxxx{
    public static void main (String args[]){
        String string="WelcometoAtpar";
        char[]charArray=string.toCharArray();
        int size= charArray.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j || i+j==size-1)
                System.out.print(charArray[j]+" ");
                else
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        
    }
}