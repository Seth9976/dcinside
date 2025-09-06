package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.string;

class i implements b, c, e, f, k {
    private final TimePickerView a;
    private final TimeModel b;
    private float c;
    private float d;
    private boolean e;
    private static final String[] f = null;
    private static final String[] g = null;
    private static final String[] h = null;
    private static final int i = 30;
    private static final int j = 6;

    static {
        i.f = new String[]{"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        i.g = new String[]{"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
        i.h = new String[]{"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    }

    public i(TimePickerView timePickerView0, TimeModel timeModel0) {
        this.e = false;
        this.a = timePickerView0;
        this.b = timeModel0;
        this.initialize();
    }

    @Override  // com.google.android.material.timepicker.k
    public void a() {
        this.a.setVisibility(8);
    }

    @Override  // com.google.android.material.timepicker.ClockHandView$b
    public void b(float f, boolean z) {
        this.e = true;
        int v = this.b.e;
        int v1 = this.b.d;
        if(this.b.f == 10) {
            this.a.I(this.d, false);
            AccessibilityManager accessibilityManager0 = (AccessibilityManager)ContextCompat.getSystemService(this.a.getContext(), AccessibilityManager.class);
            if(accessibilityManager0 == null || !accessibilityManager0.isTouchExplorationEnabled()) {
                this.i(12, true);
            }
        }
        else {
            int v2 = Math.round(f);
            if(!z) {
                this.b.m((v2 + 15) / 30 * 5);
                this.c = (float)(this.b.e * 6);
            }
            this.a.I(this.c, z);
        }
        this.e = false;
        this.l();
        this.h(v1, v);
    }

    @Override  // com.google.android.material.timepicker.TimePickerView$e
    public void c(int v) {
        this.b.o(v);
    }

    @Override  // com.google.android.material.timepicker.TimePickerView$f
    public void d(int v) {
        this.i(v, true);
    }

    private String[] f() {
        return this.b.c == 1 ? i.g : i.f;
    }

    private int g() {
        return this.b.e() * 30 % 360;
    }

    private void h(int v, int v1) {
        if(this.b.e != v1 || this.b.d != v) {
            this.a.performHapticFeedback(4);
        }
    }

    void i(int v, boolean z) {
        class a extends com.google.android.material.timepicker.b {
            final i e;

            a(Context context0, int v) {
                super(context0, v);
            }

            @Override  // com.google.android.material.timepicker.b
            public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.p1(view0.getResources().getString(i.this.b.d(), new Object[]{String.valueOf(i.this.b.e())}));
            }
        }


        class com.google.android.material.timepicker.i.b extends com.google.android.material.timepicker.b {
            final i e;

            com.google.android.material.timepicker.i.b(Context context0, int v) {
                super(context0, v);
            }

            @Override  // com.google.android.material.timepicker.b
            public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.p1(view0.getResources().getString(string.material_minute_suffix, new Object[]{String.valueOf(i.this.b.e)}));
            }
        }

        this.a.G(v == 12);
        this.b.f = v;
        String[] arr_s = v == 12 ? this.f() : i.h;
        this.a.f(arr_s, (v == 12 ? this.b.d() : string.material_minute_suffix));
        this.j();
        this.a.I((v == 12 ? this.d : this.c), z);
        this.a.d(v);
        a i$a0 = new a(this, this.a.getContext(), string.material_hour_selection);
        this.a.K(i$a0);
        com.google.android.material.timepicker.i.b i$b0 = new com.google.android.material.timepicker.i.b(this, this.a.getContext(), string.material_minute_selection);
        this.a.J(i$b0);
    }

    @Override  // com.google.android.material.timepicker.k
    public void initialize() {
        if(this.b.c == 0) {
            this.a.R();
        }
        this.a.D(this);
        this.a.O(this);
        this.a.N(this);
        this.a.L(this);
        this.m();
        this.invalidate();
    }

    @Override  // com.google.android.material.timepicker.k
    public void invalidate() {
        this.d = (float)this.g();
        this.c = (float)(this.b.e * 6);
        this.i(this.b.f, false);
        this.l();
    }

    private void j() {
        this.a.H((this.b.f != 10 || this.b.c != 1 || this.b.d < 12 ? 1 : 2));
    }

    @Override  // com.google.android.material.timepicker.ClockHandView$c
    public void k(float f, boolean z) {
        if(this.e) {
            return;
        }
        int v = this.b.d;
        int v1 = this.b.e;
        int v2 = Math.round(f);
        TimeModel timeModel0 = this.b;
        if(timeModel0.f == 12) {
            timeModel0.m((v2 + 3) / 6);
            this.c = (float)Math.floor(this.b.e * 6);
        }
        else {
            int v3 = (v2 + 15) / 30;
            if(timeModel0.c == 1) {
                v3 %= 12;
                if(this.a.E() == 2) {
                    v3 += 12;
                }
            }
            this.b.i(v3);
            this.d = (float)this.g();
        }
        if(!z) {
            this.l();
            this.h(v, v1);
        }
    }

    private void l() {
        int v = this.b.g;
        int v1 = this.b.e();
        this.a.e(v, v1, this.b.e);
    }

    private void m() {
        this.n(i.f, "%d");
        this.n(i.h, "%02d");
    }

    private void n(String[] arr_s, String s) {
        for(int v = 0; v < arr_s.length; ++v) {
            arr_s[v] = TimeModel.c(this.a.getResources(), arr_s[v], s);
        }
    }

    @Override  // com.google.android.material.timepicker.k
    public void show() {
        this.a.setVisibility(0);
    }
}

