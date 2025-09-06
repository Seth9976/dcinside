package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;

class s extends Adapter {
    public static class b extends ViewHolder {
        final TextView a;
        final MaterialCalendarGridView b;

        b(@NonNull LinearLayout linearLayout0, boolean z) {
            super(linearLayout0);
            TextView textView0 = (TextView)linearLayout0.findViewById(id.month_title);
            this.a = textView0;
            ViewCompat.K1(textView0, true);
            this.b = (MaterialCalendarGridView)linearLayout0.findViewById(id.month_grid);
            if(!z) {
                textView0.setVisibility(8);
            }
        }
    }

    @NonNull
    private final CalendarConstraints a;
    private final DateSelector b;
    @Nullable
    private final DayViewDecorator c;
    private final m d;
    private final int e;

    s(@NonNull Context context0, DateSelector dateSelector0, @NonNull CalendarConstraints calendarConstraints0, @Nullable DayViewDecorator dayViewDecorator0, m l$m0) {
        Month month0 = calendarConstraints0.i();
        Month month1 = calendarConstraints0.q();
        if(calendarConstraints0.s().a(month1) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if(month1.a(month0) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int v = l.y0(context0);
        int v1 = n.I0(context0) ? l.y0(context0) : 0;
        this.e = r.g * v + v1;
        this.a = calendarConstraints0;
        this.b = dateSelector0;
        this.c = dayViewDecorator0;
        this.d = l$m0;
        this.setHasStableIds(true);
    }

    @NonNull
    public b A(@NonNull ViewGroup viewGroup0, int v) {
        LinearLayout linearLayout0 = (LinearLayout)LayoutInflater.from(viewGroup0.getContext()).inflate(layout.mtrl_calendar_month_labeled, viewGroup0, false);
        if(n.I0(viewGroup0.getContext())) {
            linearLayout0.setLayoutParams(new LayoutParams(-1, this.e));
            return new b(linearLayout0, true);
        }
        return new b(linearLayout0, false);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.o();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public long getItemId(int v) {
        return this.a.s().m(v).l();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0, int v) {
        this.z(((b)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup0, int v) {
        return this.A(viewGroup0, v);
    }

    @NonNull
    Month w(int v) {
        return this.a.s().m(v);
    }

    @NonNull
    CharSequence x(int v) {
        return this.w(v).i();
    }

    int y(@NonNull Month month0) {
        return this.a.s().r(month0);
    }

    public void z(@NonNull b s$b0, int v) {
        class a implements AdapterView.OnItemClickListener {
            final MaterialCalendarGridView a;
            final s b;

            a(MaterialCalendarGridView materialCalendarGridView0) {
                this.a = materialCalendarGridView0;
                super();
            }

            @Override  // android.widget.AdapterView$OnItemClickListener
            public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
                if(this.a.b().r(v)) {
                    s.this.d.a(((long)this.a.b().d(v)));
                }
            }
        }

        Month month0 = this.a.s().m(v);
        String s = month0.i();
        s$b0.a.setText(s);
        MaterialCalendarGridView materialCalendarGridView0 = (MaterialCalendarGridView)s$b0.b.findViewById(id.month_grid);
        if(materialCalendarGridView0.b() == null || !month0.equals(materialCalendarGridView0.b().a)) {
            r r0 = new r(month0, this.b, this.a, this.c);
            materialCalendarGridView0.setNumColumns(month0.d);
            materialCalendarGridView0.setAdapter(r0);
        }
        else {
            materialCalendarGridView0.invalidate();
            materialCalendarGridView0.b().q(materialCalendarGridView0);
        }
        materialCalendarGridView0.setOnItemClickListener(new a(this, materialCalendarGridView0));
    }
}

