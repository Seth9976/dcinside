package androidx.compose.ui.draw;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class DrawContentCacheModifier implements DrawCacheModifier {
    @l
    private final CacheDrawScope a;
    @l
    private final Function1 b;

    public DrawContentCacheModifier(@l CacheDrawScope cacheDrawScope0, @l Function1 function10) {
        L.p(cacheDrawScope0, "cacheDrawScope");
        L.p(function10, "onBuildDrawCache");
        super();
        this.a = cacheDrawScope0;
        this.b = function10;
    }

    @Override  // androidx.compose.ui.draw.DrawCacheModifier
    public void D0(@l BuildDrawCacheParams buildDrawCacheParams0) {
        L.p(buildDrawCacheParams0, "params");
        this.a.h(buildDrawCacheParams0);
        this.a.k(null);
        this.b.invoke(this.a);
        if(this.a.e() == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?");
        }
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return b.b(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, o o0) {
        return b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, o o0) {
        return b.d(this, object0, o0);
    }

    @l
    public final CacheDrawScope a() {
        return this.a;
    }

    @l
    public final Function1 b() {
        return this.b;
    }

    @l
    public final DrawContentCacheModifier d(@l CacheDrawScope cacheDrawScope0, @l Function1 function10) {
        L.p(cacheDrawScope0, "cacheDrawScope");
        L.p(function10, "onBuildDrawCache");
        return new DrawContentCacheModifier(cacheDrawScope0, function10);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DrawContentCacheModifier)) {
            return false;
        }
        return L.g(this.a, ((DrawContentCacheModifier)object0).a) ? L.g(this.b, ((DrawContentCacheModifier)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    public static DrawContentCacheModifier i(DrawContentCacheModifier drawContentCacheModifier0, CacheDrawScope cacheDrawScope0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            cacheDrawScope0 = drawContentCacheModifier0.a;
        }
        if((v & 2) != 0) {
            function10 = drawContentCacheModifier0.b;
        }
        return drawContentCacheModifier0.d(cacheDrawScope0, function10);
    }

    @l
    public final CacheDrawScope j() {
        return this.a;
    }

    @l
    public final Function1 l() {
        return this.b;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override
    @l
    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.a + ", onBuildDrawCache=" + this.b + ')';
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }

    @Override  // androidx.compose.ui.draw.DrawModifier
    public void v(@l ContentDrawScope contentDrawScope0) {
        L.p(contentDrawScope0, "<this>");
        DrawResult drawResult0 = this.a.e();
        L.m(drawResult0);
        drawResult0.a().invoke(contentDrawScope0);
    }
}

