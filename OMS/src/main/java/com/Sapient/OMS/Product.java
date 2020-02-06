package com.Sapient.OMS;

import javax.persistence.*;

@Entity
@Table
public class Product {

   @Id
   private int productCode;
   @Column
   private String productSize;
   @Column
   private String productCategory;
   @Column
   private int quantity;
   @Column
   private double price;

   public int getProductCode() {
      return productCode;
   }

   public void setProductCode(int productCode) {
      this.productCode = productCode;
   }

   public String getProductSize() {
      return productSize;
   }

   public void setProductSize(String productSize) {
      this.productSize = productSize;
   }

   public String getProductCategory() {
      return productCategory;
   }

   public void setProductCategory(String productCategory) {
      this.productCategory = productCategory;
   }

   public int getQuantity() {
      return quantity;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }
}
