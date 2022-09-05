//Calcular IMC com Caixas de Diálogo - JOptionPane.
import javax.swing.JOptionPane;
class CalculoIMC
{ 
   public static void main(String args[]) 
   {
      String nome;
      float peso, altura;
      float imc;
      String classificao;
 
      nome = JOptionPane.showInputDialog("Digite seu nome:");
      peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso (kg):"));
      altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura (m):"));
      
 
      imc = (float) (peso/Math.pow(altura, 2));
 
    if (imc <= 18.5) {
      classificao = "Abaixo do Peso";
    } else if (imc >= 18.6 && imc <= 24.9) {
      classificao = "Peso ideal";
    } else if (imc >= 25 && imc <= 29.9) {
      classificao = "Levemente Acima do Peso";
    } else if (imc >= 30 && imc <= 34.9) {
      classificao = "Obesidade grau I";
    } else if (imc >= 35 && imc <= 39.9) {
      classificao = "Obesidade grau II";
    } else if (imc > 40) {
      classificao = "Obesidade III";
    } else {
      classificao = "Peso inválido";
    }
      JOptionPane.showMessageDialog(null, "O IMC de " + nome +" é de: = "+ imc +" - "+classificao);
   }
}