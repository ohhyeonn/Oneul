package com.oneul.web.controller;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.oneul.web.entity.Member;
import com.oneul.web.service.MemberService;

@Controller("MemberController")
@RequestMapping("/member/")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@RequestMapping("login")
	public String login() {
		return "member/login";
	}
	
	@RequestMapping("signup")
	public String signup() {
		return "member/signup";		
	}
	
	@RequestMapping("logintest")
	public String logintest() {
		return "member/logintest";		
	}
	
	
	@PostMapping("reg")
	public String reg(String username,
						String password,
						String name,
						Date birthday,
						String email) {
		
		Member member = new Member();
		member.setUserId(username);
		member.setPassword(password);
		member.setName(name);
		member.setBirthday(birthday);
		member.setEmail(email);
		
		service.insert(member);
		
		return "redirect:login";
		//헬로
	}
	
	
	@RequestMapping("uploadtest")
	public String upload() {
		return "member/uploadtest";
	}
	
	@PostMapping("upload")
	public String upload(MultipartFile file, HttpServletRequest request) {
		
		String fileName = file.getOriginalFilename();//파일이름
		
		ServletContext application = request.getServletContext();
		String path = "/upload";
		String realPath = application.getRealPath(path);
		
		File pathFile = new File(realPath);
		if(!pathFile.exists()) //upload할 경로 존재x하면
			pathFile.mkdirs(); //경로 생성
		
		String filePath = realPath + File.separator + fileName;
		
		File saveFile = new File(filePath); //저장할 파일
		
		try {
			file.transferTo(saveFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "member/uploadtest";
	}

}

