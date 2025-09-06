package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nVertices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,75:1\n101#2,2:76\n33#2,6:78\n103#2:84\n*S KotlinDebug\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n*L\n42#1:76,2\n42#1:78,6\n42#1:84\n*E\n"})
public final class Vertices {
    private final int a;
    @l
    private final float[] b;
    @l
    private final float[] c;
    @l
    private final int[] d;
    @l
    private final short[] e;

    private Vertices(int v, List list0, List list1, List list2, List list3) {
        this.a = v;
        androidx.compose.ui.graphics.Vertices.outOfBounds.1 vertices$outOfBounds$10 = new Function1() {
            final List e;

            {
                this.e = list0;
                super(1);
            }

            @l
            public final Boolean a(int v) {
                return v < 0 || v >= this.e.size();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        if(list1.size() != list0.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if(list2.size() != list0.size()) {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        int v1 = list3.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            if(((Boolean)vertices$outOfBounds$10.invoke(list3.get(v3))).booleanValue()) {
                throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
            }
        }
        this.b = this.b(list0);
        this.c = this.b(list1);
        this.d = this.a(list2);
        int v4 = list3.size();
        short[] arr_v = new short[v4];
        for(int v2 = 0; v2 < v4; ++v2) {
            arr_v[v2] = (short)((Number)list3.get(v2)).intValue();
        }
        this.e = arr_v;
    }

    public Vertices(int v, List list0, List list1, List list2, List list3, w w0) {
        this(v, list0, list1, list2, list3);
    }

    private final int[] a(List list0) {
        int v = list0.size();
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = ColorKt.r(((Color)list0.get(v1)).M());
        }
        return arr_v;
    }

    private final float[] b(List list0) {
        int v = list0.size();
        float[] arr_f = new float[v * 2];
        for(int v1 = 0; v1 < v * 2; ++v1) {
            long v2 = ((Offset)list0.get(v1 / 2)).A();
            arr_f[v1] = v1 % 2 == 0 ? Offset.p(v2) : Offset.r(v2);
        }
        return arr_f;
    }

    @l
    public final int[] c() {
        return this.d;
    }

    @l
    public final short[] d() {
        return this.e;
    }

    @l
    public final float[] e() {
        return this.b;
    }

    @l
    public final float[] f() {
        return this.c;
    }

    public final int g() {
        return this.a;
    }
}

