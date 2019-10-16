package web.app.demo.dao;

import java.sql.Connection;
import java.util.List;

import web.app.demo.model.PersonalMemberBean;

public interface PersonalMemberDao {
	public PersonalMemberBean addPersonalMember(PersonalMemberBean member);
	void setConnection(Connection con);
	//檢查ID是否存在
	boolean idExists(String memberEmail);
	//由信箱取得會員資料
	PersonalMemberBean queryMember(Integer memberId);
	//核對密碼信箱
	PersonalMemberBean checkIDPassword(String memberEmail, String memberPassword);
	//取得所有會員
	public List<PersonalMemberBean> findAllMember();
	//更改密碼
	public PersonalMemberBean changPassword(Integer memberId, String memberPassword);
}
