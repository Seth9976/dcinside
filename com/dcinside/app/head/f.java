package com.dcinside.app.head;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.dcinside.app.model.PostModify;
import com.dcinside.app.model.Q;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.q;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.response.PostHead;
import com.dcinside.app.util.vk;
import com.google.android.material.tabs.TabLayout.i;
import com.google.android.material.tabs.TabLayout;
import io.realm.F0;
import io.realm.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nPostHeadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostHeadManager.kt\ncom/dcinside/app/head/PostHeadManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ModelExtension.kt\ncom/dcinside/app/internal/ModelExtensionKt\n*L\n1#1,284:1\n1#2:285\n9#3:286\n*S KotlinDebug\n*F\n+ 1 PostHeadManager.kt\ncom/dcinside/app/head/PostHeadManager\n*L\n85#1:286\n*E\n"})
public final class f implements com.google.android.material.tabs.TabLayout.f {
    @s0({"SMAP\nPostHeadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostHeadManager.kt\ncom/dcinside/app/head/PostHeadManager$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ModelExtension.kt\ncom/dcinside/app/internal/ModelExtensionKt\n*L\n1#1,284:1\n774#2:285\n865#2,2:286\n774#2:288\n865#2,2:289\n774#2:291\n865#2,2:292\n295#2,2:297\n1#3:294\n9#4:295\n15#4:296\n*S KotlinDebug\n*F\n+ 1 PostHeadManager.kt\ncom/dcinside/app/head/PostHeadManager$Companion\n*L\n199#1:285\n199#1:286,2\n204#1:288\n204#1:289,2\n209#1:291\n209#1:292,2\n241#1:297,2\n239#1:295\n241#1:296\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final com.dcinside.app.head.a a(@l Context context0, @m PostModify postModify0) {
            String s1;
            PostHead postHead1;
            List list0;
            L.p(context0, "context");
            String s = B.E.k0();
            boolean z = s != null && s.length() > 0;
            boolean z1 = z && PostModify.x.c(postModify0, s);
            ArrayList arrayList0 = new ArrayList();
            if(postModify0 == null) {
                list0 = u.H();
            }
            else {
                list0 = this.f(postModify0);
                if(list0 == null) {
                    list0 = u.H();
                }
            }
            if((postModify0 != null && (postModify0.I() != null && false) || postModify0 != null && (postModify0.I() != null && false)) && z1) {
                if(list0.isEmpty()) {
                    arrayList0.add(0, new PostHead(-1, "일반", 0, !postModify0.K(), false, 20, null));
                }
                else {
                    arrayList0.addAll(list0);
                }
                arrayList0.add(new PostHead(999, "매니저", 9, postModify0.K(), false, 16, null));
            }
            else if(!list0.isEmpty()) {
                arrayList0.addAll(list0);
            }
            if(postModify0 != null) {
                boolean z2 = postModify0.I() == null;
            }
            if(postModify0 != null && postModify0.K()) {
                for(Object object0: arrayList0) {
                    PostHead postHead0 = (PostHead)object0;
                    if(postHead0 != null && postHead0.i() == 999 && postHead0.l() == 9) {
                        return new com.dcinside.app.head.a(z, z1, arrayList0, false, ((PostHead)object0));
                    }
                    if(false) {
                        break;
                    }
                }
                return new com.dcinside.app.head.a(z, z1, arrayList0, false, null);
            }
            for(Object object1: arrayList0) {
                if(postModify0 == null) {
                    s1 = null;
                }
                else {
                    List list1 = postModify0.M();
                    if(list1 == null) {
                        postHead1 = null;
                    }
                    else {
                        for(Object object2: list1) {
                            Integer integer0 = postModify0.L();
                            if(integer0 == null || ((PostHead)object2).i() != ((int)integer0)) {
                                continue;
                            }
                            goto label_44;
                        }
                        object2 = null;
                    label_44:
                        postHead1 = (PostHead)object2;
                    }
                    if(postHead1 != null) {
                        s1 = postHead1.m();
                    }
                }
                if(L.g(s1, ((PostHead)object1).m())) {
                    return new com.dcinside.app.head.a(z, z1, arrayList0, false, ((PostHead)object1));
                }
                if(false) {
                    break;
                }
            }
            return new com.dcinside.app.head.a(z, z1, arrayList0, false, null);
        }

        @l
        @n
        public final com.dcinside.app.head.a b(@l Context context0, @m GalleryInfo galleryInfo0) {
            List list0;
            L.p(context0, "context");
            String s = B.E.k0();
            boolean z = s != null && s.length() > 0;
            boolean z1 = z && GalleryInfo.Q8.a(galleryInfo0, s);
            ArrayList arrayList0 = new ArrayList();
            if(galleryInfo0 == null) {
                list0 = u.H();
            }
            else {
                list0 = this.g(galleryInfo0);
                if(list0 == null) {
                    list0 = u.H();
                }
            }
            if((galleryInfo0 != null && (galleryInfo0.q() != null && false) || galleryInfo0 != null && (galleryInfo0.q() != null && false)) && z1) {
                if(list0.isEmpty()) {
                    arrayList0.add(0, new PostHead(-1, "일반", 0, true, false, 20, null));
                }
                else {
                    arrayList0.addAll(list0);
                }
                arrayList0.add(new PostHead(999, "매니저", 9, false, false, 24, null));
                return galleryInfo0 == null || galleryInfo0.q() == null ? new com.dcinside.app.head.a(z, z1, arrayList0, false, null) : new com.dcinside.app.head.a(z, z1, arrayList0, false, null);
            }
            if(!list0.isEmpty()) {
                arrayList0.addAll(list0);
            }
            return galleryInfo0 == null || galleryInfo0.q() == null ? new com.dcinside.app.head.a(z, z1, arrayList0, false, null) : new com.dcinside.app.head.a(z, z1, arrayList0, false, null);
        }

        @l
        @n
        public final e c(@l Context context0, @m Q q0, @m TextView textView0, @m PostHead postHead0, @m b e$b0) {
            L.p(context0, "context");
            String s = B.E.k0();
            boolean z = s != null && s.length() > 0;
            boolean z1 = z && Q.n0.b(q0, s);
            if(q0 != null) {
                List list0 = this.e(q0);
                return list0 == null ? new e(context0, textView0, z, z1, u.H(), postHead0, e$b0) : new e(context0, textView0, z, z1, list0, postHead0, e$b0);
            }
            return new e(context0, textView0, z, z1, u.H(), postHead0, e$b0);
        }

        public static e d(a f$a0, Context context0, Q q0, TextView textView0, PostHead postHead0, b e$b0, int v, Object object0) {
            PostHead postHead1 = (v & 8) == 0 ? postHead0 : null;
            return (v & 16) == 0 ? f$a0.c(context0, q0, textView0, postHead1, e$b0) : f$a0.c(context0, q0, textView0, postHead1, null);
        }

        private final List e(Q q0) {
            List list0 = q0.M0();
            if(list0 == null) {
                return null;
            }
            List list1 = new ArrayList();
            for(Object object0: list0) {
                String s = ((PostHead)object0).m();
                if(s != null && s.length() > 0) {
                    list1.add(object0);
                }
            }
            return list1;
        }

        private final List f(PostModify postModify0) {
            List list0 = postModify0.M();
            if(list0 == null) {
                return null;
            }
            List list1 = new ArrayList();
            for(Object object0: list0) {
                String s = ((PostHead)object0).m();
                if(s != null && s.length() > 0) {
                    list1.add(object0);
                }
            }
            return list1;
        }

        private final List g(GalleryInfo galleryInfo0) {
            List list0 = galleryInfo0.w();
            if(list0 == null) {
                return null;
            }
            List list1 = new ArrayList();
            for(Object object0: list0) {
                String s = ((PostHead)object0).m();
                if(s != null && s.length() > 0) {
                    list1.add(object0);
                }
            }
            return list1;
        }
    }

