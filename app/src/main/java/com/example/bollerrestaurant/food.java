package com.example.bollerrestaurant;

public class food {

    private double total;
    private double margTotal;
    private double chipTotal;


    public food(){
        total = 0.0;
        margTotal = 0.0;
        chipTotal = 0.0;
    }

    public double calcMarg(int index){
        margTotal = 0.0;
        if (index == 0){
            margTotal = 9.99;
        }
        else if(index == 1){
            margTotal = 12.99;
        }
        else { margTotal = 15.99;}
        return margTotal + chipTotal;
    }

    public double calcChip(int index){
        chipTotal = 0.0;
        if (index == 0){
            chipTotal = 8.00;
        }
        else if(index == 1){
            chipTotal = 11.95;
        }
        else { chipTotal = 10.00;}
        return chipTotal + margTotal;
    }

}
