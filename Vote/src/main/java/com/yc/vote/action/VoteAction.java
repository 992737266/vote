package com.yc.vote.action;


import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.vote.entity.Item;
import com.yc.vote.entity.OptionBean;
import com.yc.vote.entity.SubjectBean;
import com.yc.vote.entity.VoteBean;
import com.yc.vote.service.VoteService;



@Controller("voteAction")
public class VoteAction implements ModelDriven<Item>, SessionAware{
	@Autowired
	private VoteService voteService;
	private Map<String,Object> session;
	private Item item;
	
	
	

	public String list(){
		/*LogManager.getLogger().debug("发送请求");*/
		List<SubjectBean> subjects=voteService.findAllSubjectBeans();
		session.put("subjects", subjects);
		return "list";
	}
	
	public String view(){
/*		LogManager.getLogger().debug("view取到的ID值"+item.getVsId());
*/		OptionBean optionBean=voteService.findOptionBeanbyIds(item.getVsId());
		session.put("optionBean",optionBean);
		return "view";
	}
	
	public String vote(){
/*		LogManager.getLogger().debug("vote取到的ID值"+item.getVsId());
*/		VoteBean voteBean=voteService.findVoteBeanbyIds(item.getVsId());
		session.put("voteBean", voteBean);
		return "vote";
	}
	public String save(){
		String[] voId=ServletActionContext.getRequest().getParameterValues("voId");
/*		LogManager.getLogger().debug("save取到的ID值"+item+"voId"+Arrays.toString(voId));
*/		if(voteService.saveVote(item,voId)){
			return "saveSuccess";
		}
		session.put("saveMsg", "投票失败");
		return "saveFile";
	}
	
	public String update(){
		System.out.println("取到需要维护的投票ID==>"+item.getVsId());
		VoteBean voteBeans=voteService.findVoteBeanbyIds(item.getVsId());
		System.out.println(voteBeans);
		session.put("voteBeans", voteBeans);
		return "updateSuccess";
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

	@Override
	public Item getModel() {
		item=new Item();		
		return item;
	}
}
