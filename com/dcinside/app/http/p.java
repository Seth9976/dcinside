package com.dcinside.app.http;

import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.Nullable;

public final class p {
    @Nullable
    private Handler a;
    @Nullable
    private b[] b;
    @Nullable
    private SparseArray c;
    private int d;

    public p(int v, @Nullable Handler handler0) {
        this.c = new SparseArray();
        this.d = v;
        this.a = handler0;
        this.b = new b[v];
        for(int v1 = 0; true; ++v1) {
            b[] arr_l$b = this.b;
            if(v1 >= arr_l$b.length) {
                break;
            }
            arr_l$b[v1] = (double f) -> this.d(v1, f);
        }
    }

    @Nullable
    public b[] b() {
        return this.b;
    }

    // 检测为 Lambda 实现
    private void c(int v, double f) [...]

    private void d(int v, double f) {
        if(this.a != null && this.b != null) {
            SparseArray sparseArray0 = this.c;
            if(sparseArray0 != null) {
                try {
                    sparseArray0.put(v, f);
                    int v1 = this.c.size();
                    double f1 = 0.0;
                    double f2 = 0.0;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Double double0 = (Double)this.c.valueAt(v2);
                        if(double0 != null) {
                            f2 += (double)double0;
                        }
                    }
                    int v3 = this.d;
                    if(v3 > 0) {
                        f1 = f2 / ((double)v3);
                    }
                    this.a.obtainMessage(0, ((int)(f1 * 10000.0)), 0).sendToTarget();
                    return;
                }
                catch(Exception exception0) {
                }
                exception0.printStackTrace();
            }
        }
    }

    public void e() {
        Handler handler0 = this.a;
        if(handler0 != null) {
            handler0.removeMessages(0);
            this.a = null;
        }
        this.b = null;
        SparseArray sparseArray0 = this.c;
        if(sparseArray0 != null) {
            sparseArray0.clear();
            this.c = null;
        }
    }
}

