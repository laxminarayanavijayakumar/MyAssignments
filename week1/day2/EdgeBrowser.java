package week1.day2;

public class EdgeBrowser {
	
	public static void main(String[] args) {
		
		Browser edge = new Browser();
		
		String browserName = edge.launchBrowser("EdgeBrowser");
		edge.loadUrl();
	}

}
