package implementacao;

import java.util.List;
import laboratorio.Pessoa;

public class QuickSortins {
	
	public static void quickSortinsIdade(List<Pessoa> pessoas, int esquerda, int direita) { // esquerda e direita representam a menor posição e a maior posição do vetor
		int pivo;
		if(direita > esquerda) { // para o algoritimo quando as partições esquerda se encontrarem
			pivo = particaoIdade(pessoas, esquerda, direita);
			quickSortinsIdade(pessoas, esquerda, pivo - 1); //Chamando o método para os elementos que são menores que o Pivô
            quickSortinsIdade(pessoas, pivo + 1, direita); //Chamando o método para os elementos que são maiores que o Pivô
		}
		
	}
	
	private static int particaoIdade(List<Pessoa> pessoas, int esquerda, int direita) {
		Pessoa pivo = pessoas.get(esquerda);
		
		int i = esquerda + 1;
        int j = direita;
        
        while (i <= j) {
            if (pessoas.get(i).getIdade() <= pivo.getIdade()) {
                i++;
            } else if (pessoas.get(j).getIdade() > pivo.getIdade()) {
                j--;
            } else if (i <= j) {
            	Pessoa aux = pessoas.get(i);
            	pessoas.set(i, pessoas.get(j));
                pessoas.set(j, aux);
            }
        }
        Pessoa aux = pessoas.get(esquerda);
        pessoas.set(esquerda, pessoas.get(j));
        pessoas.set(j, aux);
        
		return j;
	}

	public static void quickSortinsAltura(List<Pessoa> pessoas, int esquerda, int direita) {
		int pivo;
		if(direita > esquerda) {
			pivo = particaoAltura(pessoas, esquerda, direita);
			quickSortinsAltura(pessoas, esquerda, pivo - 1); //Chamando o método para os elementos que são menores que o Pivô
            quickSortinsAltura(pessoas, pivo + 1, direita); //Chamando o método para os elementos que são maiores que o Pivô
		}

	}

	private static int particaoAltura(List<Pessoa> pessoas, int esquerda, int direita) {
		Pessoa pivo = pessoas.get(esquerda);
		
		int i = esquerda + 1;
        int j = direita;
        
        while (i <= j) {
            if (pessoas.get(i).getAltura() <= pivo.getAltura()) {
                i++;
            } else if (pessoas.get(j).getAltura() > pivo.getAltura()) {
                j--;
            } else if (i <= j) {
            	Pessoa aux = pessoas.get(i);
            	pessoas.set(i, pessoas.get(j));
                pessoas.set(j, aux);
            }
        }
        Pessoa aux = pessoas.get(esquerda);
        pessoas.set(esquerda, pessoas.get(j));
        pessoas.set(j, aux);
		
		return j;
	}

}
