package prog4.beadando;

import prog4.beadando.ws.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Random;

public class SoapClientServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
            try {
                Random rand = new Random();
                int randomNum = rand.nextInt(9999) + 1;
                String paddedId = String.format("tt%07d", randomNum);

                Movie service = new Movie();
                MovieDataService port = service.getSoapMovieDataServicePort();

                MovieDataRequest request = new MovieDataRequest();
                request.setMovieId(paddedId);

                MovieDataResponse response = port.getMovieData(request);

                req.setAttribute("movie", response);
            } catch (Exception e) {
                req.setAttribute("error", e.getMessage());
        }
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
