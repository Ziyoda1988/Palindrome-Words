class Main {
  public static void main(String[] args) {
  System.out.println(isPalindrome("civic")); //-> true
        System.out.println(isPalindrome("Racecar"));// -> true
        System.out.println(isPalindrome("somestring"));// -> false
        System.out.println(isPalindrome("java")); //-> false
        System.out.println(isPalindrome("TENet")); //-> true
        System.out.println(isPalindrome("t")) ;//-> true
        System.out.println(isPalindrome("sS")) ;//-> true



    }

    //Don't change the method header
    public static boolean isPalindrome(String str) {
        String STR = str.toLowerCase();

        for (int i = 0; i <STR.length()/2; i++){
        if (STR.charAt(i)!=STR.charAt(STR.length()-1-i)) {   
         return false;
        } }
          return true;}}




        // implement here
