package com.fsn.cauly.blackdragoncore;

import com.fsn.cauly.Y.i0;

public class e {
    int a;
    static e b;
    static String[] c;

    static {
        e.c = new String[]{"PfiLgnYX"};
    }

    public e() {
        this.a = 0;
    }

    public static e a() {
        synchronized(e.class) {
            if(e.b == null) {
                Class class1 = e.class;
                synchronized(class1) {
                    if(e.b == null) {
                        e.b = new e();
                    }
                }
            }
            return e.b;
        }
    }

    public void a(i0 i00) {
        if(i00 != null && i00.f != null) {
            String[] arr_s = e.c;
            for(int v = 0; v < arr_s.length; ++v) {
                if(i00.f.equals(arr_s[v])) {
                    this.a = 1;
                    return;
                }
            }
        }
    }

    public boolean b() {
        return this.a != 0;
    }
}

