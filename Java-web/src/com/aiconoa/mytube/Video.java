package com.aiconoa.mytube;

public class Video {
	
	private	String title;
	private String source;
	private long nbVues;
	private int dur�e;
	
	public Video(String title, String source,long nbVues,int dur�e) {
		this.title = title;
		this.source = source;
		this.nbVues = nbVues;
		this.dur�e = dur�e;
		
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
