package com.aiconoa.mytube;

public class Video {
	
	private	String title;
	private String source;
	private long nbVues;
	private int dur�e;
	private int id;
	
	public Video(String title, String source, long nbVues, int dur�e, int id) {
		super();
		this.title = title;
		this.source = source;
		this.nbVues = nbVues;
		this.dur�e = dur�e;
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

	public int getDur�e() {
		return dur�e;
	}

	public void setDur�e(int dur�e) {
		this.dur�e = dur�e;
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
