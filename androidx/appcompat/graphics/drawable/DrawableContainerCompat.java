package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.DrawableCompat;

public class DrawableContainerCompat extends Drawable implements Drawable.Callback {
    @RequiresApi(21)
    static class Api21Impl {
        public static boolean a(Drawable.ConstantState drawable$ConstantState0) {
            return drawable$ConstantState0.canApplyTheme();
        }

        public static void b(Drawable drawable0, Outline outline0) {
            drawable0.getOutline(outline0);
        }

        public static Resources c(Resources.Theme resources$Theme0) {
            return resources$Theme0.getResources();
        }
    }

    static class BlockInvalidateCallback implements Drawable.Callback {
        private Drawable.Callback a;

        public Drawable.Callback a() {
            Drawable.Callback drawable$Callback0 = this.a;
            this.a = null;
            return drawable$Callback0;
        }

        public BlockInvalidateCallback b(Drawable.Callback drawable$Callback0) {
            this.a = drawable$Callback0;
            return this;
        }

        @Override  // android.graphics.drawable.Drawable$Callback
        public void invalidateDrawable(@NonNull Drawable drawable0) {
        }

        @Override  // android.graphics.drawable.Drawable$Callback
        public void scheduleDrawable(@NonNull Drawable drawable0, @NonNull Runnable runnable0, long v) {
            Drawable.Callback drawable$Callback0 = this.a;
            if(drawable$Callback0 != null) {
                drawable$Callback0.scheduleDrawable(drawable0, runnable0, v);
            }
        }

        @Override  // android.graphics.drawable.Drawable$Callback
        public void unscheduleDrawable(@NonNull Drawable drawable0, @NonNull Runnable runnable0) {
            Drawable.Callback drawable$Callback0 = this.a;
            if(drawable$Callback0 != null) {
                drawable$Callback0.unscheduleDrawable(drawable0, runnable0);
            }
        }
    }

    static abstract class DrawableContainerState extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;
        final DrawableContainerCompat a;
        Resources b;
        int c;
        int d;
        int e;
        SparseArray f;
        Drawable[] g;
        int h;
        boolean i;
        boolean j;
        Rect k;
        boolean l;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;

