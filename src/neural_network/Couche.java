package neural_network;

import java.util.ArrayList;

public class Couche{
	
	private ArrayList<Neurone> tabNeurone;
	int valueCouche;
	
	
	public Couche(ArrayList<Neurone> tabNeurone, int valueCouche) {
		this.valueCouche=valueCouche;
		this.tabNeurone=tabNeurone;
	}
	
	
	//Accesseur****************************************
	public int GetNbNeurone() {
		return this.tabNeurone.size();
	}
	
	public int getValueCouche(){
		return this.valueCouche;
	}
	public Neurone getNeurone(int indice) {
		return tabNeurone.get(indice);
	}
	
	public float[] getOutputNeurone(){
		float resultNeurone[]=new float[this.tabNeurone.size()];
		for(int i=0; i<this.tabNeurone.size();i++) {
			resultNeurone[i]=this.tabNeurone.get(i).getY();
		}
		return resultNeurone;
	}
	
	
	public void CalculEtape() {
		for(int i=0; i<this.tabNeurone.size();i++) {
			this.tabNeurone.get(i).somme();
			this.tabNeurone.get(i).f_Activation();
		}
	}
	
	
	//Mutateur*****************************************
	public void setValueCouche(int valueCouche){
		this.valueCouche=valueCouche;
	}
	public void setNewInputNeurone(int indiceNeural, int indiceInput, float newValue) {
		tabNeurone.get(indiceNeural).setInput(indiceInput, newValue);
	}
	public void setNewInputNeurone(int indiceNeural, float[] newValue) {
		tabNeurone.get(indiceNeural).setInput(newValue);
	}
	public void setNewInputNeurone(float[] newValue) {
		for(int i=0; i<tabNeurone.size();i++) {
			tabNeurone.get(i).setInput(newValue);
		}
	}
	public void setNewPoidNeurone(int indiceNeural, int indicePoid, float newValue) {
		tabNeurone.get(indiceNeural).setPoid(indicePoid, newValue);
	}
	public void setNewPoidNeurone(float[] newValue) {
		for(int i=0; i<tabNeurone.size();i++) {
			tabNeurone.get(i).setPoid(newValue);
		}
	}
	
}
