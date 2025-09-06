package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

@Immutable
public final class PointerInputChange {
    private final long a;
    private final long b;
    private final long c;
    private final boolean d;
    private final long e;
    private final long f;
    private final boolean g;
    private final int h;
    private final long i;
    @m
    private Float j;
    @m
    private List k;
    @l
    private ConsumedData l;
    public static final int m;

    static {
    }

    private PointerInputChange(long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, boolean z2, int v5, long v6) {
        this(v, v1, v2, z, v3, v4, z1, z2, v5, v6, null);
        this.j = f;
    }

    // 去混淆评级： 低(20)
    public PointerInputChange(long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, boolean z2, int v5, long v6, int v7, w w0) {
        this(v, v1, v2, z, f, v3, v4, z1, z2, ((v7 & 0x200) == 0 ? v5 : 1), ((v7 & 0x400) == 0 ? v6 : 0L), null);
    }

    @ExperimentalComposeUiApi
    public PointerInputChange(long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, boolean z2, int v5, long v6, w w0) {
        this(v, v1, v2, z, f, v3, v4, z1, z2, v5, v6);
    }

    private PointerInputChange(long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, boolean z2, int v5, List list0, long v6) {
        this(v, v1, v2, z, f, v3, v4, z1, z2, v5, v6, null);
        this.k = list0;
    }

    @ExperimentalComposeUiApi
    public PointerInputChange(long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, boolean z2, int v5, List list0, long v6, w w0) {
        this(v, v1, v2, z, f, v3, v4, z1, z2, v5, list0, v6);
    }

