package it.polito.tdp.bar.model;

public class Evento implements Comparable<Evento>{
	
	public enum TipoEvento{
		CLIENTE_ARRIVA,
		CLIENTE_ESCE,
	}
	
	private int tempo;
	private TipoEvento tipo;
	
	public Evento(int tempo, TipoEvento tipo) {
		super();
		this.tempo = tempo;
		this.tipo = tipo;
	}

	@Override
	public int compareTo(Evento o) {
		return this.tempo-o.tempo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public TipoEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoEvento tipo) {
		this.tipo = tipo;
	}

	
}
