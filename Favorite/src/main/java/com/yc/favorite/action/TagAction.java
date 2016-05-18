package com.yc.favorite.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.ModelDriven;
import com.yc.favorite.entity.Favorite;
import com.yc.favorite.entity.Tag;
import com.yc.favorite.service.FavoriteService;
import com.yc.favorite.service.TagService;
import com.yc.favorite.service.impl.FavoriteServiceImpl;
import com.yc.favorite.service.impl.TagServiceImpl;




public class TagAction implements ModelDriven<Tag>,ServletRequestAware{
	private Tag tag;
	private FavoriteService favoriteService;
	private TagService tagService;
	private HttpServletRequest request;
	
	public TagAction(){
		favoriteService=new FavoriteServiceImpl();
		tagService=new TagServiceImpl();
	}
	
	
	
	public String getAll(){	
		List<Tag> tag=tagService.getAll();
		List<Favorite> favorite=favoriteService.getAll();
		request.getSession().setAttribute("tag",tag);
		request.getSession().setAttribute("favorite",favorite);
		return "success";
	}
	
	@Override
	public Tag getModel() {
		tag=new Tag();
		return tag;
	}





	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}


	
}
