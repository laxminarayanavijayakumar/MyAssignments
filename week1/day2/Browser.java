package week1.day2;

public class Browser {
	
	public String launchBrowser(String  browserName) {
		
		System.out.println(browserName);
		System.out.println("Browser launched successfuly");
		return browserName;
		
	}
	
	public void loadUrl() {
		
		System.out.println("Application url loaded successfully");
			
	}
	
	public static void main(String[] args) {
		
		Browser chrome = new Browser();
		chrome.launchBrowser("chromeBrowser");
		chrome.loadUrl();
	}
	

}
