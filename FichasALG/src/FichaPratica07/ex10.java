package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int opcao;

        int linhas = lerLinhasFicheiro();
        int colunas = 5;
        String[][] ficheiroFormandosMatriz = new String[linhas][colunas];
        String path = "Dados/ex10.csv";
        lerFicheiro(path, ficheiroFormandosMatriz);

        do {
            System.out.println("\nEscolha uma opcao:");
            System.out.println("1 - Pesquisas");
            System.out.println("2 - Criar Formando");
            System.out.println("3 - Editar Formando");
            System.out.println("4 - Eliminar Formando");
            System.out.println("5 - Sair e Gravar");

            opcao = in.nextInt();
            in.nextLine();

            switch (opcao) {
                case 1:
                    pesquisas(ficheiroFormandosMatriz);
                    break;
                case 2:
                    String[][] formandoAtualizadoEditar = adicionarEntrada(ficheiroFormandosMatriz);
                    if (formandoAtualizadoEditar != null) {
                        ficheiroFormandosMatriz = formandoAtualizadoEditar;
                    }
                    break;
                case 3:
                    if (editarFormando(ficheiroFormandosMatriz)) {
                        System.out.println("Editado com sucesso");
                    } else {
                        System.out.println("Formando nao editado.");
                    }
                    break;
                case 4:
                    System.out.println("Introduza matricula do formando a eliminar");
                    String matricula = in.nextLine();
                    String[][] formandoAtualizadoEliminar = eliminarFormando(ficheiroFormandosMatriz, matricula);
                    if (formandoAtualizadoEliminar != null) {
                        System.out.println("Formando eliminado.");
                        ficheiroFormandosMatriz = formandoAtualizadoEliminar;
                    } else {
                        System.out.println("Formando nao encontrado.");
                    }
                    break;
                case 5:
                    gravarFicheiro(path, ficheiroFormandosMatriz);
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 5);
    }

    private static String[][] eliminarFormando(String[][] ficheiroFormandosMatriz, String matricula) {
        int registosAremover = 0;

        for (int i = 0; i < ficheiroFormandosMatriz.length; i++) {
            if (ficheiroFormandosMatriz[i][1].equalsIgnoreCase(matricula)) {
                registosAremover++;
            }
        }

        if (registosAremover == 0) {
            return null;
        }

        String[][] formandoAtualizado = new String[ficheiroFormandosMatriz.length - registosAremover][ficheiroFormandosMatriz[0].length];
        int indexAtualizado = 0;

        for (int i = 0; i < ficheiroFormandosMatriz.length; i++) {
            if (!ficheiroFormandosMatriz[i][1].equalsIgnoreCase(matricula)) {
                formandoAtualizado[indexAtualizado][0] = ficheiroFormandosMatriz[i][0];
                formandoAtualizado[indexAtualizado][1] = ficheiroFormandosMatriz[i][1];
                formandoAtualizado[indexAtualizado][2] = ficheiroFormandosMatriz[i][2];
                formandoAtualizado[indexAtualizado][3] = ficheiroFormandosMatriz[i][3];
                formandoAtualizado[indexAtualizado][4] = ficheiroFormandosMatriz[i][4];
                indexAtualizado++;
            }
        }

        return formandoAtualizado;
    }

    private static boolean editarFormando(String[][] ficheiroFormandosMatriz) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza a matricula do formando a editar.");
        String matriculaPesquisar = in.nextLine();

        for (int i = 0; i < ficheiroFormandosMatriz.length; i++) {
            if (matriculaPesquisar.equalsIgnoreCase(ficheiroFormandosMatriz[i][1])) {
                System.out.println("Introduza o nome.");
                String nome = in.nextLine();
                System.out.println("Introduza o numero matricula");
                int matricula = in.nextInt();
                System.out.println("Introduza idade.");
                int idade = in.nextInt();
                try {
                    ficheiroFormandosMatriz[i][1] = Integer.toString(matricula);
                    ficheiroFormandosMatriz[i][4] = Integer.toString(idade);
                } catch (Exception e) {
                    System.out.println("Dados Invalidos");
                    return false;
                }
                System.out.println("Introduza o curso.");
                in.nextLine();
                String curso = in.nextLine();
                System.out.println("Introduza email.");
                String email = in.nextLine();
                ficheiroFormandosMatriz[i][0] = nome;
                ficheiroFormandosMatriz[i][2] = curso;
                ficheiroFormandosMatriz[i][3] = email;
            }
        }

        return true;

    }

    private static String[][] adicionarEntrada(String[][] ficheiroFormandosMatriz) {
        String[][] formandosAtualizado = new String[ficheiroFormandosMatriz.length + 1][ficheiroFormandosMatriz[0].length];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < formandosAtualizado.length; i++) {
            if (i == formandosAtualizado.length - 1) {
                System.out.println("Introduza o nome.");
                formandosAtualizado[i][0] = in.nextLine();
                System.out.println("Introduza o numero matricula");
                int matricula = in.nextInt();
                in.nextLine();
                try {
                    formandosAtualizado[i][1] = Integer.toString(matricula);
                } catch (Exception e) {
                    System.out.println("Matricula Invalida");
                    return null;
                }
                System.out.println("Introduza o curso.");
                formandosAtualizado[i][2] = in.nextLine();
                System.out.println("Introduza email.");
                formandosAtualizado[i][3] = in.nextLine();
                System.out.println("Introduza idade.");
                int idade = in.nextInt();
                in.nextLine();
                try {
                    formandosAtualizado[i][4] = Integer.toString(idade);
                } catch (Exception e) {
                    System.out.println("Idade invalida.");
                    return null;
                }
            } else {
                formandosAtualizado[i][0] = ficheiroFormandosMatriz[i][0];
                formandosAtualizado[i][1] = ficheiroFormandosMatriz[i][1];
                formandosAtualizado[i][2] = ficheiroFormandosMatriz[i][2];
                formandosAtualizado[i][3] = ficheiroFormandosMatriz[i][3];
                formandosAtualizado[i][4] = ficheiroFormandosMatriz[i][4];
            }
        }

        return formandosAtualizado;
    }


    /**
     * PESQUISAS
     */

    private static void pesquisas(String[][] ficheiroFormandosMatriz) {
        Scanner in = new Scanner(System.in);

        System.out.println("\nEscolha uma opcao de pesquisa");
        System.out.println("1 - Imprimir todos os formandos");
        System.out.println("2 - Pesquisar formando por numero matricula");
        System.out.println("3 - Pesquisar formandos de dado curso"); // Mostrar contagem tambem
        System.out.println("4 - Pesquisar o aluno mais velho");
        System.out.println("5 - Pesquisar alunos inscritos em mais de um curso");
        System.out.println("6 - Verificar quantidade de formandos");

        int opcao = in.nextInt();

        switch (opcao) {
            case 1:
                imprimirFormandos(ficheiroFormandosMatriz);
                break;
            case 2:
                System.out.println("Introduza o numero de matricula");
                in.nextLine();
                String matricula = in.nextLine();
                imprimirAlunoMatricula(ficheiroFormandosMatriz, matricula);
                break;
            case 3:
                System.out.println("Introduza um curso");
                in.nextLine();
                String curso = in.nextLine();
                int qtdAlunosCurso = imprimirFormandosCurso(ficheiroFormandosMatriz, curso);
                if (qtdAlunosCurso > 0) {
                    System.out.println("Quantidade de alunos no curso " + curso + ": " + qtdAlunosCurso);
                } else {
                    System.out.println("Nao existem alunos no curso");
                }
                break;
            case 4:
                imprimirAlunoMaisVelho(ficheiroFormandosMatriz);
                break;
            case 5:
                imprimirAlunosMaisUmCurso(ficheiroFormandosMatriz);
                break;
            case 6:
                System.out.println("Alunos inscritos: " + getQtdAlunos(ficheiroFormandosMatriz));
                break;
            default:
                System.out.println("Opcao Invalida");
        }
    }

    private static int getQtdAlunos(String[][] ficheiroFormandosMatriz) {
        String[] jaEncontrado = new String[ficheiroFormandosMatriz.length];
        String[] jaImpresso = new String[ficheiroFormandosMatriz.length];
        int countNovasOcorrencias = 0;
        int countImpressos = 0;

        for (int i = 0; i < ficheiroFormandosMatriz.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < jaEncontrado.length; j++) {
                if (ficheiroFormandosMatriz[i][1].equalsIgnoreCase(jaEncontrado[j])) {
                    encontrado = true;
                }
            }
            if (!encontrado) {
                jaEncontrado[countNovasOcorrencias] = ficheiroFormandosMatriz[i][1];
                countNovasOcorrencias++;
            }
        }

        return countNovasOcorrencias;
    }

    private static void imprimirAlunosMaisUmCurso(String[][] ficheiroFormandosMatriz) {
        String[] jaEncontrado = new String[ficheiroFormandosMatriz.length];
        String[] jaImpresso = new String[ficheiroFormandosMatriz.length];
        int countNovasOcorrencias = 0;
        int countImpressos = 0;

        for (int i = 0; i < ficheiroFormandosMatriz.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < jaEncontrado.length; j++) {

                // System.out.println(ficheiroFormandosMatriz[i][1] + " === " + jaEncontrado[j]);
                if (ficheiroFormandosMatriz[i][1].equalsIgnoreCase(jaEncontrado[j])) {
                    encontrado = true;
                    boolean imprime = true;
                    for (int z = 0; z < jaImpresso.length; z++) {
                        if (ficheiroFormandosMatriz[i][1].equalsIgnoreCase(jaImpresso[z])) {
                            imprime = false;
                            break;
                        }
                    }
                    if (imprime) {
                        System.out.println("Dados para " + ficheiroFormandosMatriz[i][0] + ": ");
                        System.out.println("\tNumero: " + ficheiroFormandosMatriz[i][1]);
                        System.out.println("\tE-mail: " + ficheiroFormandosMatriz[i][3]);
                        System.out.println("\tIdade: " + ficheiroFormandosMatriz[i][4]);
                        System.out.println("---------------------------------------------");
                        jaImpresso[countImpressos] = ficheiroFormandosMatriz[i][1];
                        countImpressos++;
                    } else {
                        break;
                    }
                }
            }

            if (!encontrado) {
                jaEncontrado[countNovasOcorrencias] = ficheiroFormandosMatriz[i][1];
                countNovasOcorrencias++;
            }
        }
    }

    private static void imprimirAlunoMaisVelho(String[][] ficheiroFormandosMatriz) {
        int maiorIdade = 0;
        int linhaAluno = 0;
        for (int i = 0; i < ficheiroFormandosMatriz.length; i++) {

            if (Integer.parseInt(ficheiroFormandosMatriz[i][4]) > maiorIdade) {
                linhaAluno = i;
                maiorIdade = Integer.parseInt(ficheiroFormandosMatriz[i][4]);
            }
        }

        System.out.println("Dados para " + ficheiroFormandosMatriz[linhaAluno][0] + ": ");
        System.out.println("\tNumero: " + ficheiroFormandosMatriz[linhaAluno][1]);
        System.out.println("\tCurso: " + ficheiroFormandosMatriz[linhaAluno][2]);
        System.out.println("\tE-mail: " + ficheiroFormandosMatriz[linhaAluno][3]);
        System.out.println("\tIdade: " + ficheiroFormandosMatriz[linhaAluno][4]);
        System.out.println("---------------------------------------------");
    }

    private static int imprimirFormandosCurso(String[][] ficheiroFormandosMatriz, String curso) {
        int qtdAlunosCurso = 0;

        for (int i = 0; i < ficheiroFormandosMatriz.length; i++) {
            if (ficheiroFormandosMatriz[i][2].equalsIgnoreCase(curso)) {
                System.out.println("Dados para " + ficheiroFormandosMatriz[i][0] + ": ");
                System.out.println("\tNumero: " + ficheiroFormandosMatriz[i][1]);
                System.out.println("---------------------------------------------");
                qtdAlunosCurso++;
            }
        }


        return qtdAlunosCurso;
    }

    private static void imprimirAlunoMatricula(String[][] ficheiroFormandosMatriz, String matricula) {
        boolean alunoEncontrado = false;

        for (int i = 0; i < ficheiroFormandosMatriz.length; i++) {
            if (ficheiroFormandosMatriz[i][1].equalsIgnoreCase(matricula)) {
                System.out.println("Dados para " + ficheiroFormandosMatriz[i][0] + ": ");
                System.out.println("\tNumero: " + ficheiroFormandosMatriz[i][1]);
                System.out.println("\tCurso: " + ficheiroFormandosMatriz[i][2]);
                System.out.println("\tE-mail: " + ficheiroFormandosMatriz[i][3]);
                System.out.println("\tIdade: " + ficheiroFormandosMatriz[i][4]);
                System.out.println("---------------------------------------------");
                alunoEncontrado = true;
            }
        }

        if (!alunoEncontrado) {
            System.out.println("Aluno nao encontrado.");
        }
    }

    private static void imprimirFormandos(String[][] ficheiroFormandosMatriz) {
        System.out.println("FORMANDOS: \n");

        for (int i = 0; i < ficheiroFormandosMatriz.length; i++) {
            System.out.println("Dados para " + ficheiroFormandosMatriz[i][0] + ": ");
            System.out.println("\tNumero: " + ficheiroFormandosMatriz[i][1]);
            System.out.println("\tCurso: " + ficheiroFormandosMatriz[i][2]);
            System.out.println("\tE-mail: " + ficheiroFormandosMatriz[i][3]);
            System.out.println("\tIdade: " + ficheiroFormandosMatriz[i][4]);
            System.out.println("---------------------------------------------");
        }
    }

    /**
     * LER FICHEIRO
     */

    private static int lerLinhasFicheiro() throws FileNotFoundException {
        File ficheiroMusica = new File("Dados/ex10.csv");
        Scanner in = new Scanner(ficheiroMusica);
        int linhas = 0;

        in.nextLine();

        while (in.hasNextLine()) {
            linhas++;
            in.nextLine();
        }

        return linhas;
    }

    private static void lerFicheiro(String path, String[][] ficheiroMatriz) throws FileNotFoundException {
        File ficheiroFormandos = new File(path);
        Scanner in = new Scanner(ficheiroFormandos);

        in.nextLine();
        int countLinha = 0;

        while (in.hasNextLine()) {
            String linha = in.nextLine();
            String[] conteudoLinha = linha.split(",");
            ficheiroMatriz[countLinha][0] = conteudoLinha[0]; // nome
            ficheiroMatriz[countLinha][1] = conteudoLinha[1]; // numero
            ficheiroMatriz[countLinha][2] = conteudoLinha[2]; // curso
            ficheiroMatriz[countLinha][3] = conteudoLinha[3]; // email
            ficheiroMatriz[countLinha][4] = conteudoLinha[4]; // idade
            countLinha++;
        }

    }

    private static void gravarFicheiro(String path, String[][] ficheiroFormandosMatriz) throws FileNotFoundException {
        File ficheiroEscrita = new File(path);
        PrintWriter pw = new PrintWriter(ficheiroEscrita);

        pw.println("nome,numero,curso,email,idade");

        for(int i = 0; i < ficheiroFormandosMatriz.length; i++){
            pw.println(ficheiroFormandosMatriz[i][0] + "," + ficheiroFormandosMatriz[i][1] +
                    "," + ficheiroFormandosMatriz[i][2] + "," + ficheiroFormandosMatriz[i][3]
            + "," + ficheiroFormandosMatriz[i][4]);
        }

        pw.close();
    }
}
