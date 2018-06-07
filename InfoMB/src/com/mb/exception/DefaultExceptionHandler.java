/**   
 * projectName: InfoMB   
 * fileName: DefaultExceptionHandler.java   
 * packageName: com.mb.exception   
 * date: 2018年6月7日下午2:08:02   
 * copyright(c) 2017-2020 xxx公司  
 */ 
package com.mb.exception;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.ModelAndView;

/**     
 * @title: DefaultExceptionHandler.java   
 * @package com.mb.exception   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018年6月7日 下午2:08:02   
 * @version: V1.0     
 * 当发生UnauthorizedException 异常的时候，就表示访问了无授权的资源，
 * 那么就会跳转到unauthorized.jsp，而在unauthorized.jsp 中就会把错误信息通过变量 ex 取出来。
*/
@ControllerAdvice
public class DefaultExceptionHandler {
	@ExceptionHandler({UnauthorizedException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
	public ModelAndView processUnauthenticatedException(NativeWebRequest request, UnauthorizedException e){
		ModelAndView mav = new ModelAndView();
		mav.addObject("e", e);
		mav.setViewName("unauthorized");
		return mav;
		
	}

}
