/**   
 * projectName: InfoMB   
 * fileName: PageController.java   
 * packageName: com.mb.controller   
 * date: 2018年6月7日下午2:57:14   
 * copyright(c) 2017-2020 xxx公司  
 */ 
package com.mb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**     
 * @title: PageController.java   
 * @package com.mb.controller   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018年6月7日 下午2:57:14   
 * @version: V1.0     
*/
@Controller
@RequestMapping("")
public class PageController {
	
	@RequestMapping("login")
	public String userLogin(){
		return "login";
	}

}
