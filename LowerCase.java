public class LowerCase { 
    public static void main(String[] args) {
     	String word = args[0];
		System.out.println(lowerCase(word));

   }

  public static String lowerCase(String word) {
  	String newword = "";
        int len = word.length();
        
        /////// now Im changing from char to ASCII numbers
        ////// when there is a capital letter it is in the range of 65 to 90
        ////// I changeD it to lowercase letters by bringing them 32 tabs in the ASCII tabel
        ////// the I change it back to char when the number represent a lower class letter

        for (int i=0;i<len ;i++) {
      	char c = word.charAt(i);
      	int d = (int)c;
      	if (d >= 65 && d <= 90) {
      		d = d + 32;
      		char e = (char)d;
      		newword = newword + e;}

      	else{ newword = newword + word.charAt(i);}

        }	



     return newword;
    }
}
