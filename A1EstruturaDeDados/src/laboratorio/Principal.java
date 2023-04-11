package laboratorio;

import java.util.ArrayList;
import implementacao.QuickSortins;

public class Principal {
	public static void main(String[] args) {

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("João", 25, 1.84));
		pessoas.add(new Pessoa("Maria", 30, 1.64));
		pessoas.add(new Pessoa("Pedro", 21, 1.72));
		pessoas.add(new Pessoa("Gustavo", 33, 1.94));
		pessoas.add(new Pessoa("Jorge", 22, 2.00));
		pessoas.add(new Pessoa("Carla", 44, 1.67));
		pessoas.add(new Pessoa("Jean", 34, 1.70));
		pessoas.add(new Pessoa("Andressa", 16, 1.55));
		pessoas.add(new Pessoa("Paulo", 26, 1.75));

		System.out.println("ANTES DO QUICKSORTINS:\n");
		for (Pessoa p : pessoas) {
			System.out.println(p.getNome() + ", " + p.getIdade() + " Anos, " + p.getAltura() + " m");
		}

		System.out.println("\nAPÓS QUICKSORTINS:");
		System.out.println("Ordenando por Idade:\n");

		QuickSortins.quickSortinsIdade(pessoas, 0, pessoas.size() - 1);

		for (Pessoa p : pessoas) {
			System.out.println(p.getNome() + ", " + p.getIdade() + " Anos");
		}

		System.out.println("\nOrdenando por Altura:\n");
		QuickSortins.quickSortinsAltura(pessoas, 0, pessoas.size() - 1);

		for (Pessoa p : pessoas) {
			System.out.println(p.getNome() + ", " + p.getAltura() + " m");
		}
		

	}


}