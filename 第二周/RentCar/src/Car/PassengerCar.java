package Car;

/**
 * 定义载客车类，继承与Car类，，添加车辆载人能力和载人总数两个属性
 */

abstract public class PassengerCar extends Car
{
    private int peopleNum;
    private int totalPeople;
    public PassengerCar() {
        super();
    }

    public int getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    public void setTotalPeople(int totalPeople) {
        this.totalPeople = totalPeople;
    }

    public int getTotalPeople(){
        return totalPeople;
    }
}
