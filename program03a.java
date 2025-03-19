public class program03a {
    public static boolean comparestrings(String str1,String str2){
        return str1.equals(str2);
    }
    public static String copystring(String str1){
        return new String(str1);
    }
    public static String concatenatestrings(String str1,String str2){
        return str1.concat(str2);
    }
    public static void main(String[] args){
        String str1="I AM .......";
        String str2="BATMAN";
        System.out.println(comparestrings(str1,str2));
        String str4=copystring(str2);
        System.out.println(str4);
        System.out.println("THE TRUTH IS .."+concatenatestrings(str1,str2));
    }
}
