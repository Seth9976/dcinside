package com.dcinside.app.gallery;

import A3.p;
import Y.W0;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dk;
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

@s0({"SMAP\nAboutPersonGuideDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutPersonGuideDialog.kt\ncom/dcinside/app/gallery/AboutPersonGuideDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,107:1\n1#2:108\n35#3:109\n*S KotlinDebug\n*F\n+ 1 AboutPersonGuideDialog.kt\ncom/dcinside/app/gallery/AboutPersonGuideDialog\n*L\n42#1:109\n*E\n"})
public final class a extends DialogFragment {
    @m
    private W0 a;

    private final W0 k0() {
        W0 w00 = this.a;
        L.m(w00);
        return w00;
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
        this.a = W0.d(layoutInflater0, viewGroup0, false);
        View view0 = this.k0().b();
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
        if(dialog0 != null && dialog0.getWindow() != null) {
            int v = 0;
            Dialog dialog1 = this.getDialog();
            if(dialog1 != null) {
                Context context0 = dialog1.getContext();
                if(context0 != null) {
                    L.m(context0);
                    Configuration configuration0 = context0.getResources().getConfiguration();
                    L.o(configuration0, "getConfiguration(...)");
                    if(configuration0 != null) {
                        v = Dk.d(Math.min(configuration0.smallestScreenWidthDp, 380) - 20);
                    }
                }
            }
            Dialog dialog2 = this.getDialog();
            if(dialog2 != null) {
                Window window0 = dialog2.getWindow();
                if(window0 != null) {
                    window0.setLayout(v, -2);
                    WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
                    windowManager$LayoutParams0.gravity = 17;
                    window0.setAttributes(windowManager$LayoutParams0);
                }
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        @f(c = "com.dcinside.app.gallery.AboutPersonGuideDialog$onViewCreated$1", f = "AboutPersonGuideDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gallery.a.a extends o implements p {
            int k;
            final a l;

            com.dcinside.app.gallery.a.a(a a0, d d0) {
                this.l = a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.gallery.a.a(this.l, d0).invokeSuspend(S0.a);
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
        W0 w00 = this.k0();
        L.o(w00.b, "aboutPersonCloseImg");
        com.dcinside.app.gallery.a.a a$a0 = new com.dcinside.app.gallery.a.a(this, null);
        r.M(w00.b, null, a$a0, 1, null);
        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        int v = ContextCompat.getColor(context0, 0x7F0600A7);  // color:certified_profile
        int v1 = ContextCompat.getColor(context0, 0x7F0605B8);  // color:white
        Resources resources0 = context0.getResources();
        L.o("인증", "getString(...)");
        Rect rect0 = new Rect();
        TextPaint textPaint0 = new TextPaint();
        textPaint0.setTextSize(0.0f);
        textPaint0.getTextBounds("인증", 0, 2, rect0);
        rect0.set(0, 0, rect0.width() + resources0.getDimensionPixelSize(0x7F0703C0), rect0.height() + resources0.getDimensionPixelSize(0x7F0703C1));  // dimen:person_header_certified_padding_horizontal
        com.dcinside.app.span.m m0 = com.dcinside.app.span.m.a().o().i(v1).c().f(rect0.width()).h(rect0.height()).b(0.0f).j().n("인증", v, ((float)rect0.height()) / 2.0f);
        m0.setBounds(0, 0, m0.getIntrinsicWidth(), m0.getIntrinsicHeight());
        L.m(m0);
        com.dcinside.app.span.a a0 = new com.dcinside.app.span.a(m0, resources0.getDimension(0x7F0703BF));  // dimen:person_header_certified_bottom_spacing
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(this.getString(0x7F15044D));  // string:help_about_person_title_content_4 "인물 본인이 갤러리를 직접 운영 시 인증 이 표​시​됩​니​다."
        spannableStringBuilder0.setSpan(new StyleSpan(1), 0, 5, 33);
        spannableStringBuilder0.setSpan(a0, 20, 22, 33);
        this.k0().f.setText(spannableStringBuilder0);
    }
}

