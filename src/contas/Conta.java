package contas;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Stack;

public abstract class Conta {
	private String nome;
	private String cpf = null;
	private double renda;
	protected static Integer contaNumero;
	protected double saldo = 0;
	private String extrato = "";
	private Integer tipo = 0;

	private Agencia agencia;

//Construtor de contas
	public Conta(String nome, String cpf, double renda, double saldo, Agencia agencia, Integer tipo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.renda = renda;
		this.saldo = saldo;
		this.agencia = agencia;
		this.tipo = tipo;
		
	}
	
	public Integer getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public static int getConta() {
		return contaNumero;
	}

	public static void setConta(int conta) {
		Conta.contaNumero = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", cpf=" + cpf + ", renda=" + renda + ", saldo=" + saldo + ", agencia=" + agencia
				+ "]";
	}
	
	public String getExtrato()  {
		return extrato;
	}
	
	public void setExtrato(String evento)  {
		extrato += java.time.LocalDateTime.now() + " - " + evento + "\r\n";
	}
	
	public void saque(double saque) {
		
		if (saque < this.getSaldo()) {
			this.setSaldo( this.getSaldo()- saque);
			
			this.extrato += (java.time.LocalDateTime.now() + " - Saque realizado no valor de " + saque + "\r\n"); // java.time.LocalDateTime.now() função para definir data e hora
		} else {
			System.out.println("Seu saldo é insuficiente, sauqe não realizado");
		}
	}
		
	public void deposito(double deposito) {
				
		this.saldo += deposito;
		this.extrato += (java.time.LocalDateTime.now() + " - Deposito realizado no valor de " + deposito + "\r\n");
		
	}
	
	public void verifica_saldo() {
				
		System.out.printf("O valor de seu saldo e R$ %.2f %n", this.getSaldo());
	}
	public void contaCorrente() {
		// TODO Auto-generated method stub
		
	}

	
	
}
