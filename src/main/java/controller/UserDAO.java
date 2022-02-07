package controller;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;


public class UserDAO {
	

	public UserDAO() {
		
	}
	
	public void addUser(User user) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();

	try {
		PreparedStatement p = con.prepareStatement("insert into users (email, nome, pais) values (?, ?, ?)");
		p.setString(1, user.getEmail());
		p.setString(2, user.getNome());
		p.setString(3, user.getPais());
		
		System.out.println(p);
		p.executeUpdate();
		System.out.println("Comando executado");
		p.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
	public ArrayList<User> getListUser(){
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<User> lista = new ArrayList<User>();
		try {
			PreparedStatement p = con.prepareStatement("select * from users");
			ResultSet r = p.executeQuery();
			
			while (r.next()) {
				Integer id = r.getInt ("id");
				String email = r.getString("email");
				String nome = r.getString("nome");
				String pais = r.getString("pais");
				User u = new User(email, nome, pais);
				u.setId(id);
				lista.add(u);
			}
			r.close();
			p.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	public void removeUser(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("delete from users where id = ?");
			p.setInt(1, id);
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateUser(User updateUser) {
		Conexao c = Conexao.getInstance();
				Connection con = c.getConnection();
				
				try {
					PreparedStatement p = con.prepareStatement("update users set email = ?, nome = ?, pais = ? where id = ?");
					p.setString(1, updateUser.getEmail());
					p.setString(2, updateUser.getNome());
					p.setString(3, updateUser.getPais());
					p.setInt(4, updateUser.getId());
					System.out.println(p);
					p.executeUpdate();
					System.out.println("");
					p.close();
				}catch (SQLException e) {
					e.printStackTrace();
	
				}
	}

public User buscarUser(Integer id) {
	Conexao c = Conexao.getInstance();
	Connection con = c.getConnection();
	User u = null;
	try {
		PreparedStatement p = con.prepareStatement("select * from users where id = ?");
		p.setInt(1, id);
		ResultSet r = p.executeQuery();
		
		while (r.next()) {
			Integer id2 = r.getInt("id");
			String email = r.getString("email");
			String nome = r.getString("nome");
			String pais = r.getString("pais");
			u = new User(email, nome, pais);
			u.setId(id);
		}
		r.close();
		p.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return u;
	}

}

	

	


