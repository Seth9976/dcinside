package androidx.recyclerview.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R.dimen;
import java.util.ArrayList;
import java.util.List;

public class ItemTouchHelper extends ItemDecoration implements OnChildAttachStateChangeListener {
    public static abstract class Callback {
        private int a;
        public static final int b = 200;
        public static final int c = 0xFA;
        static final int d = 0x303030;
        private static final int e = 0xC0C0C;
        private static final Interpolator f = null;
        private static final Interpolator g = null;
        private static final long h = 2000L;

        static {
            Callback.f = new Interpolator() {
                @Override  // android.animation.TimeInterpolator
                public float getInterpolation(float f) {
                    return f * f * f * f * f;
                }
            };
            Callback.g = new Interpolator() {
                @Override  // android.animation.TimeInterpolator
                public float getInterpolation(float f) {
                    return (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) + 1.0f;
                }
            };
        }

        public Callback() {
            this.a = -1;
        }

        public abstract boolean A(@NonNull RecyclerView arg1, @NonNull ViewHolder arg2, @NonNull ViewHolder arg3);

        public void B(@NonNull RecyclerView recyclerView0, @NonNull ViewHolder recyclerView$ViewHolder0, int v, @NonNull ViewHolder recyclerView$ViewHolder1, int v1, int v2, int v3) {
            LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
            if(recyclerView$LayoutManager0 instanceof ViewDropHandler) {
                ((ViewDropHandler)recyclerView$LayoutManager0).o(recyclerView$ViewHolder0.itemView, recyclerView$ViewHolder1.itemView, v2, v3);
                return;
            }
            if(recyclerView$LayoutManager0.G()) {
                if(recyclerView$LayoutManager0.r0(recyclerView$ViewHolder1.itemView) <= recyclerView0.getPaddingLeft()) {
                    recyclerView0.scrollToPosition(v1);
                }
                if(recyclerView$LayoutManager0.u0(recyclerView$ViewHolder1.itemView) >= recyclerView0.getWidth() - recyclerView0.getPaddingRight()) {
                    recyclerView0.scrollToPosition(v1);
                }
            }
            if(recyclerView$LayoutManager0.H()) {
                if(recyclerView$LayoutManager0.v0(recyclerView$ViewHolder1.itemView) <= recyclerView0.getPaddingTop()) {
                    recyclerView0.scrollToPosition(v1);
                }
                if(recyclerView$LayoutManager0.p0(recyclerView$ViewHolder1.itemView) >= recyclerView0.getHeight() - recyclerView0.getPaddingBottom()) {
                    recyclerView0.scrollToPosition(v1);
                }
            }
        }

        public void C(@Nullable ViewHolder recyclerView$ViewHolder0, int v) {
            if(recyclerView$ViewHolder0 != null) {
                ItemTouchUIUtilImpl.a.a(recyclerView$ViewHolder0.itemView);
            }
        }

        public abstract void D(@NonNull ViewHolder arg1, int arg2);

        public boolean a(@NonNull RecyclerView recyclerView0, @NonNull ViewHolder recyclerView$ViewHolder0, @NonNull ViewHolder recyclerView$ViewHolder1) [...] // Inlined contents

        @SuppressLint({"UnknownNullness"})
        public ViewHolder b(@NonNull ViewHolder recyclerView$ViewHolder0, @NonNull List list0, int v, int v1) {
            int v2 = recyclerView$ViewHolder0.itemView.getWidth();
            int v3 = recyclerView$ViewHolder0.itemView.getHeight();
            int v4 = v - recyclerView$ViewHolder0.itemView.getLeft();
            int v5 = v1 - recyclerView$ViewHolder0.itemView.getTop();
            int v6 = list0.size();
            ViewHolder recyclerView$ViewHolder1 = null;
            int v7 = -1;
            for(int v8 = 0; v8 < v6; ++v8) {
                ViewHolder recyclerView$ViewHolder2 = (ViewHolder)list0.get(v8);
                if(v4 > 0) {
                    int v9 = recyclerView$ViewHolder2.itemView.getRight() - (v + v2);
                    if(v9 < 0 && recyclerView$ViewHolder2.itemView.getRight() > recyclerView$ViewHolder0.itemView.getRight()) {
                        int v10 = Math.abs(v9);
                        if(v10 > v7) {
                            recyclerView$ViewHolder1 = recyclerView$ViewHolder2;
                            v7 = v10;
                        }
                    }
                }
                if(v4 < 0) {
                    int v11 = recyclerView$ViewHolder2.itemView.getLeft() - v;
                    if(v11 > 0 && recyclerView$ViewHolder2.itemView.getLeft() < recyclerView$ViewHolder0.itemView.getLeft()) {
                        int v12 = Math.abs(v11);
                        if(v12 > v7) {
                            recyclerView$ViewHolder1 = recyclerView$ViewHolder2;
                            v7 = v12;
                        }
                    }
                }
                if(v5 < 0) {
                    int v13 = recyclerView$ViewHolder2.itemView.getTop() - v1;
                    if(v13 > 0 && recyclerView$ViewHolder2.itemView.getTop() < recyclerView$ViewHolder0.itemView.getTop()) {
                        int v14 = Math.abs(v13);
                        if(v14 > v7) {
                            recyclerView$ViewHolder1 = recyclerView$ViewHolder2;
                            v7 = v14;
                        }
                    }
                }
                if(v5 > 0) {
                    int v15 = recyclerView$ViewHolder2.itemView.getBottom() - (v1 + v3);
                    if(v15 < 0 && recyclerView$ViewHolder2.itemView.getBottom() > recyclerView$ViewHolder0.itemView.getBottom()) {
                        int v16 = Math.abs(v15);
                        if(v16 > v7) {
                            recyclerView$ViewHolder1 = recyclerView$ViewHolder2;
                            v7 = v16;
                        }
                    }
                }
            }
            return recyclerView$ViewHolder1;
        }

        public void c(@NonNull RecyclerView recyclerView0, @NonNull ViewHolder recyclerView$ViewHolder0) {
            ItemTouchUIUtilImpl.a.c(recyclerView$ViewHolder0.itemView);
        }

