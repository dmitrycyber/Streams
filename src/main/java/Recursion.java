public class Recursion {

    public int printNumbersBefore(int number){
        if (number == 0){
            return 0;
        }
        System.out.print(number + " ");
        return printNumbersBefore(number - 1);
    }

    public int getSumOfNumberDigits(int number){
        if (number < 10){
            return number%10;
        }
        return number%10 + getSumOfNumberDigits(number/10);
    }

    public boolean isPalindrome(String text){
        if (text.length() <= 1){
            return true;
        }
        if (text.charAt(0) == text.charAt(text.length()-1)){
            String s = text.substring(1, text.length()-1);
            return isPalindrome(s);
        }
        return false;
    }
}
