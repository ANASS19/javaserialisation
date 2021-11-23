package com.company;

public class Car {
   private String model;
   private String make;
   private int years;

   Car (String model,String make,int years){
      this.setModel(model);
      this.setMake(make);
      this.setYears(years);
   }
   Car(Car x){
      this.copy(x);
   }


   public String getMake() {
      return make;
   }

   public void setMake(String make) {
      this.make = make;
   }

   public int getYears() {
      return years;
   }

   public void setYears(int years) {
      this.years = years;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }
   public  void copy(Car x){
      this.setMake(x.getMake());
      this.setModel(x.getModel());
      this.setYears(x.getYears());
   }
}