        public int d(int v, int v1) {
            if((v & 0x303030) == 0) {
                return v;
            }
            if(v1 == 0) {
                return 0xFFCFCFCF & v | (v & 0x303030) >> 2;
            }
            int v2 = (v & 0x303030) >> 1;
            return 0xFFCFCFCF & v | 0xFFCFCFCF & v2 | (v2 & 0x303030) >> 2;
        }

        public static int e(int v, int v1) {
            if((v & 0xC0C0C) == 0) {
                return v;
            }
            if(v1 == 0) {
                return 0xFFF3F3F3 & v | (v & 0xC0C0C) << 2;
            }
            int v2 = (v & 0xC0C0C) << 1;
            return 0xFFF3F3F3 & v | 0xFFF3F3F3 & v2 | (v2 & 0xC0C0C) << 2;
        }

        final int f(RecyclerView recyclerView0, ViewHolder recyclerView$ViewHolder0) {
            return this.d(this.l(recyclerView0, recyclerView$ViewHolder0), recyclerView0.getLayoutDirection());
        }

        public long g(@NonNull RecyclerView recyclerView0, int v, float f, float f1) {
            ItemAnimator recyclerView$ItemAnimator0 = recyclerView0.getItemAnimator();
            if(recyclerView$ItemAnimator0 == null) {
                return v == 8 ? 200L : 0xFAL;
            }
            return v == 8 ? recyclerView$ItemAnimator0.o() : recyclerView$ItemAnimator0.p();
        }

        public int h() [...] // Inlined contents

        @NonNull
        public static ItemTouchUIUtil i() {
            return ItemTouchUIUtilImpl.a;
        }

        private int j(RecyclerView recyclerView0) {
            if(this.a == -1) {
                this.a = recyclerView0.getResources().getDimensionPixelSize(dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.a;
        }

        public float k(@NonNull ViewHolder recyclerView$ViewHolder0) [...] // Inlined contents

        public abstract int l(@NonNull RecyclerView arg1, @NonNull ViewHolder arg2);

        public float m(float f) [...] // Inlined contents

        public float n(@NonNull ViewHolder recyclerView$ViewHolder0) [...] // Inlined contents

        public float o(float f) [...] // Inlined contents

        boolean p(RecyclerView recyclerView0, ViewHolder recyclerView$ViewHolder0) {
            return (this.f(recyclerView0, recyclerView$ViewHolder0) & 0xFF0000) != 0;
        }

        boolean q(RecyclerView recyclerView0, ViewHolder recyclerView$ViewHolder0) {
            return (this.f(recyclerView0, recyclerView$ViewHolder0) & 0xFF00) != 0;
        }

        public int r(@NonNull RecyclerView recyclerView0, int v, int v1, int v2, long v3) {
            float f = 1.0f;
            int v4 = (int)(((float)(((int)Math.signum(v1)) * this.j(recyclerView0))) * Callback.g.getInterpolation(Math.min(1.0f, ((float)Math.abs(v1)) * 1.0f / ((float)v))));
            if(v3 <= 2000L) {
                f = ((float)v3) / 2000.0f;
            }
            int v5 = (int)(((float)v4) * Callback.f.getInterpolation(f));
            if(v5 == 0) {
                return v1 <= 0 ? -1 : 1;
            }
            return v5;
        }

        public boolean s() {
            return true;
        }

        public boolean t() {
            return true;
        }

        public static int u(int v, int v1) [...] // Inlined contents

        public static int v(int v, int v1) [...] // 潜在的解密器

        public void w(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @NonNull ViewHolder recyclerView$ViewHolder0, float f, float f1, int v, boolean z) {
            ItemTouchUIUtilImpl.a.b(canvas0, recyclerView0, recyclerView$ViewHolder0.itemView, f, f1, v, z);
        }

        public void x(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @SuppressLint({"UnknownNullness"}) ViewHolder recyclerView$ViewHolder0, float f, float f1, int v, boolean z) {
            ItemTouchUIUtilImpl.a.d(canvas0, recyclerView0, recyclerView$ViewHolder0.itemView, f, f1, v, z);
        }

        void y(Canvas canvas0, RecyclerView recyclerView0, ViewHolder recyclerView$ViewHolder0, List list0, int v, float f, float f1) {
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                RecoverAnimation itemTouchHelper$RecoverAnimation0 = (RecoverAnimation)list0.get(v2);
                itemTouchHelper$RecoverAnimation0.e();
                int v3 = canvas0.save();
                this.w(canvas0, recyclerView0, itemTouchHelper$RecoverAnimation0.e, itemTouchHelper$RecoverAnimation0.j, itemTouchHelper$RecoverAnimation0.k, itemTouchHelper$RecoverAnimation0.f, false);
                canvas0.restoreToCount(v3);
            }
            if(recyclerView$ViewHolder0 != null) {
                int v4 = canvas0.save();
                this.w(canvas0, recyclerView0, recyclerView$ViewHolder0, f, f1, v, true);
                canvas0.restoreToCount(v4);
            }
        }

        void z(Canvas canvas0, RecyclerView recyclerView0, ViewHolder recyclerView$ViewHolder0, List list0, int v, float f, float f1) {
            int v1 = list0.size();
            boolean z = false;
            for(int v2 = 0; v2 < v1; ++v2) {
                RecoverAnimation itemTouchHelper$RecoverAnimation0 = (RecoverAnimation)list0.get(v2);
                int v3 = canvas0.save();
                this.x(canvas0, recyclerView0, itemTouchHelper$RecoverAnimation0.e, itemTouchHelper$RecoverAnimation0.j, itemTouchHelper$RecoverAnimation0.k, itemTouchHelper$RecoverAnimation0.f, false);
                canvas0.restoreToCount(v3);
            }
            if(recyclerView$ViewHolder0 != null) {
                int v4 = canvas0.save();
                this.x(canvas0, recyclerView0, recyclerView$ViewHolder0, f, f1, v, true);
                canvas0.restoreToCount(v4);
            }
            for(int v5 = v1 - 1; v5 >= 0; --v5) {
                RecoverAnimation itemTouchHelper$RecoverAnimation1 = (RecoverAnimation)list0.get(v5);
                boolean z1 = itemTouchHelper$RecoverAnimation1.m;
                if(z1 && !itemTouchHelper$RecoverAnimation1.i) {
                    list0.remove(v5);
                }
                else if(!z1) {
                    z = true;
                }
            }
            if(z) {
                recyclerView0.invalidate();
            }
        }
    }

