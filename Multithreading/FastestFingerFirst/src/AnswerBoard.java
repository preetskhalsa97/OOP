import java.util.ArrayList;

class AnswerBoard
{
	private		ArrayList<Answer>	answerList		=	new	ArrayList<Answer>();		// answerList
	private		Question		currentQuestion;							// current question of the game
	private		long			initialTime;								// initial time when any game iteration started 	
	private		boolean			isLocked;
	AnswerBoard()
	{
		initialTime = System.nanoTime(); 
		answerList.add(null);answerList.add(null);answerList.add(null);answerList.add(null);answerList.add(null);
		answerList.add(null);answerList.add(null);answerList.add(null);answerList.add(null);answerList.add(null);
		isLocked	=	true;
	}
	//	Write your code from here
	//	You can add any other method, instance field of your choice 
	
	public void lock(){
		this.isLocked=true; 
	}
	
	public void unlock(){
		this.isLocked=false;
	}
	
	public boolean getLockStatus(){
		return this.isLocked;
	}
	
	public void addAnswerList(Answer ans){
		ans.setTime((System.nanoTime()-initialTime)/1000000); 
		answerList.add(ans); 
	}
	
	public void reset(){
		answerList=null; 
		currentQuestion=null; 
		initialTime=0;
		isLocked=false; 
	}

	
}
