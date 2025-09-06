package com.unity3d.services.core.di;

import java.util.Map;
import kotlin.D;
import kotlin.reflect.d;
import y4.l;
import y4.m;

public interface IServicesRegistry {
    public static final class DefaultImpls {
        public static Object getService$default(IServicesRegistry iServicesRegistry0, String s, d d0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
            }
            if((v & 1) != 0) {
                s = "";
            }
            return iServicesRegistry0.getService(s, d0);
        }
    }

    Object getService(@l String arg1, @l d arg2);

    @l
    Map getServices();

    Object resolveService(@l ServiceKey arg1);

    @m
    Object resolveServiceOrNull(@l ServiceKey arg1);

    void updateService(@l ServiceKey arg1, @l D arg2);
}

