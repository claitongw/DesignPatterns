package singleton;

public class SecurityManager {
	
	private static SecurityManager instance;
	
	private SecurityManager(){
	}
	
	public static SecurityManager getInstance(){
		if (instance==null){
			instance = new SecurityManager();
		}
		return instance;
	}
	
	public void Login(){
		
	}
}
