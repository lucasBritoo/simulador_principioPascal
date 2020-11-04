package Simulador;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

class Painel extends JPanel {

	private int lineA = 100;
	private int lineB = 520;
	private int forcA = 0;
	private int lineC1 = 100;
	private int altura1 = 90;
	private int altura2 = 90;
	private int altura3 = 120;
	private int altura4 = 120;

	private int lineC2 = 520;
	private int contadorA = 0;
	private int contadorB = 0;

	private boolean flag = false;
	private boolean posAtual = false;
	int ref = 0;

	private int deslocA = 0;
	private double deslocB = 0;
	private double auxA = 0;
	private double auxB = 0;

	ImageIcon carro = new ImageIcon(getClass().getResource("imagem1.png"));

	public Painel() {
		setBorder(BorderFactory.createLineBorder(Color.black));
		setBackground(Color.WHITE);

	}

	public void moverA(double x) {
		this.lineA = 130 - ((int) Math.round(x * 30));
		this.lineC1 = lineA;

	}

	public void moverB(double x) {
		this.lineB = 430 + ((int) Math.round(x * 30));
		this.lineC2 = lineB;

	}

	public void movimento(double a, double b, boolean status) {
		this.setPosAtual(status);

		if (status == true) {

			if (altura1 <= 90) {
				this.flag = true;
				this.auxA = 0;
				this.auxB = 0;

				this.deslocA = (int) (99 * a) / 20;
				this.deslocB = (int) (30 * b) / 2;

				if (deslocA > 219) {
					deslocA = 89;
				}

				if (deslocB > 30) {
					deslocB = 30;
				}

				System.out.println(deslocB);
				System.out.println(deslocA);
			}

		}

		else {
			if (altura1 >= 90) {
				deslocA = 89;
				deslocB = 30;

				this.auxA = 0;
				this.auxB = 0;
				this.flag = false;
			}

		}

	}

	public void movimentar() {
		this.contadorA += 1;
		this.contadorB += 1;

		if (this.flag == true) {
			if (contadorA > 20) {
				this.contadorA = 0;
				if (auxA < deslocA) {
					if (altura1 >= 90 && altura1 <= 178) {

						this.auxA += 1;
						this.altura1 += 1;
						this.altura4 += 1;
					}

				}
			}

			if (contadorB > 60) {
				this.contadorB = 0;

				if (auxB < deslocB) {
					this.auxB += 1;
					this.altura2 -= 1;
					this.altura3 -= 1;
				}
			}
		}

		else {
			if (contadorA > 20) {
				this.contadorA = 0;
				if (altura1 > 90) {
					this.altura1 -= 1;
					this.altura4 -= 1;
				}
			}

			if (contadorB > 60) {
				this.contadorB = 0;

				if (altura2 < 90) {
					this.auxB += 1;
					this.altura2 += 1;
					this.altura3 += 1;
				}
			}
		}

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);

		Image img = carro.getImage();
		g.drawImage(img, 400 + ((lineB - 430) / 2), altura2 - 50, this); // imagem carro

		g.drawLine(lineA, 90, lineA, 250); // Aresta A
		g.drawLine(lineB, 90, lineB, 250); // Aresta B
		g.drawLine(lineC1, 250, lineC2, 250); // Aresta C
		g.drawLine(430, 90, 430, 220); // Aresta D
		g.drawLine(130, 90, 130, 220); // Aresta E
		g.drawLine(130, 220, 430, 220); // Aresta F

		g.drawLine(lineA, altura1, 130, altura1); // suporte A
		g.drawLine(430, altura2, lineB, altura2); // suporte B
		g.drawLine(lineA, altura4, 130, altura4); // eixoCarro
		g.drawLine(430, altura3, lineB, altura3); // eixoCarro

		int xSuporte = (lineB - 430) / 2;
		g.drawLine(430 + xSuporte, altura2, 430 + xSuporte, altura3); // suporte eixoCarro

		int y1Coord = altura4 + 2;
		int x1Coord = lineA + 2;
		int z1Coord = 127 - lineA;

		int y2Coord = altura3 + 2;
		int x2Coord = 430 + 2;

		int x3Coord = lineB - 433;

		g.setColor(Color.BLUE);
		g.fillRect(128, 222, 304, 27); // base
		g.fillRect(x1Coord, y1Coord, z1Coord, 247 - altura4); // volume no cilindro A
		g.fillRect(x2Coord, y2Coord, x3Coord, 247 - altura3); // volume no cilindro B

		movimentar();
		repaint();

	}

	public Dimension getPreferredSize() {
		return new Dimension(600, 300);
	}

	public int getLineA() {
		return lineA;
	}

	public void setLineA(int lineA) {
		this.lineA = lineA;
	}

	public int getLineB() {
		return lineB;
	}

	public void setLineB(int lineB) {
		this.lineB = lineB;
	}

	public int getForcA() {
		return forcA;
	}

	public void setForcA(int forcA) {
		this.forcA = forcA;
	}

	public int getLineC1() {
		return lineC1;
	}

	public void setLineC1(int lineC1) {
		this.lineC1 = lineC1;
	}

	public int getLineC2() {
		return lineC2;
	}

	public void setLineC2(int lineC2) {
		this.lineC2 = lineC2;
	}

	public int getAltura1() {
		return altura1;
	}

	public void setAltura1(int altura1) {
		this.altura1 = altura1;
	}

	public int getAltura2() {
		return altura2;
	}

	public void setAltura2(int altura2) {
		this.altura2 = altura2;
	}

	public int getAltura3() {
		return altura3;
	}

	public void setAltura3(int altura3) {
		this.altura3 = altura3;
	}

	public int getContador() {
		return contadorB;
	}

	public void setContador(int contador) {
		this.contadorB = contador;
	}

	public ImageIcon getCarro() {
		return carro;
	}

	public void setCarro(ImageIcon carro) {
		this.carro = carro;
	}

	public boolean isPosAtual() {
		return posAtual;
	}

	public void setPosAtual(boolean posAtual) {
		this.posAtual = posAtual;
	}

}