package Car;

/**
 * 该类为载货车类，继承于Car，增添载货能力和总共载货量两个属性
 */
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
