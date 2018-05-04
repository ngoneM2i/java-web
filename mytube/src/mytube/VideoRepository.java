package mytube;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VideoRepository {

	private Video mapResultSetToVideo(ResultSet rsVideo) throws SQLException {
		//map the video
		Video v = new Video();
		v.setId(rsVideo.getInt("id")); // ou rs.getInt(1)
		v.setTitle(rsVideo.getString("title")); // ou rs.getInt(2)
		v.setSource(rsVideo.getString("source"));
		v.setDescription(rsVideo.getString("description"));
		v.setComment(rsVideo.getString("comment"));
		v.setDatePub(rsVideo.getDate("date"));
		v.setNbLikes(rsVideo.getInt("nblikes"));
		v.setNbDisLikes(rsVideo.getInt("nbDisLikes"));
		v.setNbVues(rsVideo.getInt("nbVues"));
		
		//map the user
		User u = new User();
		u.setId(rsVideo.getInt("id")); // ou rs.getInt(1)
		u.setUsername(rsVideo.getString("user.username")); // ou rs.getInt(2)
		u.setPassword(rsVideo.getString("user.password"));
		u.setEmail(rsVideo.getString("user.email"));
		
		// maps the relation video authored by user 
		v.setAuthor(u);
				
		return v;
	
	 }
	
	public List<Video> findAllVideos() {
		
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {
			
			Statement stmt = conn.createStatement();			
			ResultSet rs = stmt.executeQuery("SELECT * FROM video");
			
			List<Video> videos = new ArrayList<>();
			
			while(rs.next()) {			
				Video v = mapResultSetToVideo(rs);
				videos.add(v);
			}
			
	 return videos;
			
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
	public Video findVideoById(int id) {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {

			PreparedStatement pstmt = 
			//conn.prepareStatement("SELECT * FROM video WHERE id = ?");
			conn.prepareStatement("SELECT video.*, user.* FROM  video INNER JOIN"
					    + " user ON video.author_id=user.id INNER JOIN comment"
					    + " ON comment.user_id=comment.id");
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			if(! rs.next()) { 
				return null; 
			}
			
			return mapResultSetToVideo(rs);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	List<Video> findTrending() {
	List<Video> videos = findAllVideos();
    List<Video> trending = new ArrayList<>();
     for (Video v : videos) {
    	 if(v.getNbVues() == 10)
    		 trending.add(v);
     }
     return trending;
    }
       

	 List<Video> findRecommended() {
		 List<Video> videos = findAllVideos();
		 List<Video> recommended = new ArrayList<>();
	     for (Video v : videos) {
	    	 if(v.getNbLikes()== 10 && v == findTrending())
	    		 recommended.add(v);
	     }
	     return recommended;
	     }
	
	}
	
	


