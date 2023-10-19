import java.util.HashSet;
import java.util.Scanner;

public class Pangram{
    public static boolean isPangramChecker(String sentence){
            sentence = sentence.replaceAll(" ","").toLowerCase();

        HashSet<Character> uniqueChar = new HashSet<>();

        for( char c : sentence.toCharArray()){

            if( c >='a' && c <= 'z'){
                uniqueChar.add(c);
            }

        }

        return uniqueChar.size() == 26;

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence Line ");
        String sentence = input.nextLine();

        if(isPangramChecker(sentence)){
            System.out.println("The sentence is a pangram.");
        }else{
            System.out.println("The sentence is a not pangram.");
        }
    }
}