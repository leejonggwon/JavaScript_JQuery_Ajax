package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;

@WebServlet("/Gson")
public class Ex02GSON extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//JsonObject: 자바에서 JSON 데이터를 만들고 다루는 객체
		JsonObject jsonObj = new JsonObject(); //JSON객체 생성 //GSON 라이브러리에서 제공하는 클래스
		
		//JSON객체에 속성과 값 추가하기
		jsonObj.addProperty("data", "Hello");  //addProperty("키", 값) → 이 객체에 ‘키’라는 속성을 추가하고 값을 넣는다
		jsonObj.addProperty("data2", "JSON객체생성성공"); //{"data":"Hello","data2":"JSON객체생성성공"}
		
		//만들어진 JSON객체 출력해보기
		System.out.println(jsonObj);
		
		//응답한 형식을 지정(JSON) + 한글데이터가 깨지지 않도록 설정한다
		response.setContentType("application/json; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print(jsonObj);
		
		
	}

}
