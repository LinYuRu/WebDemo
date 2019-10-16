package web.app.demo.model;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

//本類別封裝會員資料
@Entity
@Table(name="PersonalMember")
public class PersonalMemberBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer memberId;
	private String memberAccount; 
	private String memberPassword;
	private Integer shopId;
	private String memberName;
	private String memberAddress;
	private String memberEmail; 
	private String memberTel;
	private String memberCredit;
	private java.sql.Date memberBirth;
	@JsonIgnore
	private Blob memberImage;
	private Date memberRegisterDate;
	private Date memberUpdateTime;
	private String verificationCode;
	private String loginVerificationStatus;
	@JsonIgnore
	private MultipartFile memberPic;

	
	public PersonalMemberBean() {}
	public PersonalMemberBean(Integer memberId, String memberAccount, String memberPassword, String memberName, Integer shopId, String memberAddress,
			String memberEmail, String memberTel, String memberCredit, java.sql.Date memberBirth, Blob memberImage, Date memberRegisterDate,
			Date memberUpdateTime, String verificationCode, String loginVerificationStatus) {
		this.memberId = memberId;
		this.memberAccount = memberAccount;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.shopId = shopId;
		this.memberAddress = memberAddress;
		this.memberEmail = memberEmail;
		this.memberTel = memberTel;
		this.memberCredit = memberCredit;
		this.memberBirth = memberBirth;
		this.memberImage = memberImage;
		this.memberRegisterDate = memberRegisterDate;
		this.memberUpdateTime = memberUpdateTime;
		this.verificationCode = verificationCode;
		this.loginVerificationStatus = loginVerificationStatus;
	}
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public String getMemberAccount() {
		return memberAccount;
	}
	public void setMemberAccount(String memberAccount) {
		this.memberAccount = memberAccount;
	}
//	public String toString() {
//		return "userid=" + memberId + "   password=" + memberPassword;
//	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberTel() {
		return memberTel;
	}
	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}
	public String getMemberCredit() {
		return memberCredit;
	}
	public void setMemberCredit(String memberCredit) {
		this.memberCredit = memberCredit;
	}
	public java.sql.Date getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(java.sql.Date memberBirth) {
		this.memberBirth = memberBirth;
	}
	public Blob getMemberImage() {
		return memberImage;
	}
	public void setMemberImage(Blob memberImage) {
		this.memberImage = memberImage;
	}
	public Date getMemberRegisterDate() {
		return memberRegisterDate;
	}
	public void setMemberRegisterDate(Date memberRegisterDate) {
		this.memberRegisterDate = memberRegisterDate;
	}
	public Date getMemberUpdateTime() {
		return memberUpdateTime;
	}
	public void setMemberUpdateTime(Date memberUpdateTime) {
		this.memberUpdateTime = memberUpdateTime;
	}
	public String getVerificationCode() {
		return verificationCode;
	}
	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}
	public String getLoginVerificationStatus() {
		return loginVerificationStatus;
	}
	public void setLoginVerificationStatus(String loginVerificationStatus) {
		this.loginVerificationStatus = loginVerificationStatus;
	}
	@Transient
	public MultipartFile getMemberPic() {
		return memberPic;
	}
	public void setMemberPic(MultipartFile memberPic) {
		this.memberPic = memberPic;
	}
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
	
}
