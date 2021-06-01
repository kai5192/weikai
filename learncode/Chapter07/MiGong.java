package learncode.Chapter07;

public class MiGong {
    public static void main(String[]args){
        //老鼠出迷宫
        /*
        思路：先创建迷宫，二维数组1表示障碍物，0表示可以走
         */
        GG gg = new GG();
        int[][] map = new int[8][7];
        //将最上面一行和最下面一行，全设置为1
        for (int i = 0;i<map[0].length;i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }//再给两边都设置为1
        for (int i = 1;i <map.length;i++){
            map[i][0] = 1;
            map[i][map[0].length - 1] = 1;
        }//单独设置障碍物
        map[3][1] = 1;
        map[3][2] = 1;
        //使用findway找位置
        gg.findway(map,1,1);
        System.out.println("=======找路的情况");
        //输出一下
        gg.print11(map);
    }
}

class GG{
    public void print11(int[][] n){
        for(int i = 0;i<n.length;i++){
            for (int j = 0;j<n[0].length;j++){
                System.out.print(n[i][j] + "\t");
            }System.out.print("\n");
        }
    }
    //老韩解读
    //1. findWay 方法就是专门来找出迷宫的路径
    //2. 如果找到，就返回 true ,否则返回 false
    //3. map 就是二维数组，即表示迷宫
    //4. i,j 就是老鼠的位置，初始化的位置为(1,1)
    //5. 因为我们是递归的找路，所以我先规定 map 数组的各个值的含义
    // 0 表示可以走 1 表示障碍物 2 表示可以走 3 表示走过，但是走不通是死路
    //6. 当 map[6][5] =2 就说明找到通路,就可以结束，否则就继续找. //7. 先确定老鼠找路策略 下->右->上->左
    public boolean findway(int[][] map,int i ,int j){
        if(map[6][5] == 2){//说明找到位置
            return true;
        }else {
            if(map[i][j] == 0){//当前位置可以走
                //假定可以走
                map[i][j] = 2;
                if(findway(map,i+1,j)){
                    return true;
                }else if (findway(map,i,j+1)){
                    return true;
                }else if (findway(map,i - 1,j)){
                    return true;
                }else if (findway(map,i ,j - 1)){
                    return true;
                }else{
                    map[i][j] = 3;
                    return false;
                }
                //使用策略，来确定该位置是否真的可以走通
            }else {//map[i][j] = 1,2,3
                return  false;
            }
        }
    }
}