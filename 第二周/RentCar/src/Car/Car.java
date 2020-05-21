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

    /**
     * 该函数展示这辆车的信息
     */
    abstract void show();

    /**
     * 该函数向用户询问，并获取输入
     */
    abstract void askUser();

    /**
     * 该函数根据用户输入计算花销以及载人数和载货量
     */
    abstract void cal();

    /**
     * 该函数用于展示租用车辆的详细信息
     */
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
