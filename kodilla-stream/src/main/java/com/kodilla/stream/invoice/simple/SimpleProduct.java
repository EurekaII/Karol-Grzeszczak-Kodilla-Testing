package com.kodilla.stream.invoice.simple;

public final class SimpleProduct {

    private final String productName;
    private final Double productPrice;

    public SimpleProduct(final String productName, final Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }
    public Double getProductPrice() {
        return productPrice;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleProduct)) return false;
        SimpleProduct that = (SimpleProduct) o;
        return productName.equals(that.productName);
    }
}
