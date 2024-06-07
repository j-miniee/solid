import java.io.*;

public class OutputStreamWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OutputStreamWriter out = null;
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("hangul.txt");
			out = new OutputStreamWriter(fout);
			out.write("한글 텍스트파일입니다.");
			out.close();
			fout.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
