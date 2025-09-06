package com.igaworks.ssp;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import android.widget.VideoView;

public class c extends VideoView {
    private int a;
    private int b;
    private boolean c;

    public c(Context context0, int v, int v1) {
        super(context0, null);
        this.a = v;
        this.b = v1;
        this.c = true;
    }

    @Override  // android.widget.VideoView
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.c) {
            this.setMeasuredDimension(this.a, this.b);
            return;
        }
        Display display0 = ((WindowManager)this.getContext().getSystemService("window")).getDefaultDisplay();
        this.setMeasuredDimension(display0.getWidth(), display0.getHeight());
    }
}

