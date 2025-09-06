package com.bytedance.sdk.openadsdk.ReZ;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.BadTokenException;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.List;

public class cr extends TTDislikeDialogAbstract {
    public interface PjT {
        void PjT();

        void PjT(int arg1, FilterWord arg2);

        void Zh();
    }

    private String JQp;
    private PjT cr;

    public cr(Context context0, String s, List list0, String s1) {
        super(context0, Lrd.cz(context0, "tt_dislikeDialog"), s1);
        this.PjT = s;
        this.Zh = list0;
    }

    private void PjT() {
        Window window0 = this.getWindow();
        if(window0 != null && window0.getAttributes() != null) {
            window0.getAttributes().windowAnimations = 0;
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.ReZ.DWo$Zh
    public void PjT(int v) {
        if(DWo.ReZ == v) {
            this.dismiss();
            return;
        }
        if(DWo.JQp == v) {
            PjT cr$PjT0 = this.cr;
            if(cr$PjT0 != null) {
                cr$PjT0.PjT();
            }
        }
        else if(DWo.Zh == v) {
            FilterWord filterWord0 = this.ReZ.Zh();
            if(filterWord0 != null && !DWo.PjT.equals(filterWord0)) {
                PjT cr$PjT1 = this.cr;
                if(cr$PjT1 != null) {
                    try {
                        cr$PjT1.PjT(0, filterWord0);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                this.dismiss();
            }
        }
    }

    public void PjT(PjT cr$PjT0) {
        this.cr = cr$PjT0;
    }

    public void PjT(String s) {
        this.JQp = s;
    }

    private void Zh() {
        this.setOnShowListener(new DialogInterface.OnShowListener() {
            final cr PjT;

            @Override  // android.content.DialogInterface$OnShowListener
            public void onShow(DialogInterface dialogInterface0) {
            }
        });
        this.setOnDismissListener(new DialogInterface.OnDismissListener() {
            final cr PjT;

            @Override  // android.content.DialogInterface$OnDismissListener
            public void onDismiss(DialogInterface dialogInterface0) {
                if(cr.this.cr != null) {
                    cr.this.cr.Zh();
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(qZS.ReZ(this.getContext()) - 120, -2);
    }

    @Override  // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new SM(this.getContext(), this.ReZ, this.Zh);
    }

    @Override  // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    protected void onCreate(Bundle bundle0) {
        try {
            super.onCreate(bundle0);
        }
        catch(Throwable unused_ex) {
            this.dismiss();
            return;
        }
        this.setCanceledOnTouchOutside(true);
        this.setCancelable(true);
        this.PjT();
        this.Zh();
        this.setMaterialMeta(this.PjT, this.Zh);
    }

    @Override  // android.app.Dialog
    public void show() {
        try {
            super.show();
        }
        catch(WindowManager.BadTokenException unused_ex) {
        }
    }
}

