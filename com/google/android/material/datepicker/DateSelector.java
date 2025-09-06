package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import java.text.SimpleDateFormat;
import java.util.Collection;

@RestrictTo({Scope.b})
public interface DateSelector extends Parcelable {
    @NonNull
    String P2(Context arg1);

    void Q(@Nullable SimpleDateFormat arg1);

    @NonNull
    String Q1(@NonNull Context arg1);

    boolean R();

    @NonNull
    Collection T();

    void a1(long arg1);

    @StringRes
    int b();

    @NonNull
    Collection e3();

    @Nullable
    String getError();

    @Nullable
    Object h0();

    @StyleRes
    int j(Context arg1);

    void n(@NonNull Object arg1);

    @NonNull
    View p(@NonNull LayoutInflater arg1, @Nullable ViewGroup arg2, @Nullable Bundle arg3, @NonNull CalendarConstraints arg4, @NonNull t arg5);
}

