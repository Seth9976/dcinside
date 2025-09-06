package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import java.util.Calendar;
import java.util.Locale;

class k extends BaseAdapter {
    @NonNull
    private final Calendar a;
    private final int b;
    private final int c;
    private static final int d = 4;
    private static final int e;

    static {
        k.e = Build.VERSION.SDK_INT < 26 ? 1 : 4;
    }

    public k() {
        Calendar calendar0 = C.x();
        this.a = calendar0;
        this.b = calendar0.getMaximum(7);
        this.c = calendar0.getFirstDayOfWeek();
    }

    public k(int v) {
        Calendar calendar0 = C.x();
        this.a = calendar0;
        this.b = calendar0.getMaximum(7);
        this.c = v;
    }

    @Nullable
    public Integer a(int v) {
        return v < this.b ? this.b(v) : null;
    }

    private int b(int v) {
        int v1 = v + this.c;
        return v1 <= this.b ? v1 : v1 - this.b;
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        return this.b;
    }

    @Override  // android.widget.Adapter
    @Nullable
    public Object getItem(int v) {
        return this.a(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return 0L;
    }

    @Override  // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    @Nullable
    public View getView(int v, @Nullable View view0, @NonNull ViewGroup viewGroup0) {
        View view1 = (TextView)view0;
        if(view0 == null) {
            view1 = (TextView)LayoutInflater.from(viewGroup0.getContext()).inflate(layout.mtrl_calendar_day_of_week, viewGroup0, false);
        }
        int v1 = this.b(v);
        this.a.set(7, v1);
        Configuration configuration0 = view1.getResources().getConfiguration();
        ((TextView)view1).setText(this.a.getDisplayName(7, k.e, configuration0.locale));
        String s = viewGroup0.getContext().getString(string.mtrl_picker_day_of_week_column_header);
        Locale locale0 = Locale.getDefault();
        view1.setContentDescription(String.format(s, this.a.getDisplayName(7, 2, locale0)));
        return view1;
    }
}

