package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.b.f;
import com.bykv.vk.openvk.preload.falconx.a.a;
import java.math.BigInteger;

public final class n extends i {
    private final Object a;

    public n(Boolean boolean0) {
        this.a = a.a(boolean0);
    }

    public n(Number number0) {
        this.a = a.a(number0);
    }

    public n(String s) {
        this.a = a.a(s);
    }

    // 去混淆评级： 中等(60)
    private static boolean a(n n0) {
        return n0.a instanceof Number && (((Number)n0.a) instanceof BigInteger || ((Number)n0.a) instanceof Long || ((Number)n0.a) instanceof Integer || ((Number)n0.a) instanceof Short || ((Number)n0.a) instanceof Byte);
    }

    @Override  // com.bykv.vk.openvk.preload.a.i
    public final Number a() {
        Object object0 = this.a;
        return object0 instanceof String ? new f(((String)object0)) : ((Number)object0);
    }

    @Override  // com.bykv.vk.openvk.preload.a.i
    public final String b() {
        Object object0 = this.a;
        if(object0 instanceof Number) {
            return this.a().toString();
        }
        return object0 instanceof Boolean ? ((Boolean)object0).toString() : ((String)object0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.bykv.vk.openvk.preload.a.i
    public final boolean c() {
        return this.a instanceof Boolean ? ((Boolean)this.a).booleanValue() : Boolean.parseBoolean(this.b());
    }

    public final boolean d() {
        return this.a instanceof Boolean;
    }

    public final boolean e() {
        return this.a instanceof Number;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(n.class == class0) {
                if(this.a == null) {
                    return ((n)object0).a == null;
                }
                if(n.a(this) && n.a(((n)object0))) {
                    return this.a().longValue() == ((n)object0).a().longValue();
                }
                Object object1 = this.a;
                if(object1 instanceof Number && ((n)object0).a instanceof Number) {
                    double f = this.a().doubleValue();
                    double f1 = ((n)object0).a().doubleValue();
                    return f == f1 || Double.isNaN(f) && Double.isNaN(f1);
                }
                return object1.equals(((n)object0).a);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        long v;
        if(this.a == null) {
            return 0x1F;
        }
        if(n.a(this)) {
            v = this.a().longValue();
            return (int)(v >>> 0x20 ^ v);
        }
        Object object0 = this.a;
        if(object0 instanceof Number) {
            v = Double.doubleToLongBits(this.a().doubleValue());
            return (int)(v >>> 0x20 ^ v);
        }
        return object0.hashCode();
    }
}

