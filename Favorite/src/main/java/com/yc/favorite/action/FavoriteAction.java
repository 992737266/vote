package com.yc.favorite.action;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.favorite.entity.Favorite;
import com.yc.favorite.entity.Tag;
import com.yc.favorite.service.FavoriteService;
import com.yc.favorite.service.TagService;
import com.yc.favorite.service.impl.FavoriteServiceImpl;
import com.yc.favorite.service.impl.TagServiceImpl;





public class FavoriteAction implements ModelDriven<Favorite>,ServletRequestAware{
	private Favorite favorite;
	public Tag tag;
	private FavoriteService favoriteService;
	private TagService tagService;
	private HttpServletRequest request;
	
	public FavoriteAction(){
		favoriteService=new FavoriteServiceImpl();
		tagService=new TagServiceImpl();
	}
	
	
	public String getBytypeName(){
		String ty=request.getParameter("type");
		Map<String, Object> type = new HashMap<String, Object>();
		type.put("type", ty);
		List<Favorite> favorite=favoriteService.getByType(type);
		request.getSession().setAttribute("favorite",favorite);;
		return "success";	
	}
	
	public String Add(){
		String label=request.getParameter("label");
		String url=request.getParameter("url");
		String tags=request.getParameter("tags");
		String desc=request.getParameter("desc");
		favorite=new Favorite(0,label,url,tags,desc);
		if(tags!=null && !tags.equals(' ')){
			tag=new Tag(0,tags,1);
			tagService.add(tag);
		}
		favoriteService.add(favorite);
		return "success";	
	}
	
	
	@Override
	public Favorite getModel() {
		favorite=new Favorite();
		return favorite;
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}
}
