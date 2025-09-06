package com.fsn.cauly.blackdragoncore;

import com.fsn.cauly.Y.m0;

public class AdHandler {
    b a;

    public AdHandler() {
        this.a = new b();
    }

    public Object processMessage(int v, Object object0, Object object1) {
        if(v == 9) {
            m0.a = true;
            return null;
        }
        b b0 = this.a;
        if(b0 == null) {
            return null;
        }
        Object object2 = b0.a(v, object0, object1);
        if(v == 3) {
            this.a = null;
        }
        return object2;
    }
}

