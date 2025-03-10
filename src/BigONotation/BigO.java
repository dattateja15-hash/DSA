package BigONotation;

public class BigO {

    //Big O Notation: To describe the performance of an algorithm.
    //Given Algorithm Scalable or not.

    public static void bigOConstant(int[] numbers){
        System.out.println(numbers[0]); // O(1)
    }

    public static void bigOofn(int[] numbers, String[] names){
        for(int i = 0;i<numbers.length;i++)
            System.out.println(i); // O(n)

        //O(2n)
        for(int i = 0;i<numbers.length;i++){
            System.out.println(i);
        }

        for(int i = 0;i<numbers.length;i++){
            System.out.println(i);
        }

        //o(m+n)
        for(String str:names){
            System.out.println(str);
        }

        for(int i = 0;i<numbers.length;i++){
            System.out.println(i);
        }

    }

    public static void bigOofNsquare(int[] numbers){
        //o(n^2)
        for(int i:numbers){
            for(int j:numbers){
                System.out.println(i+j);
            }
        }
    }

    //Algorithm that runs in logarithmic time is more efficient than linear or quadratic
    //Exponential time not scalable at all. o(2^n)



}