    class ItemTouchHelperGestureListener extends GestureDetector.SimpleOnGestureListener {
        private boolean a;
        final ItemTouchHelper b;

        ItemTouchHelperGestureListener() {
            this.a = true;
        }

        void a() {
            this.a = false;
        }

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public boolean onDown(MotionEvent motionEvent0) {
            return true;
        }

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public void onLongPress(MotionEvent motionEvent0) {
            if(!this.a) {
                return;
            }
            View view0 = ItemTouchHelper.this.t(motionEvent0);
            if(view0 != null) {
                ViewHolder recyclerView$ViewHolder0 = ItemTouchHelper.this.r.getChildViewHolder(view0);
                if(recyclerView$ViewHolder0 == null || !ItemTouchHelper.this.m.p(ItemTouchHelper.this.r, recyclerView$ViewHolder0)) {
                    return;
                }
                int v = motionEvent0.getPointerId(0);
                int v1 = ItemTouchHelper.this.l;
                if(v == v1) {
                    int v2 = motionEvent0.findPointerIndex(v1);
                    float f = motionEvent0.getX(v2);
                    float f1 = motionEvent0.getY(v2);
                    ItemTouchHelper.this.d = f;
                    ItemTouchHelper.this.e = f1;
                    ItemTouchHelper.this.i = 0.0f;
                    ItemTouchHelper.this.h = 0.0f;
                    if(ItemTouchHelper.this.m.t()) {
                        ItemTouchHelper.this.F(recyclerView$ViewHolder0, 2);
                    }
                }
            }
        }
    }

    @VisibleForTesting
    static class RecoverAnimation implements Animator.AnimatorListener {
        final float a;
        final float b;
        final float c;
        final float d;
        final ViewHolder e;
        final int f;
        @VisibleForTesting
        final ValueAnimator g;
        final int h;
        boolean i;
        float j;
        float k;
        boolean l;
        boolean m;
        private float n;

