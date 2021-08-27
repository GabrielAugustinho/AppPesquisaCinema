package classes;

/**
 *
 * @author aluno
 */
public class Espectador {
    // atributos
    private byte idate;
    private char opiniao;
    
    // Construtor
    public Espectador() {
    }
    
    public Espectador(byte idate, char opiniao) {
        this.idate = idate;
        this.opiniao = opiniao;
    }
    
    // Métodos
    public byte getIdate() {
        return idate;
    }

    public void setIdate(byte idate) {
        this.idate = idate;
    }

    public char getOpiniao() {
        return opiniao;
    }

    public void setOpiniao(char opiniao) {
        this.opiniao = opiniao;
    }
    
    
}
