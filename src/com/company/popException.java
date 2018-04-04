package com.company;

public class popException extends Exception{
    Stack stk ;
    public popException(Stack S){
        this.stk = S ;
    }
    public void popMessage(){
        System.out.println("You have " + stk.top() + " Elements now!");
    }
    public void topMessage(){
        System.out.println("Stack is empty!");
    }
}