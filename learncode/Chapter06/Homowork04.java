package learncode.Chapter06;

public class Homowork04 {
    public static void main(String[] args){
        /*
        已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序比如：
        [10,12,45,90],插入23后 该数组为[10,12,23,45,90]
        思路：先定位再扩容
         */
        int[] arr = {10,12,45,90};
        int num = 100;
        int count = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > num){count = i;
            }
        }if(count == -1) {
            count = arr.length;
        }
        //扩容
        int[] newarr = new int[arr.length+1];
        for (int i = 0,j = 0;i<newarr.length;i++){
            if(i != count){
                newarr[i] = arr[j];
                j++;
            }else {newarr[i] = num;
            }
        }arr = newarr;
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
