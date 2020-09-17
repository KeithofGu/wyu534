package homework.com.nineseventeen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 
 * 
	使用缓冲流读取note.txt文件，并将每行字符串输出到控制台上
 * 
 * 
*/

public class BufferedReadFileDemo {
	public static void main(String[] args) throws Exception {
		read();
	}

	private static void read() throws FileNotFoundException, IOException {
		File file = new File("D:\\IBM\\HomeworkProject\\src\\note.txt");// 指定要读取的文件
		// 获得该文件的缓冲输入流
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line = "";// 用来保存每次读取一行的内容
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();// 关闭输入流
	}

}
