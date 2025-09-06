package com.dcinside.app.write;

import A3.p;
import Z.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.request.i;
import com.dcinside.app.image.o;
import com.dcinside.app.image.s;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import com.dcinside.app.model.P;
import com.dcinside.app.model.m0;
import com.dcinside.app.realm.k0;
import com.dcinside.app.settings.image.AutoImageData;
import com.dcinside.app.settings.image.model.AutoImage;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.Wk;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.write.menu.video.VideoInfoData;
import com.dcinside.app.wv.B;
import com.dcinside.app.wv.VideoEnabledWebView;
import com.dcinside.app.wv.WebViews;
import com.dcinside.app.wv.f;
import com.dcinside.app.wv.j;
import com.dcinside.app.wv.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import org.jsoup.g;
import y4.l;
import y4.m;

@s0({"SMAP\nPostWriteAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteAdapter.kt\ncom/dcinside/app/write/PostWriteAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,935:1\n147#2:936\n147#2:937\n177#3,9:938\n177#3,9:947\n177#3,9:956\n177#3,9:977\n177#3,9:1028\n177#3,9:1053\n177#3,9:1101\n177#3,9:1110\n257#4,2:965\n257#4,2:967\n257#4,2:969\n257#4,2:971\n257#4,2:986\n257#4,2:988\n257#4,2:990\n257#4,2:992\n257#4,2:994\n257#4,2:996\n257#4,2:998\n257#4,2:1000\n257#4,2:1002\n257#4,2:1004\n257#4,2:1006\n257#4,2:1008\n257#4,2:1010\n257#4,2:1012\n257#4,2:1014\n257#4,2:1016\n257#4,2:1018\n257#4,2:1020\n257#4,2:1022\n257#4,2:1024\n257#4,2:1026\n257#4,2:1037\n257#4,2:1039\n257#4,2:1041\n257#4,2:1043\n257#4,2:1045\n257#4,2:1047\n257#4,2:1049\n257#4,2:1051\n29#5:973\n774#6:974\n865#6,2:975\n360#6,7:1068\n1755#6,3:1075\n1782#6,4:1078\n1782#6,4:1082\n1755#6,3:1086\n388#6,7:1090\n295#6,2:1097\n295#6,2:1099\n37#7,2:1062\n37#7,2:1064\n37#7,2:1066\n1#8:1089\n*S KotlinDebug\n*F\n+ 1 PostWriteAdapter.kt\ncom/dcinside/app/write/PostWriteAdapter\n*L\n80#1:936\n104#1:937\n226#1:938,9\n318#1:947,9\n374#1:956,9\n460#1:977,9\n528#1:1028,9\n597#1:1053,9\n919#1:1101,9\n925#1:1110,9\n409#1:965,2\n410#1:967,2\n412#1:969,2\n413#1:971,2\n480#1:986,2\n481#1:988,2\n482#1:990,2\n483#1:992,2\n484#1:994,2\n485#1:996,2\n488#1:998,2\n489#1:1000,2\n490#1:1002,2\n491#1:1004,2\n492#1:1006,2\n493#1:1008,2\n496#1:1010,2\n497#1:1012,2\n499#1:1014,2\n500#1:1016,2\n504#1:1018,2\n505#1:1020,2\n507#1:1022,2\n508#1:1024,2\n514#1:1026,2\n535#1:1037,2\n537#1:1039,2\n538#1:1041,2\n543#1:1043,2\n544#1:1045,2\n545#1:1047,2\n546#1:1049,2\n547#1:1051,2\n418#1:973\n434#1:974\n434#1:975,2\n637#1:1068,7\n686#1:1075,3\n691#1:1078,4\n696#1:1082,4\n701#1:1086,3\n871#1:1090,7\n893#1:1097,2\n902#1:1099,2\n614#1:1062,2\n621#1:1064,2\n624#1:1066,2\n*E\n"})
public final class d1 extends Adapter implements b, f {
    @m
    private L2 a;
    private boolean b;
    @l
    private final Map c;
    @l
    private final Map d;
    private final int e;
    @m
    private AdapterDataObserver f;
    @l
    private final ArrayList g;
    private int h;
    @m
    private Runnable i;
    @l
    private final HashMap j;
    @l
    private Set k;
    @m
    private t l;
    @l
    private final t m;
    @l
    private final HashSet n;
    private boolean o;
    @m
    private AutoImageData p;
    @m
    private String q;

