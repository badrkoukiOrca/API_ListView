package com.example.webservicemvvm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coffe {

    @SerializedName("nom")
    @Expose
    private  String nom ;

    @SerializedName("adresse")
    @Expose
    private  String adresse ;

    @SerializedName("Telephone")
    @Expose
    private String tel  ;

    @SerializedName("image")
    @Expose
    private  String image ;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
