package vn.com.rabbit.controller.auths;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.rabbit.common.Page;
import vn.com.rabbit.entity.Category;
import vn.com.rabbit.service.dto.response.ResponseMess;

@Controller
@RequestMapping(value = "/quan-tri/post")
public class PostController {
	
	//private PostService

	@GetMapping("")
	public String categoryPage(Model model,
			@RequestParam(defaultValue = "", value = "tu-khoa") String name,
			@RequestParam(defaultValue = "1") Integer pageNo,
			@RequestParam(defaultValue = "15") Integer pageSize,
			@RequestParam(defaultValue = "DESC") String sortType,
			@RequestParam(defaultValue = "name") String sortBy,
			HttpSession session) {
	//	ResponseMess<Category> categoryMess = categoryService.getAllCategorys(pageNo, pageSize, name, sortType, sortBy);
	//	model.addAttribute("categoryMess", categoryMess);
		
		return Page.Post;
	}
	
	@GetMapping("/them-post")
	public String themPostPage() {
		return Page.AddPost;
	}
}
