package Car;
/**
 * 低栏车类
 */

import java.util.Scanner;

public class LowHurdleCar extends GoodsCar
{

    public LowHurdleCar() {
        super();
        super.id ="4";
        super.name = "低栏车";
        super.cost = 30;
        setGoodsNum(1.5);

    }


 void show() {
        System.out.println("序号为"+id+"的"+name+"，每天的租车费用为"+cost+",最大载货量为"+getGoodsNum()+"吨");
    }

    void askUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入序号"+id+"的租用数量和租用天数:");

        setCarNum(scanner.nextInt());
        setDayNum(scanner.nextInt());
    }

    void cal() {
        int temp1 = getCarNum();
        int temp2 = getDayNum();
        setTotalMoney(temp1*cost*temp2);
        setTotalGoods(temp1*getGoodsNum());
    }
    void rentInformation() {
        System.out.println("您租用了"+name+getCarNum()+"辆，共租用"+getDayNum()+"天");
    }
}
