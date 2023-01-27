/*
Navpreet Estuardo Gojlia Once
25/01/23
*/
public class Pizza {
    /*
    Creamos los atributos que tendrá Pizaa, además valores constantes para los validadores
    */
    private static int Tdemanada=0;
    private static int Tservida=0;
    private String mida;
    private static final String midaF= "familiar";
    private static final String tipusF= "margarita";
    private String tipus;
    private boolean estat;

    public Pizza() {
    }

    /*
    Creo un constructor donde llamo a las funciones medida y tipo para validar que me mete valores validos, en
    caso de que me meta algo erroneo meteria el por defecto.
    Además llamo al atributo Tdemanada para que cada vez que se crea una pizza aumente una la cantidad de demanades.
    */
    public Pizza(String mida, String tipus){
        medida(mida);
        tipo(tipus);
        Tdemanada+=1;
        estat=false;
    }

/* Los validadores para que no me introduzca datos erroneos*/
    private void medida (String mida){
        String [] Arrmida = {"mitjana","familiar"};
        boolean Acmida=false;
        for(int i=0;i< Arrmida.length && !Acmida;i++){
        if(Arrmida[i].equals(mida)){
            Acmida=true;
            }
        }
        if(Acmida){
            this.mida=mida;
        }else{
            this.mida=midaF;
        }
    }
    private void tipo (String tipus){
        String [] Arrtipus = {"margarita", "quatre_formatges", "funghi"};
        boolean Actipus=false;
        for(int i=0;i< Arrtipus.length;i++) {
            if (Arrtipus[i].equals(tipus)) {
                Actipus=true;
            }
        }
        if(Actipus){
            this.tipus=tipus;
        }else{
            this.tipus=tipusF;
        }

    }
    /* Funciones para mostrar el número de veces que se ha pedido y servido*/
    public static int getTotalDemanades(){
        return Tdemanada;
    }
    public static int getTotalServides(){
        return Tservida;
    }
    /* Metodo para que no se sirva la misma pizza dos veces*/
    public void sirve(){
        if(estat) {
            System.out.println("aquesta pizza ja s'ha servit");
        }else{
            System.out.println("ja està pedida");
            Tservida+=1;
        }
        estat=true;
    }

    @Override
    public String toString() {
        return "Pizza " + tipus+" "+mida +
                ",demanada";
    }
}
