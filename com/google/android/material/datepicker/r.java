package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import com.google.android.material.R.layout;
import java.util.Collection;

class r extends BaseAdapter {
    final Month a;
    final DateSelector b;
    private Collection c;
    b d;
    final CalendarConstraints e;
    @Nullable
    final DayViewDecorator f;
    static final int g = 0;
    private static final int h = 0;
    private static final int i = -1;

    static {
        r.g = C.x().getMaximum(4);
        r.h = C.x().getMaximum(5) + C.x().getMaximum(7) - 1;
    }

    r(Month month0, DateSelector dateSelector0, CalendarConstraints calendarConstraints0, @Nullable DayViewDecorator dayViewDecorator0) {
        this.a = month0;
        this.b = dateSelector0;
        this.e = calendarConstraints0;
        this.f = dayViewDecorator0;
        this.c = dateSelector0.T();
    }

    int a(int v) {
        return this.b() + (v - 1);
    }

    int b() {
        int v = this.e.m();
        return this.a.f(v);
    }

    private String c(Context context0, long v) {
        return j.e(context0, v, this.l(v), this.k(v), this.g(v));
    }

    @Nullable
    public Long d(int v) {
        if(v >= this.b() && v <= this.m()) {
            int v1 = this.n(v);
            return this.a.g(v1);
        }
        return null;
    }

    @NonNull
    public TextView e(int v, @Nullable View view0, @NonNull ViewGroup viewGroup0) {
        int v2;
        this.f(viewGroup0.getContext());
        TextView textView0 = (TextView)view0;
        if(view0 == null) {
            textView0 = (TextView)LayoutInflater.from(viewGroup0.getContext()).inflate(layout.mtrl_calendar_day, viewGroup0, false);
        }
        int v1 = v - this.b();
        if(v1 >= 0) {
            Month month0 = this.a;
            if(v1 < month0.e) {
                v2 = v1 + 1;
                textView0.setTag(month0);
                textView0.setText(String.format(textView0.getResources().getConfiguration().locale, "%d", v2));
                textView0.setVisibility(0);
                textView0.setEnabled(true);
                goto label_17;
            }
            goto label_14;
        }
        else {
        label_14:
            textView0.setVisibility(8);
            textView0.setEnabled(false);
            v2 = -1;
        }
    label_17:
        Long long0 = this.d(v);
        if(long0 == null) {
            return textView0;
        }
        this.o(textView0, ((long)long0), v2);
        return textView0;
    }

    private void f(Context context0) {
        if(this.d == null) {
            this.d = new b(context0);
        }
    }

    @VisibleForTesting
    boolean g(long v) {
        for(Object object0: this.b.e3()) {
            Object object1 = ((Pair)object0).b;
            if(object1 != null && ((long)(((Long)object1))) == v) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        return r.h;
    }

    @Override  // android.widget.Adapter
    @Nullable
    public Object getItem(int v) {
        return this.d(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return (long)(v / this.a.d);
    }

    @Override  // android.widget.Adapter
    @NonNull
    public View getView(int v, @Nullable View view0, @NonNull ViewGroup viewGroup0) {
        return this.e(v, view0, viewGroup0);
    }

    boolean h(int v) {
        return v % this.a.d == 0;
    }

    @Override  // android.widget.BaseAdapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(int v) {
        return (v + 1) % this.a.d == 0;
    }

    private boolean j(long v) {
        for(Object object0: this.b.T()) {
            if(C.a(v) == C.a(((long)(((Long)object0))))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @VisibleForTesting
    boolean k(long v) {
        for(Object object0: this.b.e3()) {
            Object object1 = ((Pair)object0).a;
            if(object1 != null && ((long)(((Long)object1))) == v) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    private boolean l(long v) {
        return C.v().getTimeInMillis() == v;
    }

    int m() {
        return this.b() + this.a.e - 1;
    }

    int n(int v) {
        return v - this.b() + 1;
    }

    private void o(@Nullable TextView textView0, long v, int v1) {
        a a1;
        a a0;
        if(textView0 == null) {
            return;
        }
        String s = this.c(textView0.getContext(), v);
        textView0.setContentDescription(s);
        if(this.e.h().k(v)) {
            textView0.setEnabled(true);
            boolean z = this.j(v);
            textView0.setSelected(z);
            if(z) {
                a0 = this.d.b;
            }
            else {
                a0 = this.l(v) ? this.d.c : this.d.a;
            }
            a1 = a0;
        }
        else {
            textView0.setEnabled(false);
            a1 = this.d.g;
        }
        if(this.f != null && v1 != -1) {
            a1.g(textView0, null, null);
            textView0.setCompoundDrawables(null, null, null, null);
            textView0.setContentDescription(s);
            return;
        }
        a1.f(textView0);
    }

    private void p(MaterialCalendarGridView materialCalendarGridView0, long v) {
        if(Month.d(v).equals(this.a)) {
            int v1 = this.a.h(v);
            this.o(((TextView)materialCalendarGridView0.getChildAt(materialCalendarGridView0.b().a(v1) - materialCalendarGridView0.getFirstVisiblePosition())), v, v1);
        }
    }

    public void q(MaterialCalendarGridView materialCalendarGridView0) {
        for(Object object0: this.c) {
            this.p(materialCalendarGridView0, ((long)(((Long)object0))));
        }
        DateSelector dateSelector0 = this.b;
        if(dateSelector0 != null) {
            for(Object object1: dateSelector0.T()) {
                this.p(materialCalendarGridView0, ((long)(((Long)object1))));
            }
            this.c = this.b.T();
        }
    }

    boolean r(int v) {
        return v >= this.b() && v <= this.m();
    }
}

