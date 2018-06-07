/**   
 * projectName: InfoMB   
 * fileName: URLPathMathchingFilter.java   
 * packageName: com.mb.filter   
 * date: 2018年6月7日上午11:40:52   
 * copyright(c) 2017-2020 xxx公司  
 */ 
package com.mb.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.apache.shiro.web.util.WebUtils;

/**     
 * @title: URLPathMathchingFilter.java   
 * @package com.mb.filter   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018年6月7日 上午11:40:52   
 * @version: V1.0     
*/
public class URLPathMathchingFilter extends PathMatchingFilter{
	@Override
	protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue)
			throws Exception {
		String requestURL = getPathWithinApplication(request);
		System.out.println("com.shiro.filter.URLPathMatchingFilter:requestURL:"+requestURL);
		//得到当前用户
		Subject subject = SecurityUtils.getSubject();
		
		//如果没有登录，就跳转到登录页面
		if(!subject.isAuthenticated()){
			WebUtils.issueRedirect(request, response, "/login");
			return false;
		}
		return false;

	}

}
