package teste;

import animal.Cachorro;
import animal.Caracteristica;
import animal.Gato;
import animal.Urso;

public class TestaAnimal {
	public static void main(String[] args) {
		Gato gato = new Gato();
		gato.setNome("Gargamel");
		gato.setIdade(5);
		String[] donosGato = {"tom","Jerry"};
		gato.setDonos(donosGato);
		gato.setCastrado(true);
		gato.show();
		
		Caracteristica caracteristicaCao1 = new Caracteristica();
		caracteristicaCao1.setPeso(15);
		caracteristicaCao1.setAltura(0.15);
		caracteristicaCao1.setCor("Marrom");
		
		Cachorro c1 = new Cachorro();
		c1.setNome("Olga");
		c1.setIdade(10);
		String[] donosC1 = {"João","Maria"};
		c1.setDonos(donosC1);
		c1.setRaca("pug");
		c1.setCaracteristica(caracteristicaCao1);
		c1.show();
		
		Caracteristica caracteristicaCao2 = new Caracteristica();
		caracteristicaCao2.setAltura(0.50);
		caracteristicaCao2.setPeso(40);
		caracteristicaCao2.setCor("Preta");
		
		Cachorro c2 = new Cachorro();
		c2.setNome("Ronda");
		c2.setIdade(2);
		c2.setRaca("Rottweiler");
		String[] donosC2 = {"Hugo","José","Luís"};
		
		c2.setDonos(donosC2);
		c2.setCaracteristica(caracteristicaCao2);
		c2.show();
				
		Caracteristica caracteristicaU = new Caracteristica();
		caracteristicaU.setPeso(100);
		caracteristicaU.setAltura(2.03);
		caracteristicaU.setCor("Branca");
		
		Urso urso = new Urso() ;
		urso.setNome("Tobe");
		urso.setIdade(8);
		String[] donosUrso = {"Marsha"};
		urso.setDonos(donosUrso);
		urso.setCaracteristica(caracteristicaU);
		urso.show();
		
	}
}
