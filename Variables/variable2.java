public class variable2 {
    public static void main(String[] args){
        // float marks = 6.5; This will give error because by default anything in decimal java considers it double 
        float marks = 6.5f; // So we have to explicitly mention f to make it work
        double marks1 = 7.5;
        double res = marks+marks1;
        System.out.println(res);
    }
}
