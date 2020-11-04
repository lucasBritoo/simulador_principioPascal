package Simulador;

public class Funcoes {
	
	Painel painel = new Painel();
	
	private double dimA = 1;
	private double dimB = 3;
	
	private double forcaA = 0;
	private double forcaB = 4903.325;
	private double forcaX = 544.7907;
	
	private double massaA = 0;
	private double massaB = 500;
	private double gravidade = 9.80665;
	private double pi = 3.141592654; 
	
	private double deslocamentoA = 0;
	private double deslocamentoB = 0;
	
	private int altura = 20;
	private int alturaSuporte = 2;
	
	private double areaA = 0.7853;
	private double areaB = 7.068;
	
	private double volumeA = 0;
	private double volumeB = 0;
	
	public void calcularUnidades() {
		
		this.areaA = pi * (Math.pow(dimA/2, 2));
		this.areaB = pi * (Math.pow(dimB/2, 2));
			
		this.forcaA = massaA * gravidade;
		this.forcaB = massaB * gravidade;
		
		forcaNecessaria();
		calculaDeslocA();
		calculaDeslocB();
		calculaVolume();
		
	}
		
	public void forcaNecessaria() {
		this.forcaX = (forcaB/areaB)* areaA;
		
	}
	
	public void calculaDeslocA() {
		 this.deslocamentoA = 2/(areaA/areaB);
	}
	
	public void calculaDeslocB() {
		this.deslocamentoB = deslocamentoA * (areaA/areaB);
	}
	
	
	public void calculaVolume() {
			this.volumeA = areaA * altura;
			this.volumeB = areaB * altura;
	}
	
	public double getDimA() {
		return dimA;
	}
	public void setDimA(double areaA) {
		this.dimA = areaA;
	}
	public double getDimB() {
		return dimB;
	}
	public void setDimB(double areaB) {
		this.dimB = areaB;
	}
	public double getForcaA() {
		return forcaA;
	}
	public void setForcaA(double forcaA) {
		this.forcaA = forcaA;
	}
	public double getForcaB() {
		return forcaB;
	}
	public void setForcaB(double forcaB) {
		this.forcaB = forcaB;
	}
	public double getMassaA() {
		return massaA;
	}
	public void setMassaA(double massaA) {
		this.massaA = massaA;
	}
	public double getMassaB() {
		return massaB;
	}
	public void setMassaB(double massaB) {
		this.massaB = massaB;
	}
	public double getGravidade() {
		return gravidade;
	}
	public void setGravidade(double gravidade) {
		this.gravidade = gravidade;
	}
	public double getDeslocamentoA() {
		return deslocamentoA;
	}
	public void setDeslocamentoA(double deslocamentoA) {
		this.deslocamentoA = deslocamentoA;
	}
	public double getDeslocamentoB() {
		return deslocamentoB;
	}
	public void setDeslocamentoB(double deslocamentoB) {
		this.deslocamentoB = deslocamentoB;
	}
	public double getAreaA() {
		return areaA;
	}
	public void setAreaA(double areaA) {
		this.areaA = areaA;
	}
	public double getAreaB() {
		return areaB;
	}
	public void setAreaB(double areaB) {
		this.areaB = areaB;
	}
	public Painel getPainel() {
		return painel;
	}
	public void setPainel(Painel painel) {
		this.painel = painel;
	}
	public double getForcaX() {
		return forcaX;
	}
	public void setForcaX(double forcaX) {
		this.forcaX = forcaX;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public int getAlturaSuporte() {
		return alturaSuporte;
	}
	public void setAlturaSuporte(int alturaSuporte) {
		this.alturaSuporte = alturaSuporte;
	}
	public double getVolumeA() {
		return volumeA;
	}
	public void setVolumeA(double volumeA) {
		this.volumeA = volumeA;
	}
	public double getVolumeB() {
		return volumeB;
	}
	public void setVolumeB(double volumeB) {
		this.volumeB = volumeB;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
}
