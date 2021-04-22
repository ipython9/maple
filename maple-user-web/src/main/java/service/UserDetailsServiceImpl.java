package service;

import com.maple.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * 认证类
 * @author Administrator
 *
 */
public class UserDetailsServiceImpl implements UserDetailsService {
	private static final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("经过了UserDetailsServiceImpl");
		//构建角色列表
		List<GrantedAuthority> grantAuths=new ArrayList();
		grantAuths.add(new SimpleGrantedAuthority("ROLE_user"));
		
		//得到商家对象
		try {
			com.maple.pojo.User user = userService.findoneByuserid(username);
			System.out.println(user.getPassword());
			if(user!=null){
				if(user.getStatus().equals("0")){
					return new User(username,user.getPassword(),grantAuths);
				}else{
					return null;
				}
			}else{
				return null;
			}
		}catch (Exception e){
			logger.error("错误{}",e.getMessage());
		}
		return null;
	}


}
