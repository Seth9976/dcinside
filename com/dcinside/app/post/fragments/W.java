package com.dcinside.app.post.fragments;

import A3.p;
import Y.k1;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import com.dcinside.app.internal.r;
import com.dcinside.app.settings.ReadSettingActivity;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
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

@s0({"SMAP\nImageNoteGuideDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageNoteGuideDialogFragment.kt\ncom/dcinside/app/post/fragments/ImageNoteGuideDialogFragment\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,65:1\n35#2:66\n1#3:67\n27#4:68\n*S KotlinDebug\n*F\n+ 1 ImageNoteGuideDialogFragment.kt\ncom/dcinside/app/post/fragments/ImageNoteGuideDialogFragment\n*L\n28#1:66\n34#1:68\n*E\n"})
public final class w extends DialogFragment {
    @m
    private k1 a;

    private final k1 l0() {
        k1 k10 = this.a;
        L.m(k10);
        return k10;
    }

    private final void m0() {
        this.dismissAllowingStateLoss();
        Intent intent0 = new Intent(this.getContext(), ReadSettingActivity.class);
        intent0.putExtra("is_focus_image_note", true);
        this.startActivity(intent0);
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
        this.a = k1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.l0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        dl.a.s4(true);
        this.dismissAllowingStateLoss();
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStart() {
        int v;
        super.onStart();
        Dialog dialog0 = this.getDialog();
        if(dialog0 == null) {
            v = 0;
        }
        else {
            Context context0 = dialog0.getContext();
            if(context0 == null) {
                v = 0;
            }
            else {
                Configuration configuration0 = context0.getResources().getConfiguration();
                L.o(configuration0, "getConfiguration(...)");
                v = configuration0 == null ? 0 : Dk.d(Math.min(configuration0.smallestScreenWidthDp, 310));
            }
        }
        Dialog dialog1 = this.getDialog();
        if(dialog1 != null) {
            Window window0 = dialog1.getWindow();
            if(window0 != null) {
                window0.setLayout(v, -2);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        @f(c = "com.dcinside.app.post.fragments.ImageNoteGuideDialogFragment$onViewCreated$1", f = "ImageNoteGuideDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final w l;

            a(w w0, d d0) {
                this.l = w0;
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


        @f(c = "com.dcinside.app.post.fragments.ImageNoteGuideDialogFragment$onViewCreated$2", f = "ImageNoteGuideDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final w l;

            b(w w0, d d0) {
                this.l = w0;
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
        k1 k10 = this.l0();
        Spanned spanned0 = Dl.c(this.getString(0x7F1504D9));  // string:image_note_guide_set "<u>설정하러 가기</u>"
        k10.f.setText(spanned0);
        k1 k11 = this.l0();
        L.o(k11.f, "imageNoteGuideSetting");
        a w$a0 = new a(this, null);
        r.M(k11.f, null, w$a0, 1, null);
        k1 k12 = this.l0();
        L.o(k12.b, "imageNoteGuideClose");
        b w$b0 = new b(this, null);
        r.M(k12.b, null, w$b0, 1, null);
    }
}

