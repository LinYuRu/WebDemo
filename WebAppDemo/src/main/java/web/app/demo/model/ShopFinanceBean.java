package web.app.demo.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

//本類別封裝單筆商店資料
@Entity
@Table(name="ShopFinance")
public class ShopFinanceBean {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Integer shopId;
	private  String shopAccount;
	private  String shopPassword;
	private  Integer memberId;
	private  String shopBank; //銀行名稱
	private  Integer shopBankNo;  //銀行代碼
	private  String shopBankName;  //戶名
	private  String shopBankAccount; //銀行帳號
	private  String shopCountry;  //地區
	private  String shopDBankName; //分行名稱
	private  String shopAuth;
	private  String sellerName; //負責人名稱
	private  String sellerId;  //統編身分證字號
	private  String sellerAddr;  //公司地址
	private  java.sql.Date sellerBirth;  //公司登記日期
	private  String sellerEmail;  
	private  String sellerTel;
	private  String sellerShopClass;
	private String sellerValue;
	private  Date sellerRegDate; //賣家註冊日
	@OneToMany(mappedBy="ShopFinance")
	private Set<ProductBean> product = new LinkedHashSet<>(); 
	
	
	public ShopFinanceBean(Integer shopId, String shopAccount, String shopPassword) {
		this.shopId = shopId;
		this.shopAccount = shopAccount;
		this.shopPassword = shopPassword;

	}

	private Boolean res;

	public Boolean getRes() {
		return res;
	}

	public void setRes(Boolean res) {
		this.res = res;
	}

	public ShopFinanceBean(String shopAccount, String shopPassword) {
		this.shopAccount = shopAccount;
		this.shopPassword = shopPassword;
	}

	public ShopFinanceBean(String shopAccount, String shopPassword ,Boolean res ) {
		this.shopAccount = shopAccount;
		this.shopPassword = shopPassword;
		this.res            = res;
	}

	public ShopFinanceBean(Integer shopId, String shopAccount, String shopPassword, Integer memberId, String shopBank, String shopBankName,
			Integer shopBankNo, String shopBankAccount, String shopCountry, String shopDBankName, String shopAuth, String sellerName,
			String sellerId, String sellerAddr, java.sql.Date sellerBirth, String sellerEmail, String sellerTel,
			String sellerShopClass, String sellerValue, java.sql.Date sellerRegDate, Set<ProductBean> product) {
		this.shopId=shopId;
		this.shopAccount=shopAccount;
		this.shopPassword=shopPassword;
		this.memberId=memberId;
		this.shopBank=shopBank;
		this.shopBankName=shopBankName;
		this.shopBankNo=shopBankNo;
		this.shopBankAccount=shopBankAccount;
		this.shopCountry=shopCountry;
		this.shopDBankName=shopDBankName;
		this.shopAuth=shopAuth;
		this.sellerName=sellerName;
		this.sellerId=sellerId;
		this.sellerAddr=sellerAddr;
		this.sellerBirth=sellerBirth;
		this.sellerEmail=sellerEmail;
		this.sellerTel=sellerTel;
		this.sellerShopClass=sellerShopClass;
		this.sellerValue=sellerValue;
		this.sellerRegDate=sellerRegDate;
		this.product=product;
	}
	public Set<ProductBean> getProduct() {
		return product;
	}
	public void setProduct(Set<ProductBean> product) {
		this.product = product;
	}
	public ShopFinanceBean() {
	}
	
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
		if (shopIdS == null) {
			shopIdS = String.valueOf(shopId);
		}
	}
	@Transient
	private String  shopIdS = null;
	public String getShopIdS() {
		return shopIdS;
	}
	public void setShopIdS(String shopIdS) {
		this.shopIdS = shopIdS;
	}
	public String getShopAccount() {
		return shopAccount;
	}
	public void setShopAccount(String shopAccount) {
		this.shopAccount = shopAccount;
	}
	public String getShopPassword() {
		return shopPassword;
	}
	public void setShopPassword(String shopPassword) {
		this.shopPassword = shopPassword;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public String getShopBankName() {
		return shopBankName;
	}
	public void setShopBankName(String shopBankName) {
		this.shopBankName = shopBankName;
	}
	public Integer getShopBankNo() {
		return shopBankNo;
	}
	public void setShopBankNo(Integer shopBankNo) {
		this.shopBankNo = shopBankNo;
	}
	public String getShopBankAccount() {
		return shopBankAccount;
	}
	public void setShopBankAccount(String shopBankAccount) {
		this.shopBankAccount = shopBankAccount;
	}
	public String getShopCountry() {
		return shopCountry;
	}
	public void setShopCountry(String shopCountry) {
		this.shopCountry = shopCountry;
	}
	public String getShopAuth() {
		return shopAuth;
	}
	public void setShopAuth(String shopAuth) {
		this.shopAuth = shopAuth;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerAddr() {
		return sellerAddr;
	}
	public void setSellerAddr(String sellerAddr) {
		this.sellerAddr = sellerAddr;
	}
	public java.sql.Date getSellerBirth() {
		return sellerBirth;
	}
	public void setSellerBirth(java.sql.Date sellerBirth) {
		this.sellerBirth = sellerBirth;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	public String getSellerTel() {
		return sellerTel;
	}
	public void setSellerTel(String sellerTel) {
		this.sellerTel = sellerTel;
	}
	public String getSellerShopClass() {
		return sellerShopClass;
	}
	public void setSellerShopClass(String sellerShopClass) {
		this.sellerShopClass = sellerShopClass;
	}
	public String getSellerValue() {
		return sellerValue;
	}
	public void setSellerValue(String sellerValue) {
		this.sellerValue = sellerValue;
	}
	public String getShopBank() {
		return shopBank;
	}
	public void setShopBank(String shopBank) {
		this.shopBank = shopBank;
	}
	public String getShopDBankName() {
		return shopDBankName;
	}
	public void setShopDBankName(String shopDBankName) {
		this.shopDBankName = shopDBankName;
	}
	public Date getSellerRegDate() {
		return sellerRegDate;
	}
	public void setSellerRegDate(Date sellerRegDate) {
		this.sellerRegDate = sellerRegDate;
	}
	
	
	
	
}
