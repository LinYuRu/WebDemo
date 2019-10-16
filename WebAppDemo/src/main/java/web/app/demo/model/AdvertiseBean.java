package web.app.demo.model;

import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class AdvertiseBean {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer advertiseId;
	private String advertiseCover;
	private Blob advertiseCoverImage;
	private String advertiseDetail1;
	private Blob advertiseImage1;
	private String advertiseDetail2;
	private Blob advertiseImage2;
	

	public Integer getAdvertiseId() {
		return advertiseId;
	}

	public void setAdvertiseId(Integer advertiseId) {
		this.advertiseId = advertiseId;
	}

	public String getAdvertiseCover() {
		return advertiseCover;
	}

	public void setAdvertiseCover(String advertiseCover) {
		this.advertiseCover = advertiseCover;
	}

	public Blob getAdvertiseCoverImage() {
		return advertiseCoverImage;
	}

	public void setAdvertiseCoverImage(Blob advertiseCoverImage) {
		this.advertiseCoverImage = advertiseCoverImage;
	}

	public String getAdvertiseDetail1() {
		return advertiseDetail1;
	}

	public void setAdvertiseDetail1(String advertiseDetail1) {
		this.advertiseDetail1 = advertiseDetail1;
	}

	public Blob getAdvertiseImage1() {
		return advertiseImage1;
	}

	public void setAdvertiseImage1(Blob advertiseImage1) {
		this.advertiseImage1 = advertiseImage1;
	}

	public String getAdvertiseDetail2() {
		return advertiseDetail2;
	}

	public void setAdvertiseDetail2(String advertiseDetail2) {
		this.advertiseDetail2 = advertiseDetail2;
	}

	public Blob getAdvertiseImage2() {
		return advertiseImage2;
	}

	public void setAdvertiseImage2(Blob advertiseImage2) {
		this.advertiseImage2 = advertiseImage2;
	}

	
}
