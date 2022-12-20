public class T6Q1e {
    public static void main(String[] args){
        String a = "abc123";
        calculation(a);
    }

    static void calculation(String s){
        int count = 0;

        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i))){
                count++;}

        }
        System.out.println("The number of digits is " + count);
        System.out.println("The number of letters is " + (s.length() - count));
    }

}