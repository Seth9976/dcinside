package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
@s0({"SMAP\nLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,377:1\n1#2:378\n1627#3,6:379\n1627#3,6:385\n*S KotlinDebug\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n*L\n283#1:379,6\n322#1:385,6\n*E\n"})
public final class LayoutHelper {
    static final class BidiRun {
        private final int a;
        private final int b;
        private final boolean c;

        public BidiRun(int v, int v1, boolean z) {
            this.a = v;
            this.b = v1;
            this.c = z;
        }

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        @l
        public final BidiRun d(int v, int v1, boolean z) {
            return new BidiRun(v, v1, z);
        }

        public static BidiRun e(BidiRun layoutHelper$BidiRun0, int v, int v1, boolean z, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = layoutHelper$BidiRun0.a;
            }
            if((v2 & 2) != 0) {
                v1 = layoutHelper$BidiRun0.b;
            }
            if((v2 & 4) != 0) {
                z = layoutHelper$BidiRun0.c;
            }
            return layoutHelper$BidiRun0.d(v, v1, z);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof BidiRun)) {
                return false;
            }
            if(this.a != ((BidiRun)object0).a) {
                return false;
            }
            return this.b == ((BidiRun)object0).b ? this.c == ((BidiRun)object0).c : false;
        }

        public final int f() {
            return this.b;
        }

        public final int g() {
            return this.a;
        }

        public final boolean h() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = (this.a * 0x1F + this.b) * 0x1F;
            int v1 = this.c;
            if(v1) {
                v1 = 1;
            }
            return v + v1;
        }

        @Override
        @l
        public String toString() {
            return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
        }
    }

    @l
    private final Layout a;
    @l
    private final List b;
    @l
    private final List c;
    @l
    private final boolean[] d;
    @m
    private char[] e;
    private final int f;
    public static final int g = 8;

    static {
    }

    public LayoutHelper(@l Layout layout0) {
        L.p(layout0, "layout");
        super();
        this.a = layout0;
        ArrayList arrayList0 = new ArrayList();
        int v1 = 0;
        do {
            CharSequence charSequence0 = this.a.getText();
            L.o(charSequence0, "layout.text");
            int v2 = v.r3(charSequence0, '\n', v1, false, 4, null);
            v1 = v2 >= 0 ? v2 + 1 : this.a.getText().length();
            arrayList0.add(v1);
        }
        while(v1 < this.a.getText().length());
        this.b = arrayList0;
        int v3 = arrayList0.size();
        ArrayList arrayList1 = new ArrayList(v3);
        for(int v = 0; v < v3; ++v) {
            arrayList1.add(null);
        }
        this.c = arrayList1;
        this.d = new boolean[this.b.size()];
        this.f = this.b.size();
    }

    @m
    public final Bidi a(int v) {
        Bidi bidi0;
        if(this.d[v]) {
            return (Bidi)this.c.get(v);
        }
        int v1 = v == 0 ? 0 : ((Number)this.b.get(v - 1)).intValue();
        int v2 = ((Number)this.b.get(v)).intValue();
        int v3 = v2 - v1;
        char[] arr_c = this.e != null && this.e.length >= v3 ? this.e : new char[v3];
        TextUtils.getChars(this.a.getText(), v1, v2, arr_c, 0);
        if(Bidi.requiresBidi(arr_c, 0, v3)) {
            bidi0 = new Bidi(arr_c, 0, null, 0, v3, ((int)this.k(v)));
            if(bidi0.getRunCount() == 1) {
                bidi0 = null;
            }
        }
        else {
            bidi0 = null;
        }
        this.c.set(v, bidi0);
        this.d[v] = true;
        if(bidi0 != null) {
            arr_c = arr_c == this.e ? null : this.e;
        }
        this.e = arr_c;
        return bidi0;
    }

    // 去混淆评级： 低(20)
    private final float b(int v, boolean z) {
        return z ? this.a.getPrimaryHorizontal(v) : this.a.getSecondaryHorizontal(v);
    }

    public final float c(int v, boolean z, boolean z1) {
        int v1 = v;
        if(!z1) {
            return this.b(v, z);
        }
        int v2 = LayoutCompatKt.a(this.a, v1, true);
        int v3 = this.a.getLineStart(v2);
        int v4 = this.a.getLineEnd(v2);
        if(v1 != v3 && v1 != v4) {
            return this.b(v, z);
        }
        if(v1 != 0 && v1 != this.a.getText().length()) {
            int v5 = this.g(v1, true);
            boolean z2 = this.k(v5);
            int v6 = this.l(v4);
            int v7 = this.i(v5);
            Bidi bidi0 = this.a(v5);
            Bidi bidi1 = bidi0 == null ? null : bidi0.createLineBidi(v3 - v7, v6 - v7);
            boolean z3 = false;
            if(bidi1 != null && bidi1.getRunCount() != 1) {
                int v8 = bidi1.getRunCount();
                BidiRun[] arr_layoutHelper$BidiRun = new BidiRun[v8];
                for(int v9 = 0; v9 < v8; ++v9) {
                    arr_layoutHelper$BidiRun[v9] = new BidiRun(bidi1.getRunStart(v9) + v3, bidi1.getRunLimit(v9) + v3, bidi1.getRunLevel(v9) % 2 == 1);
                }
                int v10 = bidi1.getRunCount();
                byte[] arr_b = new byte[v10];
                for(int v11 = 0; v11 < v10; ++v11) {
                    arr_b[v11] = (byte)bidi1.getRunLevel(v11);
                }
                Bidi.reorderVisually(arr_b, 0, arr_layoutHelper$BidiRun, 0, v8);
                int v12 = -1;
                if(v1 == v3) {
                    for(int v13 = 0; v13 < v8; ++v13) {
                        if(arr_layoutHelper$BidiRun[v13].g() == v1) {
                            v12 = v13;
                            break;
                        }
                    }
                    if(z || z2 == arr_layoutHelper$BidiRun[v12].h()) {
                        z2 = !z2;
                    }
                    if(v12 == 0 && z2) {
                        return this.a.getLineLeft(v2);
                    }
                    if(v12 == kotlin.collections.l.we(arr_layoutHelper$BidiRun) && !z2) {
                        return this.a.getLineRight(v2);
                    }
                    if(z2) {
                        int v14 = arr_layoutHelper$BidiRun[v12 - 1].g();
                        return this.a.getPrimaryHorizontal(v14);
                    }
                    int v15 = arr_layoutHelper$BidiRun[v12 + 1].g();
                    return this.a.getPrimaryHorizontal(v15);
                }
                if(v1 > v6) {
                    v1 = this.l(v);
                }
                for(int v16 = 0; v16 < v8; ++v16) {
                    if(arr_layoutHelper$BidiRun[v16].f() == v1) {
                        v12 = v16;
                        break;
                    }
                }
                if(!z && z2 != arr_layoutHelper$BidiRun[v12].h()) {
                    z2 = !z2;
                }
                if(v12 == 0 && z2) {
                    return this.a.getLineLeft(v2);
                }
                if(v12 == kotlin.collections.l.we(arr_layoutHelper$BidiRun) && !z2) {
                    return this.a.getLineRight(v2);
                }
                if(z2) {
                    int v17 = arr_layoutHelper$BidiRun[v12 - 1].f();
                    return this.a.getPrimaryHorizontal(v17);
                }
                int v18 = arr_layoutHelper$BidiRun[v12 + 1].f();
                return this.a.getPrimaryHorizontal(v18);
            }
            if(z || z2 == this.a.isRtlCharAt(v3)) {
                z2 = !z2;
            }
            if(v1 == v3) {
                return z2 ? this.a.getLineLeft(v2) : this.a.getLineRight(v2);
            }
            if(!z2) {
                z3 = true;
            }
            return z3 ? this.a.getLineLeft(v2) : this.a.getLineRight(v2);
        }
        return this.b(v, z);
    }

    @l
    public final Layout d() {
        return this.a;
    }

    public final int e() {
        return this.f;
    }

    public final int f(@IntRange(from = 0L) int v) {
        return ((Number)this.b.get(v)).intValue();
    }

    public final int g(@IntRange(from = 0L) int v, boolean z) {
        int v1 = u.y(this.b, v, 0, 0, 6, null);
        int v2 = v1 >= 0 ? v1 + 1 : -(v1 + 1);
        return !z || v2 <= 0 || v != ((Number)this.b.get(v2 - 1)).intValue() ? v2 : v2 - 1;
    }

    public static int h(LayoutHelper layoutHelper0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        return layoutHelper0.g(v, z);
    }

    public final int i(@IntRange(from = 0L) int v) {
        return v == 0 ? 0 : ((Number)this.b.get(v - 1)).intValue();
    }

    public final boolean j(char c) {
        return c == 10 || c == 0x20 || c == 5760 || 0x2000 <= c && c < 0x200B && c != 0x2007 || (c == 0x205F || c == 0x3000);
    }

    public final boolean k(@IntRange(from = 0L) int v) {
        int v1 = this.i(v);
        int v2 = this.a.getLineForOffset(v1);
        return this.a.getParagraphDirection(v2) == -1;
    }

    private final int l(int v) {
        while(v > 0 && this.j(this.a.getText().charAt(v - 1))) {
            --v;
        }
        return v;
    }
}

