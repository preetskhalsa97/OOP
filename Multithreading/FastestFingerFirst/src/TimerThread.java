import javax.swing.JTextField;

class TimerThread	extends		Thread
{
		private		JTextField		textF;		//	text field whose value is to be updated
		private		boolean			suspendFlag;	//	suspend flag
		public		void			mysuspend()	{	suspendFlag = true;			}
		private AnswerBoard answerBoard; 
		public		synchronized	void	myresume()	{	suspendFlag = false;	notify();	}
		//	Constructor Method
		TimerThread(JTextField	txt, AnswerBoard answerBoards)
		{
			textF		=	txt;
			suspendFlag	=	true;
			this.answerBoard=answerBoard; 
		}
		
		// //	Add any other method that you think is required as per specification
		
		public void run()
		{
			// Complete the implementation for this method
			try{
				while (true){
					/*synchronized(this)*/{
						while (suspendFlag){
							wait();
						}
						int i=10;
						while (i>=0){
							textF.setText(i+"");
							i--; 
							if (i>=0){
								Thread.sleep(1000);
							}
						}
						answerBoard.lock();
						mysuspend();
					}
				}
				
			}
			catch(InterruptedException ex){}
		}
					
}
