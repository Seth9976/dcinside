package io.realm;

import java.util.Arrays;
import y4.m;

class b extends K {
    @Override  // io.realm.K
    protected boolean a(@m Object object0, @m Object object1) {
        return this.c(((byte[])object0), ((byte[])object1));
    }

    protected boolean c(@m byte[] arr_b, @m byte[] arr_b1) {
        return Arrays.equals(arr_b, arr_b1);
    }
}

