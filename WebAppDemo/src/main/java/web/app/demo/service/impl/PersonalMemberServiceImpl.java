package web.app.demo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.app.demo.dao.PersonalMemberDao;
import web.app.demo.model.DeliveryBean;
import web.app.demo.model.PersonalMemberBean;
import web.app.demo.service.PersonalMemberService;

@Service
public class PersonalMemberServiceImpl implements PersonalMemberService {
	@Autowired
	PersonalMemberDao dao;

	@Transactional
	@Override
	public PersonalMemberBean addPersonalMember(PersonalMemberBean member) {
		return dao.addPersonalMember(member);
	}

	@Transactional
	@Override
	public boolean idExists(String memberId) {
		boolean exist = false;
		exist = dao.idExists(memberId);
		return exist;
	}

	@Transactional
	@Override
	public PersonalMemberBean checkIDPassword(String memberEmail, String memberPassword) {
		PersonalMemberBean mb = null;
		mb = dao.checkIDPassword(memberEmail, memberPassword);
		return mb;
	}

	@Transactional
	@Override
	public PersonalMemberBean queryMember(Integer memberId) {
		PersonalMemberBean mb = null;
		mb = dao.queryMember(memberId);
		return mb;
	}

	@Transactional
	@Override
	public List<PersonalMemberBean> findAllMember() {
		return dao.findAllMember();
	}
	
	public PersonalMemberBean changPassword(Integer memberId, String memberPassword) {
		return dao.changPassword(memberId, memberPassword);
	}

}
