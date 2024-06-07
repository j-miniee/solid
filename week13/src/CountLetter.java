import java.io.*;
import java.util.*;

public class CountLetter {

	public static int getCount(char c, File f)throws Exception {
		// TODO Auto-generated method stub
		int count = 0;
		try(InputStream in = new FileInputStream(f);
				BufferedReader reader = new BufferedReader(new InputStreamReader(in)))
		{
			String line = null;
			while((line = reader.readLine())!= null) {
				for(int i = 0; i < line.length(); i++) {
					if(c == line.charAt(i)) {
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) throws Exception{
		File file = new File("test.txt");
		int count = getCount('a', file);
		System.out.println("'의 횟수: "+count);
	}

}
