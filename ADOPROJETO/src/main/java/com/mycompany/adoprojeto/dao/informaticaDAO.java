/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adoprojeto.dao;
/**
 * 
 * @author danilo
 */

import com.mycompany.adoprojeto.model.MaquinaModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class informaticaDAO {

    public static boolean salvar(MaquinaModel obj) {

        boolean retorno = false;
        Connection conexao = null;
        try {
            // passo 1 - carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/lojainformaticadanilo";

            conexao = DriverManager.getConnection(url, "root", "");
            //PASSO 3  prepara o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO computadordanilo " + "(marca,Processador,HD)VALUES (?,?,?)");

            comandoSQL.setString(1, MaquinaModel.getMarcaPadrao());

            comandoSQL.setString(2, obj.getProcessador());

            comandoSQL.setString(3, obj.getHD());

            //passo 4 excutar
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {

                retorno = true;

            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o driver !!");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexão !!");
        }

        return retorno;

    }

    public static ArrayList<MaquinaModel> filtro(MaquinaModel obj) {

        ArrayList<MaquinaModel> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/lojainformaticadanilo";
            conexao = DriverManager.getConnection(url, "root", "");

            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM computadordanilo where processador = ?");
            comandoSQL.setString(1, obj.getProcessador());

            ResultSet amazenarConsulta = comandoSQL.executeQuery();
            if (amazenarConsulta != null) {

                while (amazenarConsulta.next()) {
                    MaquinaModel objcomputadorDAO = new MaquinaModel();

                    objcomputadorDAO.setIdComputador(amazenarConsulta.getInt("numeroDoComputador"));
                    objcomputadorDAO.setMarca(amazenarConsulta.getString("marca"));
                    objcomputadorDAO.setProcessador(amazenarConsulta.getString("Processador"));
                    objcomputadorDAO.setHD(amazenarConsulta.getString("HD"));
                    listaRetorno.add(objcomputadorDAO);
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("erro ao carrregar o drive !!");
        } catch (SQLException ex) {
            System.out.println(" Erro ao abrir conexão !!");

        }
        return listaRetorno;

    }

    public static boolean excluir(int id) {

        boolean retorno = false;
        Connection conexao = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/lojainformaticadanilo";

            conexao = DriverManager.getConnection(url, "root", "");

            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM computadordanilo WHERE numerodocomputador =?");

            comandoSQL.setInt(1, id);

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o driver !!");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexão !!");
        }
        return retorno;

    }

    public static boolean alterar(MaquinaModel obj) {

        boolean retorno = false;
        Connection conexao = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/lojainformaticadanilo";

            conexao = DriverManager.getConnection(url, "root", "");

            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE computadordanilo SET Processador = ?, HD = ? WHERE numeroDoComputador= ?");

            comandoSQL.setInt(3, obj.getIdComputador());
            comandoSQL.setString(1, obj.getProcessador());
            comandoSQL.setString(2, obj.getHD());

            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexao");
        }

        return retorno;
    }
}
