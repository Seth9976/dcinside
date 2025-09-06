package com.dcinside.app.image.view;

import A3.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.dcinside.app.R.styleable;
import com.dcinside.app.view.ColorSeekBar.a;
import com.dcinside.app.view.ColorSeekBar;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.n;
import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nSeekBarWithChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeekBarWithChart.kt\ncom/dcinside/app/image/view/SeekBarWithChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n1557#2:253\n1628#2,3:254\n1863#2,2:257\n1872#2,3:259\n*S KotlinDebug\n*F\n+ 1 SeekBarWithChart.kt\ncom/dcinside/app/image/view/SeekBarWithChart\n*L\n78#1:253\n78#1:254,3\n87#1:257,2\n177#1:259,3\n*E\n"})
public final class SeekBarWithChart extends ConstraintLayout implements a {
    @l
    private final LineChart a;
    @l
    private final ColorSeekBar b;
    @m
    private o c;
    @m
    private Function1 d;
    @m
    private Function1 e;
    private int f;
    private int g;
    @l
    private ArrayList h;
    @l
    private ArrayList i;
    @l
    private ArrayList j;
    @m
    private n k;
    private int l;

    @j
    public SeekBarWithChart(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public SeekBarWithChart(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public SeekBarWithChart(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.f = ContextCompat.getColor(context0, 0x7F0600A8);  // color:colorChartSelectedLine
        this.g = ContextCompat.getColor(context0, 0x7F0600A9);  // color:colorChartUnselectedLine
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        LayoutInflater.from(context0).inflate(0x7F0E01E0, this, true);  // layout:view_image_edit_charted_seek
        View view0 = this.findViewById(0x7F0B02AF);  // id:chart_seek_bar
        L.o(view0, "findViewById(...)");
        this.a = (LineChart)view0;
        View view1 = this.findViewById(0x7F0B044B);  // id:element_seek_bar
        L.o(view1, "findViewById(...)");
        this.b = (ColorSeekBar)view1;
        if(attributeSet0 != null) {
            this.G(attributeSet0);
        }
        this.D();
    }

    public SeekBarWithChart(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final void A() {
        Function1 function10 = this.e;
        if(function10 != null) {
            function10.invoke(this.j.size());
        }
    }

    private final void B() {
        int v = 0;
        for(Object object0: this.j) {
            v += (int)((Entry)object0).d();
        }
        Function1 function10 = this.d;
        if(function10 != null) {
            function10.invoke(v);
        }
    }

    private final void C() {
        com.github.mikephil.charting.data.o o0 = this.H(new com.github.mikephil.charting.data.o(this.j, ""), true);
        com.github.mikephil.charting.data.o o1 = this.H(new com.github.mikephil.charting.data.o(this.i, ""), false);
        this.k = new n();
        if(!this.j.isEmpty()) {
            n n0 = this.k;
            if(n0 != null) {
                n0.a(o0);
            }
        }
        if(!this.i.isEmpty()) {
            n n1 = this.k;
            if(n1 != null) {
                n1.a(o1);
            }
        }
        this.a.L0(0.0f, 0.0f, 0.0f, 0.0f);
        this.a.setData(this.k);
        this.a.getLegend().g(false);
        this.a.getDescription().g(false);
        this.a.getXAxis().A0(com.github.mikephil.charting.components.j.a.b);
        this.a.getXAxis().m0(false);
        this.a.getXAxis().q0(0);
        this.a.getXAxis().g(false);
        this.a.getAxisLeft().e0(0.0f);
        this.a.getAxisRight().g(false);
        this.a.getAxisLeft().g(false);
        this.a.setClickable(false);
        ((n)this.a.getData()).K(false);
        this.a.setDrawMarkers(false);
        this.a.setDrawGridBackground(false);
        this.a.invalidate();
    }

    private final void D() {
        this.a.setPinchZoom(false);
        this.a.setScaleEnabled(false);
        this.a.setDoubleTapToZoomEnabled(false);
    }

    private final void E() {
        this.b.setOnColorChangeListener(this);
        this.b.setMaxPosition(this.h.size());
        this.F(this.h.size());
        this.C();
    }

    private final void F(int v) {
        this.j.clear();
        this.i.clear();
        int v1 = 0;
        for(Object object0: this.h) {
            if(v1 < 0) {
                u.Z();
            }
            if(v1 >= 0 && v1 <= v) {
                this.j.add(((Entry)object0));
            }
            if(v1 >= v) {
                this.i.add(((Entry)object0));
            }
            ++v1;
        }
        if(this.l != v) {
            if(v >= 0 && v < this.h.size()) {
                o o0 = this.c;
                if(o0 != null) {
                    o0.invoke(v, String.valueOf(((int)((Entry)this.j.get(v - 1)).l())));
                }
            }
            this.l = v;
        }
        this.B();
        this.A();
        this.C();
    }

    @SuppressLint({"CustomViewStyleable"})
    private final void G(AttributeSet attributeSet0) {
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.SeekBarWithChart);
        L.o(typedArray0, "obtainStyledAttributes(...)");
        this.f = typedArray0.getColor(0, this.f);
        this.g = typedArray0.getColor(1, this.g);
        typedArray0.recycle();
    }

    private final com.github.mikephil.charting.data.o H(com.github.mikephil.charting.data.o o0, boolean z) {
        if(z) {
            o0.b2(0xFF);
            o0.c2(this.f);
            o0.w1(this.f);
        }
        else {
            o0.b2(0xFF);
            o0.c2(this.g);
            o0.w1(this.g);
        }
        o0.v2(false);
        o0.A(false);
        o0.c1(true);
        return o0;
    }

    static com.github.mikephil.charting.data.o I(SeekBarWithChart seekBarWithChart0, com.github.mikephil.charting.data.o o0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return seekBarWithChart0.H(o0, z);
    }

    public final int getChartSelectedLineColor() {
        return this.f;
    }

    public final int getChartUnSelectedLineColor() {
        return this.g;
    }

    @m
    public final o getOnPinPositionChanged() {
        return this.c;
    }

    @m
    public final Function1 getOnSelectedEntriesSizeChanged() {
        return this.e;
    }

    @m
    public final Function1 getOnSelectedItemsSizeChanged() {
        return this.d;
    }

    @Override  // com.dcinside.app.view.ColorSeekBar$a
    public void q(int v, int v1, int v2) {
        this.F(v);
    }

    public final void setChartSelectedLineColor(int v) {
        this.f = v;
    }

    public final void setChartUnSelectedLineColor(int v) {
        this.g = v;
    }

    public final void setEntries(@l ArrayList arrayList0) {
        L.p(arrayList0, "seekBarEntries");
        this.h.clear();
        ArrayList arrayList1 = this.h;
        ArrayList arrayList2 = new ArrayList(u.b0(arrayList0, 10));
        for(Object object0: arrayList0) {
            arrayList2.add(new Entry(((com.dcinside.app.image.view.a)object0).e(), ((com.dcinside.app.image.view.a)object0).f()));
        }
        arrayList1.addAll(arrayList2);
        this.E();
    }

    public final void setOnPinPositionChanged(@m o o0) {
        this.c = o0;
    }

    public final void setOnSelectedEntriesSizeChanged(@m Function1 function10) {
        this.e = function10;
    }

    public final void setOnSelectedItemsSizeChanged(@m Function1 function10) {
        this.d = function10;
    }

    public final void setRange(int v) {
        this.b.setColorBarPosition(v);
    }
}

