package codes.side.andcolorpicker.dialogs;

import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.fragment.app.DialogFragment;
import codes.side.andcolorpicker.R.layout;
import codes.side.andcolorpicker.R.string;
import java.util.HashMap;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class a extends DialogFragment {
    private HashMap a;

    public void k0() {
        HashMap hashMap0 = this.a;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
    }

    public View l0(int v) {
        if(this.a == null) {
            this.a = new HashMap();
        }
        View view0 = (View)this.a.get(v);
        if(view0 == null) {
            View view1 = this.getView();
            if(view1 == null) {
                return null;
            }
            view0 = view1.findViewById(v);
            this.a.put(v, view0);
        }
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    @l
    public Dialog onCreateDialog(@m Bundle bundle0) {
        static final class codes.side.andcolorpicker.dialogs.a.a implements DialogInterface.OnClickListener {
            public static final codes.side.andcolorpicker.dialogs.a.a a;

            static {
                codes.side.andcolorpicker.dialogs.a.a.a = new codes.side.andcolorpicker.dialogs.a.a();
            }

            @Override  // android.content.DialogInterface$OnClickListener
            public final void onClick(DialogInterface dialogInterface0, int v) {
            }
        }


        static final class b implements DialogInterface.OnClickListener {
            public static final b a;

            static {
                b.a = new b();
            }

            @Override  // android.content.DialogInterface$OnClickListener
            public final void onClick(DialogInterface dialogInterface0, int v) {
            }
        }

        Dialog dialog0 = new Builder(this.requireActivity()).F(string.title_dialog_pick).k(string.title_dialog_pick_message).G(layout.layout_dialog_hsla).setPositiveButton(string.action_dialog_pick_positive, codes.side.andcolorpicker.dialogs.a.a.a).setNegativeButton(string.action_dialog_pick_negative, b.a).create();
        L.o(dialog0, "AlertDialog.Builder(requ…\n\n      }\n      .create()");
        return dialog0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        this.k0();
    }
}

