package Car;

/**
 * 完成一个抽象类car作为父类
 */
abstract class Car {
    String id;
    String name;
    int cost;
    private int carNum;
    private int dayNum;
    private int totalMoney;

    public Car() {
    }

    abstract void show();

    abstract void askUser();

    abstract void cal();

    abstract void rentInformation();

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public void setDayNum(int dayNum) {
        this.dayNum = dayNum;
    }

    public int getDayNum() {
        return dayNum;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getTotalMoney() {
        return totalMoney;
    }
}
