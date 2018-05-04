package mytube;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

	private User mapResultSetToUser(ResultSet rs) throws SQLException  {
		User u = new User();
		u.setId(rs.getInt("id")); // ou rs.getInt(1)
		u.setUsername(rs.getString("username")); // ou rs.getInt(2)
		u.setPassword(rs.getString("password"));
		u.setEmail(rs.getString("email"));

		return u;
	}
	
	public List<User> findAllUsers() {
		
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {
			
			Statement stmt = conn.createStatement();			
			ResultSet rs = stmt.executeQuery("SELECT * FROM user");
			
			List<User> users = new ArrayList<>();
			
			while(rs.next()) {			
				User u = mapResultSetToUser(rs);
				users.add(u);
			}
			
			return users;
			
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Fetch a user by its id.
	 * @param id the user id
	 * @return the user corresponding to the id or null if no user was found
	 * @throws RuntimeException if a problem occurs.
	 */
	public User findUserById(int id) {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {

			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM user WHERE id = ?");
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			if(! rs.next()) { 
				return null; 
			}
			
			return mapResultSetToUser(rs);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
