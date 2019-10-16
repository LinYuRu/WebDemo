package web.app.demo.model;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "OrderBean")
public class OrderBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderNo;
	private Integer packageId;
	private Integer totalPrice;
	private Integer memberId;
	private Date    orderDate;
	private Integer invoiceNo;
	private Integer packageNo;
	@OneToMany(mappedBy="orderBean")
	private Set<OrderItemBean> items = new LinkedHashSet<>();
	
	private OrderBean(Integer orderNo, Integer packageId, Integer totalPrice, Integer memberId, Date orderDate,
			Integer invoiceNo, Integer packageNo) {
		this.orderNo = orderNo;
		this.packageId = packageId;
		this.totalPrice = totalPrice;
		this.memberId = memberId;
		this.orderDate = orderDate;
		this.invoiceNo = invoiceNo;
		this.packageNo = packageNo;
	}
	
	private OrderBean (){
	}
	public Set<OrderItemBean> getItems() {
		return items;
	}
	public void setItems(Set<OrderItemBean> items) {
		this.items = items;
	}
	
	
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public Integer getPackageId() {
		return packageId;
	}
	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}
	public Integer getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Integer getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(Integer invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Integer getPackageNo() {
		return packageNo;
	}
	public void setPackageNo(Integer packageNo) {
		this.packageNo = packageNo;
	}
	
}
