public class AppCtr {
    public static void main(String[] args) {


            //creation des objets

        Personne objP=new Personne("flouflou",55);

        // afficher l etat des objets avant la collaboration
        System.out.println(objP);
        System.out.println("==============================");

        //collaboration
        objP.modifierAge();
        System.out.println(objP.isAgeOr());

        //verifier age directement
        System.out.println(objP.getAge());
        System.out.println(objP.getNom());

    }
}
