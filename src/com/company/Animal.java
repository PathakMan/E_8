package com.company;

abstract class Animal implements AnimalMove ,AnimalName
{
    private String nameManthan56458;
    private int ageManthan56458;
    private int weightManthan56458;

    public Animal(){
        ageManthan56458 = weightManthan56458 = 10;
        nameManthan56458 = "NN";
    }

    public Animal(String nameManthan56458 ,int ageManthan56458 , int weightManthan56458){
        this.nameManthan56458 = nameManthan56458;
        this.ageManthan56458= ageManthan56458;
        this.weightManthan56458= weightManthan56458;
    }

    public Animal(int ageManthan56458){
        this.ageManthan56458=ageManthan56458;
    }

    public abstract void eatManthan56458(String FoodName);

    public abstract void moveManthan56458();

    public abstract void getVoiceManthan56458();

    public String getNameManthan56458() {
        return nameManthan56458;
    }

    public void setNameManthan56458(String nameManthan56458) {
        this.nameManthan56458 = nameManthan56458;
    }

    public int getAgeManthan56458() {
        return ageManthan56458;
    }

    public void setAgeManthan56458(int ageManthan56458) {
        this.ageManthan56458 = ageManthan56458;
    }

    public int getWeightManthan56458() {
        return weightManthan56458;
    }

    public void setWeightManthan56458(int weightManthan56458) {
        this.weightManthan56458 = weightManthan56458;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nameManthan56458='" + nameManthan56458 + '\'' +
                '}';
    }
}
