package methods;

public class DeleteElement {
public static int[] deleteR(int[] arr,int element){
//deleteR, gets an int array, and an int. the method returns an int array.
//
//It removes element int from the array.
//
//example use (pseudo code):
//
//deleteR([1,2,3],2)
//returns [1,3]
//
//deleteR([19,99,9,9999],9)
//returns [19,99,9999]
//
//deleteR([1,5,3,4],5)
//returns [1,3,4]
//
//hint:
//
//create a new arry for  return with -1 the length of arr
//
//And add all elements from arr except for  the element that matches element value
//return that new array

int [] arrNew=new int [arr.length-1];
for( int i=0, j=0; i<arrNew.length;i++,j++){
    if(arr[i]==element){
        i++;
        arrNew[j]=arr[i];
    }else{
        arrNew[j]=arr[i];
    }
}return arrNew;









    }
}
