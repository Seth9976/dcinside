package com.igaworks.ssp;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;

public class h extends ImageView {
    private boolean a;
    private Context b;

    public h(Context context0) {
        super(context0);
        this.b = context0;
        this.setBackgroundResource(mipmap.igaw_ssp_ic_checkbox_off);
        this.setColorFilter(0xFF1DB7FF, PorterDuff.Mode.MULTIPLY);
    }

    @Override  // android.view.View
    public boolean isSelected() {
        return this.a;
    }

    @Override  // android.widget.ImageView
    public void setSelected(boolean z) {
        if(z) {
            this.setImageResource(mipmap.igaw_ssp_ic_checkbox_on);
        }
        else {
            this.setImageBitmap(null);
        }
        this.a = z;
    }
}

