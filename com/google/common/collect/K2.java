package com.google.common.collect;

import J1.b;
import com.google.common.base.B;
import java.util.Map.Entry;
import o3.a;

@b
@C1
public abstract class k2 extends p2 implements Map.Entry {
    @Override  // com.google.common.collect.p2
    protected Object K() {
        return this.M();
    }

    protected abstract Map.Entry M();

    // 去混淆评级： 低(30)
    protected boolean N(@a Object object0) {
        return object0 instanceof Map.Entry && B.a(this.getKey(), ((Map.Entry)object0).getKey()) && B.a(this.getValue(), ((Map.Entry)object0).getValue());
    }

    protected int O() {
        Object object0 = this.getKey();
        Object object1 = this.getValue();
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        if(object1 != null) {
            v = object1.hashCode();
        }
        return v1 ^ v;
    }

    protected String P() {
        return this.getKey() + "=" + this.getValue();
    }

    @Override
    public boolean equals(@a Object object0) {
        return this.M().equals(object0);
    }

    @Override
    @d4
    public Object getKey() {
        return this.M().getKey();
    }

    @Override
    @d4
    public Object getValue() {
        return this.M().getValue();
    }

    @Override
    public int hashCode() {
        return this.M().hashCode();
    }

    @Override
    @d4
    public Object setValue(@d4 Object object0) {
        return this.M().setValue(object0);
    }
}

