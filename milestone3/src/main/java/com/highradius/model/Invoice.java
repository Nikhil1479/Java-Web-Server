package com.highradius.model;

public class Invoice {
	private int slNo;
	private int customerOrderID;
    private int salesOrg;
    private String distributionChannel;
    private String division;
    private double releasedCreditValue;
    private String purchaseOrderType;
    private int companyCode;
    private String orderCreationDate;
    private String orderCreationTime;
    private String creditControlArea;
    private int soldToParty;
    private double orderAmount;
    private String requestedDeliveryDate;
    private String orderCurrency;
    private String creditStatus;
    private int customerNumber;
    private double amountInUSD;
    private String uniqueCustID;

    public Invoice(int slNo,int customerOrderID, int salesOrg, String distributionChannel, String division,
                   double releasedCreditValue, String purchaseOrderType, int companyCode, String orderCreationDate,
                   String orderCreationTime, String creditControlArea, int soldToParty, double orderAmount,
                   String requestedDeliveryDate, String orderCurrency, String creditStatus, int customerNumber,
                   double amountInUSD, String uniqueCustID) {
    	this.slNo = slNo;
        this.customerOrderID = customerOrderID;
        this.salesOrg = salesOrg;
        this.distributionChannel = distributionChannel;
        this.division = division;
        this.releasedCreditValue = releasedCreditValue;
        this.purchaseOrderType = purchaseOrderType;
        this.companyCode = companyCode;
        this.orderCreationDate = orderCreationDate;
        this.orderCreationTime = orderCreationTime;
        this.creditControlArea = creditControlArea;
        this.soldToParty = soldToParty;
        this.orderAmount = orderAmount;
        this.requestedDeliveryDate = requestedDeliveryDate;
        this.orderCurrency = orderCurrency;
        this.creditStatus = creditStatus;
        this.customerNumber = customerNumber;
        this.amountInUSD = amountInUSD;
        this.uniqueCustID = uniqueCustID;
    }

    // Getters and Setters for the new columns
    
    public int getSlNo() {
    	return slNo;
	}
    
    public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public double getReleasedCreditValue() {
        return releasedCreditValue;
    }

    public void setReleasedCreditValue(double releasedCreditValue) {
        this.releasedCreditValue = releasedCreditValue;
    }

    public String getPurchaseOrderType() {
        return purchaseOrderType;
    }

    public void setPurchaseOrderType(String purchaseOrderType) {
        this.purchaseOrderType = purchaseOrderType;
    }

    public String getOrderCreationTime() {
        return orderCreationTime;
    }

    public void setOrderCreationTime(String orderCreationTime) {
        this.orderCreationTime = orderCreationTime;
    }

    public String getCreditControlArea() {
        return creditControlArea;
    }

    public void setCreditControlArea(String creditControlArea) {
        this.creditControlArea = creditControlArea;
    }

    public int getSoldToParty() {
        return soldToParty;
    }

    public void setSoldToParty(int soldToParty) {
        this.soldToParty = soldToParty;
    }

    public String getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    public void setRequestedDeliveryDate(String requestedDeliveryDate) {
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public double getAmountInUSD() {
        return amountInUSD;
    }

    public void setAmountInUSD(double amountInUSD) {
        this.amountInUSD = amountInUSD;
    }

    public String getUniqueCustID() {
        return uniqueCustID;
    }

    public void setUniqueCustID(String uniqueCustID) {
        this.uniqueCustID = uniqueCustID;
    }


	public int getCustomerOrderID() {
		return customerOrderID;
	}

	public void setCustomerOrderID(int custOrderID) {
		customerOrderID = custOrderID;
	}

	public int getSalesOrg() {
		return salesOrg;
	}

	public void setSalesOrg(int salesOrg) {
		this.salesOrg = salesOrg;
	}

	public String getDistributionChannel() {
		return distributionChannel;
	}

	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getOrderCreationDate() {
		return orderCreationDate;
	}

	public void setOrderCreationDate(String orderCreationDate) {
		this.orderCreationDate = orderCreationDate;
	}

	public String getOrderCurrency() {
		return orderCurrency;
	}

	public void setOrderCurrency(String orderCurrency) {
		this.orderCurrency = orderCurrency;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
		
}