package com.dcinside.app.memo;

import Y.i1;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.z;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.g0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class d extends com.google.android.material.bottomsheet.d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private i1 b;
    private ViewTreeObserver.OnGlobalLayoutListener c;
    @l
    public static final a d = null;
    @l
    public static final String e = "EXTRA_SELECTED_COLOR";

    static {
        d.d = new a(null);
    }

    @Override  // com.google.android.material.bottomsheet.d
    @l
    public Dialog onCreateDialog(@m Bundle bundle0) {
        Dialog dialog0 = super.onCreateDialog(bundle0);
        L.o(dialog0, "onCreateDialog(...)");
        if(Build.VERSION.SDK_INT >= 30) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                View view0 = window0.getDecorView();
                if(view0 != null) {
                    view0.setOnApplyWindowInsetsListener((View view0, WindowInsets windowInsets0) -> {
                        L.p(this, "this$0");
                        L.p(view0, "<anonymous parameter 0>");
                        L.p(windowInsets0, "insets");
                        int v = windowInsets0.getInsets(z.a()).bottom;
                        this.r0().b().setPadding(0, 0, 0, v);
                        return windowInsets0;
                    });
                    return dialog0;
                }
            }
        }
        else {
            Window window1 = dialog0.getWindow();
            if(window1 != null) {
                window1.setSoftInputMode(16);
            }
        }
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.b = i1.d(layoutInflater0, viewGroup0, false);
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        View view0 = this.r0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        Integer integer0 = this.r0().d.getColor();
        Context context0 = this.getContext();
        if(context0 != null) {
            c.a(context0, new g0(integer0));
        }
        super.onDestroyView();
        this.b = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        int v = bundle1 == null ? 0 : bundle1.getInt("EXTRA_SELECTED_COLOR");
        this.r0().d.setInitialColor(v);
        this.u0();
        i1 i10 = this.r0();
        com.dcinside.app.memo.c c0 = (View view0) -> {
            L.p(this, "this$0");
            this.dismissAllowingStateLoss();
        };
        i10.b.setOnClickListener(c0);
    }

    private final i1 r0() {
        i1 i10 = this.b;
        L.m(i10);
        return i10;
    }

    // 检测为 Lambda 实现
    private static final WindowInsets s0(d d0, View view0, WindowInsets windowInsets0) [...]

    // 检测为 Lambda 实现
    private static final void t0(d d0, View view0) [...]

    private final void u0() {
        this.c = () -> {
            L.p(this, "this$0");
            Dialog dialog0 = this.getDialog();
            com.google.android.material.bottomsheet.c c0 = dialog0 instanceof com.google.android.material.bottomsheet.c ? ((com.google.android.material.bottomsheet.c)dialog0) : null;
            if(c0 != null) {
                FrameLayout frameLayout0 = (FrameLayout)c0.findViewById(0x7F0B03C6);  // id:design_bottom_sheet
                if(frameLayout0 != null) {
                    frameLayout0.setBackgroundResource(0x106000D);
                    BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.x0(frameLayout0);
                    L.o(bottomSheetBehavior0, "from(...)");
                    bottomSheetBehavior0.g(3);
                    bottomSheetBehavior0.f1(false);
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
    private static final void v0(d d0) [...]
}

