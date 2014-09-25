package service;

import dao.MusicDao;
import dto.Gakkyoku;

public class MusicService {
	private MusicDao dao;
	
	public MusicService(){
		if(this.dao ==null)
			this.dao = new MusicDao();
	}
	
	public Gakkyoku get(String id){
		return new Gakkyoku();
	}
	
}
