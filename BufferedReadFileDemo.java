package homework.com.nineseventeen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 
 * 
	ʹ�û�������ȡnote.txt�ļ�������ÿ���ַ������������̨��
 * 
 * 
*/

public class BufferedReadFileDemo {
	public static void main(String[] args) throws Exception {
		read();
	}

	private static void read() throws FileNotFoundException, IOException {
		File file = new File("D:\\IBM\\HomeworkProject\\src\\note.txt");// ָ��Ҫ��ȡ���ļ�
		// ��ø��ļ��Ļ���������
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line = "";// ��������ÿ�ζ�ȡһ�е�����
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();// �ر�������
	}

}
