package com.aiconoa.mytube;

public class Video {
	
	private	String title;
	private String source;
	private long nbVues;
	private int durée;
	
	public Video(String title, String source,long nbVues,int durée) {
		this.title = title;
		this.source = source;
		this.nbVues = nbVues;
		this.durée = durée;
		
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
