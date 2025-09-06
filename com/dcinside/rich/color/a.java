package com.dcinside.rich.color;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;

public class a extends View {
    private Context a;
    private int b;

    public a(Context context0, int v) {
        super(context0);
        this.a = context0;
        this.b = v;
        this.a();
    }

    private void a() {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(this.b, this.b);
        linearLayout$LayoutParams0.gravity = 17;
        this.setLayoutParams(linearLayout$LayoutParams0);
        this.setBackgroundColor(-1);
    }
}

