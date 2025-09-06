package com.dcinside.app.totalsearch.post;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.codewaves.stickyheadergrid.a;
import com.dcinside.app.ad.naver.c;
import com.dcinside.app.totalsearch.gallery.x;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.kl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.g;
import rx.o;
import rx.subjects.b;

final class e extends a {
    private final b g;
    @Nullable
    private o h;
    private final WeakReference i;
    private final List j;
    private String k;
    private final ArrayList l;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;
    private static final int p = 4;
    private static final int q = 5;
    private static final int r = 6;
    private static final int s = 7;
    private static final int t = 8;
    private static final int u = 25;

    e(u u0) {
        this.g = b.C7();
        this.j = new ArrayList();
        this.l = new ArrayList();
        this.i = new WeakReference(u0);
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int E() {
        return this.l.size();
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int G(int v) {
        return (int)(((Integer)this.l.get(v)));
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int H(int v) {
        return ((int)(((Integer)this.l.get(v)))) == 2 ? this.j.size() : 0;
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int J(int v, int v1) {
        return ((int)(((Integer)this.l.get(v)))) == 2 ? ((w)this.j.get(v1)).b() : 1;
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public void X(com.codewaves.stickyheadergrid.a.a a$a0, int v) {
        if(a$a0 instanceof v) {
            ((v)a$a0).j();
            return;
        }
        if(a$a0 instanceof c) {
            Fragment fragment0 = (Fragment)this.i.get();
            if(fragment0 != null) {
                ((c)a$a0).k(fragment0.getViewLifecycleOwner(), this.k, "", ((com.dcinside.app.ad.naver.a)fragment0));
            }
        }
        else if(a$a0 instanceof com.dcinside.app.totalsearch.holders.c) {
            ((com.dcinside.app.totalsearch.holders.c)a$a0).j(this.k);
        }
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public void Y(com.codewaves.stickyheadergrid.a.b a$b0, int v, int v1) {
        if(a$b0 instanceof f) {
            com.dcinside.app.totalsearch.a.f a$f0 = ((w)this.j.get(v1)).a();
            Dl.z(((f)a$b0).a, a$f0.p(), this.k);
            Dl.y(((f)a$b0).b, Dl.c(a$f0.a()), this.k);
            ((f)a$b0).c.setText(a$f0.b());
            if(m0.a.i(a$f0.d())) {
                ((f)a$b0).e.setVisibility(8);
                ((f)a$b0).d.setVisibility(8);
                return;
            }
            ((f)a$b0).e.setVisibility(0);
            ((f)a$b0).d.setVisibility(0);
            ((f)a$b0).d.setText(a$f0.d());
            return;
        }
        if(a$b0 instanceof com.dcinside.app.ad.naver.e) {
            Fragment fragment0 = (Fragment)this.i.get();
            if(fragment0 != null) {
                ((com.dcinside.app.ad.naver.e)a$b0).j(fragment0.getViewLifecycleOwner(), this.k, "", ((com.dcinside.app.ad.naver.a)fragment0));
            }
        }
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public com.codewaves.stickyheadergrid.a.a a0(ViewGroup viewGroup0, int v) {
        switch(v) {
            case 2: {
                return new v(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E029D, viewGroup0, false));  // layout:view_total_post_item_header
            }
            case 6: {
                View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E029C, viewGroup0, false);  // layout:view_total_header_padding
                view0.setTag(0x7F0B0F51, Boolean.TRUE);  // id:sticky_header_view
                return new x(view0);
            }
            case 7: {
                return new com.dcinside.app.totalsearch.holders.c(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E02A0, viewGroup0, false));  // layout:view_total_search_campaign_word
            }
            default: {
                LinearLayout linearLayout0 = new LinearLayout(viewGroup0.getContext());
                linearLayout0.setOrientation(1);
                linearLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new c(linearLayout0);
            }
        }
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public com.codewaves.stickyheadergrid.a.b b0(ViewGroup viewGroup0, int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 3: {
                return new f(layoutInflater0.inflate(0x7F0E02A8, viewGroup0, false));  // layout:view_total_search_post_item
            }
            case 4: {
                View view0 = layoutInflater0.inflate(0x7F0E0276, viewGroup0, false);  // layout:view_search_more
                view0.setOnClickListener((View view0) -> try {
                    u u0 = (u)this.i.get();
                    if(u0 != null) {
                        u0.E();
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                });
                com.codewaves.stickyheadergrid.a.b a$b0 = new com.dcinside.app.totalsearch.post.x(view0);
                com.dcinside.app.util.ql.a.a(view0, (View view0, boolean z) -> this.o0(((com.dcinside.app.totalsearch.post.x)a$b0), z));
                return a$b0;
            }
            case 8: {
                LinearLayout linearLayout0 = new LinearLayout(viewGroup0.getContext());
                linearLayout0.setOrientation(1);
                linearLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new com.dcinside.app.ad.naver.e(linearLayout0);
            }
            default: {
                return new h(layoutInflater0.inflate(0x7F0E02A1, viewGroup0, false));  // layout:view_total_search_empty
            }
        }
    }

    void h0(com.dcinside.app.totalsearch.a a0, boolean z) {
        if(4 == ((w)this.j.get(this.j.size() - 1)).b()) {
            this.j.remove(this.j.size() - 1);
        }
        ArrayList arrayList0 = a0.l();
        if(arrayList0 != null) {
            if(z) {
                w w0 = new w(8, null);
                this.j.add(w0);
            }
            for(Object object0: arrayList0) {
                w w1 = new w(3, ((com.dcinside.app.totalsearch.a.f)object0));
                this.j.add(w1);
            }
            if(25 == arrayList0.size()) {
                w w2 = new w(4, null);
                this.j.add(w2);
            }
        }
        this.N();
    }

    void i0() {
        this.j.clear();
        this.l.clear();
        this.N();
    }

    @Nullable
    public w j0(int v, int v1) {
        return ((int)(((Integer)this.l.get(v)))) == 2 ? ((w)this.j.get(v1)) : null;
    }

    boolean k0(w w0) {
        return w0 != null && 3 == w0.b();
    }

    // 检测为 Lambda 实现
    private void l0(com.dcinside.app.totalsearch.post.x x0, View view0, boolean z) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static g m0(Boolean boolean0) [...]

    // 检测为 Lambda 实现
    private static void n0(com.dcinside.app.totalsearch.post.x x0, Boolean boolean0) [...]

    private void o0(com.dcinside.app.totalsearch.post.x x0, boolean z) {
        kl.b(new o[]{this.h});
        if(z) {
            com.dcinside.app.totalsearch.post.a a0 = (Boolean boolean0) -> // 去混淆评级： 低(20)
            (boolean0.booleanValue() ? g.s6(0L, TimeUnit.MILLISECONDS) : g.s6(500L, TimeUnit.MILLISECONDS));
            this.h = this.g.t1(a0).M3(rx.android.schedulers.a.c()).x5((Boolean boolean0) -> {
                if(boolean0.booleanValue()) {
                    x0.b.setVisibility(0);
                    x0.a.setVisibility(8);
                    return;
                }
                x0.b.setVisibility(8);
                x0.a.setVisibility(0);
            });
        }
    }

    // 检测为 Lambda 实现
    private void p0(View view0) [...]

    void q0() {
        if(4 == ((w)this.j.get(this.j.size() - 1)).b()) {
            this.j.remove(this.j.size() - 1);
        }
        this.N();
    }

    void r0(com.dcinside.app.totalsearch.a a0, String s) {
        if(a0.f()) {
            this.k = s;
            this.j.clear();
            this.l.clear();
            this.l.add(7);
            this.N();
            return;
        }
        this.k = s;
        this.j.clear();
        ArrayList arrayList0 = a0.l();
        int v = arrayList0 == null ? 0 : arrayList0.size();
        if(v != 0) {
            this.l.add(1);
        }
        this.l.add(6);
        this.l.add(2);
        if(v == 0) {
            w w0 = new w(5, null);
            this.j.add(w0);
        }
        else {
            for(Object object0: arrayList0) {
                w w1 = new w(3, ((com.dcinside.app.totalsearch.a.f)object0));
                this.j.add(w1);
            }
            if(25 == v) {
                w w2 = new w(4, null);
                this.j.add(w2);
            }
        }
        this.N();
    }

    void s0(boolean z) {
        this.g.onNext(Boolean.valueOf(z));
    }
}

