package Kino.controller;

import Kino.database.DBConnect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Controller {

    DBConnect dao = new DBConnect();

    //###################KINO####################

    public void showKino() throws SQLException {

        String selectSQL = "SELECT * FROM kino";
        Statement st = dao.getCon().createStatement();
        ResultSet rs = st.executeQuery(selectSQL);

        while (rs.next()){
            int id = rs.getInt("ID");
            String nazwa = rs.getString("nazwa");

            System.out.println(id + " " + nazwa);
        }
        st.close();
    }

    public void addKino(String nazwa) throws SQLException {

        String insertSQL = "INSERT INTO kino(nazwa) VALUES(?)";
        PreparedStatement st = dao.getCon().prepareStatement(insertSQL);
        st.setString(1, nazwa);
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

    public void deleteKino(int id) throws SQLException {

        String deleteSQL = "DELETE FROM kino WHERE ID="+id;
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

    //##################FILMY###############

    public void showFilm() throws SQLException {

        String selectSQL = "Select f.ID, f.nazwa, k.nazwa as kino from filmy as f left join kino as k ON k.id = f.kino_ID;";
        Statement st = dao.getCon().createStatement();
        ResultSet rs = st.executeQuery(selectSQL);

        while (rs.next()){
            int id = rs.getInt("ID");
            String nazwaFilm = rs.getString("nazwa");
            String nazwaKino = rs.getString("kino");

            System.out.println(id + ". Film: " + nazwaFilm + ". Kino: " + nazwaKino);
        }
        st.close();

    }

    public void addFilm(String nazwaFilm, int idKino) throws SQLException {
        String insertSQL = "INSERT INTO filmy(nazwa, kino_ID) VALUES(?, ?)";
        PreparedStatement st = dao.getCon().prepareStatement(insertSQL);
        st.setString(1, nazwaFilm);
        st.setInt(2, idKino);
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

    public void deleteFilm(int id) throws SQLException {

        String deleteSQL = "DELETE FROM filmy WHERE ID="+id;
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

    //#############BILETY#########

    public void addBilet(int idFilm, int iloscBilet ) throws SQLException {
        String insertSQL = "INSERT INTO bilety(ilosc, filmy_ID) VALUES(?, ?)";
        PreparedStatement st = dao.getCon().prepareStatement(insertSQL);
        st.setInt(1, iloscBilet);
        st.setInt(2, idFilm);
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

    public void showBilet() throws SQLException {
        String selectSQL = "SELECT \n" +
                "    b.ID, b.ilosc, f.nazwa AS film, k.nazwa\n" +
                "FROM\n" +
                "    bilety AS b\n" +
                "        LEFT JOIN\n" +
                "    filmy AS f ON f.id = b.filmy_ID left join kino as k on f.kino_ID = k.id;";
        Statement st = dao.getCon().createStatement();
        ResultSet rs = st.executeQuery(selectSQL);

        while (rs.next()){
            int id = rs.getInt("ID");
            String ilosc = rs.getString("ilosc");
            String nazwaFilm = rs.getString("film");
            String nazwaKino = rs.getString("nazwa");

            System.out.println(id + ". " + ilosc + " biletów na film: "+ nazwaFilm + ". Kino: " + nazwaKino);
        }
        st.close();
    }

    public void deleteBilet(int id) throws SQLException {

        String deleteSQL = "DELETE FROM bilety WHERE ID="+id;
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
}
