import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Viktor on 2017-04-18.
 */
public class Copy {
  public static void main(String[] args) {

    if ( args.length == 0) {
      usage();
    } else if ( args.length == 1 ) {
      System.out.println("No destination provided");
    } else if ( args.length == 2) {
    }
  }

  static void usage() {
    List<String> usageFile = null;

    try {
      Path usagePath = Paths.get("usage.txt");
      usageFile = Files.readAllLines(usagePath);
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Uh-oh, could not read the file!");
    }
    for (int i = 0; i < usageFile.size(); i++) {
      System.out.println(usageFile.get(i));
    }
  }

}
// This should be the basic replica of the 'cp' command
// If ran from the command line without arguments
// It should print out the usage:
// copy [source] [destination]
// When just one argument is provided print out
// No destination provided
// When both arguments provided and the source is a file
// Read all contents from it and write it to the destination