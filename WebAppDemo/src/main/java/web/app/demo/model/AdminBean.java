package web.app.demo.model;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "AdminMember")
public class AdminBean {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer adMemberId;		
	private Integer adMemberAccount;
	private Integer adMemberPassword;
	private String adMemberEmail; 
	private String adMemberTel;
	private java.sql.Date adMemberBirth;
	private Date adMemberRegisterDate;
	private Date adMemberUpdateTime;
	private Boolean loginStatus;
	
	private AdminBean() {
	}
	public AdminBean(Integer adMemberAccount, Integer adMemberPassword) {
		this.adMemberAccount  = adMemberAccount;
		this.adMemberPassword = adMemberPassword;
	}
	public AdminBean(Integer adMemberAccount, Integer adMemberPassword ,Boolean loginStatus ) {
		this.adMemberAccount  = adMemberAccount;
		this.adMemberPassword = adMemberPassword;
		this.loginStatus = loginStatus;
	}

	public AdminBean(Integer adProductId, Integer adMemberId, Integer adMemberAccount, Integer adMemberPassword,
			String adMemberEmail, String adMemberTel, java.sql.Date adMemberBirth,
			Date adMemberRegisterDate, Date adMemberUpdateTime) {
		this.adMemberId = adMemberId;
		this.adMemberAccount = adMemberAccount;
		this.adMemberPassword = adMemberPassword;
		this.adMemberEmail = adMemberEmail;
		this.adMemberTel = adMemberTel;
		this.adMemberBirth = adMemberBirth;
		this.adMemberRegisterDate = adMemberRegisterDate;
		this.adMemberUpdateTime = adMemberUpdateTime;

	}
	public Integer getAdMemberId() {
		return adMemberId;
	}
	public void setAdMemberId(Integer adMemberId) {
		this.adMemberId = adMemberId;
	}
	public Integer getAdMemberAccount() {
		return adMemberAccount;
	}
	public void setAdMemberAccount(Integer adMemberAccount) {
		this.adMemberAccount = adMemberAccount;
	}
	public Integer getAdMemberPassword() {
		return adMemberPassword;
	}
	public void setAdMemberPassword(Integer adMemberPassword) {
		this.adMemberPassword = adMemberPassword;
	}
	public String getAdMemberEmail() {
		return adMemberEmail;
	}
	public void setAdMemberEmail(String adMemberEmail) {
		this.adMemberEmail = adMemberEmail;
	}
	public String getAdMemberTel() {
		return adMemberTel;
	}
	public void setAdMemberTel(String adMemberTel) {
		this.adMemberTel = adMemberTel;
	}
	public java.sql.Date getAdMemberBirth() {
		return adMemberBirth;
	}
	public void setAdMemberBirth(java.sql.Date adMemberBirth) {
		this.adMemberBirth = adMemberBirth;
	}
	public Date getAdMemberRegisterDate() {
		return adMemberRegisterDate;
	}
	public void setAdMemberRegisterDate(Date adMemberRegisterDate) {
		this.adMemberRegisterDate = adMemberRegisterDate;
	}
	public Date getAdMemberUpdateTime() {
		return adMemberUpdateTime;
	}
	public void setAdMemberUpdateTime(Date adMemberUpdateTime) {
		this.adMemberUpdateTime = adMemberUpdateTime;
	}
	public Boolean getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(Boolean loginStatus) {
		this.loginStatus = loginStatus;
	}


}
