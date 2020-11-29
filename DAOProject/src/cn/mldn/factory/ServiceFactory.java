package cn.mldn.factory;

import cn.mldn.service.impl.EmpServiceImpl;

public class ServiceFactory {
    public static EmpServiceImpl getIEmpServiceInstance(){
        return new EmpServiceImpl();
    }
}