        DrawableContainerState(DrawableContainerState drawableContainerCompat$DrawableContainerState0, DrawableContainerCompat drawableContainerCompat0, Resources resources0) {
            Resources resources1;
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = drawableContainerCompat0;
            Rect rect0 = null;
            if(resources0 == null) {
                resources1 = drawableContainerCompat$DrawableContainerState0 == null ? null : drawableContainerCompat$DrawableContainerState0.b;
            }
            else {
                resources1 = resources0;
            }
            this.b = resources1;
            int v1 = DrawableContainerCompat.g(resources0, (drawableContainerCompat$DrawableContainerState0 == null ? 0 : drawableContainerCompat$DrawableContainerState0.c));
            this.c = v1;
            if(drawableContainerCompat$DrawableContainerState0 != null) {
                this.d = drawableContainerCompat$DrawableContainerState0.d;
                this.e = drawableContainerCompat$DrawableContainerState0.e;
                this.v = true;
                this.w = true;
                this.i = drawableContainerCompat$DrawableContainerState0.i;
                this.l = drawableContainerCompat$DrawableContainerState0.l;
                this.x = drawableContainerCompat$DrawableContainerState0.x;
                this.y = drawableContainerCompat$DrawableContainerState0.y;
                this.z = drawableContainerCompat$DrawableContainerState0.z;
                this.A = drawableContainerCompat$DrawableContainerState0.A;
                this.B = drawableContainerCompat$DrawableContainerState0.B;
                this.C = drawableContainerCompat$DrawableContainerState0.C;
                this.D = drawableContainerCompat$DrawableContainerState0.D;
                this.E = drawableContainerCompat$DrawableContainerState0.E;
                this.F = drawableContainerCompat$DrawableContainerState0.F;
                this.G = drawableContainerCompat$DrawableContainerState0.G;
                this.H = drawableContainerCompat$DrawableContainerState0.H;
                this.I = drawableContainerCompat$DrawableContainerState0.I;
                if(drawableContainerCompat$DrawableContainerState0.c == v1) {
                    if(drawableContainerCompat$DrawableContainerState0.j) {
                        if(drawableContainerCompat$DrawableContainerState0.k != null) {
                            rect0 = new Rect(drawableContainerCompat$DrawableContainerState0.k);
                        }
                        this.k = rect0;
                        this.j = true;
                    }
                    if(drawableContainerCompat$DrawableContainerState0.m) {
                        this.n = drawableContainerCompat$DrawableContainerState0.n;
                        this.o = drawableContainerCompat$DrawableContainerState0.o;
                        this.p = drawableContainerCompat$DrawableContainerState0.p;
                        this.q = drawableContainerCompat$DrawableContainerState0.q;
                        this.m = true;
                    }
                }
                if(drawableContainerCompat$DrawableContainerState0.r) {
                    this.s = drawableContainerCompat$DrawableContainerState0.s;
                    this.r = true;
                }
                if(drawableContainerCompat$DrawableContainerState0.t) {
                    this.u = drawableContainerCompat$DrawableContainerState0.u;
                    this.t = true;
                }
                Drawable[] arr_drawable = drawableContainerCompat$DrawableContainerState0.g;
                this.g = new Drawable[arr_drawable.length];
                this.h = drawableContainerCompat$DrawableContainerState0.h;
                SparseArray sparseArray0 = drawableContainerCompat$DrawableContainerState0.f;
                this.f = sparseArray0 == null ? new SparseArray(this.h) : sparseArray0.clone();
                int v2 = this.h;
                for(int v = 0; v < v2; ++v) {
                    Drawable drawable0 = arr_drawable[v];
                    if(drawable0 != null) {
                        Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
                        if(drawable$ConstantState0 == null) {
                            this.g[v] = arr_drawable[v];
                        }
                        else {
                            this.f.put(v, drawable$ConstantState0);
                        }
                    }
                }
                return;
            }
            this.g = new Drawable[10];
            this.h = 0;
        }

        final boolean A(int v, int v1) {
            int v2 = this.h;
            Drawable[] arr_drawable = this.g;
            boolean z = false;
            for(int v3 = 0; v3 < v2; ++v3) {
                Drawable drawable0 = arr_drawable[v3];
                if(drawable0 != null) {
                    boolean z1 = Build.VERSION.SDK_INT < 23 ? false : DrawableCompat.m(drawable0, v);
                    if(v3 == v1) {
                        z = z1;
                    }
                }
            }
            this.z = v;
            return z;
        }

        public final void B(boolean z) {
            this.i = z;
        }

        final void C(Resources resources0) {
            if(resources0 != null) {
                this.b = resources0;
                int v = DrawableContainerCompat.g(resources0, this.c);
                int v1 = this.c;
                this.c = v;
                if(v1 != v) {
                    this.m = false;
                    this.j = false;
                }
            }
        }

        public final int a(Drawable drawable0) {
            int v = this.h;
            if(v >= this.g.length) {
                this.r(v, v + 10);
            }
            drawable0.mutate();
            drawable0.setVisible(false, true);
            drawable0.setCallback(this.a);
            this.g[v] = drawable0;
            ++this.h;
            int v1 = this.e;
            this.e = drawable0.getChangingConfigurations() | v1;
            this.s();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return v;
        }

        @RequiresApi(21)
        final void b(Resources.Theme resources$Theme0) {
            if(resources$Theme0 != null) {
                this.f();
                int v = this.h;
                Drawable[] arr_drawable = this.g;
                for(int v1 = 0; v1 < v; ++v1) {
                    Drawable drawable0 = arr_drawable[v1];
                    if(drawable0 != null && DrawableCompat.b(drawable0)) {
                        DrawableCompat.a(arr_drawable[v1], resources$Theme0);
                        this.e |= arr_drawable[v1].getChangingConfigurations();
                    }
                }
                this.C(Api21Impl.c(resources$Theme0));
            }
        }

