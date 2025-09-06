package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.w;
import java.io.Serializable;
import java.util.Arrays;

public abstract class d implements Serializable {
    public static final int a = 0;
    public static final int b = -1;
    public static final int c = -2;

    public abstract int[] a();

    public abstract w b(int arg1);

    public static int[] c() {
        int[] arr_v = c.g();
        return Arrays.copyOf(arr_v, arr_v.length);
    }
}

