package com.bytedance.adsdk.Zh.ReZ;

import android.util.Pair;

public class XX {
    Object PjT;
    Object Zh;

    public void PjT(Object object0, Object object1) {
        this.PjT = object0;
        this.Zh = object1;
    }

    // 去混淆评级： 低(20)
    private static boolean Zh(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof Pair ? XX.Zh(((Pair)object0).first, this.PjT) && XX.Zh(((Pair)object0).second, this.Zh) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.PjT == null ? 0 : this.PjT.hashCode();
        Object object0 = this.Zh;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public String toString() {
        return "Pair{" + this.PjT + " " + this.Zh + "}";
    }
}

