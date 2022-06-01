public class ColonieSportive extends Colonie{

    int niveauSportif;

    public ColonieSportive(Integer code,String description,Integer duree,int niveauSportif){
        this.niveauSportif = niveauSportif;
        super(code,description,duree);
    }

    public int calculeCout(){
        int cout = this.niveauSportif*100;
        int rajoutCout = 0;

        for(int i = 0;i<this.getDuree();i++){
            rajoutCout = rajoutCout + 80;
        }
        cout = cout + rajoutCout;
        return cout;
    }
}