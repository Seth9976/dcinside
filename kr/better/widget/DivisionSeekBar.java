package kr.better.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nDivisionSeekBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DivisionSeekBar.kt\nkr/better/widget/DivisionSeekBar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1557#2:45\n1628#2,3:46\n1863#2,2:49\n*S KotlinDebug\n*F\n+ 1 DivisionSeekBar.kt\nkr/better/widget/DivisionSeekBar\n*L\n39#1:45\n39#1:46,3\n40#1:49,2\n*E\n"})
public final class DivisionSeekBar extends AppCompatSeekBar {
    @l
    private final Paint b;

    public DivisionSeekBar(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        Paint paint0 = new Paint();
        paint0.setStyle(Paint.Style.FILL_AND_STROKE);
        paint0.setColor(ContextCompat.getColor(this.getContext(), 0x7F060107));  // color:division_seek_color
        paint0.setStrokeWidth(this.getContext().getResources().getDimension(0x7F0700BF));  // dimen:division_seek_width
        this.b = paint0;
    }

    public DivisionSeekBar(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0);
        Paint paint0 = new Paint();
        paint0.setStyle(Paint.Style.FILL_AND_STROKE);
        paint0.setColor(ContextCompat.getColor(this.getContext(), 0x7F060107));  // color:division_seek_color
        paint0.setStrokeWidth(this.getContext().getResources().getDimension(0x7F0700BF));  // dimen:division_seek_width
        this.b = paint0;
    }

    public DivisionSeekBar(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        Paint paint0 = new Paint();
        paint0.setStyle(Paint.Style.FILL_AND_STROKE);
        paint0.setColor(ContextCompat.getColor(this.getContext(), 0x7F060107));  // color:division_seek_color
        paint0.setStrokeWidth(this.getContext().getResources().getDimension(0x7F0700BF));  // dimen:division_seek_width
        this.b = paint0;
    }

    @l
    public final Paint getPaint() {
        return this.b;
    }

    @Override  // androidx.appcompat.widget.AppCompatSeekBar
    protected void onDraw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        int v = this.getHeight();
        int v1 = this.getPaddingLeft();
        int v2 = this.getPaddingRight();
        int v3 = this.getMax();
        int v4 = this.getWidth();
        float f = ((float)(v / 2)) / 2.0f;
        kotlin.ranges.l l0 = s.W1(1, v3);
        ArrayList arrayList0 = new ArrayList(u.b0(l0, 10));
        Iterator iterator0 = l0.iterator();
        while(iterator0.hasNext()) {
            arrayList0.add(((int)(((int)(((float)((T)iterator0).b()) * ((float)((v4 - v2 - v1) / v3)))) + v1)));
        }
        for(Object object0: arrayList0) {
            float f1 = ((float)((Number)object0).intValue()) + 1.0f;
            canvas0.drawLine(f1, ((float)(v / 2)) - f, f1, ((float)(v / 2)) + f, this.b);
        }
        super.onDraw(canvas0);
    }
}

