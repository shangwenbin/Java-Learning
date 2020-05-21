package Car;
/**
 * 面包车类
 */

import java.util.Scanner;

public class Van extends PassengerCar
{


    public Van() {
        super.id ="2";
        super.name = "面包车";
        super.cost = 65;
        setPeopleNum(7);

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
