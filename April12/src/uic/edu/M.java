package uic.edu;

import java.sql.SQLException;

public class M<T extends Exception> {
    private void throwIt( final Exception t ) throws T {
        throw (T)t;
    }

    public static void main(String[] args) {
        try {
            new M<RuntimeException>().throwIt(new SQLException());

        } catch(final Exception ex){

            ex.printStackTrace();
        }
    }
}
