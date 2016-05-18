package com.yc.vote.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.vote.entity.Option;
import com.yc.vote.mapper.OptionMapper;
import com.yc.vote.service.OptionService;

@Service("optionService")
public class OptionServiceImpl implements OptionService {
	@Autowired
	private OptionMapper optionMapper;

	@Override
	public int addOptions(Option options) {
		return optionMapper.addOptions(options);
	}
	
}
