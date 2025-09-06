package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"ViewConstructor"})
class GhostViewPort extends ViewGroup implements GhostView {
    ViewGroup a;
    View b;
    final View c;
    int d;
    @Nullable
    private Matrix e;
    private final ViewTreeObserver.OnPreDrawListener f;

    GhostViewPort(View view0) {
        super(view0.getContext());
        this.f = new ViewTreeObserver.OnPreDrawListener() {
            final GhostViewPort a;

            @Override  // android.view.ViewTreeObserver$OnPreDrawListener
            public boolean onPreDraw() {
                GhostViewPort.this.postInvalidateOnAnimation();
                GhostViewPort ghostViewPort0 = GhostViewPort.this;
                ViewGroup viewGroup0 = ghostViewPort0.a;
                if(viewGroup0 != null) {
                    View view0 = ghostViewPort0.b;
                    if(view0 != null) {
                        viewGroup0.endViewTransition(view0);
                        GhostViewPort.this.a.postInvalidateOnAnimation();
                        GhostViewPort.this.a = null;
                        GhostViewPort.this.b = null;
                    }
                }
                return true;
            }
        };
        this.c = view0;
        this.setWillNotDraw(false);
        this.setClipChildren(false);
        this.setLayerType(2, null);
    }

    @Override  // androidx.transition.GhostView
    public void a(ViewGroup viewGroup0, View view0) {
        this.a = viewGroup0;
        this.b = view0;
    }

    static GhostViewPort b(View view0, ViewGroup viewGroup0, Matrix matrix0) {
        int v;
        if(!(view0.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        GhostViewHolder ghostViewHolder0 = GhostViewHolder.b(viewGroup0);
        GhostViewPort ghostViewPort0 = GhostViewPort.e(view0);
        if(ghostViewPort0 == null) {
            v = 0;
        }
        else {
            GhostViewHolder ghostViewHolder1 = (GhostViewHolder)ghostViewPort0.getParent();
            if(ghostViewHolder1 == ghostViewHolder0) {
                v = 0;
            }
            else {
                v = ghostViewPort0.d;
                ghostViewHolder1.removeView(ghostViewPort0);
                ghostViewPort0 = null;
            }
        }
        if(ghostViewPort0 == null) {
            if(matrix0 == null) {
                matrix0 = new Matrix();
                GhostViewPort.c(view0, viewGroup0, matrix0);
            }
            ghostViewPort0 = new GhostViewPort(view0);
            ghostViewPort0.h(matrix0);
            if(ghostViewHolder0 == null) {
                ghostViewHolder0 = new GhostViewHolder(viewGroup0);
            }
            else {
                ghostViewHolder0.g();
            }
            GhostViewPort.d(viewGroup0, ghostViewHolder0);
            GhostViewPort.d(viewGroup0, ghostViewPort0);
            ghostViewHolder0.a(ghostViewPort0);
            ghostViewPort0.d = v;
        }
        else if(matrix0 != null) {
            ghostViewPort0.h(matrix0);
        }
        ++ghostViewPort0.d;
        return ghostViewPort0;
    }

    static void c(View view0, ViewGroup viewGroup0, Matrix matrix0) {
        ViewGroup viewGroup1 = (ViewGroup)view0.getParent();
        matrix0.reset();
        ViewUtils.h(viewGroup1, matrix0);
        matrix0.preTranslate(((float)(-viewGroup1.getScrollX())), ((float)(-viewGroup1.getScrollY())));
        ViewUtils.i(viewGroup0, matrix0);
    }

    static void d(View view0, View view1) {
        ViewUtils.e(view1, view1.getLeft(), view1.getTop(), view1.getLeft() + view0.getWidth(), view1.getTop() + view0.getHeight());
    }

    static GhostViewPort e(View view0) {
        return (GhostViewPort)view0.getTag(id.ghost_view);
    }

    static void f(View view0) {
        GhostViewPort ghostViewPort0 = GhostViewPort.e(view0);
        if(ghostViewPort0 != null) {
            int v = ghostViewPort0.d - 1;
            ghostViewPort0.d = v;
            if(v <= 0) {
                ((GhostViewHolder)ghostViewPort0.getParent()).removeView(ghostViewPort0);
            }
        }
    }

    static void g(@NonNull View view0, @Nullable GhostViewPort ghostViewPort0) {
        view0.setTag(id.ghost_view, ghostViewPort0);
    }

    void h(@NonNull Matrix matrix0) {
        this.e = matrix0;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        GhostViewPort.g(this.c, this);
        this.c.getViewTreeObserver().addOnPreDrawListener(this.f);
        ViewUtils.g(this.c, 4);
        if(this.c.getParent() != null) {
            ((View)this.c.getParent()).invalidate();
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        this.c.getViewTreeObserver().removeOnPreDrawListener(this.f);
        ViewUtils.g(this.c, 0);
        GhostViewPort.g(this.c, null);
        if(this.c.getParent() != null) {
            ((View)this.c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    protected void onDraw(@NonNull Canvas canvas0) {
        CanvasUtils.a(canvas0, true);
        canvas0.setMatrix(this.e);
        ViewUtils.g(this.c, 0);
        this.c.invalidate();
        ViewUtils.g(this.c, 4);
        long v = this.getDrawingTime();
        this.drawChild(canvas0, this.c, v);
        CanvasUtils.a(canvas0, false);
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    @Override  // androidx.transition.GhostView, android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        if(GhostViewPort.e(this.c) == this) {
            ViewUtils.g(this.c, (v == 0 ? 4 : 0));
        }
    }
}

