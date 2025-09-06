package com.dcinside.app.auth;

import Y.U5;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.dcinside.app.view.ExternalOtpView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.c;
import com.google.android.material.bottomsheet.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nExternalOtpBottomSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternalOtpBottomSheetFragment.kt\ncom/dcinside/app/auth/ExternalOtpBottomSheetFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1557#2:92\n1628#2,2:93\n1630#2:96\n1863#2,2:97\n1#3:95\n*S KotlinDebug\n*F\n+ 1 ExternalOtpBottomSheetFragment.kt\ncom/dcinside/app/auth/ExternalOtpBottomSheetFragment\n*L\n60#1:92\n60#1:93,2\n60#1:96\n61#1:97,2\n*E\n"})
public final class m extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @y4.m
    private U5 b;
    private ViewTreeObserver.OnGlobalLayoutListener c;
    @y4.m
    private List d;
    @l
    public static final a e = null;
    @l
    public static final String f = "KEY_PACKAGE_NAME_LIST";

    static {
        m.e = new a(null);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onCreate(@y4.m Bundle bundle0) {
        super.onCreate(bundle0);
        this.setStyle(0, 0x7F16018B);
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @y4.m ViewGroup viewGroup0, @y4.m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.b = U5.d(layoutInflater0, viewGroup0, false);
        View view0 = this.q0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0 = null;
        this.b = null;
        View view0 = this.getView();
        if(view0 != null) {
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener1 = this.c;
                if(viewTreeObserver$OnGlobalLayoutListener1 == null) {
                    L.S("listener");
                }
                else {
                    viewTreeObserver$OnGlobalLayoutListener0 = viewTreeObserver$OnGlobalLayoutListener1;
                }
                viewTreeObserver0.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
            }
        }
        super.onDestroyView();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @y4.m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.s0();
        this.t0();
        this.u0();
    }

    private final U5 q0() {
        U5 u50 = this.b;
        L.m(u50);
        return u50;
    }

    private final void r0(String s) {
        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        context0.startActivity(context0.getPackageManager().getLaunchIntentForPackage(s));
        this.dismissAllowingStateLoss();
    }

    private final void s0() {
        Bundle bundle0 = this.getArguments();
        this.d = bundle0 == null ? null : bundle0.getStringArrayList("KEY_PACKAGE_NAME_LIST");
    }

    private final void t0() {
        static final class b extends N implements Function1 {
            final m e;

            b(m m0) {
                this.e = m0;
                super(1);
            }

            public final void b(@l String s) {
                L.p(s, "it");
                this.e.r0(s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        this.q0().b.removeAllViews();
        List list0 = this.d;
        if(list0 != null) {
            ArrayList arrayList0 = new ArrayList(u.b0(list0, 10));
            for(Object object0: list0) {
                ExternalOtpView externalOtpView0 = new ExternalOtpView(context0, null, 0, 6, null);
                externalOtpView0.A(((String)object0), new b(this));
                arrayList0.add(externalOtpView0);
            }
            for(Object object1: arrayList0) {
                this.q0().b.addView(((ExternalOtpView)object1));
            }
        }
    }

    private final void u0() {
        this.c = () -> {
            L.p(this, "this$0");
            Dialog dialog0 = this.getDialog();
            c c0 = dialog0 instanceof c ? ((c)dialog0) : null;
            if(c0 != null) {
                FrameLayout frameLayout0 = (FrameLayout)c0.findViewById(0x7F0B03C6);  // id:design_bottom_sheet
                if(frameLayout0 != null) {
                    BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.x0(frameLayout0);
                    bottomSheetBehavior0.g(3);
                    bottomSheetBehavior0.p1(0);
                }
            }
        };
        View view0 = this.getView();
        if(view0 != null) {
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0 = this.c;
                if(viewTreeObserver$OnGlobalLayoutListener0 == null) {
                    L.S("listener");
                    viewTreeObserver$OnGlobalLayoutListener0 = null;
                }
                viewTreeObserver0.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void v0(m m0) [...]
}

