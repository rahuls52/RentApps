package com.example.lenovo.rentapps.model;

public class Owner {

    private int id;
    private String name;
    private String ownerAddress;
    private String flatLocation;
    private String amenities;
    private String facilities;
    private int rent;
    private int mobileNo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public String getFlatLocation() {
        return flatLocation;
    }

    public void setFlatLocation(String flatLocation) {
        this.flatLocation = flatLocation;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }



    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }


    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ownerAddress='" + ownerAddress + '\'' +
                ", flatLocation='" + flatLocation + '\'' +
                ", amenities='" + amenities + '\'' +
                ", facilities='" + facilities + '\'' +
                ", rent=" + rent +
                ", mobileNo=" + mobileNo +
                '}';
    }
}
