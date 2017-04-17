public class Question{
	private String question;
	private String[] optionSequence;
	private int[] correctSequence;
	
	Question(String question, String[] optionSequence, int[] sequence){
		this.question=question;
		this.optionSequence=optionSequence;
		this.correctSequence=sequence; 
	}
	
	public String getQuestion(){
		return this.question;
	}
	
	public int[] getCorrectSequence(){
		return this.getCorrectSequence();
	}
	
	public String[] getOptionSequence(){
		return this.optionSequence; 
	}
	
	
	
	
}