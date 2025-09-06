package com.google.android.material.datepicker;

import E1.a;
import E1.c;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.resources.b;
import com.google.android.material.shape.k;

@RestrictTo({Scope.b, Scope.e})
public class p extends DatePickerDialog {
    @NonNull
    private final Drawable a;
    @NonNull
    private final Rect b;
    @AttrRes
    private static final int c = 0x101035C;
    @StyleRes
    private static final int d;

    static {
        p.d = style.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;
    }

    public p(@NonNull Context context0) {
        this(context0, 0);
    }

    public p(@NonNull Context context0, int v) {
        this(context0, v, null, -1, -1, -1);
    }

    public p(@NonNull Context context0, int v, @Nullable DatePickerDialog.OnDateSetListener datePickerDialog$OnDateSetListener0, int v1, int v2, int v3) {
        super(context0, v, datePickerDialog$OnDateSetListener0, v1, v2, v3);
        Context context1 = this.getContext();
        Context context2 = this.getContext();
        String s = this.getClass().getCanonicalName();
        int v4 = b.g(context2, attr.colorSurface, s);
        k k0 = new k(context1, null, 0x101035C, p.d);
        k0.p0(ColorStateList.valueOf(v4));
        Rect rect0 = c.a(context1, 0x101035C, p.d);
        this.b = rect0;
        this.a = c.b(k0, rect0);
    }

    public p(@NonNull Context context0, @Nullable DatePickerDialog.OnDateSetListener datePickerDialog$OnDateSetListener0, int v, int v1, int v2) {
        this(context0, 0, datePickerDialog$OnDateSetListener0, v, v1, v2);
    }

    @Override  // android.app.AlertDialog
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.getWindow().setBackgroundDrawable(this.a);
        this.getWindow().getDecorView().setOnTouchListener(new a(this, this.b));
    }
}

