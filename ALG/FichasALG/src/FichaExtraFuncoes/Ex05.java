package FichaExtraFuncoes;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero para ouvir uma piada.");
        int piada = in.nextInt();

        System.out.println(contarPiada(piada));
    }

    public static String contarPiada(int piada){
        String[] bibliotecaPiadas = new String[100];

        bibliotecaPiadas[0] = "Por que o jacaré tirou o jacarezinho da escola? Porque ele réptil de ano.";
        bibliotecaPiadas[1] = "Qual é o cúmulo da velocidade? Correr ao redor de uma cadeira e sentar antes da sombra passar.";
        bibliotecaPiadas[2] = "Por que o livro de matemática se matou? Porque tinha muitos problemas.";
        bibliotecaPiadas[3] = "Por que o computador foi ao médico? Porque estava com vírus.";
        bibliotecaPiadas[4] = "O que o tomate foi fazer no banco? Tirar extrato.";
        bibliotecaPiadas[5] = "Qual é a fruta que é um pecado? A pera.";
        bibliotecaPiadas[6] = "Por que a aranha é o animal mais carente do mundo? Porque ela é uma Aracne.";
        bibliotecaPiadas[7] = "O que é um pontinho amarelo na guerra? É um girassol-dado.";
        bibliotecaPiadas[8] = "Qual é o animal mais antigo do mundo? A Zebra, porque é preta e branca.";
        bibliotecaPiadas[9] = "Qual é o peixe que caiu do décimo andar? Aaaaaaaatum.";
        bibliotecaPiadas[10] = "Como se chama um boomerang que não volta? Pau.";
        bibliotecaPiadas[11] = "Por que o escorregador foi ao terapeuta? Porque estava descendo.";
        bibliotecaPiadas[12] = "O que é um pontinho vermelho no meio da floresta? Uma cereja espiã.";
        bibliotecaPiadas[13] = "Qual é a piada do fotógrafo? Revela.";
        bibliotecaPiadas[14] = "Por que a vaca foi para o espaço? Para se encontrar com as estrelas.";
        bibliotecaPiadas[15] = "Por que a bicicleta não pode ficar de pé? Porque ela está sem pedal.";
        bibliotecaPiadas[16] = "O que é um ponto preto na estrada? Uma formiga de smoking.";
        bibliotecaPiadas[17] = "Por que os peixes não gostam de futebol? Porque têm medo das redes.";
        bibliotecaPiadas[18] = "O que é uma ovelha sem cabeça, sem pernas e sem barriga? Um gorro de lã.";
        bibliotecaPiadas[19] = "Por que o pombo não usa colete? Porque ele já é asa.";
        bibliotecaPiadas[20] = "O que o pato falou para a pata? Vem quá.";
        bibliotecaPiadas[21] = "Por que a água foi presa? Porque matou a sede.";
        bibliotecaPiadas[22] = "Por que a plantinha não pode assistir televisão? Porque ela já é programada.";
        bibliotecaPiadas[23] = "Qual é o animal mais esquecido do mundo? O peixe, porque ele é peixe-esquecido.";
        bibliotecaPiadas[24] = "Por que a pipoca não pode ir ao cinema? Porque ela já está no filme.";
        bibliotecaPiadas[25] = "Qual é o animal mais bagunceiro? O porco-espinho.";
        bibliotecaPiadas[26] = "Por que o telefone foi preso? Porque ele estava no modo avião.";
        bibliotecaPiadas[27] = "Qual é o cavalo que você nunca vê na frente? O cavalinho de pau.";
        bibliotecaPiadas[28] = "Por que o pássaro não usa GPS? Porque ele já tem bico.";
        bibliotecaPiadas[29] = "O que é um pontinho amarelo no jardim? Um botão de ouro.";
        bibliotecaPiadas[30] = "Por que o jornal não pode subir a escada? Porque ele já é impresso.";
        bibliotecaPiadas[31] = "O que o cachorro foi fazer no banco? Correr atrás do cheque.";
        bibliotecaPiadas[32] = "Por que a televisão foi ao psiquiatra? Porque estava sem sinal.";
        bibliotecaPiadas[33] = "Qual é o animal que sempre vence a corrida? O coelho, porque ele é ligeiro.";
        bibliotecaPiadas[34] = "Por que o celular não foi à escola? Porque ele estava sem crédito.";
        bibliotecaPiadas[35] = "O que o caderno falou para a caneta? Escreve certo, por favor.";
        bibliotecaPiadas[36] = "Por que a escova de dentes foi ao dentista? Porque estava com cárie.";
        bibliotecaPiadas[37] = "Qual é o cúmulo da paciência? Esperar um elefante descer do escorregador.";
        bibliotecaPiadas[38] = "O que é um pontinho verde na neve? Uma ervilha congelada.";
        bibliotecaPiadas[39] = "Por que a carta foi ao correio? Para ser enviada.";
        bibliotecaPiadas[40] = "Qual é o cúmulo da força? Dobrar a esquina.";
        bibliotecaPiadas[41] = "Por que o relógio foi preso? Porque ele matou o tempo.";
        bibliotecaPiadas[42] = "O que é um pontinho amarelo na praia? Um grão de areia com hepatite.";
        bibliotecaPiadas[43] = "Por que o tomate foi ao médico? Porque estava com ketchup.";
        bibliotecaPiadas[44] = "O que o astrônomo foi fazer no dentista? Tirar uma placa.";
        bibliotecaPiadas[45] = "Por que o elefante não usa pasta de dentes? Porque ele já é grande.";
        bibliotecaPiadas[46] = "Qual é o peixe mais leve do mundo? O peixe-lua.";
        bibliotecaPiadas[47] = "Por que o céu estava triste? Porque tinha muitas nuvens.";
        bibliotecaPiadas[48] = "O que o mar falou para a praia? Deixa de ser areia.";
        bibliotecaPiadas[49] = "Qual é o animal que sempre carrega uma mala? O cachorro, porque ele é bagunceiro.";
        bibliotecaPiadas[50] = "Por que o professor de geografia foi demitido? Porque ele perdeu o mapa.";
        bibliotecaPiadas[51] = "O que é um pontinho vermelho no meio da floresta? Um morango espião.";
        bibliotecaPiadas[52] = "Por que o caderno de notas foi ao médico? Porque ele estava cheio de folhas.";
        bibliotecaPiadas[53] = "O que é um ponto azul no céu? Uma formiga de capa.";
        bibliotecaPiadas[54] = "Por que o pincel foi ao tribunal? Porque ele pintou o sete.";
        bibliotecaPiadas[55] = "Qual é o animal mais barulhento? O cachorro, porque ele é latido.";
        bibliotecaPiadas[56] = "Por que o gato não gosta de água? Porque ele já é gato.";
        bibliotecaPiadas[57] = "O que o rato foi fazer no banco? Tirar queijo.";
        bibliotecaPiadas[58] = "Por que o sapo não dirige? Porque ele já é pulante.";
        bibliotecaPiadas[59] = "O que é um ponto preto no gelo? Um pinguim ninja.";
        bibliotecaPiadas[60] = "Por que o sorvete foi ao psicólogo? Porque estava derretendo.";
        bibliotecaPiadas[61] = "O que é um pontinho verde no rio? Um alface nadando.";
        bibliotecaPiadas[62] = "Por que o passarinho não usa óculos? Porque ele já tem visão.";
        bibliotecaPiadas[63] = "O que a cebola foi fazer na farmácia? Comprar um colírio.";
        bibliotecaPiadas[64] = "Por que o jacaré foi ao barbeiro? Porque ele queria ficar na régua.";
        bibliotecaPiadas[65] = "O que é um pontinho laranja no céu? Um avião com casca.";
        bibliotecaPiadas[66] = "Por que o livro de história estava triste? Porque ele tinha muitos dramas.";
        bibliotecaPiadas[67] = "O que a formiga foi fazer na cozinha? Procurar um pouco de açúcar.";
        bibliotecaPiadas[68] = "Por que a estrela não vai à escola? Porque já é brilhante.";
        bibliotecaPiadas[69] = "O que o lápis falou para a borracha? Pare de me apagar!";
        bibliotecaPiadas[70] = "Por que a laranja não foi ao jogo? Porque ela já estava espremida.";
        bibliotecaPiadas[71] = "O que o boneco de neve disse para a boneca de neve? Está frio aqui fora!";
        bibliotecaPiadas[72] = "Por que a caneta foi presa? Porque ela estava envolvida em um crime.";
        bibliotecaPiadas[73] = "O que o papel disse para a impressora? Pare de me machucar!";
        bibliotecaPiadas[74] = "Por que o lápis foi ao terapeuta? Porque ele estava com a ponta quebrada.";
        bibliotecaPiadas[75] = "O que a lua disse para o sol? Pare de brilhar tanto!";
        bibliotecaPiadas[76] = "Por que o travesseiro foi ao médico? Porque ele estava se sentindo amassado.";
        bibliotecaPiadas[77] = "O que o sapo disse para a lagoa? Estou pulando fora!";
        bibliotecaPiadas[78] = "Por que o espelho foi ao psiquiatra? Porque ele estava refletindo muito.";
        bibliotecaPiadas[79] = "O que a árvore disse para o vento? Pare de me balançar!";
        bibliotecaPiadas[80] = "Por que o livro foi ao hospital? Porque ele estava se sentindo mal.";
        bibliotecaPiadas[81] = "O que a chave disse para a fechadura? Vamos abrir caminho!";
        bibliotecaPiadas[82] = "Por que o relógio foi ao psiquiatra? Porque ele estava perdendo a hora.";
        bibliotecaPiadas[83] = "O que o computador disse para o mouse? Pare de me apontar!";
        bibliotecaPiadas[84] = "Por que o elevador foi ao psicólogo? Porque ele estava se sentindo para baixo.";
        bibliotecaPiadas[85] = "O que a cadeira disse para a mesa? Estamos sempre juntos!";
        bibliotecaPiadas[86] = "Por que o carro foi ao mecânico? Porque ele estava sem gasolina.";
        bibliotecaPiadas[87] = "O que a janela disse para a cortina? Pare de me esconder!";
        bibliotecaPiadas[88] = "Por que o sapato foi ao médico? Porque ele estava apertado.";
        bibliotecaPiadas[89] = "O que o pinguim disse para o gelo? Estamos juntos nessa!";
        bibliotecaPiadas[90] = "Por que a geladeira foi ao médico? Porque ela estava gelada.";
        bibliotecaPiadas[91] = "O que o celular disse para o carregador? Estou sem energia!";
        bibliotecaPiadas[92] = "Por que a televisão foi ao médico? Porque ela estava sem imagem.";
        bibliotecaPiadas[93] = "O que a bola disse para o gol? Estamos sempre juntos!";
        bibliotecaPiadas[94] = "Por que o ventilador foi ao médico? Porque ele estava com dor de ar.";
        bibliotecaPiadas[95] = "O que o carro disse para a garagem? Estou estacionado!";
        bibliotecaPiadas[96] = "Por que o relógio foi ao hospital? Porque ele estava sem tempo.";
        bibliotecaPiadas[97] = "O que a maçã disse para a banana? Estamos no mesmo cacho!";
        bibliotecaPiadas[98] = "Por que o armário foi ao psicólogo? Porque ele estava fechado.";
        bibliotecaPiadas[99] = "O que a mesa disse para a cadeira? Estamos sempre juntos!";

        return bibliotecaPiadas[piada];
    }
}

