import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args){
         Scanner input=new Scanner(System.in);
         System.out.println("Enter the size of array: ");
         int size=input.nextInt();
         int[]arr=new int[size];
         int sum=0;
         System.out.println("Enter the value of array: ");
         for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
         }
         for(int i=0;i<size;i++){
            sum+=arr[i];
         }
         System.out.println(sum);

        /*Scanner sc=new Scanner(System.in);
        Circle c1=new Circle();
        System.out.println("Enter the radius: ");
        c1.radius=sc.nextFloat();
        c1.area();
        c1.PI=3.1416f;*/

       /*  Student s1=new Student();
        System.out.println("Enter your name: ");
        s1.name=sc.next();
        System.out.println("Enter your id: ");
        s1.id=sc.nextInt();
        System.out.println("Enter your cgpa: ");
        s1.cgpa=sc.nextFloat();
        s1.display();*/
        

         //System.out.println("Hello, World!");
        /*Student s1=new Student();
        s1.setvalue("Era",12,3.5f);
        s1.display();
        Student s2=new Student();
        s2.name="Mony";
        s2.id=14;
        s2.display();*/
    }
}
