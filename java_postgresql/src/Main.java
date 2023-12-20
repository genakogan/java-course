import java.sql.Connection;
public class Main {
    public static void main(String[] args) {
        DbFunctions db=new DbFunctions();
        // db connection using postgres
        Connection conn=db.connect_to_db("java-course","postgres","1234");
        //db.createTable(conn,"employee");
        //db.insert_row(conn,"employee","GK","Voyager-1");
        db.update_name(conn,"employee","GK","RGK");
        //db.search_by_name(conn,"employee","RGK");
        //db.delete_row_by_name(conn,"employee","RGK");
        //db.delete_row_by_id(conn,"employee",4);
        db.read_data(conn,"employee");
        //db.delete_table(conn,"employee");

    }
}