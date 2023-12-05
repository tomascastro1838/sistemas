import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class Calculadora extends JFrame implements ActionListener{

  
  private JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8,
 		  boton9, boton0,boton11,boton12,boton13,boton14,boton15,
                  boton16,botonac;
  private JTextField textfield1;

  public float primernumero, segundonumero;
  public String operador;


  public Calculadora(){
  setLayout(null);
  setTitle("Calculadora");


  textfield1 = new JTextField();
   textfield1.setBounds(10,10,205,35);
   add(textfield1);
   textfield1.setFont(new Font("TimesRoman", 1, 14));


   botonac = new JButton("ac");
   botonac.setBounds(228,10,60,50);
   botonac.setFont(new Font("TimesRoman", 1, 18));
   add(botonac);
   botonac.addActionListener(this);



   boton1 = new JButton("1");
   boton1.setBounds(10,70,60,60);
   boton1.setFont(new Font("TimesRoman", 1, 18)); 
   add(boton1);
   boton1.addActionListener(this);



   boton2 = new JButton("2");
   boton2.setBounds(83,70,60,60);
   boton2.setFont(new Font("TimesRoman", 1, 18));
   add(boton2);
   boton2.addActionListener(this);



   boton3 = new JButton("3");
   boton3.setBounds(153,70,60,60);
   boton3.setFont(new Font("TimesRoman", 1, 18));
   add(boton3);
   boton3.addActionListener(this);



   boton4 = new JButton("4");
   boton4.setBounds(10,140,60,60);
   boton4.setFont(new Font("TimesRoman", 1, 18));
   add(boton4);
   boton4.addActionListener(this);



   boton5 = new JButton("5");
   boton5.setBounds(83,140,60,60);
   boton5.setFont(new Font("TimesRoman", 1, 18));
   add(boton5);
   boton5.addActionListener(this);



   boton6 = new JButton("6");
   boton6.setBounds(153,140,60,60);
   boton6.setFont(new Font("TimesRoman", 1, 18));
   add(boton6);
   boton6.addActionListener(this);



   boton7 = new JButton("7");
   boton7.setBounds(10,210,60,60);
   boton7.setFont(new Font("TimesRoman", 1, 18));
   add(boton7);
   boton7.addActionListener(this);



   boton8 = new JButton("8");
   boton8.setBounds(83,210,60,60);
   boton8.setFont(new Font("TimesRoman", 1, 18));
   add(boton8);
   boton8.addActionListener(this);



   boton9 = new JButton("9");
   boton9.setBounds(153,210,60,60);
   boton9.setFont(new Font("TimesRoman", 1, 18));
   add(boton9);
   boton9.addActionListener(this);



   boton0 = new JButton("0");
   boton0.setBounds(10,280,60,60);
   boton0.setFont(new Font("TimesRoman", 1, 18));
   add(boton0);
   boton0.addActionListener(this);



   boton11 = new JButton(".");
   boton11.setBounds(83,280,60,60);
   boton11.setFont(new Font("TimesRoman", 1, 18));
   add(boton11);
   boton11.addActionListener(this);



   boton12 = new JButton("=");
   boton12.setBounds(153,280,60,60);
   boton12.setFont(new Font("TimesRoman", 1, 18));
   add(boton12);
   boton12.addActionListener(this);



   boton13 = new JButton("/");
   boton13.setBounds(225,280,60,60);
   boton13.setFont(new Font("TimesRoman", 1, 18));
   add(boton13);
   boton13.addActionListener(this);



   boton14 = new JButton("*");
   boton14.setBounds(225,210,60,60);
   boton14.setFont(new Font("TimesRoman", 1, 18));
   add(boton14);
   boton14.addActionListener(this);



   boton15 = new JButton("-");
   boton15.setBounds(225,140,60,60);
   boton15.setFont(new Font("TimesRoman", 1, 18));
   add(boton15);
   boton15.addActionListener(this);



   boton16 = new JButton("+");
   boton16.setBounds(225,70,60,60);
   boton16.setFont(new Font("TimesRoman", 1, 18));
   add(boton16);
   boton16.addActionListener(this);

 
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
    textfield1.setText(textfield1.getText() + "1");

  }

   if(e.getSource() == boton2){
    textfield1.setText(textfield1.getText() + "2");

  }

   if(e.getSource() == boton3){
    textfield1.setText(textfield1.getText() + "3");

  }

   if(e.getSource() == boton4){
    textfield1.setText(textfield1.getText() + "4");

  }

   if(e.getSource() == boton5){
    textfield1.setText(textfield1.getText() + "5");

  }

   if(e.getSource() == boton6){
    textfield1.setText(textfield1.getText() + "6");

  }

   if(e.getSource() == boton7){
    textfield1.setText(textfield1.getText() + "7");

  }

   if(e.getSource() == boton8){
    textfield1.setText(textfield1.getText() + "8");

  }

   if(e.getSource() == boton9){
    textfield1.setText(textfield1.getText() + "9");

  }

   if(e.getSource() == boton0){
    textfield1.setText(textfield1.getText() + "0");

  }

   if(e.getSource() == botonac){
    textfield1.setText("");

  }

   if(e.getSource() == boton13){
    primernumero =Float.parseFloat(textfield1.getText());
    operador = "/";
    textfield1.setText("");
    

  }

   if(e.getSource() == boton14){
    primernumero =Float.parseFloat(textfield1.getText());
    operador = "*";
    textfield1.setText("");
    

  }

   if(e.getSource() == boton15){
    primernumero =Float.parseFloat(textfield1.getText());
    operador = "-";
    textfield1.setText("");
    

  }

   if(e.getSource() == boton16){
    primernumero =Float.parseFloat(textfield1.getText());
    operador = "+";
    textfield1.setText("");
    

  }

   if(e.getSource() == boton12){
    segundonumero =Float.parseFloat(textfield1.getText());

    switch(operador){
      case"+": textfield1.setText(cero(primernumero + segundonumero));
      break;
      case"-": textfield1.setText(cero(primernumero - segundonumero));
      break;
      case"*": textfield1.setText(cero(primernumero * segundonumero));
      break;
      case"/": if(segundonumero == 0){textfield1.setText("Syntax Error");}
      else{
      textfield1.setText(cero(primernumero / segundonumero));
    } break;
   } 
  }

    if(e.getSource() == boton11){
         if(!(textfield1.getText().contains("."))){
       textfield1.setText(textfield1.getText() + ".");
   }
  }
 }

 public String cero(float resultado){
    String retorno = "";

    retorno = Float.toString(resultado);

    if(resultado%1==0){
       retorno = retorno.substring(0,retorno.length()-2);
   }
    return retorno;
  }




public static void main(String args[]){

  Calculadora calculadora1 = new Calculadora();
  calculadora1.setBounds(0,0,310,400);
  calculadora1.setVisible(true);
  calculadora1.setResizable(false);
  calculadora1.setLocationRelativeTo(null);


}

  
}