package web.app.demo.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "OrderItem")
public class OrderItemBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer seqNo;
	@Transient
	private Integer orderNo;
	private Integer productId;
	private Integer quantity;
	private Integer unitPrice ;
	private Double discount;	
	private String discription;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FK_OrderBean_orderNo")
	private OrderBean orderBean;

	private OrderItemBean(Integer seqNo, Integer orderNo, Integer productId, Integer quantity, Integer unitPrice,
			Double discount, String discription, OrderBean orderBean) {
		this.seqNo = seqNo;
		this.orderNo = orderNo;
		this.productId = productId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.discription = discription;
		this.orderBean = orderBean;
	}
	private OrderItemBean (){
	}
	public OrderBean getOrderBean() {
		return orderBean;
	}
	public void setOrderBean(OrderBean orderBean) {
		this.orderBean = orderBean;
	}
	
	
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}
	

}
