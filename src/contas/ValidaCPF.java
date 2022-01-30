package contas;

import java.util.Scanner;

public class ValidaCPF {

	private Scanner variavel = new Scanner(System.in);
	private String cpf_correto = "";
	private String cpf_recebido = "";
	private int soma = 0;
	private int digito1 = 0;
	private int digito2 = 0;

 public void Cpf() {
  
 }

	public void recebe_cpf(String cpf) {
		//System.out.println("Digite seu CPF (apenas numeros) ");
		cpf_recebido = cpf; //variavel.nextLine(); "03786312314";
		calc_first_digito();
		calc_second_digito();
	}

	public void calc_first_digito() {
		int i = 0, j = 10;
		
		while (i<9) {
			soma += (Integer.parseInt((cpf_recebido.charAt(i) + "")) *j);
			i++;
			j--;
		}
		
		digito1 = soma % 11;
		digito1 = 11 -digito1;
		if (digito1 >9) {
			digito1 = 0;
		}
		
		cpf_correto += cpf_recebido.substring(0,9) + digito1;
		
	}

	public void calc_second_digito() {
		soma = 0;
		int i = 0, j = 11;
		
		while (i<10) {
			soma += (Integer.parseInt((cpf_correto.charAt(i)) + "") * j);
			i++;
			j--;
		}
		
		digito2 = soma % 11;
		digito2 = 11 -digito2;
		if (digito2 >9) {
			digito2 = 0;
		}
		
		cpf_correto += digito2;
		
	}
	public String apresenta_cpf_correto() {
		if(cpf_recebido.equals(cpf_correto)) {
			return "CPF digitado é valido ";
			
		}else {
			
			return cpf_correto;
		}
		
	}

	public String getCpf_correto() {
		return cpf_correto;
	}

	public void setCpf_correto(String cpf_correto) {
		this.cpf_correto = cpf_correto;
	}
	
}



