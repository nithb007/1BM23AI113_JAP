import java.util.Scanner;
public class program03b {
    public static void main(String[] args){
        StringBuffer strb1=new StringBuffer();
        System.out.println("The capacity of the stringbuffer is "+strb1.capacity());

        StringBuffer strb2 = new StringBuffer("hello");
        System.out.println("The capacity of the stringbuffer after initialization is  "+strb2.capacity());

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string ");
        String str1=scanner.nextLine();
        StringBuffer strb3=new StringBuffer(str1);
        System.out.println("after reversing the string  "+strb3.reverse());
        String str6=strb3.toString().toUpperCase();
        System.out.println("after converting to uppercase  "+str6);




        System.out.println("enter the string to concatenate:");
        String str2=scanner.nextLine();
        StringBuffer s4=new StringBuffer(str6);
        System.out.println("after concatenation  "+s4.append(str2));

        scanner.close();
    }
}
