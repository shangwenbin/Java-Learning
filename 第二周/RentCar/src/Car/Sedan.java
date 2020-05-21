package Car;

import java.util.Scanner;


/**
 * 小轿车类
 */
class Sedan extends PassengerCar
{

    public Sedan() {
        super();
        super.id ="1";
        super.name = "小轿车";
        super.cost = 45;
        setPeopleNum(4);
    }


    void show(){
        System.out.println("序号为"+id+"的"+name+"，每天的租车费用为"+cost+",最大载客量为"+getPeopleNum());
    }

    void askUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入序号"+id+"的租用数量和租用天数:");

        setCarNum(scanner.nextInt());
        setDayNum(scanner.nextInt());
    }

    @Override
    void cal() {
        int temp1 = getCarNum();
        int temp2 = getDayNum();
        setTotalMoney(temp1*cost*temp2);
        setTotalPeople(temp1*getPeopleNum());
    }

    @Override
    void rentInformation() {
        System.out.println("您租用了"+name+getCarNum()+"辆，共租用"+getDayNum()+"天");
    }
}


