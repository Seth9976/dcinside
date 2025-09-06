package com.igaworks.ssp;

import android.content.Context;
import android.widget.ImageView;

public class v extends ImageView {
    private boolean a;

    public v(Context context0) {
        super(context0);
        this.setBackgroundResource(mipmap.igaw_ssp_checkbox_normal_btn);
    }

    public void setChecked(boolean z) {
        if(z) {
            this.setImageResource(mipmap.igaw_ssp_checkbox_select_btn);
        }
        else {
            this.setImageBitmap(null);
        }
        this.a = z;
    }
}

