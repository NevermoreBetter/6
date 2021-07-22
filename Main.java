package com.company;

public class Main {

    public static void main(String[] args) {
        int N=100;
        Sort s1=new Sort(N);
        Sort s11;
        s1.zapolnit();
        s11=s1;
        s1.view();;
        s11.InsertionSort();
        s11.view();

        int N1=N*N;
        Sort s2 = new Sort(N1);
        Sort s21;
        s2.zapolnit();
        s21=s2;
        s21.InsertionSort();
        s21.view();

        int N3=N*N*N;
        Sort s3 = new Sort(N3);
        Sort s31;
        s3.zapolnit();
        s31=s3;
        s31.InsertionSort();
        s31.view();
    }
}
