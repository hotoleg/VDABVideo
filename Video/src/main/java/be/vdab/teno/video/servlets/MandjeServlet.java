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

import be.vdab.teno.video.entities.IBestellijn;
import be.vdab.teno.video.entities.IExemplaar;
import be.vdab.teno.video.entities.IVideo;
import be.vdab.teno.video.enums.Genre;

/**
 * Servlet implementation class GenreServlet
 */
@WebServlet("/mandje")
public class MandjeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "/WEB-INF/JSP/views/Mandje.jsp";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// TODO: request.setAttribute("bestellijnen", mandje.getBestellijenen());
		
		request.setAttribute("bestellijnen", new LinkedList<IBestellijn>() {
			
			private static final long serialVersionUID = 1L;

			{
				add(new IBestellijn() {
					public IVideo getVideo() {

						return new IVideo() {
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
								return Genre.Actie;
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
						};
					}

					public double getPrijs() {
						// TODO Auto-generated method stub
						return 11.50;
					}

					public int getAantal() {
						// TODO Auto-generated method stub
						return 2;
					}
				});
				add(new IBestellijn() {
					public IVideo getVideo() {

						return new IVideo() {
							public void setNaam() {
							}

							public Double getPrijs() {
								return 5.75;
							}

							public String getTitel() {
								return "Andere film";
							}

							public int getId() {
								return 0;
							}

							public Genre getGenre() {
								return Genre.Avontuur;
							}

							public List<IExemplaar> getExemplaren() {
								return null;
							}

							public int getAantalBeschikbareExemplaren() {
								return 5;
							}

							public String getOmschrijving() {
								return "Omschrijving van deze andere film.";
							}
						};
					}

					public double getPrijs() {
						// TODO Auto-generated method stub
						return 11.50;
					}

					public int getAantal() {
						// TODO Auto-generated method stub
						return 2;
					}
				});

			}
		});

		RequestDispatcher dispatcher = request.getRequestDispatcher(VIEW);
		dispatcher.forward(request, response);
	}
}
