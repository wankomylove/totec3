package dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dto.Gakkyoku;

public class MusicDao {
	
	private static final String NAMESPACE = "Gakkyoku";
	static SqlSession session = null;
	
	public Gakkyoku get(String id){
		Gakkyoku kyoku = (Gakkyoku)getSession().selectOne(NAMESPACE+".select", id);
		return kyoku;
	}
	
	private SqlSession getSession() {
	try {
	if(session == null) {
		Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
		session = new SqlSessionFactoryBuilder().build(reader).openSession();
	}
	} catch (IOException e) {
		e.printStackTrace();
	}
	return session;
	}
}
