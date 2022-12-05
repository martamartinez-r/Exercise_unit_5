import java.util.Scanner;

public class CircleArea
{
    //Constant to store a value of PI
    static final float PI = 3.14159f;
    
    public static void main(String[] args)
    {
        float radius, area;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter circle radius:");
        radius = sc.nextFloat();
        
        area = PI * radius * radius;
        
        System.out.printf("Area = %.2f", area);
    }
}

