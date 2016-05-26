package com.example.jeffery.BJ1616939PartB;

/**
 * Created by JEFFERY on 5/10/2016.
 */
public class DoctorDataProvider {
    private int doctor_image_resource;
    private String doctor_title;
    private String doctor_rating;

    public String getDoctor_rating() {
        return doctor_rating;
    }

    public void setDoctor_rating(String doctor_rating) {
        this.doctor_rating = doctor_rating;
    }

    public String getDoctor_title() {
        return doctor_title;
    }

    public void setDoctor_title(String doctor_title) {
        this.doctor_title = doctor_title;
    }

    public int getDoctor_image_resource() {
        return doctor_image_resource;
    }

    public void setDoctor_image_resource(int doctor_image_resource) {
        this.doctor_image_resource = doctor_image_resource;
    }

    public DoctorDataProvider(int doctor_image_resource, String doctor_title, String doctor_rating) {
        this.doctor_image_resource = doctor_image_resource;
        this.doctor_title = doctor_title;
        this.doctor_rating = doctor_rating;
    }
}
