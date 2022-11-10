package zadaca3;

public class PC {

	public int memorija;
	public String tipNaMemorija;
	public int hardDisk;
	public String golemina="GB";
	
	public PC(){
		this.memorija=2;
		this.tipNaMemorija="DDR2";
		this.hardDisk=160;
	}	
	public void metod(int zgolemiMemorija, int novHardDisk) {
		int zgolemenaMemorija=this.memorija+zgolemiMemorija;
		int novHD=this.hardDisk+novHardDisk;
		System.out.println("Memorijata bese "+this.memorija+this.golemina+", sega iznesuva "+zgolemenaMemorija+this.golemina+".");
		System.out.println("Tipot na memorijata e "+this.tipNaMemorija+".");
		System.out.println("HD ima golemina od "+novHD+this.golemina+".");
		System.out.println("Predhodno iznesuvase "+this.hardDisk+this.golemina+".");
	}
}
