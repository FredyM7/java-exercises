package org.fmunera.example.jdbc.repository;


import org.fmunera.example.jdbc.model.User;
import org.fmunera.example.jdbc.util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements Repository<User> {

    public Connection getConnection() throws SQLException {
        return DatabaseConnection.getInstance();
    }

    @Override
    public List<User> list() {

        List<User> users = new ArrayList<>();

        try(Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("select * from users")){

            while(rs.next()){
                User user = new User();
                user.setId(rs.getLong(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setEmail(rs.getString(4));

                users.add(user);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return users;
    }

    @Override
    public void save(User user) {

        String sql;

        if(user.getId() != null && user.getId()>0){
            sql = "update users set username=?, password=?, email=? where id=?";
        } else {
            sql = "insert into users (username, password, email) values(?, ?, ?) ";
        }

        try(PreparedStatement stmt = getConnection().prepareStatement(sql)){

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getEmail());

            if(user.getId() != null && user.getId()>0){
                stmt.setLong(4, user.getId());
            }

            stmt.executeUpdate();

            System.out.println("Registro exitoso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Long id) {

        try(PreparedStatement stmt = getConnection().prepareStatement("delete from users where id=?")){

            stmt.setLong(1, id);
            stmt.executeUpdate();

            System.out.println("Eliminado exitosamente!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
