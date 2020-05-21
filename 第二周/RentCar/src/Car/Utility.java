package Car;
/**
 * 辅助类
 */

import java.util.ArrayList;

public class Utility {
    /**
     * 此函数初始化了三个存放不同类型对象的ArrayList，调用该类中的其他函数，并把三个ArrayList作为参数传入
     */
    public void run(){
        ArrayList<PassengerCar> pCarList = initPassengerCar();
        ArrayList<GoodsCar> gCarList = initGoodsCar();
        ArrayList<Truck> tList = initTruck();
        init(pCarList,gCarList,tList);
        getUserInput(pCarList,gCarList,tList);
        returnResult(pCarList,gCarList,tList);
        returnDetail(pCarList,gCarList,tList);

    }

    /**
     * 该函数显示信息，展示该租车系统中的车辆信息
     * @param pCarList PassengerCar类型的动态数组
     * @param gCarList GoodsCar类型的动态数组
     * @param tList Truck类型的动态数组
     */
    public void init(ArrayList<PassengerCar> pCarList,ArrayList<GoodsCar> gCarList,ArrayList<Truck> tList){
        System.out.println("欢迎进入租车系统！");
        System.out.println("---------------------------------------------");
        System.out.println("下面为您展示系统中所有类型车辆的详细信息：");

        for(PassengerCar car:pCarList){
            car.show();
        }
        for (GoodsCar car:gCarList){
            car.show();
        }
        for (Truck car:tList){
            car.show();
        }
    }

    /**
     * 辅助run函数初始化数组，创建PassengerCar对象并且加入数组中
     * @return 返回已经添加好PassengerCar对象的数组
     */
    public ArrayList<PassengerCar> initPassengerCar(){
        ArrayList<PassengerCar> passengerCarList = new ArrayList();
        PassengerCar car1 = new Sedan();
        passengerCarList.add(car1);
        PassengerCar car2 = new Van();
        passengerCarList.add(car2);
        PassengerCar car3 = new Bus();
        passengerCarList.add(car3);
        return passengerCarList;
    }
    /**
     * 辅助run函数初始化数组，创建GoodsCar对象并且加入数组中
     * @return 返回已经添加好GoodsCar对象的数组
     */

    public ArrayList<GoodsCar> initGoodsCar(){
        ArrayList<GoodsCar> goodsCarList = new ArrayList();
        GoodsCar car4 = new LowHurdleCar();
        goodsCarList.add(car4);
        GoodsCar car5 = new HighHurdleCar();
        goodsCarList.add(car5);
        GoodsCar car6 = new BoxCar();
        goodsCarList.add(car6);
        return goodsCarList;
    }

    /**
     * 辅助run函数初始化数组，创建Truck对象并且加入数组中
     * @return 返回已经添加好Truck对象的数组
     */

    public ArrayList<Truck> initTruck(){
        ArrayList<Truck> truckList = new ArrayList();
        Truck car7 = new JapaneseTruck();
        truckList.add(car7);
        Truck car8 =new AmericanTruck();
        truckList.add(car8);
        return truckList;
    }

    /**
     * 该函数实现获取用户输入的功能
     * @param pCarList PassengerCar类型的动态数组
     * @param gCarList GoodsCar类型的动态数组
     * @param tList Truck类型的动态数组
     */
    public void getUserInput(ArrayList<PassengerCar> pCarList,ArrayList<GoodsCar> gCarList,ArrayList<Truck> tList){
        System.out.println("---------------------------------------------");
        System.out.println("请按照提示输入相对应类型的车的租车数量：");
        for (PassengerCar car:pCarList) {
            car.askUser();
            car.cal();
        }
        for (GoodsCar car:gCarList) {
            car.askUser();
            car.cal();
        }
        for (Truck car:tList) {
            car.askUser();
            car.cal();
        }

    }

    /**
     *该函数实现返回租车的总体信息
     * @param pCarList PassengerCar类型的动态数组
     * @param gCarList GoodsCar类型的动态数组
     * @param tList Truck类型的动态数组
     */
    public void returnResult(ArrayList<PassengerCar> pCarList,ArrayList<GoodsCar> gCarList,ArrayList<Truck> tList){
        System.out.println("---------------------------------------------");
        System.out.println("下面显示您的租车总体情况：");
        int sumMoney = 0;
        double sumGoods = 0;
        int sumPeople = 0;
        for(PassengerCar car:pCarList){
            sumMoney += car.getTotalMoney();
            sumPeople +=car.getTotalPeople();
        }
        for (GoodsCar car:gCarList){
            sumMoney += car.getTotalMoney();
            sumGoods += car.getGoodsNum();
        }
        for (Truck car:tList){
            sumMoney += car.getTotalMoney();
            sumPeople +=car.getTotalPeople();
            sumGoods += car.getGoodsNum();
        }

        System.out.println("总花销为："+sumMoney+",每天的最大载客量为"+sumPeople+",每天的最大载货量为"+sumGoods);

        /**
         *该函数实现返回租车的详细信息
         * @param pCarList PassengerCar类型的动态数组
         * @param gCarList GoodsCar类型的动态数组
         * @param tList Truck类型的动态数组
         */

    }
    public void returnDetail(ArrayList<PassengerCar> pCarList,ArrayList<GoodsCar> gCarList,ArrayList<Truck> tList){
        System.out.println("---------------------------------------------");
        System.out.println("下面显示您的租车详细信息：");
        for(PassengerCar car:pCarList){
            if(car.getDayNum() != 0){
                car.rentInformation();
            }
        }
        for (GoodsCar car:gCarList){
            if(car.getDayNum() != 0){
                car.rentInformation();
            }
        }
        for (Truck car:tList){
            if(car.getDayNum() != 0){
                car.rentInformation();
            }
        }
    }
}
