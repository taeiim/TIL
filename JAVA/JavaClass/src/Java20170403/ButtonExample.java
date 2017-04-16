package Java20170403;

import Java20170403.Button.OnClickListener;

class Button{
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener){
		this.listener = listener();
	}
	
	void touch(){
		listener.onClick();
	}
	
	interface OnClickListener{
		void onClick();
	}
}

class CallListener implements OnClickListener{
	@Override
	public void onClick(){
		System.out.println("전화를 겁니다.");
	}
}

class MessageListener implements OnClickListener{
	@Override
	public void onClick(){
		System.out.println("메세지 보냅니다. ");
	}
}

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		
	}
}
