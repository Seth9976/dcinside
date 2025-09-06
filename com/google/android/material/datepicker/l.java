package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.integer;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

@RestrictTo({Scope.b})
public final class l extends u {
    static enum com.google.android.material.datepicker.l.l {
        DAY,
        YEAR;

    }

    interface m {
        void a(long arg1);
    }

    @StyleRes
    private int b;
    @Nullable
    private DateSelector c;
    @Nullable
    private CalendarConstraints d;
    @Nullable
    private DayViewDecorator e;
    @Nullable
    private Month f;
    private com.google.android.material.datepicker.l.l g;
    private b h;
    private RecyclerView i;
    private RecyclerView j;
    private View k;
    private View l;
    private View m;
    private View n;
    private static final String o = "THEME_RES_ID_KEY";
    private static final String p = "GRID_SELECTOR_KEY";
    private static final String q = "CALENDAR_CONSTRAINTS_KEY";
    private static final String r = "DAY_VIEW_DECORATOR_KEY";
    private static final String s = "CURRENT_MONTH_KEY";
    private static final int t = 3;
    @VisibleForTesting
    static final Object u;
    @VisibleForTesting
    static final Object v;
    @VisibleForTesting
    static final Object w;
    @VisibleForTesting
    static final Object x;

    static {
        l.u = "MONTHS_VIEW_GROUP_TAG";
        l.v = "NAVIGATION_PREV_TAG";
        l.w = "NAVIGATION_NEXT_TAG";
        l.x = "SELECTOR_TOGGLE_TAG";
    }

    @NonNull
    LinearLayoutManager A0() {
        return (LinearLayoutManager)this.j.getLayoutManager();
    }

    @NonNull
    public static l B0(@NonNull DateSelector dateSelector0, @StyleRes int v, @NonNull CalendarConstraints calendarConstraints0) {
        return l.C0(dateSelector0, v, calendarConstraints0, null);
    }

