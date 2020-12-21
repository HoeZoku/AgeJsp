import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logic extends HttpServlet {

	//フォーマット用メソッド
	public static LocalDate convertStringToLocalDate(String date,DateTimeFormatter formatter) {
		return LocalDate.parse(date,formatter);
	}


	//年齢計算メソッド
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{

			//本日
			LocalDate today = LocalDate.now();
			//誕生日
			LocalDate birthday = convertStringToLocalDate(request.getParameter("birthday"),DateTimeFormatter.BASIC_ISO_DATE);

			//年齢計算(時刻基準)
			long age=ChronoUnit.YEARS.between(birthday, today);
			request.setAttribute("age", age);

		getServletConfig().getServletContext().
		getRequestDispatcher("/result.jsp").forward(request, response);
	}
}