package com.company;

public class Bird extends Animal implements AnimalMove,AnimalBehavior
{
    private String featherColorManthan56458;



    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    public Bird(){
        super();
        featherColorManthan56458="NN";


    }

    public Bird (String nameManthan56458, int ageManthan56458, int weightManthan56458, String featherColorManthan56458){
        super(nameManthan56458, ageManthan56458, weightManthan56458);
        this.featherColorManthan56458=featherColorManthan56458;
    }

    public Bird(int ageManthan56458 , String featherColorManthan56458){
        super(ageManthan56458);
        this.featherColorManthan56458=featherColorManthan56458;
    }

    public void takingFlightManthan56458(){
        System.out.println("Flap flap");
    }



    @Override
    public void getVoiceManthan56458() {
        System.out.println("Bird is making sounds");
    }

    @Override
    public void eatManthan56458(String FoodName) {
        System.out.println("Bird is eating: " + FoodName);
    }

    @Override
    public void moveManthan56458() {
        System.out.println("Bird moves");
    }

    public String getFeatherColorManthan56458() {
        return featherColorManthan56458;
    }



    public void setFeatherColorManthan56458(String featherColorManthan56458) {
        this.featherColorManthan56458 = featherColorManthan56458;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColorManthan56458='" + featherColorManthan56458 + '\'' +
                '}';
    }
}
