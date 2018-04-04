package com.company;

public class Main {

    public static void main(String[] args)throws popException{
        // write your code here
        Stack S = new Stack();
        System.out.println("isEmpty(newStack) = " + S.isEmpty());
        S = new Stack();
        S.push();
        System.out.println("isEmpty(newStack(push)) = " + S.isEmpty());
        try {
            S = new Stack();
            S.pop();
        }
        catch (popException ex){
            ex.popMessage();
        }
        S.push();
        S.pop();
        System.out.println("Making Pop(Push(elm,Stack)) you have isEmpty = " + S.isEmpty());
        try {
        S = new Stack();
        S.replace(5);
        }
        catch (popException ex){
        ex.popMessage();
        }

        }

}
