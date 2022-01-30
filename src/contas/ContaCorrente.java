package contas;

import java.util.Scanner;

import contas.Conta;

public class ContaCorrente extends Conta {
	private double chequeEspecial;

	public ContaCorrente(String nome, String cpf, double renda, double saldo, Agencia agencia, double chequeEspecial, Integer tipo) {
		super(nome, cpf, renda, saldo, agencia, tipo);
		this.chequeEspecial = renda / 2;
	}

	public double getchequeEspecial() {
		return chequeEspecial;
	}

	public void setchequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	@Override
	public String toString() {
		return "ContaCorrente [chequeEspecial=" + chequeEspecial + ", Nome=" + getNome() + ", Cpf=" + getCpf()
				+ ", Renda=" + getRenda() + ", Saldo=" + getSaldo() + ", Agencia=" + getAgencia() + "]";
	}
	
	@Override
	public void saque(double saque1) {
		
		
		if (saque1 < this.getSaldo()) {
			this.setSaldo( this.getSaldo()- saque1);
			this.setExtrato("Saque realizado no valor de - R$" + saque1);
		}else if (saque1 < this.getSaldo() + this.getchequeEspecial()){
			this.setSaldo( ((this.getSaldo() + this.getchequeEspecial())- saque1) * -1);
			this.setchequeEspecial(this.getchequeEspecial() - saque1);
			this.setExtrato("Saque realizado no valor de - R$" + saque1);
			System.out.println("Seu saldo em conta é R$ " + this.getSaldo());
			System.out.println("Seu seu cheque especial é R$ " + this.chequeEspecial);
			
		}else {
			System.out.println("Saldo insuficiente");
		}
	}

	
	
}	