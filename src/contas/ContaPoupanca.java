package contas;

import java.util.Scanner;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(String nome, String cpf, double renda, double saldo, Agencia agencia, Integer tipo) {
		super(nome, cpf, renda, saldo, agencia, tipo);		
	}
	
	@Override
	public String toString() {
		return "Conta Poupanca [nome=" + this.getNome() + ", cpf=" + this.getCpf() + ", renda=" + this.getRenda() + ", saldo=" + saldo + ", agencia=" + this.getAgencia()
				+ "]";
	}
	
	
	public void investimentoPoupançca() {
		double valor, calculo, taxa, periodo;
		
		System.out.println("Qual o valor sera investido?");
		Scanner sc = new Scanner(System.in);
		valor = sc.nextDouble();
		taxa = 7 / 100;
		System.out.printf("Por quantos meses o valor ficara investido?");
		periodo = sc.nextInt();
		
		calculo = (valor * Math.pow(1 + taxa,periodo)); //mudar formula
		
		System.out.println("O montante de seu investimento sera R$ %.2f %n" + calculo); 		
	}

}
