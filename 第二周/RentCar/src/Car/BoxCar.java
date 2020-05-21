package Car;

import java.util.Scanner;

public  class BoxCar extends GoodsCar
{

    public BoxCar() {
        super.id ="6";
        super.name = "厢式车";
        super.cost = 80;
        setGoodsNum(4.5);

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
