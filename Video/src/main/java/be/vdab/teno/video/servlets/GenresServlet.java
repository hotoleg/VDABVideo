package be.vdab.teno.video.servlets;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.vdab.teno.video.entities.IExemplaar;
import be.vdab.teno.video.entities.IVideo;
import be.vdab.teno.video.enums.Genre;

/**
 * Servlet implementation class GenreServlet
 */
@WebServlet("/genres/")
public class GenresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "/WEB-INF/JSP/views/ToonFilmsPerGenre.jsp";
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final Genre genre = Genre.valueOf(request.getParameter("genre"));
		
		request.setAttribute("genre", genre);
		
		//TODO: haal films op uit DB
		request.setAttribute("films", new LinkedList<IVideo>(){{
			add( new IVideo() {				
				public void setNaam() {					
				}
				
				public Double getPrijs() {
					return 5.75;
				}
				
				public String getTitel() {					
					return "Een film";
				}
				
				public int getId() {					
					return 0;
				}
				
				public Genre getGenre() {
					return genre;
				}
				
				public List<IExemplaar> getExemplaren() {				
					return null;
				}
				
				public int getAantalBeschikbareExemplaren() {
					return 5;
				}

				public String getOmschrijving() {
					return "De omschrijving van deze film."; 
				}
			});
			add( new IVideo() {				
				public void setNaam() {					
				}
				
				public Double getPrijs() {
					return 5.75;
				}
				
				public String getTitel() {					
					return "Een andere film";
				}
				
				public int getId() {					
					return 0;
				}
				
				public Genre getGenre() {
					return genre;
				}
				
				public List<IExemplaar> getExemplaren() {				
					return null;
				}
				
				public int getAantalBeschikbareExemplaren() {
					return 3;
				}

				public String getOmschrijving() {					
					return "Omschrijving van deze andere film.";
				}
			});
		}});
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(VIEW);
		dispatcher.forward(request, response);
	}
}
