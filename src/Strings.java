public class Strings {

    public static void main(String args[]){

        String s = "Hello";

        System.out.println("s starts with H ? : "+s.startsWith("H"));

        System.out.println("s ends with O ? : "+s.endsWith("O"));

        System.out.println("substring of s from 0 to 2 index : "+s.substring(0,2));

        System.out.println("substring of s from index 1 : "+s.substring(1));

        System.out.println("Replaced e with a in string s : "+s.replace('e','a'));

        System.out.println("Length of s : "+s.length());

        System.out.println("Index of \"ll\" in s : "+s.indexOf("ll"));

        System.out.println("Does s contains \"L\" ? : "+s.contains("L"));

    }
}
