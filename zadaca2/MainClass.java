package zadaca2;

public class MainClass {

	public static void main(String[] args) {
		Fakultet f1 =new Fakultet(); //kreirame prv objekt
		f1.nazivNaFakultet="FIKT"; //gi popolnuvame podatocite za prviot fakultet
		f1.brojNaSmerovi=2;
		f1.brojNaStudenti= 300;
		f1.dekan="Aleksandar Markoski";
		f1.sediste="Bitola";
		//gi povikuvame trite metodi;
		f1.prvMetod();
		System.out.println("Namalen broj na studenti: "+f1.vtorMetod(75));
		f1.tretMetod();
		
		Fakultet f2 =new Fakultet();
		f2.nazivNaFakultet="TFB";
		f2.brojNaSmerovi=7;
		f2.brojNaStudenti=800;
		f2.dekan="Stojance Nusev";
		f2.sediste="Bitola";
		
		f2.prvMetod();
		System.out.println("Namalen broj na studenti: "+f2.vtorMetod(150));
		f2.tretMetod();
	}

}
