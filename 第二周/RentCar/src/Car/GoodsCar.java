package Car;

abstract class GoodsCar extends Car
{
    private double goodsNum;
    private double totalGoods;


    public GoodsCar() {

    }

    public double getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(double goodsNum) {
        this.goodsNum = goodsNum;
    }

    public void setTotalGoods(double totalGoods) {
        this.totalGoods = totalGoods;
    }

    public double getTotalGoods() {
        return totalGoods;
    }
}
