package writeToFileMethod;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Methods {
	private static void writeToFile(String fileName, String text, boolean append) throws Exception {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, append));) {
			bw.write(text);
		}
	}

	public static void writeToFileWithAppend(String fileName, String text) throws Exception {
		writeToFile(fileName, text, true);
	}

	public static void writeToFileWithoutAppend(String fileName, String text) throws Exception {
		writeToFile(fileName, text, false);
	}

	public static String readfile(String fileName) throws Exception {
		try (InputStream in = new FileInputStream(fileName);
				InputStreamReader reader = new InputStreamReader(in);
				BufferedReader bfr = new BufferedReader(reader);) {
			String line = null;
			String result = "";
			while ((line = bfr.readLine()) != null) {
				result += line + "\n";
			}
			return result;
		}

	}

	public static void readFileWithScanner(String fileName) throws FileNotFoundException {
		File myFile = new File(fileName);
		Scanner myReader = new Scanner(myFile);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
	}

	public static void getFileInfo(String fileName) {
		File myFile = new File(fileName);
		if (myFile.exists()) {
			System.out.println("File name: " + myFile.getName());
			System.out.println("Absolute path: " + myFile.getAbsolutePath());
			System.out.println("Writeable: " + myFile.canWrite());
			System.out.println("Readable " + myFile.canRead());
			System.out.println("File size in bytes " + myFile.length());
		} else {
			System.out.println("The file does not exist.");
		}
	}

	public static void createFile(String fileName) throws IOException {
		File myFile = new File(fileName);
		if (myFile.createNewFile()) {
			System.out.println("File created: " + myFile.getName());
			System.out.println("Located  " + myFile.getAbsolutePath());
		} else {
			System.out.println("File already exists.\n" + myFile.getAbsolutePath());
		}
	}

	public static void deleteFile(String fileName) {
		File myFile = new File(fileName);
		if (myFile.delete()) {
			System.out.println("Deleted the file: " + myFile.getName());
			System.out.println("that was Located " + myFile.getAbsolutePath());
		} else {
			System.out.println("Failed to delete the file.");
		}
	}

	public static byte[] readInBytes(String fileName) throws Exception {
		File myFile = new File(fileName);
		byte[] byteArray = new byte[(int) myFile.length()];
		FileInputStream fileInputStream = new FileInputStream(myFile);
		fileInputStream.read(byteArray);
		return byteArray;

	}

	public static void writeInBytes(String fileName, byte[] data) throws Exception {
		FileOutputStream fops = new FileOutputStream(fileName);
		fops.write(data);
		fops.flush();
		fops.close();
	}

	public static void NioWriteByte(byte[] data, String fileName) throws Exception {
		Path filePath = Paths.get(fileName);
		Files.write(filePath, data);
	}

	public static byte[] NioReadByte(String fileName) throws Exception {
		Path filePath = Paths.get(fileName);
		byte[] data = Files.readAllBytes(filePath);
		return data;
	}

	public static Object readDeseralizable(String fileName) throws Exception {
		Object obj = null;
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			obj = in.readObject();
		} finally {
			return obj;
		}
	}

	public static void writeSerializable(Serializable object,String fileName)throws Exception {
		try(FileOutputStream fout = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fout);){
			oos.writeObject(object);
		}
	}

}
