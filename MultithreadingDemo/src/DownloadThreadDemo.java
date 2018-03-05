
public class DownloadThreadDemo {
	
	public static void main(String[] args) {
		
		DownloadTask downloadFile1Task = new DownloadTask("https://google.com/a/temp.mp4");
		DownloadTask downloadFile2Task = new DownloadTask("https://google.com/a/temp12345.mp4");
		
		Thread t1 = new Thread(downloadFile1Task);
		t1.start();
		
		Thread t2 = new Thread(downloadFile2Task);
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main method is completed");
		
	}

}
