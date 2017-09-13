package aula;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
	JTextField txtVisor = new JTextField();
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMP = new JButton("M+");
	JButton btnMN = new JButton("M-");
	JButton btnLeft = new JButton("←");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnPN = new JButton("+/-");
	JButton btnRAIZ = new JButton("√");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnDIV = new JButton("/");
	JButton btnPORCENTAGEM = new JButton("%");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btnMULT = new JButton("*");
	JButton btn1X = new JButton("1/x");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btnMENOS = new JButton("-");
	JButton btnRESULT = new JButton("=");
	JButton btn0 = new JButton("0");
	JButton btnVIRGULA = new JButton(",");
	JButton btnSOMA = new JButton("+");
	
	double numero1, numero2;
	String operacao;
	
	public Calculadora(){
		
		
		super("Calculadora");// responsavel por colocar o rótulo na janela
		
		Container paine = this.getContentPane(); // Container é uma classe responsavel pela fixação dos itens na tela
		
		paine.add(txtVisor);
		txtVisor.setBounds(20, 20, 295, 40); // 1º espaço da esquerda pra direita / 2º espaço de cima para baixo / 3º largura do objeto / 4º altura do objeto
		
		paine.add(btnMC);
		btnMC.setBounds(20, 80, 52, 52);
		
		paine.add(btnMR);
		btnMR.setBounds(80, 80, 52, 52);
		
		paine.add(btnMS);
		btnMS.setBounds(140, 80, 52, 52);
		
		paine.add(btnMP);
		btnMP.setBounds(200, 80, 52, 52);
		
		paine.add(btnMN);
		btnMN.setBounds(260, 80, 52, 52);
		
		paine.add(btnLeft);
		btnLeft.setBounds(20, 142, 52, 52);
		
		paine.add(btnCE);
		btnCE.setBounds(80, 142, 52, 52);
		
		paine.add(btnC);
		btnC.setBounds(140, 142, 52, 52);
		
		paine.add(btnPN);
		btnPN.setBounds(200, 142, 52, 52);
		
		paine.add(btnRAIZ);
		btnRAIZ.setBounds(260, 142, 52, 52);
		
		paine.add(btn7);
		btn7.setBounds(20, 204, 52, 52);
		btn7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "7");
			}
		});

		paine.add(btn8);
		btn8.setBounds(80, 204, 52, 52);
		btn8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "8");
			}
		});
		
		paine.add(btn9);
		btn9.setBounds(140, 204, 52, 52);
		btn9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "9");
			}
		});
		
		
		paine.add(btnDIV);
		btnDIV.setBounds(200, 204, 52, 52);
		btnDIV.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numero1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				operacao = "divisao";
			}
		});
		
		paine.add(btnPORCENTAGEM);
		btnPORCENTAGEM.setBounds(260, 204, 52, 52);
		btnPORCENTAGEM.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numero1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				operacao = "porcentagem";
			}
		});
		
		paine.add(btn4);
		btn4.setBounds(20, 264, 52, 52);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "4");
			}
		});
		
		
		paine.add(btn5);
		btn5.setBounds(80, 264, 52, 52);
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "5");
			}
		});
		
		paine.add(btn6);
		btn6.setBounds(140, 264, 52, 52);
		btn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "6");
			}
		});
		
		paine.add(btnMULT);
		btnMULT.setBounds(200, 264, 52, 52);
		btnMULT.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numero1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				operacao = "multiplicacao";
			}
		});
		
		paine.add(btn1X);
		btn1X.setBounds(260, 264, 52, 52);
		
		paine.add(btn1);
		btn1.setBounds(20, 324, 52, 52);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "1");
			}
		});
		
		paine.add(btn2);
		btn2.setBounds(80, 324, 52, 52);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "2");
			}
		});
		
		
		paine.add(btn3);
		btn3.setBounds(140, 324, 52, 52);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "3");
			}
		});
		
		
		paine.add(btnMENOS);
		btnMENOS.setBounds(200, 324, 52, 52);
		btnMENOS.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numero1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				operacao = "subtracao";
			}
		});
		
		paine.add(btnRESULT);
		btnRESULT.setBounds(260, 324, 52, 112);
		btnRESULT.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				numero2 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				Calculos calcular = new Calculos();
				
				if(operacao == "soma"){
					txtVisor.setText("" + calcular.soma(numero1, numero2));
				} else {
					if(operacao == "divisao"){
						txtVisor.setText("" + calcular.divisao(numero1, numero2));
					} else {
						if(operacao == "multiplicacao"){
							txtVisor.setText("" + calcular.multiplicacao(numero1, numero2));
						} else {
							if(operacao == "subtracao"){
								txtVisor.setText("" + calcular.subtracao(numero1, numero2));
							} else {
								if(operacao == "porcentagem"){
									txtVisor.setText("" + calcular.porcentagem(numero1, numero2));
								}
							}
						}
					}
				}
			}
		});
		
		paine.add(btn0);
		btn0.setBounds(20, 384, 112, 52);
		btn0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "0");
			}
		});
		
		
		paine.add(btnVIRGULA);
		btnVIRGULA.setBounds(140, 384, 52, 52);
		
		paine.add(btnSOMA);
		btnSOMA.setBounds(200, 384, 52, 52);
		btnSOMA.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numero1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				operacao = "soma";
			}
		});
		
		paine.setLayout(null);// Método repsonsavel por definir o posicionamento dos objetos no layout
		this.setVisible(true);// método responsável por exibir o layout
		this.setSize(350,500);// método repsonsavel por definir o tamanho da tela
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // método responsavel por "matar" a aplicação ao clicar no X(fechar)
		
	}
	public static void main(String args[]){
		Calculadora calc = new Calculadora();// objeto responsavel por instanciar a classe calculadora
	}
}
