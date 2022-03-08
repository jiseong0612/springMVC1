package hello.servlet.web.frontcontroller.v1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.v1.ControllerV1;

public class MemberListControllerV1 implements ControllerV1 {
	
	private MemberRepository memberRepository = MemberRepository.getInstance();

	@Override
	public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		List<Member> memberList = memberRepository.findAll();
		String path = "/WEB-INF/views/members.jsp";

		req.setAttribute("memberList", memberList);
		RequestDispatcher dispatcher = req.getRequestDispatcher(path);
		dispatcher.forward(req, res);
	}

}
