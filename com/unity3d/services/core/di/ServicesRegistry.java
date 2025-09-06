package com.unity3d.services.core.di;

import A3.a;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.d;
import y4.l;
import y4.m;

@s0({"SMAP\nServicesRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServicesRegistry.kt\ncom/unity3d/services/core/di/ServicesRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public final class ServicesRegistry implements IServicesRegistry {
    @l
    private final ConcurrentHashMap _services;

    public ServicesRegistry() {
        this._services = new ConcurrentHashMap();
    }

    public final ServiceKey factory(String s, a a0) {
        L.p(s, "named");
        L.p(a0, "instance");
        L.y(4, "T");
        ServiceKey serviceKey0 = new ServiceKey(s, m0.d(Object.class));
        this.updateService(serviceKey0, ServiceFactoryKt.factoryOf(a0));
        return serviceKey0;
    }

    public static ServiceKey factory$default(ServicesRegistry servicesRegistry0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        L.p(s, "named");
        L.p(a0, "instance");
        L.y(4, "T");
        ServiceKey serviceKey0 = new ServiceKey(s, m0.d(Object.class));
        servicesRegistry0.updateService(serviceKey0, ServiceFactoryKt.factoryOf(a0));
        return serviceKey0;
    }

    public final Object get(String s) {
        L.p(s, "named");
        L.y(4, "T");
        return this.resolveService(new ServiceKey(s, m0.d(Object.class)));
    }

    public static Object get$default(ServicesRegistry servicesRegistry0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        L.p(s, "named");
        L.y(4, "T");
        return servicesRegistry0.resolveService(new ServiceKey(s, m0.d(Object.class)));
    }

    public final Object getOrNull(String s) {
        L.p(s, "named");
        L.y(4, "T");
        return this.resolveServiceOrNull(new ServiceKey(s, m0.d(Object.class)));
    }

    public static Object getOrNull$default(ServicesRegistry servicesRegistry0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        L.p(s, "named");
        L.y(4, "T");
        return servicesRegistry0.resolveServiceOrNull(new ServiceKey(s, m0.d(Object.class)));
    }

    @Override  // com.unity3d.services.core.di.IServicesRegistry
    public Object getService(@l String s, @l d d0) {
        L.p(s, "named");
        L.p(d0, "instance");
        return this.resolveService(new ServiceKey(s, d0));
    }

    @Override  // com.unity3d.services.core.di.IServicesRegistry
    @l
    public Map getServices() {
        return this._services;
    }

    @Override  // com.unity3d.services.core.di.IServicesRegistry
    public Object resolveService(@l ServiceKey serviceKey0) {
        L.p(serviceKey0, "key");
        D d0 = (D)this.getServices().get(serviceKey0);
        if(d0 == null) {
            throw new IllegalStateException("No service instance found for " + serviceKey0);
        }
        return d0.getValue();
    }

    @Override  // com.unity3d.services.core.di.IServicesRegistry
    @m
    public Object resolveServiceOrNull(@l ServiceKey serviceKey0) {
        L.p(serviceKey0, "key");
        D d0 = (D)this.getServices().get(serviceKey0);
        return d0 == null ? null : d0.getValue();
    }

    public final ServiceKey single(String s, a a0) {
        L.p(s, "named");
        L.p(a0, "instance");
        L.y(4, "T");
        ServiceKey serviceKey0 = new ServiceKey(s, m0.d(Object.class));
        this.updateService(serviceKey0, E.a(a0));
        return serviceKey0;
    }

    public static ServiceKey single$default(ServicesRegistry servicesRegistry0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        L.p(s, "named");
        L.p(a0, "instance");
        L.y(4, "T");
        ServiceKey serviceKey0 = new ServiceKey(s, m0.d(Object.class));
        servicesRegistry0.updateService(serviceKey0, E.a(a0));
        return serviceKey0;
    }

    @Override  // com.unity3d.services.core.di.IServicesRegistry
    public void updateService(@l ServiceKey serviceKey0, @l D d0) {
        L.p(serviceKey0, "key");
        L.p(d0, "instance");
        if(this.getServices().containsKey(serviceKey0)) {
            throw new IllegalStateException(("Cannot have multiple identical services: " + serviceKey0).toString());
        }
        this._services.put(serviceKey0, d0);
    }
}

