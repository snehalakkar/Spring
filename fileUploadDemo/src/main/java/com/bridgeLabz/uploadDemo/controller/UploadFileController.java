package com.bridgeLabz.uploadDemo.controller;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UploadFileController {

	private static final String UPLOAD_DIRECTORY = "/home/bridgeit/UploadImages/";

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public ModelAndView uploadForm() {
		return new ModelAndView("uploadStatus");
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public ModelAndView saveFile(@RequestParam CommonsMultipartFile file, HttpSession session) throws IOException {

		if (file.isEmpty()) {
			return new ModelAndView("uploadStatus", "fileSuccess", "choose file to upload....");
		}

		String path = UPLOAD_DIRECTORY;
		String fileName = file.getOriginalFilename();
		System.out.println("path: " + path + " FileName :" + fileName);

		byte[] bytes = file.getBytes();
		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(new File(path + File.separator + fileName)));
		stream.write(bytes);
		stream.flush();
		stream.close();

		session.setAttribute("fileBytes", bytes);
		ModelAndView mv = new ModelAndView();
		mv.addObject("fileSuccess", "file uploaded successfully....");
		return new ModelAndView("uploadStatus", "fileName", file.getOriginalFilename());
	}

	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public ModelAndView displayFile(HttpSession session) throws IOException {

		System.out.println("*********************************");

		byte[] bytes = (byte[]) session.getAttribute("fileBytes");
		System.out.println("********************bytes*****************" + bytes);

		BufferedImage img = ImageIO.read(new ByteArrayInputStream(bytes));
		System.out.println("************************img*************" + img);

		return new ModelAndView("uploadStatus", "fileSuccess", "file Successfully uploaded....");
	}

	@RequestMapping(value = "/getImage", method = RequestMethod.GET)
	public void getImage(@RequestParam("name") String imageName, HttpServletResponse response) {

		try {
			byte[] bFile = Files.readAllBytes(new File(UPLOAD_DIRECTORY + imageName).toPath());

			response.setHeader("Cache-Control", "no-store");
			response.setHeader("Pragma", "no-cache");
			response.setDateHeader("Expires", 0);
			response.setContentType("image/jpeg");
			ServletOutputStream responseOutputStream = response.getOutputStream();
			responseOutputStream.write(bFile);
			responseOutputStream.flush();
			responseOutputStream.close();

			System.out.println(UPLOAD_DIRECTORY + imageName);
			System.out.println(bFile.length);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
