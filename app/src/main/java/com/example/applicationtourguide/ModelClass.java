package com.example.applicationtourguide;

public class ModelClass {

    private long itemId;
    private String itemName;
    private String itemAddress;
    private String itemWebsite;
    private String itemImage;
    private String itemPhone;
    private String itemDetails;

    public ModelClass() {
    }


    public ModelClass( String itemName, String itemAddress, String itemImage, String itemDetails, String itemPhone, String itemWebsite) {
        this.itemName = itemName;
        this.itemAddress = itemAddress;
        this.itemWebsite = itemWebsite;
        this.itemImage = itemImage;
        this.itemPhone = itemPhone;
        this.itemDetails= itemDetails;
    }

    public String getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(String itemDetails) {
        this.itemDetails = itemDetails;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemAddress() {
        return itemAddress;
    }

    public void setItemAddress(String itemAddress) {
        this.itemAddress = itemAddress;
    }

    public String getItemWebsite() {
        return itemWebsite;
    }

    public void setItemWebsite(String itemWebsite) {
        this.itemWebsite = itemWebsite;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemPhone() {
        return itemPhone;
    }

    public void setItemPhone(String itemPhone) {
        this.itemPhone = itemPhone;
    }
}
