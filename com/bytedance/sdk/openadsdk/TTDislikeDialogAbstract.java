package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.ReZ.DWo.Zh;
import com.bytedance.sdk.openadsdk.ReZ.DWo;
import java.util.List;

public abstract class TTDislikeDialogAbstract extends Dialog implements Zh {
    private String JQp;
    protected String PjT;
    protected final DWo ReZ;
    protected List Zh;
    private View cr;

    public TTDislikeDialogAbstract(@NonNull Context context0) {
        super(context0);
        DWo dWo0 = new DWo();
        this.ReZ = dWo0;
        dWo0.PjT(this);
    }

    public TTDislikeDialogAbstract(@NonNull Context context0, int v, String s) {
        super(context0, v);
        this.JQp = s;
        DWo dWo0 = new DWo();
        this.ReZ = dWo0;
        dWo0.PjT(this);
    }

    public void destroy() {
        DWo dWo0 = this.ReZ;
        if(dWo0 != null) {
            dWo0.PjT();
        }
    }

    public DWo getDislikeManager() {
        return this.ReZ;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override  // android.app.Dialog
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.cr = this.getLayoutView();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        View view0 = this.cr;
        if(viewGroup$LayoutParams0 == null) {
            viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -1);
        }
        this.setContentView(view0, viewGroup$LayoutParams0);
    }

    public void onSuggestionSubmit(String s) {
        DWo dWo0 = this.ReZ;
        if(dWo0 != null) {
            dWo0.ReZ(s);
        }
    }

    public void setMaterialMeta(String s, List list0) {
        this.PjT = s;
        this.Zh = list0;
        this.ReZ.PjT(s);
        this.ReZ.PjT(this.Zh);
    }
}

