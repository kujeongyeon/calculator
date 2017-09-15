package bufferedReader;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cal {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//사용자로부터 입력을 받는 표준입력스트림
		System.out.println("숫자를 입력하세요.");
		String line1 = br.readLine();
		System.out.println("부호를 입력하세요.");
		String sign = br.readLine();
		System.out.println("숫자를 입력하세요.");
		String line2 = br.readLine();

		int num1 = Integer.parseInt(line1);
		int num2 = Integer.parseInt(line2);
		int result = 0;

		if(sign.equals("+")){
			result = num1 + num2 ;
		}else if(sign.equals("-")){
			result = num1 - num2 ;
		}else if(sign.equals("/")){
			result = num1 / num2 ;
		}else if(sign.equals("*")){
			result = num1 * num2 ;
		}

		FileOutputStream fos = new FileOutputStream("input.txt");
		fos.write(result);
		fos.flush(); fos.close();	
		
		BufferedReader br2 = new BufferedReader(new FileReader("input.txt"));
		String msg =null;
		 while ((msg = br2.readLine()) != null){
			 System.out.println(msg);
		 }
		}
	}