    // 去混淆评级： 低(20)
    private PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5) {
        this(v, v1, v2, z, 1.0f, v3, v4, z1, consumedData0.a() || consumedData0.c(), v5, 0L, null);
    }

    public PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5, int v6, w w0) {
        this(v, v1, v2, z, v3, v4, z1, consumedData0, ((v6 & 0x100) == 0 ? v5 : 1), null);
    }

    @k(level = kotlin.m.c, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @c0(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5, w w0) {
        this(v, v1, v2, z, v3, v4, z1, consumedData0, v5);
    }

    private PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, boolean z2, int v5, long v6) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = z;
        this.e = v3;
        this.f = v4;
        this.g = z1;
        this.h = v5;
        this.i = v6;
        this.l = new ConsumedData(z2, z2);
    }

    // 去混淆评级： 低(20)
    public PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, boolean z2, int v5, long v6, int v7, w w0) {
        this(v, v1, v2, z, v3, v4, z1, z2, ((v7 & 0x100) == 0 ? v5 : 1), ((v7 & 0x200) == 0 ? v6 : 0L), null);
    }

    public PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, boolean z2, int v5, long v6, w w0) {
        this(v, v1, v2, z, v3, v4, z1, z2, v5, v6);
    }

    private PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, boolean z2, int v5, List list0, long v6) {
        this(v, v1, v2, z, 1.0f, v3, v4, z1, z2, v5, list0, v6, null);
        this.k = list0;
    }

    public PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, boolean z2, int v5, List list0, long v6, w w0) {
        this(v, v1, v2, z, v3, v4, z1, z2, v5, list0, v6);
    }

    // 去混淆评级： 低(20)
    public final boolean A() {
        return this.l.a() || this.l.c();
    }

    public static void B() {
    }

    public final void a() {
        this.l.e(true);
        this.l.f(true);
    }

    @k(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @c0(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    @l
    public final PointerInputChange b(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, @l ConsumedData consumedData0, int v5, long v6) {
        L.p(consumedData0, "consumed");
        PointerInputChange pointerInputChange0 = new PointerInputChange(v, v1, v2, z, this.s(), v3, v4, z1, consumedData0.a() || consumedData0.c(), v5, this.n(), v6, null);
        this.l = consumedData0;
        return pointerInputChange0;
    }

    public static PointerInputChange c(PointerInputChange pointerInputChange0, long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5, long v6, int v7, Object object0) {
        long v8 = (v7 & 1) == 0 ? v : pointerInputChange0.a;
        long v9 = (v7 & 2) == 0 ? v1 : pointerInputChange0.b;
        long v10 = (v7 & 4) == 0 ? v2 : pointerInputChange0.c;
        boolean z2 = (v7 & 8) == 0 ? z : pointerInputChange0.d;
        long v11 = (v7 & 16) == 0 ? v3 : pointerInputChange0.e;
        long v12 = (v7 & 0x20) == 0 ? v4 : pointerInputChange0.f;
        boolean z3 = (v7 & 0x40) == 0 ? z1 : pointerInputChange0.g;
        int v13 = (v7 & 0x100) == 0 ? v5 : pointerInputChange0.h;
        return (v7 & 0x200) == 0 ? pointerInputChange0.b(v8, v9, v10, z2, v11, v12, z3, consumedData0, v13, v6) : pointerInputChange0.b(v8, v9, v10, z2, v11, v12, z3, consumedData0, v13, pointerInputChange0.i);
    }

    @k(level = kotlin.m.c, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @c0(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    public final PointerInputChange d(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5) {
        L.p(consumedData0, "consumed");
        PointerInputChange pointerInputChange0 = new PointerInputChange(v, v1, v2, z, this.s(), v3, v4, z1, consumedData0.a() || consumedData0.c(), v5, this.n(), this.i, null);
        this.l = consumedData0;
        return pointerInputChange0;
    }

    public static PointerInputChange e(PointerInputChange pointerInputChange0, long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5, int v6, Object object0) {
        long v7 = (v6 & 1) == 0 ? v : pointerInputChange0.a;
        long v8 = (v6 & 2) == 0 ? v1 : pointerInputChange0.b;
        long v9 = (v6 & 4) == 0 ? v2 : pointerInputChange0.c;
        boolean z2 = (v6 & 8) == 0 ? z : pointerInputChange0.d;
        long v10 = (v6 & 16) == 0 ? v3 : pointerInputChange0.e;
        long v11 = (v6 & 0x20) == 0 ? v4 : pointerInputChange0.f;
        boolean z3 = (v6 & 0x40) == 0 ? z1 : pointerInputChange0.g;
        ConsumedData consumedData1 = (v6 & 0x80) == 0 ? consumedData0 : pointerInputChange0.l;
        return (v6 & 0x100) == 0 ? pointerInputChange0.d(v7, v8, v9, z2, v10, v11, z3, consumedData1, v5) : pointerInputChange0.d(v7, v8, v9, z2, v10, v11, z3, consumedData1, pointerInputChange0.h);
    }

    @l
    public final PointerInputChange f(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, int v5, long v6) {
        PointerInputChange pointerInputChange0 = new PointerInputChange(v, v1, v2, z, this.s(), v3, v4, z1, false, v5, this.n(), v6, null);
        pointerInputChange0.l = this.l;
        return pointerInputChange0;
    }

    public static PointerInputChange g(PointerInputChange pointerInputChange0, long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, int v5, long v6, int v7, Object object0) {
        long v8 = (v7 & 1) == 0 ? v : pointerInputChange0.a;
        long v9 = (v7 & 2) == 0 ? v1 : pointerInputChange0.b;
        long v10 = (v7 & 4) == 0 ? v2 : pointerInputChange0.c;
        boolean z2 = (v7 & 8) == 0 ? z : pointerInputChange0.d;
        long v11 = (v7 & 16) == 0 ? v3 : pointerInputChange0.e;
        long v12 = (v7 & 0x20) == 0 ? v4 : pointerInputChange0.f;
        boolean z3 = (v7 & 0x40) == 0 ? z1 : pointerInputChange0.g;
        int v13 = (v7 & 0x80) == 0 ? v5 : pointerInputChange0.h;
        return (v7 & 0x100) == 0 ? pointerInputChange0.f(v8, v9, v10, z2, v11, v12, z3, v13, v6) : pointerInputChange0.f(v8, v9, v10, z2, v11, v12, z3, v13, pointerInputChange0.i);
    }

    @ExperimentalComposeUiApi
    @l
    public final PointerInputChange h(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, int v5, @l List list0, long v6) {
        L.p(list0, "historical");
        PointerInputChange pointerInputChange0 = new PointerInputChange(v, v1, v2, z, this.s(), v3, v4, z1, false, v5, list0, v6, null);
        pointerInputChange0.l = this.l;
        return pointerInputChange0;
    }

    public static PointerInputChange i(PointerInputChange pointerInputChange0, long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, int v5, List list0, long v6, int v7, Object object0) {
        long v8 = (v7 & 1) == 0 ? v : pointerInputChange0.a;
        long v9 = (v7 & 2) == 0 ? v1 : pointerInputChange0.b;
        long v10 = (v7 & 4) == 0 ? v2 : pointerInputChange0.c;
        boolean z2 = (v7 & 8) == 0 ? z : pointerInputChange0.d;
        long v11 = (v7 & 16) == 0 ? v3 : pointerInputChange0.e;
        long v12 = (v7 & 0x20) == 0 ? v4 : pointerInputChange0.f;
        boolean z3 = (v7 & 0x40) == 0 ? z1 : pointerInputChange0.g;
        int v13 = (v7 & 0x80) == 0 ? v5 : pointerInputChange0.h;
        return (v7 & 0x200) == 0 ? pointerInputChange0.h(v8, v9, v10, z2, v11, v12, z3, v13, list0, v6) : pointerInputChange0.h(v8, v9, v10, z2, v11, v12, z3, v13, list0, pointerInputChange0.i);
    }

    @ExperimentalComposeUiApi
    @l
    public final PointerInputChange j(long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, int v5, @l List list0, long v6) {
        L.p(list0, "historical");
        PointerInputChange pointerInputChange0 = new PointerInputChange(v, v1, v2, z, f, v3, v4, z1, false, v5, list0, v6, null);
        pointerInputChange0.l = this.l;
        return pointerInputChange0;
    }

    public static PointerInputChange k(PointerInputChange pointerInputChange0, long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, int v5, List list0, long v6, int v7, Object object0) {
        long v8 = (v7 & 1) == 0 ? v : pointerInputChange0.a;
        long v9 = (v7 & 2) == 0 ? v1 : pointerInputChange0.b;
        long v10 = (v7 & 4) == 0 ? v2 : pointerInputChange0.c;
        boolean z2 = (v7 & 8) == 0 ? z : pointerInputChange0.d;
        float f1 = (v7 & 16) == 0 ? f : pointerInputChange0.s();
        long v11 = (v7 & 0x20) == 0 ? v3 : pointerInputChange0.e;
        long v12 = (v7 & 0x40) == 0 ? v4 : pointerInputChange0.f;
        boolean z3 = (v7 & 0x80) == 0 ? z1 : pointerInputChange0.g;
        int v13 = (v7 & 0x100) == 0 ? v5 : pointerInputChange0.h;
        return (v7 & 0x400) == 0 ? pointerInputChange0.j(v8, v9, v10, z2, f1, v11, v12, z3, v13, list0, v6) : pointerInputChange0.j(v8, v9, v10, z2, f1, v11, v12, z3, v13, list0, pointerInputChange0.i);
    }

    @l
    public final ConsumedData l() {
        return this.l;
    }

    @k(message = "use isConsumed and consume() pair of methods instead")
    public static void m() {
    }

    @ExperimentalComposeUiApi
    @l
    public final List n() {
        return this.k == null ? u.H() : this.k;
    }

    @ExperimentalComposeUiApi
    public static void o() {
    }

    public final long p() {
        return this.a;
    }

    public final long q() {
        return this.c;
    }

    public final boolean r() {
        return this.d;
    }

    @ExperimentalComposeUiApi
    public final float s() {
        return this.j == null ? 0.0f : ((float)this.j);
    }

    @ExperimentalComposeUiApi
    public static void t() {
    }

    @Override
    @l
    public String toString() {
        return "PointerInputChange(id=" + PointerId.g(this.a) + ", uptimeMillis=" + this.b + ", position=" + Offset.y(this.c) + ", pressed=" + this.d + ", pressure=" + this.s() + ", previousUptimeMillis=" + this.e + ", previousPosition=" + Offset.y(this.f) + ", previousPressed=" + this.g + ", isConsumed=" + this.A() + ", type=" + PointerType.k(this.h) + ", historical=" + this.n() + ",scrollDelta=" + Offset.y(this.i) + ')';
    }

    public final long u() {
        return this.f;
    }

    public final boolean v() {
        return this.g;
    }

    public final long w() {
        return this.e;
    }

    public final long x() {
        return this.i;
    }

    public final int y() {
        return this.h;
    }

    public final long z() {
        return this.b;
    }
}

