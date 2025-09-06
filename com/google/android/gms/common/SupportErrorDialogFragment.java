package com.google.android.gms.common;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.Preconditions;

public class SupportErrorDialogFragment extends DialogFragment {
    private Dialog zaa;
    private DialogInterface.OnCancelListener zab;
    @Nullable
    private Dialog zac;

    @NonNull
    public static SupportErrorDialogFragment newInstance(@NonNull Dialog dialog0) {
        return SupportErrorDialogFragment.newInstance(dialog0, null);
    }

    @NonNull
    public static SupportErrorDialogFragment newInstance(@NonNull Dialog dialog0, @Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        SupportErrorDialogFragment supportErrorDialogFragment0 = new SupportErrorDialogFragment();
        Dialog dialog1 = (Dialog)Preconditions.checkNotNull(dialog0, "Cannot display null dialog");
        dialog1.setOnCancelListener(null);
        dialog1.setOnDismissListener(null);
        supportErrorDialogFragment0.zaa = dialog1;
        if(dialogInterface$OnCancelListener0 != null) {
            supportErrorDialogFragment0.zab = dialogInterface$OnCancelListener0;
        }
        return supportErrorDialogFragment0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onCancel(@NonNull DialogInterface dialogInterface0) {
        DialogInterface.OnCancelListener dialogInterface$OnCancelListener0 = this.zab;
        if(dialogInterface$OnCancelListener0 != null) {
            dialogInterface$OnCancelListener0.onCancel(dialogInterface0);
        }
    }

    @Override  // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle0) {
        Dialog dialog0 = this.zaa;
        if(dialog0 == null) {
            this.setShowsDialog(false);
            if(this.zac == null) {
                this.zac = new AlertDialog.Builder(((Context)Preconditions.checkNotNull(this.getContext()))).create();
            }
            return this.zac;
        }
        return dialog0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void show(@NonNull FragmentManager fragmentManager0, @Nullable String s) {
        super.show(fragmentManager0, s);
    }
}

