package homework.com.nineseventeen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
	使用文件流复制myfile.txt文件为myfile_cp.txt
 *  
 *  
 */

public class CopyFileStreamDemo {
	public static void copyFile(String src, String dest) throws IOException {
		FileInputStream in = new FileInputStream(src);
		File file = new File(dest);
		if (!file.exists())
			file.createNewFile();
		FileOutputStream out = new FileOutputStream(file);
		int c;
		byte buffer[] = new byte[1024];
		while ((c = in.read(buffer)) != -1) {
			for (int i = 0; i < c; i++)
				out.write(buffer[i]);
		}
		in.close();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		String fileSrc = "D:\\IBM\\HomeworkProject\\src\\myfile.txt";
		String fileDes = "D:\\IBM\\HomeworkProject\\src\\myfile_cp.txt";
		copyFile(fileSrc, fileDes);
		System.out.println("复制成功！");

	}
}
