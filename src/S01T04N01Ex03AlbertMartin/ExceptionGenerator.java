package Ex3;

public class ExceptionGenerator {

    String exceptionGenerator;

    public ExceptionGenerator(String exceptionGenerator) {
        this.exceptionGenerator = exceptionGenerator;
    }

    public void trowException()throws ArrayIndexOutOfBoundsException{
        throw new ArrayIndexOutOfBoundsException();
    }
}

