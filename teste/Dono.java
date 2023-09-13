package teste;

import java.util.List;

public class Dono {
	private String nome;
	private List<Animal> listaMeusAnimais;

	public Dono(String nome, List<Animal> list) {
		this.nome = nome;
		this.listaMeusAnimais = list;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Animal> getListaMeusAnimais() {
		return listaMeusAnimais;
	}

	public void setListaMeusAnimais(List<Animal> listaMeusAnimais) {
		this.listaMeusAnimais = listaMeusAnimais;
	}

}
