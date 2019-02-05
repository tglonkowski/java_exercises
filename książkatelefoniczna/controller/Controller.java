package KsiążkaTelefoniczna.controller;

import KsiążkaTelefoniczna.database.DBConnect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Controller {

    // obiekt klasy DBConnect
    DBConnect dao = new DBConnect();

    public void add(String imie, String nazwisko, String telefon) throws SQLException {

        String insertSQL = "INSERT INTO kontakty(imie, nazwisko, telefon) VALUES(?, ?, ?)";
        PreparedStatement st = dao.getCon().prepareStatement(insertSQL);
        st.setString(1, imie);
        st.setString(2, nazwisko);
        st.setString(3, telefon);
        st.execute();
        st.close();

        System.out.println("Czy chcesz zatwierdzić wprowadzone dane? T/N");
        Scanner sc = new Scanner(System.in);
        String dec = sc.nextLine().toUpperCase();
        if (dec.equals("T")){
            dao.getCon().commit();
        }
        else
            dao.getCon().rollback();
    }

    public void show() throws SQLException {

            String selectSQL = "SELECT * FROM kontakty";
            Statement st = dao.getCon().createStatement();
            ResultSet rs = st.executeQuery(selectSQL);

            while (rs.next()){
                int id = rs.getInt("ID");
                String imie = rs.getString("imie");
                String nazwisko = rs.getString("nazwisko");
                String telefon = rs.getString("telefon");

                System.out.println(id + " " + imie + " " + nazwisko + " " + telefon);
            }
        st.close();
    }

    public void delete(int id) throws SQLException {

        String deleteSQL = "DELETE FROM KONTAKTY WHERE ID="+id;
        PreparedStatement st = dao.getCon().prepareStatement(deleteSQL);
        st.execute();
        st.close();

        System.out.println("Czy chcesz zatwierdzić wprowadzone dane? T/N");
        Scanner sc = new Scanner(System.in);
        String dec = sc.nextLine().toUpperCase();
        if (dec.equals("T")){
            dao.getCon().commit();
        }
        else
            dao.getCon().rollback();
    }

    public void edit(int id, String kolumna, String wartosc) throws SQLException {

        String updateSQL = "UPDATE kontakty set "+kolumna+" =? WHERE ID=?";
        PreparedStatement st = dao.getCon().prepareStatement(updateSQL);
        st.setString(1,wartosc);
        st.setInt(2, id);
        st.execute();
        st.close();

        System.out.println("Czy chcesz zatwierdzić wprowadzone dane? T/N");
        Scanner sc = new Scanner(System.in);
        String dec = sc.nextLine().toUpperCase();
        if (dec.equals("T")){
            dao.getCon().commit();
        }
        else
            dao.getCon().rollback();

    }

    public void search(String wartosc) throws SQLException {

        Statement st = dao.getCon().createStatement();
        ResultSet rs = st.executeQuery( "SELECT * FROM kontakty WHERE imie LIKE '%"+
                wartosc+ "%' OR nazwisko LIKE '&"+wartosc+"%'" +
                "OR telefon LIKE '%"+wartosc+"%'");

        while (rs.next()) {
            int id = rs.getInt("ID");
            String imie = rs.getString("imie");
            String nazwisko = rs.getString("nazwisko");
            String telefon = rs.getString("telefon");

            System.out.println(id + " " + imie + " " + nazwisko + " " + telefon);

        }

        rs.close();

        /*
        while (rs.next()){
            int id = rs.getInt("ID");
            String imie = rs.getString("imie");
            String nazwisko = rs.getString("nazwisko");
            String telefon = rs.getString("telefon");

            if(imie.contains(wartosc) || nazwisko.contains(wartosc) || telefon.contains(wartosc)){

                System.out.println(id + " " + imie + " " + nazwisko + " " + telefon);

            }
        }*/
    }
}
