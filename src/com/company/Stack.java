package com.company;



public class Stack {
    private int[] buffer;
    private int current;
    public Stack(){
        this.current = -1;
        this.buffer = new int[1000];
    }
    public void push(){
        if (this.current < 0) this.current = 1;
        this.current ++;
    }
    public void pop() throws popException{
        if (this.current > 0) this.current--;
        if(this.current <= 0){
            throw new popException(this);
        }
    }
    public int top(){
        if(this.current < 0) return 0;
        return this.current;
    }
    public boolean isEmpty(){
        return this.current <= 0;
    }
    public int replace(int item) throws popException{
        if(this.current > 0) {
            this.buffer[this.current] = item;
            return item;
        }
        else throw new popException(this);

    }

}
