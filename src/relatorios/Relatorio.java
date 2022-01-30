package relatorios;

import java.util.Map;

import contas.Conta;

public class Relatorio {
	
	public String contasSaldoNegativo (Map<Integer,Conta> bancoDeDados) { // Verifica os numeros das contas
		
		String retorno = "";
		
		for (Integer key : bancoDeDados.keySet()) { // Verifica cada uma das chaves

            //Capturamos o valor a partir da chave
            Conta conta = bancoDeDados.get(key);   // Seleciona conta de acordo com as chaves
            System.out.println(key + " = " + conta);
            if(conta.getSaldo() < 0) {
            	retorno += conta + "\r\n";
            }
     }
		
		return retorno;
		
	}
	
	public String todasAsContas (Map<Integer,Conta> bancoDeDados) { // Verifica os numeros das contas
		
		String retorno = "";
		
		for (Integer key : bancoDeDados.keySet()) { // Verifica cada uma das chaves

            //Capturamos o valor a partir da chave
            Conta conta = bancoDeDados.get(key);   // Seleciona conta de acordo com as chaves
            System.out.println(key + " = " + conta);
            
            	retorno += conta + "\r\n";
            
     }
		
		return retorno;
		
	}
	
	public String todasAsContasCorrente (Map<Integer,Conta> bancoDeDados) { // Verifica os numeros das contas
		
		String retorno = "";
		
		for (Integer key : bancoDeDados.keySet()) { // Verifica cada uma das chaves

            //Capturamos o valor a partir da chave
            Conta conta = bancoDeDados.get(key);   // Seleciona conta de acordo com as chaves
            System.out.println(key + " = " + conta);
            if(conta.getTipo() == 0) {
            	retorno += conta + "\r\n";
            }
     }
		
		return retorno;
		
	}
	
	public String todasAsContasPoupanca (Map<Integer,Conta> bancoDeDados) { // Verifica os numeros das contas
		
		String retorno = "";
		
		for (Integer key : bancoDeDados.keySet()) { // Verifica cada uma das chaves

            //Capturamos o valor a partir da chave
            Conta conta = bancoDeDados.get(key);   // Seleciona conta de acordo com as chaves
            System.out.println(key + " = " + conta);
            if(conta.getTipo() == 1) {
            	retorno += conta + "\r\n";
            }
     }
		
		return retorno;
		
	}
	
	public String todasAsContasInvestimento (Map<Integer,Conta> bancoDeDados) { // Verifica os numeros das contas
		
		String retorno = "";
		
		for (Integer key : bancoDeDados.keySet()) { // Verifica cada uma das chaves

            //Capturamos o valor a partir da chave
            Conta conta = bancoDeDados.get(key);   // Seleciona conta de acordo com as chaves
            System.out.println(key + " = " + conta);
            if(conta.getTipo() == 2) {
            	retorno += conta + "\r\n";
            }
     }
		
		return retorno;
		
	}

	public Double valorInvestido (Map<Integer,Conta> bancoDeDados) { // Verifica os numeros das contas
		
		double retorno = 0;
		
		for (Integer key : bancoDeDados.keySet()) { // Verifica cada uma das chaves

            //Capturamos o valor a partir da chave
            Conta conta = bancoDeDados.get(key);   // Seleciona conta de acordo com as chaves
            System.out.println(key + " = " + conta);
            if(conta.getTipo() == 2) {
            	retorno += conta.getSaldo();
            }
     }
		
		return retorno;
		
	}
	
	public String todasAsTransacoes (Map<Integer,Conta> bancoDeDados) { // Verifica os numeros das contas
		
		String retorno = "";
		
		for (Integer key : bancoDeDados.keySet()) { // Verifica cada uma das chaves

            //Capturamos o valor a partir da chave
            Conta conta = bancoDeDados.get(key);   // Seleciona conta de acordo com as chaves
            System.out.println(key + " = " + conta);
            
            	retorno += conta + "\r\n" + conta.getExtrato() + "\r\n\r\n";
            
     }
		
		return retorno;
		
	}

}
