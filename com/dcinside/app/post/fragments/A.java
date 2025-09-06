package com.dcinside.app.post.fragments;

import A3.p;
import Y.X0;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.internal.r;
import com.dcinside.app.post.r1;
import com.dcinside.app.settings.launchericon.b;
import com.dcinside.app.settings.launchericon.d;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import com.dcinside.app.view.tool.NonPredictiveGridLayoutManager;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nAddGalleryShortcutFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddGalleryShortcutFragment.kt\ncom/dcinside/app/post/fragments/AddGalleryShortcutFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,178:1\n1#2:179\n25#3:180\n25#3:181\n*S KotlinDebug\n*F\n+ 1 AddGalleryShortcutFragment.kt\ncom/dcinside/app/post/fragments/AddGalleryShortcutFragment\n*L\n77#1:180\n111#1:181\n*E\n"})
public final class a extends DialogFragment implements d {
    public static final class com.dcinside.app.post.fragments.a.a {
        private com.dcinside.app.post.fragments.a.a() {
        }

        public com.dcinside.app.post.fragments.a.a(w w0) {
        }
    }

    @m
    private X0 a;
    @l
    private String b;
    @l
    private String c;
    @l
    private String d;
    @l
    private b e;
    @l
    private b f;
    @m
    private Bitmap g;
    @l
    public static final com.dcinside.app.post.fragments.a.a h = null;
    @l
    public static final String i = "AddGalleryShortcutFragment_EXTRA_GALL_NAME";
    @l
    public static final String j = "AddGalleryShortcutFragment_EXTRA_GALL_ID";
    @l
    public static final String k = "AddGalleryShortcutFragment_EXTRA_COVER_URL";

    static {
        a.h = new com.dcinside.app.post.fragments.a.a(null);
    }

