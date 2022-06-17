import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class Answer {
  public static void main(String args[]) throws IOException {
    Properties properties = new Properties();

    try {
      FileInputStream fileInputStream = new FileInputStream("test.properties");
      InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
      properties.load(inputStreamReader);
      System.out.println(properties.getProperty("key"));
      System.out.println(properties.getProperty("value"));
    } catch (IOException e) {
      throw new IOException(e);
    }
  }
}