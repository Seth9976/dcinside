package com.google.android.material.textview;

import I1.a;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R.attr;
import com.google.android.material.R.styleable;
import com.google.android.material.resources.b;
import com.google.android.material.resources.d;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x1010084);
    }

    public MaterialTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(a.c(context0, attributeSet0, v, 0), attributeSet0, v);
        this.y(attributeSet0, v, 0);
    }

    @Deprecated
    public MaterialTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        super(a.c(context0, attributeSet0, v, v1), attributeSet0, v);
        this.y(attributeSet0, v, v1);
    }

    private static boolean A(@NonNull Context context0, @NonNull Resources.Theme resources$Theme0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        TypedArray typedArray0 = resources$Theme0.obtainStyledAttributes(attributeSet0, styleable.MaterialTextView, v, v1);
        int v2 = MaterialTextView.z(context0, typedArray0, new int[]{styleable.MaterialTextView_android_lineHeight, styleable.MaterialTextView_lineHeight});
        typedArray0.recycle();
        return v2 != -1;
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView
    public void setTextAppearance(@NonNull Context context0, int v) {
        super.setTextAppearance(context0, v);
        if(MaterialTextView.w(context0)) {
            this.v(context0.getTheme(), v);
        }
    }

    private void v(@NonNull Resources.Theme resources$Theme0, int v) {
        TypedArray typedArray0 = resources$Theme0.obtainStyledAttributes(v, styleable.MaterialTextAppearance);
        int v1 = MaterialTextView.z(this.getContext(), typedArray0, new int[]{styleable.MaterialTextAppearance_android_lineHeight, styleable.MaterialTextAppearance_lineHeight});
        typedArray0.recycle();
        if(v1 >= 0) {
            this.setLineHeight(v1);
        }
    }

    private static boolean w(Context context0) {
        return b.b(context0, attr.textAppearanceLineHeightEnabled, true);
    }

    private static int x(@NonNull Resources.Theme resources$Theme0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        TypedArray typedArray0 = resources$Theme0.obtainStyledAttributes(attributeSet0, styleable.MaterialTextView, v, v1);
        int v2 = typedArray0.getResourceId(styleable.MaterialTextView_android_textAppearance, -1);
        typedArray0.recycle();
        return v2;
    }

    private void y(@Nullable AttributeSet attributeSet0, int v, int v1) {
        Context context0 = this.getContext();
        if(MaterialTextView.w(context0)) {
            Resources.Theme resources$Theme0 = context0.getTheme();
            if(!MaterialTextView.A(context0, resources$Theme0, attributeSet0, v, v1)) {
                int v2 = MaterialTextView.x(resources$Theme0, attributeSet0, v, v1);
                if(v2 != -1) {
                    this.v(resources$Theme0, v2);
                }
            }
        }
    }

    private static int z(@NonNull Context context0, @NonNull TypedArray typedArray0, @NonNull @StyleableRes int[] arr_v) {
        int v1 = -1;
        for(int v = 0; v < arr_v.length && v1 < 0; ++v) {
            v1 = d.d(context0, typedArray0, arr_v[v], -1);
        }
        return v1;
    }
}

