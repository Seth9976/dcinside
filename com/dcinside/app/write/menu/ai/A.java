package com.dcinside.app.write.menu.ai;

import A3.p;
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

@s0({"SMAP\nAboutAiImageGuideDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutAiImageGuideDialog.kt\ncom/dcinside/app/write/menu/ai/AboutAiImageGuideDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
public final class a extends DialogFragment {
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
    @m
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        return layoutInflater0.inflate(0x7F0E00B7, viewGroup0, false);  // layout:dialog_about_ai_image
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
        @f(c = "com.dcinside.app.write.menu.ai.AboutAiImageGuideDialog$onViewCreated$1", f = "AboutAiImageGuideDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.a.a extends o implements p {
            int k;
            final a l;

            com.dcinside.app.write.menu.ai.a.a(a a0, d d0) {
                this.l = a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.write.menu.ai.a.a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.dismissAllowingStateLoss();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.ai.AboutAiImageGuideDialog$onViewCreated$2", f = "AboutAiImageGuideDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final a l;

            b(a a0, d d0) {
                this.l = a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.dismissAllowingStateLoss();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        View view1 = view0.findViewById(0x7F0B03CD);  // id:dialog_about_ai_image_close
        L.o(view1, "findViewById(...)");
        View view2 = view0.findViewById(0x7F0B03CC);  // id:dialog_about_ai_image
        L.o(view2, "findViewById(...)");
        r.M(view1, null, new com.dcinside.app.write.menu.ai.a.a(this, null), 1, null);
        r.M(view2, null, new b(this, null), 1, null);
    }
}

