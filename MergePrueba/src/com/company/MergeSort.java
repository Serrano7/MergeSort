package com.company;
public class MergeSort {
    int[] array;
    int[] TempArray;

    void PrepareForSort(int[] arr) {
        //Preparar para sort
        this.array = arr;
        this.TempArray = new int[arr.length];
        doMergeSort(0, arr.length - 1);
    }
    //Dividir a un problema más pequeño

    void doMergeSort(int LowerIndex, int HighIndex) {
        if (LowerIndex < HighIndex) {
            int middle = LowerIndex + (HighIndex - LowerIndex) / 2;
            doMergeSort(LowerIndex, middle);//exam(1-5)
            doMergeSort(middle + 1, HighIndex);//exam(6,10)
            MergePart(LowerIndex,middle,HighIndex);
        }
    }
    //Unir problemas y ordenar

    void MergePart(int LowerIndex, int middle, int HigherIndex){
for(int i=LowerIndex;i<=HigherIndex;i++)
    TempArray[i]=array[i];

int i=LowerIndex;
int j=middle+1;
int k=LowerIndex;
while (i<=middle && j<= HigherIndex){
    if(TempArray[i]<= TempArray[j]){
        array[k] = TempArray[i];
        i++;
    }else{
        array[k] = TempArray[j];
        j++;
    }
    k++;
}
while (i<=middle){
    array[k] = TempArray[i];
    k++;
    i++;
}
}
}