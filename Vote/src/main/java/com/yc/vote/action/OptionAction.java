package com.yc.vote.action;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.vote.entity.AddOptionBean;
import com.yc.vote.entity.Option;
import com.yc.vote.service.OptionService;

@Controller("optionAction")
public class OptionAction implements ModelDriven<AddOptionBean> {
	
	private AddOptionBean addOptionBean;
	
	@Autowired
	private OptionService optionService;

	
	
	
	public String updateSave(){
		LogManager.getLogger().debug("OptionAction==>updatesave==>取到的数据"+addOptionBean);
		List<String> options=addOptionBean.getOptions();
		int n=addOptionBean.getOptionss().size();
		for(int i=0;i<options.size();i++){
			Option option=new Option(options.get(i),addOptionBean.getVsId(),i+n+1);
			optionService.addOptions(option);
		}
		
		return "updateSave";
	}
	@Override
	public AddOptionBean getModel() {
		addOptionBean=new AddOptionBean();		
		return addOptionBean;
	}

}
