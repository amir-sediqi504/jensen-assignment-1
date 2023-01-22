package se.jensenyh.javacourse.saltmerch.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CartItem
{
    // todo: needs fields: int productId, String title, String color, String size, String previewImage, and int quantity
   public int productId;
   public String title;

    @JsonProperty
    public int getProductId() {
        return productId;
    }
@JsonProperty
    public void setProductId(int productId) {
        this.productId = productId;
    }
@JsonProperty
    public String getTitle() {
        return title;
    }
@JsonProperty
    public void setTitle(String title) {
        this.title = title;
    }
@JsonProperty
    public String getColor() {
        return color;
    }
@JsonProperty
    public void setColor(String color) {
        this.color = color;
    }
@JsonProperty
    public String getSize() {
        return size;
    }
@JsonProperty
    public void setSize(String size) {
        this.size = size;
    }
@JsonProperty
    public String getPreviewImage() {
        return previewImage;
    }
@JsonProperty
    public void setPreviewImage(String previewImage) {
        this.previewImage = previewImage;
    }
@JsonProperty
    public int getQuantity() {
        return quantity;
    }
@JsonProperty
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   public String color;
   public String size ;
  public  String previewImage;
   public int quantity;
    // todo: all fields should be public and annotated with @JsonProperty
    
    // todo: needs 3 constructors:
    //  1. empty constructor
    //  2. constructor with productId, title, color, size, and previewImage
    //  3. constructor with productId, title, color, size, previewImage, and quantity
    public CartItem(){

    }

    public CartItem(int productId, String title, String color, String size, String previewImage) {
        this.productId = productId;
        this.title = title;
        this.color = color;
        this.size = size;
        this.previewImage = previewImage;
    }

    public CartItem(int productId, String title, String color, String size, String previewImage, int quantity) {
        this.productId = productId;
        this.title = title;
        this.color = color;
        this.size = size;
        this.previewImage = previewImage;
        this.quantity = quantity;
    }
}
