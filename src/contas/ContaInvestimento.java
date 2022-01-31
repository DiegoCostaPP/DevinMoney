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
	
	@Override
	public void investimentoCdb() {
		double valor, taxa, periodo;
		double calculo2 = 0;
		
		System.out.println("Qual o valor será investido no CDB?");
		Scanner sc = new Scanner(System.in);
		valor = sc.nextDouble();
		taxa = 12 / 100;
		System.out.printf("Por quantos meses o valor ficará investido?");
		periodo = sc.nextInt();
		
		calculo2 += valor + taxa + 2 / periodo; // usado mesma formula da poupança variando apenas a taxa 
		
		System.out.printf("O montante de seu investimento será R$ %.2f %n", + calculo2);
		 		
	}
	
	@Override
	public void investimentoFundoImoboliario() {
		double valor, taxa, periodo;
		double calculo = 0;
		
		System.out.println("Qual o valor será investido no Fundo Imoboliario?");
		Scanner sc = new Scanner(System.in);
		valor = sc.nextDouble();
		taxa = 9 / 100;
		System.out.printf("Por quantos meses o valor ficará investido?");
		periodo = sc.nextInt();
		
		calculo += (valor * (taxa * 3) * periodo); 
		
		System.out.printf("O montante de seu investimento será R$ %.2f %n", calculo); 		
	}
}


