package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.maple.pojo.Compy;
import com.maple.service.CompyService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
/**
 * 认证类
 * @author Administrator
 *
 */
public class UserDetailsServiceImpl implements UserDetailsService {


	private CompyService compyService;

	public CompyService getCompyService() {
		return compyService;
	}

	public void setCompyService(CompyService compyService) {
		this.compyService = compyService;
	}




	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("经过了UserDetailsServiceImpl");
		//构建角色列表
		List<GrantedAuthority> grantAuths=new ArrayList();
		grantAuths.add(new SimpleGrantedAuthority("ROLE_compy"));
		
		//得到商家对象
		Compy compy = compyService.findoneBycompyid(username);
		if(compy!=null){
			if(compy.getStatus()==1){
				return new User(username,compy.getPassword(),grantAuths);
			}else{
				return null;
			}			
		}else{
			return null;
		}
	}


}
