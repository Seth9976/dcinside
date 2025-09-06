package com.dcinside.rich.color;

import android.content.Context;
import android.widget.LinearLayout.LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import com.dcinside.rich.R.drawable;

public class b extends AppCompatImageView {
    private Context a;
    private int b;

    public b(Context context0, int v) {
        super(context0);
        this.a = context0;
        this.b = v;
        this.a();
    }

    private void a() {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(this.b, this.b);
        linearLayout$LayoutParams0.gravity = 17;
        this.setLayoutParams(linearLayout$LayoutParams0);
        this.setImageResource(drawable.check_mark);
    }
}

