package web.app.demo.dao.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import web.app.demo.dao.PersonalMemberDao;
import web.app.demo.model.PersonalMemberBean;
import web.app.demo.model.ProductBean;

@Repository
public class PersonalMemberDaoImpl implements PersonalMemberDao{
	@Autowired
	SessionFactory factory;
	
	public PersonalMemberDaoImpl() {
	}

	@Override
	public PersonalMemberBean addPersonalMember(PersonalMemberBean member) {
		
		Session session = factory.getCurrentSession();
		//加入現在時間
		member.setMemberRegisterDate(new java.sql.Timestamp(System.currentTimeMillis()));
		
		session.save(member);
		return member;		
	}

	@Override
	public void setConnection(Connection con) {
		throw new RuntimeException("不支援setConnection(Connection con)方法...");
		
	}

	@Override
	public boolean idExists(String memberEmail) {
		Session session = factory.getCurrentSession();
		boolean exist = false;
		String hql = "FROM PersonalMemberBean m WHERE m.memberEmail = :mid";
		try {
			PersonalMemberBean mb = (PersonalMemberBean) session.createQuery(hql)
												.setParameter("mid", memberEmail)
												.uniqueResult();
			if (mb != null) {
				exist = true;
			}
		} catch (NoResultException ex) {
			exist = false;
		} catch (NonUniqueResultException ex) {
			exist = true;
		}
		return exist;
	}

	@Override
	public PersonalMemberBean checkIDPassword(String memberEmail, String memberPassword) {
		PersonalMemberBean mb = null;
		Session session = factory.getCurrentSession();
		String hql = "FROM PersonalMemberBean m WHERE m.memberEmail = :mid and m.memberPassword = :pswd";
		try {
			mb = (PersonalMemberBean) session.createQuery(hql)
							.setParameter("mid", memberEmail)
							.setParameter("pswd", memberPassword)
							.uniqueResult();
		} catch (NoResultException ex) {
			mb = null;
		}
		return mb;
	}

	@Override
	public PersonalMemberBean queryMember(Integer memberId) {
		PersonalMemberBean mb = null;
		Session session = factory.getCurrentSession();
		String hql = "FROM PersonalMemberBean m WHERE m.memberId = :mid";
		try {
			mb = (PersonalMemberBean) session.createQuery(hql)
					.setParameter("mid", memberId)
					.uniqueResult();
		} catch (NoResultException ex) {
			mb = null;
		}
		return mb;
	}

	@Override
	public List<PersonalMemberBean> findAllMember() {
		Session session = null;
		List<PersonalMemberBean> list = new ArrayList<>();
		session = factory.getCurrentSession();
		String hql = "FROM PersonalMemberBean";		
		list = session.createQuery(hql).getResultList();
		return list;
		
	}

	@SuppressWarnings("unused")
	@Override
	public PersonalMemberBean changPassword(Integer memberId, String memberPassword) {
		PersonalMemberBean pb = null;
		Session session =factory.getCurrentSession();
		String hql = "FROM PersonalMemberBean m WHERE m.memberId = :mid";
		if (pb != null) {
			pb.setMemberPassword(memberPassword);
		}
		pb = (PersonalMemberBean) session.createQuery(hql).getResultList();
		return pb;
	}



}
