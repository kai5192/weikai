package learncode.Chapter11;

public class Frock {
    private static int currentNum = 100000;
    private String serialNumber;

    public Frock(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getNextNum() {
        int temp = Frock.currentNum;
        Frock.currentNum = temp + 100;
        return temp;
    }

    @Override
    public String toString() {
        return "Frock{" +
                "serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
