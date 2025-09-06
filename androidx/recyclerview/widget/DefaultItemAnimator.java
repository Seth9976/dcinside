package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

public class DefaultItemAnimator extends SimpleItemAnimator {
    static class ChangeInfo {
        public ViewHolder a;
        public ViewHolder b;
        public int c;
        public int d;
        public int e;
        public int f;

        private ChangeInfo(ViewHolder recyclerView$ViewHolder0, ViewHolder recyclerView$ViewHolder1) {
            this.a = recyclerView$ViewHolder0;
            this.b = recyclerView$ViewHolder1;
        }

        ChangeInfo(ViewHolder recyclerView$ViewHolder0, ViewHolder recyclerView$ViewHolder1, int v, int v1, int v2, int v3) {
            this(recyclerView$ViewHolder0, recyclerView$ViewHolder1);
            this.c = v;
            this.d = v1;
            this.e = v2;
            this.f = v3;
        }

        @Override
        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
        }
    }

    static class MoveInfo {
        public ViewHolder a;
        public int b;
        public int c;
        public int d;
        public int e;

        MoveInfo(ViewHolder recyclerView$ViewHolder0, int v, int v1, int v2, int v3) {
            this.a = recyclerView$ViewHolder0;
            this.b = v;
            this.c = v1;
            this.d = v2;
            this.e = v3;
        }
    }

    private static TimeInterpolator A = null;
    private ArrayList o;
    private ArrayList p;
    private ArrayList q;
    private ArrayList r;
    ArrayList s;
    ArrayList t;
    ArrayList u;
    ArrayList v;
    ArrayList w;
    ArrayList x;
    ArrayList y;
    private static final boolean z = false;

    public DefaultItemAnimator() {
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
    }

    @Override  // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean D(ViewHolder recyclerView$ViewHolder0) {
        this.i0(recyclerView$ViewHolder0);
        recyclerView$ViewHolder0.itemView.setAlpha(0.0f);
        this.p.add(recyclerView$ViewHolder0);
        return true;
    }

    @Override  // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean E(ViewHolder recyclerView$ViewHolder0, ViewHolder recyclerView$ViewHolder1, int v, int v1, int v2, int v3) {
        if(recyclerView$ViewHolder0 == recyclerView$ViewHolder1) {
            return this.F(recyclerView$ViewHolder0, v, v1, v2, v3);
        }
        float f = recyclerView$ViewHolder0.itemView.getTranslationX();
        float f1 = recyclerView$ViewHolder0.itemView.getTranslationY();
        float f2 = recyclerView$ViewHolder0.itemView.getAlpha();
        this.i0(recyclerView$ViewHolder0);
        recyclerView$ViewHolder0.itemView.setTranslationX(f);
        recyclerView$ViewHolder0.itemView.setTranslationY(f1);
        recyclerView$ViewHolder0.itemView.setAlpha(f2);
        if(recyclerView$ViewHolder1 != null) {
            this.i0(recyclerView$ViewHolder1);
            recyclerView$ViewHolder1.itemView.setTranslationX(((float)(-((int)(((float)(v2 - v)) - f)))));
            recyclerView$ViewHolder1.itemView.setTranslationY(((float)(-((int)(((float)(v3 - v1)) - f1)))));
            recyclerView$ViewHolder1.itemView.setAlpha(0.0f);
        }
        this.r.add(new ChangeInfo(recyclerView$ViewHolder0, recyclerView$ViewHolder1, v, v1, v2, v3));
        return true;
    }

    @Override  // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean F(ViewHolder recyclerView$ViewHolder0, int v, int v1, int v2, int v3) {
        View view0 = recyclerView$ViewHolder0.itemView;
        int v4 = v + ((int)view0.getTranslationX());
        int v5 = v1 + ((int)recyclerView$ViewHolder0.itemView.getTranslationY());
        this.i0(recyclerView$ViewHolder0);
        int v6 = v2 - v4;
        int v7 = v3 - v5;
        if(v6 == 0 && v7 == 0) {
            this.L(recyclerView$ViewHolder0);
            return false;
        }
        if(v6 != 0) {
            view0.setTranslationX(((float)(-v6)));
        }
        if(v7 != 0) {
            view0.setTranslationY(((float)(-v7)));
        }
        this.q.add(new MoveInfo(recyclerView$ViewHolder0, v4, v5, v2, v3));
        return true;
    }

    @Override  // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean G(ViewHolder recyclerView$ViewHolder0) {
        this.i0(recyclerView$ViewHolder0);
        this.o.add(recyclerView$ViewHolder0);
        return true;
    }

    void Z(ViewHolder recyclerView$ViewHolder0) {
        ViewPropertyAnimator viewPropertyAnimator0 = recyclerView$ViewHolder0.itemView.animate();
        this.v.add(recyclerView$ViewHolder0);
        viewPropertyAnimator0.alpha(1.0f).setDuration(this.m()).setListener(new AnimatorListenerAdapter() {
            final DefaultItemAnimator d;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationCancel(Animator animator0) {
                recyclerView$ViewHolder0.itemView.setAlpha(1.0f);
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                viewPropertyAnimator0.setListener(null);
                DefaultItemAnimator.this.H(recyclerView$ViewHolder0);
                DefaultItemAnimator.this.v.remove(recyclerView$ViewHolder0);
                DefaultItemAnimator.this.e0();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
            }
        }).start();
    }

    void a0(ChangeInfo defaultItemAnimator$ChangeInfo0) {
        View view0 = null;
        View view1 = defaultItemAnimator$ChangeInfo0.a == null ? null : defaultItemAnimator$ChangeInfo0.a.itemView;
        ViewHolder recyclerView$ViewHolder0 = defaultItemAnimator$ChangeInfo0.b;
        if(recyclerView$ViewHolder0 != null) {
            view0 = recyclerView$ViewHolder0.itemView;
        }
        if(view1 != null) {
            ViewPropertyAnimator viewPropertyAnimator0 = view1.animate().setDuration(this.n());
            this.y.add(defaultItemAnimator$ChangeInfo0.a);
            viewPropertyAnimator0.translationX(((float)(defaultItemAnimator$ChangeInfo0.e - defaultItemAnimator$ChangeInfo0.c)));
            viewPropertyAnimator0.translationY(((float)(defaultItemAnimator$ChangeInfo0.f - defaultItemAnimator$ChangeInfo0.d)));
            viewPropertyAnimator0.alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                final DefaultItemAnimator d;

                @Override  // android.animation.AnimatorListenerAdapter
                public void onAnimationEnd(Animator animator0) {
                    viewPropertyAnimator0.setListener(null);
                    view1.setAlpha(1.0f);
                    view1.setTranslationX(0.0f);
                    view1.setTranslationY(0.0f);
                    DefaultItemAnimator.this.J(defaultItemAnimator$ChangeInfo0.a, true);
                    DefaultItemAnimator.this.y.remove(defaultItemAnimator$ChangeInfo0.a);
                    DefaultItemAnimator.this.e0();
                }

                @Override  // android.animation.AnimatorListenerAdapter
                public void onAnimationStart(Animator animator0) {
                }
            }).start();
        }
        if(view0 != null) {
            ViewPropertyAnimator viewPropertyAnimator1 = view0.animate();
            this.y.add(defaultItemAnimator$ChangeInfo0.b);
            viewPropertyAnimator1.translationX(0.0f).translationY(0.0f).setDuration(this.n()).alpha(1.0f).setListener(new AnimatorListenerAdapter() {
                final DefaultItemAnimator d;

                @Override  // android.animation.AnimatorListenerAdapter
                public void onAnimationEnd(Animator animator0) {
                    viewPropertyAnimator1.setListener(null);
                    view0.setAlpha(1.0f);
                    view0.setTranslationX(0.0f);
                    view0.setTranslationY(0.0f);
                    DefaultItemAnimator.this.J(defaultItemAnimator$ChangeInfo0.b, false);
                    DefaultItemAnimator.this.y.remove(defaultItemAnimator$ChangeInfo0.b);
                    DefaultItemAnimator.this.e0();
                }

                @Override  // android.animation.AnimatorListenerAdapter
                public void onAnimationStart(Animator animator0) {
                }
            }).start();
        }
    }

    void b0(ViewHolder recyclerView$ViewHolder0, int v, int v1, int v2, int v3) {
        View view0 = recyclerView$ViewHolder0.itemView;
        int v4 = v2 - v;
        int v5 = v3 - v1;
        if(v4 != 0) {
            view0.animate().translationX(0.0f);
        }
        if(v5 != 0) {
            view0.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimator0 = view0.animate();
        this.w.add(recyclerView$ViewHolder0);
        viewPropertyAnimator0.setDuration(this.o()).setListener(new AnimatorListenerAdapter() {
            final DefaultItemAnimator f;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationCancel(Animator animator0) {
                if(v4 != 0) {
                    view0.setTranslationX(0.0f);
                }
                if(v5 != 0) {
                    view0.setTranslationY(0.0f);
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                viewPropertyAnimator0.setListener(null);
                DefaultItemAnimator.this.L(recyclerView$ViewHolder0);
                DefaultItemAnimator.this.w.remove(recyclerView$ViewHolder0);
                DefaultItemAnimator.this.e0();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
            }
        }).start();
    }

    private void c0(ViewHolder recyclerView$ViewHolder0) {
        ViewPropertyAnimator viewPropertyAnimator0 = recyclerView$ViewHolder0.itemView.animate();
        this.x.add(recyclerView$ViewHolder0);
        viewPropertyAnimator0.setDuration(this.p()).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
            final DefaultItemAnimator d;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                viewPropertyAnimator0.setListener(null);
                recyclerView$ViewHolder0.itemView.setAlpha(1.0f);
                DefaultItemAnimator.this.N(recyclerView$ViewHolder0);
                DefaultItemAnimator.this.x.remove(recyclerView$ViewHolder0);
                DefaultItemAnimator.this.e0();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
            }
        }).start();
    }

    void d0(List list0) {
        for(int v = list0.size() - 1; v >= 0; --v) {
            ((ViewHolder)list0.get(v)).itemView.animate().cancel();
        }
    }

    void e0() {
        if(!this.q()) {
            this.j();
        }
    }

    private void f0(List list0, ViewHolder recyclerView$ViewHolder0) {
        for(int v = list0.size() - 1; v >= 0; --v) {
            ChangeInfo defaultItemAnimator$ChangeInfo0 = (ChangeInfo)list0.get(v);
            if(this.h0(defaultItemAnimator$ChangeInfo0, recyclerView$ViewHolder0) && defaultItemAnimator$ChangeInfo0.a == null && defaultItemAnimator$ChangeInfo0.b == null) {
                list0.remove(defaultItemAnimator$ChangeInfo0);
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public boolean g(@NonNull ViewHolder recyclerView$ViewHolder0, @NonNull List list0) {
        return !list0.isEmpty() || super.g(recyclerView$ViewHolder0, list0);
    }

    private void g0(ChangeInfo defaultItemAnimator$ChangeInfo0) {
        ViewHolder recyclerView$ViewHolder0 = defaultItemAnimator$ChangeInfo0.a;
        if(recyclerView$ViewHolder0 != null) {
            this.h0(defaultItemAnimator$ChangeInfo0, recyclerView$ViewHolder0);
        }
        ViewHolder recyclerView$ViewHolder1 = defaultItemAnimator$ChangeInfo0.b;
        if(recyclerView$ViewHolder1 != null) {
            this.h0(defaultItemAnimator$ChangeInfo0, recyclerView$ViewHolder1);
        }
    }

    private boolean h0(ChangeInfo defaultItemAnimator$ChangeInfo0, ViewHolder recyclerView$ViewHolder0) {
        boolean z = false;
        if(defaultItemAnimator$ChangeInfo0.b == recyclerView$ViewHolder0) {
            defaultItemAnimator$ChangeInfo0.b = null;
        }
        else if(defaultItemAnimator$ChangeInfo0.a == recyclerView$ViewHolder0) {
            defaultItemAnimator$ChangeInfo0.a = null;
            z = true;
        }
        else {
            return false;
        }
        recyclerView$ViewHolder0.itemView.setAlpha(1.0f);
        recyclerView$ViewHolder0.itemView.setTranslationX(0.0f);
        recyclerView$ViewHolder0.itemView.setTranslationY(0.0f);
        this.J(recyclerView$ViewHolder0, z);
        return true;
    }

    private void i0(ViewHolder recyclerView$ViewHolder0) {
        if(DefaultItemAnimator.A == null) {
            DefaultItemAnimator.A = new ValueAnimator().getInterpolator();
        }
        recyclerView$ViewHolder0.itemView.animate().setInterpolator(DefaultItemAnimator.A);
        this.k(recyclerView$ViewHolder0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    @SuppressLint({"UnknownNullness"})
    public void k(ViewHolder recyclerView$ViewHolder0) {
        View view0 = recyclerView$ViewHolder0.itemView;
        view0.animate().cancel();
        for(int v = this.q.size() - 1; v >= 0; --v) {
            if(((MoveInfo)this.q.get(v)).a == recyclerView$ViewHolder0) {
                view0.setTranslationY(0.0f);
                view0.setTranslationX(0.0f);
                this.L(recyclerView$ViewHolder0);
                this.q.remove(v);
            }
        }
        this.f0(this.r, recyclerView$ViewHolder0);
        if(this.o.remove(recyclerView$ViewHolder0)) {
            view0.setAlpha(1.0f);
            this.N(recyclerView$ViewHolder0);
        }
        if(this.p.remove(recyclerView$ViewHolder0)) {
            view0.setAlpha(1.0f);
            this.H(recyclerView$ViewHolder0);
        }
        for(int v1 = this.u.size() - 1; v1 >= 0; --v1) {
            ArrayList arrayList0 = (ArrayList)this.u.get(v1);
            this.f0(arrayList0, recyclerView$ViewHolder0);
            if(arrayList0.isEmpty()) {
                this.u.remove(v1);
            }
        }
        for(int v2 = this.t.size() - 1; v2 >= 0; --v2) {
            ArrayList arrayList1 = (ArrayList)this.t.get(v2);
            for(int v3 = arrayList1.size() - 1; v3 >= 0; --v3) {
                if(((MoveInfo)arrayList1.get(v3)).a == recyclerView$ViewHolder0) {
                    view0.setTranslationY(0.0f);
                    view0.setTranslationX(0.0f);
                    this.L(recyclerView$ViewHolder0);
                    arrayList1.remove(v3);
                    if(arrayList1.isEmpty()) {
                        this.t.remove(v2);
                    }
                    break;
                }
            }
        }
        for(int v4 = this.s.size() - 1; v4 >= 0; --v4) {
            ArrayList arrayList2 = (ArrayList)this.s.get(v4);
            if(arrayList2.remove(recyclerView$ViewHolder0)) {
                view0.setAlpha(1.0f);
                this.H(recyclerView$ViewHolder0);
                if(arrayList2.isEmpty()) {
                    this.s.remove(v4);
                }
            }
        }
        this.x.remove(recyclerView$ViewHolder0);
        this.v.remove(recyclerView$ViewHolder0);
        this.y.remove(recyclerView$ViewHolder0);
        this.w.remove(recyclerView$ViewHolder0);
        this.e0();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public void l() {
        for(int v = this.q.size() - 1; v >= 0; --v) {
            MoveInfo defaultItemAnimator$MoveInfo0 = (MoveInfo)this.q.get(v);
            View view0 = defaultItemAnimator$MoveInfo0.a.itemView;
            view0.setTranslationY(0.0f);
            view0.setTranslationX(0.0f);
            this.L(defaultItemAnimator$MoveInfo0.a);
            this.q.remove(v);
        }
        for(int v1 = this.o.size() - 1; v1 >= 0; --v1) {
            this.N(((ViewHolder)this.o.get(v1)));
            this.o.remove(v1);
        }
        for(int v2 = this.p.size() - 1; v2 >= 0; --v2) {
            ViewHolder recyclerView$ViewHolder0 = (ViewHolder)this.p.get(v2);
            recyclerView$ViewHolder0.itemView.setAlpha(1.0f);
            this.H(recyclerView$ViewHolder0);
            this.p.remove(v2);
        }
        for(int v3 = this.r.size() - 1; v3 >= 0; --v3) {
            this.g0(((ChangeInfo)this.r.get(v3)));
        }
        this.r.clear();
        if(!this.q()) {
            return;
        }
        for(int v4 = this.t.size() - 1; v4 >= 0; --v4) {
            ArrayList arrayList0 = (ArrayList)this.t.get(v4);
            for(int v5 = arrayList0.size() - 1; v5 >= 0; --v5) {
                MoveInfo defaultItemAnimator$MoveInfo1 = (MoveInfo)arrayList0.get(v5);
                View view1 = defaultItemAnimator$MoveInfo1.a.itemView;
                view1.setTranslationY(0.0f);
                view1.setTranslationX(0.0f);
                this.L(defaultItemAnimator$MoveInfo1.a);
                arrayList0.remove(v5);
                if(arrayList0.isEmpty()) {
                    this.t.remove(arrayList0);
                }
            }
        }
        for(int v6 = this.s.size() - 1; v6 >= 0; --v6) {
            ArrayList arrayList1 = (ArrayList)this.s.get(v6);
            for(int v7 = arrayList1.size() - 1; v7 >= 0; --v7) {
                ViewHolder recyclerView$ViewHolder1 = (ViewHolder)arrayList1.get(v7);
                recyclerView$ViewHolder1.itemView.setAlpha(1.0f);
                this.H(recyclerView$ViewHolder1);
                arrayList1.remove(v7);
                if(arrayList1.isEmpty()) {
                    this.s.remove(arrayList1);
                }
            }
        }
        for(int v8 = this.u.size() - 1; v8 >= 0; --v8) {
            ArrayList arrayList2 = (ArrayList)this.u.get(v8);
            for(int v9 = arrayList2.size() - 1; v9 >= 0; --v9) {
                this.g0(((ChangeInfo)arrayList2.get(v9)));
                if(arrayList2.isEmpty()) {
                    this.u.remove(arrayList2);
                }
            }
        }
        this.d0(this.x);
        this.d0(this.w);
        this.d0(this.v);
        this.d0(this.y);
        this.j();
    }

    // 去混淆评级： 中等(110)
    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public boolean q() {
        return !this.p.isEmpty() || !this.r.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.w.isEmpty() || !this.x.isEmpty() || !this.v.isEmpty() || !this.y.isEmpty() || !this.t.isEmpty() || !this.s.isEmpty() || !this.u.isEmpty();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public void x() {
        boolean z = this.o.isEmpty();
        boolean z1 = this.q.isEmpty();
        boolean z2 = this.r.isEmpty();
        boolean z3 = this.p.isEmpty();
        if(z && z1 && z3 && z2) {
            return;
        }
        for(Object object0: this.o) {
            this.c0(((ViewHolder)object0));
        }
        this.o.clear();
        if(!z1) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(this.q);
            this.t.add(arrayList0);
            this.q.clear();
            androidx.recyclerview.widget.DefaultItemAnimator.1 defaultItemAnimator$10 = new Runnable() {
                final DefaultItemAnimator b;

                @Override
                public void run() {
                    for(Object object0: arrayList0) {
                        DefaultItemAnimator.this.b0(((MoveInfo)object0).a, ((MoveInfo)object0).b, ((MoveInfo)object0).c, ((MoveInfo)object0).d, ((MoveInfo)object0).e);
                    }
                    arrayList0.clear();
                    DefaultItemAnimator.this.t.remove(arrayList0);
                }
            };
            if(z) {
                defaultItemAnimator$10.run();
            }
            else {
                ViewCompat.y1(((MoveInfo)arrayList0.get(0)).a.itemView, defaultItemAnimator$10, this.p());
            }
        }
        if(!z2) {
            ArrayList arrayList1 = new ArrayList();
            arrayList1.addAll(this.r);
            this.u.add(arrayList1);
            this.r.clear();
            androidx.recyclerview.widget.DefaultItemAnimator.2 defaultItemAnimator$20 = new Runnable() {
                final DefaultItemAnimator b;

                @Override
                public void run() {
                    for(Object object0: arrayList1) {
                        DefaultItemAnimator.this.a0(((ChangeInfo)object0));
                    }
                    arrayList1.clear();
                    DefaultItemAnimator.this.u.remove(arrayList1);
                }
            };
            if(z) {
                defaultItemAnimator$20.run();
            }
            else {
                ViewCompat.y1(((ChangeInfo)arrayList1.get(0)).a.itemView, defaultItemAnimator$20, this.p());
            }
        }
        if(!z3) {
            long v = 0L;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.p);
            this.s.add(arrayList2);
            this.p.clear();
            androidx.recyclerview.widget.DefaultItemAnimator.3 defaultItemAnimator$30 = new Runnable() {
                final DefaultItemAnimator b;

                @Override
                public void run() {
                    for(Object object0: arrayList2) {
                        DefaultItemAnimator.this.Z(((ViewHolder)object0));
                    }
                    arrayList2.clear();
                    DefaultItemAnimator.this.s.remove(arrayList2);
                }
            };
            if(z && z1 && z2) {
                defaultItemAnimator$30.run();
                return;
            }
            long v1 = z ? 0L : this.p();
            long v2 = z1 ? 0L : this.o();
            if(!z2) {
                v = this.n();
            }
            ViewCompat.y1(((ViewHolder)arrayList2.get(0)).itemView, defaultItemAnimator$30, v1 + Math.max(v2, v));
        }
    }
}

