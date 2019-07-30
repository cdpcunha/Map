package Entidades;

public class Voto{
	private String nome;
	private Integer qtdvotos;

	public Voto(String nome, Integer qtdvotos) {
		super();
		this.nome = nome;
		this.qtdvotos = qtdvotos;
	}

	public Integer getQtdvotos() {
		return qtdvotos;
	}

	public void addQtdVotos(Integer qtdvotos) {
		this.qtdvotos += qtdvotos;
	}

	public Voto(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Voto [nome=" + nome + ", qtdvotos=" + qtdvotos + "]";
	}

	
	
}
