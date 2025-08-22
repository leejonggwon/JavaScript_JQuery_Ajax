package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.model.CoffeeDTO;

@WebServlet("/JavaToJson")
public class Ex04JavaToJson extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//5개의 커피정보를 보관하는 ArrayList를 생성
		ArrayList<CoffeeDTO> list = new ArrayList<>(); 
		list.add(new CoffeeDTO("아메리카노", 5000, "L"));
		list.add(new CoffeeDTO("카페라떼", 5500, "M"));
		list.add(new CoffeeDTO("카푸치노", 6000, "M"));
		list.add(new CoffeeDTO("카라멜마키아토", 6500, "L"));
		list.add(new CoffeeDTO("바닐라라떼", 6000, "M"));
		
		//Java객체를 -> JSON 데이터로 변환 
		Gson gson = new Gson(); //변환하기 위해 Gson객체 생성한다
		String jsonArr = gson.toJson(list); //자바 객체를 JSON 문자열로 바꿔주는 역할
		
		System.out.println(jsonArr);
		
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(jsonArr);
		
		
		
		
		
		
		
		
	}
}
