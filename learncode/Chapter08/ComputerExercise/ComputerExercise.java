package learncode.Chapter08.ComputerExercise;

public class ComputerExercise {
    //编写Computer类，包含cpu\内存、硬盘等属性，getdetail方法用于返回Computer的详细信息
    private String cpu;
    private int memory;
    private int disk;



    public ComputerExercise(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }
    public String getdetails(){
        return "cpu" + cpu + "memory" +memory +"disk"+disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

}
