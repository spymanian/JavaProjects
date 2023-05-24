public class WordWrapper{
  private String input;
  
  public WordWrapper(String input){
    this.input = input;
   }
  public String sandwich(){
    String temp = "";

     temp += input.toUpperCase();
     temp += input.toLowerCase();
     temp += input.toUpperCase();

     return temp;

  }
 public boolean isPal(){
  boolean palindrome = true;
  int i = 0;
 int j = input.length()-1;

while(i < j){
if(input.charAt(i) != input.charAt(j)){
 palindrome = false;
}
j--;
i++;
}
return palindrome;
}
  public String toString(){
   int i = input.length();
  String length = input + i;

   return length;
}
public static void main(String [] args){
 WordWrapper word = new WordWrapper(args[0]);

System.out.println(word.toString());
System.out.println(word.sandwich());
System.out.println(word.isPal());
}

}