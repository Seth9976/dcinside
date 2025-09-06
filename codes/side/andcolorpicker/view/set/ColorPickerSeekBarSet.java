package codes.side.andcolorpicker.view.set;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.core.widget.TextViewCompat;
import java.util.HashMap;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public abstract class ColorPickerSeekBarSet extends LinearLayout {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final l.a a;
    private HashMap b;
    private static final String c = "ColorPickerSeekBarSet";
    private static final int d = 0x10301F1;
    @l
    public static final a e;

    static {
        ColorPickerSeekBarSet.e = new a(null);
    }

    @j
    public ColorPickerSeekBarSet(@l Context context0) {
        this(context0, null, 0, 6, null);
    }

    @j
    public ColorPickerSeekBarSet(@l Context context0, @m AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public ColorPickerSeekBarSet(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = new l.a();
        this.setOrientation(1);
    }

    public ColorPickerSeekBarSet(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public void a() {
        HashMap hashMap0 = this.b;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
    }

    public View b(int v) {
        if(this.b == null) {
            this.b = new HashMap();
        }
        View view0 = (View)this.b.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            this.b.put(v, view0);
        }
        return view0;
    }

    protected final void c(@StringRes int v) {
        TextView textView0 = new TextView(this.getContext());
        TextViewCompat.D(textView0, 0x10301F1);
        textView0.setText(v);
        this.addView(textView0);
    }

    private final void d(AttributeSet attributeSet0) {
    }

    static void e(ColorPickerSeekBarSet colorPickerSeekBarSet0, AttributeSet attributeSet0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
    }

    @l
    public final l.a getPickerGroup() {
        return this.a;
    }
}

