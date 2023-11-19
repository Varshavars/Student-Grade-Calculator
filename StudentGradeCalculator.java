import java.util.Scanner;

public class sgc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of subjects:");
        float n =sc.nextInt();
        float t=0;
    for (int i=0;i<n;i++)
    {
        System.out.println("Enter marks for Subject"+(i+1));
        float m=sc.nextInt();
        t=t+m;
    }
    System.out.println("Total marks obtained (out of "+(n*100)+") :"+(t));
    float p=((t/(n*100))*100);
    System.out.println("Percentage obtained:"+p+"%");
    if(p>=90)
    System.out.println("Grade: O");
    else if (p<90 && p>=80)
    System.out.println("Grade: A+");
    else if (p<80 && p>=70)
    System.out.println("Grade: A");
    else if (p<70 && p>=60)
    System.out.println("Grade: B");
    else if (p<60 && p>=50)
    System.out.println("Grade: C");
    else if (p<50 && p>=40)
    System.out.println("Grade: D");
    else
    System.out.println("Grade: Fail!!!");
    }
}
