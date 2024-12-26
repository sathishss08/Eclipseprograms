public class CodeSnippet {
 public static void main(String[] args) {
 try {
 System.exit(0);
 }
 catch(Exception ex)
 {
 System.out.print("Hello ");
 ex.printStackTrace();
 }
 finally {
 System.out.print("Hi");
 }
 }
}