package com.dcinside.app.read;

import Q.c;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.dccon.b;
import com.dcinside.app.model.Mention;
import com.dcinside.app.model.Q;
import com.dcinside.app.read.holder.e;
import com.dcinside.app.read.holder.h;
import com.dcinside.app.read.holder.i;
import com.dcinside.app.read.holder.m;
import com.dcinside.app.read.holder.n;
import com.dcinside.app.read.tools.s;
import com.dcinside.app.realm.B;
import com.dcinside.app.response.j;
import com.dcinside.app.rx.bus.a0;
import com.dcinside.app.rx.bus.l;
import com.dcinside.app.rx.bus.r;
import com.dcinside.app.span.g;
import com.dcinside.app.type.k;
import com.dcinside.app.type.t;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Ck;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.vk;
import com.dcinside.app.util.zk;
import com.dcinside.app.view.DividerConstraintLayout;
import com.dcinside.app.view.PostReadFooterView;
import com.dcinside.app.view.PostReadHeaderView;
import com.dcinside.app.view.PostReadImageAdView;
import com.dcinside.app.view.PostReadReplyAdView;
import com.dcinside.app.view.ReadOtherPostView;
import com.dcinside.app.view.ResizeTextView;
import com.dcinside.app.view.n0;
import com.dcinside.app.view.o0;
import com.dcinside.app.wv.VideoEnabledWebView;
import com.dcinside.app.wv.WebViews;
import com.dcinside.app.wv.f;
import com.google.android.material.animation.d;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import kotlin.V;
import m0.a;
import rx.o;

public final class x extends Adapter implements f {
    private s a;
    private S b;
    private c0 c;
    WeakReference d;
    private final WeakReference e;
    private Q f;
    private c g;
    private final D h;
    private Set i;
    private final int j;
    private final int k;
    private final WeakReference l;
    private String m;
    private String n;
    private boolean o;
    private boolean p;
    private boolean q;
    @Nullable
    private o r;
    @Nullable
    private o s;
    @Nullable
    private o t;
    @Nullable
    private o u;
    @Nullable
    private o v;
    @Nullable
    private ValueAnimator w;
    private int x;

    public x(Fragment fragment0, @NonNull y y0) {
        this.g = new c(false);
        this.h = new D(this);
        this.i = new HashSet();
        this.m = null;
        this.n = null;
        this.o = false;
        this.p = false;
        this.q = false;
        this.x = 0;
        this.l = new WeakReference(y0);
        this.b = new S(this);
        this.e = new WeakReference(fragment0);
        Context context0 = fragment0.getContext();
        if(context0 == null) {
            this.j = 0;
            this.k = 0;
            return;
        }
        int v = context0.getResources().getDimensionPixelSize(0x7F070079);  // dimen:content_minimum_height
        this.j = v;
        this.k = v;
    }

