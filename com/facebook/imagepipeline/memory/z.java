package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.memory.a;
import com.facebook.common.memory.e;
import kotlin.jvm.internal.L;
import p3.d;
import y4.l;

@d
public class z extends g implements a {
    @l
    private final int[] k;

    public z(@l e e0, @l O o0, @l P p0) {
        L.p(e0, "memoryTrimmableRegistry");
        L.p(o0, "poolParams");
        L.p(p0, "poolStatsTracker");
        super(e0, o0, p0);
        SparseIntArray sparseIntArray0 = o0.c;
        if(sparseIntArray0 == null) {
            this.k = new int[0];
        }
        else {
            this.k = new int[sparseIntArray0.size()];
            int v1 = sparseIntArray0.size();
            for(int v = 0; v < v1; ++v) {
                this.k[v] = sparseIntArray0.keyAt(v);
            }
        }
        this.E();
    }

    @Override  // com.facebook.imagepipeline.memory.g
    protected int A(int v) [...] // Inlined contents

    @l
    protected byte[] P(int v) {
        return new byte[v];
    }

    protected void Q(@l byte[] arr_b) {
        L.p(arr_b, "value");
    }

    protected int R(@l byte[] arr_b) {
        L.p(arr_b, "value");
        return arr_b.length;
    }

    public final int S() {
        return this.k.length <= 0 ? 0 : this.k[0];
    }

    @Override  // com.facebook.imagepipeline.memory.g
    public Object g(int v) {
        return this.P(v);
    }

    @Override  // com.facebook.imagepipeline.memory.g
    public void u(Object object0) {
        this.Q(((byte[])object0));
    }

    @Override  // com.facebook.imagepipeline.memory.g
    protected int x(int v) {
        if(v <= 0) {
            throw new b(v);
        }
        int[] arr_v = this.k;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v2 = arr_v[v1];
            if(v2 >= v) {
                return v2;
            }
        }
        return v;
    }

    @Override  // com.facebook.imagepipeline.memory.g
    public int y(Object object0) {
        return this.R(((byte[])object0));
    }
}

