public class Main {
    public static void main(String[] args) {
        String s = "Java";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString());
        String s1 = "";
        for(int i=0;i<s.length();i++){
            s1 = s.charAt(i) + s1;
        }
        System.out.println(s1);
    }    
}
