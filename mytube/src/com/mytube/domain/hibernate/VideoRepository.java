package com.mytube.domain.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import mytube.HibernateUtils;


public class VideoRepository {
	public Video findVideoById(int id) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Video v = session.find(Video.class, id);
		System.out.println(v);
		return v;
		
		}
	
	public Video findVideoWithComments(int idVideo) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Video v = session.find(Video.class, idVideo);
		
		String queryHQL =" SELECT v FROM Video v JOIN FETCH v.comments WHERE v.idVideo = :id";
		Query<Video> query = session.createQuery(queryHQL, Video.class);
		List<Video> resultsQuery = query.getResultList();
		
		return v;
	
	}
	
		
}
