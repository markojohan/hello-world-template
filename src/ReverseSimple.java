//Enter your name and  surname print out as reverse.
//Note: Don't use existing Java functions.

public class ReverseSimple {
    private String getReverse(String input){
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        ReverseSimple reverse = new ReverseSimple();
        String result = reverse.getReverse("Cyka");
        System.out.println(result);
    }
}
