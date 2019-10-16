package web.app.demo.model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Top5Sell")
public class Top5SellBean {
	private Integer top5Id;
	private Integer shopId;
	private String top5Name;
	private Integer top5Quantity;
	private Double top5Price;
	private Double top5Discount;
	private String classDefualt;
	private String top5Info;
	
	@JsonIgnore
	private Blob top5CoverImg;
	private String  	top5fileName;
	@JsonIgnore
	private Blob top5CoverImg1;
	private String  	top5fileName1;
	@JsonIgnore
	private Blob top5CoverImg2;
	private String  	top5fileName2;
	@JsonIgnore
	private Blob top5CoverImg3;
	private String  	top5fileName3;
	
	@JsonIgnore
	private MultipartFile top5Image;

	public Top5SellBean() {
	}

	public Top5SellBean(Integer top5Id, Integer shopId, 
			String top5Name, Integer top5Quantity, Double top5Price,
			Double top5Discount, String classDefualt, String top5Info, 
			Blob top5CoverImg, String top5fileName) {
		this.top5Id = top5Id;
		this.shopId = shopId;
		this.top5Name = top5Name;
		this.top5Quantity = top5Quantity;
		this.top5Price = top5Price;
		this.top5Discount = top5Discount;
		this.classDefualt = classDefualt;
		this.top5Info = top5Info;
		this.top5CoverImg = top5CoverImg;
		this.top5fileName = top5fileName;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getTop5Id() {
		return top5Id;
	}
	public void setTop5Id(Integer top5Id) {
		this.top5Id = top5Id;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public String getTop5Name() {
		return top5Name;
	}

	public void setTop5Name(String top5Name) {
		this.top5Name = top5Name;
	}

	public Integer getTop5Quantity() {
		return top5Quantity;
	}

	public void setTop5Quantity(Integer top5Quantity) {
		this.top5Quantity = top5Quantity;
	}

	private String  top5priceStr = null;
	@Transient
	public String getTop5PriceStr() {
		return top5priceStr;
	}

	public void setTop5PriceStr(String top5priceStr) {
		this.top5priceStr = top5priceStr;
	}
	public Double getTop5Price() {
		return top5Price;
	}

	public void setTop5Price(Double top5Price) {
		this.top5Price = top5Price;
		if (top5priceStr == null) {
			top5priceStr = String.valueOf(top5Price);
		}
	}

	private String  top5DisStr = null;
	@Transient
	public String getTop5DisStr() {
		return top5DisStr;
	}

	public void setTop5DisStr(String top5DisStr) {
		this.top5DisStr = top5DisStr;
	}
	public Double getTop5Discount() {
		return top5Discount;
	}

	public void setTop5Discount(Double top5Discount) {
		this.top5Discount = top5Discount;
		if (top5DisStr == null) {
			top5DisStr = String.valueOf(top5Discount);
		}
	}

	public String getClassDefualt() {
		return classDefualt;
	}

	public void setClassDefualt(String classDefualt) {
		this.classDefualt = classDefualt;
	}

	public String getTop5Info() {
		return top5Info;
	}

	public void setTop5Info(String top5Info) {
		this.top5Info = top5Info;
	}

	public Blob getTop5CoverImg() {
		return top5CoverImg;
	}

	public void setTop5CoverImg(Blob top5CoverImg) {
		this.top5CoverImg = top5CoverImg;
	}

	public String getTop5fileName() {
		return top5fileName;
	}

	public void setTop5fileName(String top5fileName) {
		this.top5fileName = top5fileName;
	}

	@Transient
	public MultipartFile getTop5Image() {
		return top5Image;
	}

	public void setTop5Image(MultipartFile top5Image) {
		this.top5Image = top5Image;
	}
	public Blob getTop5CoverImg1() {
		return top5CoverImg1;
	}

	public void setTop5CoverImg1(Blob top5CoverImg1) {
		this.top5CoverImg1 = top5CoverImg1;
	}

	public String getTop5fileName1() {
		return top5fileName1;
	}

	public void setTop5fileName1(String top5fileName1) {
		this.top5fileName1 = top5fileName1;
	}

	public Blob getTop5CoverImg2() {
		return top5CoverImg2;
	}

	public void setTop5CoverImg2(Blob top5CoverImg2) {
		this.top5CoverImg2 = top5CoverImg2;
	}

	public String getTop5fileName2() {
		return top5fileName2;
	}

	public void setTop5fileName2(String top5fileName2) {
		this.top5fileName2 = top5fileName2;
	}

	public Blob getTop5CoverImg3() {
		return top5CoverImg3;
	}

	public void setTop5CoverImg3(Blob top5CoverImg3) {
		this.top5CoverImg3 = top5CoverImg3;
	}

	public String getTop5fileName3() {
		return top5fileName3;
	}

	public void setTop5fileName3(String top5fileName3) {
		this.top5fileName3 = top5fileName3;
	}

	

}
