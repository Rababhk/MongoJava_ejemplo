package com.becaries.MongoJava.modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Princesa {


private String idPrincesa;
@SerializedName("name")
@Expose
private String name;
@SerializedName("personality")
@Expose
private String personality;
@SerializedName("appearance")
@Expose
private String appearance;
@SerializedName("nationality")
@Expose
private String nationality;
@SerializedName("occupation")
@Expose
private String occupation;
@SerializedName("likes")
@Expose
private String likes;
@SerializedName("dislikes")
@Expose
private String dislikes;
@SerializedName("powers")
@Expose
private String powers;
@SerializedName("famousquotes")
@Expose
private String famousquotes;
@SerializedName("zodiacsign")
@Expose
private String zodiacsign;
@SerializedName("category")
@Expose
private String category;
@SerializedName("image")
@Expose
private String image;

private String idPelicula;




public Princesa(String idPrincesa, String name, String personality, String appearance, String nationality,
        String occupation, String likes, String dislikes, String powers, String famousquotes, String zodiacsign,
        String category, String image, String idPelicula) {
    this.idPrincesa = idPrincesa;
    this.name = name;
    this.personality = personality;
    this.appearance = appearance;
    this.nationality = nationality;
    this.occupation = occupation;
    this.likes = likes;
    this.dislikes = dislikes;
    this.powers = powers;
    this.famousquotes = famousquotes;
    this.zodiacsign = zodiacsign;
    this.category = category;
    this.image = image;
    this.idPelicula = idPelicula;
}


@Override
public String toString() {
    return "Princesa [appearance=" + appearance + ", category=" + category + ", dislikes=" + dislikes
            + ", famousquotes=" + famousquotes + ", idPelicula=" + idPelicula + ", idPrincesa=" + idPrincesa
            + ", image=" + image + ", likes=" + likes + ", name=" + name + ", nationality=" + nationality
            + ", occupation=" + occupation + ", personality=" + personality + ", powers=" + powers + ", zodiacsign="
            + zodiacsign + "]";
}


public String getIdPrincesa() {
    return idPrincesa;
}


public void setIdPrincesa(String idPrincesa) {
    this.idPrincesa = idPrincesa;
}


public String getIdPelicula() {
    return idPelicula;
}

public void setIdPelicula(String idPelicula) {
    this.idPelicula = idPelicula;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getPersonality() {
return personality;
}

public void setPersonality(String personality) {
this.personality = personality;
}

public String getAppearance() {
return appearance;
}

public void setAppearance(String appearance) {
this.appearance = appearance;
}

public String getNationality() {
return nationality;
}

public void setNationality(String nationality) {
this.nationality = nationality;
}

public String getOccupation() {
return occupation;
}

public void setOccupation(String occupation) {
this.occupation = occupation;
}

public String getLikes() {
return likes;
}

public void setLikes(String likes) {
this.likes = likes;
}

public String getDislikes() {
return dislikes;
}

public void setDislikes(String dislikes) {
this.dislikes = dislikes;
}

public String getPowers() {
return powers;
}

public void setPowers(String powers) {
this.powers = powers;
}

public String getFamousquotes() {
return famousquotes;
}

public void setFamousquotes(String famousquotes) {
this.famousquotes = famousquotes;
}

public String getZodiacsign() {
return zodiacsign;
}

public void setZodiacsign(String zodiacsign) {
this.zodiacsign = zodiacsign;
}

public String getCategory() {
return category;
}

public void setCategory(String category) {
this.category = category;
}

public String getImage() {
return image;
}

public void setImage(String image) {
this.image = image;
}

}