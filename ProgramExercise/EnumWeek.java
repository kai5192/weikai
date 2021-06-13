public class EnumWeek {
    public static void main(String[] args) {
        Week[] weeks= Week.values();
        for(Week week:weeks){
            System.out.println(week.toString());
        }
        System.out.println(Week.MONDAY.getWeek(0).toString());
    }
}
enum Week{
    MONDAY(0), TUESDAY(1), WEDNESDAY(2),
    THURSDAY(3), FRIDAY(4), SATURDAY(5),
    SUNDAY(6),ZERO;
    //周一到周日为0到6
    private int count;
    Week() {
    }
    Week(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "count=" + count ;
    }
    public Week getWeek(int n){
        Week temp =ZERO;
        switch (n){
            case 0:
                temp = Week.MONDAY;
                break;
            case 1:
                temp = TUESDAY;
                break;
            case 2:
                temp = WEDNESDAY;
                break;
            case 3:
                temp = THURSDAY;
                break;
            case 4:
                temp = FRIDAY;
                break;
            case 5:
                temp = SATURDAY;
                break;
            default:
                temp = ZERO;
                break;
        }
        return temp;
    }
}