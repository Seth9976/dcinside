package com.pgl.ssdk;

import android.content.Context;
import com.pgl.ssdk.ces.a;
import com.pgl.ssdk.ces.b;

public class n0 extends k0 {
    private Context n;
    private final int o;

    public n0(Context context0, int v) {
        super(context0);
        this.n = context0;
        this.o = v;
    }

    @Override  // com.pgl.ssdk.k0
    public String a() {
        int v = this.o;
        if(v == 0xDE) {
            return "/ssdk/v2/r?os=0&ver=7.1.0.0.overseas-rc.3&mode=1&app_ver=" + z.g(this.n) + "&region=" + b0.a() + "&did=" + b.d() + "&aid=" + b.c();
        }
        return v == 301 ? "/ssdk/sd/token?os=android&app_id=" + b.c() + "&did=" + b.d() + "&app_ver=" + z.g(this.n) + "&platform=android&ver=7.1.0.0.overseas-rc.3&mode=1" : null;
    }

    @Override  // com.pgl.ssdk.k0
    public void a(int v, byte[] arr_b) {
        try {
            if(v == 200) {
                int v1 = this.o;
                if(v1 == 0xDE) {
                    ((Integer)a.meta(0xDF, null, arr_b)).intValue();
                    return;
                }
                if(v1 == 301) {
                    Object object0 = d1.a(arr_b);
                    "write token result = ".concat(String.valueOf(object0));
                    if(object0 instanceof Integer && ((int)(((Integer)object0))) == 0) {
                        d1.a = 200;
                        return;
                    }
                    if(object0 instanceof String) {
                        d1.c = (String)object0;
                        d1.a = 200;
                    }
                }
            }
            else {
                l0.b(this.n);
            }
        }
        catch(Throwable unused_ex) {
        }
    }
}