    public a() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = new b();
        this.f = new b();
    }

    @Override  // com.dcinside.app.settings.launchericon.d
    public void A(@m Bitmap bitmap0) {
        this.f.I(false);
        this.e.I(true);
        this.g = bitmap0;
        this.f.E(-1);
    }

    private final void l0() {
        boolean z;
        String s = this.b;
        String s1 = this.c;
        AppCompatActivity appCompatActivity0 = null;
        if(this.f.y()) {
            FragmentActivity fragmentActivity0 = this.getActivity();
            if(fragmentActivity0 instanceof AppCompatActivity) {
                appCompatActivity0 = (AppCompatActivity)fragmentActivity0;
            }
            if(appCompatActivity0 == null) {
                return;
            }
            ArrayList arrayList0 = this.f.x();
            if(arrayList0 == null) {
                return;
            }
            Object object0 = arrayList0.get(this.f.v());
            L.o(object0, "get(...)");
            z = r1.a.c(appCompatActivity0, s, s1, null, ((com.dcinside.app.settings.launchericon.a)object0));
        }
        else if(this.e.y()) {
            FragmentActivity fragmentActivity1 = this.getActivity();
            if(fragmentActivity1 instanceof AppCompatActivity) {
                appCompatActivity0 = (AppCompatActivity)fragmentActivity1;
            }
            if(appCompatActivity0 == null) {
                return;
            }
            z = r1.a.c(appCompatActivity0, s, s1, this.g, null);
        }
        else {
            z = false;
        }
        if(z) {
            Dl.D(this.getContext(), 0x7F1509F2);  // string:success_home_launcher_icon "홈 화면에 앱 아이콘을 추가하였습니다."
        }
        this.dismissAllowingStateLoss();
    }

    private final X0 m0() {
        X0 x00 = this.a;
        L.m(x00);
        return x00;
    }

    @Override  // androidx.fragment.app.DialogFragment
    @l
    public Dialog onCreateDialog(@m Bundle bundle0) {
        Dialog dialog0 = super.onCreateDialog(bundle0);
        L.o(dialog0, "onCreateDialog(...)");
        Window window0 = dialog0.getWindow();
        if(window0 != null) {
            window0.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = X0.d(layoutInflater0, viewGroup0, false);
        View view0 = this.m0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        this.a = null;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStart() {
        super.onStart();
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setLayout(-1, -1);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        @f(c = "com.dcinside.app.post.fragments.AddGalleryShortcutFragment$onViewCreated$6", f = "AddGalleryShortcutFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.a.b extends o implements p {
            int k;
            final a l;

            com.dcinside.app.post.fragments.a.b(a a0, kotlin.coroutines.d d0) {
                this.l = a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.a.b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.l0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.fragments.AddGalleryShortcutFragment$onViewCreated$7", f = "AddGalleryShortcutFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final a l;

            c(a a0, kotlin.coroutines.d d0) {
                this.l = a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.dismissAllowingStateLoss();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.fragments.AddGalleryShortcutFragment$onViewCreated$8", f = "AddGalleryShortcutFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.a.d extends o implements p {
            int k;
            final a l;

            com.dcinside.app.post.fragments.a.d(a a0, kotlin.coroutines.d d0) {
                this.l = a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.a.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.dismissAllowingStateLoss();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null) {
            String s = bundle1.getString("AddGalleryShortcutFragment_EXTRA_GALL_ID", "");
            L.o(s, "getString(...)");
            this.b = s;
            String s1 = bundle1.getString("AddGalleryShortcutFragment_EXTRA_GALL_NAME", "");
            L.o(s1, "getString(...)");
            this.c = s1;
            String s2 = bundle1.getString("AddGalleryShortcutFragment_EXTRA_COVER_URL", "");
            L.o(s2, "getString(...)");
            this.d = s2;
        }
        Context context0 = view0.getContext();
        X0 x00 = this.m0();
        L.o(x00.f, "addShortcutNameIcon");
        NonPredictiveGridLayoutManager nonPredictiveGridLayoutManager0 = new NonPredictiveGridLayoutManager(4, 1, false);
        x00.f.setLayoutManager(nonPredictiveGridLayoutManager0);
        x00.f.setAdapter(this.e);
        Adapter recyclerView$Adapter0 = x00.f.getAdapter();
        if(!(recyclerView$Adapter0 instanceof b)) {
            recyclerView$Adapter0 = null;
        }
        if(((b)recyclerView$Adapter0) != null) {
            String s3 = context0.getString(0x7F1509CF, new Object[]{this.c});  // string:shortcut_gall_name "%s 갤러리"
            L.o(s3, "getString(...)");
            String s4 = v.l2(v.G5(s3).toString(), " ", "", false, 4, null);
            String s5 = s4.substring(0, Math.min(s4.length(), 3));
            L.o(s5, "substring(...)");
            ((b)recyclerView$Adapter0).J(true);
            ArrayList arrayList0 = new ArrayList();
            L.m(context0);
            int v = Al.a.n(context0, "gall_base_icon");
            arrayList0.add(new com.dcinside.app.settings.launchericon.b.a(r1.e(r1.a, context0, s5, v, 0, 8, null), null));
            int v1 = Al.a.n(context0, "gall_base_icon2");
            int v2 = Color.parseColor("#3b4690");
            arrayList0.add(new com.dcinside.app.settings.launchericon.b.a(r1.a.d(context0, s5, v1, v2), null));
            int v3 = Al.a.n(context0, "gall_base_icon3");
            arrayList0.add(new com.dcinside.app.settings.launchericon.b.a(r1.e(r1.a, context0, s5, v3, 0, 8, null), null));
            if(this.d.length() > 0) {
                arrayList0.add(new com.dcinside.app.settings.launchericon.b.a(null, this.d));
            }
            ((b)recyclerView$Adapter0).F(arrayList0);
            ((b)recyclerView$Adapter0).H(this);
        }
        X0 x01 = this.m0();
        L.o(x01.e, "addShortcutIconList");
        NonPredictiveGridLayoutManager nonPredictiveGridLayoutManager1 = new NonPredictiveGridLayoutManager(4, 1, false);
        x01.e.setLayoutManager(nonPredictiveGridLayoutManager1);
        x01.e.setAdapter(this.f);
        Adapter recyclerView$Adapter1 = x01.e.getAdapter();
        if(!(recyclerView$Adapter1 instanceof b)) {
            recyclerView$Adapter1 = null;
        }
        if(((b)recyclerView$Adapter1) != null) {
            ((b)recyclerView$Adapter1).E(0);
            ((b)recyclerView$Adapter1).I(true);
            ((b)recyclerView$Adapter1).J(true);
            ((b)recyclerView$Adapter1).G(com.dcinside.app.settings.launchericon.a.b.a());
            ((b)recyclerView$Adapter1).H(this);
        }
        String s6 = this.getString(0x7F1509CF, new Object[]{this.c});  // string:shortcut_gall_name "%s 갤러리"
        L.o(s6, "getString(...)");
        String s7 = this.getString(0x7F1509CB, new Object[]{s6});  // string:shortcut_confirm "홈 화면에 %s를 추가하시겠습니까?"
        L.o(s7, "getString(...)");
        this.m0().g.setText(s7);
        X0 x02 = this.m0();
        L.o(x02.b, "addShortcutAdd");
        com.dcinside.app.post.fragments.a.b a$b0 = new com.dcinside.app.post.fragments.a.b(this, null);
        r.M(x02.b, null, a$b0, 1, null);
        X0 x03 = this.m0();
        L.o(x03.c, "addShortcutCancel");
        c a$c0 = new c(this, null);
        r.M(x03.c, null, a$c0, 1, null);
        X0 x04 = this.m0();
        L.o(x04.h, "dialogAddShortcutTitle");
        com.dcinside.app.post.fragments.a.d a$d0 = new com.dcinside.app.post.fragments.a.d(this, null);
        r.M(x04.h, null, a$d0, 1, null);
    }

    @Override  // com.dcinside.app.settings.launchericon.d
    public void p(@l com.dcinside.app.settings.launchericon.a a0) {
        L.p(a0, "icon");
        this.f.I(true);
        this.e.I(false);
        this.e.E(-1);
    }
}

