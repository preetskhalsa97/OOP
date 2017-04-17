import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

class Player	extends		Thread
{
	private		int		playerId;		// 	Player id
	private		boolean		suspendFlag = false;		//	suspend flag
	private JButton playerBtn;
		
	//	Add any other instance field that you think is required 
	
	public int[] seq = new int[4]; // sequence answered by the player
	public Answer ans;
	private  AnswerBoard answerBoard; 
	
	//
	public	void			mysuspend()	{	suspendFlag = true;	}
	public	synchronized	void	myresume()	
	{	
		suspendFlag = false;
		notify();
	}
	//	Add suitable constructor
	
	Player(int playerId,JButton playerBtn,AnswerBoard answerBoard){
		this.playerId=playerId; 
		this.playerBtn=playerBtn;
		this.answerBoard = answerBoard; 
	}
	
	//	Add any other method that you think is required as per specification
	public	void	run()
	{
		// Complete the implementation for this method
		try{
			while (true){
				/*synchronized(this)*/{
					while (suspendFlag){
						wait();
					}
					playerBtn.setForeground(Color.GRAY);
					double y = Math.random();
					int x = (int)Math.floor(y*10) + 1; 
					int timeLag = x*250+10;
					ArrayList <Integer> arr= new ArrayList<Integer>(4);
					for (int j=1;j<=4;j++){
						arr.add(j); 
					}
					for (int i=0;i<4;i++){
							if (answerBoard.getLockStatus()==false){
							int random = generateRandomNumberInRange(0,i); 
							int num = arr.get(random); 
							arr.remove(num); //TODO add this to answer board
							seq[i]=num;						
							if (i!=3){
								Thread.sleep(timeLag);
							}
						}
					}
					long time = 3*timeLag;
					ans = new Answer(seq,playerId,time); 
					answerBoard.addAnswerList(ans);
					mysuspend(); 					
				}
			}
			
		}catch(InterruptedException ex){}
	}
	
	private static int generateRandomNumberInRange(int min,int max) // min, max both inclusive
	{
		if (min>=max){
			throw new IllegalArgumentException("Max must be greater than min!"); 
		}
		Random r = new Random(); 
		return r.nextInt(max-min+1)+min; 
	}
	
	public JButton getButton(){
		return this.playerBtn;
	}
}