package com.ysd.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class ZuulTokenFilter extends ZuulFilter {
	private static Logger log = LoggerFactory.getLogger(ZuulTokenFilter.class);

@Override
public String filterType() {
return "pre";//�����������ͣ���������������������ĸ�����������ִ�С����ﶨ��Ϊpre�������������·��֮ǰִ�С�
}

@Override
public int filterOrder() {
return 0;//��������ִ��˳�򡣵�������һ���׶��д��ڶ��������ʱ����Ҫ���ݸ÷������ص�ֵ������ִ�С�
}

@Override
public boolean shouldFilter() {
return true;//�жϸù������Ƿ���Ҫ��ִ�С���������ֱ�ӷ�����true����˸ù��������������󶼻���Ч��ʵ�����������ǿ������øú�����ָ������������Ч��Χ��
}

	/**
	 * �������ľ����߼��� ��������ͨ��ctx.setSendZuulResponse(false)��zuul���˸����󣬲��������·�ɣ�
	 * Ȼ��ͨ��ctx.setResponseStatusCode(401)�������䷵�صĴ����룬
	 * ��Ȼ����Ҳ���Խ�һ���Ż����ǵķ��أ����磬ͨ��ctx.getResponse()����Ӧ���ݽ��б༭�ȡ�
	 */
	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
		Object accessToken = request.getParameter("token");
		String refer = request.getHeader("refer");
		if (accessToken != null) {
			return null;// ����·�ɷ���
		}
		log.warn("token is empty");
		ctx.setSendZuulResponse(false);// ����·�ɹ��˲�·��
		ctx.setResponseStatusCode(401);
		try {
			ctx.getResponse().getWriter().write("token is empty");
		} catch (Exception e) {
		}
		return null;// ����·�ɷ���
	}
}
