package main.com.java4beginners.programs;
import java.io.IOException;

public class LaunchingExternalApps {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("notepad.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
