public class Main {
    public static void main(String[] args) {
        String str = "Hello, World";
        String email = "guilhermecamargosilva211@gmail.com";

        int pos = str.indexOf('@');
        /*
        System.out.println(str.length());
        System.out.println(str.indexOf('e'));
        System.out.println(str.indexOf('o',5));
        System.out.println(str.charAt(5));
        System.out.println(str.substring(7));
        System.out.println(str.substring(7,9));
        System.out.println(email.substring(email.indexOf('@')+1,email.length()-4));
        System.out.println(email.substring(email.indexOf('@')+1,email.indexOf('.',email.indexOf('@'))));
        */

        //System.out.println(email.replace('a','A'));

        System.out.println(email.replaceFirst("a","A"));
        
    }
}