package FichaExtraFuncoes;

public class Ex09 {
    public static void main(String[] args) {
        System.out.println(getMes(9));
    }

    public static String getMes(int mes){
        String[] meses = new String[12];

        meses[0] = "Janeiro";
        meses[1] = "Fevereiro";
        meses[2] = "Março";
        meses[3] = "Abril";
        meses[4] = "Maio";
        meses[5] = "Junho";
        meses[6] = "Julho";
        meses[7] = "Agosto";
        meses[8] = "Setembro";
        meses[9] = "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";

        if(mes < 1 || mes > 12){
            return "Mes invalido";
        }

        return meses[mes - 1];
    }
}
