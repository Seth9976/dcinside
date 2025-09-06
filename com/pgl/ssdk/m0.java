package com.pgl.ssdk;

import android.content.Context;
import com.pgl.ssdk.ces.a;

public class m0 implements Runnable {
    private Context a;
    private int b;
    private Object[] c;

    public m0(Context context0, int v, Object[] arr_object) {
        this.a = context0;
        this.b = v;
        this.c = arr_object;
    }

    @Override
    public void run() {
        try {
            if(this.b == 0xDE) {
                i0.a(this.a).a();
            }
            byte[] arr_b = (byte[])a.meta(this.b, this.a, this.c);
            if(arr_b != null && arr_b.length > 0) {
                new n0(this.a, this.b).a(1, 2, arr_b);
            }
        }
        catch(Throwable unused_ex) {
        }
    }
}