        public boolean c() {
            if(this.v) {
                return this.w;
            }
            this.f();
            this.v = true;
            int v = this.h;
            Drawable[] arr_drawable = this.g;
            for(int v1 = 0; v1 < v; ++v1) {
                if(arr_drawable[v1].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        @RequiresApi(21)
        public boolean canApplyTheme() {
            int v = this.h;
            Drawable[] arr_drawable = this.g;
            for(int v1 = 0; v1 < v; ++v1) {
                Drawable drawable0 = arr_drawable[v1];
                if(drawable0 == null) {
                    Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)this.f.get(v1);
                    if(drawable$ConstantState0 != null && Api21Impl.a(drawable$ConstantState0)) {
                        return true;
                    }
                }
                else if(DrawableCompat.b(drawable0)) {
                    return true;
                }
            }
            return false;
        }

        final void d() {
            this.y = false;
        }

        protected void e() {
            this.m = true;
            this.f();
            int v = this.h;
            Drawable[] arr_drawable = this.g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                Drawable drawable0 = arr_drawable[v1];
                int v2 = drawable0.getIntrinsicWidth();
                if(v2 > this.n) {
                    this.n = v2;
                }
                int v3 = drawable0.getIntrinsicHeight();
                if(v3 > this.o) {
                    this.o = v3;
                }
                int v4 = drawable0.getMinimumWidth();
                if(v4 > this.p) {
                    this.p = v4;
                }
                int v5 = drawable0.getMinimumHeight();
                if(v5 > this.q) {
                    this.q = v5;
                }
            }
        }

        private void f() {
            SparseArray sparseArray0 = this.f;
            if(sparseArray0 != null) {
                int v = sparseArray0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    int v2 = this.f.keyAt(v1);
                    Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)this.f.valueAt(v1);
                    Drawable[] arr_drawable = this.g;
                    arr_drawable[v2] = this.w(drawable$ConstantState0.newDrawable(this.b));
                }
                this.f = null;
            }
        }

        final int g() {
            return this.g.length;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return this.d | this.e;
        }

        public final Drawable h(int v) {
            Drawable drawable0 = this.g[v];
            if(drawable0 != null) {
                return drawable0;
            }
            SparseArray sparseArray0 = this.f;
            if(sparseArray0 != null) {
                int v1 = sparseArray0.indexOfKey(v);
                if(v1 >= 0) {
                    Drawable drawable1 = this.w(((Drawable.ConstantState)this.f.valueAt(v1)).newDrawable(this.b));
                    this.g[v] = drawable1;
                    this.f.removeAt(v1);
                    if(this.f.size() == 0) {
                        this.f = null;
                    }
                    return drawable1;
                }
            }
            return null;
        }

        public final int i() {
            return this.h;
        }

        public final int j() {
            if(!this.m) {
                this.e();
            }
            return this.o;
        }

        public final int k() {
            if(!this.m) {
                this.e();
            }
            return this.q;
        }

        public final int l() {
            if(!this.m) {
                this.e();
            }
            return this.p;
        }

        public final Rect m() {
            Rect rect0 = null;
            if(this.i) {
                return null;
            }
            Rect rect1 = this.k;
            if(rect1 == null && !this.j) {
                this.f();
                Rect rect2 = new Rect();
                int v = this.h;
                Drawable[] arr_drawable = this.g;
                for(int v1 = 0; v1 < v; ++v1) {
                    if(arr_drawable[v1].getPadding(rect2)) {
                        if(rect0 == null) {
                            rect0 = new Rect(0, 0, 0, 0);
                        }
                        int v2 = rect2.left;
                        if(v2 > rect0.left) {
                            rect0.left = v2;
                        }
                        int v3 = rect2.top;
                        if(v3 > rect0.top) {
                            rect0.top = v3;
                        }
                        int v4 = rect2.right;
                        if(v4 > rect0.right) {
                            rect0.right = v4;
                        }
                        int v5 = rect2.bottom;
                        if(v5 > rect0.bottom) {
                            rect0.bottom = v5;
                        }
                    }
                }
                this.j = true;
                this.k = rect0;
                return rect0;
            }
            return rect1;
        }

        public final int n() {
            if(!this.m) {
                this.e();
            }
            return this.n;
        }

        public final int o() {
            return this.A;
        }

        public final int p() {
            return this.B;
        }

        public final int q() {
            if(this.r) {
                return this.s;
            }
            this.f();
            int v = this.h;
            Drawable[] arr_drawable = this.g;
            int v1 = v <= 0 ? -2 : arr_drawable[0].getOpacity();
            for(int v2 = 1; v2 < v; ++v2) {
                v1 = Drawable.resolveOpacity(v1, arr_drawable[v2].getOpacity());
            }
            this.s = v1;
            this.r = true;
            return v1;
        }

        public void r(int v, int v1) {
            Drawable[] arr_drawable = new Drawable[v1];
            Drawable[] arr_drawable1 = this.g;
            if(arr_drawable1 != null) {
                System.arraycopy(arr_drawable1, 0, arr_drawable, 0, v);
            }
            this.g = arr_drawable;
        }

        void s() {
            this.r = false;
            this.t = false;
        }

        public final boolean t() {
            return this.l;
        }

        public final boolean u() {
            if(this.t) {
                return this.u;
            }
            this.f();
            int v = this.h;
            Drawable[] arr_drawable = this.g;
            boolean z = false;
            for(int v1 = 0; v1 < v; ++v1) {
                if(arr_drawable[v1].isStateful()) {
                    z = true;
                    break;
                }
            }
            this.u = z;
            this.t = true;
            return z;
        }

        void v() {
            int v = this.h;
            Drawable[] arr_drawable = this.g;
            for(int v1 = 0; v1 < v; ++v1) {
                Drawable drawable0 = arr_drawable[v1];
                if(drawable0 != null) {
                    drawable0.mutate();
                }
            }
            this.y = true;
        }

        private Drawable w(Drawable drawable0) {
            if(Build.VERSION.SDK_INT >= 23) {
                DrawableCompat.m(drawable0, this.z);
            }
            Drawable drawable1 = drawable0.mutate();
            drawable1.setCallback(this.a);
            return drawable1;
        }

        public final void x(boolean z) {
            this.l = z;
        }

        public final void y(int v) {
            this.A = v;
        }

        public final void z(int v) {
            this.B = v;
        }
    }

    private DrawableContainerState a;
    private Rect b;
    private Drawable c;
    private Drawable d;
    private int e;
    private boolean f;
    private int g;
    private boolean h;
    private Runnable i;
    private long j;
    private long k;
    private BlockInvalidateCallback l;
    private static final boolean m = false;
    private static final String n = "DrawableContainerCompat";
    private static final boolean o = true;

    public DrawableContainerCompat() {
        this.e = 0xFF;
        this.g = -1;
    }

    void a(boolean z) {
        int v3;
        int v = 1;
        this.f = true;
        long v1 = SystemClock.uptimeMillis();
        Drawable drawable0 = this.c;
        if(drawable0 == null) {
            this.j = 0L;
            v3 = 0;
        }
        else {
            long v2 = this.j;
            if(v2 == 0L) {
                v3 = 0;
            }
            else if(v2 <= v1) {
                drawable0.setAlpha(this.e);
                this.j = 0L;
                v3 = 0;
            }
            else {
                drawable0.setAlpha((0xFF - ((int)((v2 - v1) * 0xFFL)) / this.a.A) * this.e / 0xFF);
                v3 = 1;
            }
        }
        Drawable drawable1 = this.d;
        if(drawable1 == null) {
            this.k = 0L;
            v = v3;
        }
        else {
            long v4 = this.k;
            if(v4 == 0L) {
                v = v3;
            }
            else if(v4 <= v1) {
                drawable1.setVisible(false, false);
                this.d = null;
                this.k = 0L;
                v = v3;
            }
            else {
                drawable1.setAlpha(((int)((v4 - v1) * 0xFFL)) / this.a.B * this.e / 0xFF);
            }
        }
        if(z && v != 0) {
            this.scheduleSelf(this.i, v1 + 16L);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme resources$Theme0) {
        this.a.b(resources$Theme0);
    }

    void b() {
        this.a.d();
        this.h = false;
    }

    DrawableContainerState c() {
        return this.a;
    }

    @Override  // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    int d() {
        return this.g;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        Drawable drawable0 = this.c;
        if(drawable0 != null) {
            drawable0.draw(canvas0);
        }
        Drawable drawable1 = this.d;
        if(drawable1 != null) {
            drawable1.draw(canvas0);
        }
    }

    private void e(Drawable drawable0) {
        if(this.l == null) {
            this.l = new BlockInvalidateCallback();
        }
        drawable0.setCallback(this.l.b(drawable0.getCallback()));
        try {
            if(this.a.A <= 0 && this.f) {
                drawable0.setAlpha(this.e);
            }
            DrawableContainerState drawableContainerCompat$DrawableContainerState0 = this.a;
            if(drawableContainerCompat$DrawableContainerState0.E) {
                drawable0.setColorFilter(drawableContainerCompat$DrawableContainerState0.D);
            }
            else {
                if(drawableContainerCompat$DrawableContainerState0.H) {
                    DrawableCompat.o(drawable0, drawableContainerCompat$DrawableContainerState0.F);
                }
                DrawableContainerState drawableContainerCompat$DrawableContainerState1 = this.a;
                if(drawableContainerCompat$DrawableContainerState1.I) {
                    DrawableCompat.p(drawable0, drawableContainerCompat$DrawableContainerState1.G);
                }
            }
            drawable0.setVisible(this.isVisible(), true);
            drawable0.setDither(this.a.x);
            drawable0.setState(this.getState());
            drawable0.setLevel(this.getLevel());
            drawable0.setBounds(this.getBounds());
            if(Build.VERSION.SDK_INT >= 23) {
                DrawableCompat.m(drawable0, DrawableCompat.f(this));
            }
            DrawableCompat.j(drawable0, this.a.C);
            Rect rect0 = this.b;
            if(rect0 != null) {
                DrawableCompat.l(drawable0, rect0.left, rect0.top, rect0.right, rect0.bottom);
            }
        }
        finally {
            drawable0.setCallback(this.l.a());
        }
    }

    private boolean f() {
        return this.isAutoMirrored() && DrawableCompat.f(this) == 1;
    }

    static int g(@Nullable Resources resources0, int v) {
        if(resources0 != null) {
            v = resources0.getDisplayMetrics().densityDpi;
        }
        return v == 0 ? 0xA0 : v;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if(this.a.c()) {
            DrawableContainerState drawableContainerCompat$DrawableContainerState0 = this.a;
            drawableContainerCompat$DrawableContainerState0.d = this.getChangingConfigurations();
            return this.a;
        }
        return null;
    }

    @Override  // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.c;
    }

    @Override  // android.graphics.drawable.Drawable
    public void getHotspotBounds(@NonNull Rect rect0) {
        Rect rect1 = this.b;
        if(rect1 != null) {
            rect0.set(rect1);
            return;
        }
        super.getHotspotBounds(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if(this.a.t()) {
            return this.a.j();
        }
        return this.c == null ? -1 : this.c.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if(this.a.t()) {
            return this.a.n();
        }
        return this.c == null ? -1 : this.c.getIntrinsicWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if(this.a.t()) {
            return this.a.k();
        }
        return this.c == null ? 0 : this.c.getMinimumHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if(this.a.t()) {
            return this.a.l();
        }
        return this.c == null ? 0 : this.c.getMinimumWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.c == null || !this.c.isVisible() ? -2 : this.a.q();
    }

    @Override  // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void getOutline(@NonNull Outline outline0) {
        Drawable drawable0 = this.c;
        if(drawable0 != null) {
            Api21Impl.b(drawable0, outline0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect0) {
        boolean z;
        Rect rect1 = this.a.m();
        if(rect1 == null) {
            Drawable drawable0 = this.c;
            z = drawable0 == null ? super.getPadding(rect0) : drawable0.getPadding(rect0);
        }
        else {
            rect0.set(rect1);
            z = (rect1.right | (rect1.left | rect1.top | rect1.bottom)) == 0 ? false : true;
        }
        if(this.f()) {
            int v = rect0.left;
            rect0.left = rect0.right;
            rect0.right = v;
        }
        return z;
    }

    boolean h(int v) {
        if(v == this.g) {
            return false;
        }
        long v1 = SystemClock.uptimeMillis();
        if(this.a.B > 0) {
            Drawable drawable0 = this.d;
            if(drawable0 != null) {
                drawable0.setVisible(false, false);
            }
            Drawable drawable1 = this.c;
            if(drawable1 == null) {
                this.d = null;
                this.k = 0L;
            }
            else {
                this.d = drawable1;
                this.k = ((long)this.a.B) + v1;
            }
        }
        else {
            Drawable drawable2 = this.c;
            if(drawable2 != null) {
                drawable2.setVisible(false, false);
            }
        }
        if(v >= 0) {
            DrawableContainerState drawableContainerCompat$DrawableContainerState0 = this.a;
            if(v < drawableContainerCompat$DrawableContainerState0.h) {
                Drawable drawable3 = drawableContainerCompat$DrawableContainerState0.h(v);
                this.c = drawable3;
                this.g = v;
                if(drawable3 != null) {
                    int v2 = this.a.A;
                    if(v2 > 0) {
                        this.j = v1 + ((long)v2);
                    }
                    this.e(drawable3);
                }
            }
            else {
                this.c = null;
                this.g = -1;
            }
        }
        else {
            this.c = null;
            this.g = -1;
        }
        if(this.j != 0L || this.k != 0L) {
            Runnable runnable0 = this.i;
            if(runnable0 == null) {
                this.i = new Runnable() {
                    final DrawableContainerCompat a;

                    @Override
                    public void run() {
                        DrawableContainerCompat.this.a(true);
                        DrawableContainerCompat.this.invalidateSelf();
                    }
                };
            }
            else {
                this.unscheduleSelf(runnable0);
            }
            this.a(true);
        }
        this.invalidateSelf();
        return true;
    }

    void i(DrawableContainerState drawableContainerCompat$DrawableContainerState0) {
        this.a = drawableContainerCompat$DrawableContainerState0;
        int v = this.g;
        if(v >= 0) {
            Drawable drawable0 = drawableContainerCompat$DrawableContainerState0.h(v);
            this.c = drawable0;
            if(drawable0 != null) {
                this.e(drawable0);
            }
        }
        this.d = null;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void invalidateDrawable(@NonNull Drawable drawable0) {
        DrawableContainerState drawableContainerCompat$DrawableContainerState0 = this.a;
        if(drawableContainerCompat$DrawableContainerState0 != null) {
            drawableContainerCompat$DrawableContainerState0.s();
        }
        if(drawable0 == this.c && this.getCallback() != null) {
            this.getCallback().invalidateDrawable(this);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.a.C;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.a.u();
    }

    void j(int v) {
        this.h(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        int v1;
        Drawable drawable0 = this.d;
        int v = 1;
        if(drawable0 == null) {
            v1 = 0;
        }
        else {
            drawable0.jumpToCurrentState();
            this.d = null;
            v1 = 1;
        }
        Drawable drawable1 = this.c;
        if(drawable1 != null) {
            drawable1.jumpToCurrentState();
            if(this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if(this.k != 0L) {
            this.k = 0L;
            v1 = 1;
        }
        if(this.j == 0L) {
            v = v1;
        }
        else {
            this.j = 0L;
        }
        if(v != 0) {
            this.invalidateSelf();
        }
    }

    public void k(int v) {
        this.a.A = v;
    }

    public void l(int v) {
        this.a.B = v;
    }

    final void m(Resources resources0) {
        this.a.C(resources0);
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if(!this.h && super.mutate() == this) {
            DrawableContainerState drawableContainerCompat$DrawableContainerState0 = this.c();
            drawableContainerCompat$DrawableContainerState0.v();
            this.i(drawableContainerCompat$DrawableContainerState0);
            this.h = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.d;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
        }
        Drawable drawable1 = this.c;
        if(drawable1 != null) {
            drawable1.setBounds(rect0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int v) {
        return this.a.A(v, this.d());
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int v) {
        Drawable drawable0 = this.d;
        if(drawable0 != null) {
            return drawable0.setLevel(v);
        }
        return this.c == null ? false : this.c.setLevel(v);
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(@NonNull int[] arr_v) {
        Drawable drawable0 = this.d;
        if(drawable0 != null) {
            return drawable0.setState(arr_v);
        }
        return this.c == null ? false : this.c.setState(arr_v);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void scheduleDrawable(@NonNull Drawable drawable0, @NonNull Runnable runnable0, long v) {
        if(drawable0 == this.c && this.getCallback() != null) {
            this.getCallback().scheduleDrawable(this, runnable0, v);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        if(!this.f || this.e != v) {
            this.f = true;
            this.e = v;
            Drawable drawable0 = this.c;
            if(drawable0 != null) {
                if(this.j == 0L) {
                    drawable0.setAlpha(v);
                    return;
                }
                this.a(false);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        DrawableContainerState drawableContainerCompat$DrawableContainerState0 = this.a;
        if(drawableContainerCompat$DrawableContainerState0.C != z) {
            drawableContainerCompat$DrawableContainerState0.C = z;
            Drawable drawable0 = this.c;
            if(drawable0 != null) {
                DrawableCompat.j(drawable0, z);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        DrawableContainerState drawableContainerCompat$DrawableContainerState0 = this.a;
        drawableContainerCompat$DrawableContainerState0.E = true;
        if(drawableContainerCompat$DrawableContainerState0.D != colorFilter0) {
            drawableContainerCompat$DrawableContainerState0.D = colorFilter0;
            Drawable drawable0 = this.c;
            if(drawable0 != null) {
                drawable0.setColorFilter(colorFilter0);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        DrawableContainerState drawableContainerCompat$DrawableContainerState0 = this.a;
        if(drawableContainerCompat$DrawableContainerState0.x != z) {
            drawableContainerCompat$DrawableContainerState0.x = z;
            Drawable drawable0 = this.c;
            if(drawable0 != null) {
                drawable0.setDither(z);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f1) {
        Drawable drawable0 = this.c;
        if(drawable0 != null) {
            DrawableCompat.k(drawable0, f, f1);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setHotspotBounds(int v, int v1, int v2, int v3) {
        Rect rect0 = this.b;
        if(rect0 == null) {
            this.b = new Rect(v, v1, v2, v3);
        }
        else {
            rect0.set(v, v1, v2, v3);
        }
        Drawable drawable0 = this.c;
        if(drawable0 != null) {
            DrawableCompat.l(drawable0, v, v1, v2, v3);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTint(@ColorInt int v) {
        this.setTintList(ColorStateList.valueOf(v));
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList0) {
        DrawableContainerState drawableContainerCompat$DrawableContainerState0 = this.a;
        drawableContainerCompat$DrawableContainerState0.H = true;
        if(drawableContainerCompat$DrawableContainerState0.F != colorStateList0) {
            drawableContainerCompat$DrawableContainerState0.F = colorStateList0;
            DrawableCompat.o(this.c, colorStateList0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode porterDuff$Mode0) {
        DrawableContainerState drawableContainerCompat$DrawableContainerState0 = this.a;
        drawableContainerCompat$DrawableContainerState0.I = true;
        if(drawableContainerCompat$DrawableContainerState0.G != porterDuff$Mode0) {
            drawableContainerCompat$DrawableContainerState0.G = porterDuff$Mode0;
            DrawableCompat.p(this.c, porterDuff$Mode0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        Drawable drawable0 = this.d;
        if(drawable0 != null) {
            drawable0.setVisible(z, z1);
        }
        Drawable drawable1 = this.c;
        if(drawable1 != null) {
            drawable1.setVisible(z, z1);
        }
        return z2;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void unscheduleDrawable(@NonNull Drawable drawable0, @NonNull Runnable runnable0) {
        if(drawable0 == this.c && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable(this, runnable0);
        }
    }
}

