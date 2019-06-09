package neural_network;

public class Neurone {
	private float[] input;
	private int nbInput;
	private float[] poid;
	private float y;
	private float output;
	
	public Neurone(int nbInput) {
		this.nbInput=nbInput;
		input=new float[this.nbInput];
		poid=new float[this.nbInput];
	}
	
	//Accesseur*******************************
	public float getY() {
		return this.y;
	}
	
	public float getOutput() {
		return this.output;
	}
	
	
	//Mutateur*********************************
	public void setPoid(int indice, float poid) {
		this.poid[indice]=poid;
	}
	public void setPoid(float[] poid) {
		this.poid=poid;
	}
	public void setInput(int indice, float input) {
		this.input[indice]=input;
	}
	public void setInput(float[] input) {
		this.input=input;
	}
	
	
	//Calcul**********************************
	public float somme() {
		float valueSum=0;
		for(int i=0; i<this.input.length; i++) {
			valueSum += this.input[i]*this.poid[i];
		}
		this.y=valueSum;
		
		return valueSum;
	}
	
	public float f_Activation() {
		float value_activation;
		value_activation=this.y;
		this.output=value_activation;
		return value_activation;
	}
}
