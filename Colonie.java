
public abstract class Colonie{
    Integer code;
    String description;
    Integer duree;

    public Colonie(Integer code,String description,Integer duree){
        this.code = code;
        this.duree = duree;

        if(description.length() < 200){
            throw new ExceptionDescriptionPasAssezLongue("La description n'est pas assez lognue !");
        }
        else{
            this.description = description;
        }


    }

    public Integer getDuree(){return this.duree}

    public final void setDescription(String newDescription){
        if(newDescription.length() < 200){
            throw new ExceptionDescriptionPasAssezLongue("La nouvelle description n'est pas assez lognue !");

        }
        else{
            this.description = newDescription;
        }
    }

    public Abstract int calculeCout();
}