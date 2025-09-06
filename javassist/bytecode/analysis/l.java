package javassist.bytecode.analysis;

import javassist.bytecode.c0;
import javassist.bytecode.q;

public class l implements c0 {
    public static int a(int v, q q0) {
        switch(q0.f(v)) {
            case 200: 
            case 201: {
                return v + q0.M(v + 1);
            }
            default: {
                return v + q0.L(v + 1);
            }
        }
    }

    public static boolean b(int v) {
        return v == 0xA7 || v == 200;
    }

    public static boolean c(int v) {
        return v == 0xA8 || v == 201;
    }

    public static boolean d(int v) {
        return v >= 0x99 && v <= 0xA8 || (v == 0xC6 || v == 0xC7 || v == 200 || v == 201);
    }

    public static boolean e(int v) {
        return v >= 0xAC && v <= 0xB1;
    }
}

