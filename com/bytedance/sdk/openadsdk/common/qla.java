package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.ReZ.DWo.Zh;
import com.bytedance.sdk.openadsdk.ReZ.DWo;
import com.bytedance.sdk.openadsdk.ReZ.SM;
import com.bytedance.sdk.openadsdk.ReZ.xf;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class qla extends ReZ implements Zh {
    public interface PjT {
        void PjT(View arg1);

        void PjT(FilterWord arg1);

        void Zh(View arg1);
    }

    private String JQp;
    private View PjT;
    private PjT ReZ;
    private final DWo XX;
    private Owx Zh;
    private Context cr;
    private boolean cz;

    public qla(@NonNull Context context0) {
        this(context0, null);
    }

    public qla(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public qla(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.cz = false;
        this.XX = new DWo();
        this.PjT(context0, attributeSet0);
    }

    public qla(@NonNull Context context0, @NonNull Owx owx0) {
        this(context0.getApplicationContext());
        this.Zh = owx0;
        this.cr = context0;
        this.cr();
        this.JQp();
    }

    private void JQp() {
        Owx owx0 = this.Zh;
        if(owx0 == null) {
            return;
        }
        DWo dWo0 = this.XX;
        if(dWo0 != null) {
            dWo0.PjT(owx0.na());
        }
    }

    private void PjT(Context context0, AttributeSet attributeSet0) {
        this.setClickable(true);
        this.setOnClickListener(new View.OnClickListener() {
            final qla PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(qla.this.XX != null) {
                    qla.this.XX.JQp();
                    return;
                }
                qla.this.Zh();
            }
        });
        this.setBackgroundColor(Color.parseColor("#80000000"));
        this.PjT = new SM(context0, this.XX);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout$LayoutParams0.gravity = 17;
        frameLayout$LayoutParams0.leftMargin = qZS.Zh(this.getContext(), 20.0f);
        frameLayout$LayoutParams0.rightMargin = qZS.Zh(this.getContext(), 20.0f);
        this.PjT.setLayoutParams(frameLayout$LayoutParams0);
        this.PjT.setClickable(true);
        this.JQp();
    }

    public void PjT() {
        if(this.PjT.getParent() == null) {
            this.addView(this.PjT);
        }
        this.setVisibility(0);
        this.cz = true;
        PjT qla$PjT0 = this.ReZ;
        if(qla$PjT0 != null) {
            qla$PjT0.PjT(this);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.ReZ.DWo$Zh
    public void PjT(int v) {
        if(DWo.Zh == v) {
            FilterWord filterWord0 = this.XX.Zh();
            if(filterWord0 != null && !DWo.PjT.equals(filterWord0)) {
                PjT qla$PjT0 = this.ReZ;
                if(qla$PjT0 != null) {
                    try {
                        qla$PjT0.PjT(filterWord0);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                this.Zh();
            }
            return;
        }
        if(DWo.ReZ == v) {
            this.Zh();
            return;
        }
        if(DWo.JQp == v) {
            this.ReZ();
        }
    }

    public void ReZ() {
        Context context0 = this.cr;
        if(!(context0 instanceof Activity)) {
            return;
        }
        boolean z = ((Activity)context0).isFinishing();
        xf xf0 = new xf(this.cr, this.XX);
        xf0.PjT(this.cz());
        xf0.PjT(this.Zh.xR(), this.Zh.dDm().toString());
        xf0.PjT(this.JQp);
        if(!z && !xf0.isShowing()) {
            xf0.show();
        }
    }

    public void Zh() {
        this.setVisibility(8);
        this.cz = false;
        PjT qla$PjT0 = this.ReZ;
        if(qla$PjT0 != null) {
            qla$PjT0.Zh(this);
        }
    }

    private void cr() {
        String s = this.Zh.xR();
        this.XX.PjT(s);
        this.XX.PjT(this);
    }

    private com.bytedance.sdk.openadsdk.ReZ.xf.PjT cz() {
        return new com.bytedance.sdk.openadsdk.ReZ.xf.PjT() {
            final qla PjT;

            @Override  // com.bytedance.sdk.openadsdk.ReZ.xf$PjT
            public void PjT() {
                qla.this.setVisibility(8);
            }

            @Override  // com.bytedance.sdk.openadsdk.ReZ.xf$PjT
            public void PjT(int v, FilterWord filterWord0, String s) {
                qla.this.XX.ReZ(s);
                qla.this.setVisibility(0);
            }

            @Override  // com.bytedance.sdk.openadsdk.ReZ.xf$PjT
            public void ReZ() {
                qla.this.setVisibility(0);
            }

            @Override  // com.bytedance.sdk.openadsdk.ReZ.xf$PjT
            public void Zh() {
                qla.this.setVisibility(0);
            }
        };
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DWo dWo0 = this.XX;
        if(dWo0 != null) {
            dWo0.PjT();
        }
    }

    public void setCallback(PjT qla$PjT0) {
        this.ReZ = qla$PjT0;
    }

    public void setDislikeSource(String s) {
        this.JQp = s;
        this.XX.Zh(s);
    }
}

