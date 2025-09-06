package com.bytedance.adsdk.Zh;

import java.util.Arrays;

public final class xf {
    private final Object PjT;
    private final Throwable Zh;

    public xf(Object object0) {
        this.PjT = object0;
        this.Zh = null;
    }

    public xf(Throwable throwable0) {
        this.Zh = throwable0;
        this.PjT = null;
    }

    public Object PjT() {
        return this.PjT;
    }

    public Throwable Zh() {
        return this.Zh;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof xf)) {
            return false;
        }
        if(this.PjT() != null && this.PjT().equals(((xf)object0).PjT())) {
            return true;
        }
        return this.Zh() == null || ((xf)object0).Zh() == null ? false : this.Zh().toString().equals(this.Zh().toString());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.PjT(), this.Zh()});
    }
}

