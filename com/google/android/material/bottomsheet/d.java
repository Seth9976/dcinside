package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class d extends AppCompatDialogFragment {
    static class a {
    }

    class b extends g {
        final d a;

        private b() {
        }

        b(a d$a0) {
        }

        @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$g
        public void b(@NonNull View view0, float f) {
        }

        @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$g
        public void c(@NonNull View view0, int v) {
            if(v == 5) {
                d.this.l0();
            }
        }
    }

    private boolean a;

    public d() {
    }

    @SuppressLint({"ValidFragment"})
    public d(@LayoutRes int v) {
        super(v);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if(!this.n0(false)) {
            super.dismiss();
        }
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if(!this.n0(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    private void l0() {
        if(this.a) {
            super.dismissAllowingStateLoss();
            return;
        }
        super.dismiss();
    }

    private void m0(@NonNull BottomSheetBehavior bottomSheetBehavior0, boolean z) {
        this.a = z;
        if(bottomSheetBehavior0.getState() == 5) {
            this.l0();
            return;
        }
        if(this.getDialog() instanceof c) {
            ((c)this.getDialog()).v();
        }
        bottomSheetBehavior0.h0(new b(this, null));
        bottomSheetBehavior0.g(5);
    }

    private boolean n0(boolean z) {
        Dialog dialog0 = this.getDialog();
        if(dialog0 instanceof c) {
            BottomSheetBehavior bottomSheetBehavior0 = ((c)dialog0).q();
            if(bottomSheetBehavior0.T0() && ((c)dialog0).t()) {
                this.m0(bottomSheetBehavior0, z);
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.appcompat.app.AppCompatDialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle0) {
        return new c(this.getContext(), this.getTheme());
    }
}

