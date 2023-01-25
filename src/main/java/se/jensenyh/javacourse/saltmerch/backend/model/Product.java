package se.jensenyh.javacourse.saltmerch.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Serializable
{
    // todo: needs fields:

    @JsonProperty
    public int getId() {
        return id;
    }
@JsonProperty
    public void setId(int id) {
        this.id = id;
    }
    @JsonProperty
    public String getCategory() {
        return category;
    }
    @JsonProperty
    public void setCategory(String category) {
        this.category = category;
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
    public String getDescription() {
        return description;
    }
    @JsonProperty
    public void setDescription(String description) {
        this.description = description;
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
    public  int id;
    @JsonProperty
      public  String category ;
    @JsonProperty
      public  String title;
    @JsonProperty
   public String description;
    @JsonProperty
   public String previewImage;
    @JsonProperty
   public ArrayList<ColorVariant> colorVariants = new ArrayList<ColorVariant>();
    
    // todo: all fields should be public and annotated with @JsonProperty
    
    // todo: needs 3 constructors:
    //  1. empty constructor: this one only initializes colorVariants to new ArrayList<>()
    //  2. constructor with id, category, title, description, and previewImage: this one initializes colorVariants to new ArrayList<>()
    //  3. constructor with id, category, title, description, colorVariants


    public Product(ArrayList<ColorVariant> colorVariants) {
        this.colorVariants = new ArrayList<>();
    }

    public Product(int id, String category, String title, String description,  ArrayList<ColorVariant> colorVariants) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.description = description;

        this.colorVariants = colorVariants;
    }

    public Product(int id, String category, String title, String description, String previewImage) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.description = description;
        this.previewImage = previewImage;
        this.colorVariants = new ArrayList<>();
    }

    public Product() {
        this.colorVariants = new ArrayList<>();
    }

}
