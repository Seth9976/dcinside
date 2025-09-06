package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidPathMeasure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,86:1\n35#2,5:87\n35#2,5:92\n*S KotlinDebug\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n*L\n43#1:87,5\n49#1:92,5\n*E\n"})
public final class AndroidPathMeasure implements PathMeasure {
    @l
    private final android.graphics.PathMeasure a;
    @m
    private float[] b;
    @m
    private float[] c;

    public AndroidPathMeasure(@l android.graphics.PathMeasure pathMeasure0) {
        L.p(pathMeasure0, "internalPathMeasure");
        super();
        this.a = pathMeasure0;
    }

    @Override  // androidx.compose.ui.graphics.PathMeasure
    public long a(float f) {
        if(this.b == null) {
            this.b = new float[2];
        }
        if(this.c == null) {
            this.c = new float[2];
        }
        if(this.a.getPosTan(f, this.b, this.c)) {
            float[] arr_f = this.c;
            L.m(arr_f);
            float f1 = arr_f[0];
            float[] arr_f1 = this.c;
            L.m(arr_f1);
            return OffsetKt.a(f1, arr_f1[1]);
        }
        return 0x7FC000007FC00000L;
    }

    @Override  // androidx.compose.ui.graphics.PathMeasure
    public boolean b(float f, float f1, @l Path path0, boolean z) {
        L.p(path0, "destination");
        android.graphics.PathMeasure pathMeasure0 = this.a;
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return pathMeasure0.getSegment(f, f1, ((AndroidPath)path0).w(), z);
    }

    @Override  // androidx.compose.ui.graphics.PathMeasure
    public void c(@m Path path0, boolean z) {
        android.graphics.Path path1;
        android.graphics.PathMeasure pathMeasure0 = this.a;
        if(path0 == null) {
            path1 = null;
        }
        else {
            if(!(path0 instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            path1 = ((AndroidPath)path0).w();
        }
        pathMeasure0.setPath(path1, z);
    }

    @Override  // androidx.compose.ui.graphics.PathMeasure
    public long d(float f) {
        if(this.b == null) {
            this.b = new float[2];
        }
        if(this.c == null) {
            this.c = new float[2];
        }
        if(this.a.getPosTan(f, this.b, this.c)) {
            float[] arr_f = this.b;
            L.m(arr_f);
            float f1 = arr_f[0];
            float[] arr_f1 = this.b;
            L.m(arr_f1);
            return OffsetKt.a(f1, arr_f1[1]);
        }
        return 0x7FC000007FC00000L;
    }

    @Override  // androidx.compose.ui.graphics.PathMeasure
    public float getLength() {
        return this.a.getLength();
    }
}

