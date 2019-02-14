package problem02;

public class SmartPhone extends MusicPhone {
	
	
	public String runApp() {
	  
		
	 
	 return "앱실행";		
	}
	public void execute(String function) {
		if (function.equals("앱")) {
			System.out.println(runApp());
			return;
		}
		
		super.execute(function);
	}	  
	  
}
