import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteData implements Runnable {

  private final String _content;

  public WriteData(List<Object> list) {
    // write list to a string with String builder
    StringBuilder sb = new StringBuilder();
    for (Object item : list) {
      sb.append(item).append("\n");
    }
    _content = sb.toString();
  }

  @Override
  public void run() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"))) {
      writer.write(_content);
    } catch (IOException e) {
      System.err.println("Error writing data to file: " + e);
    }
  }
}
