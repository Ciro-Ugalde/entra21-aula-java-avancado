package br.com.entra21.javaavancado.principal.aula01;

public enum PersonagemJogo {
	BARBARO(1000, "Muita Vida"), // Barbaro 0
	ANAO(500, "Ferreiro"), // Anao 1
	DRUIDA(100, "Suporte"), // Druida 2
	SACERDOTE(70, "Cura/Corre"), // Sacerdote 3
	MAGO(200, "Muita magiazinha");// Mago 4

	private final int VIDA;
	private final String DESCRICAO;

	private PersonagemJogo(int vida, String descricao) {
		this.VIDA = vida;
		this.DESCRICAO = descricao;

	}

	public int getVIDA() {
		return VIDA;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}

	public String getDetails() {
		return "Veja a descrição completa do " + this.name() + " sua vida é " + this.VIDA
				+ " e sua habilidade principal " + this.DESCRICAO;
	}

}