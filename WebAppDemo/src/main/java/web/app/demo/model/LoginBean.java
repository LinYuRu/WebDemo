package web.app.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PersonalMember")
public class LoginBean {
	private Integer memberId;
	private String memberAccount; 
	private String memberPassword;
	private String memberEmail;
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	private Boolean res;
	
	public Boolean getRes() {
		return res;
	}
	public void setRes(Boolean res) {
		this.res = res;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public LoginBean() {}
	public LoginBean(String memberAccount, String memberPassword) {
		this.memberAccount  = memberAccount;
		this.memberPassword = memberPassword;
	}
	public LoginBean(String memberAccount, String memberPassword ,Boolean res ) {
		this.memberAccount  = memberAccount;
		this.memberPassword = memberPassword;
		this.res            = res;
	}
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public String getMemberAccount() {
		return memberAccount;
	}

	public void setMemberAccount(String memberAccount) {
		this.memberAccount = memberAccount;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}


}
