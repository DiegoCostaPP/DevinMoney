package testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import contas.Agencia;
import contas.Conta;
import contas.ContaCorrente;
import contas.ContaInvestimento;
import contas.ContaPoupanca;
import contas.ValidaCPF;
import relatorios.Relatorio;

public class Programa {
	
	public static String getWeek(LocalDateTime date){ // Função para interpretação do dia da semana encontrada internet para auxilio
	    String diaSemana = "---";
	    GregorianCalendar gc = new GregorianCalendar(); //Estancia o calendario
	    try {
	        gc.setTime(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS").parse(date.toString())); //Transforma texto em date time
	        switch (gc.get(Calendar.DAY_OF_WEEK)) { //Verifica cada dia da semana e eetorna o dia da semana
	            case Calendar.SUNDAY: 
	                diaSemana = "DOM"; 
	                break;
	            case Calendar.MONDAY:
	                diaSemana = "SEG";
	                break;
	            case Calendar.TUESDAY:
	                diaSemana = "TER";
	            break;
	            case Calendar.WEDNESDAY:
	                diaSemana = "QUA";
	                break;
	            case Calendar.THURSDAY:
	                diaSemana = "QUI";
	                break;
	            case Calendar.FRIDAY:
	                diaSemana = "SEX";
	                break;
	            case Calendar.SATURDAY:
	                diaSemana = "SAB";

	        }
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	    return diaSemana;
	}
	
	public static String validaNome () {
		Scanner sc = new Scanner(System.in);
		String nome = null;
		
		//System.out.println("Digite seu nome");
		
		Pattern pattern = Pattern.compile("[^a-zA-Z ]");
		
		while(true) {
			//System.out.println("Digite seu nome de forma correta");
			nome = sc.next();
			Matcher match = pattern.matcher(nome);
			
			if(match.find()) { 
				System.out.println("Seu nome contem numero ou caractere especial");
				System.out.println("Digite seu nome novamente sem numero ou caractere especial");
			}
			else {
				return nome;
			}
			
		}
		
	}
	
	public static Double numeroDouble () {
		
		double renda = 0;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		boolean a =true;
				
		while(a == true) {
			try {
			 
				renda = sc.nextDouble();
				a = false;
				return renda;
				
			} catch(InputMismatchException e) {
				System.out.println("Você digitou com . no lugar da virgula, ou digitou alugma letra");
				System.out.println("Digite sua renda conforme exemplo (ex: 1.245,36  ou 1245,36)");
				renda = sc2.nextDouble();
				a = false;
				return renda;
			}
		}	
		return renda;
	}
	
	public static int numeroInt () {
		
		int selecao2 = 0;
		//System.out.println("Digite sua renda (ex: 1.245,36  ou 1245,36)");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		boolean a =true;
		//System.out.println("Digite sua renda (ex: 1.245,36  ou 1245,36)");
		//renda = sc.nextDouble();
		
		while(a == true) {
				
			try {
				if(a == true) { 
				System.out.println("Digite numero conforme exemplo (ex.: 1)");
				selecao2 = sc.nextInt();
				a = false;
				}
				
			} catch(InputMismatchException e) {
				System.out.println("Você digitou com (. ou ,), ou digitou alugma letra");
				System.out.println("Digite numero conforme exemplo (ex.: 1)");
				selecao2 = sc2.nextInt();
				a = false;
				return selecao2;
			}
		}	
		return selecao2;
	}
	
	public static int numeroInt1a2 () {
		
		int selecao2 = 0;
		//System.out.println("Digite sua renda (ex: 1.245,36  ou 1245,36)");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		boolean a =true;
		//System.out.println("Digite sua renda (ex: 1.245,36  ou 1245,36)");
		//renda = sc.nextDouble();
		
		while(a == true) {
				
			try {
				 
				System.out.println("Digite sua escolha (ex.: 1)");
				selecao2 = sc.nextInt();
				a = false;
				if(selecao2 > 2) {
					while (selecao2 > 2) {
						System.out.println("Escolha uma opçcão entre 1 e 2");
						selecao2 = sc2.nextInt();
					}
					
				}
				
			} catch(InputMismatchException e) {
				System.out.println("Você digitou com (. ou ,), ou digitou alugma letra");
				System.out.println("Escolha uma opçcão entre 1 e 2");
				System.out.println("Digite sua renda conforme exemplo (ex: 1)");
				selecao2 = sc2.nextInt();
				
				return selecao2;
			}
		}	
		return selecao2;
	}
	
	public static int numeroInt1a4 () {
		
		int selecao2 = 0;
		//System.out.println("Digite sua renda (ex: 1.245,36  ou 1245,36)");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		boolean a =true;
		//System.out.println("Digite sua renda (ex: 1.245,36  ou 1245,36)");
		//renda = sc.nextDouble();
		
		while(a == true) {
				
			try {
				 
				System.out.println("Digite sua escolha (ex.: 1)");
				selecao2 = sc.nextInt();
				a = false;
				if(selecao2 > 4) {
					while (selecao2 > 4) {
						System.out.println("Escolha uma opçcão entre 1 e 4");
						selecao2 = sc2.nextInt();
					}
					
				}
				
			} catch(InputMismatchException e) {
				System.out.println("Você digitou com (. ou ,), ou digitou alugma letra");
				System.out.println("Escolha uma opçcão entre 1 e 4");
				System.out.println("Digite sua renda conforme exemplo (ex: 1)");
				selecao2 = sc2.nextInt();
				
				return selecao2;
			}
		}	
		return selecao2;
	}
	
	public static int numeroInt1a7 () {
		
		int selecao2 = 0;
		//System.out.println("Digite sua renda (ex: 1.245,36  ou 1245,36)");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		boolean a =true;
		//System.out.println("Digite sua renda (ex: 1.245,36  ou 1245,36)");
		//renda = sc.nextDouble();
		
		while(a == true) {
				
			try {
				 
				System.out.println("Digite sua escolha (ex.: 1)");
				selecao2 = sc.nextInt();
				a = false;
				if(selecao2 > 7) {
					while (selecao2 > 7) {
						System.out.println("Escolha uma opçcão entre 1 e 7");
						selecao2 = sc2.nextInt();
					}
				}
			} catch(InputMismatchException e) {
				System.out.println("Você digitou com (. ou ,) no lugar da virgula, ou digitou alugma letra");
				System.out.println("Escolha uma opçcão entre 1 e 7");
				System.out.println("Digite sua renda conforme exemplo (ex: 1)");
				selecao2 = sc2.nextInt();
				a = false;
				return selecao2;
			}
		}	
		return selecao2;
	}
	
	public static int numeroInt1a8 () {
		
		int selecao2 = 0;
		//System.out.println("Digite sua renda (ex: 1.245,36  ou 1245,36)");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		boolean a =true;
		//System.out.println("Digite sua renda (ex: 1.245,36  ou 1245,36)");
		//renda = sc.nextDouble();
		
		while(a == true) {
				
			try {
				 
				System.out.println("Digite sua escolha (ex.: 1)");
				selecao2 = sc.nextInt();
				a = false;
				if(selecao2 > 8) {
					while (selecao2 > 8) {
						System.out.println("Escolha uma opçcão entre 1 e 8");
						selecao2 = sc2.nextInt();
					}
				}
			} catch(InputMismatchException e) {
				System.out.println("Você digitou com (. ou ,) no lugar da virgula, ou digitou alugma letra");
				System.out.println("Escolha uma opçcão entre 1 e 8");
				System.out.println("Digite sua renda conforme exemplo (ex: 1)");
				selecao2 = sc2.nextInt();
				a = false;
				return selecao2;
			}
		}	
		return selecao2;
	}
	
public static int numeroInt1a9 () {
		
		int selecao2 = 0;
		//System.out.println("Digite sua renda (ex: 1.245,36  ou 1245,36)");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		boolean a =true;
		//System.out.println("Digite sua renda (ex: 1.245,36  ou 1245,36)");
		//renda = sc.nextDouble();
		
		while(a == true) {
				
			try {
				 
				System.out.println("Digite sua escolha (ex.: 1)");
				selecao2 = sc.nextInt();
				a = false;
				if(selecao2 > 9) {
					while (selecao2 > 9) {
						System.out.println("Escolha uma opçcão entre 1 e 9");
						selecao2 = sc2.nextInt();
					}
				}
			} catch(InputMismatchException e) {
				System.out.println("Você digitou com (. ou ,) no lugar da virgula, ou digitou alugma letra");
				System.out.println("Escolha uma opçcão entre 1 e 9");
				System.out.println("Digite sua renda conforme exemplo (ex: 1)");
				selecao2 = sc2.nextInt();
				a = false;
				return selecao2;
			}
		}	
		return selecao2;
	}
	
	public static void main(String[] args) { 

		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r\n"); // Linha para tratativa de espaço dentro de uma string
		Integer controle = 1;
		Map<Integer,Conta> bancoDeDados = new HashMap<>();
		boolean sair = false;
		boolean entrar = true;
				
		while (entrar) {
					
		LocalDate localDate = LocalDate.now();
		System.out.println("Bem vindo! O que deseja fazer hoje?");
		System.out.println("Digite 1 para abrir conta");
		System.out.println("Digite 2 para acessar sua conta");
		System.out.println("Digite 3 para acessar sistema do banco gerar relatorios");		
		System.out.println("Digite 4 para sair do sistema");

		int opcao = numeroInt1a4();
		
		switch (opcao) {
		case 1:
			System.out.println("Qual tipo de conta deseja abrir?");
			System.out.println("Digite 1 para Conta Corrente");
			System.out.println("Digite 2 para Conta Poupança");
			System.out.println("Digite 3 para Conta Investimento");
			System.out.println("Digite 4 para sair");
			
			int opcao2 = numeroInt1a4();

			switch (opcao2) {
			case 1:
				System.out.println("Otimó! Vamos abrir uma  Conta Corrente");
				System.out.println("Digite seu nome completo");
				String nome = validaNome();
				System.out.println("Digite sua renda mensal");
				double renda = numeroDouble();
				double saldo = 0;
				double chequeEspecial = renda / 2;
				
				System.out.println("Digite qual sua agência de preferência: 001 para Florianópolis ou 002 para São José");
				int ag = numeroInt1a2();
				
				Agencia agencia;
				if(ag == 2) {
				
					agencia = Agencia.SAOJOSE;
					
				}else if( ag == 1) {
				
					agencia = Agencia.FLORIANOPOLIS;
				}else {
					System.out.println("Agência invalida");
				}
				
				System.out.println("Digite seu CPF somente numeros(ex: 12345678912)");
				String cpf = sc.next();
				ValidaCPF valida = new ValidaCPF();
				valida.recebe_cpf(cpf);
				valida.apresenta_cpf_correto();

				boolean cpfCorreto = (cpf.equals(valida.getCpf_correto()));
				
				if(cpfCorreto) {
					ContaCorrente contaCorrente = new ContaCorrente(nome, cpf, renda, saldo, ag==2?Agencia.SAOJOSE:Agencia.FLORIANOPOLIS, chequeEspecial, 0);
					
					bancoDeDados.put(controle, contaCorrente);
					contaCorrente.setConta(controle);
					controle++;
					System.out.println(contaCorrente.getConta());
					System.out.println("O número da sua conta Corrente é  " + contaCorrente.getConta());
					bancoDeDados.forEach((key, value) -> System.out.println(key + ":" + value));// https://stackoverflow.com/questions/36782231/printing-a-java-map-mapstring-object-how. Está linha foi retirada deste link para auxiliar no projeto.
				}else {
					System.out.println("Conta não foi criada CPF não é valido");
					valida.recebe_cpf(cpf);
				}
				
				break;
			
			case 2:
				System.out.println("Otimó! Vamos abrir uma  Conta Poupança");
				System.out.println("Digite seu nome completo");
				String nome1 = validaNome();
				System.out.println("Digite sua renda mensal");
				double renda1 = numeroDouble();
				System.out.println("Digite qual sua agência de preferência: 001 para Florianópolis ou 002 para São José");
				Agencia agencia1;
				int ag1 = numeroInt1a2();
				if(ag1 == 2) {
					agencia1 = Agencia.SAOJOSE;
				}else if( ag1 == 1) {
					 agencia1 = Agencia.FLORIANOPOLIS;
				}else {
					System.out.println("Agência invalida");
				}
				
				double saldo1 = 0.00;
				System.out.println("Digite seu CPF somente numeros(ex: 12345678912)");
				String cpf1 = sc.next();
				ValidaCPF valida2 = new ValidaCPF();
				valida2.recebe_cpf(cpf1);
				valida2.apresenta_cpf_correto();
				
				boolean cpfCorreto2 = (cpf1.equals(valida2.getCpf_correto()));
				
				if(cpfCorreto2) {
					ContaPoupanca conta1 = new ContaPoupanca(nome1, cpf1, renda1, saldo1, ag1==2?Agencia.SAOJOSE:Agencia.FLORIANOPOLIS, 1);
					
					bancoDeDados.put(controle, conta1);
					conta1.setConta(controle);
					controle++;
					System.out.println(conta1.getConta());
					System.out.println("O número da sua conta Poupança é  " + conta1.getConta());
					bancoDeDados.forEach((key, value) -> System.out.println(key + ":" + value));
				}else {
					System.out.println("Conta não foi criada CPF não é valido");//teste
					valida2.recebe_cpf(cpf1);
				}
				
				break;
			case 3:
				System.out.println("Otimó! Vamos abrir uma  Conta Investimento");
				System.out.println("Digite seu nome completo");
				String nome2 = validaNome();
				System.out.println("Digite sua renda mensal");
				double renda2 = numeroDouble();
				System.out.println("Digite qual sua agência de preferência: 001 para Florianópolis ou 002 para São José");
				Agencia agencia2;
				int ag2 = numeroInt1a2();
				if(ag2 == 002) {
					agencia2 = Agencia.SAOJOSE;
				}else if( ag2 == 001) {
					agencia2 = Agencia.FLORIANOPOLIS;
				}else {
					System.out.println("Agência invalida");
				}							
				double saldo2 = 0.00;
				System.out.println("Digite seu CPF somente numeros(ex: 12345678912)");
				String cpf2 = sc.next();
				ValidaCPF valida3 = new ValidaCPF();
				valida3.recebe_cpf(cpf2);
				valida3.apresenta_cpf_correto();

				boolean cpfCorreto3 = (cpf2.equals(valida3.getCpf_correto()));
				
				if(cpfCorreto3) {
					ContaInvestimento conta2 = new ContaInvestimento(nome2, cpf2, renda2, saldo2, ag2==2?Agencia.SAOJOSE:Agencia.FLORIANOPOLIS, 2);
					
					bancoDeDados.put(controle, conta2);
					conta2.setConta(controle);
					controle++;
					System.out.println(conta2.getConta());
					System.out.println("O número da sua conta Investimento é  " + conta2.getConta());
					bancoDeDados.forEach((key,value) -> System.out.println(value));
				}else {
					System.out.println("Conta não foi criada CPF não é valido");
					valida3.recebe_cpf(cpf2);
				}
				break;
			case 4:
				break;
		}
		break;
		case 2:
			//String cpfin;
			int tipoConta, contaAcesso/* ContaMetodos = 0 */;
			System.out.println("Qual é seu tipo de conta?");
			System.out.println("Digite 1 para Conta Corrente");
			System.out.println("Digite 2 para Conta Poupança");
			System.out.println("Digite 3 para Conta Investimento");
			System.out.println("Digite 4 para sair");
			tipoConta = numeroInt1a4();
			
			switch (tipoConta) {
			case 1:
				System.out.println("Obrigado por acessar sua Conta Corrente");
				System.out.println("Qual é o numero da sua conta?");
				contaAcesso = numeroInt();
				/*contaMetodos = contaAcesso*/
				Conta conta;
				if (bancoDeDados.containsKey(contaAcesso)) {
					System.out.println("Conta existe");
					conta = bancoDeDados.get(contaAcesso);			// Valida numero da conta digitada
				//for (Map.Entry<Integer, Conta> ls:bancoDeDados.entrySet()) { // Valida numero da conta digitada
					System.out.println(conta);
				    //if(conta == contaAcesso) {
				    	System.out.println("Olá senhor(a)  " + conta.getNome());
				    	int atividade;
						System.out.println("O que você deseja realizar?");
						System.out.println("Digite 1 para saque");
						System.out.println("Digite 2 para depósito");
						System.out.println("Digite 3 para saber saldo");
						System.out.println("Digite 4 para verificar extrato");
						System.out.println("Digite 5 para transferncia");
						System.out.println("Digite 6 para alterar dados cadastrais");
						System.out.println("Digite 7 para sair");
						
						atividade = numeroInt1a7();
					
						switch (atividade) {
							case 1:
								System.out.println("Qual o valor de saque desejado?");
								double saque = numeroDouble();
								conta.saque(saque);																
								break;
							case 2:
								System.out.println("Qual o valor de deposito desejado?");
								double deposito = numeroDouble();
								conta.deposito(deposito);
								System.out.printf("Deposito realizado no valor R$ %.2f %n", deposito);
								System.out.printf("Seu saldo é de %.2f %n", conta.getSaldo() );
								break;
							case 3:
								conta.verifica_saldo();
								break;
							case 4:
								System.out.println("Extrato da conta \r\n\r\n" + conta.getExtrato());
								//conta.extrato();
								break;
							case 5:
								//Scanner sc = new Scanner(System.in);
								if ((getWeek(java.time.LocalDateTime.now()) == "DOM")||(getWeek(java.time.LocalDateTime.now()) == "SAB")) { //impede que transferencia seja feita aos finais e semana
									int contaRetirada, contaDestino;															
									System.out.println("Qual o valor desejado para transfrência?");
									double transferencia = numeroDouble();
									System.out.println("Qual a conta de destino da transfrência? ");
									contaDestino = numeroInt();
									if (transferencia < conta.getSaldo()) {
										if (bancoDeDados.containsKey(contaDestino)) { // valida conta de destino
											System.out.println("Conta existe");
											
										Conta conta2 = bancoDeDados.get(contaDestino);
										conta.saque(transferencia);
										conta2.deposito(transferencia);
										conta.setExtrato("Transferencia realizada para conta " + contaDestino + " no valor " + transferencia);
										conta2.setExtrato("Transferencia recebida na conta " + contaDestino + " no valor " + transferencia);
										}
									}
								}else {
									System.out.println("Transfrencia disponíveis em apenas dias uteis (seg a sex)");
								}
								break;
							case 6:
								System.out.println("Digite seu nome completo");
								String nome2 = validaNome();
								System.out.println("Digite sua renda mensal");
								double renda2 = numeroDouble();
								conta.setNome(nome2);
								conta.setRenda(renda2);
								break;
							case 7:
								System.out.println("Até mais, volte sempre");
								break;
						}
				    //}else {
				    //	System.out.println("Está conta não existe");
				   // }
				}													
				break;
			case 2:
				System.out.println("Obrigado por acessar sua Conta Poupança");
				System.out.println("Qual é o numero da sua conta?");
				contaAcesso = numeroInt();
				/*contaMetodos = contaAcesso*/
				Conta conta1;
				if (bancoDeDados.containsKey(contaAcesso)) {
					System.out.println("Conta existe");
					conta1 = bancoDeDados.get(contaAcesso);			// Valida numero da conta digitada
				//for (Map.Entry<Integer, Conta> ls:bancoDeDados.entrySet()) { // Valida numero da conta digitada
					System.out.println(conta1);
				    //if(conta == contaAcesso) {
				    	System.out.println("Olá senhor(a)  " + conta1.getNome());
				    	int atividade;
						System.out.println("O que você deseja realizar?");
						System.out.println("Digite 1 para saque");
						System.out.println("Digite 2 para depósito");
						System.out.println("Digite 3 para saber saldo");
						System.out.println("Digite 4 para verificar extrato");
						System.out.println("Digite 5 para transferncia");
						System.out.println("Digite 6 para alterar dados cadastrais");
						System.out.println("Digite 7 para sair");
						
						atividade = numeroInt1a7();
						
						switch (atividade) {
							case 1:
								System.out.println("Qual o valor de saque desejado?");
								double saque = numeroDouble();
								conta1.saque(saque);						
								break;
							case 2:
								System.out.println("Qual o valor de deposito desejado?");
								double deposito = numeroDouble();
								conta1.deposito(deposito);
								System.out.printf("Deposito realizado no valor R$ %.2f %n", deposito);
								System.out.printf("Seu saldo é de %.2f %n", conta1.getSaldo() );
								break;
							case 3:
								conta1.verifica_saldo();
								break;
							case 4:
								System.out.println("Extrato da conta \r\n\r\n" + conta1.getExtrato());
								//conta.extrato();
								break;
							case 5:
								//Scanner sc = new Scanner(System.in);
								if ((getWeek(java.time.LocalDateTime.now()) == "DOM")||(getWeek(java.time.LocalDateTime.now()) == "SAB")) {
									int contaRetirada, contaDestino;															
									System.out.println("Qual o valor desejado para transfrência?");
									double transferencia = numeroDouble();
									System.out.println("Qual a conta de destino da transfrência? ");
									contaDestino = numeroInt();
									if (transferencia < conta1.getSaldo()) {
										if (bancoDeDados.containsKey(contaDestino)) {
											System.out.println("Conta existe");
											
										Conta conta4 = bancoDeDados.get(contaDestino);
										conta1.saque(transferencia);
										conta4.deposito(transferencia);
										conta1.setExtrato("Transferencia realizada para conta " + contaDestino + " no valor " + transferencia);
										conta4.setExtrato("Transferencia recebida na conta " + contaDestino + " no valor " + transferencia);
										}
									}
								}else {
									System.out.println("Transfrencia disponíveis em apenas dias uteis (seg a sex)");
								}
								break;
							case 6:
								System.out.println("Digite seu nome completo");
								String nome2 = validaNome();
								System.out.println("Digite sua renda mensal");
								double renda2 = numeroDouble();
								conta1.setNome(nome2);
								conta1.setRenda(renda2);
								break;
							case 7:
								System.out.println("Até mais, volte sempre");
								break;
						}
				    //}else {
				    //	System.out.println("Está conta não existe");
				   // }
				}													
				break;
			case 3:
				System.out.println("Obrigado por acessar sua Conta Investimento");
				System.out.println("Qual é o numero da sua conta?");
				contaAcesso = numeroInt();
				/*contaMetodos = contaAcesso*/
				Conta conta3;
				if (bancoDeDados.containsKey(contaAcesso)) {
					System.out.println("Conta existe");
					conta3 = bancoDeDados.get(contaAcesso);			// Valida numero da conta digitada
				//for (Map.Entry<Integer, Conta> ls:bancoDeDados.entrySet()) { // Valida numero da conta digitada
					System.out.println(conta3);
				    //if(conta == contaAcesso) {
				    	System.out.println("Olá senhor(a)  " + conta3.getNome());
				    	int atividade;
						System.out.println("O que você deseja realizar?");
						System.out.println("Digite 1 para saque");
						System.out.println("Digite 2 para depósito");
						System.out.println("Digite 3 para saber saldo");
						System.out.println("Digite 4 para verificar extrato");
						System.out.println("Digite 5 para transferncia");
						System.out.println("Digite 6 para alterar dados cadastrais");
						System.out.println("Digite 7 para simulacao investimento CDB");
						System.out.println("Digite 8 para simulacao investimento Fundo Imobliário");
						System.out.println("Digite 9 para sair");
						
						atividade = numeroInt1a9();
						
						switch (atividade) {
							case 1:
								System.out.println("Qual o valor de saque desejado?");
								double saque = numeroDouble();
								conta3.saque(saque);						
								break;
							case 2:
								System.out.println("Qual o valor de deposito desejado?");
								double deposito = numeroDouble();
								conta3.deposito(deposito);
								System.out.printf("Deposito realizado no valor R$ %.2f %n", deposito);
								System.out.printf("Seu saldo é de %.2f %n", conta3.getSaldo() );
								break;
							case 3:
								conta3.verifica_saldo();
								break;
							case 4:
								System.out.println("Extrato da conta \r\n\r\n" + conta3.getExtrato());
								//conta.extrato();
								break;
							case 5:
								//Scanner sc = new Scanner(System.in);
								if ((getWeek(java.time.LocalDateTime.now()) == "DOM")||(getWeek(java.time.LocalDateTime.now()) == "SAB")) {
									int contaRetirada, contaDestino;															
									System.out.println("Qual o valor desejado para transfrência?");
									double transferencia = numeroDouble();
									System.out.println("Qual a conta de destino da transfrência? ");
									contaDestino = numeroInt();
									if (transferencia < conta3.getSaldo()) {
										if (bancoDeDados.containsKey(contaDestino)) {
											System.out.println("Conta existe");
											
										Conta conta6 = bancoDeDados.get(contaDestino);
										conta3.saque(transferencia);
										conta6.deposito(transferencia);
										conta3.setExtrato("Transferencia realizada para conta " + contaDestino + " no valor " + transferencia);
										conta6.setExtrato("Transferencia recebida na conta " + contaDestino + " no valor " + transferencia);
										}
									}
								}else {
									System.out.println("Transfrencia disponíveis em apenas dias uteis (seg a sex)");
								}
								break;
							case 6:
								System.out.println("Digite seu nome completo");
								String nome2 = validaNome();
								System.out.println("Digite sua renda mensal");
								double renda2 = numeroDouble();
								conta3.setNome(nome2);
								conta3.setRenda(renda2);
								break;
							case 7:
								//conta.saque(saque);
								conta3.investimentoCdb();
								break;
							case 8 :
								conta3.investimentoFundoImoboliario();
								break;
							case 9 :
								System.out.println("Até mais, volte sempre");
								break;
							
						}
				    //}else {
				    //	System.out.println("Está conta não existe");
				   // }
				}
				break;
			case 4:
				break;
			
			//System.out.println("Bem vindo a sua conta " + Conta.class);
			}
		break;
		case 3:
			System.out.println("O que você deseja realizar?");
			System.out.println("Digite 1 para listar todas as contas");
			System.out.println("Digite 2 para listar todas as contas correntes");
			System.out.println("Digite 3 para listar todas as contas poupanca");
			System.out.println("Digite 4 para listar todas as contas investimento");
			System.out.println("Digite 5 para listar todas as contas com sal negativo");
			System.out.println("Digite 6 para verificar total investido ");
			System.out.println("Digite 7 transacao de cliente");
			System.out.println("Digite 8 para sair");
			
			int escolha = numeroInt1a8();
			
			Relatorio r = new Relatorio(); // estancia r para aceso as relatorios do banco
			
			switch(escolha) {
				case 1:
					
					System.out.println(r.todasAsContas(bancoDeDados));
					break;
				case 2:
					
					System.out.println(r.todasAsContasCorrente(bancoDeDados));
					break;
				case 3:
					
					System.out.println(r.todasAsContasPoupanca(bancoDeDados));
					break;
				case 4:
					
					System.out.println(r.todasAsContasInvestimento(bancoDeDados));
					break;
				case 5:
					
					System.out.println(r.contasSaldoNegativo(bancoDeDados));
					break;
				case 6:
					
					System.out.println(r.valorInvestido(bancoDeDados));
					break;
				case 7:
					
					System.out.println(r.todasAsTransacoes(bancoDeDados));
					break;
				case 8:
									
					break;
				
			}
			
			break;
	
		case 4:
			entrar = false;
			sair = true;			
			break;
		
	}	
	
			
}while(! sair);
}
}
