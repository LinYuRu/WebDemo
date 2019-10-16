package web.app.demo.model;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "DeliveryInfo")
public class DeliveryBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer packageId;
	private String packageAddress;
	private String packagePrice;  //運費
	private String packageStatus; //取貨狀態
	private Date packageFetchTime; //取貨時間
	private Date packageTime;  //到貨時間
	private Date packageDeliveryTime; //出貨時間
	private Date packageOrderTime; //下訂時間
	private Date packageToSellerTime; //通知賣家訂單時間
	private String receiver; //收件人
	private Double packageHeight;
	private Double packageWidth;
	private Double packageLength;
	@OneToMany(mappedBy="deliveryBean")
	private Set<ProductBean> product = new LinkedHashSet<>();

	private DeliveryBean(Integer packageId, String packageAddress, String packagePrice, String packageStatus,
			Date packageFetchTime, Date packageTime, Date packageDeliveryTime, Date packageOrderTime,
			Date packageToSellerTime, String receiver, Double packageHeight, Double packageWidth,
			Double packageLength) {
		this.packageId = packageId;
		this.packageAddress = packageAddress;
		this.packagePrice = packagePrice;
		this.packageStatus = packageStatus;
		this.packageFetchTime = packageFetchTime;
		this.packageTime = packageTime;
		this.packageDeliveryTime = packageDeliveryTime;
		this.packageOrderTime = packageOrderTime;
		this.packageToSellerTime = packageToSellerTime;
		this.receiver = receiver;
		this.packageHeight = packageHeight;
		this.packageWidth = packageWidth;
		this.packageLength = packageLength;
	}
	private DeliveryBean() {
	}
	
	public Integer getPackageId() {
		return packageId;
	}
	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}
	public String getPackageAddress() {
		return packageAddress;
	}
	public void setPackageAddress(String packageAddress) {
		this.packageAddress = packageAddress;
	}
	public String getPackageStatus() {
		return packageStatus;
	}
	public void setPackageStatus(String packageStatus) {
		this.packageStatus = packageStatus;
	}
	public Date getPackageDeliveryTime() {
		return packageDeliveryTime;
	}
	public void setPackageDeliveryTime(Date packageDeliveryTime) {
		this.packageDeliveryTime = packageDeliveryTime;
	}
	public Date getPackageOrderTime() {
		return packageOrderTime;
	}
	public void setPackageOrderTime(Date packageOrderTime) {
		this.packageOrderTime = packageOrderTime;
	}
	public Date getPackageToSellerTime() {
		return packageToSellerTime;
	}
	public void setPackageToSellerTime(Date packageToSellerTime) {
		this.packageToSellerTime = packageToSellerTime;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public Date getPackageTime() {
		return packageTime;
	}
	public void setPackageTime(Date packageTime) {
		this.packageTime = packageTime;
	}
	public Date getPackageFetchTime() {
		return packageFetchTime;
	}
	public void setPackageFetchTime(Date packageFetchTime) {
		this.packageFetchTime = packageFetchTime;
	}

	public Double getPackageHeight() {
		return packageHeight;
	}
	public void setPackageHeight(Double packageHeight) {
		this.packageHeight = packageHeight;
	}
	public Double getPackageWidth() {
		return packageWidth;
	}
	public void setPackageWidth(Double packageWidth) {
		this.packageWidth = packageWidth;
	}
	public Double getPackageLength() {
		return packageLength;
	}
	public void setPackageLength(Double packageLength) {
		this.packageLength = packageLength;
	}
	@Transient
	private String priceStr = null;
	public String getPackagePrice() {
		return packagePrice;
	}
	public void setPackagePrice(String packagePrice) {
		this.packagePrice = packagePrice;
	}
	public Set<ProductBean> getProduct() {
		return product;
	}
	public void setProduct(Set<ProductBean> product) {
		this.product = product;
	}
	
	
	
	
	
}
