package it.polito.tdp.bar.model;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

import it.polito.tdp.bar.model.Evento.TipoEvento;

public class Simulatore {
	
	private PriorityQueue <Evento> queue = new PriorityQueue<>();
	
	//STATO DEL MONDO 
	private int tavolo4;
	private int tavolo6;
	private int tavolo8;
	private int tavolo10;
	
	//PARAMETRI DI SIMULAZIONE 
	private Duration intervalloArrivoClienti;
	private List<Duration> permanenza;
	private int numClienti;
	
	//STATISRICHE RACCOLTE 
	private int numClientiTot;
	private int numClientiSoddisfatti;
	private int numClientiInsoddisfatti;
	
	private Random random = new Random();
	
	public Simulatore() {
		permanenza = new ArrayList<Duration>();
	}
	
	public void init(int numClienti) {
		this.tavolo4 = 5;
		this.tavolo6 = 4;
		this.tavolo8 = 4;
		this.tavolo10 = 2;
		
		this.numClienti = 0;
		this.numClientiSoddisfatti = 0;
		this.numClientiInsoddisfatti = 0;
		
		this.queue.clear();
		
		//CARICO GLI EVENTI INIZIALI
		int oraprecedente  =0;
		for(int i=1; i<=2000; i++) {
			int ora = random.nextInt(10);
			queue.add(new Evento((oraprecedente+ora), TipoEvento.CLIENTE_ARRIVA));
			oraprecedente = oraprecedente+ora;
		}
	}
	
	
	public void run() {
		
		while(!queue.isEmpty()) {
			Evento ev = queue.poll();
			
			switch(ev.getTipo()) {
			
			case CLIENTE_ARRIVA:
				break;
				
			case CLIENTE_ESCE:
				break;
			}
		}
		
	}

}
