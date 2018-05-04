package mytube;

import java.sql.Date;

public class Video {

	private Integer id;
	private String title;
	private User author;
	private String source;
	private Date datePub;
	private String comment;
	private String description;
	private Integer nbVues;
	private Integer nbLikes;
	private Integer nbDisLikes;

	public Video() {

	}

	public Video(Integer id, String title, String source, Date datePub, String comment, String description, Integer nbVues,
			Integer nbLikes, Integer nbDisLikes) {
		this.id = id;
		this.title = title;
		this.author = new User();
		this.source = source;
		this.datePub = datePub;
		this.comment = comment;
		this.description = description;
		this.nbVues = nbVues;
		this.nbLikes = nbLikes;
		this.nbDisLikes = nbDisLikes;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getDatePub() {
		return datePub;
	}

	public void setDatePub(Date datePub) {
		this.datePub = datePub;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getNbVues() {
		return nbVues;
	}

	public void setNbVues(int nbVues) {
		this.nbVues = nbVues;
	}

	public Integer getNbLikes() {
		return nbLikes;
	}

	public void setNbLikes(int nbLikes) {
		this.nbLikes = nbLikes;
	}

	public Integer getNbDisLikes() {
		return nbDisLikes;
	}

	public void setNbDisLikes(int nbDisLikes) {
		this.nbDisLikes = nbDisLikes;
	}
	
	@Override
	public String toString() {
		return "[id: " + id + ", title: " + title +
				", author: "  + author +  ", comment: "  +comment+ "]";
	}
	

}