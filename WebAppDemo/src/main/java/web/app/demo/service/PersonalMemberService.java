package web.app.demo.service;

import java.util.List;

import web.app.demo.model.DeliveryBean;
import web.app.demo.model.PersonalMemberBean;

public interface PersonalMemberService {

	//新增會員
	PersonalMemberBean addPersonalMember(PersonalMemberBean member);
	//檢察ID是否存在
	boolean idExists(String memberId);
	//由信箱取得會員資料
	PersonalMemberBean queryMember(Integer memberId);
	//核對密碼信箱
	PersonalMemberBean checkIDPassword(String memberEmail, String memberPassword);
	//取得所有會員
	public List<PersonalMemberBean> findAllMember();
	//更改密碼
	public PersonalMemberBean changPassword(Integer memberId, String memberPassword);

}
