package Car;

import java.util.Scanner;

public class AmericanTruck extends Truck
{

    public AmericanTruck() {
        super.id ="8";
        super.name = "美式皮卡";
        super.cost = 60;
        setGoodsNum(2);
        setPeopleNum(3);
    }


    void show() {
        System.out.println("序号为"+id+"的"+name+
                "，每天的租车费用为"+cost+",最大载人数为"+getPeopleNum()+
                "人,最大载货量为"+getGoodsNum());
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
        setTotalPeople(temp1*getPeopleNum());
        setTotalGoods(temp1*getGoodsNum());
    }
    void rentInformation() {
        System.out.println("您租用了"+name+getCarNum()+"辆，共租用"+getDayNum()+"天");
    }
}
