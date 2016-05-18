package com.yc.vote.service;


import com.yc.vote.entity.AddSubjectBean;
import com.yc.vote.entity.Option;

public interface SubjectService {
	AddSubjectBean addSubject(AddSubjectBean addSubjectBean);
	void addOption(Option option);
	void add(AddSubjectBean addSubjectBean);
}
