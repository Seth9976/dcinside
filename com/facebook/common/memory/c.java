package com.facebook.common.memory;

import k1.n.a;
import k1.n;

@n(a.a)
public enum c {
    OnCloseToDalvikHeapLimit(0.5),
    OnSystemMemoryCriticallyLowWhileAppInForeground(1.0),
    OnSystemLowMemoryWhileAppInForeground(0.5),
    OnSystemLowMemoryWhileAppInBackgroundLowSeverity(1.0),
    OnSystemModerateMemory(0.5),
    OnAppBackgrounded(1.0),
    OnJavaMemoryRed(1.0),
    OnJavaMemoryYellow(0.5),
    OnSystemMemoryRed(1.0),
    OnSystemMemoryYellow(0.5);

    private double a;

    private c(double f) {
        this.a = f;
    }

    public static c a(int v) {
        c[] arr_c = c.values();
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            c c0 = arr_c[v1];
            if(c0.ordinal() == v) {
                return c0;
            }
        }
        throw new IllegalArgumentException("Unknown type: " + v);
    }

    public double b() {
        return this.a;
    }
}

