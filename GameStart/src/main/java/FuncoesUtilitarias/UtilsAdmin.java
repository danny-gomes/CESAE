package FuncoesUtilitarias;

// 0 - idVenda          0 - idCliente
// 1 - idCliente        1 - nome
// 2 - editora          2 - telemovel
// 3 - categoria        3 - email
// 4 - jogo
// 5 - valor

public class UtilsAdmin {
    /**
     * Método que calcula o total de vendas bruto da lista de vendas.
     *
     * @param vendas Matriz que guarda as vendas.
     * @return O total de vendas.
     */
    public static double totalVendas(String[][] vendas) {


        double totalVendas = 0;

        for (int i = 0; i < vendas.length; i++) {
            totalVendas = totalVendas + Double.parseDouble(vendas[i][5]);
        }

        return totalVendas;
    }

    /**
     * Método que calcula o lucro total sobre a venda dos jogos, tendo em conta as comissões.
     *
     * @param vendas    matriz com as vendas efetuadas.
     * @param comissoes matriz atual de comissões sobre cada categoria de jogo disponível.
     * @return o lucro total.
     */
    public static double lucro(String[][] vendas, String[][] comissoes) {
        double totalLucro = 0;

        for (int i = 0; i < vendas.length; i++) {
            for (int h = 0; h < comissoes.length; h++) {
                if (vendas[i][3].equals(comissoes[h][0])) {
                    totalLucro = totalLucro + Double.parseDouble(vendas[i][5]) * (Double.parseDouble(comissoes[h][1]) / 100);
                }
            }
        }

        return totalLucro;
    }

