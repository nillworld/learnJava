// https://epicdevs.com/8

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintStream;

public class StdOutRedirect  {
  public static void main(String[] args) throws FileNotFoundException {
  File file = new File("log.txt");
  PrintStream printStream = new PrintStream(new FileOutputStream(file));
  // console로 출력
  System.out.println("Hello World!");
  System.err.println("ERROR!");
  PrintStream sysout = System.out;
  // standard out과 err을 file로 변경
  System.setOut(printStream);
  System.setErr(printStream);
  // file로 출력
  System.out.println("Hello World!");
  System.err.println("ERROR!");
  // standard out을 console로 다시 변경
  System.setOut(sysout);
  // out은 console로 출력, err은 파일로 출력
  System.out.println("Hello World!");
  System.err.println("ERROR!");
  printStream.close();
  }
}
  