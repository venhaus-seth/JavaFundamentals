import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String response = String.format("Hello %s. Lovely to see you", name); 
        return response;
    }

    public String guestGreeting(String name, String dayPeriod) {
        String response = String.format("Hello %s. Lovely to see you this %s", name, dayPeriod); 
        return response;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        String response = String.format("It is currently " + date);
        return response;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // System.out.println(conversation);
        String response = "asdasdasd";
        if (conversation.indexOf("Alexis") >= 0) {
            response = "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") >= 0) {
            response = "At your service.";
        }
        else {
            response = "Time for bed!";
        }
        return response;
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}