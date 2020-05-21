package Car;

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
