package androidx.compose.ui.graphics.vector;

import A3.a;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,555:1\n33#2,6:556\n33#2,6:571\n33#2,6:580\n261#3,7:562\n268#3:570\n269#3,3:577\n1#4:569\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n374#1:556,6\n536#1:571,6\n549#1:580,6\n529#1:562,7\n529#1:570\n529#1:577,3\n*E\n"})
public final class GroupComponent extends VNode {
    @m
    private float[] c;
    @l
    private final List d;
    @l
    private List e;
    private boolean f;
    @m
    private Path g;
    @m
    private PathParser h;
    @m
    private a i;
    @l
    private String j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private boolean r;

    public GroupComponent() {
        super(null);
        this.d = new ArrayList();
        this.e = VectorKt.h();
        this.f = true;
        this.j = "";
        this.n = 1.0f;
        this.o = 1.0f;
        this.r = true;
    }

    public final void A(float f) {
        this.q = f;
        this.r = true;
        this.c();
    }

    private final void B() {
        if(this.o()) {
            PathParser pathParser0 = this.h;
            if(pathParser0 == null) {
                pathParser0 = new PathParser();
                this.h = pathParser0;
            }
            else {
                pathParser0.e();
            }
            Path path0 = this.g;
            if(path0 == null) {
                path0 = AndroidPath_androidKt.a();
                this.g = path0;
            }
            else {
                path0.reset();
            }
            pathParser0.b(this.e).D(path0);
        }
    }

    private final void C() {
        float[] arr_f = this.c;
        if(arr_f == null) {
            arr_f = Matrix.c(null, 1, null);
            this.c = arr_f;
        }
        else {
            Matrix.m(arr_f);
        }
        Matrix.x(arr_f, this.l + this.p, this.m + this.q, 0.0f, 4, null);
        Matrix.p(arr_f, this.k);
        Matrix.q(arr_f, this.n, this.o, 1.0f);
        Matrix.x(arr_f, -this.l, -this.m, 0.0f, 4, null);
    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    public void a(@l DrawScope drawScope0) {
        L.p(drawScope0, "<this>");
        if(this.r) {
            this.C();
            this.r = false;
        }
        if(this.f) {
            this.B();
            this.f = false;
        }
        DrawContext drawContext0 = drawScope0.J0();
        long v1 = drawContext0.b();
        drawContext0.a().f();
        DrawTransform drawTransform0 = drawContext0.d();
        float[] arr_f = this.c;
        if(arr_f != null) {
            drawTransform0.d(Matrix.a(arr_f).y());
        }
        Path path0 = this.g;
        if(this.o() && path0 != null) {
            c.c(drawTransform0, path0, 0, 2, null);
        }
        List list0 = this.d;
        int v2 = list0.size();
        for(int v = 0; v < v2; ++v) {
            ((VNode)list0.get(v)).a(drawScope0);
        }
        drawContext0.a().v();
        drawContext0.c(v1);
    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    @m
    public a b() {
        return this.i;
    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    public void d(@m a a0) {
        this.i = a0;
        List list0 = this.d;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((VNode)list0.get(v1)).d(a0);
        }
    }

    @l
    public final List e() {
        return this.e;
    }

    @l
    public final String f() [...] // 潜在的解密器

    public final int g() {
        return this.d.size();
    }

    public final float h() {
        return this.l;
    }

    public final float i() {
        return this.m;
    }

    public final float j() {
        return this.k;
    }

    public final float k() {
        return this.n;
    }

    public final float l() {
        return this.o;
    }

    public final float m() {
        return this.p;
    }

    public final float n() {
        return this.q;
    }

    private final boolean o() {
        return !this.e.isEmpty();
    }

    public final void p(int v, @l VNode vNode0) {
        L.p(vNode0, "instance");
        if(v < this.g()) {
            this.d.set(v, vNode0);
        }
        else {
            this.d.add(vNode0);
        }
        vNode0.d(this.b());
        this.c();
    }

    public final void q(int v, int v1, int v2) {
        int v3 = 0;
        if(v > v1) {
            while(v3 < v2) {
                VNode vNode0 = (VNode)this.d.get(v);
                this.d.remove(v);
                this.d.add(v1, vNode0);
                ++v1;
                ++v3;
            }
        }
        else {
            while(v3 < v2) {
                VNode vNode1 = (VNode)this.d.get(v);
                this.d.remove(v);
                this.d.add(v1 - 1, vNode1);
                ++v3;
            }
        }
        this.c();
    }

    public final void r(int v, int v1) {
        for(int v2 = 0; v2 < v1; ++v2) {
            if(v < this.d.size()) {
                ((VNode)this.d.get(v)).d(null);
                this.d.remove(v);
            }
        }
        this.c();
    }

    public final void s(@l List list0) {
        L.p(list0, "value");
        this.e = list0;
        this.f = true;
        this.c();
    }

    public final void t(@l String s) {
        L.p(s, "value");
        this.j = s;
        this.c();
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("VGroup: ");
        stringBuilder0.append(this.j);
        List list0 = this.d;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            VNode vNode0 = (VNode)list0.get(v1);
            stringBuilder0.append("\t");
            stringBuilder0.append(vNode0.toString());
            stringBuilder0.append("\n");
        }
        String s = stringBuilder0.toString();
        L.o(s, "sb.toString()");
        return s;
    }

    public final void u(float f) {
        this.l = f;
        this.r = true;
        this.c();
    }

    public final void v(float f) {
        this.m = f;
        this.r = true;
        this.c();
    }

    public final void w(float f) {
        this.k = f;
        this.r = true;
        this.c();
    }

    public final void x(float f) {
        this.n = f;
        this.r = true;
        this.c();
    }

    public final void y(float f) {
        this.o = f;
        this.r = true;
        this.c();
    }

    public final void z(float f) {
        this.p = f;
        this.r = true;
        this.c();
    }
}

