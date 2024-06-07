import java.io.*;

public class FileOutputSteamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = {7, 51, 3, 4, -1, 24};
		try {
			FileOutputStream fout = new FileOutputStream("test.out");
			for(int i = 0; i < b.length; i++){
				fout.write(b[i]);
			}
			fout.close();
		}catch(IOException e) {
			System.out.println("test.out에 저장할 수 없습니다. 경로명을 확인해주세요");
			return;
		}
		System.out.println("test.out을 저장하였습니다.");
	}

}
