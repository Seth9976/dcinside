package com.google.gson;

import com.google.gson.internal.g;
import j..util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class p extends j {
    private final Object a;

    public p(Boolean boolean0) {
        Objects.requireNonNull(boolean0);
        this.a = boolean0;
    }

    public p(Character character0) {
        Objects.requireNonNull(character0);
        this.a = character0.toString();
    }

    public p(Number number0) {
        Objects.requireNonNull(number0);
        this.a = number0;
    }

    public p(String s) {
        Objects.requireNonNull(s);
        this.a = s;
    }

    public boolean A() {
        return this.a instanceof Boolean;
    }

    // 去混淆评级： 中等(60)
    private static boolean B(p p0) {
        return p0.a instanceof Number && (((Number)p0.a) instanceof BigInteger || ((Number)p0.a) instanceof Long || ((Number)p0.a) instanceof Integer || ((Number)p0.a) instanceof Short || ((Number)p0.a) instanceof Byte);
    }

    public boolean C() {
        return this.a instanceof Number;
    }

    public boolean D() {
        return this.a instanceof String;
    }

    @Override  // com.google.gson.j
    public j a() {
        return this;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.j
    public BigDecimal b() {
        return this.a instanceof BigDecimal ? ((BigDecimal)this.a) : new BigDecimal(this.t());
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.j
    public BigInteger c() {
        return this.a instanceof BigInteger ? ((BigInteger)this.a) : new BigInteger(this.t());
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.j
    public boolean d() {
        return this.A() ? ((Boolean)this.a).booleanValue() : Boolean.parseBoolean(this.t());
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(p.class == class0) {
                if(this.a == null) {
                    return ((p)object0).a == null;
                }
                if(p.B(this) && p.B(((p)object0))) {
                    return this.q().longValue() == ((p)object0).q().longValue();
                }
                Object object1 = this.a;
                if(object1 instanceof Number && ((p)object0).a instanceof Number) {
                    double f = this.q().doubleValue();
                    double f1 = ((p)object0).q().doubleValue();
                    return f == f1 || Double.isNaN(f) && Double.isNaN(f1);
                }
                return object1.equals(((p)object0).a);
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.j
    public byte g() {
        return this.C() ? this.q().byteValue() : Byte.parseByte(this.t());
    }

    @Override  // com.google.gson.j
    @Deprecated
    public char h() {
        String s = this.t();
        if(s.isEmpty()) {
            throw new UnsupportedOperationException("String value is empty");
        }
        return s.charAt(0);
    }

    @Override
    public int hashCode() {
        long v;
        if(this.a == null) {
            return 0x1F;
        }
        if(p.B(this)) {
            v = this.q().longValue();
            return (int)(v >>> 0x20 ^ v);
        }
        Object object0 = this.a;
        if(object0 instanceof Number) {
            v = Double.doubleToLongBits(this.q().doubleValue());
            return (int)(v >>> 0x20 ^ v);
        }
        return object0.hashCode();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.j
    public double i() {
        return this.C() ? this.q().doubleValue() : Double.parseDouble(this.t());
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.j
    public float j() {
        return this.C() ? this.q().floatValue() : Float.parseFloat(this.t());
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.j
    public int k() {
        return this.C() ? this.q().intValue() : Integer.parseInt(this.t());
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.j
    public long p() {
        return this.C() ? this.q().longValue() : Long.parseLong(this.t());
    }

    @Override  // com.google.gson.j
    public Number q() {
        Object object0 = this.a;
        if(object0 instanceof Number) {
            return (Number)object0;
        }
        if(!(object0 instanceof String)) {
            throw new UnsupportedOperationException("Primitive is neither a number nor a string");
        }
        return new g(((String)object0));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.j
    public short r() {
        return this.C() ? this.q().shortValue() : Short.parseShort(this.t());
    }

    @Override  // com.google.gson.j
    public String t() {
        Object object0 = this.a;
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(this.C()) {
            return this.q().toString();
        }
        if(!this.A()) {
            throw new AssertionError("Unexpected value type: " + this.a.getClass());
        }
        return ((Boolean)this.a).toString();
    }

    public p z() [...] // Inlined contents
}

