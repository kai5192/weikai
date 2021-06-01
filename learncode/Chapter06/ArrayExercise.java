package learncode.Chapter06;

public class ArrayExercise {
    public  static void main(String[] args){
        //创建一个char类型的26个元素的数组，分别放置A-Z。
        //使用for循环访问所有元素并打印出来
        char[] alphabet = new char[26];
        for(char i = 0;i < alphabet.length;i++){
            alphabet[i] =(char)('A'+ i);
        }for(int k = 0;k<alphabet.length;k++){
            System.out.print(alphabet[k]);
        }


        //求出一个数组int[]的最大值{4，-1，9，10，23}，并对应得到它的下标
        int[] maxarray = {4,-1,9,10,25,23};
        int h = 0;
        int c1 ;
        int c2 = maxarray[0];
        for (int i = 0;i<maxarray.length;i++){
            c1 = maxarray[i];
            if (c1>c2){
                c2 = c1;
                h = i;
            }
        }System.out.println("\n"+"数组的最大值为：" + c2 + "它在第" + h + "位");
        //把数组{1,2,3,4,5}反转
        int[] reverse = {1,2,3,4,5,6};
        for(int i = 0;i < reverse.length;i++){
            if(i >( reverse.length /2)-1){
                break;
            }int middle = reverse[i];
            reverse[i] = reverse[reverse.length - i - 1];
            reverse[reverse.length - i - 1] = middle;
        }for (int g = 0;g < reverse.length;g++){
            System.out.print(reverse[g]);
        }
    }
}
