package com.alessio.exercises.oop.basic;

import java.util.Arrays;

public class EnhancedResizableArray {
    int[] v;
    int size;

    public EnhancedResizableArray(int length) {
        this.v = new int[length];
        this.size = 0;
    }

    public void add(int value) {
        int[] tmp = new int[v.length + 1];
        int i = 0;
        for (int e : v) {
            tmp[i] = e;
            i++;
        }
        tmp[i] = value;
        v = tmp;
        size++;
    }

    public void remove(int index) {
        int[] tmp = new int[v.length - 1];
        for(int j = 0, i = 0; i < size(); i++, j++){
            if (i == index) {
                j--;
            }
            else{
                tmp[j] = v[i];
            }
        }
        v = tmp;
        size--;
    }

    public int get(int index) { return v[index]; }

    public void set(int index, int value) {
        v[index] = value;
    }

    public boolean contains(int value) {
        for (int e : v){
            if (e == value){
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        return Arrays.copyOf(v, size);
    }

    public static void main(String[] args) {

        EnhancedResizableArray array = new EnhancedResizableArray(8);
        for (int i = 0; i < 8; i++){
            array.add(i);
        }
        array.set(2, 222);
        int element = array.get(5);
        array.remove(3);
        boolean what = array.contains(7);
        what = array.contains(223);
        //array.toArray();
        System.out.println("" + array.size());
    }

}
