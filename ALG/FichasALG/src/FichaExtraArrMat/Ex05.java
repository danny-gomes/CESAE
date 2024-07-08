package FichaExtraArrMat;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        System.out.println("ENCONTRAR VALORES DUPLICADOS");
        /*
            Metodo que verifica se existem inteiros duplicados num array.
            O metodo usa 3 arrays, o original definido pelo utilizador.
            O array primeiras ocorrencias que guarda um numero no mesmo caso tenha sido encontrado pela primera vez.
            O array duplicado que caso veja que um numero existe no array primeira ocorrencia adiciona o a este.
         */

        Scanner in = new Scanner(System.in);
        int tamanho = 10; // Tamanho do array
        int[] arr = new int[tamanho]; // Array preenchido pelo utilizador
        int[] primOcorrencia = new int[tamanho]; // Array que guarda um inteiro caso ela seja encontrado pela primeira vez
        int primOcorrCount = 0; // Contador que regista o numero de primeiras ocorrencias encontradas
        int[] duplicados = new int[tamanho]; // Array que guarda os duplicados case ja exista no array primeiras ocorrencias
        int dupCount = 0; // Contador que regista quantidade duplicados encontrados


        // Utilizador preenche array
        for(int i = 0; i < tamanho; i++){
            System.out.println("Introduza um numero.");
            arr[i] = in.nextInt();
        }


        // Variavel que vai guardar o valor atual do array original
        int numPesquisar;

        for(int i = 0; i < tamanho; i++){
            numPesquisar = arr[i]; // O numPesquisar vai tomar cada um dos valores do array original
            boolean found = false; // Variavel que nos diz se um dado valor do array original foi encontrado no array primOcorrencia (caso seja encontrado no array primOcorrencia significa que e duplicado.
            for(int j = 0; j < tamanho; j++){ // Este segundo for e para percorrer o array primOcorrencia
                if(primOcorrencia[j] == numPesquisar){ // Verificar se para cada posicao j de primOcorrencia se ja existe o numPesquisar do array original
                    found = true; // Caso existe found = true foi encontrado
                    duplicados[dupCount] = numPesquisar; // Adicionar ao array de duplicados, se ja existe no array primOcorrencia entao e duplicado
                    dupCount++; // Aumentar o contador de duplicados
                    break; // Sair do for nao vale a pena procurar mais
                }
            }
            if (!found){ // Caso nao tenhamos encontrado um dado valor do array original na primOcorrencia, significa que ele mesmo e uma primeira ocorrencia entao adicionar ao array primOcorrencia
                primOcorrencia[primOcorrCount] = numPesquisar;
                primOcorrCount++; // Aumentar o contador de primeiras ocorrencias encontradas.
            }
        }

        /*
            Como o nosso array de duplicados vai repetir valores, implementamos um sistema semelhante a antes mas para ja impressos e nao impressos.
            Caso dupCount seja 0 quer dizer que nao foram encontrados valores duplicados.
         */

        int[] imprimidos = new int[duplicados.length];
        int impCount = 0;

        if(dupCount == 0){
            System.out.println("Nao ha duplicados.");
        } else {
            System.out.println("Duplicados:");
            for(int i = 0; i < dupCount; i++){
                boolean impresso = false;
                for(int j = 0; j < imprimidos.length; j++){
                    if(duplicados[i] == imprimidos[j]){
                        impresso = true;
                        break;
                    }
                }
                if(!impresso){
                    System.out.println(duplicados[i]);
                    imprimidos[impCount] = duplicados[i];
                    impCount++;
                }
            }
        }



    }
}
