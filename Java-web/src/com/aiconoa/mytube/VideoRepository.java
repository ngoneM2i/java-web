package com.aiconoa.mytube;

import java.util.ArrayList;
import java.util.List;

import com.aiconoa.mytube.Video;

public class VideoRepository {
	/**
	 * Retourne une list de video en fonction de id en fonction de son id
	 * @param ListVideoId
	 * @return la listVideo ou null si aucune listVideo ne correspond à l'identifiant
	 * 
	 * 
	 */
	
	private List<Video> videos;
	
	
	public VideoRepository(List<Video> videos) {
		super();
		this.videos = videos;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public ArrayList<Video> findById(int ListVideoId) {
		if(ListVideoId == 1) {
			ArrayList<Video> ListVideo = new ArrayList<>();
			videos.add(new Video("peppa", "da", 1,5, 1));
			videos.add(new Video("bob", "da", 2,5, 1));
			return videos;
		} else if (ListVideoId == 2) {
			ArrayList<Video> todoList = new ArrayList<>();
			videos.add(new Video("peppa", "da", 1,5, 2));
			videos.add(new Video("peppa", "da", 1,5, 2));
			videos.add(new Video("peppa", "da", 1,5, 6));
			return videos;
		} else {
			return null;
		}
	}


	
	
	List<Video> findTrending() {
		
		return 	
		
	}
	
	
	 List<Video> findRecommended() {
		
	}
	
	Video findById(long id) {
		
		 return videos.getId() != null;
		
	}

}