    @NonNull
    public static l C0(@NonNull DateSelector dateSelector0, @StyleRes int v, @NonNull CalendarConstraints calendarConstraints0, @Nullable DayViewDecorator dayViewDecorator0) {
        l l0 = new l();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("THEME_RES_ID_KEY", v);
        bundle0.putParcelable("GRID_SELECTOR_KEY", dateSelector0);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints0);
        bundle0.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator0);
        bundle0.putParcelable("CURRENT_MONTH_KEY", calendarConstraints0.q());
        l0.setArguments(bundle0);
        return l0;
    }

    private void D0(int v) {
        class com.google.android.material.datepicker.l.b implements Runnable {
            final int a;
            final l b;

            com.google.android.material.datepicker.l.b(int v) {
                this.a = v;
                super();
            }

            @Override
            public void run() {
                l.this.j.smoothScrollToPosition(this.a);
            }
        }

        this.j.post(new com.google.android.material.datepicker.l.b(this, v));
    }

    void E0(Month month0) {
        s s0 = (s)this.j.getAdapter();
        int v = s0.y(month0);
        int v1 = v - s0.y(this.f);
        boolean z = false;
        boolean z1 = Math.abs(v1) > 3;
        if(v1 > 0) {
            z = true;
        }
        this.f = month0;
        if(z1 && z) {
            this.j.scrollToPosition(v - 3);
            this.D0(v);
            return;
        }
        if(z1) {
            this.j.scrollToPosition(v + 3);
            this.D0(v);
            return;
        }
        this.D0(v);
    }

    void F0(com.google.android.material.datepicker.l.l l$l0) {
        this.g = l$l0;
        if(l$l0 == com.google.android.material.datepicker.l.l.b) {
            int v = this.f.c;
            this.i.getLayoutManager().k2(((D)this.i.getAdapter()).x(v));
            this.m.setVisibility(0);
            this.n.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(8);
            return;
        }
        if(l$l0 == com.google.android.material.datepicker.l.l.a) {
            this.m.setVisibility(8);
            this.n.setVisibility(0);
            this.k.setVisibility(0);
            this.l.setVisibility(0);
            this.E0(this.f);
        }
    }

    private void G0() {
        class f extends AccessibilityDelegateCompat {
            final l d;

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void g(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.Z1(false);
            }
        }

        ViewCompat.J1(this.j, new f(this));
    }

    // 检测为 Lambda 实现
    void H0() [...]

    @Override  // com.google.android.material.datepicker.u
    public boolean i0(@NonNull t t0) {
        return super.i0(t0);
    }

    @Override  // com.google.android.material.datepicker.u
    @Nullable
    public DateSelector k0() {
        return this.c;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        this.b = bundle0.getInt("THEME_RES_ID_KEY");
        this.c = (DateSelector)bundle0.getParcelable("GRID_SELECTOR_KEY");
        this.d = (CalendarConstraints)bundle0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.e = (DayViewDecorator)bundle0.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f = (Month)bundle0.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override  // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        class c extends AccessibilityDelegateCompat {
            final l d;

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void g(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.m1(null);
            }
        }


        class d extends v {
            final int P;
            final l Q;

            d(Context context0, int v, boolean z, int v1) {
                this.P = v1;
                super(context0, v, z);
            }

            @Override  // androidx.recyclerview.widget.LinearLayoutManager
            protected void D2(@NonNull State recyclerView$State0, @NonNull int[] arr_v) {
                if(this.P == 0) {
                    arr_v[0] = l.this.j.getWidth();
                    arr_v[1] = l.this.j.getWidth();
                    return;
                }
                arr_v[0] = l.this.j.getHeight();
                arr_v[1] = l.this.j.getHeight();
            }
        }


        class e implements m {
            final l a;

            @Override  // com.google.android.material.datepicker.l$m
            public void a(long v) {
                if(l.this.d.h().k(v)) {
                    l.this.c.a1(v);
                    for(Object object0: l.this.a) {
                        ((t)object0).b(l.this.c.h0());
                    }
                    l.this.j.getAdapter().notifyDataSetChanged();
                    if(l.this.i != null) {
                        l.this.i.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        }

        int v1;
        int v;
        ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(this.getContext(), this.b);
        this.h = new b(contextThemeWrapper0);
        LayoutInflater layoutInflater1 = layoutInflater0.cloneInContext(contextThemeWrapper0);
        Month month0 = this.d.s();
        if(n.I0(contextThemeWrapper0)) {
            v = layout.mtrl_calendar_vertical;
            v1 = 1;
        }
        else {
            v = layout.mtrl_calendar_horizontal;
            v1 = 0;
        }
        View view0 = layoutInflater1.inflate(v, viewGroup0, false);
        view0.setMinimumHeight(l.z0(this.requireContext()));
        GridView gridView0 = (GridView)view0.findViewById(id.mtrl_calendar_days_of_week);
        ViewCompat.J1(gridView0, new c(this));
        int v2 = this.d.m();
        gridView0.setAdapter((v2 <= 0 ? new k() : new k(v2)));
        gridView0.setNumColumns(month0.d);
        gridView0.setEnabled(false);
        this.j = (RecyclerView)view0.findViewById(id.mtrl_calendar_months);
        d l$d0 = new d(this, this.getContext(), v1, false, v1);
        this.j.setLayoutManager(l$d0);
        this.j.setTag(l.u);
        s s0 = new s(contextThemeWrapper0, this.c, this.d, this.e, new e(this));
        this.j.setAdapter(s0);
        int v3 = contextThemeWrapper0.getResources().getInteger(integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(id.mtrl_calendar_year_selector_frame);
        this.i = recyclerView0;
        if(recyclerView0 != null) {
            recyclerView0.setHasFixedSize(true);
            this.i.setLayoutManager(new GridLayoutManager(contextThemeWrapper0, v3, 1, false));
            this.i.setAdapter(new D(this));
            this.i.addItemDecoration(this.u0());
        }
        if(view0.findViewById(id.month_navigation_fragment_toggle) != null) {
            this.t0(view0, s0);
        }
        if(!n.I0(contextThemeWrapper0)) {
            new PagerSnapHelper().b(this.j);
        }
        this.j.scrollToPosition(s0.y(this.f));
        this.G0();
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("THEME_RES_ID_KEY", this.b);
        bundle0.putParcelable("GRID_SELECTOR_KEY", this.c);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
        bundle0.putParcelable("DAY_VIEW_DECORATOR_KEY", this.e);
        bundle0.putParcelable("CURRENT_MONTH_KEY", this.f);
    }

    private void t0(@NonNull View view0, @NonNull s s0) {
        class a implements View.OnClickListener {
            final s a;
            final l b;

            a(s s0) {
                this.a = s0;
                super();
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                int v = l.this.A0().i();
                if(v - 1 >= 0) {
                    Month month0 = this.a.w(v - 1);
                    l.this.E0(month0);
                }
            }
        }


        class h extends AccessibilityDelegateCompat {
            final l d;

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void g(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.C1((l.this.n.getVisibility() == 0 ? l.this.getString(string.mtrl_picker_toggle_to_year_selection) : l.this.getString(string.mtrl_picker_toggle_to_day_selection)));
            }
        }


        class i extends OnScrollListener {
            final s a;
            final MaterialButton b;
            final l c;

            i(s s0, MaterialButton materialButton0) {
                this.a = s0;
                this.b = materialButton0;
                super();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView0, int v) {
                if(v == 0) {
                    recyclerView0.announceForAccessibility(this.b.getText());
                }
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
            public void onScrolled(@NonNull RecyclerView recyclerView0, int v, int v1) {
                int v2 = v >= 0 ? l.this.A0().i() : l.this.A0().s();
                Month month0 = this.a.w(v2);
                l.this.f = month0;
                CharSequence charSequence0 = this.a.x(v2);
                this.b.setText(charSequence0);
            }
        }


        class j implements View.OnClickListener {
            final l a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                l.this.H0();
            }
        }


        class com.google.android.material.datepicker.l.k implements View.OnClickListener {
            final s a;
            final l b;

            com.google.android.material.datepicker.l.k(s s0) {
                this.a = s0;
                super();
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                int v = l.this.A0().s();
                if(v + 1 < l.this.j.getAdapter().getItemCount()) {
                    Month month0 = this.a.w(v + 1);
                    l.this.E0(month0);
                }
            }
        }

        MaterialButton materialButton0 = (MaterialButton)view0.findViewById(id.month_navigation_fragment_toggle);
        materialButton0.setTag(l.x);
        ViewCompat.J1(materialButton0, new h(this));
        View view1 = view0.findViewById(id.month_navigation_previous);
        this.k = view1;
        view1.setTag(l.v);
        View view2 = view0.findViewById(id.month_navigation_next);
        this.l = view2;
        view2.setTag(l.w);
        this.m = view0.findViewById(id.mtrl_calendar_year_selector_frame);
        this.n = view0.findViewById(id.mtrl_calendar_day_selector_frame);
        this.F0(com.google.android.material.datepicker.l.l.a);
        materialButton0.setText(this.f.i());
        this.j.addOnScrollListener(new i(this, s0, materialButton0));
        materialButton0.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
            com.google.android.material.datepicker.l.l l$l0 = l.this.g;
            com.google.android.material.datepicker.l.l l$l1 = com.google.android.material.datepicker.l.l.b;
            if(l$l0 == l$l1) {
                l.this.F0(com.google.android.material.datepicker.l.l.a);
                return;
            }
            if(l$l0 == com.google.android.material.datepicker.l.l.a) {
                l.this.F0(l$l1);
            }
        });
        this.l.setOnClickListener(new com.google.android.material.datepicker.l.k(this, s0));
        this.k.setOnClickListener(new a(this, s0));
    }

    @NonNull
    private ItemDecoration u0() {
        class g extends ItemDecoration {
            private final Calendar a;
            private final Calendar b;
            final l c;

            g() {
                this.a = C.x();
                this.b = C.x();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
            public void f(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
                if(recyclerView0.getAdapter() instanceof D && recyclerView0.getLayoutManager() instanceof GridLayoutManager) {
                    D d0 = (D)recyclerView0.getAdapter();
                    GridLayoutManager gridLayoutManager0 = (GridLayoutManager)recyclerView0.getLayoutManager();
                    for(Object object0: l.this.c.e3()) {
                        Pair pair0 = (Pair)object0;
                        Object object1 = pair0.a;
                        if(object1 != null && pair0.b != null) {
                            this.a.setTimeInMillis(((long)(((Long)object1))));
                            this.b.setTimeInMillis(((long)(((Long)pair0.b))));
                            int v = d0.x(this.a.get(1));
                            int v1 = d0.x(this.b.get(1));
                            View view0 = gridLayoutManager0.c0(v);
                            View view1 = gridLayoutManager0.c0(v1);
                            int v2 = v / gridLayoutManager0.b4();
                            int v3 = v1 / gridLayoutManager0.b4();
                            for(int v4 = v2; v4 <= v3; ++v4) {
                                View view2 = gridLayoutManager0.c0(gridLayoutManager0.b4() * v4);
                                if(view2 != null) {
                                    int v5 = view2.getTop();
                                    int v6 = view2.getBottom();
                                    canvas0.drawRect(((float)(v4 != v2 || view0 == null ? 0 : view0.getLeft() + view0.getWidth() / 2)), ((float)(v5 + l.this.h.d.e())), ((float)(v4 != v3 || view1 == null ? recyclerView0.getWidth() : view1.getLeft() + view1.getWidth() / 2)), ((float)(v6 - l.this.h.d.b())), l.this.h.h);
                                }
                            }
                        }
                    }
                }
            }
        }

        return new g(this);
    }

    @Nullable
    CalendarConstraints v0() {
        return this.d;
    }

    b w0() {
        return this.h;
    }

    @Nullable
    Month x0() {
        return this.f;
    }

    @Px
    static int y0(@NonNull Context context0) {
        return context0.getResources().getDimensionPixelSize(dimen.mtrl_calendar_day_height);
    }

    private static int z0(@NonNull Context context0) {
        Resources resources0 = context0.getResources();
        int v = resources0.getDimensionPixelSize(dimen.mtrl_calendar_navigation_height);
        int v1 = resources0.getDimensionPixelOffset(dimen.mtrl_calendar_navigation_top_padding);
        int v2 = resources0.getDimensionPixelOffset(dimen.mtrl_calendar_navigation_bottom_padding);
        int v3 = resources0.getDimensionPixelSize(dimen.mtrl_calendar_days_of_week_height);
        int v4 = resources0.getDimensionPixelSize(dimen.mtrl_calendar_day_height);
        int v5 = resources0.getDimensionPixelOffset(dimen.mtrl_calendar_month_vertical_padding);
        int v6 = resources0.getDimensionPixelOffset(dimen.mtrl_calendar_bottom_padding);
        return v + v1 + v2 + v3 + (v4 * r.g + (r.g - 1) * v5) + v6;
    }
}

