import java.io.*;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fout = new FileWriter("test.txt");
			for(int i = 0; i < 10; i++) {
				fout.write('0'+i);
			}
			fout.close();
		}
		catch(IOException e) {
			System.out.println("IO error");
		}
	}

}
