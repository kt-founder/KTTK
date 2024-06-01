package demo.controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.StreamUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import demo.entity.Image;
import demo.service.ImageService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ImageController {
	@Autowired
	private ImageService imageService;
	 @PostMapping("/detection/add")
	 public String addImagePost(HttpServletRequest request,@RequestParam("image") MultipartFile file) throws IOException, SerialException, SQLException
	    {
	        byte[] bytes = file.getBytes();
	        Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
	       // System.out.println(blob);
	        Image image = new Image();
	        image.setImage(blob);
	        //System.out.println(image.getImage());
	        imageService.createImage(image);
	        return "redirect:/detection";
	    }
//	 @GetMapping("detection/add")
//	    public String addImage(){
//		 return "detection";
//	    }
	 @GetMapping("/api/getImage")
	    public void getImage(HttpServletResponse response) throws IOException, SQLException {
	        // Doc anh tu csdl
	        Image image = imageService.view();
	        byte[] imageData = null;
	        imageData = image.getImage().getBytes(1,(int) image.getImage().length());

	        // Phan hoi
	        response.setContentType("image/jpeg");

	        // Gui du lieu
	        response.getOutputStream().write(imageData);
	    }
		 @GetMapping("/api/getImage1")
		    public void getImage1(HttpServletResponse response) throws IOException, SQLException {
		        // Lay anh tu csdl
		        Image image = imageService.view2();
		        byte[] imageData = null;
		        imageData = image.getImage().getBytes(1,(int) image.getImage().length());
	
		        // Phan hoi
		        response.setContentType("image/jpeg");
	
		       // Gui du lieu
		        response.getOutputStream().write(imageData);
		    }
}
