package com.garden.director;


import com.garden.build.builders.CarBuilder;
import com.garden.build.builders.CarManualBuilder;
import com.garden.common.cars.Car;
import com.garden.common.cars.Manual;

/**
 * 生成器模式客户端
 */
public class Demo {


    public static void main(String[] args) {
        Director director = new Director();

        /**
         * 主管器从客户端获取构建器信息，因为可以自己更加清楚使用那个构建器去构建什么产品。
         */
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        /**
         * 最后的结果从构建器中获取，因为主管不知道具体的构建器依赖那些产品，主管只知道标准的
         * 构建流程。
         */
        Car car = carBuilder.getResult();
        System.out.println("Car build:\n" + car.getCarType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        Manual carManual = carManualBuilder.getResult();
        System.out.println("\n Car Manual built:\n" + carManual);

    }
}
