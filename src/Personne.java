public class Personne {

    //attributs

    private String  nom;
    private int age;


    // constructeurs avec parametres

    public Personne(String nom, int age) {
        this.nom = nom;

        this.age = age;
    }


    // constructeur par defaut


    public Personne() {
    }


//getters et setters


    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //methodes
    public void modifierAge(){

        this.age += 1;
    }

    public boolean isAgeOr(){
 //   {if (age >=55){
 //       return true;
 //   }else{     return false;}
    return age>=55;}

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}
