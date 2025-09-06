package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidPaint implements Paint {
    @l
    private android.graphics.Paint a;
    private int b;
    @m
    private Shader c;
    @m
    private ColorFilter d;
    @m
    private PathEffect e;

    public AndroidPaint() {
        this(AndroidPaint_androidKt.k());
    }

    public AndroidPaint(@l android.graphics.Paint paint0) {
        L.p(paint0, "internalPaint");
        super();
        this.a = paint0;
        this.b = 3;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int A() {
        return AndroidPaint_androidKt.e(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public long a() {
        return AndroidPaint_androidKt.d(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void b(boolean z) {
        AndroidPaint_androidKt.m(this.a, z);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void c(int v) {
        AndroidPaint_androidKt.t(this.a, v);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void d(int v) {
        AndroidPaint_androidKt.q(this.a, v);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int e() {
        return AndroidPaint_androidKt.f(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void f(int v) {
        AndroidPaint_androidKt.u(this.a, v);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void g(long v) {
        AndroidPaint_androidKt.o(this.a, v);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int h() {
        return AndroidPaint_androidKt.g(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public float i() {
        return AndroidPaint_androidKt.b(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void j(float f) {
        AndroidPaint_androidKt.l(this.a, f);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public float k() {
        return AndroidPaint_androidKt.h(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    @l
    public android.graphics.Paint l() {
        return this.a;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    @m
    public Shader m() {
        return this.c;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void n(float f) {
        AndroidPaint_androidKt.v(this.a, f);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public boolean o() {
        return AndroidPaint_androidKt.c(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void p(int v) {
        AndroidPaint_androidKt.x(this.a, v);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void q(float f) {
        AndroidPaint_androidKt.w(this.a, f);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public float r() {
        return AndroidPaint_androidKt.i(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int s() {
        return AndroidPaint_androidKt.j(this.a);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void t(int v) {
        if(!BlendMode.G(this.b, v)) {
            this.b = v;
            AndroidPaint_androidKt.n(this.a, v);
        }
    }

    @Override  // androidx.compose.ui.graphics.Paint
    @m
    public ColorFilter u() {
        return this.d;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void v(@m PathEffect pathEffect0) {
        AndroidPaint_androidKt.r(this.a, pathEffect0);
        this.e = pathEffect0;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    @m
    public PathEffect w() {
        return this.e;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int x() {
        return this.b;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void y(@m Shader shader0) {
        this.c = shader0;
        AndroidPaint_androidKt.s(this.a, shader0);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void z(@m ColorFilter colorFilter0) {
        this.d = colorFilter0;
        AndroidPaint_androidKt.p(this.a, colorFilter0);
    }
}