    public void A0(int v) {
        j j0 = this.Q(v).g();
        if(j0 != null) {
            b b0 = this.x <= 0 ? j0.N().g() : j0.N().h();
            if(b0 == null) {
                return;
            }
            try {
                RecyclerView recyclerView0 = (RecyclerView)this.d.get();
                String s = b0.i();
                if(s != null) {
                    long v1 = Long.parseLong(s);
                    com.dcinside.app.rx.bus.c.a(recyclerView0.getContext(), new l(v1, "", b0.m(), 1));
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public void B0(int v) {
        j j0 = this.Q(v).g();
        if(j0 != null) {
            b b0 = this.x <= 0 ? j0.N().g() : j0.N().h();
            if(b0 == null) {
                return;
            }
            try {
                RecyclerView recyclerView0 = (RecyclerView)this.d.get();
                String s = b0.i();
                if(s != null) {
                    com.dcinside.app.rx.bus.c.a(recyclerView0.getContext(), new r(s, ""));
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public static void C(Throwable throwable0) {
    }

    public void C0() {
        int v = this.b.l0();
        if(this.getItemViewType(v) == 10000009) {
            this.notifyItemChanged(v);
            return;
        }
        this.notifyDataSetChanged();
    }

    public static void D(Throwable throwable0) {
    }

    public void D0(boolean z) {
        if(this.b.F0()) {
            return;
        }
        this.b.L0();
    }

    private void E0(k k0) {
        this.O0(() -> try {
            int v = this.b.m0();
            if(v < 0 || this.getItemCount() <= v || this.b.g0(v).j() != 0) {
                return;
            }
            RecyclerView recyclerView0 = this.d == null ? null : ((RecyclerView)this.d.get());
            if(recyclerView0 == null) {
                return;
            }
            com.dcinside.app.read.holder.c c0 = (com.dcinside.app.read.holder.c)recyclerView0.findViewHolderForAdapterPosition(v);
            if(c0 == null) {
                return;
            }
            VideoEnabledWebView videoEnabledWebView0 = c0.i();
            if(videoEnabledWebView0 == null) {
                return;
            }
            com.dcinside.app.wv.m.b.c.b(videoEnabledWebView0, new Object[]{k0.c()});
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            zk.a(exception0);
        });
    }

    public void F0(int v, int v1) {
        if(this.b.F0()) {
            return;
        }
        if(this.b.H0()) {
            this.b.a1(v, v1);
            return;
        }
        this.I0(false);
    }

    public void G0() {
        if(this.b.F0()) {
            return;
        }
        this.b.M0();
    }

    public static void H(Throwable throwable0) {
    }

    public void H0() {
        if(this.b.F0()) {
            return;
        }
        this.b.N0();
    }

    public static void I(Throwable throwable0) {
    }

    public void I0(boolean z) {
        if(this.b.F0()) {
            return;
        }
        this.b.g1();
        this.b.p1(true);
        this.b.T0(this, (z ? 108 : 103));
    }

    public void J0() {
        if(this.b.F0()) {
            return;
        }
        this.b.p1(true);
        this.b.L0();
    }

    public void K(View view0, boolean z) {
        Context context0 = view0.getContext();
        int v = vk.b(context0, 0x7F040512);  // attr:replyHighlightBg
        int v1 = z ? vk.b(context0, 0x7F040513) : vk.b(context0, 0x1010054);  // attr:replyNameBgHighlight
        ValueAnimator valueAnimator0 = this.w;
        if(valueAnimator0 != null) {
            valueAnimator0.end();
            this.w = null;
        }
        ValueAnimator valueAnimator1 = ValueAnimator.ofObject(d.b(), new Object[]{v, v1});
        valueAnimator1.setStartDelay(100L);
        valueAnimator1.setDuration(1500L);
        valueAnimator1.addUpdateListener((ValueAnimator valueAnimator1) -> view0.setBackgroundColor(((int)(((Integer)valueAnimator1.getAnimatedValue())))));
        valueAnimator1.start();
        this.w = valueAnimator1;
        this.b.l1(0);
    }

    public void K0() {
        if(this.b.F0()) {
            return;
        }
        this.b.y1();
        this.p = true;
        RecyclerView recyclerView0 = (RecyclerView)this.d.get();
        if(recyclerView0 == null) {
            return;
        }
        int v = this.b.m0();
        if(v >= 0 && this.getItemCount() > v) {
            com.dcinside.app.read.holder.c c0 = (com.dcinside.app.read.holder.c)recyclerView0.findViewHolderForAdapterPosition(v);
            if(c0 == null) {
                return;
            }
            VideoEnabledWebView videoEnabledWebView0 = c0.i();
            if(videoEnabledWebView0 == null) {
                return;
            }
            com.dcinside.app.wv.m.b.h.b(videoEnabledWebView0, new Object[0]);
        }
    }

    public SpannableStringBuilder L(String s, @Nullable CharSequence charSequence0, String s1, @Nullable String s2, String s3, Context context0) {
        if(charSequence0 != null && a.d(charSequence0.toString(), "<b>운영자</b>")) {
            charSequence0 = Dl.c(charSequence0.toString());
        }
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(charSequence0);
        boolean z = true;
        if("1".equals(s1)) {
            spannableStringBuilder0.setSpan(new StyleSpan(1), 0, spannableStringBuilder0.length(), 33);
        }
        String s4 = B.D6();
        if(a.i(s4) || !a.a(s, s4)) {
            z = false;
        }
        if(a.k(s2)) {
            ForegroundColorSpan foregroundColorSpan0 = new ForegroundColorSpan(vk.b(context0, 0x7F040200));  // attr:dcPostReadSubColor
            if(a.d(s2, "owner")) {
                SpannableStringBuilder spannableStringBuilder1 = new SpannableStringBuilder("글쓴");
                spannableStringBuilder1.append(' ');
                spannableStringBuilder1.setSpan(foregroundColorSpan0, 0, spannableStringBuilder1.length(), 33);
                spannableStringBuilder1.append(spannableStringBuilder0);
                spannableStringBuilder0 = spannableStringBuilder1;
            }
            else {
                int v = spannableStringBuilder0.length();
                spannableStringBuilder0.append(s2);
                spannableStringBuilder0.setSpan(foregroundColorSpan0, v, spannableStringBuilder0.length(), 33);
            }
        }
        if(dl.a.p1() && z) {
            spannableStringBuilder0.setSpan(new BackgroundColorSpan(vk.b(context0, 0x7F040514)), 0, spannableStringBuilder0.length(), 33);  // attr:replyNameHighlight
        }
        if(a.k(s3)) {
            spannableStringBuilder0.append(' ');
        }
        return spannableStringBuilder0;
    }

    public void L0(int v) {
        try {
            j j0 = this.Q(v).g();
            if(j0 != null) {
                com.dcinside.app.rx.bus.c.a(((RecyclerView)this.d.get()).getContext(), new a0((j0.i0() ? 4 : 1), v, j0, true));
            }
        }
        catch(Exception exception0) {
            timber.log.b.B(exception0);
        }
    }

    public void M0(@NonNull com.dcinside.app.read.holder.b b0) {
        if(b0 instanceof com.dcinside.app.read.holder.r) {
            ((com.dcinside.app.read.holder.r)b0).p();
        }
    }

    public void N() {
        RecyclerView recyclerView0 = (RecyclerView)this.d.get();
        if(recyclerView0 == null) {
            return;
        }
        this.h.a(recyclerView0);
    }

    public void N0(@NonNull com.dcinside.app.read.holder.b b0) {
        super.onViewRecycled(b0);
        switch(b0.getItemViewType()) {
            case 10000005: {
                RecyclerView recyclerView0 = this.d == null ? null : ((RecyclerView)this.d.get());
                Context context0 = recyclerView0 == null ? null : recyclerView0.getContext();
                if(((AppCompatActivity)context0) == null) {
                    return;
                }
                com.dcinside.app.perform.r.g(((AppCompatActivity)context0)).j(((n)b0).F(), null);
                return;
            label_9:
                if(b0.f() != null) {
                    b0.f().onPause();
                    return;
                }
                break;
            }
            case 10000004: 
            case 10000022: {
                com.dcinside.app.image.o.a(((h)b0).U());
                com.dcinside.app.image.o.a(((h)b0).W());
                break;
            }
            default: {
                goto label_9;
            }
        }
    }

    public void O() {
        this.b.R();
        this.notifyDataSetChanged();
        this.b.p1(false);
    }

    void O0(Runnable runnable0) {
        RecyclerView recyclerView0 = this.d == null ? null : ((RecyclerView)this.d.get());
        if(recyclerView0 == null) {
            runnable0.run();
            return;
        }
        recyclerView0.post(runnable0);
    }

    public c P() {
        return this.g;
    }

    public void P0() {
        c0 c00 = this.c;
        if(c00 != null) {
            c00.v();
        }
    }

    @NonNull
    public C Q(int v) {
        return this.b.g0(v);
    }

    public void Q0(com.dcinside.app.post.fragments.N3.a n3$a0, s s0, com.dcinside.app.type.o o0, String s1, int v, String s2, boolean z, boolean z1, boolean z2, String s3) {
        if(this.b == null) {
            return;
        }
        dl dl0 = dl.a;
        boolean z3 = dl0.j2();
        this.q = !z3;
        if(!z3) {
            dl0.Z5(true);
        }
        this.p = false;
        this.a = s0;
        this.f = n3$a0.e().n();
        this.g = new c(this.f);
        this.o = z;
        this.b.n1(o0);
        this.b.x1(n3$a0.e().m());
        this.b.p1(false);
        this.b.q1(z1);
        this.b.G(n3$a0);
        this.b.S();
        this.b.v1(s1);
        this.b.l1(v);
        this.b.w1(z2);
        this.b.o1(s3);
        this.m = s2;
    }

    public S R() {
        return this.b;
    }

    private void R0(h h0, int v, boolean z, com.dcinside.app.dccon.a a0, Boolean boolean0) {
        String s;
        h0.itemView.getContext();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = h0.R().getLayoutParams();
        int v1 = 8;
        if(v > -1) {
            if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
                if(h0.U().getVisibility() == 8) {
                    ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMarginStart(0);
                }
                else {
                    ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMarginStart(Dk.d((boolean0.booleanValue() ? 150 : 100)));
                }
            }
            b b0 = a0.h();
            s = b0 == null || !b0.m() ? "차단" : "차단 해제";
        }
        else {
            if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMarginStart(0);
            }
            s = a0.g().m() ? "차단 해제" : "차단";
        }
        h0.R().setVisibility((z ? 0 : 8));
        h0.O().setVisibility((z ? 0 : 8));
        h0.S().setVisibility((z ? 0 : 8));
        h0.P().setVisibility((z ? 0 : 8));
        View view0 = h0.T();
        if(z) {
            v1 = 0;
        }
        view0.setVisibility(v1);
        ViewGroup.LayoutParams viewGroup$LayoutParams1 = h0.x().getLayoutParams();
        if(viewGroup$LayoutParams1 instanceof ViewGroup.MarginLayoutParams) {
            if(h0.R().getVisibility() == 0) {
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).setMargins(0, 0, 0, 0);
            }
            else {
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).setMargins(0, 0, 0, 0);
            }
        }
        h0.O().setText(s);
        h0.S().setText("다운");
    }

    public c0 S() {
        return this.c;
    }

    public void S0(String s) {
        this.n = s;
    }

    public Q T() {
        return this.f;
    }

    public boolean T0() {
        return this.p;
    }

    public V U() {
        return this.b.n0();
    }

    public void V(Mention mention0) {
        this.b.A0(mention0);
    }

    // 检测为 Lambda 实现
    private static void W(View view0, ValueAnimator valueAnimator0, ValueAnimator valueAnimator1) [...]

    private static void X(Throwable throwable0) {
    }

    private static void Y(Throwable throwable0) {
    }

    // 检测为 Lambda 实现
    private void Z(m m0, View view0, boolean z) [...]

    // 检测为 Lambda 实现
    private void a0(PostReadHeaderView postReadHeaderView0, k k0) [...]

    // 检测为 Lambda 实现
    private void b0() [...]

    // 检测为 Lambda 实现
    private void c0(com.dcinside.app.read.holder.d d0, View view0, boolean z) [...]

    private static void d0(Throwable throwable0) {
    }

    // 检测为 Lambda 实现
    private void e0(com.dcinside.app.read.holder.d d0, View view0, boolean z) [...]

    // 检测为 Lambda 实现
    private static void f0(com.dcinside.app.read.holder.f f0, Boolean boolean0) [...]

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        Set set0 = this.i;
        boolean z = false;
        if(set0 != null) {
            for(Object object0: set0) {
                z |= ((f)object0).g();
            }
        }
        return z;
    }

    private static void g0(Throwable throwable0) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b == null ? 0 : this.b.d0();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        try {
            return this.Q(v).j();
        }
        catch(Exception unused_ex) {
            return -1;
        }
    }

    // 检测为 Lambda 实现
    private void h0(com.dcinside.app.read.holder.f f0, View view0, boolean z) [...]

    // 检测为 Lambda 实现
    private static void i0(m m0, Boolean boolean0) [...]

    private static void j0(Throwable throwable0) {
    }

    // 检测为 Lambda 实现
    private void k0(k k0) [...]

    public void l0() {
        RecyclerView recyclerView0 = (RecyclerView)this.d.get();
        if(recyclerView0 == null) {
            return;
        }
        this.h.b(recyclerView0);
    }

    public void m0() {
        this.b.C0();
    }

    public boolean n0(int v) {
        if(this.getItemCount() > v + 1) {
            j j0 = this.Q(v + 1).g();
            return j0 != null && j0.i0();
        }
        return false;
    }

    private void o0(com.dcinside.app.read.holder.l l0, C c0, @NonNull j j0) {
        SpannableStringBuilder spannableStringBuilder0;
        DividerConstraintLayout dividerConstraintLayout0 = l0.o();
        Context context0 = dividerConstraintLayout0.getContext();
        int v = dividerConstraintLayout0.getChildCount();
        float f = j0.h0() ? 0.2f : 1.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = dividerConstraintLayout0.getChildAt(v1);
            if(view0 != null) {
                view0.setAlpha(f);
            }
        }
        l0.x().setText(j0.I());
        ResizeTextView resizeTextView0 = l0.t();
        if(resizeTextView0 != null) {
            CharSequence charSequence0 = c0.i();
            if(a.i(charSequence0)) {
                resizeTextView0.setVisibility(8);
            }
            else {
                if(c0.g() == null || c0.g().W() == null || c0.j() != 10000007) {
                    spannableStringBuilder0 = new SpannableStringBuilder(charSequence0);
                }
                else {
                    String s = String.valueOf(Dl.c(""));
                    spannableStringBuilder0 = g.w(context0, Q0.d, s, "", "", c0.g().W().q() == 1);
                    l0.u().setText(spannableStringBuilder0);
                    int v2 = vk.b(context0, 0x7F04042F);  // attr:mentionColor
                    spannableStringBuilder0.setSpan(new RelativeSizeSpan(0.9f), 0, spannableStringBuilder0.length(), 33);
                    spannableStringBuilder0.setSpan(new ForegroundColorSpan(v2), 0, spannableStringBuilder0.length(), 33);
                    spannableStringBuilder0.append(' ');
                    spannableStringBuilder0.append(charSequence0);
                }
                if(a.k(this.m)) {
                    String s1 = this.m;
                    g.v(spannableStringBuilder0, new com.dcinside.app.span.h(vk.b(context0, 0x7F040514), vk.c(context0, 0x1010036), s1));  // attr:replyNameHighlight
                }
                if(a.k(this.n)) {
                    String s2 = this.n;
                    g.v(spannableStringBuilder0, new com.dcinside.app.span.h(vk.b(context0, 0x7F040514), vk.c(context0, 0x1010036), s2));  // attr:replyNameHighlight
                }
                resizeTextView0.setText(spannableStringBuilder0);
                Ck.b().a(resizeTextView0);
                resizeTextView0.setVisibility(0);
            }
        }
        String s3 = j0.f0();
        String s4 = j0.R();
        if(s3 != null && !s3.isEmpty() || s4 == null || s4.isEmpty()) {
            l0.r().setText(null);
        }
        else {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append('(');
            stringBuilder0.append(a.m(s4, ".*"));
            stringBuilder0.append(')');
            l0.r().setText(stringBuilder0);
        }
        String s5 = j0.P();
        l0.w().setText(this.L(s3, j0.X(), j0.S(), s5, s4, context0));
        String s6 = this.T().l1();
        boolean z = !a.i(s6) && a.a(s3, s6) || a.d(s5, "owner");
        if(z) {
            dividerConstraintLayout0.setBackgroundColor(vk.b(context0, 0x7F040513));  // attr:replyNameBgHighlight
        }
        else {
            dividerConstraintLayout0.setBackgroundColor(0);
        }
        if(l0 instanceof com.dcinside.app.read.holder.o) {
            VideoEnabledWebView videoEnabledWebView0 = l0.f();
            if(videoEnabledWebView0 != null) {
                if(z) {
                    videoEnabledWebView0.setBackgroundColor(vk.b(l0.itemView.getContext(), 0x7F040513));  // attr:replyNameBgHighlight
                }
                else {
                    videoEnabledWebView0.setBackgroundColor(0x1010054);
                }
            }
        }
        t.e(j0, l0.s());
        ResizeTextView resizeTextView1 = l0.z();
        CharSequence charSequence1 = g.A(context0, j0.R(), c0.c(), s3);
        if(charSequence1 == null || charSequence1.length() <= 0) {
            resizeTextView1.setVisibility(8);
        }
        else {
            resizeTextView1.setText(charSequence1);
            resizeTextView1.setVisibility(0);
        }
        l0.y().setVisibility((j0.i0() ? 0 : 8));
        int v3 = this.b.c0();
        if(v3 > 0 && v3 == j0.a0()) {
            this.K(l0.itemView, z);
        }
        if(this.b.G0(j0.a0())) {
            l0.q().setVisibility(0);
            return;
        }
        l0.q().setVisibility(8);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView0) {
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.d = new WeakReference(recyclerView0);
        recyclerView0.addOnScrollListener(this.h);
        if(this.c == null) {
            this.c = new c0(Al.h(recyclerView0.getContext()), this);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0, int v) {
        this.u0(((com.dcinside.app.read.holder.b)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup0, int v) {
        return this.x0(viewGroup0, v);
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        kl.b(new o[]{this.r, this.t, this.u, this.v, this.s});
        c0 c00 = this.c;
        if(c00 != null) {
            c00.w();
            this.c = null;
        }
        S s0 = this.b;
        if(s0 != null) {
            s0.c1();
            this.b = null;
        }
        Set set0 = this.i;
        if(set0 != null) {
            for(Object object0: set0) {
                ((f)object0).onDestroy();
            }
            this.i.clear();
            this.i = null;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView0) {
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            RecyclerView recyclerView1 = (RecyclerView)weakReference0.get();
            if(recyclerView1 != null) {
                recyclerView1.removeOnScrollListener(this.h);
                this.d.clear();
            }
            this.d = null;
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
        Set set0 = this.i;
        if(set0 != null) {
            for(Object object0: set0) {
                ((f)object0).onPause();
            }
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
        Set set0 = this.i;
        if(set0 != null) {
            for(Object object0: set0) {
                ((f)object0).onResume();
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewAttachedToWindow(@NonNull ViewHolder recyclerView$ViewHolder0) {
        this.M0(((com.dcinside.app.read.holder.b)recyclerView$ViewHolder0));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewRecycled(@NonNull ViewHolder recyclerView$ViewHolder0) {
        this.N0(((com.dcinside.app.read.holder.b)recyclerView$ViewHolder0));
    }

    private void p0(com.dcinside.app.read.holder.d d0, C c0) {
        com.dcinside.app.read.C.c c$c0 = c0.h();
        int v = 0;
        if(c$c0 == null) {
            c$c0 = new com.dcinside.app.read.C.c(0, 0, 0);
        }
        d0.j().setText(d0.itemView.getContext().getString(0x7F150890, new Object[]{c$c0.b()}));  // string:reply_count "댓글 %1$d"
        int v1 = c$c0.c();
        int v2 = 8;
        if(v1 > 1) {
            int v3 = c$c0.a();
            d0.m().setVisibility(0);
            View view0 = d0.i()[0];
            if(v3 != 1) {
                v2 = 0;
            }
            view0.setVisibility(v2);
            View view1 = d0.i()[1];
            if(v3 == v1) {
                v = 4;
            }
            view1.setVisibility(v);
            d0.m().setText(c0.b());
        }
        else {
            d0.m().setVisibility(8);
            d0.i()[0].setVisibility(8);
            d0.i()[1].setVisibility(8);
        }
        d0.u(this.f);
        d0.v(this.b.y0());
        d0.t(((Boolean)this.b.Y().G7()));
    }

    private void q0(h h0, C c0, @NonNull j j0, Boolean boolean0) {
        this.o0(h0, c0, j0);
        h0.b0(j0.W());
        h0.J(j0.N(), boolean0.booleanValue());
        boolean z = this.b.b0() == h0.getBindingAdapterPosition();
        this.R0(h0, this.x, z, j0.N(), boolean0);
    }

    private void r0(com.dcinside.app.read.holder.g g0, C c0, @NonNull j j0) {
        g0.i().setText(c0.i());
        g0.k().setVisibility((j0.i0() ? 0 : 8));
        if(this.b.G0(j0.a0())) {
            g0.j().setVisibility(0);
            return;
        }
        g0.j().setVisibility(8);
    }

    private void s0(n n0, C c0, @NonNull j j0) {
        this.o0(n0, c0, j0);
        com.dcinside.app.perform.r r0 = com.dcinside.app.perform.r.g(((AppCompatActivity)Dl.b(n0.itemView)));
        r0.j(n0.F(), null);
        n0.H(j0.g0());
        r0.j(n0.F(), n0);
    }

    private void t0(com.dcinside.app.read.holder.o o0, C c0, @NonNull j j0) {
        this.o0(o0, c0, j0);
        o0.F(j0.W());
        VideoEnabledWebView videoEnabledWebView0 = o0.f();
        if(videoEnabledWebView0 != null) {
            videoEnabledWebView0.onResume();
            com.dcinside.app.wv.m.c m$c0 = com.dcinside.app.wv.m.c.b;
            Object object0 = m$c0.c(videoEnabledWebView0);
            if(object0 == null || !object0.equals(c0.k())) {
                m$c0.f(videoEnabledWebView0, c0.k());
                com.dcinside.app.wv.m.c.g.f(videoEnabledWebView0, Boolean.FALSE);
                com.dcinside.app.wv.j j1 = com.dcinside.app.wv.j.c(videoEnabledWebView0);
                if(j1 != null) {
                    j1.i();
                }
                com.dcinside.app.view.tool.j.h(videoEnabledWebView0, this.k);
                WebViews.k(videoEnabledWebView0);
                WebViews.s(videoEnabledWebView0, c0.b(), this.k);
            }
        }
    }

    public void u0(@NonNull com.dcinside.app.read.holder.b b0, int v) {
        try {
            C c0 = this.Q(v);
            int v1 = c0.j();
            if(v1 != 0) {
                switch(v1) {
                    case 10000002: {
                        PostReadHeaderView postReadHeaderView0 = (PostReadHeaderView)b0.itemView;
                        Q q1 = c0.f();
                        if(q1 != null) {
                            postReadHeaderView0.N(q1, this.o, this.b.y0());
                            return;
                        }
                        break;
                    }
                    case 10000003: {
                        PostReadFooterView postReadFooterView0 = (PostReadFooterView)b0.itemView;
                        Q q0 = c0.f();
                        if(q0 != null) {
                            postReadFooterView0.X(q0);
                        }
                        postReadFooterView0.e0(((Fragment)this.e.get()).getViewLifecycleOwner(), c0.a());
                        postReadFooterView0.c0(c0.a());
                        return;
                    }
                    case 10000004: {
                        j j0 = c0.g();
                        if(j0 != null) {
                            this.q0(((h)b0), c0, j0, Boolean.FALSE);
                            return;
                        }
                        break;
                    }
                    case 10000005: {
                        j j1 = c0.g();
                        if(j1 != null) {
                            this.s0(((n)b0), c0, j1);
                            return;
                        }
                        break;
                    }
                    case 10000006: {
                        j j2 = c0.g();
                        if(j2 != null) {
                            this.t0(((com.dcinside.app.read.holder.o)b0), c0, j2);
                            return;
                        }
                        break;
                    }
                    case 10000007: {
                        j j3 = c0.g();
                        if(j3 != null) {
                            this.o0(((com.dcinside.app.read.holder.l)b0), c0, j3);
                            return;
                        }
                        break;
                    }
                    case 10000008: {
                        String s = c0.b();
                        ((com.dcinside.app.read.holder.k)b0).j().e((s == null ? k0.d.e() : k0.d.g(new Exception(s))));
                        return;
                    }
                    case 10000009: 
                    case 10000010: {
                        this.p0(((com.dcinside.app.read.holder.d)b0), c0);
                        return;
                    }
                    case 10000011: {
                        ReadOtherPostView readOtherPostView0 = (ReadOtherPostView)b0.itemView;
                        if(this.f != null) {
                            readOtherPostView0.D(c0.c(), c0.e());
                            return;
                        }
                        break;
                    }
                    case 10000012: {
                        if(this.i != null) {
                            ((PostReadImageAdView)b0.itemView).p(c0.c(), this.f.c1(), this.f.F0(), c0.a());
                            return;
                        }
                        break;
                    }
                    case 10000013: {
                        PostReadReplyAdView postReadReplyAdView0 = (PostReadReplyAdView)b0.itemView;
                        if(this.i != null) {
                            postReadReplyAdView0.f(this.c);
                            return;
                        }
                        break;
                    }
                    case 10000014: {
                        if(this.i != null) {
                            ((o0)b0.itemView).d(c0.a(), this.g);
                            return;
                        }
                        break;
                    }
                    case 10000015: {
                        ((PostReadReplyAdView)b0.itemView).d(c0.a(), false, this.g);
                        return;
                    }
                    case 10000016: {
                        ((n0)b0.itemView).N(c0.c(), this.f.H0(), this.f.c1());
                        return;
                    }
                    case 10000017: {
                        ((i)b0).i();
                        return;
                    }
                    case 10000018: {
                        j j4 = c0.g();
                        if(j4 != null) {
                            this.r0(((com.dcinside.app.read.holder.g)b0), c0, j4);
                            return;
                        }
                        break;
                    }
                    case 10000019: {
                        if(b0 instanceof com.dcinside.app.read.holder.r) {
                            ((com.dcinside.app.read.holder.r)b0).o();
                            return;
                        }
                        break;
                    }
                    case 10000020: {
                        ((com.dcinside.app.view.c0)b0.itemView).N(c0.c(), this.f.H0(), this.f.c1());
                        return;
                    }
                    case 10000021: {
                        ((com.dcinside.app.read.holder.a)b0).h(c0.b());
                        return;
                    }
                    case 10000022: {
                        j j5 = c0.g();
                        if(j5 != null) {
                            this.q0(((h)b0), c0, j5, Boolean.TRUE);
                            return;
                        }
                        break;
                    }
                    case 10000024: {
                        if(b0 instanceof com.dcinside.app.read.holder.f) {
                            S s1 = this.R();
                            if(s1 != null && s1.H0()) {
                                ((com.dcinside.app.read.holder.f)b0).k(((Boolean)s1.Z().G7()), true);
                                return;
                            }
                            if(s1 != null) {
                                ((com.dcinside.app.read.holder.f)b0).k(Boolean.FALSE, s1.H0());
                                return;
                            }
                            ((com.dcinside.app.read.holder.f)b0).k(Boolean.FALSE, false);
                            return;
                        }
                        break;
                    }
                    case 10000025: {
                        if(b0 instanceof m) {
                            S s2 = this.R();
                            if(s2 != null && s2.H0()) {
                                ((m)b0).j(((Boolean)s2.u0().G7()), true);
                                return;
                            }
                            if(s2 != null) {
                                ((m)b0).j(Boolean.FALSE, s2.H0());
                                return;
                            }
                            ((m)b0).j(Boolean.FALSE, false);
                            return;
                        }
                        break;
                    }
                    case 10000026: {
                        if(b0 instanceof e) {
                            S s3 = this.R();
                            if(s3 != null) {
                                ((e)b0).h(s3.a0());
                                return;
                            }
                        }
                        break;
                    }
                    case 10000027: {
                        if(b0 instanceof com.dcinside.app.read.holder.t) {
                            ((com.dcinside.app.read.holder.t)b0).n(this.q);
                            return;
                        }
                        break;
                    }
                }
            }
            else if(b0 instanceof com.dcinside.app.read.holder.c) {
                ((com.dcinside.app.read.holder.c)b0).h(c0, this.T(), this.a, this.j);
            }
        }
        catch(Exception exception0) {
            timber.log.b.B(exception0);
            zk.a(exception0);
        }
    }

    public void v0(int v, boolean z) {
        try {
            j j0 = this.Q(v).g();
            if(j0 != null) {
                if(z) {
                    this.x = -1;
                    j0.N().g().s(true);
                }
                else {
                    this.x = 1;
                    b b0 = j0.N().h();
                    if(b0 != null) {
                        b0.s(true);
                    }
                }
                this.notifyItemChanged(v);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void w0() {
        if(this.b.F0()) {
            return;
        }
        this.C0();
        S s0 = this.b;
        if(s0 != null) {
            s0.Q();
        }
    }

    public static void x(Throwable throwable0) {
    }

    @NonNull
    public com.dcinside.app.read.holder.b x0(@NonNull ViewGroup viewGroup0, int v) {
        if(v != 0) {
            switch(v) {
                case 10000003: {
                    PostReadFooterView postReadFooterView0 = new PostReadFooterView(viewGroup0.getContext());
                    Set set0 = this.i;
                    if(set0 == null) {
                        postReadFooterView0.onDestroy();
                        return new com.dcinside.app.read.holder.b(postReadFooterView0);
                    }
                    set0.add(postReadFooterView0);
                    return new com.dcinside.app.read.holder.b(postReadFooterView0);
                }
                case 10000004: {
                    return new h(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0263, viewGroup0, false));  // layout:view_reply_item_image
                }
                case 10000005: {
                    return new n(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0266, viewGroup0, false));  // layout:view_reply_item_voice
                }
                case 10000006: {
                    View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0267, viewGroup0, false);  // layout:view_reply_item_voice2
                    if(this.i == null) {
                        return new com.dcinside.app.read.holder.o(view0, null);
                    }
                    Context context0 = viewGroup0.getContext();
                    VideoEnabledWebView videoEnabledWebView0 = new VideoEnabledWebView(context0);
                    videoEnabledWebView0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    videoEnabledWebView0.setBackgroundColor(vk.b(context0, 0x1010054));
                    f f0 = com.dcinside.app.wv.B.a.e(videoEnabledWebView0);
                    this.i.add(f0);
                    return new com.dcinside.app.read.holder.o(view0, videoEnabledWebView0);
                }
                case 10000007: {
                    return new com.dcinside.app.read.holder.l(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0265, viewGroup0, false));  // layout:view_reply_item_text
                }
                case 10000008: {
                    return new com.dcinside.app.read.holder.k(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0272, viewGroup0, false));  // layout:view_reply_state
                }
                case 10000009: {
                    View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0271, viewGroup0, false);  // layout:view_reply_page_top
                    com.dcinside.app.read.holder.b b0 = new com.dcinside.app.read.holder.d(view1, false);
                    com.dcinside.app.util.ql.a.a(view1, (View view0, boolean z) -> {
                        kl.b(new o[]{((com.dcinside.app.read.holder.d)b0).q()});
                        if(z) {
                            o o0 = this.b.o0().M3(rx.android.schedulers.a.c()).y5(new com.dcinside.app.read.g(((com.dcinside.app.read.holder.d)b0)), new com.dcinside.app.read.o());
                            this.r = o0;
                            ((com.dcinside.app.read.holder.d)b0).w(o0);
                            this.s = this.b.Y().M3(rx.android.schedulers.a.c()).y5(new p(((com.dcinside.app.read.holder.d)b0)), new q());
                            return;
                        }
                        y y0 = (y)this.l.get();
                        if(y0 != null) {
                            y0.h(((com.dcinside.app.read.holder.d)b0));
                        }
                    });
                    return b0;
                }
                case 10000010: {
                    View view2 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0270, viewGroup0, false);  // layout:view_reply_page_bot
                    com.dcinside.app.read.holder.b b1 = new com.dcinside.app.read.holder.d(view2, true);
                    com.dcinside.app.util.ql.a.a(view2, (View view0, boolean z) -> {
                        kl.b(new o[]{((com.dcinside.app.read.holder.d)b1).q()});
                        if(z) {
                            o o0 = this.b.o0().M3(rx.android.schedulers.a.c()).y5(new com.dcinside.app.read.g(((com.dcinside.app.read.holder.d)b1)), new com.dcinside.app.read.r());
                            this.t = o0;
                            ((com.dcinside.app.read.holder.d)b1).w(o0);
                        }
                    });
                    return b1;
                }
                case 10000011: {
                    ReadOtherPostView readOtherPostView0 = new ReadOtherPostView(viewGroup0.getContext());
                    readOtherPostView0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    return new com.dcinside.app.read.holder.b(readOtherPostView0);
                }
                case 10000012: {
                    PostReadImageAdView postReadImageAdView0 = new PostReadImageAdView(viewGroup0.getContext());
                    Set set1 = this.i;
                    if(set1 == null) {
                        postReadImageAdView0.onDestroy();
                        return new com.dcinside.app.read.holder.b(postReadImageAdView0);
                    }
                    set1.add(postReadImageAdView0);
                    return new com.dcinside.app.read.holder.b(postReadImageAdView0);
                }
                case 10000014: {
                    o0 o00 = new o0(viewGroup0.getContext());
                    Set set3 = this.i;
                    if(set3 == null) {
                        o00.onDestroy();
                        return new com.dcinside.app.read.holder.b(o00);
                    }
                    set3.add(o00);
                    return new com.dcinside.app.read.holder.b(o00);
                }
                case 10000013: 
                case 10000015: {
                    PostReadReplyAdView postReadReplyAdView0 = new PostReadReplyAdView(viewGroup0.getContext());
                    Set set2 = this.i;
                    if(set2 == null) {
                        postReadReplyAdView0.onDestroy();
                        return new com.dcinside.app.read.holder.b(postReadReplyAdView0);
                    }
                    set2.add(postReadReplyAdView0);
                    return new com.dcinside.app.read.holder.b(postReadReplyAdView0);
                }
                case 10000016: {
                    return new com.dcinside.app.read.holder.b(new n0(viewGroup0.getContext()));
                }
                case 10000017: {
                    return new i(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0253, viewGroup0, false), this.R());  // layout:view_read_reply_sort
                }
                case 10000018: {
                    return new com.dcinside.app.read.holder.g(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0262, viewGroup0, false));  // layout:view_reply_item_deleted
                }
                case 10000019: {
                    return new com.dcinside.app.read.holder.r(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0278, viewGroup0, false));  // layout:view_secret_post
                }
                case 10000020: {
                    return new com.dcinside.app.read.holder.b(new com.dcinside.app.view.c0(viewGroup0.getContext()));
                }
                case 10000021: {
                    return new com.dcinside.app.read.holder.a(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0246, viewGroup0, false));  // layout:view_read_additional_message
                }
                case 10000022: {
                    return new h(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0264, viewGroup0, false));  // layout:view_reply_item_image_big
                }
                case 10000024: {
                    View view3 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0247, viewGroup0, false);  // layout:view_read_bottom_space
                    com.dcinside.app.read.holder.b b2 = new com.dcinside.app.read.holder.f(view3);
                    if(this.b.H0()) {
                        com.dcinside.app.util.ql.a.a(view3, (View view0, boolean z) -> {
                            kl.b(new o[]{((com.dcinside.app.read.holder.f)b2).j()});
                            if(z) {
                                o o0 = this.b.Z().M3(rx.android.schedulers.a.c()).y5((Boolean boolean0) -> f0.k(boolean0, true), new com.dcinside.app.read.n());
                                this.u = o0;
                                ((com.dcinside.app.read.holder.f)b2).l(o0);
                            }
                        });
                    }
                    return b2;
                }
                case 10000025: {
                    View view4 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0254, viewGroup0, false);  // layout:view_read_reply_top_progress
                    com.dcinside.app.read.holder.b b3 = new m(view4);
                    if(this.b.H0()) {
                        com.dcinside.app.util.ql.a.a(view4, (View view0, boolean z) -> {
                            kl.b(new o[]{((m)b3).i()});
                            if(z) {
                                o o0 = this.b.u0().M3(rx.android.schedulers.a.c()).y5((Boolean boolean0) -> m0.j(boolean0, true), new com.dcinside.app.read.k());
                                this.v = o0;
                                ((m)b3).k(o0);
                            }
                        });
                    }
                    return b3;
                }
                case 10000026: {
                    return new e(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0250, viewGroup0, false));  // layout:view_read_reply_bottom_space
                }
                case 10000027: {
                    return new com.dcinside.app.read.holder.t(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0255, viewGroup0, false));  // layout:view_read_spoiler_warn_space
                }
                default: {
                    PostReadHeaderView postReadHeaderView0 = new PostReadHeaderView(viewGroup0.getContext());
                    postReadHeaderView0.setOnReadTextSizeChangeListener((PostReadHeaderView postReadHeaderView0, k k0) -> this.E0(k0));
                    postReadHeaderView0.setOnCountClickListener(() -> {
                        this.l0();
                        this.m0();
                    });
                    postReadHeaderView0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    return new com.dcinside.app.read.holder.b(postReadHeaderView0);
                }
            }
        }
        if(this.i == null) {
            return new com.dcinside.app.read.holder.b(new View(viewGroup0.getContext()), null);
        }
        try {
            com.dcinside.app.read.holder.b b4 = new com.dcinside.app.read.holder.c(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E02B2, viewGroup0, false));  // layout:view_webview_content
            this.i.add(b4);
            return b4;
        }
        catch(Exception exception0) {
            timber.log.b.B(exception0);
            Dl.D(viewGroup0.getContext(), 0x7F1502B4);  // string:error_web_pkg_failed "게시물을 표시할 수 없습니다. 종료 후 다시 시도해주세요."
            return new com.dcinside.app.read.holder.b(new View(viewGroup0.getContext()), null);
        }
    }

    public void y0(int v) {
        try {
            j j0 = this.Q(v).g();
            if(j0 == null) {
                return;
            }
            this.b.k1(-1);
            this.notifyItemChanged(v);
            RecyclerView recyclerView0 = (RecyclerView)this.d.get();
            if(this.x == -1) {
                com.dcinside.app.rx.bus.c.a(recyclerView0.getContext(), new a0(2, v, j0, true));
            }
            if(this.x == 1) {
                com.dcinside.app.rx.bus.c.a(recyclerView0.getContext(), new a0(2, v, j0, false));
            }
        }
        catch(Exception exception0) {
            timber.log.b.B(exception0);
        }
    }

    public void z0(int v, boolean z) {
        int v1 = this.x;
        this.x = z ? -1 : 1;
        int v2 = this.b.b0();
        if(v2 == v) {
            if(this.x == v1) {
                this.b.k1(-1);
            }
            this.notifyItemChanged(v2);
            return;
        }
        this.b.k1(v);
        if(v2 >= 0) {
            this.notifyItemChanged(v2);
        }
        if(v >= 0) {
            this.notifyItemChanged(v);
        }
    }
}

