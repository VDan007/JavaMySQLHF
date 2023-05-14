import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DbQuerier{

    Connection connection;

    DbQuerier(){

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","rootpassword");
        }catch(Exception e){
            System.out.println(e);
        }

        
     }

    public void task1(){

        try{
            
        PreparedStatement sqlQuery = connection.prepareStatement("select cim, dij from oscar.filmek order by dij desc , cim asc;");
        ResultSet result = sqlQuery.executeQuery();
        printer(result);

        }catch(Exception e){
            System.out.println(e);
        }
     }

    public void task2(){

        try{

        PreparedStatement sqlQuery = connection.prepareStatement("SELECT cim, dij, jelol FROM oscar.filmek  WHERE ev < 1950 AND dij <= 3  ORDER BY cim ASC;");
        ResultSet result = sqlQuery.executeQuery();
        printer(result);

        }catch(Exception e){
            System.out.println(e);
        }
     }

    public void task3(){

        try{

        PreparedStatement sqlQuery = connection.prepareStatement("SELECT cim, ev FROM oscar.filmek ORDER BY jelol DESC LIMIT 5;");
        ResultSet result = sqlQuery.executeQuery();
        printer(result);

        }catch(Exception e){
            System.out.println(e);
        }
     }

    public void task4(){

        try{

        PreparedStatement sqlQuery = connection.prepareStatement("select cim, dij from oscar.filmek where ev < 2000 order by dij desc limit 5;");
        ResultSet result = sqlQuery.executeQuery();
        printer(result);

        }catch(Exception e){
            System.out.println(e);
        }
     }

    public void task5(){

        try{

        PreparedStatement sqlQuery = connection.prepareStatement("SELECT cim, jelol, dij FROM oscar.filmek WHERE cim LIKE '%King%' ORDER BY jelol DESC, dij DESC;");
        ResultSet result = sqlQuery.executeQuery();
        printer(result);

        }catch(Exception e){
            System.out.println(e);
        }
     }

    public void task6(){

        try{

        PreparedStatement sqlQuery = connection.prepareStatement("select *  from oscar.filmek where dij = jelol order by ev asc, cim asc;");
        ResultSet result = sqlQuery.executeQuery();
        printer(result);

        }catch(Exception e){
            System.out.println(e);
        }
     }

    public void task7(){

        try{

        PreparedStatement sqlQuery = connection.prepareStatement("select cim, ev from oscar.filmek where ev between 1939 and 1945;");
        ResultSet result = sqlQuery.executeQuery();
        printer(result);

        }catch(Exception e){
            System.out.println(e);
        }
     }

    public void task8(){

        try{

        PreparedStatement sqlQuery = connection.prepareStatement("select cim  from oscar.filmek where ev = 1992;");
        ResultSet result = sqlQuery.executeQuery();
        printer(result);

        }catch(Exception e){
            System.out.println(e);
        }
     }

    public void task9(){

        try{

        PreparedStatement sqlQuery = connection.prepareStatement("select cim from oscar.filmek where cim like 'The%' order by cim;");
        ResultSet result = sqlQuery.executeQuery();
        printer(result);

        }catch(Exception e){
            System.out.println(e);
        }
     }

    public void task10(){

        try{

        PreparedStatement sqlQuery = connection.prepareStatement("select * from oscar.filmek where ev > 1960 and jelol = dij order by jelol desc, ev desc;");
        ResultSet result = sqlQuery.executeQuery();
        printer(result);

        }catch(Exception e){
            System.out.println(e);
        }
     }



    private static void printer(ResultSet rs){

        try{
            int columnsNumber = rs.getMetaData().getColumnCount();
            while(rs.next()){
                for(int i = 1; i <= columnsNumber; i++){
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println("");
            }

        }catch(Exception e){
            System.out.println(e);
        }


     }
}