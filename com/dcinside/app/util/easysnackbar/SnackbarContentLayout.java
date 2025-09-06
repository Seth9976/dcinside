package com.dcinside.app.util.easysnackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.dcinside.app.R.styleable;

@RestrictTo({Scope.b})
public class SnackbarContentLayout extends LinearLayout implements n {
    private TextView a;
    private Button b;
    private int c;
    private int d;

    public SnackbarContentLayout(Context context0) {
        this(context0, null);
    }

    public SnackbarContentLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.SnackbarLayout);
        this.c = typedArray0.getDimensionPixelSize(0, -1);
        this.d = typedArray0.getDimensionPixelSize(7, -1);
        typedArray0.recycle();
    }

    @Override  // com.dcinside.app.util.easysnackbar.d$n
    public void a(int v, int v1) {
        this.a.setAlpha(0.0f);
        this.a.animate().alpha(1.0f).setDuration(((long)v1)).setStartDelay(((long)v)).start();
        if(this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(((long)v1)).setStartDelay(((long)v)).start();
        }
    }

    @Override  // com.dcinside.app.util.easysnackbar.d$n
    public void b(int v, int v1) {
        this.a.setAlpha(1.0f);
        this.a.animate().alpha(0.0f).setDuration(((long)v1)).setStartDelay(((long)v)).start();
        if(this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(((long)v1)).setStartDelay(((long)v)).start();
        }
    }

    private static void c(View view0, int v, int v1) {
        if(ViewCompat.e1(view0)) {
            ViewCompat.p2(view0, ViewCompat.p0(view0), v, ViewCompat.o0(view0), v1);
            return;
        }
        view0.setPadding(view0.getPaddingLeft(), v, view0.getPaddingRight(), v1);
    }

    private boolean d(int v, int v1, int v2) {
        boolean z;
        if(v == this.getOrientation()) {
            z = false;
        }
        else {
            this.setOrientation(v);
            z = true;
        }
        if(this.a.getPaddingTop() == v1 && this.a.getPaddingBottom() == v2) {
            return z;
        }
        SnackbarContentLayout.c(this.a, v1, v2);
        return true;
    }

    public Button getActionView() {
        return this.b;
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(0x7F0B0F20);  // id:snackbar_text
        this.b = (Button)this.findViewById(0x7F0B0F1F);  // id:snackbar_action
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.c > 0) {
            int v2 = this.getMeasuredWidth();
            int v3 = this.c;
            if(v2 > v3) {
                v = View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
                super.onMeasure(v, v1);
            }
        }
        int v4 = this.getResources().getDimensionPixelSize(0x7F0700B3);  // dimen:design_snackbar_padding_vertical_2lines
        int v5 = this.getResources().getDimensionPixelSize(0x7F0700B2);  // dimen:design_snackbar_padding_vertical
        boolean z = this.a.getLayout().getLineCount() > 1;
        if(!z || this.d <= 0 || this.b.getMeasuredWidth() <= this.d) {
            if(!z) {
                v4 = v5;
            }
            if(this.d(0, v4, v4)) {
                super.onMeasure(v, v1);
            }
        }
        else if(this.d(1, v4, v4 - v5)) {
            super.onMeasure(v, v1);
        }
    }
}

