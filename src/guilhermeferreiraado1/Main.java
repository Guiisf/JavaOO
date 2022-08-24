
package guilhermeferreiraado1;

/**
 *
 * @author guilh
 */
public class Main {
    public static void main(String[] args) {
        
        GuilhermeFerreiraADO1 GuilhermeFerreiraADO1 = new GuilhermeFerreiraADO1("Gafanhoto", "Verde");
        
        
        
        System.out.println(GuilhermeFerreiraADO1.getNome());
        System.out.println(GuilhermeFerreiraADO1.getCor());
        
        GuilhermeFerreiraADO1.setHabilidade("Pula muito alto");
        System.out.println(GuilhermeFerreiraADO1.getHabilidade());
        
        //Animal 2
        GuilhermeFerreiraADO1 GuilhermeFerreiraADO12 = new GuilhermeFerreiraADO1("Girafa", "Amarela com pintas pretas");
        
        System.out.println(GuilhermeFerreiraADO12.getNome());
        System.out.println(GuilhermeFerreiraADO12.getCor());
        
        GuilhermeFerreiraADO12.setHabilidade("Consegue comer as coisas mais altas da floresta");
        System.out.println(GuilhermeFerreiraADO12.getHabilidade());
        
        
        
    }
}
