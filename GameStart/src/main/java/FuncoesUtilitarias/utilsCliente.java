package FuncoesUtilitarias;

public class utilsCliente {

    /**
     * Função que simula o registo de um cliente e retorna-o.
     *
     * @param id       o id do novo cliente.
     * @param nome     o nome do novo cliente.
     * @param contacto o contacto do novo cliente.
     * @param email    o email do novo cliente.
     * @return array com os dados do novo cliente.
     */
    public static String[] simulaRegistoCliente(String id, String nome, String contacto, String email) {
        String[] novoCliente = new String[4];

        novoCliente[0] = id;
        novoCliente[1] = nome;
        novoCliente[2] = contacto;
        novoCliente[3] = email;

        return novoCliente;
    }

    /**
     * Função que calcula os lugares vagos e retorna-os num array.
     *
     * @return o array com os lugares vagos.
     */
    public static int[] lugaresVagos() {
        int[] lugaresVagosAux = new int[121];
        int qtdLugaresVagos = 0;
        for (int i = 1; i <= 121; i++) {
            int num = 1;
            int soma = 0;

            while (soma < i) {
                soma = soma + num;
                num++;
            }

            if (soma == i && i % 5 == 0) {
                lugaresVagosAux[qtdLugaresVagos] = i;
                qtdLugaresVagos++;
            }
        }

        int[] lugaresVagos = new int[qtdLugaresVagos];

        for (int i = 0; i < lugaresVagos.length; i++) {
            lugaresVagos[i] = lugaresVagosAux[i];
        }

        return lugaresVagos;
    }

    /**
     * Método que vai buscar o catalogo de todos os jogos disponíveis.
     * @param vendas matriz das vendas.
     * @return array com todos os jogos.
     */
    public static String[] getCatalogo(String[][] vendas) {
        String[] primOcorrencia = new String[vendas.length];
        int encontrados = 0;

        for (int i = 0; i < vendas.length; i++) {
            boolean added = false;
            for (int h = 0; h < primOcorrencia.length; h++) {
                if(vendas[i][4].equals(primOcorrencia[h])){
                    added = true;
                    break;
                }
            }
            if(!added){
                primOcorrencia[encontrados] = vendas[i][4];
                encontrados++;
            }
        }

        String[] catalogo = new String[encontrados];

        for(int i = 0; i < catalogo.length; i++){
            catalogo[i] = primOcorrencia[i];
        }

        return catalogo;
    }

    /**
     * Método que vai á matriz de vendas e dado uma editora passado por parâmetro, faz um catálogo
     * dos jogos dessa editora dividido por categorias.
     * @param vendas matriz das vendsa.
     * @param editora editora a ser pesquisada.
     * @return a matriz com as categorias e jogos de uma dada editora, ou null se editora não
     * encontrada.
     */
    public static String[][] jogosEditora(String[][] vendas, String editora) {
        String[][] jogosCategoriaAux = new String[vendas.length][vendas.length];
        int[] jogosAdicionadosPorCategoria = new int[jogosCategoriaAux.length];
        int categoriasAdicionadas = 0;

        for(int i = 0; i < vendas.length; i++){
            boolean addedCat = false;
            boolean addedJogo = false;
            if(vendas[i][2].equals(editora)){
                for(int h = 0; h < jogosCategoriaAux.length; h++){
                    if(vendas[i][3].equals(jogosCategoriaAux[h][0])){
                        addedCat = true;
                        for(int z = 0; z < jogosCategoriaAux[i].length; z++){
                            if(vendas[i][4].equals(jogosCategoriaAux[h][z])) {
                                addedJogo = true;
                                break;
                            }
                        }
                        if(!addedJogo){
                            jogosCategoriaAux[h][jogosAdicionadosPorCategoria[h]] = vendas[i][4];
                            jogosAdicionadosPorCategoria[h]++;
                        }
                    }
                }
                if(!addedCat){
                    jogosCategoriaAux[categoriasAdicionadas][0] = vendas[i][3];
                    jogosCategoriaAux[categoriasAdicionadas][1] = vendas[i][4];
                    jogosAdicionadosPorCategoria[categoriasAdicionadas]++;
                    categoriasAdicionadas++;
                }
            }

        }

        String[][] jogosCategoriasPorEditora = new String[categoriasAdicionadas][vendas.length];

        for(int i = 0; i< jogosCategoriasPorEditora.length; i++){
            jogosCategoriasPorEditora[i][0] = jogosCategoriaAux[i][0];
            for(int h = 0; h < jogosCategoriaAux[i].length; h++) {
                jogosCategoriasPorEditora[i][h] = jogosCategoriaAux[i][h];
            }
        }

        if(categoriasAdicionadas == 0) {
            return null;
        }

        return jogosCategoriasPorEditora;
    }


    /**
     * Método que vai á matriz de vendas e dado uma categoria passado por parâmetro, faz um catálogo
     * dos jogos dessa categoria dividido por editora.
     * @param vendas matriz das vendsa.
     * @param categoria categoria a ser pesquisada.
     * @return a matriz com as editoras e jogos de uma dada categoria, ou null se categoria não
     * encontrada.
     */
    public static String[][] jogosCategoria(String[][] vendas, String categoria) {
        String[][] jogosEditoraAux = new String[vendas.length][vendas.length];
        int[] jogosAdicionadosPorEditora = new int[jogosEditoraAux.length];
        int editorasAdicionadas = 0;

        for(int i = 0; i < vendas.length; i++){
            boolean addedEdi = false;
            boolean addedJogo = false;
            if(vendas[i][3].equals(categoria)){
                for(int h = 0; h < jogosEditoraAux.length; h++){
                    if(vendas[i][2].equals(jogosEditoraAux[h][0])){
                        addedEdi = true;
                        for(int z = 0; z < jogosEditoraAux[i].length; z++){
                            if(vendas[i][4].equals(jogosEditoraAux[h][z])) {
                                addedJogo = true;
                                break;
                            }
                        }
                        if(!addedJogo){
                            jogosEditoraAux[h][jogosAdicionadosPorEditora[h]] = vendas[i][4];
                            jogosAdicionadosPorEditora[h]++;
                        }
                    }
                }
                if(!addedEdi){
                    jogosEditoraAux[editorasAdicionadas][0] = vendas[i][2];
                    jogosEditoraAux[editorasAdicionadas][1] = vendas[i][4];
                    jogosAdicionadosPorEditora[editorasAdicionadas]++;
                    editorasAdicionadas++;
                }
            }

        }

        String[][] jogosCategoriasPorEditora = new String[editorasAdicionadas][vendas.length];

        for(int i = 0; i< jogosCategoriasPorEditora.length; i++){
            jogosCategoriasPorEditora[i][0] = jogosEditoraAux[i][0];
            for(int h = 0; h < jogosEditoraAux[i].length; h++) {
                jogosCategoriasPorEditora[i][h] = jogosEditoraAux[i][h];
            }
        }

        if(editorasAdicionadas == 0) {
            return null;
        }

        return jogosCategoriasPorEditora;
    }

    /**
     * Método que retorna o jogo mais recente usando o catálogo de jogos.
     * @param vendas matriz das vendas.
     * @return o jogo mais recente.
     */
    public static String getJogoMaisRecente(String[][] vendas){
        String[] jogos = getCatalogo(vendas);

        return jogos[jogos.length - 1];
    }
}
