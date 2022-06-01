package br.com.entra21.javaavancado.principal;

import java.util.Scanner;

import br.com.entra21.javaavancado.principal.aula01.PersonagemJogo;

public class Main {

	static Scanner input = new Scanner(System.in);

	public enum DiasSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
	}

	public static void main(String[] args) {

		byte option;

		do {

			System.out.println(exibirMenu());
			option = input.nextByte();

			switch (option) {
			case 0:

				System.out.println("Saindo");

				break;
			case 1:

				aprenderWrapper();
				// aprenderWrapper
				break;
			case 2:
				aprenderEnum();
				// aprenderENUM

				break;

			default:
				System.out.println("Opção Inválida!");
				break;
			}

		} while (option != 0);

	}

	private static String exibirMenu() {

		String menu = "Vamos aprender sobre conceitos avançados em JAVA!";
		menu += "\n0 - Sair";
		menu += "\n1- Wrapper";
		menu += "\n2 - ENUM";
		menu += "\nEscolha uma das Opções";

		return menu;
	}

	private static void aprenderWrapper() { // Converter valores em tipos primitivos

		char letra = Character.valueOf('C');
		boolean verdade = Boolean.parseBoolean("TRUE");
		boolean verdade1 = Boolean.parseBoolean("tRue");
		boolean verdade2 = Boolean.parseBoolean("true");
		boolean falso = Boolean.parseBoolean("t");

		byte inteiroUm = Byte.parseByte("127");
		short inteiroDois = Short.parseShort("128");
		int inteiroTres = Integer.parseInt("5000");
		long inteiroQuatro = Long.parseLong("150000");

		float decimalUm = Float.parseFloat("145000.25");
		double decimalDois = Double.parseDouble("18000.75");

	}

	private static void aprenderEnum() {

		System.out.println("Testando Enum: " + DiasSemana.TERCA);
		boolean hoje = DiasSemana.DOMINGO == DiasSemana.SEGUNDA;
		System.out.println(hoje ? "Sim" : "Não");

		for (int dia = 0; dia < DiasSemana.values().length; dia++) {
			System.out.println((dia + 1) + " - " + DiasSemana.values()[dia]);
		}

		System.out.println("Gosto desse tipo de personagem: " + PersonagemJogo.BARBARO);
		System.out.println("Geralmente a classe: " + PersonagemJogo.BARBARO + " tem muita VIDA = " + PersonagemJogo.BARBARO.getVIDA());
		System.out.println("A caracteristica mais comum dele é: " + PersonagemJogo.BARBARO.getDESCRICAO());
		System.out.println("O mago esta no indice do enum " + PersonagemJogo.MAGO.ordinal());
		System.out.println("Veja a descrição completa do " + PersonagemJogo.MAGO + " sua vida é " + PersonagemJogo.MAGO.getVIDA() + " e sua habilidade principal " + PersonagemJogo.MAGO.getDESCRICAO());
		System.out.println(PersonagemJogo.ANAO.getDetails());

		for (int Personagem = 0; Personagem < PersonagemJogo.values().length; Personagem++) {

			System.out.println("Contador = " + Personagem + "posicao do Enum = " + PersonagemJogo.values()[Personagem].ordinal());
			System.out.println("O personagem " + PersonagemJogo.values()[Personagem].name());
			System.out.println(PersonagemJogo.values()[Personagem].getVIDA());
			System.out.println(PersonagemJogo.values()[Personagem].getDESCRICAO());
			System.out.println("==========================================================");
		}

		for (PersonagemJogo variavel : PersonagemJogo.values()) {
			;// for de iteração, vai um por um dos itens
			System.out.println(variavel.getDetails());
		}
	}
}
