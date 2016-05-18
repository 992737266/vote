package com.yc.vote.service;

import java.util.List;

import com.yc.vote.entity.Item;
import com.yc.vote.entity.OptionBean;
import com.yc.vote.entity.Subject;
import com.yc.vote.entity.SubjectBean;
import com.yc.vote.entity.VoteBean;

public interface VoteService {
	List<Subject> findAllSubjects();
	
	List<SubjectBean> findAllSubjectBeans();

	OptionBean findOptionBeanbyIds(int vsid);
	
	VoteBean findVoteBeanbyIds(int vsid);
	
	public boolean saveVote(Item item);

	boolean saveVote(Item item, String[] voId);
	
}
