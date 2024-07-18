package FichaPratica09.Ex05;

public class Agenda {
    private Pessoa[] pessoas;
    private int numPessoas = 0;


    public void addPessoa(Pessoa p) {
        this.numPessoas++;
        Pessoa[] pessoasAux = new Pessoa[numPessoas];

        if (this.pessoas == null) {
            this.pessoas = new Pessoa[numPessoas];
            pessoas[0] = p;
        } else {
            for (int i = 0; i < pessoasAux.length; i++) {
                if( i == pessoasAux.length - 1){
                    pessoasAux[i] = p;
                } else {
                    pessoasAux[i] = pessoas[i];
                }
            }

            this.pessoas = pessoasAux;
        }
    }

    public void listarAgenda(){
        for(int i = 0; i < this.pessoas.length; i++){
            System.out.println(this.pessoas[i].getNome());
        }
        System.out.println("-------------------");
    }
}
