package neural_network;

import java.util.ArrayList;

public class Reseau {
	private ArrayList<Couche> listeCouche = new ArrayList<>();
	private int nbCouche;
	private float[] resultat;
	
	
	public Reseau(int nbCouche) {
		this.nbCouche=nbCouche;
		// TODO Auto-generated constructor stub
	}
	
	public void addCouche(int nbNeurone, int nbInputparNeurone) {
		listeCouche.add(new Couche(DefNeurone(nbNeurone,nbInputparNeurone),listeCouche.size()));
	}
	
	
	private static ArrayList<Neurone> DefNeurone(int nbNeurone, int nbInput){
		ArrayList<Neurone> neuroneInput = new ArrayList<>();
		for(int i=0; i<nbNeurone; i++) {
			neuroneInput.add(new Neurone(nbInput));
		}
		return  neuroneInput;
	}
	
	public Couche getCouche(int numCouche) {
		return listeCouche.get(numCouche);
	}
	public Neurone getNeurone(int numCouche, int numNeurone) {
		return listeCouche.get(numCouche).getNeurone(numNeurone);
	}
	public float[] getResultat() {
		return resultat;
	}
	
	private void diffusion(int numCoucheOut) {
		if(numCoucheOut<listeCouche.size()-1) {
			listeCouche.get(numCoucheOut+1).setNewInputNeurone(listeCouche.get(numCoucheOut).getOutputNeurone());
	
		}
	}
	
	public void Calcul() {
		for(int i=0;i<listeCouche.size();i++) {
			listeCouche.get(i).CalculEtape();
			diffusion(i);
		}
		resultat=listeCouche.get(listeCouche.size()-1).getOutputNeurone();
	}
}
