import java.time.LocalDateTime;
import java.util.Date;

public class ToDo {
	
	private String text;
	private boolean active;
	private LocalDateTime timeStamp;
	
	public ToDo(String text){

		this.text = text;
		//this.active = true;
		this.timeStamp = LocalDateTime.now();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		//return "ToDo [text=" + text + ", active=" + active + ", timeStamp=" + timeStamp + "]";
		return text + " is " + " " + active + " and created in " + timeStamp;
	}
	

	

}
