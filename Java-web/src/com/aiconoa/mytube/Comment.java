package com.aiconoa.mytube;

public class Comment {
	private User surfer;
	private	String comment;
	
	public Comment(User surfer, String comment) {
		
		this.surfer = surfer;
		this.comment = comment;
	}

	public User getSurfer() {
		return surfer;
	}

	public void setSurfer(User surfer) {
		this.surfer = surfer;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	

}
