package com.igaworks.ssp;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class m extends Toast {
    private Context a;

    public m(Context context0) {
        super(context0);
        this.a = context0;
    }

    private void a(Toast toast0, View view0, int v, int v1) {
        toast0.setGravity(v1, 0, 0);
        toast0.setDuration(v);
        toast0.setView(view0);
        toast0.show();
    }

    public void a(String s, int v) {
        try {
            LinearLayout linearLayout0 = new LinearLayout(this.a);
            linearLayout0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout0.setOrientation(1);
            TextView textView0 = new TextView(this.a);
            textView0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            textView0.setGravity(17);
            textView0.setPadding(J.a(this.a, 10), J.a(this.a, 10), J.a(this.a, 10), J.a(this.a, 10));
            textView0.setBackgroundColor(Color.parseColor("#d9000000"));
            s0.a(textView0, s, 12, Color.parseColor("#ffffff"), null, 0, 0, TextUtils.TruncateAt.END, false);
            linearLayout0.addView(textView0);
            this.a(this, linearLayout0, v, 17);
        }
        catch(Exception unused_ex) {
        }
    }
}

