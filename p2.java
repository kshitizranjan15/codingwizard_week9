import java.util.Scanner;
public class p2{  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1,string2;
        System.out.println("Enter the first String : ");
        string1 = sc.nextLine();
        System.out.println("Enter the second String : ");
        string2 = sc.nextLine();
        char [] c1 = string1.toCharArray();
        char [] c2 = string2.toCharArray();
            for(int j=0;j<c2.length;j++) {
                for(int i=0;i<c1.length;i++) {

                if(c1[i] == c2[j]) {
                    c1[i] = 0;
                }    
            }
        }
        System.out.println("After removing the characters of second string from first string :");
        for(int i=0;i<c1.length;i++) {
            System.out.print(c1[i]); 
        }  
    }
}

//..............

//.......
// updated.

