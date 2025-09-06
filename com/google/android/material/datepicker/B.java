package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.google.android.material.R.attr;
import com.google.android.material.R.styleable;
import com.google.android.material.resources.d;

final class b {
    @NonNull
    final a a;
    @NonNull
    final a b;
    @NonNull
    final a c;
    @NonNull
    final a d;
    @NonNull
    final a e;
    @NonNull
    final a f;
    @NonNull
    final a g;
    @NonNull
    final Paint h;

    b(@NonNull Context context0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(com.google.android.material.resources.b.g(context0, attr.materialCalendarStyle, l.class.getCanonicalName()), styleable.MaterialCalendar);
        this.a = a.a(context0, typedArray0.getResourceId(styleable.MaterialCalendar_dayStyle, 0));
        this.g = a.a(context0, typedArray0.getResourceId(styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.b = a.a(context0, typedArray0.getResourceId(styleable.MaterialCalendar_daySelectedStyle, 0));
        this.c = a.a(context0, typedArray0.getResourceId(styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateList0 = d.a(context0, typedArray0, styleable.MaterialCalendar_rangeFillColor);
        this.d = a.a(context0, typedArray0.getResourceId(styleable.MaterialCalendar_yearStyle, 0));
        this.e = a.a(context0, typedArray0.getResourceId(styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f = a.a(context0, typedArray0.getResourceId(styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint0 = new Paint();
        this.h = paint0;
        paint0.setColor(colorStateList0.getDefaultColor());
        typedArray0.recycle();
    }
}

