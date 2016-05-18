package com.yc.vote.mapper;

import java.util.List;







import com.yc.vote.entity.AddSubjectBean;
import com.yc.vote.entity.Item;
import com.yc.vote.entity.Option;
import com.yc.vote.entity.OptionBean;
import com.yc.vote.entity.Subject;
import com.yc.vote.entity.SubjectBean;
import com.yc.vote.entity.VoteBean;

public interface SubjectMapper {
	List<Subject> getAllSubjects();

	List<SubjectBean> getAllSubjectBeans();

	OptionBean getOptionBeanbyIds(int vsid);

	VoteBean getVoteBeanbyIds(int vsid);

	void insertItem(Item item);

	void insertSubject(AddSubjectBean addSubjectBean);

	void insertOption(Option option);

	

	
}
