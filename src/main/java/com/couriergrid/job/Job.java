package com.couriergrid.job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Job { 
	
	@Id
	private Long id;
	private Integer jobType;	
	private String subject;
	private String description;
	private Long createdAt;
	
	private Receiver receiver;	
	private Sender sender;
	private Size size;
	private Delivery delivery;
	private List<CourierInfo> couriers;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getJobType() {
		return jobType;
	}
	public void setJobType(Integer jobType) {
		this.jobType = jobType;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Long getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Receiver getReceiver() {
		return receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public Sender getSender() {
		return sender;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	public Delivery getDelivery() {
		return delivery;
	}
	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}
	
	public List<CourierInfo> getCouriers() {
		return couriers;
	}
	public void setCouriers(List<CourierInfo> couriers) {
		this.couriers = couriers;
	}
	public void addCourier(CourierInfo courierInfo) {
		if(this.couriers == null) {
			couriers = new ArrayList<CourierInfo>();
		}
		
		couriers.add(courierInfo);
	}

	public class Size {
		private double weight;
		private double length;
		private double width;
		private double heigth;
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		public double getHeigth() {
			return heigth;
		}
		public void setHeigth(double heigth) {
			this.heigth = heigth;
		}
	}

	public class Receiver {
		
		private int id;
		private String name;
		private String email;
		private String[] location;
		private String address;
		private String contact;
		private String additionalInfo;
		private int identificationMethod;
		private String identificationNumber;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String[] getLocation() {
			return location;
		}
		public void setLocation(String[] location) {
			this.location = location;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getAdditionalInfo() {
			return additionalInfo;
		}
		public void setAdditionalInfo(String additionalInfo) {
			this.additionalInfo = additionalInfo;
		}
		public int getIdentificationMethod() {
			return identificationMethod;
		}
		public void setIdentificationMethod(int identificationMethod) {
			this.identificationMethod = identificationMethod;
		}
		public String getIdentificationNumber() {
			return identificationNumber;
		}
		public void setIdentificationNumber(String identificationNumber) {
			this.identificationNumber = identificationNumber;
		}
		
	}
	
	public class Sender {
		
		private long id;
		private String name;
		private String contact;
		private String address;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	}
	
	public class Delivery {
		private long expectedDate;
		private double offer;
		private String priceType;
		public long getExpectedDate() {
			return expectedDate;
		}
		public void setExpectedDate(long expectedDate) {
			this.expectedDate = expectedDate;
		}
		public double getOffer() {
			return offer;
		}
		public void setOffer(double offer) {
			this.offer = offer;
		}
		public String getPriceType() {
			return priceType;
		}
		public void setPriceType(String priceType) {
			this.priceType = priceType;
		}
	}
	
	public class CourierInfo {
		private long courierId;
		private double proposedAmount;
		private long proposedAt;
		private boolean isSaved;
		private boolean reporedType;
		private String reportDescription;
		private String status;

		public long getCourierId() {
			return courierId;
		}
		public void setCourierId(long courierId) {
			this.courierId = courierId;
		}
		public double getProposedAmount() {
			return proposedAmount;
		}
		public void setProposedAmount(double proposedAmount) {
			this.proposedAmount = proposedAmount;
		}
		public long getProposedAt() {
			return proposedAt;
		}
		public void setProposedAt(long proposedAt) {
			this.proposedAt = proposedAt;
		}
		public boolean isSaved() {
			return isSaved;
		}
		public void setSaved(boolean isSaved) {
			this.isSaved = isSaved;
		}
		public boolean isReporedType() {
			return reporedType;
		}
		public void setReporedType(boolean reporedType) {
			this.reporedType = reporedType;
		}
		public String getReportDescription() {
			return reportDescription;
		}
		public void setReportDescription(String reportDescription) {
			this.reportDescription = reportDescription;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
	}
	
}
