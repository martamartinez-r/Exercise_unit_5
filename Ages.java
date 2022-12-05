import java.util.Scanner;

public class Ages
{
    public static void main(String[] args)
    {
        byte age1 = 43, age2 = 39;
        
        byte sumAges = (byte)(age1 + age2);
        System.out.println("The sum of ages is " + sumAges);
        
        float ageAverage = (float)(age1 + age2) / 2;
        System.out.println("The age average is " + ageAverage);
    }
}
