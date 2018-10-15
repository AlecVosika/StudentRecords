// you do not have to memorize this code
// generally people do not expect you to remember this
// they will expect you to be able to do this with google, notes, ect.

package sr;
import java.io.IOException; // if it doesn't exist, this handles it
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextConnection {

	private List<String> fileText = new ArrayList<String>();
	
	public List<String> getFile(String aPath, String aFile){
		
		try {
			fileText = Files.readAllLines(
					Paths.get(aPath + aFile), Charset.defaultCharset());
		
		}catch(IOException e){
			e.printStackTrace();
		}

	return fileText;
	}
	
}
