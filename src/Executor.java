public class Executor {
    public static void main(String[] args) {
        VetorOps vetorOps = new VetorOps();
        vetorOps.preencherVetor();
        vetorOps.exibirVetor();
        vetorOps.mergeSort(0, vetorOps.vetor.length-1);
        vetorOps.exibirVetor();
    }
}
