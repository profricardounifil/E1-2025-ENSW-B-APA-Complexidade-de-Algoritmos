import java.util.Scanner;

public class VetorOps {
    int [] vetor = new int[4];
    int aux;

    public VetorOps() {

    }
    public void preencherVetor() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.print("Vetor[" + i + "] = ");
            vetor[i] = scanner.nextInt();
        }
    }

    public void exibirVetor() {
        System.out.println("EXIBINDO Vetor:");
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.println("Vetor[" + i + "] = " + vetor[i]);
        }
        System.out.println("=======");
    }

    public void bubbleSort() {
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.println("Valor de i: " + i);
            for (int j = 0; j < this.vetor.length-1-i; j++) {
                System.out.println("Valor de j: " + j);
                if(this.vetor[j] > this.vetor[j+1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }

    public void insertionSort() {
        for (int i = 1; i < this.vetor.length; i++) {
            if(this.vetor[i] < this.vetor[i-1]) {
                for (int j = i; j > 0; j--) {
                    this.aux = this.vetor[j];
                    this.vetor[j] = this.vetor[j-1];
                    this.vetor[j-1] = aux;
                    if(j == 1 || this.vetor[j-1] > this.vetor[j-2]) {
                        break;
                    }
                }
            }
        }
    }

    public void selectionSort() {
        int menor;
        int indiceMenorElemento = 0;
        for (int i = 0; i < this.vetor.length-1; i++) {
            menor = this.vetor[i];
            indiceMenorElemento = i;
            //Encontrando o menor elemento da rodada e sua posição
            for (int j = i; j < this.vetor.length; j++) {
                if(this.vetor[j] < menor) {
                    menor = this.vetor[j];
                    indiceMenorElemento = j;
                }
            }
            this.aux = this.vetor[i];
            this.vetor[i] = menor;
            this.vetor[indiceMenorElemento] = aux;
        }



    }
}
