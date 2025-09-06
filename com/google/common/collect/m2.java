package com.google.common.collect;

import J1.b;
import J1.d;
import com.google.common.base.H;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.Map.Entry;

@b(emulated = true, serializable = true)
@C1
final class M2 extends c {
    static class a {
    }

    @d
    static class com.google.common.collect.M2.b implements Serializable {
        final EnumMap a;
        private static final long b;

        com.google.common.collect.M2.b(EnumMap enumMap0) {
            this.a = enumMap0;
        }

        Object a() {
            return new M2(this.a, null);
        }
    }

    private final transient EnumMap g;

    private M2(EnumMap enumMap0) {
        this.g = enumMap0;
        H.d(!enumMap0.isEmpty());
    }

    M2(EnumMap enumMap0, a m2$a0) {
        this(enumMap0);
    }

    @d
    private void H(ObjectInputStream objectInputStream0) throws InvalidObjectException {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override  // com.google.common.collect.Q2$c
    @d
    Object L() {
        return new com.google.common.collect.M2.b(this.g);
    }

    @Override  // com.google.common.collect.Q2$c
    u5 M() {
        return D3.L0(this.g.entrySet().iterator());
    }

    static Q2 N(EnumMap enumMap0) {
        switch(enumMap0.size()) {
            case 0: {
                return Q2.u();
            }
            case 1: {
                Map.Entry map$Entry0 = (Map.Entry)p3.z(enumMap0.entrySet());
                return Q2.w(((Enum)map$Entry0.getKey()), map$Entry0.getValue());
            }
            default: {
                return new M2(enumMap0);
            }
        }
    }

    @Override  // com.google.common.collect.Q2
    public boolean containsKey(@o3.a Object object0) {
        return this.g.containsKey(object0);
    }

    @Override  // com.google.common.collect.Q2
    public boolean equals(@o3.a Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof M2) {
            object0 = ((M2)object0).g;
        }
        return this.g.equals(object0);
    }

    @Override  // com.google.common.collect.Q2
    @o3.a
    public Object get(@o3.a Object object0) {
        return this.g.get(object0);
    }

    @Override  // com.google.common.collect.Q2
    boolean q() {
        return false;
    }

    @Override  // com.google.common.collect.Q2
    u5 r() {
        return q3.e0(this.g.keySet().iterator());
    }

    @Override
    public int size() {
        return this.g.size();
    }
}

