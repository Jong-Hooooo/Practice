package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExam {
	public static void mai(String[]args) {
	Thread thread = new Thread(new Runnable() {
		@Override
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try {Thread.sleep(500);} catch(Exception e) {}
			}
		}
	});
	
	//thread.
	for(int i = 0;i<5;i++){
		System.out.println("띵");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
	}
	}
}
