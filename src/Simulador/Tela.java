package Simulador;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela extends JFrame {

	Painel painel = new Painel();
	Funcoes func = new Funcoes();
	Grafico1 grafico1 = new Grafico1();
	Grafico2 grafico2 = new Grafico2();

	JButton btA = new JButton("INSERIR");
	JButton btB = new JButton("INSERIR");
	JButton btF = new JButton("INSERIR");
	JButton btC = new JButton("INSERIR");

	JTextField txtLargA = new JTextField(30);
	JTextField txtLargB = new JTextField(30);
	JTextField txtMassaA = new JTextField(30);
	JTextField txtMassaB = new JTextField(30);

	JLabel titulo = new JLabel("SIMULADOR PARA UMA PRENSA HIDRÁULICA");
	JLabel t1 = new JLabel("INSERIR INFORMAÇÕES DESEJADAS: ");
	JLabel t2 = new JLabel("LARGURA DO DIÂMETRO A: ");
	JLabel t3 = new JLabel("LARGURA DO DIÂMETRO B: ");
	JLabel t4 = new JLabel("MASSA INSERIDA EM A: ");
	JLabel t5 = new JLabel("MASSA DO CARRO: ");

	JLabel t6 = new JLabel("( metros )");
	JLabel t7 = new JLabel("( metros )");
	JLabel t8 = new JLabel("( kg )");
	JLabel t9 = new JLabel("( kg )");

	JLabel t10 = new JLabel("DIÂMETRO DE A:");
	JLabel t11 = new JLabel("DIÂMETRO DE B:");
	JLabel t12 = new JLabel("ÁREA DE A:");
	JLabel t13 = new JLabel("ÁREA DE B:");
	JLabel t14 = new JLabel("MASSA EM A:");
	JLabel t15 = new JLabel("MASSA DO CARRO:");
	JLabel t16 = new JLabel("FORÇA EXERCIDA EM A:");
	JLabel t17 = new JLabel("FORÇA EXERCIDA EM B:");
	JLabel t18 = new JLabel("ALTURA DOS CILINDROS:");
	JLabel t19 = new JLabel("ALTURA DOS SUPORTES:");
	JLabel t20 = new JLabel("DESLOCAMENTO MÁXIMO DE A:");
	JLabel t21 = new JLabel("DESLOCAMENTO MÁXIMO DO CARRO:");
	JLabel t22 = new JLabel("VOLUME DO CILINDRO A:");
	JLabel t23 = new JLabel("VOLUME DO CILINDRO B:");

	JLabel diametroA = new JLabel(" - ");
	JLabel diametroB = new JLabel(" - ");
	JLabel areaA = new JLabel(" - ");
	JLabel areaB = new JLabel(" - ");
	JLabel massaA = new JLabel(" - ");
	JLabel massaB = new JLabel(" - ");
	JLabel forcaA = new JLabel(" - ");
	JLabel forcaB = new JLabel(" - ");
	JLabel deslocA = new JLabel(" - ");
	JLabel deslocB = new JLabel(" - ");
	JLabel alturaMaxima = new JLabel(" - ");
	JLabel alturaSuporte = new JLabel(" - ");
	JLabel volumeA = new JLabel(" - ");
	JLabel volumeB = new JLabel(" - ");

	JLabel h1 = new JLabel(
			"_________________________________________________________________________________________________");
	JLabel h2 = new JLabel(
			"_________________________________________________________________________________________________");
	JLabel h3 = new JLabel(
			"_________________________________________________________________________________________________");
	JLabel h4 = new JLabel(
			"_________________________________________________________________________________________________");
	JLabel h5 = new JLabel(
			"_________________________________________________________________________________________________");
	JLabel h6 = new JLabel(
			"_________________________________________________________________________________________________");
	JLabel h7 = new JLabel(
			"_________________________________________________________________________________________________");
	JLabel h8 = new JLabel(
			"_________________________________________________________________________________________________");
	JLabel h9 = new JLabel(
			"_________________________________________________________________________________________________");
	JLabel h10 = new JLabel(
			"________________________________________________________________________________________________");
	JLabel h11 = new JLabel(
			"________________________________________________________________________________________________");
	JLabel h12 = new JLabel(
			"________________________________________________________________________________________________");
	JLabel h13 = new JLabel(
			"________________________________________________________________________________________________");
	JLabel h14 = new JLabel(
			"________________________________________________________________________________________________");
	JLabel h15 = new JLabel(
			"________________________________________________________________________________________________");
	JLabel h16 = new JLabel(
			"________________________________________________________________________________________________");

	public Tela() {
		setTitle("Simulador");
		setSize(1400, 900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		painel.setBounds(750, 40, 600, 300);
		add(painel);

		grafico1.setBounds(650, 370, 800, 230);
		add(grafico1);

		grafico2.setBounds(650, 600, 800, 230);
		add(grafico2);

		btA.setBounds(500, 130, 100, 30);
		btB.setBounds(500, 180, 100, 30);
		btF.setBounds(500, 230, 100, 30);
		btC.setBounds(500, 280, 100, 30);

		txtLargA.setBounds(220, 130, 200, 32);
		txtLargB.setBounds(220, 180, 200, 32);
		txtMassaA.setBounds(220, 230, 200, 32);
		txtMassaB.setBounds(220, 280, 200, 32);

		Font f1 = new Font("SansSerif", Font.BOLD, 20);
		titulo.setFont(f1);
		titulo.setBounds(150, 30, 600, 30);
		add(titulo);

		t1.setBounds(30, 80, 600, 30);
		t2.setBounds(50, 130, 600, 30);
		t3.setBounds(50, 180, 600, 30);
		t4.setBounds(50, 230, 600, 30);
		t5.setBounds(50, 280, 600, 30);
		t6.setBounds(430, 130, 600, 30);
		t7.setBounds(430, 180, 600, 30);
		t8.setBounds(440, 230, 600, 30);
		t9.setBounds(440, 280, 600, 30);

		Font f2 = new Font("SansSerif", Font.BOLD, 18);
		t10.setFont(f2);
		t11.setFont(f2);
		t12.setFont(f2);
		t13.setFont(f2);
		t14.setFont(f2);
		t15.setFont(f2);
		t16.setFont(f2);
		t17.setFont(f2);
		t18.setFont(f2);
		t19.setFont(f2);
		t20.setFont(f2);
		t21.setFont(f2);
		t22.setFont(f2);
		t23.setFont(f2);

		h1.setBounds(10, 90, 900, 30);
		h2.setBounds(10, 320, 900, 30);
		h3.setBounds(220, 405, 900, 30);

		h4.setBounds(220, 435, 900, 30);
		h5.setBounds(180, 465, 900, 30);
		h6.setBounds(180, 495, 900, 30);
		h7.setBounds(180, 525, 900, 30);
		h8.setBounds(230, 555, 900, 30);
		h9.setBounds(275, 585, 900, 30);
		h10.setBounds(275, 615, 900, 30);
		h11.setBounds(290, 645, 900, 30);
		h12.setBounds(290, 675, 900, 30);
		h13.setBounds(350, 705, 900, 30);
		h14.setBounds(400, 735, 900, 30);
		h15.setBounds(285, 765, 900, 30);
		h16.setBounds(285, 795, 900, 30);

		t10.setBounds(50, 400, 600, 30);
		t11.setBounds(50, 430, 600, 30);
		t12.setBounds(50, 460, 600, 30);
		t13.setBounds(50, 490, 600, 30);
		t14.setBounds(50, 520, 600, 30);
		t15.setBounds(50, 550, 600, 30);
		t16.setBounds(50, 580, 600, 30);
		t17.setBounds(50, 610, 600, 30);
		t18.setBounds(50, 640, 600, 30);
		t19.setBounds(50, 670, 600, 30);
		t20.setBounds(50, 700, 600, 30);
		t21.setBounds(50, 730, 600, 30);
		t22.setBounds(50, 760, 600, 30);
		t23.setBounds(50, 790, 600, 30);

		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		add(t9);
		add(t10);

		add(t11);
		add(t12);
		add(t13);
		add(t14);
		add(t15);
		add(t16);
		add(t17);
		add(t18);
		add(t19);
		add(t20);
		add(t21);
		add(t22);
		add(t23);

		add(h1);
		add(h2);
		add(h3);
		add(h4);
		add(h5);
		add(h6);
		add(h7);
		add(h8);
		add(h9);
		add(h10);
		add(h11);
		add(h12);
		add(h13);
		add(h14);
		add(h15);
		add(h16);

		add(txtLargA);
		add(txtLargB);
		add(txtMassaA);
		add(txtMassaB);

		add(btA);
		add(btB);
		add(btF);
		add(btC);

		Font f3 = new Font("SansSerif", Font.ITALIC, 18);

		diametroA.setFont(f3);
		diametroB.setFont(f3);
		areaA.setFont(f3);
		areaB.setFont(f3);
		massaA.setFont(f3);
		massaB.setFont(f3);
		forcaA.setFont(f3);
		forcaB.setFont(f3);
		deslocA.setFont(f3);
		deslocB.setFont(f3);
		alturaMaxima.setFont(f3);
		alturaSuporte.setFont(f3);
		volumeA.setFont(f3);
		volumeB.setFont(f3);

		diametroA.setBounds(230, 400, 600, 30);
		diametroB.setBounds(230, 430, 600, 30);
		areaA.setBounds(190, 460, 600, 30);
		areaB.setBounds(190, 490, 600, 30);
		massaA.setBounds(200, 520, 600, 30);
		massaB.setBounds(240, 550, 600, 30);
		forcaA.setBounds(280, 580, 600, 30);
		forcaB.setBounds(280, 610, 600, 30);
		alturaMaxima.setBounds(290, 640, 600, 30);
		alturaSuporte.setBounds(290, 670, 600, 30);
		deslocA.setBounds(360, 700, 600, 30);
		deslocB.setBounds(400, 730, 600, 30);
		volumeA.setBounds(290, 760, 600, 30);
		volumeB.setBounds(290, 790, 600, 30);

		add(diametroA);
		add(diametroB);
		add(areaA);
		add(areaB);
		add(massaA);
		add(massaB);
		add(forcaA);
		add(forcaB);
		add(deslocA);
		add(deslocB);
		add(alturaMaxima);
		add(alturaSuporte);
		add(volumeA);
		add(volumeB);

		setVisible(true);

		for (int x = 1; x < 9; x++) {
			grafico1.forcaA.add((func.getForcaB() / func.getAreaB()) * x, x);
		}

		for (int x = 1; x < 9; x++) {
			grafico2.forcaA.add((100 * x / func.getAreaB()) * x, 100 * x);
		}

		btA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				double a = Double.parseDouble((txtLargA.getText()));
				txtLargA.setText("");

				if (a >= 1 && a <= 3) {
					func.setDimA(a);
					func.setMassaA(0);

					func.calcularUnidades();

					painel.moverA(a);

					if (func.getForcaA() > func.getForcaX()) {
						if (!painel.isPosAtual()) {
							painel.movimento(func.getDeslocamentoA(), func.getDeslocamentoB(), true);
						}
					}

					else {
						painel.movimento(func.getDeslocamentoA(), func.getDeslocamentoB(), false);
					}

					atualizaDados();

				}

				else
					JOptionPane.showMessageDialog(null, "DIGITE UM VALOR ACIMA DE 1 E MENOR QUE 3");

			}
		});

		btB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				double b = Double.parseDouble((txtLargB.getText()));
				txtLargB.setText("");

				if (b > 2 && b <= 5) {
					func.setDimB(b);
					func.setMassaA(0);

					func.calcularUnidades();

					painel.moverB(b);

					if (func.getForcaA() > func.getForcaX()) {
						if (!painel.isPosAtual()) {
							painel.movimento(func.getDeslocamentoA(), func.getDeslocamentoB(), true);
						}
					}

					else {
						painel.movimento(func.getDeslocamentoA(), func.getDeslocamentoB(), false);
					}

					atualizaDados();

				}

				else
					JOptionPane.showMessageDialog(null, "DIGITE UM VALOR ACIMA DE 3 E MENOR QUE 5");

			}
		});

		btF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				double a = Double.parseDouble((txtMassaA.getText()));
				txtMassaA.setText("");

				if (a >= 0) {
					func.setMassaA(a);

					func.calcularUnidades();

					if (func.getForcaA() > func.getForcaX()) {
						if (!painel.isPosAtual()) {
							painel.movimento(func.getDeslocamentoA(), func.getDeslocamentoB(), true);
						}

					}

					else {
						painel.movimento(func.getDeslocamentoA(), func.getDeslocamentoB(), false);
					}

					atualizaDados();

				}

				else
					JOptionPane.showMessageDialog(null, "DIGITE UM VALOR ACIMA DE 0");

			}
		});

		btC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				double b = Double.parseDouble((txtMassaB.getText()));
				txtMassaB.setText("");

				if (b >= 0) {
					func.setMassaB(b);

					func.calcularUnidades();

					if (func.getForcaA() > func.getForcaX()) {
						if (!painel.isPosAtual()) {
							painel.movimento(func.getDeslocamentoA(), func.getDeslocamentoB(), true);
						}
					}

					else {
						painel.movimento(func.getDeslocamentoA(), func.getDeslocamentoB(), false);
					}
					atualizaDados();

				}

				else
					JOptionPane.showMessageDialog(null, "DIGITE UM VALOR ACIMA DE 0");
			}
		});
	}

	public void atualizaDados() {
		diametroA.setText(Double.toString(func.getDimA()) + " " + "m");
		diametroB.setText(Double.toString(func.getDimB()) + " " + "m");
		areaA.setText(Double.toString(func.getAreaA()) + " " + "m²");
		areaB.setText(Double.toString(func.getAreaB()) + " " + "m²");
		massaA.setText(Double.toString(func.getMassaA()) + " " + "kg");
		massaB.setText(Double.toString(func.getMassaB()) + " " + "kg");
		forcaA.setText(Double.toString(func.getForcaA()) + " " + "N");
		forcaB.setText(Double.toString(func.getForcaB()) + " " + "N");
		deslocA.setText(Double.toString(func.getDeslocamentoA()) + " " + "m");
		deslocB.setText(Double.toString(func.getDeslocamentoB()) + " " + "m");
		alturaMaxima.setText(Double.toString(func.getAltura()) + " " + "m");
		alturaSuporte.setText(Double.toString(func.getAlturaSuporte()) + " " + "m");
		volumeA.setText(Double.toString(func.getVolumeA()) + " " + "m3");
		volumeB.setText(Double.toString(func.getVolumeB()) + " " + "m3");
	}

	public static void main(String[] args) {
		new Tela();

	}
}
