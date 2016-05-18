package com.yc.vote.action;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.vote.entity.AddSubjectBean;
import com.yc.vote.service.SubjectService;

@Controller("subjectAction")
public class SubjectAction implements ModelDriven<AddSubjectBean> {
	private AddSubjectBean addSubjectBean;
	
	@Autowired
	private SubjectService subjectService;

	public String save(){
		LogManager.getLogger().debug("SubjectAction==>save==>取到的数据"+addSubjectBean);
		try {
			subjectService.add(addSubjectBean);
			return "addSuccess";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "addFail";
	}
	
	
	@Override
	public AddSubjectBean getModel() {
		addSubjectBean=new AddSubjectBean();
		return addSubjectBean;
	}
}
