package Model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Leilao {
	
	private String nome;
	private Double valorInicial = 0.0;
	private Usuario usuario;
	private Calendar dataAbertura;
	private boolean usado;
	
	private List<Lance> lances;
	
	public Leilao(String nome) {
		this.nome = nome;
		lances = new ArrayList<Lance>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(Double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}

	public List<Lance> getLances() {
		return lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}
	
	public void propoe(Lance lance) {
		lances.add(lance);
	}
	

}
