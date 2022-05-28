package com.company;

public class Mammal extends Animal implements AnimalMove,AnimalName
{
    private String orderManthan56458;

    public Mammal(){
        super();
        orderManthan56458 = "NN";
    }

    public Mammal(String nameManthan56458, int ageManthan56458 , int weightManthan56458, String orderManthan56458){
        super(nameManthan56458, ageManthan56458, weightManthan56458);
        this.orderManthan56458=orderManthan56458;
    }

    public Mammal(int ageManthan56458 , String orderManthan56458){
        super(ageManthan56458);
        this.orderManthan56458=orderManthan56458;
    }

    @Override
    public void moveManthan56458() {
        System.out.println("Mammal is moving ");
    }

    public void drinkMilkManthan56458(){
        System.out.println("Gulp gulp");
    }


    @Override
    public void getVoiceManthan56458() {
        System.out.println("Mammal is making sounds");
    }

    @Override
    public void eatManthan56458(String FoodName) {
        System.out.println("Mammal is eating: " + FoodName);
    }

    public String getOrderManthan56458() {
        return orderManthan56458;
    }

    public void setOrderManthan56458(String orderManthan56458) {
        this.orderManthan56458 = orderManthan56458;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "orderManthan56458='" + orderManthan56458 + '\'' +
                '}';
    }

}
