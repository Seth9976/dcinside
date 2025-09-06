package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.color.v;
import com.google.android.material.motion.j;

@RestrictTo({Scope.b})
public class SnackbarContentLayout extends LinearLayout implements b {
    private TextView a;
    private Button b;
    private final TimeInterpolator c;
    private int d;

    public SnackbarContentLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public SnackbarContentLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c = j.g(context0, attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.b.b);
    }

    @Override  // com.google.android.material.snackbar.b
    public void a(int v, int v1) {
        this.a.setAlpha(0.0f);
        this.a.animate().alpha(1.0f).setDuration(((long)v1)).setInterpolator(this.c).setStartDelay(((long)v)).start();
        if(this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(((long)v1)).setInterpolator(this.c).setStartDelay(((long)v)).start();
        }
    }

    @Override  // com.google.android.material.snackbar.b
    public void b(int v, int v1) {
        this.a.setAlpha(1.0f);
        this.a.animate().alpha(0.0f).setDuration(((long)v1)).setInterpolator(this.c).setStartDelay(((long)v)).start();
        if(this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(((long)v1)).setInterpolator(this.c).setStartDelay(((long)v)).start();
        }
    }

    void c(float f) {
        if(f != 1.0f) {
            int v = this.b.getCurrentTextColor();
            int v1 = v.t(v.d(this, attr.colorSurface), v, f);
            this.b.setTextColor(v1);
        }
    }

    private static void d(@NonNull View view0, int v, int v1) {
        if(ViewCompat.e1(view0)) {
            ViewCompat.p2(view0, ViewCompat.p0(view0), v, ViewCompat.o0(view0), v1);
            return;
        }
        view0.setPadding(view0.getPaddingLeft(), v, view0.getPaddingRight(), v1);
    }

    private boolean e(int v, int v1, int v2) {
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
        SnackbarContentLayout.d(this.a, v1, v2);
        return true;
    }

    public Button getActionView() {
        return this.b;
    }

    public TextView getMessageView() {
        return this.a;
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(id.snackbar_text);
        this.b = (Button)this.findViewById(id.snackbar_action);
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.getOrientation() == 1) {
            return;
        }
        int v2 = this.getResources().getDimensionPixelSize(dimen.design_snackbar_padding_vertical_2lines);
        int v3 = this.getResources().getDimensionPixelSize(dimen.design_snackbar_padding_vertical);
        Layout layout0 = this.a.getLayout();
        boolean z = layout0 != null && layout0.getLineCount() > 1;
        if(!z || this.d <= 0 || this.b.getMeasuredWidth() <= this.d) {
            if(!z) {
                v2 = v3;
            }
            if(this.e(0, v2, v2)) {
                super.onMeasure(v, v1);
            }
        }
        else if(this.e(1, v2, v2 - v3)) {
            super.onMeasure(v, v1);
        }
    }

    public void setMaxInlineActionWidth(int v) {
        this.d = v;
    }
}

