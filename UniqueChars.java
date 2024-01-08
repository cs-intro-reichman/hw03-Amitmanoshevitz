/** String processing exercise 2. */
public class UniqueChars { 
    public static void main(String[] args) {
        String word = args[0];
        System.out.println(UniqueChars(word)); }   
        //// what the method does:
        /// checking if the char at the first index is uqule to the second
        /// if it does it'll not be adding them to the new word
        /// if its unique it'll add the char to the new word 
        /// after im done it'll move to check if the char at the second index is = to the first

        
    public static String UniqueChars(String word) {
        char first = word.charAt(0);
         String newword = first + "";
        int i = 1;
        int len = word.length(); 

        while(i<len){
            char start = word.charAt(i);
            int j = 0;

            while (j<len){
            char comp = word.charAt(j); //finding the char in the j index to compare   
                    if (comp == start){
                        break;}  
                    j++;}

                    if (i==j){
                    newword = newword + start;}               
                    i++;} /// adding the unique char to the word
                              return newword;
  
            }
        
        
}