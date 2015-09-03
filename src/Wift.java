import java.io.File;

public class Wift {
  
  /** 
   *  Wift - The BASIC Programming Language
   *  
   *        BASIC FUNCTIONALITY:
   *            - STRINGS []
   *            - INTEGERS []
   *            - ARITHMETIC []
   *            - VARIABLES []
   *  
   *        FUNCTIONS:
   *            - PRINT []
   *            - INPUT []
   *            - IF []
   *            - FOR []
   *  
   *  
   */

  public static void main(String...args){}

  public static String readFile(String filePath){
      File f = new File(filePath);
      Scanner input = new Scanner(f);
  }

  //        #readFile() -> char content
  //        #tokenize() -> list
  //        #parse()    -> symbol table

}
