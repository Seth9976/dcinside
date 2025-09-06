package com.leinardi.android.speeddial;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;

public class SpeedDialOverlayLayout extends RelativeLayout {
    private boolean a;
    private int b;
    @Nullable
    private View.OnClickListener c;
    private static final String d = "SpeedDialOverlayLayout";

    static {
    }

    public SpeedDialOverlayLayout(@NonNull Context context0) {
        super(context0);
    }

    public SpeedDialOverlayLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.d(context0, attributeSet0);
    }

    public SpeedDialOverlayLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        super(context0, attributeSet0, v);
        this.d(context0, attributeSet0);
    }

    public boolean a() {
        return this.a;
    }

    public void b() {
        this.c(true);
    }

    public void c(boolean z) {
        if(z) {
            b.e(this);
            return;
        }
        this.setVisibility(8);
    }

    private void d(Context context0, @Nullable AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.SpeedDialOverlayLayout, 0, 0);
        Resources resources0 = this.getResources();
        Resources.Theme resources$Theme0 = context0.getTheme();
        int v = ResourcesCompat.e(resources0, color.sd_overlay_color, resources$Theme0);
        try {
            v = typedArray0.getColor(styleable.SpeedDialOverlayLayout_android_background, v);
            this.a = typedArray0.getBoolean(styleable.SpeedDialOverlayLayout_clickable_overlay, true);
        }
        catch(Exception exception0) {
            Log.e("SpeedDialOverlayLayout", "Failure setting FabOverlayLayout attrs", exception0);
        }
        finally {
            typedArray0.recycle();
        }
        this.setElevation(this.getResources().getDimension(dimen.sd_overlay_elevation));
        this.setBackgroundColor(v);
        this.setVisibility(8);
        this.b = this.getResources().getInteger(0x10E0002);
    }

    public void e() {
        this.f(true);
    }

    public void f(boolean z) {
        if(z) {
            b.d(this);
            return;
        }
        this.setVisibility(0);
    }

    public void setAnimationDuration(int v) {
        this.b = v;
    }

    public void setClickableOverlay(boolean z) {
        this.a = z;
        this.setOnClickListener(this.c);
    }

    @Override  // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
        this.c = view$OnClickListener0;
        if(!this.a()) {
            view$OnClickListener0 = null;
        }
        super.setOnClickListener(view$OnClickListener0);
    }
}

