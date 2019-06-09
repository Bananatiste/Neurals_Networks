package main;
import java.util.ArrayList;
import neural_network.*;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reseau res= new Reseau(2);
		res.addCouche(2, 5);
		res.addCouche(1, 2);
		
		System.out.println(res.getCouche(0).getValueCouche());
		System.out.println(res.getCouche(1).getValueCouche());
		float[] poid = {0.154f,0.756f};
		float[] input1 = {11f,65f,25f,215f,255f};
		float[] poid1 = {0.25f,0.215f,0.11f,0.3665f,0.98f};
		res.getCouche(1).setNewPoidNeurone(poid);
		res.getCouche(0).setNewPoidNeurone(poid1);
		res.getCouche(0).setNewInputNeurone(input1);
		res.Calcul();
		System.out.println(res.getResultat()[0]);
		res.Calcul();
		System.out.println(res.getResultat()[0]);
		res.Calcul();
		System.out.println(res.getResultat()[0]);
		for(int i=0;i<100000;i++) {
			res.Calcul();
			System.out.println(res.getResultat()[0]);
		}
	}
	
	

}
