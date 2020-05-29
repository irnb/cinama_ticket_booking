package cinemaHamid.model;
import java.sql.*;

public class dbHandler {
    Connection c = null;
    Statement stmt = null ;


    public dbHandler (){

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:src/cinemaHamid/db/cinemaHamid.db");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
    public void insertSalon(){

    }
    public void deleteSalon(){

    }
    public void modifySalon(){

    }
    public void readSalon(){

    }

    public void insertFilm(){

    }
    public void deleteFilm(){

    }
    public void readFilm(){

    }

    public void insertSans(){

    }
    public void deleteSans(){

    }
    public void readSans(){

    }

    public void insertBilit(){

    }
    public void deleteBilit(){

    }
    public void readBilit(){
        
    }

}
