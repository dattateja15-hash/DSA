package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Array {
    // Arrays: Arrays are simple data structures that store data in contingous memory location.
    // Lookup: O(1)
    // In java arrays are static. Fixed size memory.
    // Insert: O(n)
    // Delete: O(n)
    // ArrayList: grows 50% of its size
    // Vector: 100% of its size

    private int count = 0;
    private int[] numbers;
    public Array(int size){
        numbers = new int[size];
    }

    public void insert(int item){
        if(count==numbers.length){
            int[] newNumbers = new int[count*2];
            for(int i = 0;i<count;i++){
                newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;
        }
        numbers[count] = item;
        count+=1;
    }

    public void removeAt(int index){
        if(index < 0 || index>=count){
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        numbers[index] = 0;
        for(int i = index;i<count-1;i++){
            numbers[i] = numbers[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        for(int i = 0;i<count;i++){
            if(numbers[i] == item){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for(int i = 0;i<count;i++){
            System.out.println(numbers[i]);
        }
    }

}
