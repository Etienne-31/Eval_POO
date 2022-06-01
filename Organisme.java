
public class Organisme{

    private Integer codeUnique;
    private String acronyme;
    private String adresse;
    private List<Colonie> listColonie;
    private static List<Integer> listCodeUnique = new ArrayList<Integer>;
    private static int nbColonie = 0;
    public Organisme(){}
    public Organisme(Integer codeUnique,String acronyme,String adresse){
        this.codeUnique = codeUnique;
        this.acronyme = acronyme;
        this.adresse = adresse;
        this.listColonie = new ArrayList<Colonie>;

        for(Integer code : listCodeUnique){
            if(codeUnique == code){
                throw new ExceptionCodeUniqueDejaExistant("Le code unique est déjà existant");
            }
        }
        this.codeUnique = codeUnique;

        public String toString(){
            String retour = " "+this.codeUnique+ " ,"+this.acronyme+" : "+this.adresse;
        }

        public void addColonie(Colonie colonie){
            nbColonie++;
            this.listColonie.add(colonie);
        }

        public static int getNbColonie(){return nbColonie;}

    }
}