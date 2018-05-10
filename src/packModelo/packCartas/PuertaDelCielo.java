package packModelo.packCartas;

import java.util.ArrayList;
import java.util.Collections;

import packModelo.EnumColor;

public class PuertaDelCielo {
	private ListaCartas cartas;
	private static PuertaDelCielo mPuertaDelCielo;

	private PuertaDelCielo() {
		cartas = new ListaCartas();
	}

	public static PuertaDelCielo getPuertaDelCielo() {
		if (mPuertaDelCielo == null) {
			mPuertaDelCielo = new PuertaDelCielo();
		}
		return mPuertaDelCielo;
	}

	public void add(CartaAnimal carta) {
		cartas.add(carta);
	}

	public EnumColor calcularGanador() {
		/*
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(cartas.buscarColor(EnumColor.AMARILLO));
		a.add(cartas.buscarColor(EnumColor.ROJO));
		a.add(cartas.buscarColor(EnumColor.VERDE));
		a.add(cartas.buscarColor(EnumColor.AZUL));
		int max=Collections.max(a);
		*/
		if(cartas.buscarColor(EnumColor.VERDE)>cartas.buscarColor(EnumColor.AZUL)) {
			return EnumColor.VERDE;
		}else if (cartas.buscarColor(EnumColor.VERDE)<cartas.buscarColor(EnumColor.AZUL)) {
			return EnumColor.AZUL;
		}else {
			return cartas.minPuntos();
		}
		
		
		
	}
	
	
	
	public void imprimir() {
		System.out.println("Lista de cartas en la puerta del cielo");
		cartas.imprimirlista();
	}
}
