/**   
 * projectName: InfoMB   
 * fileName: MyRealm.java   
 * packageName: com.mb.realm   
 * date: 2018年6月6日下午8:36:25   
 * copyright(c) 2017-2020 xxx公司  
 */ 
package com.mb.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**     
 * @title: MyRealm.java   
 * @package com.mb.realm   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018年6月6日 下午8:36:25   
 * @version: V1.0     
*/
public class MyRealm extends AuthorizingRealm{

	/**     
	 * @title: doGetAuthorizationInfo   授权验证
	 * @description: TODO  
	 * @param arg0
	 * @return     
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)       
	 */  
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		// TODO Auto-generated method stub
		return null;
	}

	/**     
	 * @title: doGetAuthenticationInfo   身份验证
	 * @description: TODO  
	 * @param arg0
	 * @return
	 * @throws AuthenticationException     
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)       
	 */  
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

}
