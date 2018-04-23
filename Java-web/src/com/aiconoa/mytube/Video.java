package com.aiconoa.mytube;

public class Video {
	
	private	String title;
	private String source;
	private long nbVues;
	private int durée;
	private int id;
	
	public Video(String title, String source, long nbVues, int durée, int id) {
		super();
		this.title = title;
		this.source = source;
		this.nbVues = nbVues;
		this.durée = durée;
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNbVues() {
		return nbVues;
	}

	public void setNbVues(long nbVues) {
		this.nbVues = nbVues;
	}

	public int getDurée() {
		return durée;
	}

	public void setDurée(int durée) {
		this.durée = durée;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getsource() {
		return source;
	}

	public void setsource(String source) {
		this.source = source;
	}
	
	


}
