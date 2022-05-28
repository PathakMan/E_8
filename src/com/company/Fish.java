package com.company;

public class Fish extends Animal implements AnimalBehavior,AnimalMove
{
    private String scaleColorManthan56458;

    public Fish(){
        super();
        scaleColorManthan56458= "NN";
    }

    public Fish(String nameManthan56458, int ageManthan56458 , int weightManthan56458, String scaleColorManthan56458){
        super(nameManthan56458, ageManthan56458, weightManthan56458);
        this.scaleColorManthan56458= scaleColorManthan56458;
    }

    public Fish(int ageManthan56458 , String scaleColorManthan56458){
        super(ageManthan56458);
        this.scaleColorManthan56458=scaleColorManthan56458;
    }

    public void drinkWaterManthan56458(){
        System.out.println("Gulp gulp");
    }

    @Override
    public void getVoiceManthan56458() {
        System.out.println("Fish is making sounds");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void moveManthan56458() {
        System.out.println("Fish is swimming");
    }

    @Override
    public void eatManthan56458(String FoodName) {
        System.out.println("Fish is eating: "+ FoodName);
    }

    public String getScaleColorManthan56458() {
        return scaleColorManthan56458;
    }

    public void setScaleColorManthan56458(String scaleColorManthan56458) {
        this.scaleColorManthan56458 = scaleColorManthan56458;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColorManthan56458='" + scaleColorManthan56458 + '\'' +
                '}';
    }
}
