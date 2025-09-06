package androidx.compose.ui.platform;

import A3.o;
import android.graphics.Matrix;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class LayerMatrixCache {
    @l
    private final o a;
    @m
    private Matrix b;
    @m
    private Matrix c;
    @m
    private float[] d;
    @m
    private float[] e;
    private boolean f;
    private boolean g;
    private boolean h;

    public LayerMatrixCache(@l o o0) {
        L.p(o0, "getMatrix");
        super();
        this.a = o0;
        this.f = true;
        this.g = true;
        this.h = true;
    }

    @m
    public final float[] a(Object object0) {
        float[] arr_f = this.e;
        if(arr_f == null) {
            arr_f = androidx.compose.ui.graphics.Matrix.c(null, 1, null);
            this.e = arr_f;
        }
        if(this.g) {
            this.h = InvertMatrixKt.a(this.b(object0), arr_f);
            this.g = false;
        }
        return this.h ? arr_f : null;
    }

    @l
    public final float[] b(Object object0) {
        float[] arr_f = this.d;
        if(arr_f == null) {
            arr_f = androidx.compose.ui.graphics.Matrix.c(null, 1, null);
            this.d = arr_f;
        }
        if(!this.f) {
            return arr_f;
        }
        Matrix matrix0 = this.b;
        if(matrix0 == null) {
            matrix0 = new Matrix();
            this.b = matrix0;
        }
        this.a.invoke(object0, matrix0);
        Matrix matrix1 = this.c;
        if(matrix1 == null || !L.g(matrix0, matrix1)) {
            AndroidMatrixConversions_androidKt.b(arr_f, matrix0);
            this.b = matrix1;
            this.c = matrix0;
        }
        this.f = false;
        return arr_f;
    }

    public final void c() {
        this.f = true;
        this.g = true;
    }
}

