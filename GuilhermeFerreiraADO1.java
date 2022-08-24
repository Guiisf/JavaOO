package guilhermeferreiraado1;

/**
 *
 * @author guilh
 */
public class GuilhermeFerreiraADO1 {

    /**
     * @param args the command line arguments
     */
    private String nome;
    private String cor;
    private String habilidade;

    public GuilhermeFerreiraADO1(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
        System.out.println("O meu animal é");

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getHabilidade() {
        return this.habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

}
