package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MusicService;

import com.fasterxml.jackson.databind.ObjectMapper;

import dto.Gakkyoku;

@WebServlet("/api/musics")
public class GetAllController extends HttpServlet {
    
	private static MusicService musicService;
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		if(id == null||id.isEmpty()){
			System.out.println("not exist id!");
		}
		if(musicService == null){
			musicService = new MusicService();
		}
		Gakkyoku kyoku = musicService.get(id);
		if(kyoku == null){
			
		}
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(kyoku);
		res.setContentType("");
		PrintWriter pr = res.getWriter();
		pr.print(json);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
