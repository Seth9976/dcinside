package com.coupang.ads.interstitial;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public class i extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public static final class b implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
        @l
        private final WeakReference a;
        @l
        private final WeakReference b;

        public b(@l DialogInterface.OnDismissListener dialogInterface$OnDismissListener0, @l DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
            L.p(dialogInterface$OnDismissListener0, "listener");
            L.p(dialogInterface$OnCancelListener0, "cancelListener");
            super();
            this.a = new WeakReference(dialogInterface$OnDismissListener0);
            this.b = new WeakReference(dialogInterface$OnCancelListener0);
        }

        @Override  // android.content.DialogInterface$OnCancelListener
        public void onCancel(@m DialogInterface dialogInterface0) {
            if(dialogInterface0 != null) {
                DialogInterface.OnCancelListener dialogInterface$OnCancelListener0 = (DialogInterface.OnCancelListener)this.b.get();
                if(dialogInterface$OnCancelListener0 != null) {
                    dialogInterface$OnCancelListener0.onCancel(dialogInterface0);
                }
            }
        }

        @Override  // android.content.DialogInterface$OnDismissListener
        public void onDismiss(@m DialogInterface dialogInterface0) {
            if(dialogInterface0 != null) {
                DialogInterface.OnDismissListener dialogInterface$OnDismissListener0 = (DialogInterface.OnDismissListener)this.a.get();
                if(dialogInterface$OnDismissListener0 != null) {
                    dialogInterface$OnDismissListener0.onDismiss(dialogInterface0);
                }
            }
        }
    }

    private int a;
    private int b;
    private boolean c;
    @m
    private FragmentManager d;
    private boolean e;
    @m
    private Dialog f;
    private boolean g;
    private boolean h;
    private boolean i;
    @l
    public static final a j = null;
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 3;
    public static final int o = 4;
    @l
    private static final String p = "android:savedDialogState";
    @l
    private static final String q = "android:style";
    @l
    private static final String r = "android:theme";
    @l
    private static final String s = "android:cancelable";
    @l
    private static final String t = "android:showsDialog";

    static {
        i.j = new a(null);
    }

    public i() {
        this.c = true;
        this.e = true;
    }

    public final void dismiss() {
        this.j0();
    }

    @m
    public final Dialog getDialog() {
        return this.f;
    }

    public final boolean getShowsDialog() {
        return this.e;
    }

    public int getTheme() {
        return this.b;
    }

    public void i0() {
    }

    public final boolean isCancelable() {
        return this.c;
    }

    private final void j0() {
        if(this.h) {
            return;
        }
        this.h = true;
        this.i = false;
        Dialog dialog0 = this.f;
        if(dialog0 != null) {
            dialog0.dismiss();
        }
        this.g = true;
        FragmentManager fragmentManager0 = this.getFragmentManager();
        if(fragmentManager0 != null) {
            FragmentTransaction fragmentTransaction0 = fragmentManager0.u();
            if(fragmentTransaction0 != null) {
                FragmentTransaction fragmentTransaction1 = fragmentTransaction0.B(this);
                if(fragmentTransaction1 != null) {
                    fragmentTransaction1.r();
                }
            }
        }
        FragmentManager fragmentManager1 = this.d;
        if(fragmentManager1 != null) {
            FragmentTransaction fragmentTransaction2 = fragmentManager1.u();
            if(fragmentTransaction2 != null) {
                FragmentTransaction fragmentTransaction3 = fragmentTransaction2.B(this);
                if(fragmentTransaction3 != null) {
                    fragmentTransaction3.r();
                }
            }
        }
        this.d = null;
    }

    private final Activity k0(Context context0) {
        if(context0 instanceof Activity) {
            return (Activity)context0;
        }
        while(context0 instanceof ContextWrapper) {
            if(context0 instanceof Activity) {
                return (Activity)context0;
            }
            context0 = ((ContextWrapper)context0).getBaseContext();
        }
        return null;
    }

    public void l0() {
    }

    public final void m0(@m Dialog dialog0) {
        this.f = dialog0;
    }

    public void n0(int v) {
        this.b = v;
    }

    @j
    public final void o0(@m Context context0) {
        i.q0(this, context0, null, 2, null);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onActivityCreated(@m Bundle bundle0) {
        super.onActivityCreated(bundle0);
        Dialog dialog0 = this.f;
        if(this.e && dialog0 != null) {
            View view0 = this.getView();
            if(view0 != null) {
                if(view0.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if(dialog0 instanceof AlertDialog) {
                    ((AlertDialog)dialog0).setView(view0);
                }
                else {
                    dialog0.setContentView(view0);
                }
                if(this.a == 4) {
                    Window window0 = dialog0.getWindow();
                    if(window0 != null) {
                        window0.setLayout(-1, -1);
                        window0.getDecorView().setSystemUiVisibility(0x500);
                        window0.addFlags(0x80000000);
                    }
                }
            }
            FragmentActivity fragmentActivity0 = this.getActivity();
            if(fragmentActivity0 != null) {
                dialog0.setOwnerActivity(fragmentActivity0);
            }
            dialog0.setCancelable(this.c);
            b i$b0 = new b(this, this);
            dialog0.setOnCancelListener(i$b0);
            dialog0.setOnDismissListener(i$b0);
            if(bundle0 != null) {
                Bundle bundle1 = bundle0.getBundle("android:savedDialogState");
                if(bundle1 != null) {
                    dialog0.onRestoreInstanceState(bundle1);
                }
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onAttach(@l Context context0) {
        L.p(context0, "context");
        super.onAttach(context0);
        if(!this.i) {
            this.h = false;
        }
        this.l0();
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public void onCancel(@m DialogInterface dialogInterface0) {
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        this.e = true;
        if(bundle0 != null) {
            this.a = bundle0.getInt("android:style", 0);
            this.n0(bundle0.getInt("android:theme", 0));
            this.c = bundle0.getBoolean("android:cancelable", true);
            this.e = bundle0.getBoolean("android:showsDialog", this.e);
        }
    }

    @l
    public Dialog onCreateDialog(@m Bundle bundle0) {
        return new Dialog(this.requireContext());
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog0 = this.f;
        if(dialog0 != null) {
            this.g = true;
            dialog0.dismiss();
        }
        this.f = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if(!this.i && !this.h) {
            this.h = true;
        }
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public void onDismiss(@m DialogInterface dialogInterface0) {
        if(!this.g) {
            this.j0();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public LayoutInflater onGetLayoutInflater(@m Bundle bundle0) {
        if(!this.e) {
            LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
            L.o(layoutInflater0, "super.onGetLayoutInflater(savedInstanceState)");
            return layoutInflater0;
        }
        Dialog dialog0 = this.onCreateDialog(bundle0);
        this.f = dialog0;
        if(dialog0 == null) {
            Object object0 = this.requireContext().getSystemService("layout_inflater");
            if(object0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
            }
            return (LayoutInflater)object0;
        }
        this.setupDialog(dialog0, this.a);
        Object object1 = dialog0.getContext().getSystemService("layout_inflater");
        if(object1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        }
        return (LayoutInflater)object1;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        Dialog dialog0 = this.f;
        if(dialog0 != null) {
            bundle0.putBundle("android:savedDialogState", dialog0.onSaveInstanceState());
        }
        int v = this.a;
        if(v != 0) {
            bundle0.putInt("android:style", v);
        }
        if(this.getTheme() != 0) {
            bundle0.putInt("android:theme", this.getTheme());
        }
        if(!this.c) {
            bundle0.putBoolean("android:cancelable", false);
        }
        if(!this.e) {
            bundle0.putBoolean("android:showsDialog", false);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog0 = this.f;
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setLayout(-2, -2);
            }
            Window window1 = dialog0.getWindow();
            if(window1 != null) {
                View view0 = window1.getDecorView();
                if(view0 != null) {
                    view0.setPadding(0, 0, 0, 0);
                }
            }
            this.g = false;
            dialog0.show();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog0 = this.f;
        if(dialog0 != null) {
            dialog0.hide();
        }
    }

    @j
    public void p0(@m Context context0, @m String s) {
        Activity activity0 = this.k0(context0);
        if(!(activity0 instanceof FragmentActivity)) {
            throw new Exception("actualContext require FragmentActivity but is " + activity0);
        }
        if(((FragmentActivity)activity0).isFinishing()) {
            throw new Exception("actualContext is Finishing or finished");
        }
        FragmentManager fragmentManager0 = this.d;
        if(fragmentManager0 != null) {
            FragmentTransaction fragmentTransaction0 = fragmentManager0.u();
            if(fragmentTransaction0 != null) {
                FragmentTransaction fragmentTransaction1 = fragmentTransaction0.B(this);
                if(fragmentTransaction1 != null) {
                    fragmentTransaction1.r();
                }
            }
        }
        this.show(((FragmentActivity)activity0).getSupportFragmentManager(), s);
    }

    public static void q0(i i0, Context context0, String s, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if((v & 2) != 0) {
            s = null;
        }
        i0.p0(context0, s);
    }

    public static void r0(i i0, FragmentManager fragmentManager0, String s, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if((v & 2) != 0) {
            s = null;
        }
        i0.show(fragmentManager0, s);
    }

    public final void setCancelable(boolean z) {
        this.c = z;
        Dialog dialog0 = this.f;
        if(dialog0 != null) {
            dialog0.setCancelable(z);
        }
    }

    public final void setShowsDialog(boolean z) {
        this.e = z;
    }

    public final void setStyle(int v, @StyleRes int v1) {
        this.a = v;
        if(v == 2 || v == 3) {
            this.n0(0x1030059);
        }
        if(v1 != 0) {
            this.n0(v1);
        }
    }

    public final void setupDialog(@l Dialog dialog0, int v) {
        L.p(dialog0, "dialog");
        if(dialog0 instanceof AppCompatDialog) {
            switch(v) {
                case 1: 
                case 2: {
                    ((AppCompatDialog)dialog0).k(1);
                    break;
                }
                case 3: {
                    Window window0 = ((AppCompatDialog)dialog0).getWindow();
                    if(window0 != null) {
                        window0.addFlags(24);
                    }
                    ((AppCompatDialog)dialog0).k(1);
                }
            }
        }
    }

    public void show(@m FragmentManager fragmentManager0, @m String s) {
        this.h = false;
        this.i = true;
        this.d = fragmentManager0;
        L.m(fragmentManager0);
        fragmentManager0.u().k(this, s).q();
    }
}

