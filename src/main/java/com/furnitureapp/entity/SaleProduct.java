/*
    Coder: Elvis Gene
    Description: SaleProduct class. A sale might have more than one item and an item might exist in many sales
                    so this class serves as a bridge class whose objects will be unique to a sale.
 */


package com.furnitureapp.entity;

public class SaleProduct {
    private int saleCode;
    private int prodCode;
    private int quantity;

    private SaleProduct(Builder builder) {
        this.saleCode = builder.saleCode;
        this.prodCode = builder.prodCode;
        this.quantity = builder.quantity;
    }

    public int getSaleCode() {
        return saleCode;
    }

    public int getProdCode() {
        return prodCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public static class Builder{
        private int saleCode;
        private int prodCode;
        private int quantity;

        public Builder(){}

        public Builder setSaleCode(int saleCode) {
            this.saleCode = saleCode;
            return this;
        }

        public Builder setProdCode(int prodCode) {
            this.prodCode = prodCode;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder copy(SaleProduct saleProduct){
            this.saleCode = saleProduct.saleCode;
            this.prodCode = saleProduct.prodCode;
            this.quantity = saleProduct.quantity;
            return this;
        }

        public SaleProduct build(){
            return new SaleProduct(this);
        }
    }
}