    public d1(@m Wk wk0) {
        public static final class a extends AdapterDataObserver {
            final d1 a;

            a(d1 d10) {
                this.a = d10;
                super();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void i(int v, int v1) {
                this.a.C();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void l(int v, int v1) {
                this.a.C();
            }
        }

        this.a = new L2();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = Dk.b(0x7F070079);  // dimen:content_minimum_height
        this.g = new ArrayList();
        this.h = -1;
        this.j = new HashMap();
        this.k = new LinkedHashSet();
        this.m = new t(wk0);
        this.n = new HashSet();
        a d1$a0 = new a(this);
        this.f = d1$a0;
        this.registerAdapterDataObserver(d1$a0);
    }

    public final void A(@l m0 m00) {
        L.p(m00, "message");
        L2 l20 = this.a;
        if(l20 != null) {
            l20.i(m00.c());
        }
        this.C();
    }

    public final boolean B(@m String s) {
        return !L.g(s, this.q);
    }

    private final void C() {
        L2 l20 = this.a;
        if(l20 != null) {
            l20.c(this.W());
        }
    }

    public final void D() {
        this.c.clear();
        this.d.clear();
        this.g.clear();
    }

    public final void E() {
        this.q = null;
    }

    public final void F() {
        int v = this.g.size();
        if(v == 0) {
            this.z(0);
            return;
        }
        k0 k00 = (k0)this.g.get(v - 1);
        if(k0.r.J(k00)) {
            this.G(v - 1);
            return;
        }
        this.z(this.g.size());
    }

    public final void G(int v) {
        try {
            this.h = -1;
            t t0 = this.l;
            if(t0 != null) {
                RecyclerView recyclerView0 = (RecyclerView)t0.a();
                if(recyclerView0 != null) {
                    LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
                    LinearLayoutManager linearLayoutManager0 = recyclerView$LayoutManager0 instanceof LinearLayoutManager ? ((LinearLayoutManager)recyclerView$LayoutManager0) : null;
                    if(linearLayoutManager0 == null) {
                        return;
                    }
                    if(linearLayoutManager0.s() > v && v > linearLayoutManager0.i()) {
                        this.h = v;
                        recyclerView0.scrollToPosition(v);
                        return;
                    }
                    ViewHolder recyclerView$ViewHolder0 = recyclerView0.findViewHolderForAdapterPosition(v);
                    if(recyclerView$ViewHolder0 instanceof y2) {
                        recyclerView0.scrollToPosition(v);
                        this.H(((y2)recyclerView$ViewHolder0).x(), v);
                        return;
                    }
                    this.h = v;
                    recyclerView0.scrollToPosition(v);
                    return;
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
        timber.log.b.a.y(exception0);
    }

    private final void H(EditText editText0, int v) {
        public static final class com.dcinside.app.write.d1.b implements Runnable {
            final d1 a;
            final RecyclerView b;
            final int c;
            final EditText d;

            com.dcinside.app.write.d1.b(d1 d10, RecyclerView recyclerView0, int v, EditText editText0) {
                this.a = d10;
                this.b = recyclerView0;
                this.c = v;
                this.d = editText0;
                super();
            }

            @Override
            public void run() {
                if(!L.g(this.a.i, this)) {
                    return;
                }
                this.a.i = null;
                try {
                    LinearLayoutManager linearLayoutManager0 = (LinearLayoutManager)this.b.getLayoutManager();
                    if(linearLayoutManager0 == null) {
                        return;
                    }
                    int v = linearLayoutManager0.s();
                    int v1 = linearLayoutManager0.i();
                    if(v <= this.c && this.c <= v1) {
                        Context context0 = Dl.b(this.b);
                        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.write.PostWriteActivity");
                        if(((PostWriteActivity)context0).s1()) {
                            return;
                        }
                        ((PostWriteActivity)context0).H5();
                        Nk.a.f(this.d);
                        int v2 = this.d.getText().length();
                        this.d.setSelection(v2);
                    }
                }
                catch(Exception exception0) {
                    timber.log.b.a.y(exception0);
                }
            }
        }

        t t0 = this.l;
        if(t0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)t0.a();
            if(recyclerView0 != null) {
                Runnable runnable0 = this.i;
                if(runnable0 != null) {
                    recyclerView0.removeCallbacks(runnable0);
                }
                com.dcinside.app.write.d1.b d1$b0 = new com.dcinside.app.write.d1.b(this, recyclerView0, v, editText0);
                this.i = d1$b0;
                recyclerView0.post(d1$b0);
            }
        }
    }

    @l
    public final HashSet I() {
        return this.n;
    }

    @l
    public final t J() {
        return this.m;
    }

    private final int K() {
        try {
            t t0 = this.l;
            if(t0 == null) {
                return -1;
            }
            RecyclerView recyclerView0 = (RecyclerView)t0.a();
            if(recyclerView0 == null) {
                return -1;
            }
            Context context0 = Dl.b(recyclerView0);
            AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
            if(appCompatActivity0 == null) {
                return -1;
            }
            View view0 = appCompatActivity0.getCurrentFocus();
            if(view0 != null && view0.getLayoutParams() instanceof LayoutParams) {
                ViewParent viewParent0 = view0.getParent();
                L.n(viewParent0, "null cannot be cast to non-null type android.view.View");
                return recyclerView0.getChildAdapterPosition(((View)viewParent0));
            }
        }
        catch(Exception exception0) {
            timber.log.b.a.y(exception0);
        }
        return -1;
    }

    public final boolean L() {
        ArrayList arrayList0 = this.g;
        if(!(arrayList0 instanceof Collection) || !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                if(k0.r.x(((k0)object0))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public final boolean N() {
        ArrayList arrayList0 = this.g;
        if(!(arrayList0 instanceof Collection) || !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                if(((k0)object0).c6() == 7) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public final int O() {
        int v = 0;
        for(Object object0: this.g) {
            if(k0.r.B(((k0)object0))) {
                ++v;
            }
        }
        return v;
    }

    public final boolean P() {
        return this.b;
    }

    @l
    public final Map Q() {
        return this.d;
    }

    @l
    public final Map R() {
        return this.c;
    }

    @l
    public final ArrayList S() {
        return this.g;
    }

    public final int T() {
        ArrayList arrayList0 = this.g;
        int v = 0;
        if(!(arrayList0 instanceof Collection) || !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                if(k0.r.A(((k0)object0))) {
                    ++v;
                    if(v < 0) {
                        u.Y();
                    }
                }
            }
        }
        return v;
    }

    public final int U() {
        ArrayList arrayList0 = this.g;
        int v = 0;
        if(!(arrayList0 instanceof Collection) || !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                if(k0.r.H(((k0)object0)) || k0.r.F(((k0)object0))) {
                    ++v;
                    if(v < 0) {
                        u.Y();
                    }
                }
            }
        }
        return v;
    }

    private final boolean V(k0 k00) {
        String s = k00.V5();
        if(s == null || s.length() == 0) {
            String s1 = k00.U5();
            return s1 == null || s1.length() == 0;
        }
        return false;
    }

    public final boolean W() {
        ViewHolder recyclerView$ViewHolder0;
        String s = null;
        if(this.getItemCount() > (this.b ? 3 : 2)) {
            return false;
        }
        try {
            k0 k00 = null;
            k00 = (k0)(this.b ? this.g.get(1) : this.g.get(0));
        }
        catch(Exception unused_ex) {
        }
        if(k00 == null) {
            return false;
        }
        if(!k0.r.K(k00) && (!this.b || !k0.r.E(k00))) {
            t t0 = this.l;
            if(t0 != null) {
                RecyclerView recyclerView0 = (RecyclerView)t0.a();
                if(recyclerView0 != null) {
                    try {
                        recyclerView$ViewHolder0 = null;
                        recyclerView$ViewHolder0 = recyclerView0.findViewHolderForAdapterPosition(0);
                    }
                    catch(Exception unused_ex) {
                    }
                    if(recyclerView$ViewHolder0 == null) {
                        return false;
                    }
                    if(recyclerView$ViewHolder0 instanceof y2) {
                        Editable editable0 = ((y2)recyclerView$ViewHolder0).x().getText();
                        if(editable0 != null) {
                            s = editable0.toString();
                        }
                        return s == null || s.length() == 0;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void X(int v, boolean z) {
        ((k0)this.g.get(v)).h6(z);
    }

    private final void Y(k1 k10, int v) {
        Object object0 = this.g.get(v);
        L.o(object0, "get(...)");
        k10.n().setChecked(((k0)object0).T5());
    }

    private final void Z(r1 r10, int v) {
        Object object0 = this.g.get(v);
        L.o(object0, "get(...)");
        String s = ((k0)object0).Q5();
        int v1 = 0;
        boolean z = s != null && s.length() > 0;
        r10.z().setChecked(((k0)object0).T5());
        String s1 = ((k0)object0).V5();
        if(s1 == null || s1.length() == 0) {
            r10.D().setVisibility(0);
            r10.A().setVisibility(8);
            r10.H().setVisibility((z ? 0 : 8));
            r10.F().setVisibility(8);
            r10.G().setVisibility(8);
            r10.C().setVisibility(8);
        }
        else if(L.g(((k0)object0).V5(), "false")) {
            r10.D().setVisibility(0);
            r10.A().setVisibility(8);
            r10.H().setVisibility((z ? 0 : 8));
            r10.F().setVisibility(8);
            r10.G().setVisibility(8);
            r10.C().setVisibility(8);
        }
        else {
            r10.D().setVisibility(8);
            r10.A().setVisibility(0);
            String s2 = ((k0)object0).V5();
            o.a.e(r10.A(), s2).apply();
            r10.C().setVisibility((z ? 0 : 8));
            r10.H().setVisibility(8);
            Uri uri0 = Uri.parse(((k0)object0).V5());
            Uri uri1 = z ? Uri.parse(((k0)object0).Q5()) : null;
            if(z) {
                r10.F().setVisibility(0);
                r10.G().setVisibility(0);
            }
            else {
                r10.F().setVisibility(8);
                r10.G().setVisibility(8);
            }
            r10.x(this, kotlin.collections.l.Ta(new Uri[]{uri0, uri1}), ((k0)object0));
        }
        View view0 = r10.E();
        if(!z) {
            v1 = 8;
        }
        view0.setVisibility(v1);
    }

    private final void a0(A1 a10, int v) {
        Uri uri0;
        Object object0 = this.g.get(v);
        L.o(object0, "get(...)");
        k0 k00 = (k0)object0;
        a10.X().setClickable(false);
        try {
            boolean z = true;
            AutoImageData autoImageData0 = this.p;
            if(autoImageData0 == null || !autoImageData0.w() || autoImageData0.o().size() <= 1) {
                z = false;
            }
            int v1 = 8;
            if(autoImageData0 == null) {
                a10.b0().setVisibility(8);
                a10.W().setVisibility(8);
            }
            else {
                a10.b0().setVisibility((z ? 0 : 8));
                TextView textView0 = a10.W();
                if(L.g(k00.U5(), "post_write_changed_auto_image")) {
                    v1 = 0;
                }
                textView0.setVisibility(v1);
            }
            if(L.g(k00.U5(), "post_write_empty_auto_image")) {
                a10.T();
                return;
            }
            String s = k00.V5();
            if(s == null) {
                uri0 = Uri.EMPTY;
            }
            else {
                uri0 = Uri.parse(s);
                if(uri0 == null) {
                    uri0 = Uri.EMPTY;
                }
            }
            L.m(uri0);
            a10.U(this, uri0, k00, z);
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        Uri uri1 = Uri.EMPTY;
        L.o(uri1, "EMPTY");
        a10.U(this, uri1, k00, false);
    }

    private final void b0(Q1 q10, int v) {
        Object object0 = this.g.get(v);
        L.o(object0, "get(...)");
        q10.N(((k0)object0));
    }

    private final void c0(T1 t10, int v) {
        com.dcinside.app.model.f f0;
        Object object0 = this.g.get(v);
        L.o(object0, "get(...)");
        String s = ((k0)object0).Z5();
        try {
            f0 = null;
            f0 = (com.dcinside.app.model.f)uk.a.r(s, com.dcinside.app.model.f.class);
        }
        catch(Exception unused_ex) {
        }
        if(f0 == null) {
            return;
        }
        Context context0 = t10.itemView.getContext();
        t10.p().setText(context0.getString(0x7F150258, new Object[]{f0.d()}));  // string:def_image_ai_prompt "프롬프트 : %s"
        t10.s().setText(context0.getString(0x7F150259, new Object[]{f0.i()}));  // string:def_image_ai_sampling "샘플링 : %s"
        t10.q().setText(context0.getString(0x7F1507F9, new Object[]{Math.max(0, ((k0)object0).a6())}));  // string:post_write_def_ai_image_remain "(잔여 횟수 : %d회)"
        t10.n().setChecked(((k0)object0).T5());
        String s1 = ((k0)object0).Q5();
        t10.r().setVisibility((s1 == null || s1.length() <= 0 ? 8 : 0));
        if(this.V(((k0)object0))) {
            t10.o().setVisibility(0);
            t10.t().setVisibility(0);
            t10.p().setVisibility(4);
            t10.s().setVisibility(4);
            t10.q().setVisibility(4);
            return;
        }
        t10.o().setVisibility(8);
        t10.t().setVisibility(8);
        t10.p().setVisibility(0);
        t10.s().setVisibility(0);
        t10.q().setVisibility(0);
    }

    private final void d0(G2 g20) {
        g20.f();
    }

    @Override  // Z.b
    public void e(int v) {
    }

    private final void e0(h2 h20, int v) {
        Long long0;
        String s1;
        Uri uri1;
        Uri uri0;
        String[] arr_s;
        Object object0 = this.g.get(v);
        L.o(object0, "get(...)");
        k0 k00 = (k0)object0;
        int v1 = 0;
        h20.a0().setClickable(false);
        try {
            com.dcinside.app.realm.k0.a k0$a0 = k0.r;
            if(k0$a0.D(k00)) {
                uri1 = Uri.parse(k00.V5());
                L.o(uri1, "parse(...)");
                arr_s = k0$a0.P(k00.b6());
                goto label_28;
            }
            else {
                String s = k00.V5();
                if(s == null) {
                    uri0 = Uri.EMPTY;
                    L.o(uri0, "EMPTY");
                    uri1 = uri0;
                    v1 = 8;
                    s1 = "";
                }
                else {
                    File file0 = new File(s);
                    if(file0.exists()) {
                        uri1 = Uri.fromFile(file0);
                        L.o(uri1, "fromFile(...)");
                        s1 = Gk.a(file0.length());
                        L.o(s1, "formatSize(...)");
                    }
                    else {
                        uri0 = Uri.EMPTY;
                        L.o(uri0, "EMPTY");
                        uri1 = uri0;
                        v1 = 8;
                        s1 = "";
                    }
                }
            }
            goto label_32;
        }
        catch(Exception exception0) {
            goto label_36;
        }
        try {
        label_28:
            long0 = null;
            long0 = Long.parseLong(arr_s[1]);
        }
        catch(Exception unused_ex) {
        }
        try {
            s1 = Gk.a((long0 == null ? 0L : ((long)long0)));
            L.o(s1, "formatSize(...)");
        label_32:
            h20.Y().setVisibility(v1);
            h20.W(this, uri1, s1, k00);
            return;
        }
        catch(Exception exception0) {
        }
    label_36:
        exception0.printStackTrace();
        Uri uri2 = Uri.EMPTY;
        L.o(uri2, "EMPTY");
        h20.W(this, uri2, "", k00);
    }

    private final void f0(p2 p20, int v) {
        Object object0 = this.g.get(v);
        L.o(object0, "get(...)");
        String s = ((k0)object0).b6();
        if(s == null) {
            return;
        }
        P p0 = (P)uk.a.r(s, P.class);
        if(p0 == null) {
            return;
        }
        p20.p().setText(p20.itemView.getContext().getString(0x7F1507A9, new Object[]{p0.k()}));  // string:poll_subject_title "[투표] %s"
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        boolean z = false;
        for(Object object0: this.k) {
            z |= ((f)object0).g();
        }
        return z;
    }

    private final void g0(m2 m20, int v) {
        Object object0 = this.g.get(v);
        L.o(object0, "get(...)");
        m20.v(((k0)object0));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter, Z.b
    public int getItemCount() {
        return this.g.size() + 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        k0 k00 = null;
        try {
            if(v != this.g.size()) {
                k00 = (k0)this.g.get(v);
            }
        }
        catch(Exception unused_ex) {
        }
        if(k00 == null) {
            return 13;
        }
        com.dcinside.app.realm.k0.a k0$a0 = k0.r;
        if(k0$a0.N(k00)) {
            return 5;
        }
        if(k0$a0.M(k00)) {
            return 6;
        }
        if(k0$a0.J(k00)) {
            return 1;
        }
        if(k0$a0.I(k00)) {
            return 7;
        }
        if(k0$a0.H(k00)) {
            return 8;
        }
        if(k0$a0.F(k00)) {
            return 9;
        }
        if(k0$a0.A(k00)) {
            return 10;
        }
        if(k0$a0.G(k00)) {
            return 11;
        }
        if(k0$a0.w(k00)) {
            return 12;
        }
        if(k0$a0.z(k00)) {
            return 14;
        }
        if(k0$a0.v(k00)) {
            return 15;
        }
        if(k0$a0.C(k00)) {
            return 4;
        }
        return k0$a0.y(k00) ? 16 : 3;
    }

    private final void h0(s2 s20, int v) {
        String s1;
        s20.itemView.getContext();
        Object object0 = this.g.get(v);
        L.o(object0, "get(...)");
        String s = ((k0)object0).b6();
        try {
            s1 = null;
            s1 = ((org.jsoup.nodes.o)g.m(s).E1("dc_series").get(0)).S0().u().S2();
        }
        catch(Exception unused_ex) {
        }
        if(s1 == null || s1.length() == 0) {
            s20.p().setText("시리즈를 찾을 수 없습니다.");
        }
        else {
            s20.p().setText(s1);
        }
        ((k0)object0).U5();
    }

    private final void i0(y2 y20, int v) {
        y20.x().l(((k0)this.g.get(v)).b6());
        if(this.h == v) {
            this.H(y20.x(), v);
        }
        y20.t();
        y20.N(this.q);
        if(!this.W()) {
            this.E();
        }
    }

    private final void j0(B2 b20, int v) {
        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(1);
            }

            @l
            public final com.bumptech.glide.m a(@l com.bumptech.glide.m m0) {
                L.p(m0, "it");
                com.bumptech.glide.m m1 = m0.V0(i.f1());
                L.o(m1, "apply(...)");
                return m1;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.bumptech.glide.m)object0));
            }
        }

        int v1;
        VideoInfoData videoInfoData0;
        Object object0 = this.g.get(v);
        L.o(object0, "get(...)");
        k0 k00 = (k0)object0;
        s.h(b20.r(), k00.V5()).i(c.e);
        StringBuilder stringBuilder0 = null;
        try {
            String s = k00.U5();
            videoInfoData0 = null;
            videoInfoData0 = (VideoInfoData)uk.a.r(s, VideoInfoData.class);
            v1 = 8;
        }
        catch(Exception unused_ex) {
        }
        if(videoInfoData0 == null) {
            b20.p().setVisibility(8);
            b20.o().setVisibility(8);
            b20.q().setVisibility(8);
            return;
        }
        b20.p().setVisibility(0);
        b20.o().setVisibility(0);
        b20.q().setVisibility(0);
        String s1 = videoInfoData0.r();
        b20.o().setText(s1);
        if(s1 == null || s1.length() == 0) {
            b20.o().setVisibility(8);
        }
        else {
            b20.o().setVisibility(0);
        }
        TextView textView0 = b20.q();
        String s2 = videoInfoData0.u();
        if(s2 != null) {
            List list0 = v.V4(s2, new String[]{"|"}, false, 0, 6, null);
            stringBuilder0 = new StringBuilder();
            for(Object object1: list0) {
                String s3 = (String)object1;
                if(s3.length() != 0) {
                    stringBuilder0.append("#");
                    stringBuilder0.append(s3);
                    stringBuilder0.append(' ');
                }
            }
        }
        textView0.setText(stringBuilder0);
        TextView textView1 = b20.q();
        CharSequence charSequence0 = b20.q().getText();
        if(charSequence0 != null && charSequence0.length() != 0) {
            v1 = 0;
        }
        textView1.setVisibility(v1);
    }

    private final void k0(F2 f20, int v) {
        WebView webView0 = f20.o();
        if(webView0 == null) {
            return;
        }
        webView0.onResume();
        Object object0 = webView0.getTag(0x7F0B1101);  // id:write_item_voice_load_hash
        String s = ((k0)this.g.get(v)).b6();
        if(s == null) {
            s = "";
        }
        String s1 = (String)this.j.get(s);
        if(s1 == null) {
            Context context0 = f20.itemView.getContext();
            L.m(context0);
            org.jsoup.nodes.f f0 = Dl.A(s);
            L.o(f0, "soup(...)");
            s1 = y.u(context0, f0, false, true, true, 0, null, false, null, false, false, false, 0xFC0, null).i().toString();
            this.j.put(s, s1);
        }
        int v1 = s1.hashCode();
        if(object0 == null || !L.g(object0, v1)) {
            j j0 = j.c(webView0);
            if(j0 != null) {
                j0.i();
            }
            com.dcinside.app.view.tool.j.h(webView0, this.e);
            WebViews.r(webView0, s1);
            webView0.setTag(0x7F0B1101, v1);  // id:write_item_voice_load_hash
        }
    }

    @Override  // Z.b
    @SuppressLint({"NotifyDataSetChanged"})
    public boolean l(int v, int v1) {
        int v2 = this.g.size();
        if(v != v2 && v1 != v2) {
            if(v >= 0 && v2 > v) {
                if(v1 >= 0 && v2 > v1) {
                    Object object0 = this.g.remove(v);
                    L.o(object0, "removeAt(...)");
                    this.g.add(v1, ((k0)object0));
                    this.notifyItemMoved(v, v1);
                    return true;
                }
                this.notifyDataSetChanged();
                return false;
            }
            this.notifyDataSetChanged();
        }
        return false;
    }

    private final void l0(J2 j20, int v) {
        static final class d extends N implements Function1 {
            public static final d e;

            static {
                d.e = new d();
            }

            d() {
                super(1);
            }

            @l
            public final com.bumptech.glide.m a(@l com.bumptech.glide.m m0) {
                L.p(m0, "it");
                com.bumptech.glide.m m1 = m0.V0(i.f1());
                L.o(m1, "apply(...)");
                return m1;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.bumptech.glide.m)object0));
            }
        }

        s.h(j20.p(), "https://img.youtube.com/vi/" + ((k0)this.g.get(v)).d6() + "/hqdefault.jpg").i(d.e);
    }

    @Override  // Z.b
    public void m(int v) {
    }

    public final void m0(int v) {
        Object object0 = this.g.get(v);
        L.o(object0, "get(...)");
        if(((k0)object0).c6() != 16) {
            return;
        }
        AutoImageData autoImageData0 = this.p;
        if(autoImageData0 == null) {
            return;
        }
        List list0 = autoImageData0.o();
        if(list0.isEmpty()) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: list0) {
            if(((AutoImage)object1).l() != ((k0)object0).R5()) {
                arrayList0.add(object1);
            }
        }
        AutoImage autoImage0 = (AutoImage)u.M4(arrayList0, kotlin.random.f.a);
        if(autoImage0 == null) {
            return;
        }
        ((k0)object0).j6("");
        ((k0)object0).f6(autoImage0.l());
        this.notifyItemChanged(v);
    }

    // 检测为 Lambda 实现
    private static final void n0(d1 d10, G2 g20, View view0, boolean z) [...]

    public final void o0() {
        Object object0 = null;
        for(Object object1: this.g) {
            if(this.V(((k0)object1))) {
                object0 = object1;
                break;
            }
        }
        if(((k0)object0) == null) {
            return;
        }
        int v = this.g.indexOf(((k0)object0));
        this.g.remove(((k0)object0));
        this.notifyItemRemoved(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.l = new t(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof J2) {
            this.l0(((J2)recyclerView$ViewHolder0), v);
        }
        else if(recyclerView$ViewHolder0 instanceof y2) {
            this.i0(((y2)recyclerView$ViewHolder0), v);
        }
        else if(recyclerView$ViewHolder0 instanceof h2) {
            this.e0(((h2)recyclerView$ViewHolder0), v);
        }
        else if(recyclerView$ViewHolder0 instanceof Q1) {
            this.b0(((Q1)recyclerView$ViewHolder0), v);
        }
        else if(recyclerView$ViewHolder0 instanceof F2) {
            this.k0(((F2)recyclerView$ViewHolder0), v);
        }
        else if(recyclerView$ViewHolder0 instanceof p2) {
            this.f0(((p2)recyclerView$ViewHolder0), v);
        }
        else if(recyclerView$ViewHolder0 instanceof B2) {
            this.j0(((B2)recyclerView$ViewHolder0), v);
        }
        else if(recyclerView$ViewHolder0 instanceof s2) {
            this.h0(((s2)recyclerView$ViewHolder0), v);
        }
        else if(recyclerView$ViewHolder0 instanceof m2) {
            this.g0(((m2)recyclerView$ViewHolder0), v);
        }
        else if(recyclerView$ViewHolder0 instanceof r1) {
            this.Z(((r1)recyclerView$ViewHolder0), v);
        }
        else if(recyclerView$ViewHolder0 instanceof T1) {
            this.c0(((T1)recyclerView$ViewHolder0), v);
        }
        else if(recyclerView$ViewHolder0 instanceof k1) {
            this.Y(((k1)recyclerView$ViewHolder0), v);
        }
        else if(recyclerView$ViewHolder0 instanceof G2) {
            this.d0(((G2)recyclerView$ViewHolder0));
        }
        else if(recyclerView$ViewHolder0 instanceof A1) {
            this.a0(((A1)recyclerView$ViewHolder0), v);
        }
        if(v == this.h) {
            this.h = -1;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteAdapter$onCreateViewHolder$1", f = "PostWriteAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final d1 l;

            e(d1 d10, kotlin.coroutines.d d0) {
                this.l = d10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new e(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.F();
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        switch(v) {
            case 3: {
                return new h2(viewGroup0);
            }
            case 4: {
                return new Q1(viewGroup0);
            }
            case 5: {
                return new J2(viewGroup0);
            }
            case 6: {
                if(this.o) {
                    return new F2(viewGroup0, null);
                }
                Context context0 = viewGroup0.getContext();
                VideoEnabledWebView videoEnabledWebView0 = new VideoEnabledWebView(context0);
                videoEnabledWebView0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                L.m(context0);
                videoEnabledWebView0.setBackgroundColor(vk.b(context0, 0x1010054));
                f f0 = B.a.e(videoEnabledWebView0);
                this.k.add(f0);
                return new F2(viewGroup0, videoEnabledWebView0);
            }
            case 7: {
                return new p2(viewGroup0);
            }
            case 8: 
            case 9: {
                return new B2(viewGroup0);
            }
            case 10: {
                return new s2(viewGroup0);
            }
            case 11: {
                return new m2(viewGroup0);
            }
            case 12: {
                return new r1(viewGroup0);
            }
            case 13: {
                View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0243, viewGroup0, false);  // layout:view_post_write_warning
                L.m(view0);
                r.M(view0, null, new e(this, null), 1, null);
                ViewHolder recyclerView$ViewHolder0 = new G2(view0);
                com.dcinside.app.util.ql.a.a(view0, (View view0, boolean z) -> {
                    L.p(this, "this$0");
                    L.p(((G2)recyclerView$ViewHolder0), "$holder");
                    if(z) {
                        L2 l20 = this.a;
                        if(l20 != null) {
                            l20.e(((G2)recyclerView$ViewHolder0));
                        }
                    }
                });
                return recyclerView$ViewHolder0;
            }
            case 14: {
                return new T1(viewGroup0);
            }
            case 15: {
                return new k1(viewGroup0);
            }
            case 16: {
                return new A1(viewGroup0);
            }
            default: {
                return new y2(viewGroup0);
            }
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        this.o = true;
        this.c.clear();
        this.d.clear();
        RecyclerView recyclerView0 = this.l == null ? null : ((RecyclerView)this.l.a());
        if(recyclerView0 != null) {
            Runnable runnable0 = this.i;
            if(runnable0 != null) {
                recyclerView0.removeCallbacks(runnable0);
            }
        }
        this.l = null;
        this.i = null;
        this.j.clear();
        for(Object object0: this.k) {
            ((f)object0).onDestroy();
        }
        this.k.clear();
        L2 l20 = this.a;
        if(l20 != null) {
            l20.h();
        }
        this.a = null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        AdapterDataObserver recyclerView$AdapterDataObserver0 = this.f;
        if(recyclerView$AdapterDataObserver0 != null) {
            this.unregisterAdapterDataObserver(recyclerView$AdapterDataObserver0);
        }
        this.f = null;
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
        for(Object object0: this.k) {
            ((f)object0).onPause();
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
        for(Object object0: this.k) {
            ((f)object0).onResume();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewRecycled(@l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView$ViewHolder0, "h");
        super.onViewRecycled(recyclerView$ViewHolder0);
        if(recyclerView$ViewHolder0 instanceof h2) {
            ((h2)recyclerView$ViewHolder0).O();
            return;
        }
        if(recyclerView$ViewHolder0 instanceof F2) {
            WebView webView0 = ((F2)recyclerView$ViewHolder0).o();
            if(webView0 != null) {
                webView0.onPause();
            }
        }
        else if(recyclerView$ViewHolder0 instanceof y2) {
            ((y2)recyclerView$ViewHolder0).J();
        }
    }

    public final void p0(@l int[] arr_v) {
        L.p(arr_v, "ignorePositions");
        Integer integer0 = this.g.size();
        if(integer0.intValue() <= 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            SparseArray sparseArray0 = new SparseArray();
            int v1 = this.K();
            for(int v2 = 0; v2 < v - 1; ++v2) {
                if(v1 != v2 && !kotlin.collections.l.q8(arr_v, v2)) {
                    Object object0 = this.g.get(v2);
                    L.o(object0, "get(...)");
                    k0 k00 = (k0)object0;
                    if(k0.r.K(k00)) {
                        sparseArray0.put(v2, k00);
                    }
                }
            }
            int v3 = sparseArray0.size();
            if(v3 > 0) {
                for(int v4 = 0; v4 < v3; ++v4) {
                    int v5 = sparseArray0.keyAt(v4);
                    k0 k01 = (k0)sparseArray0.get(v5);
                    this.g.remove(k01);
                    this.c.remove(k01);
                    this.d.remove(k01);
                    this.notifyItemRemoved(v5);
                }
            }
            int v6 = this.g.size();
            if(v6 - 1 >= 0) {
                com.dcinside.app.realm.k0.a k0$a0 = k0.r;
                if(!k0$a0.J(((k0)this.g.get(v6 - 1)))) {
                    k0 k02 = k0$a0.j();
                    this.g.add(k02);
                    this.notifyItemInserted(v6 - 1);
                }
            }
            if(this.q != null && !this.W()) {
                this.q = null;
                this.notifyItemRangeChanged(0, this.getItemCount());
            }
        }
    }

    @Override  // Z.b
    public void q(int v) {
        k0 k01;
        if(v >= 0 && v < this.g.size()) {
            Object object0 = this.g.get(v);
            L.o(object0, "get(...)");
            k0 k00 = (k0)object0;
            try {
                k01 = null;
                k01 = (k0)this.g.remove(v);
            }
            catch(Exception unused_ex) {
            }
            if(k01 != null) {
                this.c.remove(k01);
                this.d.remove(k01);
            }
            this.notifyItemRemoved(v);
            com.dcinside.app.realm.k0.a k0$a0 = k0.r;
            int v1 = 0;
            if(k0$a0.D(k00) && !k0$a0.C(k00)) {
                try {
                    String[] arr_s = k0$a0.P(k00.b6());
                    int v2 = Integer.parseInt(((String[])v.V4(arr_s[0], new String[]{"_"}, false, 0, 6, null).toArray(new String[0]))[3]);
                    this.n.add(arr_s[2]);
                    for(Object object1: this.g) {
                        k0 k02 = (k0)object1;
                        com.dcinside.app.realm.k0.a k0$a1 = k0.r;
                        if(k0$a1.D(k02) && !k0$a1.C(k02)) {
                            String[] arr_s1 = k0$a1.P(k02.b6());
                            if(Integer.parseInt(((String[])v.V4(arr_s1[0], new String[]{"_"}, false, 0, 6, null).toArray(new String[0]))[3]) > v2) {
                                String[] arr_s2 = (String[])v.V4(arr_s1[0], new String[]{"_"}, false, 0, 6, null).toArray(new String[0]);
                                arr_s2[3] = String.valueOf(Integer.parseInt(arr_s2[3]) - 1);
                                String s = TextUtils.join("_", arr_s2);
                                L.o(s, "join(...)");
                                arr_s1[0] = s;
                                k02.p6(k0$a1.O(((String[])Arrays.copyOf(arr_s1, arr_s1.length))));
                            }
                        }
                    }
                }
                catch(Exception unused_ex) {
                    return;
                }
                return;
            }
            if(k0$a0.M(k00)) {
                int v3 = k00.X5();
                if(v3 != 0) {
                    Iterator iterator1 = this.g.iterator();
                    while(true) {
                        if(!iterator1.hasNext()) {
                            v1 = -1;
                            break;
                        }
                        Object object2 = iterator1.next();
                        if(((k0)object2).X5() == v3) {
                            break;
                        }
                        ++v1;
                    }
                    if(v1 >= 0) {
                        this.g.remove(v1);
                        this.notifyItemRemoved(v1);
                    }
                }
            }
        }
        try {
        }
        catch(Exception unused_ex) {
        }
    }

    public final void q0(@l AutoImageData autoImageData0) {
        L.p(autoImageData0, "autoImageData");
        this.p = autoImageData0;
    }

    public final void r0(boolean z) {
        this.b = z;
    }

    public final void s0() {
        this.b = false;
        L2 l20 = this.a;
        if(l20 != null) {
            l20.c(this.W());
        }
    }

    public final void t0(@l String s, int v, @m String s1) {
        Object object0 = null;
        L.p(s, "data");
        for(Object object1: this.g) {
            if(this.V(((k0)object1))) {
                object0 = object1;
                break;
            }
        }
        if(((k0)object0) == null) {
            return;
        }
        ((k0)object0).i6(s);
        ((k0)object0).o6(v);
        ((k0)object0).e6(s1);
        this.notifyItemChanged(this.g.indexOf(((k0)object0)));
    }

    public final void u0(@m String s) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = new CopyOnWriteArrayList(this.g);
        if(s == null || !this.W()) {
            s = null;
        }
        int v = -1;
        this.q = s;
        ListIterator listIterator0 = copyOnWriteArrayList0.listIterator(copyOnWriteArrayList0.size());
        while(listIterator0.hasPrevious()) {
            if(((k0)listIterator0.previous()).c6() == 1) {
                v = listIterator0.nextIndex();
                break;
            }
        }
        if(v >= 0) {
            this.notifyItemChanged(v);
        }
    }

    public final void z(int v) {
        if(this.l != null && ((RecyclerView)this.l.a()) != null) {
            k0 k00 = k0.r.j();
            this.g.add(v, k00);
            this.notifyItemInserted(v);
            this.p0(new int[]{v});
            int v1 = this.g.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(this.g.get(v2) == k00) {
                    v = v2;
                    break;
                }
            }
            this.G(v);
        }
    }
}

