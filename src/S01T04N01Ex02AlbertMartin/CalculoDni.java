package S01T04N01Ex02AlbertMartin;

public class CalculoDni {

    private int dni=0;
//    private String dni;
    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public CalculoDni(int dni) {
        this.dni = dni;
    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    private static char calculateDniLetter(int dni){
        //int
        int restDivision = dni%23;
        char letter = LETTERS.charAt(restDivision);
        return letter;
    }

}
