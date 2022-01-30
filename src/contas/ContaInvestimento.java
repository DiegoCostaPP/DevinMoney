package contas;

import java.util.Scanner;

public class ContaInvestimento extends Conta {
	
	
	public ContaInvestimento(String nome, String cpf, double renda, double saldo, Agencia agencia, Integer tipo) {
		super(nome, cpf, renda, saldo, agencia, tipo);		
	}
	
	@Override
	public String toString() {
		return "Conta Investimento [nome=" + this.getNome() + ", cpf=" + this.getCpf() + ", renda=" + this.getRenda() + ", saldo=" + saldo + ", agencia=" + this.getAgencia()
				+ "]";
	}
	
	public void investimentoCdb() {
		double valor, calculo, taxa, periodo;
		
		System.out.println("Qual o valor ser� investido?");
		Scanner sc = new Scanner(System.in);
		valor = sc.nextDouble();
		taxa = 12 / 100;
		System.out.printf("Por quantos meses o valor ficar� investido?");
		periodo = sc.nextInt();
		
		calculo = (valor * Math.pow(1 + taxa,periodo)); // usado mesma formula da poupan�a variando apenas a taxa 
		
		System.out.printf("O montante de seu investimento ser� R$ %.2f %n", calculo);
		 		
	}
	
	public void investimentoFundoImoboliario() {
		double valor, calculo, taxa, periodo;
		
		System.out.println("Qual o valor ser� investido?");
		Scanner sc = new Scanner(System.in);
		valor = sc.nextDouble();
		taxa = 9 / 100;
		System.out.printf("Por quantos meses o valor ficar� investido?");
		periodo = sc.nextInt();
		
		calculo = valor * taxa * periodo; 
		
		System.out.printf("O montante de seu investimento ser� R$ %.2f %n", calculo); 		
	}
}


