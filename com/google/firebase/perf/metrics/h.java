package com.google.firebase.perf.metrics;

import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class h {
    public static class a {
        int a;
        int b;
        int c;

        public a(int v, int v1, int v2) {
            this.a = v;
            this.b = v1;
            this.c = v2;
        }

        public a a(a h$a0) {
            return new a(this.a - h$a0.d(), this.b - h$a0.c(), this.c - h$a0.b());
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.b;
        }

        public int d() {
            return this.a;
        }
    }

    @NonNull
    public static a a(@Nullable SparseIntArray[] arr_sparseIntArray) {
        if(arr_sparseIntArray != null) {
            SparseIntArray sparseIntArray0 = arr_sparseIntArray[0];
            if(sparseIntArray0 != null) {
                int v1 = 0;
                int v2 = 0;
                int v3 = 0;
                for(int v = 0; v < sparseIntArray0.size(); ++v) {
                    int v4 = sparseIntArray0.keyAt(v);
                    int v5 = sparseIntArray0.valueAt(v);
                    v1 += v5;
                    if(v4 > 700) {
                        v3 += v5;
                    }
                    if(v4 > 16) {
                        v2 += v5;
                    }
                }
                return new a(v1, v2, v3);
            }
        }
        return new a(0, 0, 0);
    }
}

