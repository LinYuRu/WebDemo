package web.app.demo.model;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//本類別封裝產品資料
@Entity
@Table(name="Product")
public class ProductBean {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Integer productId;
	  @Transient
	  private Integer shopId;
	  private String productName;
	  private Integer productQuantity;
	  private Double productPrice;
	  private Double productCost;
	  private Double discount;
	  private Date productAddTime;
	  private Date productupdateTime;
	  private String productCategory;
	  private String categoryDefualt;
	  private String productClass;
	  private String classDefualt;
	  private String productInfo;
	  private Double productWeight;
	  private Double weightDefualt;
	  private String productStatus;
	  private String productValue;
	  @Transient
	  private Integer packageId;
	  @JsonIgnore
	  private Blob    	coverImage;	
	  @JsonIgnore
	  @Transient
	  private MultipartFile productImage;
	  private String  	fileName;
	  @JsonIgnoreProperties("product")
	  @ManyToOne(cascade=CascadeType.ALL)
	  @JoinColumn(name="FK_DeliveryBean_packageId")
	  private DeliveryBean deliveryBean;
	  @ManyToOne(cascade=CascadeType.ALL)
	  @JoinColumn(name="FK_ShopFinanceBean_shopId")
	  private ShopFinanceBean ShopFinance;
	  
	public ProductBean() {
		}
	public ProductBean(Integer productId, Integer shopId, String productName, Integer productQuantity,
			Double productPrice, Double productCost, Date productAddTime,
			Date productupdateTime, String productCategory, String categoryDefualt, String productClass,
			String classDefualt, String productInfo, Double productWeight, Double weightDefualt, String productStatus,
			String productValue, Blob  coverImage, String fileName, Integer packageId) {
		this.productId = productId;
		this.shopId = shopId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCost = productCost;
		this.productAddTime = productAddTime;
		this.productupdateTime = productupdateTime;
		this.productCategory = productCategory;
		this.categoryDefualt = categoryDefualt;
		this.productClass = productClass;
		this.classDefualt = classDefualt;
		this.productInfo = productInfo;
		this.productWeight = productWeight;
		this.weightDefualt = weightDefualt;
		this.productStatus = productStatus;
		this.productValue = productValue;
		this.coverImage=coverImage;
		this.fileName=fileName;
		this.productQuantity = 0;
		this.packageId=packageId;
		}
	
	public ProductBean(Integer productId, Integer shopId, String productName, Integer productQuantity,
			Double productPrice, Double productCost, Date productAddTime,
			Date productupdateTime, String productCategory, String categoryDefualt, String productClass,
			String classDefualt, String productInfo, Double productWeight, Double weightDefualt, String productStatus,
			Blob coverImage, String fileName, String productValue, DeliveryBean deliveryBean) {
		this.productId = productId;
		this.shopId = shopId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCost = productCost;
		this.productAddTime = productAddTime;
		this.productupdateTime = productupdateTime;
		this.productCategory = productCategory;
		this.categoryDefualt = categoryDefualt;
		this.productClass = productClass;
		this.classDefualt = classDefualt;
		this.productInfo = productInfo;
		this.productWeight = productWeight;
		this.weightDefualt = weightDefualt;
		this.productStatus = productStatus;
		this.productValue = productValue;
		this.coverImage=coverImage;
		this.fileName=fileName;
		this.productQuantity = productQuantity;
		this.deliveryBean=deliveryBean;
		}
	public ProductBean(Integer shopId, String productName, Integer productQuantity,
			Double productPrice, Double productCost, String productDiscount, Date productAddTime,
			Date productupdateTime, String productCategory, String categoryDefualt, String productClass,
			String classDefualt, String productInfo, Double productWeight, Double weightDefualt, String productStatus,
			String productValue, Blob coverImage, String fileName, Integer packageId) {
		this.shopId = shopId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.productCost = productCost;
		this.productAddTime = productAddTime;
		this.productupdateTime = productupdateTime;
		this.productCategory = productCategory;
		this.categoryDefualt = categoryDefualt;
		this.productClass = productClass;
		this.classDefualt = classDefualt;
		this.productInfo = productInfo;
		this.productWeight = productWeight;
		this.weightDefualt = weightDefualt;
		this.productStatus = productStatus;
		this.productValue = productValue;
		this.coverImage=coverImage;
		this.fileName=fileName;
		this.packageId=packageId;
	}
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	@Transient
	private String  priceStr = null;
	
