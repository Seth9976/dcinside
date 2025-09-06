package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,217:1\n66#2,2:218\n245#2:220\n68#2,2:228\n111#3,7:221\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n195#1:218,2\n206#1:220\n195#1:228,2\n207#1:221,7\n*E\n"})
public abstract class Painter {
    @m
    private Paint a;
    private boolean b;
    @m
    private ColorFilter c;
    private float d;
    @l
    private LayoutDirection e;
    @l
    private final Function1 f;

    public Painter() {
        this.d = 1.0f;
        this.e = LayoutDirection.a;
        this.f = new Function1() {
            final Painter e;

            {
                this.e = painter0;
                super(1);
            }

            public final void a(@l DrawScope drawScope0) {
                L.p(drawScope0, "$this$null");
                this.e.k(drawScope0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((DrawScope)object0));
                return S0.a;
            }
        };
    }

    protected boolean a(float f) {
        return false;
    }

    protected boolean b(@m ColorFilter colorFilter0) {
        return false;
    }

    protected boolean c(@l LayoutDirection layoutDirection0) {
        L.p(layoutDirection0, "layoutDirection");
        return false;
    }

    private final void d(float f) {
        if(this.d != f) {
            if(!this.a(f)) {
                if(f == 1.0f) {
                    Paint paint0 = this.a;
                    if(paint0 != null) {
                        paint0.j(1.0f);
                    }
                    this.b = false;
                }
                else {
                    this.j().j(f);
                    this.b = true;
                }
            }
            this.d = f;
        }
    }

    private final void e(ColorFilter colorFilter0) {
        if(!L.g(this.c, colorFilter0)) {
            if(!this.b(colorFilter0)) {
                if(colorFilter0 == null) {
                    Paint paint0 = this.a;
                    if(paint0 != null) {
                        paint0.z(null);
                    }
                    this.b = false;
                }
                else {
                    this.j().z(colorFilter0);
                    this.b = true;
                }
            }
            this.c = colorFilter0;
        }
    }

    private final void f(LayoutDirection layoutDirection0) {
        if(this.e != layoutDirection0) {
            this.c(layoutDirection0);
            this.e = layoutDirection0;
        }
    }

    public final void g(@l DrawScope drawScope0, long v, float f, @m ColorFilter colorFilter0) {
        L.p(drawScope0, "$this$draw");
        this.d(f);
        this.e(colorFilter0);
        this.f(drawScope0.getLayoutDirection());
        float f1 = Size.t(drawScope0.b()) - Size.t(v);
        float f2 = Size.m(drawScope0.b()) - Size.m(v);
        drawScope0.J0().d().h(0.0f, 0.0f, f1, f2);
        if(f > 0.0f && Size.t(v) > 0.0f && Size.m(v) > 0.0f) {
            if(this.b) {
                Rect rect0 = RectKt.c(0L, SizeKt.a(Size.t(v), Size.m(v)));
                Canvas canvas0 = drawScope0.J0().a();
                Paint paint0 = this.j();
                try {
                    canvas0.m(rect0, paint0);
                    this.k(drawScope0);
                }
                finally {
                    canvas0.v();
                }
            }
            else {
                this.k(drawScope0);
            }
        }
        drawScope0.J0().d().h(-0.0f, -0.0f, -f1, -f2);
    }

    public static void h(Painter painter0, DrawScope drawScope0, long v, float f, ColorFilter colorFilter0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if((v1 & 4) != 0) {
            colorFilter0 = null;
        }
        painter0.g(drawScope0, v, ((v1 & 2) == 0 ? f : 1.0f), colorFilter0);
    }

    public abstract long i();

    private final Paint j() {
        Paint paint0 = this.a;
        if(paint0 == null) {
            paint0 = AndroidPaint_androidKt.a();
            this.a = paint0;
        }
        return paint0;
    }

    protected abstract void k(@l DrawScope arg1);
}

