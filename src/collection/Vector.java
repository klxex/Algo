package collection;

import java.lang.reflect.Array;

public class Vector {
    public int size;
    public int capacity;
    public Integer arr[];

    public Vector(){
        this.size = 0;
        this.capacity = 10;
        arr = new Integer[capacity];
    }

    public int capacity(){
        return this.capacity;
    }

    public void addLast(Integer t){
        if(size==capacity){
            Integer[] temp = new Integer[2 * capacity];

            for(int i=0;i<capacity;i++){
                temp[i] = arr[i];
            }

            temp[capacity]  = t;
            size ++;
            this.arr = temp;
        }
        else{
            arr[size] = t;
            size++;
        }
    }

    public void remove(Integer t){
        int index = size;
        for(int i=0;i<size;i++){
            if(arr[i].equals(t)){
                index = i;
            }
        }

        for(int i=index+1;i<size;i++){
            arr[i-1] = arr[i];
        }
    }

    public Integer get(int index){
        return arr[index];
    }

    public static void main(String args[]){

    }



}
