import java.util.Scanner; 
 
public class Diamond { 
    public static void main(String[] args) { 
 Scanner input = new Scanner(System.in); 
 System.out.print("Side length: "); 
 int side_length = input.nextInt(); 
 input.close(); 
 int max = side_length * 2 - 1; 
 int width = max / 2; 
 int num = 1; 
 // top half 
 for (int i = 0; i < side_length; i++) { 
     for (int j = 0; j < width; j++) { 
  System.out.print(" "); 
     } 
     for (int j = 0; j < num; j++) { 
  System.out.print("*"); 
     } 
     System.out.println(); 
     num += 2; 
     width -= 1; 
 } 
 // bottom half 
 num = max - 2; 
 width = 1; 
 for (int i = 0; i < side_length; i++) { 
     for (int j = 0; j < width; j++) { 
  System.out.print(" "); 
     } 
     for (int j = 0; j < num; j++) { 
  System.out.print("*"); 
     } 
     System.out.println(); 
     num -= 2; 
     width += 1; 
 } 
    } 
}