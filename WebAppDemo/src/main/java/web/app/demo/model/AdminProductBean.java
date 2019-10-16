package web.app.demo.model;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "AdminProduct")
public class AdminProductBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adProductId;
	private String adProductName;
	private Integer adProductQuantity;	
	private Integer adProductPrice;
	private Date adProductAddTime;	
	private Date adProductupdateTime;	
	private String adProductCategory;	
	private String adClassDefualt;
	private String adProductInfo;
	private String adProductStatus;
	private String adProductValue;
	@JsonIgnore
	private Blob adCoverImage;
	@JsonIgnore
	@Transient
	private MultipartFile adProductImage;
	private String adminFileName;
	public AdminProductBean() {}

	public AdminProductBean(Integer adProductId, String adProductName, Integer adProductQuantity,
			Integer adProductPrice, Date adProductAddTime, Date adProductupdateTime, String adProductCategory,
			String adClassDefualt, String adProductInfo, 
			String adProductStatus, String adProductValue, Blob adCoverImage, MultipartFile adProductImage,
			String adminFileName) {
		this.adProductId = adProductId;
		this.adProductName = adProductName;
		this.adProductQuantity = adProductQuantity;
		this.adProductPrice = adProductPrice;
		this.adProductAddTime = adProductAddTime;
		this.adProductupdateTime = adProductupdateTime;
		this.adProductCategory = adProductCategory;
		this.adClassDefualt = adClassDefualt;
		this.adProductInfo = adProductInfo;
		this.adProductStatus = adProductStatus;
		this.adProductValue = adProductValue;
		this.adCoverImage = adCoverImage;
		this.adProductImage = adProductImage;
		this.adminFileName = adminFileName;
	}
	public Integer getAdProductId() {
		return adProductId;
	}
	public void setAdProductId(Integer adProductId) {
		this.adProductId = adProductId;
	}

	public String getAdProductName() {
		return adProductName;
	}

	public void setAdProductName(String adProductName) {
		this.adProductName = adProductName;
	}

	public Integer getAdProductQuantity() {
		return adProductQuantity;
	}

	public void setAdProductQuantity(Integer adProductQuantity) {
		this.adProductQuantity = adProductQuantity;
	}

	public Integer getAdProductPrice() {
		return adProductPrice;
	}

	public void setAdProductPrice(Integer adProductPrice) {
		this.adProductPrice = adProductPrice;
	}

	public Date getAdProductAddTime() {
		return adProductAddTime;
	}

	public void setAdProductAddTime(Date adProductAddTime) {
		this.adProductAddTime = adProductAddTime;
	}

	public Date getAdProductupdateTime() {
		return adProductupdateTime;
	}

	public void setAdProductupdateTime(Date adProductupdateTime) {
		this.adProductupdateTime = adProductupdateTime;
	}

	public String getAdProductCategory() {
		return adProductCategory;
	}

	public void setAdProductCategory(String adProductCategory) {
		this.adProductCategory = adProductCategory;
	}

	public String getAdClassDefualt() {
		return adClassDefualt;
	}

	public void setAdClassDefualt(String adClassDefualt) {
		this.adClassDefualt = adClassDefualt;
	}

	public String getAdProductInfo() {
		return adProductInfo;
	}

	public void setAdProductInfo(String adProductInfo) {
		this.adProductInfo = adProductInfo;
	}

	public String getAdProductStatus() {
		return adProductStatus;
	}

	public void setAdProductStatus(String adProductStatus) {
		this.adProductStatus = adProductStatus;
	}

	public String getAdProductValue() {
		return adProductValue;
	}

	public void setAdProductValue(String adProductValue) {
		this.adProductValue = adProductValue;
	}

	public Blob getAdCoverImage() {
		return adCoverImage;
	}

	public void setAdCoverImage(Blob adCoverImage) {
		this.adCoverImage = adCoverImage;
	}

	public MultipartFile getAdProductImage() {
		return adProductImage;
	}

	public void setAdProductImage(MultipartFile adProductImage) {
		this.adProductImage = adProductImage;
	}

	public String getAdminFileName() {
		return adminFileName;
	}

	public void setAdminFileName(String adminFileName) {
		this.adminFileName = adminFileName;
	}

	

}
