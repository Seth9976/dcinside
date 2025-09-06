package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.R.styleable;

public class MockView extends View {
    private Paint a;
    private Paint b;
    private Paint c;
    private boolean d;
    private boolean e;
    protected String f;
    private Rect g;
    private int h;
    private int i;
    private int j;
    private int k;

    public MockView(Context context0) {
        super(context0);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.f = null;
        this.g = new Rect();
        this.h = Color.argb(0xFF, 0, 0, 0);
        this.i = Color.argb(0xFF, 200, 200, 200);
        this.j = Color.argb(0xFF, 50, 50, 50);
        this.k = 4;
        this.a(context0, null);
    }

    public MockView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.f = null;
        this.g = new Rect();
        this.h = Color.argb(0xFF, 0, 0, 0);
        this.i = Color.argb(0xFF, 200, 200, 200);
        this.j = Color.argb(0xFF, 50, 50, 50);
        this.k = 4;
        this.a(context0, attributeSet0);
    }

    public MockView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.f = null;
        this.g = new Rect();
        this.h = Color.argb(0xFF, 0, 0, 0);
        this.i = Color.argb(0xFF, 200, 200, 200);
        this.j = Color.argb(0xFF, 50, 50, 50);
        this.k = 4;
        this.a(context0, attributeSet0);
    }

    private void a(Context context0, AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.MockView);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.MockView_mock_label) {
                    this.f = typedArray0.getString(v2);
                }
                else if(v2 == styleable.MockView_mock_showDiagonals) {
                    this.d = typedArray0.getBoolean(v2, this.d);
                }
                else if(v2 == styleable.MockView_mock_diagonalsColor) {
                    this.h = typedArray0.getColor(v2, this.h);
                }
                else if(v2 == styleable.MockView_mock_labelBackgroundColor) {
                    this.j = typedArray0.getColor(v2, this.j);
                }
                else if(v2 == styleable.MockView_mock_labelColor) {
                    this.i = typedArray0.getColor(v2, this.i);
                }
                else if(v2 == styleable.MockView_mock_showLabel) {
                    this.e = typedArray0.getBoolean(v2, this.e);
                }
            }
            typedArray0.recycle();
        }
        if(this.f == null) {
            try {
                this.f = context0.getResources().getResourceEntryName(this.getId());
            }
            catch(Exception unused_ex) {
            }
        }
        this.a.setColor(this.h);
        this.a.setAntiAlias(true);
        this.b.setColor(this.i);
        this.b.setAntiAlias(true);
        this.c.setColor(this.j);
        this.k = Math.round(((float)this.k) * (this.getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override  // android.view.View
    public void onDraw(@NonNull Canvas canvas0) {
        super.onDraw(canvas0);
        int v = this.getWidth();
        int v1 = this.getHeight();
        if(this.d) {
            --v;
            --v1;
            canvas0.drawLine(0.0f, 0.0f, ((float)v), ((float)v1), this.a);
            canvas0.drawLine(0.0f, ((float)v1), ((float)v), 0.0f, this.a);
            canvas0.drawLine(0.0f, 0.0f, ((float)v), 0.0f, this.a);
            canvas0.drawLine(((float)v), 0.0f, ((float)v), ((float)v1), this.a);
            canvas0.drawLine(((float)v), ((float)v1), 0.0f, ((float)v1), this.a);
            canvas0.drawLine(0.0f, ((float)v1), 0.0f, 0.0f, this.a);
        }
        String s = this.f;
        if(s != null && this.e) {
            this.b.getTextBounds(s, 0, s.length(), this.g);
            float f = ((float)(v - this.g.width())) / 2.0f;
            float f1 = ((float)(v1 - this.g.height())) / 2.0f + ((float)this.g.height());
            this.g.offset(((int)f), ((int)f1));
            this.g.set(this.g.left - this.k, this.g.top - this.k, this.g.right + this.k, this.g.bottom + this.k);
            canvas0.drawRect(this.g, this.c);
            canvas0.drawText(this.f, f, f1, this.b);
        }
    }
}

