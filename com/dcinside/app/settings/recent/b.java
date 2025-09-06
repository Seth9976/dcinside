package com.dcinside.app.settings.recent;

import A3.p;
import Y.e1;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import com.dcinside.app.internal.r;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nDeleteAllGalleryDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteAllGalleryDialog.kt\ncom/dcinside/app/settings/recent/DeleteAllGalleryDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,65:1\n1#2:66\n177#3,9:67\n177#3,9:76\n*S KotlinDebug\n*F\n+ 1 DeleteAllGalleryDialog.kt\ncom/dcinside/app/settings/recent/DeleteAllGalleryDialog\n*L\n58#1:67,9\n62#1:76,9\n*E\n"})
public final class b extends DialogFragment {
    @m
    private e1 a;

    private final void m0() {
        boolean z = this.o0().e.isChecked();
        com.dcinside.app.realm.s0.j.l(z);
        try {
            this.dismissAllowingStateLoss();
        }
        catch(Exception unused_ex) {
        }
    }

    private final void n0() {
        try {
            this.dismissAllowingStateLoss();
        }
        catch(Exception unused_ex) {
        }
    }

    private final e1 o0() {
        e1 e10 = this.a;
        L.m(e10);
        return e10;
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
        this.a = e1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.o0().b();
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
        @f(c = "com.dcinside.app.settings.recent.DeleteAllGalleryDialog$onViewCreated$1", f = "DeleteAllGalleryDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final b l;

            a(b b0, d d0) {
                this.l = b0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.m0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.recent.DeleteAllGalleryDialog$onViewCreated$2", f = "DeleteAllGalleryDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.recent.b.b extends o implements p {
            int k;
            final b l;

            com.dcinside.app.settings.recent.b.b(b b0, d d0) {
                this.l = b0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.settings.recent.b.b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.n0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.recent.DeleteAllGalleryDialog$onViewCreated$3", f = "DeleteAllGalleryDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final b l;

            c(b b0, d d0) {
                this.l = b0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.n0();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        e1 e10 = this.o0();
        L.o(e10.c, "dialogDeleteAllApply");
        a b$a0 = new a(this, null);
        r.M(e10.c, null, b$a0, 1, null);
        e1 e11 = this.o0();
        L.o(e11.d, "dialogDeleteAllCancel");
        com.dcinside.app.settings.recent.b.b b$b0 = new com.dcinside.app.settings.recent.b.b(this, null);
        r.M(e11.d, null, b$b0, 1, null);
        e1 e12 = this.o0();
        L.o(e12.b, "dialogDeleteAll");
        c b$c0 = new c(this, null);
        r.M(e12.b, null, b$c0, 1, null);
    }
}

