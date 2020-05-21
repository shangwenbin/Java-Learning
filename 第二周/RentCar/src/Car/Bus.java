package Car;

import java.util.Scanner;

public class Bus extends PassengerCar
{

    public Bus() {
        super.id ="3";
        super.name = "大巴车";
        super.cost = 180;
        setPeopleNum(20);

    }


    void show() {
        System.out.println("序号为"+id+"的"+name+"，每天的租车费用为"+cost+",最大载客量为"+getPeopleNum());
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
    }
    void rentInformation() {
        System.out.println("您租用了"+name+getCarNum()+"辆，共租用"+getDayNum()+"天");
    }
}
