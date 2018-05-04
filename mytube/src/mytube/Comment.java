package mytube;


public class Comment {
	
	private Integer id;
	private User surfer;
	private	String content;
	
	public Comment() {
	}

	public Comment(Integer id, User surfer, String content) {
		
		this.id = id;
		surfer = new User();
		this.content = content;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getSurfer() {
		return surfer;
	}

	public void setSurfer(User surfer) {
		this.surfer = surfer;
	}

	public String getComment() {
		return content;
	}

	public void setComment(String comment) {
		this.content = comment;
	}
	
	@Override
	public String toString() {
		return "[id: " + surfer.getId() + ", surfer.getUsername(): " + surfer.getUsername() +
				", surfer.getPassword(): "  + surfer.getPassword() +  ", surfer.getEmail(): "  + surfer.getEmail() + 
				", content: " + content + "]";
	}
	
	
}