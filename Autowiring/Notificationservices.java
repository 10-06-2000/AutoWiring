package ustbatchno3.Com.Autowiring;

public class Notificationservices {
	private Messageservices messageservices;
	
	public void notifyServices(){
	messageservices.sentmessage("hey im notified ");
	

}

	

	public void setMessageservices(Messageservices messageservices) {
		this.messageservices = messageservices;
	}


	
}
