package androidx.compose.ui.input.pointer;

import android.os.Build.VERSION;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class MotionEventAdapter {
    private long a;
    @l
    private final SparseLongArray b;
    @l
    private final SparseBooleanArray c;
    @l
    private final List d;
    private int e;
    private int f;

    public MotionEventAdapter() {
        this.b = new SparseLongArray();
        this.c = new SparseBooleanArray();
        this.d = new ArrayList();
        this.e = -1;
        this.f = -1;
    }

    private final void a(MotionEvent motionEvent0) {
        switch(motionEvent0.getActionMasked()) {
            case 0: 
            case 5: {
                int v = motionEvent0.getActionIndex();
                int v1 = motionEvent0.getPointerId(v);
                if(this.b.indexOfKey(v1) < 0) {
                    long v2 = this.a;
                    this.a = v2 + 1L;
                    this.b.put(v1, v2);
                    if(motionEvent0.getToolType(v) == 3) {
                        this.c.put(v1, true);
                        return;
                    }
                }
                break;
            }
            case 9: {
                int v3 = motionEvent0.getPointerId(0);
                if(this.b.indexOfKey(v3) < 0) {
                    long v4 = this.a;
                    this.a = v4 + 1L;
                    this.b.put(v3, v4);
                    return;
                }
                break;
            }
        }
    }

    private final void b(MotionEvent motionEvent0) {
        if(motionEvent0.getPointerCount() != 1) {
            return;
        }
        int v = motionEvent0.getToolType(0);
        int v1 = motionEvent0.getSource();
        if(v != this.e || v1 != this.f) {
            this.e = v;
            this.f = v1;
            this.c.clear();
            this.b.clear();
        }
    }

    @m
    public final PointerInputEvent c(@l MotionEvent motionEvent0, @l PositionCalculator positionCalculator0) {
        int v2;
        L.p(motionEvent0, "motionEvent");
        L.p(positionCalculator0, "positionCalculator");
        int v = motionEvent0.getActionMasked();
        if(v == 3) {
            this.b.clear();
            this.c.clear();
            return null;
        }
        this.b(motionEvent0);
        this.a(motionEvent0);
        boolean z = v == 7 || v == 9 || v == 10;
        if(z) {
            int v1 = motionEvent0.getPointerId(motionEvent0.getActionIndex());
            this.c.put(v1, true);
        }
        switch(v) {
            case 1: {
                v2 = 0;
                break;
            }
            case 6: {
                v2 = motionEvent0.getActionIndex();
                break;
            }
            default: {
                v2 = -1;
            }
        }
        this.d.clear();
        int v3 = motionEvent0.getPointerCount();
        for(int v4 = 0; v4 < v3; ++v4) {
            boolean z1 = !z && v4 != v2 && (v != 8 || motionEvent0.getButtonState() != 0);
            this.d.add(this.d(positionCalculator0, motionEvent0, v4, z1));
        }
        this.j(motionEvent0);
        return new PointerInputEvent(motionEvent0.getEventTime(), this.d, motionEvent0);
    }

    private final PointerInputEventData d(PositionCalculator positionCalculator0, MotionEvent motionEvent0, int v, boolean z) {
        int v6;
        long v5;
        long v4;
        long v3;
        long v1 = this.f(motionEvent0.getPointerId(v));
        float f = motionEvent0.getPressure(v);
        long v2 = OffsetKt.a(motionEvent0.getX(v), motionEvent0.getY(v));
        if(v == 0) {
            v3 = OffsetKt.a(motionEvent0.getRawX(), motionEvent0.getRawY());
            v4 = v3;
            v5 = positionCalculator0.h(v3);
        }
        else if(Build.VERSION.SDK_INT >= 29) {
            v3 = MotionEventHelper.a.a(motionEvent0, v);
            v4 = v3;
            v5 = positionCalculator0.h(v3);
        }
        else {
            v5 = v2;
            v4 = positionCalculator0.y(v2);
        }
        switch(motionEvent0.getToolType(v)) {
            case 0: {
                v6 = 0;
                break;
            }
            case 1: {
                v6 = 1;
                break;
            }
            case 2: {
                v6 = 3;
                break;
            }
            case 3: {
                v6 = 2;
                break;
            }
            case 4: {
                v6 = 4;
                break;
            }
            default: {
                v6 = 0;
            }
        }
        ArrayList arrayList0 = new ArrayList();
        int v7 = motionEvent0.getHistorySize();
        for(int v8 = 0; v8 < v7; ++v8) {
            float f1 = motionEvent0.getHistoricalX(v, v8);
            float f2 = motionEvent0.getHistoricalY(v, v8);
            if(!Float.isInfinite(f1) && !Float.isNaN(f1) && !Float.isInfinite(f2) && !Float.isNaN(f2)) {
                arrayList0.add(new HistoricalChange(motionEvent0.getHistoricalEventTime(v8), OffsetKt.a(f1, f2), null));
            }
        }
        long v9 = motionEvent0.getActionMasked() == 8 ? OffsetKt.a(motionEvent0.getAxisValue(10), 0.0f - motionEvent0.getAxisValue(9)) : 0L;
        int v10 = motionEvent0.getPointerId(v);
        boolean z1 = this.c.get(v10, false);
        return new PointerInputEventData(v1, motionEvent0.getEventTime(), v4, v5, z, f, v6, z1, arrayList0, v9, null);
    }

    public final void e(int v) {
        this.c.delete(v);
        this.b.delete(v);
    }

    private final long f(int v) {
        int v1 = this.b.indexOfKey(v);
        if(v1 >= 0) {
            return this.b.valueAt(v1);
        }
        long v2 = this.a;
        this.a = v2 + 1L;
        this.b.put(v, v2);
        return v2;
    }

    @l
    public final SparseLongArray g() {
        return this.b;
    }

    @VisibleForTesting
    public static void h() {
    }

    private final boolean i(MotionEvent motionEvent0, int v) {
        int v1 = motionEvent0.getPointerCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(motionEvent0.getPointerId(v2) == v) {
                return true;
            }
        }
        return false;
    }

    private final void j(MotionEvent motionEvent0) {
        switch(motionEvent0.getActionMasked()) {
            case 1: 
            case 6: {
                int v = motionEvent0.getPointerId(motionEvent0.getActionIndex());
                if(!this.c.get(v, false)) {
                    this.b.delete(v);
                    this.c.delete(v);
                }
            }
        }
        int v1 = motionEvent0.getPointerCount();
        if(this.b.size() > v1) {
            for(int v2 = this.b.size() - 1; -1 < v2; --v2) {
                int v3 = this.b.keyAt(v2);
                if(!this.i(motionEvent0, v3)) {
                    this.b.removeAt(v2);
                    this.c.delete(v3);
                }
            }
        }
    }
}