	public String getPriceStr() {
		return priceStr;
	}

	public void setPriceStr(String priceStr) {
		this.priceStr = priceStr;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
		if (priceStr == null) {
			priceStr = String.valueOf(productPrice);
		}
	}
	@Transient
	private String  costStr = null;
	
	public String getCostStr() {
		return costStr;
	}
	public void setCostStr(String costStr) {
		this.costStr = costStr;
	}
	public Double getProductCost() {
		return productCost;
	}
	public void setProductCost(Double productCost) {
		this.productCost = productCost;
		if (costStr == null) {
			costStr = String.valueOf(productCost);
		}
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		if (discount  == null) {  //0.8 打8折, 0.75 打75折
			this.discount = 1.0;
			discountStr = "";
			return;
		}
		this.discount = discount;
		
		if (discount == 1) {
			discountStr = "";
		} else {
			int dnt = (int)(discount * 100);
			if (dnt % 10 == 0) {
				discountStr = (dnt / 10) + "折";
			} else {
				discountStr = " "  + dnt + "折";
			} 
			
		}
	}
	@Transient
	private String discountStr = null;
	
	public String getDiscountStr() {
		return discountStr;
	}
	public void setDiscountStr(String discountStr) {
		this.discountStr = discountStr;
	}
	public Date getProductAddTime() {
		return productAddTime;
	}
	public void setProductAddTime(Date productAddTime) {
		this.productAddTime = productAddTime;
	}
	public Date getProductupdateTime() {
		return productupdateTime;
	}
	public void setProductupdateTime(Date productupdateTime) {
		this.productupdateTime = productupdateTime;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getCategoryDefualt() {
		return categoryDefualt;
	}
	public void setCategoryDefualt(String categoryDefualt) {
		this.categoryDefualt = categoryDefualt;
	}
	public String getProductClass() {
		return productClass;
	}
	public void setProductClass(String productClass) {
		this.productClass = productClass;
	}
	public String getClassDefualt() {
		return classDefualt;
	}
	public void setClassDefualt(String classDefualt) {
		this.classDefualt = classDefualt;
	}
	public String getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}
	@Transient
	private String pWeightStr = null;
	
	public String getpWeightStr() {
		return pWeightStr;
	}
	public void setpWeightStr(String pWeightStr) {
		this.pWeightStr = pWeightStr;
	}
	public Double getProductWeight() {
		return productWeight;
	}
	public void setProductWeight(Double productWeight) {
		this.productWeight = productWeight;
		if (pWeightStr == null) {
			pWeightStr = String.valueOf(productWeight);
		}
	}
	@Transient
	private String wDefualttStr = null;
	
	public String getwDefualttStr() {
		return wDefualttStr;
	}
	public void setwDefualttStr(String wDefualttStr) {
		this.wDefualttStr = wDefualttStr;
	}
	public Double getWeightDefualt() {
		return weightDefualt;
	}
	public void setWeightDefualt(Double weightDefualt) {
		this.weightDefualt = weightDefualt;
		if (wDefualttStr == null) {
			wDefualttStr = String.valueOf(weightDefualt);
		}
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getProductValue() {
		return productValue;
	}
	public void setProductValue(String productValue) {
		this.productValue = productValue;
	}
	
	public Integer getPackageId() {
		return packageId;
	}
	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}
	
	public DeliveryBean getDeliveryBean() {
		return deliveryBean;
	}
	public void setDeliveryBean(DeliveryBean deliveryBean) {
		this.deliveryBean = deliveryBean;
	}
	public Blob getCoverImage() {
		return coverImage;
	}
	public void setCoverImage(Blob coverImage) {
		this.coverImage = coverImage;
	}
	
	public MultipartFile getProductImage() {
		return productImage;  //取出檔名
	}
	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	  public ShopFinanceBean getShopFinance() {
		return ShopFinance;
	}
	public void setShopFinance(ShopFinanceBean shopFinance) {
		ShopFinance = shopFinance;
	}
	
}
