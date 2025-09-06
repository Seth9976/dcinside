package com.dcinside.app.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dcinside.app.main.HomeActivity;
import com.dcinside.app.model.B;
import com.dcinside.app.model.Z;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.vk;
import java.util.ArrayList;
import java.util.List;

public class NewGalleriesView extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener, Runnable {
    private LinearLayout a;
    private TextView[] b;
    private int c;

    public NewGalleriesView(Context context0) {
        super(context0);
        this.d(context0);
    }

    public NewGalleriesView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.d(context0);
    }

    public NewGalleriesView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.d(context0);
    }

    @TargetApi(21)
    public NewGalleriesView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.d(context0);
    }

    private void b(List list0) {
        this.setVisibility(0);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        viewGroup$LayoutParams0.height = -2;
        this.setLayoutParams(viewGroup$LayoutParams0);
        int v = Math.min(list0.size(), this.b.length);
        ArrayList arrayList0 = new ArrayList(list0);
        for(int v1 = 0; true; ++v1) {
            TextView[] arr_textView = this.b;
            if(v1 >= arr_textView.length) {
                break;
            }
            if(v1 >= v) {
                arr_textView[v1].setVisibility(8);
            }
            else {
                B b0 = (B)arrayList0.remove(((int)Dl.v(0.0, arrayList0.size())));
                TextView textView0 = this.b[v1];
                textView0.setVisibility(0);
                textView0.setText(Dl.C(b0.l()));
                textView0.setTag(b0);
            }
        }
        this.post(this);
    }

    private void c() {
        this.setVisibility(8);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        viewGroup$LayoutParams0.height = 0;
        this.setLayoutParams(viewGroup$LayoutParams0);
    }

    private void d(Context context0) {
        this.setOrientation(0);
        this.setGravity(17);
        View.inflate(context0, 0x7F0E021C, this);  // layout:view_new_galleries
        this.setBackgroundColor(vk.b(context0, 0x1010054));
        this.a = (LinearLayout)this.findViewById(0x7F0B08F3);  // id:new_galleries_container
        TextView[] arr_textView = {((TextView)this.findViewById(0x7F0B08F4)), ((TextView)this.findViewById(0x7F0B08F5)), ((TextView)this.findViewById(0x7F0B08F6))};  // id:new_galleries_item0
        this.b = arr_textView;
        for(int v = 0; v < 3; ++v) {
            arr_textView[v].setOnClickListener((View view0) -> {
                Object object0 = view0.getTag();
                if(object0 instanceof B) {
                    Xk.i(((HomeActivity)this.getContext()), ((B)object0).h());
                    return;
                }
                if(object0 instanceof Z) {
                    Xk.i(((HomeActivity)this.getContext()), ((Z)object0).b());
                }
            });
        }
    }

    private void e() {
        View view0 = (View)this.getParent();
        if(view0 == null) {
            return;
        }
        TextView[] arr_textView = this.b;
        int v = 0;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 0; v1 < arr_textView.length; ++v1) {
            TextView textView0 = arr_textView[v1];
            if(textView0.getVisibility() == 0) {
                ++v2;
                Rect rect0 = new Rect();
                TextPaint textPaint0 = textView0.getPaint();
                String s = textView0.getText().toString();
                textPaint0.getTextBounds(s, 0, s.length(), rect0);
                v3 += rect0.width();
            }
        }
        if(v2 > 0) {
            float f = (float)(view0.getWidth() - Dk.d((v2 - 1) * 10));
            if(f < ((float)v3)) {
                int v4 = (int)(f / ((float)Math.max(v2, 1)));
                TextView[] arr_textView1 = this.b;
                while(v < arr_textView1.length) {
                    arr_textView1[v].setMaxWidth(v4);
                    ++v;
                }
                return;
            }
            TextView[] arr_textView2 = this.b;
            while(v < arr_textView2.length) {
                arr_textView2[v].setMaxWidth(0x7FFFFFFF);
                ++v;
            }
        }
    }

    // 检测为 Lambda 实现
    private void f(View view0) [...]

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.removeCallbacks(this);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public void onGlobalLayout() {
        int v = this.a.getWidth();
        if(this.c != v) {
            this.c = v;
            this.post(this);
        }
    }

    @Override
    public void run() {
        this.e();
    }

    public void setNewGalleries(List list0) {
        if((list0 == null ? 0 : list0.size()) > 0) {
            this.b(list0);
            return;
        }
        this.c();
    }
}