    @m
    private TabLayout a;
    @m
    private Function1 b;
    @m
    private PostHead c;
    @m
    private List d;
    @m
    private I0 e;
    @m
    private I0 f;
    private boolean g;
    @l
    public static final a h;

    static {
        f.h = new a(null);
    }

    public f(@m TabLayout tabLayout0, @m Function1 function10) {
        this.a = tabLayout0;
        this.b = function10;
        this.d = u.H();
        TabLayout tabLayout1 = this.a;
        if(tabLayout1 != null) {
            tabLayout1.setVisibility(8);
        }
    }

    @Override  // com.google.android.material.tabs.TabLayout$c
    public void N(@m i tabLayout$i0) {
    }

    @Override  // com.google.android.material.tabs.TabLayout$c
    public void R(@m i tabLayout$i0) {
    }

    @l
    @n
    public static final com.dcinside.app.head.a e(@l Context context0, @m PostModify postModify0) {
        return f.h.a(context0, postModify0);
    }

    @l
    @n
    public static final com.dcinside.app.head.a f(@l Context context0, @m GalleryInfo galleryInfo0) {
        return f.h.b(context0, galleryInfo0);
    }

    public final void g(@l Context context0, @m GalleryInfo galleryInfo0) {
        L.p(context0, "context");
        I0 i00 = this.e;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.e = this.m(context0, galleryInfo0);
    }

