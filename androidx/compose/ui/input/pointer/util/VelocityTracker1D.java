package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

@StabilityInferred(parameters = 0)
public final class VelocityTracker1D {
    public static enum Strategy {
        Lsq2,
        Impulse;

        private static final Strategy[] a() [...] // Inlined contents
    }

    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[Strategy.values().length];
            try {
                arr_v[Strategy.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Strategy.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    private final boolean a;
    @l
    private final Strategy b;
    private final int c;
    @l
    private final DataPointAtTime[] d;
    private int e;
    public static final int f = 8;

    static {
    }

    public VelocityTracker1D() {
        this(false, null, 3, null);
    }

    public VelocityTracker1D(boolean z) {
        this(z, Strategy.b);
    }

    public VelocityTracker1D(boolean z, @l Strategy velocityTracker1D$Strategy0) {
        L.p(velocityTracker1D$Strategy0, "strategy");
        super();
        this.a = z;
        this.b = velocityTracker1D$Strategy0;
        if(z && velocityTracker1D$Strategy0.equals(Strategy.a)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int v = WhenMappings.a[velocityTracker1D$Strategy0.ordinal()];
        int v1 = 2;
        if(v != 1) {
            if(v != 2) {
                throw new J();
            }
            v1 = 3;
        }
        this.c = v1;
        DataPointAtTime[] arr_dataPointAtTime = new DataPointAtTime[20];
        for(int v2 = 0; v2 < 20; ++v2) {
            arr_dataPointAtTime[v2] = null;
        }
        this.d = arr_dataPointAtTime;
    }

    public VelocityTracker1D(boolean z, Strategy velocityTracker1D$Strategy0, int v, w w0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            velocityTracker1D$Strategy0 = Strategy.a;
        }
        this(z, velocityTracker1D$Strategy0);
    }

    public final void a(long v, float f) {
        int v1 = (this.e + 1) % 20;
        this.e = v1;
        VelocityTrackerKt.g(this.d, v1, v, f);
    }

    private final float b(List list0, List list1) {
        try {
            return ((Number)VelocityTrackerKt.f(list1, list0, 2).get(1)).floatValue();
        }
        catch(IllegalArgumentException unused_ex) {
            return 0.0f;
        }
    }

    public final float c() {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        int v = this.e;
        DataPointAtTime dataPointAtTime0 = this.d[v];
        if(dataPointAtTime0 == null) {
            return 0.0f;
        }
        int v1 = 0;
        DataPointAtTime dataPointAtTime1 = dataPointAtTime0;
        DataPointAtTime dataPointAtTime2;
        while((dataPointAtTime2 = this.d[v]) != null) {
            float f = (float)(dataPointAtTime0.f() - dataPointAtTime2.f());
            if(f > 100.0f || ((float)Math.abs(dataPointAtTime2.f() - dataPointAtTime1.f())) > 40.0f) {
                break;
            }
            arrayList0.add(dataPointAtTime2.e());
            arrayList1.add(((float)(-f)));
            if(v == 0) {
                v = 20;
            }
            --v;
            ++v1;
            if(v1 >= 20) {
                break;
            }
            dataPointAtTime1 = dataPointAtTime2;
        }
        if(v1 >= this.c) {
            switch(this.b) {
                case 1: {
                    return VelocityTrackerKt.d(arrayList0, arrayList1, this.a) * 1000.0f;
                }
                case 2: {
                    return this.b(arrayList0, arrayList1) * 1000.0f;
                }
                default: {
                    throw new J();
                }
            }
        }
        return 0.0f;
    }

    public final boolean d() {
        return this.a;
    }

    public final void e() {
        kotlin.collections.l.V1(this.d, null, 0, 0, 6, null);
        this.e = 0;
    }
}

