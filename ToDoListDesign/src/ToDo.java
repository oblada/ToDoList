import java.util.Date;

public class ToDo {
	
	private String text;
	private boolean isActive;
	private Date timeStamp;
	
	public ToDo(String text){
		super();
		this.text = text;
		this.isActive = true;
		this.timeStamp = new java.util.Date(System.currentTimeMillis());
	}
	
	public String getText(){
		return text;
		
	}
	public void setText(String text){
		this.text = text;
	}
	
	
	public boolean getIsActive (){
		return isActive;
	}
	public void setIsActiv (boolean isActive){
		this.isActive = isActive;
	}
	
	
	public Date TimeStamp(){
		return timeStamp;
	}
	public void setTimpeStamp(Date timeStamp){
		this.timeStamp = timeStamp;
	}
	
	
	
	
	
	
	

}
