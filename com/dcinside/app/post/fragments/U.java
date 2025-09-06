package com.dcinside.app.post.fragments;

import Y.n1;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable.Factory;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.dcinside.app.post.k0;
import com.dcinside.app.rx.bus.A;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.h;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.dl;
import kotlin.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nFilterOptionDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterOptionDialogFragment.kt\ncom/dcinside/app/post/fragments/FilterOptionDialogFragment\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,203:1\n35#2:204\n*S KotlinDebug\n*F\n+ 1 FilterOptionDialogFragment.kt\ncom/dcinside/app/post/fragments/FilterOptionDialogFragment\n*L\n44#1:204\n*E\n"})
public final class u extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[k0.values().length];
            try {
                arr_v[k0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[k0.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[k0.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @m
    private n1 a;
    @l
    public static final a b = null;
    @l
    public static final String c = "com.dcinside.app.post.fragments.FilterOptionDialogFragment.EXTRA_FILTER_GALLERY_ID";

    static {
        u.b = new a(null);
    }

    // 检测为 Lambda 实现
    private static final void A0(u u0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void B0(u u0, CompoundButton compoundButton0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void C0(u u0, CompoundButton compoundButton0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void D0(u u0, CompoundButton compoundButton0, boolean z) [...]

    private final void E0(CompoundButton compoundButton0, boolean z) {
        compoundButton0.setChecked(z);
        switch(compoundButton0.getId()) {
            case 0x7F0B0A40: {  // id:post_filter_hit
                this.u0().f.setEnabled(z);
                return;
            }
            case 0x7F0B0A43: {  // id:post_filter_like
                this.u0().i.setEnabled(z);
                return;
            }
            case 0x7F0B0A47: {  // id:post_filter_reply
                this.u0().m.setEnabled(z);
            }
        }
    }

    private final void F0(View view0) {
        view0.postDelayed(() -> {
            L.p(view0, "$editText");
            if(view0.isEnabled() && view0 instanceof AppCompatEditText) {
                ((AppCompatEditText)view0).setSelection(0, ((AppCompatEditText)view0).length());
            }
            Nk.a.f(view0);
        }, 50L);
    }

    // 检测为 Lambda 实现
    private static final void G0(View view0) [...]

    @Override  // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setSoftInputMode(3);
            }
        }
        Dialog dialog1 = this.getDialog();
        if(dialog1 != null) {
            Window window1 = dialog1.getWindow();
            if(window1 != null) {
                View view0 = window1.getCurrentFocus();
                if(view0 != null) {
                    Nk.a.c(view0);
                }
            }
        }
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 != null) {
            c.a(appCompatActivity0, new h(false));
        }
        super.dismissAllowingStateLoss();
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onCancel(@l DialogInterface dialogInterface0) {
        L.p(dialogInterface0, "dialog");
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setSoftInputMode(3);
            }
        }
        Dialog dialog1 = this.getDialog();
        if(dialog1 != null) {
            Window window1 = dialog1.getWindow();
            if(window1 != null) {
                View view0 = window1.getCurrentFocus();
                if(view0 != null) {
                    Nk.a.c(view0);
                }
            }
        }
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 != null) {
            c.a(appCompatActivity0, new h(false));
        }
        super.onCancel(dialogInterface0);
    }

    @Override  // androidx.fragment.app.DialogFragment
    @l
    public Dialog onCreateDialog(@m Bundle bundle0) {
        Dialog dialog0 = super.onCreateDialog(bundle0);
        L.o(dialog0, "onCreateDialog(...)");
        Window window0 = dialog0.getWindow();
        if(window0 != null) {
            window0.setSoftInputMode(5);
        }
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = n1.d(layoutInflater0, viewGroup0, false);
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        View view0 = this.u0().b();
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
                v = configuration0 == null ? 0 : Dk.d(Math.min(configuration0.smallestScreenWidthDp - 20, 310));
            }
        }
        Dialog dialog1 = this.getDialog();
        if(dialog1 != null) {
            Window window0 = dialog1.getWindow();
            if(window0 != null) {
                window0.setLayout(v, -2);
                WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
                windowManager$LayoutParams0.gravity = 17;
                window0.setAttributes(windowManager$LayoutParams0);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.v0();
    }

    private final void t0(String s) {
        dl dl0 = dl.a;
        dl0.V4(com.dcinside.app.post.j0.a.c, s, this.u0().h.isChecked());
        dl0.V4(com.dcinside.app.post.j0.a.d, s, this.u0().l.isChecked());
        dl0.V4(com.dcinside.app.post.j0.a.e, s, this.u0().e.isChecked());
        Integer integer0 = v.b1(this.u0().i.getText().toString());
        dl0.U4(com.dcinside.app.post.j0.a.c, s, (integer0 == null ? 0 : ((int)integer0)));
        Integer integer1 = v.b1(this.u0().m.getText().toString());
        dl0.U4(com.dcinside.app.post.j0.a.d, s, (integer1 == null ? 0 : ((int)integer1)));
        Integer integer2 = v.b1(this.u0().f.getText().toString());
        dl0.U4(com.dcinside.app.post.j0.a.e, s, (integer2 == null ? 0 : ((int)integer2)));
        switch(this.u0().j.getCheckedRadioButtonId()) {
            case 0x7F0B0B34: {  // id:post_type_all
                dl0.W4(s, 0);
                break;
            }
            case 0x7F0B0B35: {  // id:post_type_read
                dl0.W4(s, 1);
                break;
            }
            case 0x7F0B0B36: {  // id:post_type_unread
                dl0.W4(s, 2);
            }
        }
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 != null) {
            c.a(fragmentActivity0, new A(0));
        }
        this.dismiss();
    }

    private final n1 u0() {
        n1 n10 = this.a;
        L.m(n10);
        return n10;
    }

    private final void v0() {
        int v1;
        String s;
        Bundle bundle0 = this.getArguments();
        if(bundle0 == null) {
            s = "";
        }
        else {
            s = bundle0.getString("com.dcinside.app.post.fragments.FilterOptionDialogFragment.EXTRA_FILTER_GALLERY_ID");
            if(s == null) {
                s = "";
            }
        }
        dl dl0 = dl.a;
        int v = dl0.e1(s);
        switch(k0.b.a(v)) {
            case 1: {
                v1 = 0x7F0B0B34;  // id:post_type_all
                break;
            }
            case 2: {
                v1 = 0x7F0B0B35;  // id:post_type_read
                break;
            }
            case 3: {
                v1 = 0x7F0B0B36;  // id:post_type_unread
                break;
            }
            default: {
                throw new J();
            }
        }
        this.u0().j.check(v1);
        boolean z = dl0.d1(com.dcinside.app.post.j0.a.c, s);
        boolean z1 = dl0.d1(com.dcinside.app.post.j0.a.d, s);
        boolean z2 = dl0.d1(com.dcinside.app.post.j0.a.e, s);
        n1 n10 = this.u0();
        n10.h.setChecked(z);
        com.dcinside.app.post.fragments.l l0 = (CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            L.m(compoundButton0);
            this.E0(compoundButton0, z);
        };
        n10.h.setOnCheckedChangeListener(l0);
        n1 n11 = this.u0();
        n11.l.setChecked(z1);
        com.dcinside.app.post.fragments.m m0 = (CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            L.m(compoundButton0);
            this.E0(compoundButton0, z);
        };
        n11.l.setOnCheckedChangeListener(m0);
        n1 n12 = this.u0();
        n12.e.setChecked(z2);
        n n0 = (CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            L.m(compoundButton0);
            this.E0(compoundButton0, z);
        };
        n12.e.setOnCheckedChangeListener(n0);
        n1 n13 = this.u0();
        n13.i.setEnabled(z);
        Editable editable0 = Editable.Factory.getInstance().newEditable(String.valueOf(dl0.c1(com.dcinside.app.post.j0.a.c, s)));
        n13.i.setText(editable0);
        o o0 = (View view0, boolean z) -> {
            L.p(this, "this$0");
            if(z) {
                L.m(view0);
                this.F0(view0);
            }
        };
        n13.i.setOnFocusChangeListener(o0);
        n1 n14 = this.u0();
        n14.m.setEnabled(z1);
        Editable editable1 = Editable.Factory.getInstance().newEditable(String.valueOf(dl0.c1(com.dcinside.app.post.j0.a.d, s)));
        n14.m.setText(editable1);
        p p0 = (View view0, boolean z) -> {
            L.p(this, "this$0");
            if(z) {
                L.m(view0);
                this.F0(view0);
            }
        };
        n14.m.setOnFocusChangeListener(p0);
        n1 n15 = this.u0();
        n15.f.setEnabled(z2);
        Editable editable2 = Editable.Factory.getInstance().newEditable(String.valueOf(dl0.c1(com.dcinside.app.post.j0.a.e, s)));
        n15.f.setText(editable2);
        q q0 = (View view0, boolean z) -> {
            L.p(this, "this$0");
            if(z) {
                L.m(view0);
                this.F0(view0);
            }
        };
        n15.f.setOnFocusChangeListener(q0);
        n1 n16 = this.u0();
        r r0 = (View view0) -> {
            L.p(this, "this$0");
            L.p(s, "$galleryId");
            this.t0(s);
        };
        n16.b.setOnClickListener(r0);
        n1 n17 = this.u0();
        s s1 = (View view0) -> {
            L.p(this, "this$0");
            this.dismiss();
        };
        n17.c.setOnClickListener(s1);
    }

    // 检测为 Lambda 实现
    private static final void w0(u u0, View view0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void x0(u u0, View view0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void y0(u u0, View view0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void z0(u u0, String s, View view0) [...]
}

