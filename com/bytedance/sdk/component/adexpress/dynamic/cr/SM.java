package com.bytedance.sdk.component.adexpress.dynamic.cr;

import java.util.Arrays;

public class SM {
    public float PjT;
    public float Zh;

    public SM(float f, float f1) {
        this.PjT = f;
        this.Zh = f1;
    }

    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && Float.compare(((SM)object0).PjT, this.PjT) == 0 && Float.compare(((SM)object0).Zh, this.Zh) == 0;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.PjT, this.Zh});
    }
}

