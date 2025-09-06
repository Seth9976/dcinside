package com.dcinside.app.settings.image;

import Y.U0;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.fragment.app.DialogFragment;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nAboutAutoImageDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutAutoImageDialog.kt\ncom/dcinside/app/settings/image/AboutAutoImageDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 4 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,85:1\n1#2:86\n27#3:87\n35#4:88\n*S KotlinDebug\n*F\n+ 1 AboutAutoImageDialog.kt\ncom/dcinside/app/settings/image/AboutAutoImageDialog\n*L\n29#1:87\n37#1:88\n*E\n"})
public final class c extends DialogFragment {
    @m
    private U0 a;

    private final U0 m0() {
        U0 u00 = this.a;
        L.m(u00);
        return u00;
    }

    // 检测为 Lambda 实现
    private static final void n0(c c0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void o0(c c0, View view0) [...]

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
        this.a = U0.d(layoutInflater0, viewGroup0, false);
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
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        U0 u00 = this.m0();
        a a0 = (View view0) -> {
            L.p(this, "this$0");
            this.dismissAllowingStateLoss();
        };
        u00.b.setOnClickListener(a0);
        U0 u01 = this.m0();
        b b0 = (View view0) -> {
            L.p(this, "this$0");
            this.dismissAllowingStateLoss();
        };
        u01.c.setOnClickListener(b0);
        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        Spanned spanned0 = Dl.c(this.getString(0x7F150020));  // string:about_auto_image_desc "<br/>자동 짤방 이미지를 서버에 업로드하여 <b>‘내 자짤’</b>에 보관합니다. <br/><br/>내 
                                                              // 자짤의 이미지는 갤러리에서 간편하게 자동 짤방으로 설정할 수 있고, 글쓰기 시 새로 업로드하지 않아 데이터가 절감됩니다. <br/><br/>로그인 
                                                              // 시 고정닉 별로 자동 짤방 설정이 가능하며, PC/모바일 웹에서도 자동 짤방을 사용할 수 있습니다."
        L.m(spanned0);
        int v = v.s3(spanned0, "고정닉 별", 0, false, 6, null);
        int v1 = v.s3(spanned0, "PC/모바일 웹", 0, false, 6, null);
        if(v >= 0 && v1 >= 0) {
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(spanned0);
            int v2 = vk.b(context0, 0x7F04012E);  // attr:colorAccent
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(v2), v1, v1 + 8, 33);
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(v2), v, v + 5, 33);
            this.m0().d.setText(spannableStringBuilder0);
            return;
        }
        this.m0().d.setText(spanned0);
    }
}