        RecoverAnimation(ViewHolder recyclerView$ViewHolder0, int v, int v1, float f, float f1, float f2, float f3) {
            this.l = false;
            this.m = false;
            this.f = v1;
            this.h = v;
            this.e = recyclerView$ViewHolder0;
            this.a = f;
            this.b = f1;
            this.c = f2;
            this.d = f3;
            ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.g = valueAnimator0;
            valueAnimator0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                final RecoverAnimation a;

                @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                    float f = valueAnimator0.getAnimatedFraction();
                    RecoverAnimation.this.c(f);
                }
            });
            valueAnimator0.setTarget(recyclerView$ViewHolder0.itemView);
            valueAnimator0.addListener(this);
            this.c(0.0f);
        }

        public void a() {
            this.g.cancel();
        }

        public void b(long v) {
            this.g.setDuration(v);
        }

        public void c(float f) {
            this.n = f;
        }

        public void d() {
            this.e.setIsRecyclable(false);
            this.g.start();
        }

        public void e() {
            float f = this.a;
            float f1 = this.c;
            this.j = f == f1 ? this.e.itemView.getTranslationX() : f + this.n * (f1 - f);
            float f2 = this.b;
            float f3 = this.d;
            if(f2 == f3) {
                this.k = this.e.itemView.getTranslationY();
                return;
            }
            this.k = f2 + this.n * (f3 - f2);
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationCancel(Animator animator0) {
            this.c(1.0f);
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationEnd(Animator animator0) {
            if(!this.m) {
                this.e.setIsRecyclable(true);
            }
            this.m = true;
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationRepeat(Animator animator0) {
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationStart(Animator animator0) {
        }
    }

    public static abstract class SimpleCallback extends Callback {
        private int i;
        private int j;

        public SimpleCallback(int v, int v1) {
            this.i = v1;
            this.j = v;
        }

        public int E(@NonNull RecyclerView recyclerView0, @NonNull ViewHolder recyclerView$ViewHolder0) {
            return this.j;
        }

        public int F(@NonNull RecyclerView recyclerView0, @NonNull ViewHolder recyclerView$ViewHolder0) {
            return this.i;
        }

        public void G(int v) {
            this.j = v;
        }

        public void H(int v) {
            this.i = v;
        }

        @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
        public int l(@NonNull RecyclerView recyclerView0, @NonNull ViewHolder recyclerView$ViewHolder0) {
            return Callback.v(this.E(recyclerView0, recyclerView$ViewHolder0), this.F(recyclerView0, recyclerView$ViewHolder0));
        }
    }

    public interface ViewDropHandler {
        void o(@NonNull View arg1, @NonNull View arg2, int arg3, int arg4);
    }

    private ItemTouchHelperGestureListener A;
    private final OnItemTouchListener B;
    private Rect C;
    private long D;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 4;
    public static final int H = 8;
    public static final int I = 16;
    public static final int J = 0x20;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    private static final int M8 = 0xFF;
    public static final int N = 2;
    static final int N8 = 0xFF00;
    public static final int O = 4;
    static final int O8 = 0xFF0000;
    public static final int P = 8;
    private static final int P8 = 1000;
    private static final String Q = "ItemTouchHelper";
    private static final boolean X = false;
    private static final int Y = -1;
    static final int Z = 8;
    final List a;
    private final float[] b;
    ViewHolder c;
    float d;
    float e;
    private float f;
    private float g;
    float h;
    float i;
    private float j;
    private float k;
    int l;
    @NonNull
    Callback m;
    private int n;
    int o;
    @VisibleForTesting
    List p;
    private int q;
    RecyclerView r;
    final Runnable s;
    VelocityTracker t;
    private List u;
    private List v;
    private ChildDrawingOrderCallback w;
    View x;
    int y;
    GestureDetector z;

    public ItemTouchHelper(@NonNull Callback itemTouchHelper$Callback0) {
        this.a = new ArrayList();
        this.b = new float[2];
        this.c = null;
        this.l = -1;
        this.n = 0;
        this.p = new ArrayList();
        this.s = new Runnable() {
            final ItemTouchHelper a;

            @Override
            public void run() {
                if(ItemTouchHelper.this.c != null && ItemTouchHelper.this.E()) {
                    ItemTouchHelper itemTouchHelper0 = ItemTouchHelper.this;
                    ViewHolder recyclerView$ViewHolder0 = itemTouchHelper0.c;
                    if(recyclerView$ViewHolder0 != null) {
                        itemTouchHelper0.z(recyclerView$ViewHolder0);
                    }
                    ItemTouchHelper.this.r.removeCallbacks(ItemTouchHelper.this.s);
                    ViewCompat.x1(ItemTouchHelper.this.r, this);
                }
            }
        };
        this.w = null;
        this.x = null;
        this.y = -1;
        this.B = new OnItemTouchListener() {
            final ItemTouchHelper a;

            @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
            public void h(@NonNull RecyclerView recyclerView0, @NonNull MotionEvent motionEvent0) {
                ItemTouchHelper.this.z.onTouchEvent(motionEvent0);
                VelocityTracker velocityTracker0 = ItemTouchHelper.this.t;
                if(velocityTracker0 != null) {
                    velocityTracker0.addMovement(motionEvent0);
                }
                if(ItemTouchHelper.this.l == -1) {
                    return;
                }
                int v = motionEvent0.getActionMasked();
                int v1 = motionEvent0.findPointerIndex(ItemTouchHelper.this.l);
                if(v1 >= 0) {
                    ItemTouchHelper.this.o(v, motionEvent0, v1);
                }
                int v2 = 0;
                ItemTouchHelper itemTouchHelper0 = ItemTouchHelper.this;
                ViewHolder recyclerView$ViewHolder0 = itemTouchHelper0.c;
                if(recyclerView$ViewHolder0 == null) {
                    return;
                }
                switch(v) {
                    case 1: {
                        ItemTouchHelper.this.F(null, 0);
                        ItemTouchHelper.this.l = -1;
                        return;
                    }
                    case 2: {
                        if(v1 >= 0) {
                            itemTouchHelper0.M(motionEvent0, itemTouchHelper0.o, v1);
                            ItemTouchHelper.this.z(recyclerView$ViewHolder0);
                            ItemTouchHelper.this.r.removeCallbacks(ItemTouchHelper.this.s);
                            ItemTouchHelper.this.s.run();
                            ItemTouchHelper.this.r.invalidate();
                            return;
                        }
                        break;
                    }
                    case 3: {
                        VelocityTracker velocityTracker1 = itemTouchHelper0.t;
                        if(velocityTracker1 != null) {
                            velocityTracker1.clear();
                        }
                        ItemTouchHelper.this.F(null, 0);
                        ItemTouchHelper.this.l = -1;
                        return;
                    }
                    case 6: {
                        int v3 = motionEvent0.getActionIndex();
                        int v4 = motionEvent0.getPointerId(v3);
                        ItemTouchHelper itemTouchHelper1 = ItemTouchHelper.this;
                        if(v4 == itemTouchHelper1.l) {
                            if(v3 == 0) {
                                v2 = 1;
                            }
                            itemTouchHelper1.l = motionEvent0.getPointerId(v2);
                            ItemTouchHelper.this.M(motionEvent0, ItemTouchHelper.this.o, v3);
                            return;
                        }
                        break;
                    }
                }
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
            public boolean i(@NonNull RecyclerView recyclerView0, @NonNull MotionEvent motionEvent0) {
                ItemTouchHelper.this.z.onTouchEvent(motionEvent0);
                int v = motionEvent0.getActionMasked();
                if(v == 0) {
                    ItemTouchHelper.this.l = motionEvent0.getPointerId(0);
                    ItemTouchHelper.this.d = motionEvent0.getX();
                    ItemTouchHelper.this.e = motionEvent0.getY();
                    ItemTouchHelper.this.A();
                    ItemTouchHelper itemTouchHelper0 = ItemTouchHelper.this;
                    if(itemTouchHelper0.c == null) {
                        RecoverAnimation itemTouchHelper$RecoverAnimation0 = itemTouchHelper0.s(motionEvent0);
                        if(itemTouchHelper$RecoverAnimation0 != null) {
                            ItemTouchHelper.this.d -= itemTouchHelper$RecoverAnimation0.j;
                            ItemTouchHelper.this.e -= itemTouchHelper$RecoverAnimation0.k;
                            ItemTouchHelper.this.r(itemTouchHelper$RecoverAnimation0.e, true);
                            if(ItemTouchHelper.this.a.remove(itemTouchHelper$RecoverAnimation0.e.itemView)) {
                                ItemTouchHelper.this.m.c(ItemTouchHelper.this.r, itemTouchHelper$RecoverAnimation0.e);
                            }
                            ItemTouchHelper.this.F(itemTouchHelper$RecoverAnimation0.e, itemTouchHelper$RecoverAnimation0.f);
                            ItemTouchHelper.this.M(motionEvent0, ItemTouchHelper.this.o, 0);
                        }
                    }
                }
                else if(v == 1 || v == 3) {
                    ItemTouchHelper.this.l = -1;
                    ItemTouchHelper.this.F(null, 0);
                }
                else {
                    int v1 = ItemTouchHelper.this.l;
                    if(v1 != -1) {
                        int v2 = motionEvent0.findPointerIndex(v1);
                        if(v2 >= 0) {
                            ItemTouchHelper.this.o(v, motionEvent0, v2);
                        }
                    }
                }
                VelocityTracker velocityTracker0 = ItemTouchHelper.this.t;
                if(velocityTracker0 != null) {
                    velocityTracker0.addMovement(motionEvent0);
                }
                return ItemTouchHelper.this.c != null;
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
            public void j(boolean z) {
                if(!z) {
                    return;
                }
                ItemTouchHelper.this.F(null, 0);
            }
        };
        this.m = itemTouchHelper$Callback0;
    }

    void A() {
        VelocityTracker velocityTracker0 = this.t;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
        }
        this.t = VelocityTracker.obtain();
    }

    void B(RecoverAnimation itemTouchHelper$RecoverAnimation0, int v) {
        this.r.post(new Runnable() {
            final ItemTouchHelper c;

            @Override
            public void run() {
                RecyclerView recyclerView0 = ItemTouchHelper.this.r;
                if(recyclerView0 != null && recyclerView0.isAttachedToWindow() && (!itemTouchHelper$RecoverAnimation0.l && itemTouchHelper$RecoverAnimation0.e.getAbsoluteAdapterPosition() != -1)) {
                    ItemAnimator recyclerView$ItemAnimator0 = ItemTouchHelper.this.r.getItemAnimator();
                    if((recyclerView$ItemAnimator0 == null || !recyclerView$ItemAnimator0.r(null)) && !ItemTouchHelper.this.x()) {
                        ItemTouchHelper.this.m.D(itemTouchHelper$RecoverAnimation0.e, v);
                        return;
                    }
                    ItemTouchHelper.this.r.post(this);
                }
            }
        });
    }

    private void C() {
        VelocityTracker velocityTracker0 = this.t;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.t = null;
        }
    }

    void D(View view0) {
        if(view0 == this.x) {
            this.x = null;
            if(this.w != null) {
                this.r.setChildDrawingOrderCallback(null);
            }
        }
    }

    boolean E() {
        int v9;
        int v8;
        int v4;
        if(this.c == null) {
            this.D = 0x8000000000000000L;
            return false;
        }
        long v = System.currentTimeMillis();
        long v1 = this.D == 0x8000000000000000L ? 0L : v - this.D;
        LayoutManager recyclerView$LayoutManager0 = this.r.getLayoutManager();
        if(this.C == null) {
            this.C = new Rect();
        }
        recyclerView$LayoutManager0.F(this.c.itemView, this.C);
        if(recyclerView$LayoutManager0.G()) {
            int v2 = (int)(this.j + this.h);
            int v3 = v2 - this.C.left - this.r.getPaddingLeft();
            float f = this.h;
            if(f < 0.0f && v3 < 0) {
                v4 = v3;
            }
            else if(f > 0.0f) {
                int v5 = v2 + this.c.itemView.getWidth() + this.C.right - (this.r.getWidth() - this.r.getPaddingRight());
                v4 = v5 > 0 ? v5 : 0;
            }
            else {
                v4 = 0;
            }
        }
        else {
            v4 = 0;
        }
        if(recyclerView$LayoutManager0.H()) {
            int v6 = (int)(this.k + this.i);
            int v7 = v6 - this.C.top - this.r.getPaddingTop();
            float f1 = this.i;
            if(f1 < 0.0f && v7 < 0) {
                v8 = v7;
            }
            else if(f1 > 0.0f) {
                v8 = v6 + this.c.itemView.getHeight() + this.C.bottom - (this.r.getHeight() - this.r.getPaddingBottom());
                if(v8 <= 0) {
                    v8 = 0;
                }
            }
            else {
                v8 = 0;
            }
        }
        else {
            v8 = 0;
        }
        if(v4 != 0) {
            v4 = this.m.r(this.r, this.c.itemView.getWidth(), v4, this.r.getWidth(), v1);
        }
        if(v8 == 0) {
            v9 = v4;
        }
        else {
            v9 = v4;
            v8 = this.m.r(this.r, this.c.itemView.getHeight(), v8, this.r.getHeight(), v1);
        }
        if(v9 == 0 && v8 == 0) {
            this.D = 0x8000000000000000L;
            return false;
        }
        if(this.D == 0x8000000000000000L) {
            this.D = v;
        }
        this.r.scrollBy(v9, v8);
        return true;
    }

    void F(@Nullable ViewHolder recyclerView$ViewHolder0, int v) {
        boolean z;
        int v3;
        float f1;
        float f;
        if(recyclerView$ViewHolder0 == this.c && v == this.n) {
            return;
        }
        this.D = 0x8000000000000000L;
        int v1 = this.n;
        this.r(recyclerView$ViewHolder0, true);
        this.n = v;
        if(v == 2) {
            if(recyclerView$ViewHolder0 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.x = recyclerView$ViewHolder0.itemView;
        }
        ViewHolder recyclerView$ViewHolder1 = this.c;
        if(recyclerView$ViewHolder1 == null) {
            z = false;
        }
        else {
            if(recyclerView$ViewHolder1.itemView.getParent() == null) {
                this.D(recyclerView$ViewHolder1.itemView);
                this.m.c(this.r, recyclerView$ViewHolder1);
                z = false;
            }
            else {
                int v2 = v1 == 2 ? 0 : this.L(recyclerView$ViewHolder1);
                this.C();
                switch(v2) {
                    case 1: 
                    case 2: {
                        f1 = Math.signum(this.i) * ((float)this.r.getHeight());
                        f = 0.0f;
                        break;
                    }
                    case 4: 
                    case 8: {
                        f = Math.signum(this.h) * ((float)this.r.getWidth());
                        f1 = 0.0f;
                        break;
                    }
                    default: {
                        f = v2 == 16 || v2 == 0x20 ? Math.signum(this.h) * ((float)this.r.getWidth()) : 0.0f;
                        f1 = 0.0f;
                    }
                }
                if(v1 == 2) {
                    v3 = 8;
                }
                else {
                    v3 = v2 <= 0 ? 4 : 2;
                }
                this.w(this.b);
                float f2 = this.b[0];
                float f3 = this.b[1];
                androidx.recyclerview.widget.ItemTouchHelper.3 itemTouchHelper$30 = new RecoverAnimation(recyclerView$ViewHolder1, v3, v1, f2, f3, f, f1) {
                    final ItemTouchHelper q;

                    @Override  // androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation
                    public void onAnimationEnd(Animator animator0) {
                        super.onAnimationEnd(animator0);
                        if(this.l) {
                            return;
                        }
                        if(v2 <= 0) {
                            ItemTouchHelper.this.m.c(ItemTouchHelper.this.r, recyclerView$ViewHolder1);
                        }
                        else {
                            ItemTouchHelper.this.a.add(recyclerView$ViewHolder1.itemView);
                            this.i = true;
                            int v = v2;
                            if(v > 0) {
                                ItemTouchHelper.this.B(this, v);
                            }
                        }
                        ItemTouchHelper itemTouchHelper0 = ItemTouchHelper.this;
                        View view0 = recyclerView$ViewHolder1.itemView;
                        if(itemTouchHelper0.x == view0) {
                            itemTouchHelper0.D(view0);
                        }
                    }
                };
                itemTouchHelper$30.b(this.m.g(this.r, v3, f - f2, f1 - f3));
                this.p.add(itemTouchHelper$30);
                itemTouchHelper$30.d();
                z = true;
            }
            this.c = null;
        }
        if(recyclerView$ViewHolder0 != null) {
            this.o = (this.m.f(this.r, recyclerView$ViewHolder0) & (1 << v * 8 + 8) - 1) >> this.n * 8;
            this.j = (float)recyclerView$ViewHolder0.itemView.getLeft();
            this.k = (float)recyclerView$ViewHolder0.itemView.getTop();
            this.c = recyclerView$ViewHolder0;
            if(v == 2) {
                recyclerView$ViewHolder0.itemView.performHapticFeedback(0);
            }
        }
        ViewParent viewParent0 = this.r.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(this.c != null);
        }
        if(!z) {
            this.r.getLayoutManager().h2();
        }
        this.m.C(this.c, this.n);
        this.r.invalidate();
    }

    private void G() {
        this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
        this.r.addItemDecoration(this);
        this.r.addOnItemTouchListener(this.B);
        this.r.addOnChildAttachStateChangeListener(this);
        this.I();
    }

    public void H(@NonNull ViewHolder recyclerView$ViewHolder0) {
        if(!this.m.p(this.r, recyclerView$ViewHolder0)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if(recyclerView$ViewHolder0.itemView.getParent() != this.r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        this.A();
        this.i = 0.0f;
        this.h = 0.0f;
        this.F(recyclerView$ViewHolder0, 2);
    }

    private void I() {
        this.A = new ItemTouchHelperGestureListener(this);
        this.z = new GestureDetector(this.r.getContext(), this.A);
    }

    public void J(@NonNull ViewHolder recyclerView$ViewHolder0) {
        if(!this.m.q(this.r, recyclerView$ViewHolder0)) {
            Log.e("ItemTouchHelper", "Start swipe has been called but swiping is not enabled");
            return;
        }
        if(recyclerView$ViewHolder0.itemView.getParent() != this.r) {
            Log.e("ItemTouchHelper", "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        }
        this.A();
        this.i = 0.0f;
        this.h = 0.0f;
        this.F(recyclerView$ViewHolder0, 1);
    }

    private void K() {
        ItemTouchHelperGestureListener itemTouchHelper$ItemTouchHelperGestureListener0 = this.A;
        if(itemTouchHelper$ItemTouchHelperGestureListener0 != null) {
            itemTouchHelper$ItemTouchHelperGestureListener0.a();
            this.A = null;
        }
        if(this.z != null) {
            this.z = null;
        }
    }

    private int L(ViewHolder recyclerView$ViewHolder0) {
        if(this.n == 2) {
            return 0;
        }
        int v = this.m.l(this.r, recyclerView$ViewHolder0);
        int v1 = (this.m.d(v, this.r.getLayoutDirection()) & 0xFF00) >> 8;
        if(v1 == 0) {
            return 0;
        }
        int v2 = (v & 0xFF00) >> 8;
        if(Math.abs(this.h) > Math.abs(this.i)) {
            int v3 = this.n(recyclerView$ViewHolder0, v1);
            if(v3 > 0) {
                return (v2 & v3) == 0 ? Callback.e(v3, this.r.getLayoutDirection()) : v3;
            }
            int v4 = this.p(recyclerView$ViewHolder0, v1);
            return v4 <= 0 ? 0 : v4;
        }
        int v5 = this.p(recyclerView$ViewHolder0, v1);
        if(v5 > 0) {
            return v5;
        }
        int v6 = this.n(recyclerView$ViewHolder0, v1);
        if(v6 > 0) {
            return (v2 & v6) == 0 ? Callback.e(v6, this.r.getLayoutDirection()) : v6;
        }
        return 0;
    }

    void M(MotionEvent motionEvent0, int v, int v1) {
        float f = motionEvent0.getX(v1);
        float f1 = motionEvent0.getY(v1);
        float f2 = f - this.d;
        this.h = f2;
        this.i = f1 - this.e;
        if((v & 4) == 0) {
            this.h = Math.max(0.0f, f2);
        }
        if((v & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if((v & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if((v & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener
    public void a(@NonNull View view0) {
        this.D(view0);
        ViewHolder recyclerView$ViewHolder0 = this.r.getChildViewHolder(view0);
        if(recyclerView$ViewHolder0 == null) {
            return;
        }
        if(this.c != null && recyclerView$ViewHolder0 == this.c) {
            this.F(null, 0);
            return;
        }
        this.r(recyclerView$ViewHolder0, false);
        if(this.a.remove(recyclerView$ViewHolder0.itemView)) {
            this.m.c(this.r, recyclerView$ViewHolder0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener
    public void b(@NonNull View view0) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void d(Rect rect0, View view0, RecyclerView recyclerView0, State recyclerView$State0) {
        rect0.setEmpty();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void f(Canvas canvas0, RecyclerView recyclerView0, State recyclerView$State0) {
        float f2;
        float f1;
        this.y = -1;
        if(this.c == null) {
            f2 = 0.0f;
            f1 = 0.0f;
        }
        else {
            this.w(this.b);
            float f = this.b[0];
            f1 = this.b[1];
            f2 = f;
        }
        this.m.y(canvas0, recyclerView0, this.c, this.p, this.n, f2, f1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void k(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
        float f2;
        float f1;
        if(this.c == null) {
            f2 = 0.0f;
            f1 = 0.0f;
        }
        else {
            this.w(this.b);
            float f = this.b[0];
            f1 = this.b[1];
            f2 = f;
        }
        this.m.z(canvas0, recyclerView0, this.c, this.p, this.n, f2, f1);
    }

    private void l() {

        class androidx.recyclerview.widget.ItemTouchHelper.5 implements ChildDrawingOrderCallback {
            final ItemTouchHelper a;

            @Override  // androidx.recyclerview.widget.RecyclerView$ChildDrawingOrderCallback
            public int a(int v, int v1) {
                ItemTouchHelper itemTouchHelper0 = ItemTouchHelper.this;
                View view0 = itemTouchHelper0.x;
                if(view0 == null) {
                    return v1;
                }
                int v2 = itemTouchHelper0.y;
                if(v2 == -1) {
                    v2 = itemTouchHelper0.r.indexOfChild(view0);
                    ItemTouchHelper.this.y = v2;
                }
                if(v1 == v - 1) {
                    return v2;
                }
                return v1 < v2 ? v1 : v1 + 1;
            }
        }

    }

    public void m(@Nullable RecyclerView recyclerView0) {
        RecyclerView recyclerView1 = this.r;
        if(recyclerView1 == recyclerView0) {
            return;
        }
        if(recyclerView1 != null) {
            this.q();
        }
        this.r = recyclerView0;
        if(recyclerView0 != null) {
            Resources resources0 = recyclerView0.getResources();
            this.f = resources0.getDimension(dimen.item_touch_helper_swipe_escape_velocity);
            this.g = resources0.getDimension(dimen.item_touch_helper_swipe_escape_max_velocity);
            this.G();
        }
    }

    private int n(ViewHolder recyclerView$ViewHolder0, int v) {
        int v1 = 4;
        if((v & 12) != 0) {
            int v2 = this.h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker0 = this.t;
            if(velocityTracker0 != null && this.l > -1) {
                velocityTracker0.computeCurrentVelocity(1000, this.g);
                float f = this.t.getXVelocity(this.l);
                float f1 = this.t.getYVelocity(this.l);
                if(f > 0.0f) {
                    v1 = 8;
                }
                float f2 = Math.abs(f);
                if((v1 & v) != 0 && v2 == v1 && f2 >= this.f && f2 > Math.abs(f1)) {
                    return v1;
                }
            }
            float f3 = (float)this.r.getWidth();
            return (v & v2) == 0 || Math.abs(this.h) <= f3 * 0.5f ? 0 : v2;
        }
        return 0;
    }

    void o(int v, MotionEvent motionEvent0, int v1) {
        if(this.c != null || v != 2 || this.n == 2 || !this.m.s() || this.r.getScrollState() == 1) {
            return;
        }
        ViewHolder recyclerView$ViewHolder0 = this.v(motionEvent0);
        if(recyclerView$ViewHolder0 == null) {
            return;
        }
        int v2 = (this.m.f(this.r, recyclerView$ViewHolder0) & 0xFF00) >> 8;
        if(v2 == 0) {
            return;
        }
        float f = motionEvent0.getX(v1);
        float f1 = motionEvent0.getY(v1);
        float f2 = f - this.d;
        float f3 = f1 - this.e;
        float f4 = Math.abs(f2);
        float f5 = Math.abs(f3);
        if(f4 < ((float)this.q) && f5 < ((float)this.q)) {
            return;
        }
        if(f4 > f5) {
            if(f2 < 0.0f && (v2 & 4) == 0) {
                return;
            }
            if(f2 > 0.0f && (v2 & 8) == 0) {
                return;
            }
        }
        else {
            if(f3 < 0.0f && (v2 & 1) == 0) {
                return;
            }
            if(f3 > 0.0f && (v2 & 2) == 0) {
                return;
            }
        }
        this.i = 0.0f;
        this.h = 0.0f;
        this.l = motionEvent0.getPointerId(0);
        this.F(recyclerView$ViewHolder0, 1);
    }

    private int p(ViewHolder recyclerView$ViewHolder0, int v) {
        int v1 = 1;
        if((v & 3) != 0) {
            int v2 = this.i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker0 = this.t;
            if(velocityTracker0 != null && this.l > -1) {
                velocityTracker0.computeCurrentVelocity(1000, this.g);
                float f = this.t.getXVelocity(this.l);
                float f1 = this.t.getYVelocity(this.l);
                if(f1 > 0.0f) {
                    v1 = 2;
                }
                float f2 = Math.abs(f1);
                if((v1 & v) != 0 && v1 == v2 && f2 >= this.f && f2 > Math.abs(f)) {
                    return v1;
                }
            }
            float f3 = (float)this.r.getHeight();
            return (v & v2) == 0 || Math.abs(this.i) <= f3 * 0.5f ? 0 : v2;
        }
        return 0;
    }

    private void q() {
        this.r.removeItemDecoration(this);
        this.r.removeOnItemTouchListener(this.B);
        this.r.removeOnChildAttachStateChangeListener(this);
        for(int v = this.p.size() - 1; v >= 0; --v) {
            RecoverAnimation itemTouchHelper$RecoverAnimation0 = (RecoverAnimation)this.p.get(0);
            itemTouchHelper$RecoverAnimation0.a();
            this.m.c(this.r, itemTouchHelper$RecoverAnimation0.e);
        }
        this.p.clear();
        this.x = null;
        this.y = -1;
        this.C();
        this.K();
    }

    void r(ViewHolder recyclerView$ViewHolder0, boolean z) {
        for(int v = this.p.size() - 1; v >= 0; --v) {
            RecoverAnimation itemTouchHelper$RecoverAnimation0 = (RecoverAnimation)this.p.get(v);
            if(itemTouchHelper$RecoverAnimation0.e == recyclerView$ViewHolder0) {
                itemTouchHelper$RecoverAnimation0.l |= z;
                if(!itemTouchHelper$RecoverAnimation0.m) {
                    itemTouchHelper$RecoverAnimation0.a();
                }
                this.p.remove(v);
                return;
            }
        }
    }

    RecoverAnimation s(MotionEvent motionEvent0) {
        if(this.p.isEmpty()) {
            return null;
        }
        View view0 = this.t(motionEvent0);
        for(int v = this.p.size() - 1; v >= 0; --v) {
            RecoverAnimation itemTouchHelper$RecoverAnimation0 = (RecoverAnimation)this.p.get(v);
            if(itemTouchHelper$RecoverAnimation0.e.itemView == view0) {
                return itemTouchHelper$RecoverAnimation0;
            }
        }
        return null;
    }

    View t(MotionEvent motionEvent0) {
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        ViewHolder recyclerView$ViewHolder0 = this.c;
        if(recyclerView$ViewHolder0 != null) {
            View view0 = recyclerView$ViewHolder0.itemView;
            if(ItemTouchHelper.y(view0, f, f1, this.j + this.h, this.k + this.i)) {
                return view0;
            }
        }
        for(int v = this.p.size() - 1; v >= 0; --v) {
            RecoverAnimation itemTouchHelper$RecoverAnimation0 = (RecoverAnimation)this.p.get(v);
            View view1 = itemTouchHelper$RecoverAnimation0.e.itemView;
            if(ItemTouchHelper.y(view1, f, f1, itemTouchHelper$RecoverAnimation0.j, itemTouchHelper$RecoverAnimation0.k)) {
                return view1;
            }
        }
        return this.r.findChildViewUnder(f, f1);
    }

    private List u(ViewHolder recyclerView$ViewHolder0) {
        List list0 = this.u;
        if(list0 == null) {
            this.u = new ArrayList();
            this.v = new ArrayList();
        }
        else {
            list0.clear();
            this.v.clear();
        }
        int v = Math.round(this.j + this.h);
        int v1 = Math.round(this.k + this.i);
        int v2 = recyclerView$ViewHolder0.itemView.getWidth() + v;
        int v3 = recyclerView$ViewHolder0.itemView.getHeight() + v1;
        LayoutManager recyclerView$LayoutManager0 = this.r.getLayoutManager();
        int v4 = recyclerView$LayoutManager0.j0();
        for(int v5 = 0; v5 < v4; ++v5) {
            View view0 = recyclerView$LayoutManager0.i0(v5);
            if(view0 != recyclerView$ViewHolder0.itemView && view0.getBottom() >= v1 && view0.getTop() <= v3 && view0.getRight() >= v && view0.getLeft() <= v2) {
                ViewHolder recyclerView$ViewHolder1 = this.r.getChildViewHolder(view0);
                int v6 = Math.abs((v + v2) / 2 - (view0.getLeft() + view0.getRight()) / 2);
                int v7 = Math.abs((v1 + v3) / 2 - (view0.getTop() + view0.getBottom()) / 2);
                int v8 = v6 * v6 + v7 * v7;
                int v9 = this.u.size();
                int v11 = 0;
                for(int v10 = 0; v10 < v9 && v8 > ((int)(((Integer)this.v.get(v10)))); ++v10) {
                    ++v11;
                }
                this.u.add(v11, recyclerView$ViewHolder1);
                this.v.add(v11, v8);
            }
        }
        return this.u;
    }

    private ViewHolder v(MotionEvent motionEvent0) {
        LayoutManager recyclerView$LayoutManager0 = this.r.getLayoutManager();
        int v = this.l;
        if(v == -1) {
            return null;
        }
        int v1 = motionEvent0.findPointerIndex(v);
        float f = Math.abs(motionEvent0.getX(v1) - this.d);
        float f1 = Math.abs(motionEvent0.getY(v1) - this.e);
        if(f < ((float)this.q) && f1 < ((float)this.q)) {
            return null;
        }
        if(f > f1 && recyclerView$LayoutManager0.G()) {
            return null;
        }
        if(f1 > f && recyclerView$LayoutManager0.H()) {
            return null;
        }
        View view0 = this.t(motionEvent0);
        return view0 == null ? null : this.r.getChildViewHolder(view0);
    }

    private void w(float[] arr_f) {
        arr_f[0] = (this.o & 12) == 0 ? this.c.itemView.getTranslationX() : this.j + this.h - ((float)this.c.itemView.getLeft());
        if((this.o & 3) != 0) {
            arr_f[1] = this.k + this.i - ((float)this.c.itemView.getTop());
            return;
        }
        arr_f[1] = this.c.itemView.getTranslationY();
    }

    boolean x() {
        int v = this.p.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((RecoverAnimation)this.p.get(v1)).m) {
                return true;
            }
        }
        return false;
    }

    private static boolean y(View view0, float f, float f1, float f2, float f3) {
        return f >= f2 && f <= f2 + ((float)view0.getWidth()) && f1 >= f3 && f1 <= f3 + ((float)view0.getHeight());
    }

    void z(ViewHolder recyclerView$ViewHolder0) {
        if(this.r.isLayoutRequested()) {
            return;
        }
        if(this.n != 2) {
            return;
        }
        int v = (int)(this.j + this.h);
        int v1 = (int)(this.k + this.i);
        if(((float)Math.abs(v1 - recyclerView$ViewHolder0.itemView.getTop())) < ((float)recyclerView$ViewHolder0.itemView.getHeight()) * 0.5f && ((float)Math.abs(v - recyclerView$ViewHolder0.itemView.getLeft())) < ((float)recyclerView$ViewHolder0.itemView.getWidth()) * 0.5f) {
            return;
        }
        List list0 = this.u(recyclerView$ViewHolder0);
        if(list0.size() == 0) {
            return;
        }
        ViewHolder recyclerView$ViewHolder1 = this.m.b(recyclerView$ViewHolder0, list0, v, v1);
        if(recyclerView$ViewHolder1 == null) {
            this.u.clear();
            this.v.clear();
            return;
        }
        int v2 = recyclerView$ViewHolder1.getAbsoluteAdapterPosition();
        int v3 = recyclerView$ViewHolder0.getAbsoluteAdapterPosition();
        if(this.m.A(this.r, recyclerView$ViewHolder0, recyclerView$ViewHolder1)) {
            this.m.B(this.r, recyclerView$ViewHolder0, v3, recyclerView$ViewHolder1, v2, v, v1);
        }
    }
}

