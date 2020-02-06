package com.Sapient.OMS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CustomerOrder {

    @Id
    private int orderId;
    @Column
    private String orderDate;
    @Column
    private String customerIdentificationNumber;
    @Column
    private String productCode;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerIdentificationNumber() {
        return customerIdentificationNumber;
    }

    public void setCustomerIdentificationNumber(String customerIdentificationNumber) {
        this.customerIdentificationNumber = customerIdentificationNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