    /**
     * Método que pesquisa por um cliente a partir do idCliente.
     *
     * @param clientes  a matriz com todos os clientes.
     * @param idCliente o idCliente a ser pesquisado.
     * @return Vetor com os dados do cliente, ou null se cliente não encontrado.
     */
    public static String[] pesquisaCliente(String[][] clientes, String idCliente) {
        String[] clienteAprocurar = new String[clientes[0].length];

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i][0].equalsIgnoreCase(idCliente)) {
                for (int h = 0; h < clientes[i].length; h++) {
                    clienteAprocurar[h] = clientes[i][h];
                }
                return clienteAprocurar;
            }
        }

        return null;
    }

    /**
     * Método que encontra o jogo mais caro.
     *
     * @param vendas a matriz de vendas.
     * @return O nome do jogo mais caro.
     */
    public static String jogoMaisCaro(String[][] vendas) {
        double valorMaisCaro = 0;
        String jogoMaisCaro = "";
        for (int i = 0; i < vendas.length; i++) {
            if (Double.parseDouble(vendas[i][5]) > valorMaisCaro) {
                valorMaisCaro = Double.parseDouble(vendas[i][5]);
                jogoMaisCaro = vendas[i][4];
            }
        }

        return jogoMaisCaro;
    }

    /**
     * Método que procura os clientes que compraram o jogo mais caro e adiciona os seus ids a um
     * vetor a ser retornado.
     *
     * @param vendas matriz com as vendas.
     * @param jogo   o jogo mais caro.
     * @return matriz com o id dos clientes que compraram o jogo mais caro.
     */
    public static String[] clientesCompraramMaisCaro(String[][] vendas, String jogo) {
        String[] clientesCompraramJogoCaroAux = new String[vendas.length];
        int count = 0;

        for (int i = 0; i < vendas.length; i++) {
            boolean jaAdicionado = false;

            if (vendas[i][4].equalsIgnoreCase(jogo)) {
                for (int h = 0; h < clientesCompraramJogoCaroAux.length; h++) {
                    if (vendas[i][1].equalsIgnoreCase(clientesCompraramJogoCaroAux[h])) {
                        jaAdicionado = true;
                    }
                }
                if (!jaAdicionado) {
                    clientesCompraramJogoCaroAux[count] = vendas[i][1];
                    count++;
                }
            }
        }

        String[] clientesCompraramJogoMaisCaro = new String[count];

        for (int i = 0; i < count; i++) {
            clientesCompraramJogoMaisCaro[i] = clientesCompraramJogoCaroAux[i];
        }

        return clientesCompraramJogoMaisCaro;
    }


    /**
     * Método que cria uma matriz de doubles, a primeira coluna terá o id de cliente e a
     * segunda coluna terá o respetivo valor gasto em jogos.
     *
     * @param vendas a matriz das vendas
     * @return a matriz com os idCliente e os respetivos valor gasto em jogos.
     */
    public static double[][] totalGastoPorCliente(String[][] vendas) {
        double[][] clientesAux = new double[vendas.length][2];
        int countCliente = 0;

        for (int i = 0; i < vendas.length; i++) {
            boolean added = false;
            int linhaCliente = -1;
            for (int h = 0; h < clientesAux.length; h++) {
                if (Double.parseDouble(vendas[i][1]) == clientesAux[h][0]) {
                    added = true;
                    linhaCliente = h;
                }
            }

            if (added) {
                clientesAux[linhaCliente][1] = clientesAux[linhaCliente][1] + Double.parseDouble(vendas[i][5]);
            } else {
                clientesAux[countCliente][0] = Double.parseDouble(vendas[i][1]);
                clientesAux[countCliente][1] = Double.parseDouble(vendas[i][5]);
                countCliente++;
            }
        }

        double[][] clientes = new double[countCliente][2];

        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientesAux[i][0] + " RRRR " + clientesAux[i][1]);
            clientes[i][0] = clientesAux[i][0];
            clientes[i][1] = clientesAux[i][1];
        }

        return clientes;
    }

    /**
     * Método que vai buscar o cliente ou clientes, em caso de empate, que mais gastaram na
     * loja
     * @param totalGastoCliente matriz que guarda o id de cliente e o respetivo valor gasto
     *                          em jogos por cada um
     * @return matriz com a lista de clientes que mais dinheiro gastaram
     */
    public static String[] melhorClientes(double[][] totalGastoCliente) {
        double maiorValor = 0;
        double[] maioresClientesAux = new double[totalGastoCliente.length];
        int countAdded = 0;

        for(int i = 0; i < totalGastoCliente.length; i++){
            if(totalGastoCliente[i][1] > maiorValor) {
                maiorValor = totalGastoCliente[i][1];
            }
        }

        for(int i = 0; i < totalGastoCliente.length; i++){
            if(totalGastoCliente[i][1] == maiorValor) {
                maioresClientesAux[countAdded] = totalGastoCliente[i][0];
                countAdded++;
            }
        }

        String[] maioresClientes = new String[countAdded];

        for(int i = 0; i < countAdded; i++){
            // Necessário porque a conversão de double para string faz id ser "1.0" e não "1"
            maioresClientes[i] = Integer.toString((int) maioresClientesAux[i]);
        }

        return maioresClientes;
    }

    /**
     * Método que cria uma matriz igual a comissoes mas com uma terceira coluna adicionada
     * com o valor total vendido pela categoria
     * @param vendas matriz das vendas.
     * @param comissoes matriz das comissoes.
     * @returnmatriz igual a comissoes mas com uma terceira coluna adicionada
     * com o valor total vendido pela categoria
     */
    public static String[] categoriasPorLucroGerado(String[][] vendas, String[][] comissoes) {
        String[][] comissoesVendas = new String[comissoes.length][comissoes[0].length + 1];
        String[] maiorCategoriaEvalor = new String[2];

        for(int i = 0; i < comissoes.length; i++){
            comissoesVendas[i][0] = comissoes[i][0];
            comissoesVendas[i][1] = comissoes[i][1];
            double zero = 0;
            comissoesVendas[i][2] = Double.toString(zero);
        }

        for(int i = 0; i < vendas.length;i++){
            for(int h = 0; h < comissoesVendas.length; h++){
                if(vendas[i][3].equalsIgnoreCase(comissoesVendas[h][0])) {
                    double valor = Double.parseDouble(comissoesVendas[h][2]) + (Double.parseDouble(vendas[i][5]) * (Double.parseDouble(comissoesVendas[h][1]) / 100.0));
                    double valor2Casas = Math.floor(valor * 100) / 100;
                    comissoesVendas[h][2] = Double.toString(valor2Casas);
                }
            }
        }

        double maiorValor = 0;

        for(int i = 0; i < comissoesVendas.length; i++){
            if(Double.parseDouble(comissoesVendas[i][2]) > maiorValor){
                maiorValor = Double.parseDouble(comissoesVendas[i][2]);
            }
        }

        for(int i = 0; i < comissoesVendas.length; i++){
            if(Double.parseDouble(comissoesVendas[i][2]) == maiorValor){
                maiorCategoriaEvalor[0] = comissoesVendas[i][0];
                maiorCategoriaEvalor[1] = comissoesVendas[i][2];
            }
        }

        return maiorCategoriaEvalor;
    }
}
