package com.example.demo.programming;

public class StackClass {
    int top=-1;
    int stk[];
    int size;

    StackClass(int size){
        this.size = size;
        stk = new int[size];
    }

    boolean isEmpty(){
        return top == -1;
    }

    boolean isFull(){
        return top == size-1;
    }
    void push(int data){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }
        top=top+1;
        stk[top]=data;
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }
        return stk[top--];
    }
    int peak(){
        return stk[top];
    }
    int size(){
        return top+1;
    }

    public static void main(String[] args){
        StackClass stk = new StackClass(5);
        stk.push(10);
        stk.pop();
        System.out.println(stk.isEmpty());
    }
}
