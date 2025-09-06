package com.leinardi.android.speeddial;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.ImageViewCompat;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FabWithLabelView extends LinearLayout {
    private TextView a;
    private FloatingActionButton b;
    private CardView c;
    private boolean d;
    @Nullable
    private SpeedDialActionItem e;
    @Nullable
    private h f;
    private int g;
    private float h;
    @Nullable
    private Drawable i;
    private static final String j = "FabWithLabelView";

    static {
    }

    public FabWithLabelView(Context context0) {
        super(context0);
        this.b(context0, null);
    }

    public FabWithLabelView(Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b(context0, attributeSet0);
    }

    public FabWithLabelView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.b(context0, attributeSet0);
    }

    private void b(Context context0, @Nullable AttributeSet attributeSet0) {
        View view0 = View.inflate(context0, layout.sd_fab_with_label_view, this);
        view0.setFocusable(false);
        view0.setFocusableInTouchMode(false);
        this.b = (FloatingActionButton)view0.findViewById(id.sd_fab);
        this.a = (TextView)view0.findViewById(id.sd_label);
        this.c = (CardView)view0.findViewById(id.sd_label_container);
        this.setFabSize(1);
        this.setOrientation(0);
        this.setClipChildren(false);
        this.setClipToPadding(false);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.FabWithLabelView, 0, 0);
        try {
            int v1 = typedArray0.getResourceId(styleable.FabWithLabelView_srcCompat, 0x80000000);
            if(v1 == 0x80000000) {
                v1 = typedArray0.getResourceId(styleable.FabWithLabelView_android_src, 0x80000000);
            }
            b speedDialActionItem$b0 = new b(this.getId(), v1);
            speedDialActionItem$b0.y(typedArray0.getString(styleable.FabWithLabelView_fabLabel));
            int v2 = com.leinardi.android.speeddial.b.j(context0);
            speedDialActionItem$b0.t(typedArray0.getColor(styleable.FabWithLabelView_fabBackgroundColor, v2));
            speedDialActionItem$b0.B(typedArray0.getColor(styleable.FabWithLabelView_fabLabelColor, 0x80000000));
            speedDialActionItem$b0.z(typedArray0.getColor(styleable.FabWithLabelView_fabLabelBackgroundColor, 0x80000000));
            speedDialActionItem$b0.A(typedArray0.getBoolean(styleable.FabWithLabelView_fabLabelClickable, true));
            this.setSpeedDialActionItem(speedDialActionItem$b0.q());
        }
        catch(Exception exception0) {
            Log.e("FabWithLabelView", "Failure setting FabWithLabelView icon", exception0);
        }
        finally {
            typedArray0.recycle();
        }
    }

    public boolean c() {
        return this.d;
    }

    public FloatingActionButton getFab() {
        return this.b;
    }

    public CardView getLabelBackground() {
        return this.c;
    }

    public SpeedDialActionItem getSpeedDialActionItem() {
        SpeedDialActionItem speedDialActionItem0 = this.e;
        if(speedDialActionItem0 == null) {
            throw new IllegalStateException("SpeedDialActionItem not set yet!");
        }
        return speedDialActionItem0;
    }

    public b getSpeedDialActionItemBuilder() {
        return new b(this.getSpeedDialActionItem());
    }

    private void setFabBackgroundColor(@ColorInt int v) {
        this.b.setBackgroundTintList(ColorStateList.valueOf(v));
    }

    private void setFabContentDescription(@Nullable CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            this.b.setContentDescription(charSequence0);
        }
    }

    private void setFabIcon(@Nullable Drawable drawable0) {
        this.b.setImageDrawable(drawable0);
    }

    private void setFabImageTintColor(@ColorInt int v) {
        ImageViewCompat.c(this.b, ColorStateList.valueOf(v));
    }

    private void setFabSize(int v) {
        LinearLayout.LayoutParams linearLayout$LayoutParams1;
        int v1 = this.getContext().getResources().getDimensionPixelSize(dimen.sd_fab_normal_size);
        int v2 = this.getContext().getResources().getDimensionPixelSize(dimen.sd_fab_mini_size);
        int v3 = this.getContext().getResources().getDimensionPixelSize(dimen.sd_fab_side_margin);
        int v4 = v == 0 ? v1 : v2;
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
        if(this.getOrientation() == 0) {
            linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, v4);
            linearLayout$LayoutParams1.gravity = 0x800005;
            if(v == 0) {
                int v5 = v3 - (v1 - v2) / 2;
                linearLayout$LayoutParams0.setMargins(v5, 0, v5, 0);
            }
            else {
                linearLayout$LayoutParams0.setMargins(v3, 0, v3, 0);
            }
        }
        else {
            linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(v4, -2);
            linearLayout$LayoutParams1.gravity = 16;
            linearLayout$LayoutParams0.setMargins(0, 0, 0, 0);
        }
        this.setLayoutParams(linearLayout$LayoutParams1);
        this.b.setLayoutParams(linearLayout$LayoutParams0);
        this.g = v;
    }

    private void setLabel(@Nullable CharSequence charSequence0) {
        boolean z = false;
        if(!TextUtils.isEmpty(charSequence0)) {
            this.a.setText(charSequence0);
            if(this.getOrientation() == 0) {
                z = true;
            }
            this.setLabelEnabled(z);
            return;
        }
        this.setLabelEnabled(false);
    }

    private void setLabelBackgroundColor(@ColorInt int v) {
        if(v == 0) {
            this.c.setCardBackgroundColor(0);
            this.h = this.c.getElevation();
            this.c.setElevation(0.0f);
            return;
        }
        this.c.setCardBackgroundColor(ColorStateList.valueOf(v));
        float f = this.h;
        if(f != 0.0f) {
            this.c.setElevation(f);
            this.h = 0.0f;
        }
    }

    private void setLabelClickable(boolean z) {
        this.getLabelBackground().setClickable(z);
        this.getLabelBackground().setFocusable(z);
        this.getLabelBackground().setEnabled(z);
    }

    private void setLabelColor(@ColorInt int v) {
        this.a.setTextColor(v);
    }

    private void setLabelEnabled(boolean z) {
        this.d = z;
        this.c.setVisibility((z ? 0 : 8));
    }

    public void setOnActionSelectedListener(@Nullable h speedDialView$h0) {
        class a implements View.OnClickListener {
            final FabWithLabelView a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                SpeedDialActionItem speedDialActionItem0 = FabWithLabelView.this.getSpeedDialActionItem();
                if(FabWithLabelView.this.f != null && speedDialActionItem0 != null) {
                    if(speedDialActionItem0.I()) {
                        com.leinardi.android.speeddial.b.l(FabWithLabelView.this.getLabelBackground());
                        return;
                    }
                    com.leinardi.android.speeddial.b.l(FabWithLabelView.this.getFab());
                }
            }
        }


        class com.leinardi.android.speeddial.FabWithLabelView.b implements View.OnClickListener {
            final FabWithLabelView a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                SpeedDialActionItem speedDialActionItem0 = FabWithLabelView.this.getSpeedDialActionItem();
                if(FabWithLabelView.this.f != null && speedDialActionItem0 != null) {
                    FabWithLabelView.this.f.a(speedDialActionItem0);
                }
            }
        }


        class c implements View.OnClickListener {
            final FabWithLabelView a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                SpeedDialActionItem speedDialActionItem0 = FabWithLabelView.this.getSpeedDialActionItem();
                if(FabWithLabelView.this.f != null && speedDialActionItem0 != null && speedDialActionItem0.I()) {
                    FabWithLabelView.this.f.a(speedDialActionItem0);
                }
            }
        }

        this.f = speedDialView$h0;
        if(speedDialView$h0 != null) {
            this.setOnClickListener(new a(this));
            this.getFab().setOnClickListener(new com.leinardi.android.speeddial.FabWithLabelView.b(this));
            this.getLabelBackground().setOnClickListener(new c(this));
            return;
        }
        this.getFab().setOnClickListener(null);
        this.getLabelBackground().setOnClickListener(null);
    }

    @Override  // android.widget.LinearLayout
    public void setOrientation(int v) {
        super.setOrientation(v);
        this.setFabSize(this.g);
        if(v == 1) {
            this.setLabelEnabled(false);
            return;
        }
        this.setLabel(this.a.getText().toString());
    }

    public void setSpeedDialActionItem(SpeedDialActionItem speedDialActionItem0) {
        this.e = speedDialActionItem0;
        if(speedDialActionItem0.C().equals("fill")) {
            this.removeView(this.b);
            this.b = (FloatingActionButton)View.inflate(this.getContext(), layout.sd_fill_fab, this).findViewById(id.sd_fab_fill);
        }
        this.setId(speedDialActionItem0.D());
        this.setLabel(speedDialActionItem0.E(this.getContext()));
        this.setFabContentDescription(speedDialActionItem0.w(this.getContext()));
        SpeedDialActionItem speedDialActionItem1 = this.getSpeedDialActionItem();
        this.setLabelClickable(speedDialActionItem1 != null && speedDialActionItem1.I());
        this.setFabIcon(speedDialActionItem0.y(this.getContext()));
        int v = speedDialActionItem0.A() == 0x80000000 ? com.leinardi.android.speeddial.b.i(this.getContext()) : speedDialActionItem0.A();
        if(speedDialActionItem0.z()) {
            this.setFabImageTintColor(v);
        }
        this.setFabBackgroundColor((speedDialActionItem0.x() == 0x80000000 ? com.leinardi.android.speeddial.b.j(this.getContext()) : speedDialActionItem0.x()));
        int v1 = speedDialActionItem0.G();
        if(v1 == 0x80000000) {
            Resources resources0 = this.getResources();
            Resources.Theme resources$Theme0 = this.getContext().getTheme();
            v1 = ResourcesCompat.e(resources0, color.sd_label_text_color, resources$Theme0);
        }
        this.setLabelColor(v1);
        int v2 = speedDialActionItem0.F();
        if(v2 == 0x80000000) {
            Resources resources1 = this.getResources();
            Resources.Theme resources$Theme1 = this.getContext().getTheme();
            v2 = ResourcesCompat.e(resources1, color.sd_label_background_color, resources$Theme1);
        }
        this.setLabelBackgroundColor(v2);
        if(speedDialActionItem0.B() == -1 || speedDialActionItem0.C().equals("fill")) {
            this.getFab().setSize(1);
        }
        else {
            this.getFab().setSize(speedDialActionItem0.B());
        }
        this.setFabSize(speedDialActionItem0.B());
    }

    @Override  // android.view.View
    @SuppressLint({"RestrictedApi"})
    public void setVisibility(int v) {
        super.setVisibility(v);
        this.getFab().setVisibility(v);
        if(this.c()) {
            this.getLabelBackground().setVisibility(v);
        }
    }
}

