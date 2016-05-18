package com.yc.vote.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.yc.vote.util.VoteData;

public class LoginInterceptor extends MethodFilterInterceptor {

	
	private static final long serialVersionUID = -7236236055969111808L;

	

	@Override
	protected String doIntercept(ActionInvocation invacation) throws Exception {
		Map<String,Object> session=ActionContext.getContext().getSession();//取到Session封装对象
		Object obj=session.get(VoteData.LOGIN_USER);
		if(obj==null){
			session.put(VoteData.ERROR_MSG, "请先登录");
			return "login";
		}
		return invacation.invoke();
	}

}
