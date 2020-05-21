package Car;

abstract public class Truck extends Car
{
    private int peopleNum;
    private double goodsNum;
    private int totalPeople;
    private double totalGoods;


    public int getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    public double getTotalGoods() {
        return totalGoods;
    }

    public void setTotalGoods(double totalGoods) {
        this.totalGoods = totalGoods;
    }

    public int getTotalPeople() {
        return totalPeople;
    }

    public void setTotalPeople(int totalPeople) {
        this.totalPeople = totalPeople;
    }

    public double getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(double goodsNum) {
        this.goodsNum = goodsNum;
    }
}
