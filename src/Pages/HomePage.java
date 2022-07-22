package Pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class HomePage {
	
//	public static void main(String[] args) {
//		
//		System.out.println("Hello Home Page");
//
//	}
	

	    public static void main(String[] args) {
	        System.out.println(generateString());
	        
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
		    LocalDateTime now = LocalDateTime.now();  
		    System.out.println(dtf.format(now));  
	    }

	    public static String generateString() {
	        String uuid = UUID.randomUUID().toString();
	        return "uuid = " + uuid;
	    }
	    
	    String[] task_object_type_key = {"MedReview","CarePlan","CarePlanInterventation"};
	    
	    int task_active_flag = 1;
	    int med_review_active_flag = 1;
	    
	    
	   
	

}
