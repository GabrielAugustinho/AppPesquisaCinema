package apppesquisaopiniao;

/**
 *
 * @author aluno
 */
public class Pesquisa {

    // Atributos
    private Espectador respostaPesquisa[];
    private int qtdResposta = 0;

    // Construtor
    public Pesquisa() {
        respostaPesquisa = new Espectador[50];
    }

    public Pesquisa(int qtd) {
        respostaPesquisa = new Espectador[qtd];
    }

    // Metodos
    public int getQtdResposta() {
        return qtdResposta;
    }

    public Espectador[] getRespostaPesquisa() {
        return respostaPesquisa;
    }

    public boolean adiciona(Espectador novo) {
        if (qtdResposta < respostaPesquisa.length) {
            respostaPesquisa[qtdResposta++] = novo;
            return true;
        }
        return false;
    }

    public int[] ocorrencias() {
        int resultado[] = new int[5];

        for (int i = 0; i < qtdResposta; i++) {
            switch (respostaPesquisa[i].getOpiniao()) {
                case 'A':
                    resultado[0]++;
                    break;
                case 'B':
                    resultado[1]++;
                    break;
                case 'C':
                    resultado[2]++;
                    break;
                case 'D':
                    resultado[3]++;
                    break;
                case 'E':
                    resultado[4]++;
                    break;
            }
        }

        return resultado;
    }

    public float mediaIdade() {
        int soma = 0;

        for (int i = 0; i < qtdResposta; i++) {
            soma += respostaPesquisa[i].getIdate();
        }

        return soma / qtdResposta;
    }

    public String dados() {
        int ocorrencias[] = ocorrencias();
        StringBuilder saida = new StringBuilder("Participaram da pesquisa: " + qtdResposta + "\n\n");
        
        String valores[] = {
            "A(Ótimo): ",
            "B(Bom): ",
            "C(Regular): ",
            "D(Ruim): ",
            "E(Péssimo): "
        };
        
        for(int i = 0; i<ocorrencias.length; i++){
            saida.append("Resultados: \n").append(valores[i]).append(ocorrencias[i]).append("\n");
        }
        
        return saida.toString();
    }
}
