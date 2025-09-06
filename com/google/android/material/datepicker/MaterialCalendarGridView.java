package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.id;
import com.google.android.material.internal.M;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {
    private final Calendar a;
    private final boolean b;

    public MaterialCalendarGridView(Context context0) {
        this(context0, null);
    }

    public MaterialCalendarGridView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public MaterialCalendarGridView(Context context0, AttributeSet attributeSet0, int v) {
        class a extends AccessibilityDelegateCompat {
            final MaterialCalendarGridView d;

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void g(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.m1(null);
            }
        }

        super(context0, attributeSet0, v);
        this.a = C.x();
        if(n.I0(this.getContext())) {
            this.setNextFocusLeftId(id.cancel_button);
            this.setNextFocusRightId(id.confirm_button);
        }
        this.b = n.K0(this.getContext());
        ViewCompat.J1(this, new a(this));
    }

    private void a(int v, Rect rect0) {
        switch(v) {
            case 33: {
                this.setSelection(this.b().m());
                return;
            }
            case 130: {
                this.setSelection(this.b().b());
                return;
            }
            default: {
                super.onFocusChanged(true, v, rect0);
            }
        }
    }

    @NonNull
    public r b() {
        return (r)super.getAdapter();
    }

    private View c(int v) {
        return this.getChildAt(v - this.getFirstVisiblePosition());
    }

    private static int d(@NonNull View view0) {
        return view0.getLeft() + view0.getWidth() / 2;
    }

    private static boolean e(@Nullable Long long0, @Nullable Long long1, @Nullable Long long2, @Nullable Long long3) {
        return long0 == null || long1 == null || long2 == null || long3 == null || ((long)long2) > ((long)long1) || ((long)long3) < ((long)long0);
    }

    @Override  // android.widget.GridView
    @NonNull
    public Adapter getAdapter() {
        return this.b();
    }

    @Override  // android.widget.GridView
    @NonNull
    public ListAdapter getAdapter() {
        return this.b();
    }

    @Override  // android.widget.AbsListView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b().notifyDataSetChanged();
    }

    @Override  // android.view.View
    protected final void onDraw(@NonNull Canvas canvas0) {
        int v19;
        int v18;
        int v9;
        int v8;
        int v7;
        int v6;
        int v5;
        int v4;
        super.onDraw(canvas0);
        r r0 = this.b();
        b b0 = r0.d;
        int v = Math.max(r0.b(), this.getFirstVisiblePosition());
        int v1 = Math.min(r0.m(), this.getLastVisiblePosition());
        Long long0 = r0.d(v);
        Long long1 = r0.d(v1);
        for(Object object0: r0.b.e3()) {
            Pair pair0 = (Pair)object0;
            Object object1 = pair0.a;
            if(object1 != null && pair0.b != null) {
                long v2 = (long)(((Long)object1));
                long v3 = (long)(((Long)pair0.b));
                if(!MaterialCalendarGridView.e(long0, long1, ((Long)object1), ((Long)pair0.b))) {
                    boolean z = M.s(this);
                    if(v2 < ((long)long0)) {
                        if(r0.h(v)) {
                            v4 = 0;
                        }
                        else {
                            v4 = z ? this.c(v - 1).getLeft() : this.c(v - 1).getRight();
                        }
                        v5 = v4;
                        v6 = v;
                    }
                    else {
                        this.a.setTimeInMillis(v2);
                        v6 = r0.a(this.a.get(5));
                        v5 = MaterialCalendarGridView.d(this.c(v6));
                    }
                    if(v3 > ((long)long1)) {
                        if(r0.i(v1)) {
                            v7 = this.getWidth();
                        }
                        else {
                            v7 = z ? this.c(v1).getLeft() : this.c(v1).getRight();
                        }
                        v8 = v7;
                        v9 = v1;
                    }
                    else {
                        this.a.setTimeInMillis(v3);
                        v9 = r0.a(this.a.get(5));
                        v8 = MaterialCalendarGridView.d(this.c(v9));
                    }
                    int v10 = (int)r0.getItemId(v6);
                    int v11 = (int)r0.getItemId(v9);
                    while(v10 <= v11) {
                        int v12 = this.getNumColumns() * v10;
                        int v13 = v12 + this.getNumColumns() - 1;
                        View view0 = this.c(v12);
                        int v14 = view0.getTop();
                        int v15 = b0.a.e();
                        int v16 = view0.getBottom();
                        int v17 = b0.a.b();
                        if(z) {
                            v18 = v9 <= v13 ? v8 : 0;
                            v19 = v12 <= v6 ? v5 : this.getWidth();
                        }
                        else {
                            v18 = v12 <= v6 ? v5 : 0;
                            v19 = v9 > v13 ? this.getWidth() : v8;
                        }
                        canvas0.drawRect(((float)v18), ((float)(v14 + v15)), ((float)v19), ((float)(v16 - v17)), b0.h);
                        ++v10;
                    }
                }
            }
        }
    }

    @Override  // android.widget.GridView
    protected void onFocusChanged(boolean z, int v, Rect rect0) {
        if(z) {
            this.a(v, rect0);
            return;
        }
        super.onFocusChanged(false, v, rect0);
    }

    @Override  // android.widget.GridView
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(!super.onKeyDown(v, keyEvent0)) {
            return false;
        }
        if(this.getSelectedItemPosition() != -1 && this.getSelectedItemPosition() < this.b().b()) {
            if(19 == v) {
                this.setSelection(this.b().b());
                return true;
            }
            return false;
        }
        return true;
    }

    @Override  // android.widget.GridView
    public void onMeasure(int v, int v1) {
        if(this.b) {
            super.onMeasure(v, View.MeasureSpec.makeMeasureSpec(0xFFFFFF, 0x80000000));
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            viewGroup$LayoutParams0.height = this.getMeasuredHeight();
            return;
        }
        super.onMeasure(v, v1);
    }

    @Override  // android.widget.GridView
    public void setAdapter(Adapter adapter0) {
        this.setAdapter(((ListAdapter)adapter0));
    }

    @Override  // android.widget.GridView
    public final void setAdapter(ListAdapter listAdapter0) {
        if(!(listAdapter0 instanceof r)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), r.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter0);
    }

    @Override  // android.widget.GridView
    public void setSelection(int v) {
        if(v < this.b().b()) {
            super.setSelection(this.b().b());
            return;
        }
        super.setSelection(v);
    }
}

