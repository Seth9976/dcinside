package androidx.profileinstaller;

import androidx.annotation.NonNull;
import java.util.TreeMap;

class DexProfileData {
    @NonNull
    final String a;
    @NonNull
    final String b;
    final long c;
    long d;
    int e;
    final int f;
    final int g;
    @NonNull
    int[] h;
    @NonNull
    final TreeMap i;

    DexProfileData(@NonNull String s, @NonNull String s1, long v, long v1, int v2, int v3, int v4, @NonNull int[] arr_v, @NonNull TreeMap treeMap0) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = v3;
        this.g = v4;
        this.h = arr_v;
        this.i = treeMap0;
    }
}

