package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax")
public class Ex01Ajax extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("서버에 요청이 들어옴");
		
		String data = request.getParameter("data"); //클라이언트에서 서버(Servlet)로 전달된 데이터(파라미터)를 가져오는 메서드
		System.out.println("넘겨받은 데이터: " + data);
		
		String data2 = request.getParameter("data2");
		System.out.println("넘겨받은 데이터: " + data2);
	
		
		//요청한 곳으로 응답해주기
		PrintWriter out = response.getWriter(); 
		//response: 서블릿에서 서버가 클라이언트에게 보내는 응답(response) 객체
		//getWriter(): 응답에 문자 데이터를 쓸 수 있는 스트림(Stream) 을 얻는 메소드
		//PrintWriter: 문자 단위 출력 스트림, 서버에서 클라이언트로 데이터를 보내줄때 통로역할하는 객체 
		//out: 서버가 클라이언트로 문자(텍스트)를 보내는 도구
		
		//out.println("response success");
		
		//JSON형식으로 데이터 응답하기
		//JSON형식: {"data":"Hello", "num":1234, "bool":true}
		//- key는 반드시 문자열로 정의해야 한다
		out.print("{\"data\":\"Hello\", \"num\":1234, \"bool\":true}"); 
		// \":큰따옴표 앞에 역슬러시를 붙여줘야 문자열을 사용할 수 있다 
	}
	
	
	
	
}