    public final void h() {
        I0 i00 = this.f;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.f = null;
        I0 i01 = this.e;
        if(i01 != null) {
            kotlinx.coroutines.I0.a.b(i01, null, 1, null);
        }
        this.e = null;
    }

    public final boolean i() {
        return this.g;
    }

    @Override  // com.google.android.material.tabs.TabLayout$c
    public void j(@m i tabLayout$i0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.head.PostHeadManager$onTabSelected$1", f = "PostHeadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements A3.o {
            int k;
            final i l;
            final f m;

            c(i tabLayout$i0, f f0, d d0) {
                this.l = tabLayout$i0;
                this.m = f0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new c(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                i tabLayout$i0 = this.l;
                if(tabLayout$i0 != null) {
                    int v = tabLayout$i0.k();
                    PostHead postHead0 = null;
                    if(v > 0) {
                        f f0 = this.m;
                        List list0 = f0.d;
                        if(list0 != null) {
                            postHead0 = (PostHead)list0.get(v);
                        }
                        f0.r(postHead0);
                        Function1 function10 = this.m.b;
                        if(function10 != null) {
                            function10.invoke(this.m.k());
                            return S0.a;
                        }
                    }
                    else {
                        this.m.r(null);
                        Function1 function11 = this.m.b;
                        if(function11 != null) {
                            function11.invoke(null);
                        }
                    }
                    return S0.a;
                }
                return S0.a;
            }
        }

        I0 i00 = this.f;
        I0 i01 = null;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        TabLayout tabLayout0 = this.a;
        if(tabLayout0 != null) {
            LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.a(tabLayout0);
            if(lifecycleOwner0 != null) {
                LifecycleCoroutineScope lifecycleCoroutineScope0 = LifecycleOwnerKt.a(lifecycleOwner0);
                if(lifecycleCoroutineScope0 != null) {
                    i01 = k.f(lifecycleCoroutineScope0, h0.e(), null, new c(tabLayout$i0, this, null), 2, null);
                }
            }
        }
        this.f = i01;
    }

    @m
    public final PostHead k() {
        return this.c;
    }

    @m
    public final PostHead l(int v) {
        if(v < 0) {
            return null;
        }
        PostHead postHead0 = this.d == null ? null : ((PostHead)this.d.get(v));
        return postHead0 == null || postHead0.i() != 999 || postHead0.l() != 9 ? null : postHead0;
    }

    private final I0 m(Context context0, GalleryInfo galleryInfo0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.head.PostHeadManager$launchApply$1", f = "PostHeadManager.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostHeadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostHeadManager.kt\ncom/dcinside/app/head/PostHeadManager$launchApply$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,284:1\n120#2,3:285\n124#2:290\n1#3:288\n1#3:289\n774#4:291\n865#4,2:292\n*S KotlinDebug\n*F\n+ 1 PostHeadManager.kt\ncom/dcinside/app/head/PostHeadManager$launchApply$1\n*L\n93#1:285,3\n93#1:290\n93#1:288\n94#1:291\n94#1:292,2\n*E\n"})
        static final class com.dcinside.app.head.f.b extends o implements A3.o {
            int k;
            final f l;
            final GalleryInfo m;
            final Context n;

            com.dcinside.app.head.f.b(f f0, GalleryInfo galleryInfo0, Context context0, d d0) {
                this.l = f0;
                this.m = galleryInfo0;
                this.n = context0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.dcinside.app.head.f.b(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.head.f.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.head.PostHeadManager$launchApply$1$1", f = "PostHeadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nPostHeadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostHeadManager.kt\ncom/dcinside/app/head/PostHeadManager$launchApply$1$1\n+ 2 ModelExtension.kt\ncom/dcinside/app/internal/ModelExtensionKt\n*L\n1#1,284:1\n9#2:285\n*S KotlinDebug\n*F\n+ 1 PostHeadManager.kt\ncom/dcinside/app/head/PostHeadManager$launchApply$1$1\n*L\n134#1:285\n*E\n"})
                static final class com.dcinside.app.head.f.b.a extends o implements A3.o {
                    int k;
                    final GalleryInfo l;
                    final List m;
                    final Context n;
                    final f o;

                    com.dcinside.app.head.f.b.a(GalleryInfo galleryInfo0, List list0, Context context0, f f0, d d0) {
                        this.l = galleryInfo0;
                        this.m = list0;
                        this.n = context0;
                        this.o = f0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.head.f.b.a(this.l, this.m, this.n, this.o, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.head.f.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        String s1;
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        ArrayList arrayList0 = new ArrayList();
                        String s = B.E.k0();
                        boolean z = GalleryInfo.Q8.a(this.l, s);
                        if((this.l != null && (this.l.q() != null && false) || this.l != null && (this.l.q() != null && false)) && z) {
                            if(this.m.isEmpty()) {
                                arrayList0.add(0, new PostHead(0, "일반", 0, false, false, 29, null));
                            }
                            else {
                                arrayList0.add(0, new PostHead(0, "전체", 0, false, false, 29, null));
                            }
                            arrayList0.addAll(this.m);
                            arrayList0.add(new PostHead(999, "매니저", 9, false, false, 24, null));
                        }
                        else if(!this.m.isEmpty()) {
                            arrayList0.add(0, new PostHead(0, "전체", 0, false, false, 29, null));
                            arrayList0.addAll(this.m);
                        }
                        if(L.g(this.o.d, arrayList0)) {
                            return S0.a;
                        }
                        TabLayout tabLayout0 = this.o.a;
                        if(tabLayout0 == null) {
                            return S0.a;
                        }
                        tabLayout0.N(this.o);
                        int v = arrayList0.size();
                        int v1 = tabLayout0.getTabCount();
                        if(v1 > v) {
                            int v2 = v1 - 1;
                            if(v <= v2) {
                                while(true) {
                                    tabLayout0.P(v2);
                                    if(v2 == v) {
                                        break;
                                    }
                                    --v2;
                                }
                            }
                        }
                        for(int v3 = 0; v3 < v; ++v3) {
                            PostHead postHead0 = (PostHead)arrayList0.get(v3);
                            if(postHead0 == null || postHead0.i() != 999 || postHead0.l() != 9) {
                                s1 = postHead0.m();
                            }
                            else {
                                int v4 = vk.b(this.n, 0x7F0403EF);  // attr:managerHeadColor
                                s1 = new SpannableStringBuilder(postHead0.m());
                                ((SpannableStringBuilder)s1).setSpan(new ForegroundColorSpan(v4), 0, ((SpannableStringBuilder)s1).length(), 33);
                            }
                            String s2 = postHead0.i() + postHead0.m() + postHead0.l();
                            if(v1 > v3) {
                                i tabLayout$i0 = tabLayout0.D(v3);
                                if(tabLayout$i0 != null && !L.g(tabLayout$i0.m(), s2)) {
                                    tabLayout$i0.D(s1);
                                    tabLayout$i0.B(s2);
                                }
                            }
                            else {
                                i tabLayout$i1 = tabLayout0.I();
                                L.o(tabLayout$i1, "newTab(...)");
                                tabLayout$i1.D(s1);
                                tabLayout$i1.B(s2);
                                tabLayout0.i(tabLayout$i1);
                            }
                        }
                        this.o.d = arrayList0;
                        tabLayout0.h(this.o);
                        tabLayout0.setVisibility((tabLayout0.getTabCount() == 0 ? 8 : 0));
                        if(L.g((this.l == null ? null : this.l.r()), "dcbest")) {
                            tabLayout0.setTabGravity(0);
                            tabLayout0.setTabMode(1);
                            return S0.a;
                        }
                        tabLayout0.setTabGravity(0);
                        tabLayout0.setTabMode(0);
                        return S0.a;
                    }
                }

                List list2;
                q q1;
                T0 t00;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        List list0 = this.l.d;
                        if(list0 != null && !list0.isEmpty() == 1 && !this.l.i()) {
                            return S0.a;
                        }
                        this.l.q(false);
                        F0 f00 = F0.g4();
                        try {
                            L.m(f00);
                            t00 = null;
                            q q0 = q.o.b(f00, (this.m == null ? null : this.m.r()));
                            q1 = q0 == null ? null : ((q)f00.d2(q0));
                            goto label_22;
                        }
                        catch(Throwable throwable0) {
                        }
                        try {
                            throw throwable0;
                        }
                        catch(Throwable throwable1) {
                            kotlin.io.c.a(f00, throwable0);
                            throw throwable1;
                        }
                    label_22:
                        kotlin.io.c.a(f00, null);
                        if(q1 != null) {
                            t00 = q1.U5();
                        }
                        GalleryInfo galleryInfo0 = this.m;
                        if(galleryInfo0 == null) {
                            list2 = u.H();
                        }
                        else {
                            List list1 = galleryInfo0.w();
                            if(list1 == null) {
                                list2 = u.H();
                            }
                            else {
                                list2 = new ArrayList();
                                for(Object object2: list1) {
                                    if(t00 == null || t00.isEmpty() || !t00.contains(kotlin.coroutines.jvm.internal.b.f(((PostHead)object2).i()))) {
                                        list2.add(object2);
                                    }
                                }
                            }
                        }
                        com.dcinside.app.head.f.b.a f$b$a0 = new com.dcinside.app.head.f.b.a(this.m, list2, this.n, this.l, null);
                        this.k = 1;
                        return kotlinx.coroutines.i.h(h0.e(), f$b$a0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        TabLayout tabLayout0 = this.a;
        if(tabLayout0 != null) {
            LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.a(tabLayout0);
            if(lifecycleOwner0 != null) {
                LifecycleCoroutineScope lifecycleCoroutineScope0 = LifecycleOwnerKt.a(lifecycleOwner0);
                return lifecycleCoroutineScope0 == null ? null : k.f(lifecycleCoroutineScope0, h0.c(), null, new com.dcinside.app.head.f.b(this, galleryInfo0, context0, null), 2, null);
            }
        }
        return null;
    }

    public final void n() {
        this.h();
        this.c = null;
        this.b = null;
        this.d = null;
        TabLayout tabLayout0 = this.a;
        if(tabLayout0 != null) {
            tabLayout0.N(this);
        }
        TabLayout tabLayout1 = this.a;
        if(tabLayout1 != null) {
            tabLayout1.L();
        }
        this.a = null;
    }

    public final void o(int v) {
        TabLayout tabLayout0 = this.a;
        if(tabLayout0 == null) {
            return;
        }
        i tabLayout$i0 = tabLayout0.D(v);
        if(tabLayout$i0 == null) {
            return;
        }
        tabLayout0.N(this);
        tabLayout$i0.r();
        PostHead postHead0 = null;
        if(v - 1 >= 0) {
            List list0 = this.d;
            if(list0 != null) {
                postHead0 = (PostHead)list0.get(v - 1);
            }
        }
        this.c = postHead0;
        tabLayout0.h(this);
    }

    @l
    @n
    public static final e p(@l Context context0, @m Q q0, @m TextView textView0, @m PostHead postHead0, @m b e$b0) {
        return f.h.c(context0, q0, textView0, postHead0, e$b0);
    }

    public final void q(boolean z) {
        this.g = z;
    }

    public final void r(@m PostHead postHead0) {
        this.c = postHead0;
    }

    public final void s(boolean z) {
        TabLayout tabLayout0 = this.a;
        if(tabLayout0 == null) {
            return;
        }
        if(tabLayout0.getTabCount() <= 0) {
            return;
        }
        tabLayout0.setVisibility((z ? 0 : 8));
    }
}

