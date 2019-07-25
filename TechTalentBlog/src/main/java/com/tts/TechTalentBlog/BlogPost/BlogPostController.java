package com.tts.TechTalentBlog.BlogPost;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogPostController {
	@Autowired
	private BlogPostRepository blogPostRepository;
	private static List<BlogPost> posts = new ArrayList<>();
	
	@GetMapping(value="/")
	public String index(BlogPost blogPost, Model model) {
		model.addAttribute("posts", posts);
		return "blogpost/index";
	}
	
	@PostMapping(value="/blogposts")
	public String addNewBlogPost(BlogPost blogPost, Model model) {
	    this.blogPostRepository.save(blogPost);
	    BlogPostController.posts.add(blogPost);
	    model.addAttribute("title", blogPost.getTitle());
	    model.addAttribute("author", blogPost.getAuthor());
	    model.addAttribute("blogEntry", blogPost.getBlogEntry());
	    return "blogpost/result";
	}
	
	@GetMapping(value="/blogposts/new")
	public String newBlog (BlogPost blogPost) {
	    return "blogpost/new";
	}
	
	@GetMapping(value="/blogposts/{id}")
	public String editPostWithId(@PathVariable Long id, Model model) {
		//
		return "blogpost/edit";
	}
	
	@RequestMapping(value="/blogposts/{id}", method=RequestMethod.DELETE)
	public String deletePostWithId(@PathVariable Long id, BlogPost blogPost) {
		this.blogPostRepository.deleteById(id);
		return "blogpost/index";
	}
}