package com.company;

public class Dog extends Mammal implements AnimalBehavior,AnimalMove
{
    private String breedManthan56458;

    Dog(){
        super();
        breedManthan56458= "NN";
    }

    public Dog(String nameManthan56458 , int ageManthan56458,int weightManthan56458,String rzadManthan56458, String breedManthan56458){
        super(nameManthan56458,ageManthan56458,weightManthan56458,rzadManthan56458);
        this.breedManthan56458=breedManthan56458;
    }

    public Dog(int ageManthan56458, String rzadManthan56458, String breedManthan56458){
        super(ageManthan56458,rzadManthan56458);
        this.breedManthan56458=breedManthan56458;
    }

    public void sportManthan56458(){
        System.out.println("The dog is retrieving.");
    }

    @Override
    public void drinkMilkManthan56458() {
        System.out.println("The dog is drinking milk.");
    }

    @Override
    public void getVoiceManthan56458() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eatManthan56458(String FoodName) {
        System.out.println("The dog is eating: "+ FoodName);
    }

    @Override
    public void sleep() {
        System.out.println("ZZZ");
    }

    @Override
    public void moveManthan56458() {
        System.out.println("Dog is running");
    }

    public String getBreedManthan56458() {
        return breedManthan56458;
    }

    public void setBreedManthan56458(String breedManthan56458) {
        this.breedManthan56458 = breedManthan56458;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breedManthan56458='" + breedManthan56458 + '\'' +
                '}';
    }
}
