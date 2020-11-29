package cn.mldn.test;

import cn.mldn.factory.ServiceFactory;
import cn.mldn.vo.Emp;

import java.util.Date;

public class TestEmpInsert {
    public static void main(String[] args){
        Emp vo = new Emp();
        vo.setEmpno(8889);
        vo.setEname("李禹锡");
        vo.setJob("摄影师");
        vo.setHiredate(new Date());
        vo.setSal(10.0);
        vo.setComm(0.5);
        try {
            System.out.println(ServiceFactory.getIEmpServiceInstance().insert(vo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
