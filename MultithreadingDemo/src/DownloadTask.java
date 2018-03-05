
public class DownloadTask implements Runnable {
	
	private String fileLocation;
	
	public DownloadTask(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Downloading file from " + fileLocation);
		}
	}
	

}
