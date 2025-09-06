package com.fsn.cauly;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class CaulySpreadView extends RelativeLayout {
    class MyRecyclerViewScrollListener extends OnScrollListener {
        final CaulySpreadView a;

        private MyRecyclerViewScrollListener() {
        }

        MyRecyclerViewScrollListener(com.fsn.cauly.CaulySpreadView.1 caulySpreadView$10) {
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView0, int v) {
            super.onScrollStateChanged(recyclerView0, v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
        public void onScrolled(RecyclerView recyclerView0, int v, int v1) {
            super.onScrolled(recyclerView0, v, v1);
            try {
                if(CaulySpreadView.this.f) {
                    CaulySpreadView.this.d((v1 <= 0 ? 0 : 1), ((int)(((double)Math.abs(v1)) * 0.35)));
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    Context a;
    MyRecyclerViewScrollListener b;
    private int c;
    private int d;
    int e;
    boolean f;
    boolean g;
    float h;
    float i;
    private Path j;

    public CaulySpreadView(Context context0) {
        super(context0);
        this.b = new MyRecyclerViewScrollListener(this, null);
        this.c = 50;
        this.d = 0xD5;
        this.f = false;
        this.g = false;
        this.a = context0;
        int v = CaulySpreadUtil.getDeviceWidth(context0);
        this.e = v;
        this.c = this.c * v / 360;
        this.d = this.d * this.e / 360;
    }

    private CaulySpreadViewItem b(ArrayList arrayList0, Object object0) {
        if(arrayList0 == null) {
            return null;
        }
        if(object0 != null && object0 instanceof String) {
            for(Object object1: arrayList0) {
                CaulySpreadViewItem caulySpreadViewItem0 = (CaulySpreadViewItem)object1;
                if(!TextUtils.isEmpty(caulySpreadViewItem0.id) && ((String)object0).equalsIgnoreCase(caulySpreadViewItem0.id)) {
                    return caulySpreadViewItem0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public void bindView(int v) {
        try {
            Object object0 = this.getTag();
            if(object0 != null && object0 instanceof Integer && v == object0) {
                return;
            }
            CaulySpreadAdItem caulySpreadAdItem0 = CaulySpreadUtil.instance().getCaulySpreadAdItem(v);
            if(caulySpreadAdItem0 != null && !this.g()) {
                RelativeLayout relativeLayout0 = (RelativeLayout)((ViewGroup)this.getChildAt(0)).getChildAt(0);
                ViewGroup viewGroup0 = (ViewGroup)relativeLayout0.getChildAt(0);
                ArrayList arrayList0 = caulySpreadAdItem0.adViewItem;
                if(viewGroup0 == null) {
                    RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, caulySpreadAdItem0.height * this.e / 360);
                    RelativeLayout relativeLayout1 = CaulySpreadUtil.instance().b(this.a, arrayList0);
                    if(relativeLayout1 == null) {
                        return;
                    }
                    relativeLayout0.addView(relativeLayout1, relativeLayout$LayoutParams0);
                    CaulySpreadViewItem caulySpreadViewItem0 = CaulySpreadUtil.instance().e(arrayList0, "infobar");
                    if(caulySpreadViewItem0 == null) {
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, 50 * this.e / 360);
                        relativeLayout0.addView(CaulySpreadUtil.instance().c(this.a, caulySpreadAdItem0.title), relativeLayout$LayoutParams2);
                    }
                    else {
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, caulySpreadViewItem0.height * this.e / 360);
                        relativeLayout0.addView(CaulySpreadUtil.instance().a(this.a, caulySpreadViewItem0.type, caulySpreadAdItem0.title, caulySpreadViewItem0.url), relativeLayout$LayoutParams1);
                    }
                }
                CaulySpreadViewItem caulySpreadViewItem1 = CaulySpreadUtil.instance().e(arrayList0, "frame");
                if(caulySpreadViewItem1 == null) {
                    return;
                }
                if(TextUtils.isEmpty(caulySpreadViewItem1.click_id)) {
                    this.setOnClickListener(new View.OnClickListener() {
                        final CaulySpreadView c;

                        @Override  // android.view.View$OnClickListener
                        public void onClick(View view0) {
                            if(CaulySpreadView.this.d > 0) {
                                if(caulySpreadViewItem1.click_percent == 100) {
                                    int v = BDPrefUtil.getIntValue(CaulySpreadView.this.a, "CLK_PERCENT", 0);
                                    if(v > 0) {
                                        caulySpreadViewItem1.click_percent = v;
                                    }
                                }
                                int v1 = caulySpreadViewItem1.click_percent;
                                if(v1 > 0) {
                                    if(v1 >= 100 - CaulySpreadView.this.getHeight() * 100 / CaulySpreadView.this.d) {
                                        CaulyBrowserUtil.openBrowser(CaulySpreadView.this.getContext(), caulySpreadAdItem0.link);
                                    }
                                }
                                else if(CaulySpreadView.this.getHeight() == CaulySpreadView.this.d) {
                                    CaulyBrowserUtil.openBrowser(CaulySpreadView.this.getContext(), caulySpreadAdItem0.link);
                                }
                            }
                        }
                    });
                }
                ViewGroup viewGroup1 = (ViewGroup)relativeLayout0.getChildAt(0);
                for(int v1 = 0; v1 < viewGroup1.getChildCount(); ++v1) {
                    View view0 = viewGroup1.getChildAt(v1);
                    if(view0.getTag() != null && view0.getTag() instanceof String) {
                        String s = (String)view0.getTag();
                        if(!TextUtils.isEmpty(caulySpreadViewItem1.click_id) && s.equalsIgnoreCase(caulySpreadViewItem1.click_id)) {
                            view0.setOnClickListener(new View.OnClickListener() {
                                final CaulySpreadView b;

                                @Override  // android.view.View$OnClickListener
                                public void onClick(View view0) {
                                    CaulyBrowserUtil.openBrowser(CaulySpreadView.this.getContext(), caulySpreadAdItem0.link);
                                }
                            });
                        }
                        CaulySpreadViewItem caulySpreadViewItem2 = this.b(arrayList0, s);
                        if(caulySpreadViewItem2 == null) {
                            view0.setVisibility(8);
                        }
                        else {
                            view0.setVisibility(0);
                            if(view0 instanceof WebView) {
                                WebView webView0 = (WebView)viewGroup1.getChildAt(v1);
                                if(!TextUtils.isEmpty(caulySpreadViewItem2.url)) {
                                    webView0.loadUrl(caulySpreadViewItem2.url);
                                }
                            }
                            else if(view0 instanceof ImageView) {
                                ImageView imageView0 = (ImageView)viewGroup1.getChildAt(v1);
                                if(!TextUtils.isEmpty(caulySpreadViewItem2.url)) {
                                    ImageCacheManager.getInstance(this.getContext()).setImageBitmap(caulySpreadViewItem2.url, imageView0);
                                }
                            }
                            else if(view0 instanceof TextView) {
                                TextView textView0 = (TextView)viewGroup1.getChildAt(v1);
                                if(!TextUtils.isEmpty(caulySpreadViewItem2.text)) {
                                    textView0.setText(caulySpreadViewItem2.text);
                                }
                                textView0.setTextColor(CaulySpreadUtil.getColor(caulySpreadViewItem2.color));
                                if(!TextUtils.isEmpty(caulySpreadViewItem2.font) && caulySpreadViewItem2.font.contains("px")) {
                                    int v2 = Integer.parseInt(caulySpreadViewItem2.font.replace("px", ""));
                                    textView0.setTextSize(((float)CaulySpreadUtil.getScaledPosition(this.e, ((int)CaulySpreadUtil.pixelsToSp(this.a, v2)))));
                                }
                            }
                        }
                    }
                }
                View view1 = relativeLayout0.getChildAt(1);
                if(view1 == null) {
                    return;
                }
                if(view1 instanceof TextView) {
                    ((TextView)view1).setText(caulySpreadAdItem0.title);
                    return;
                }
                if(view1 instanceof ImageView) {
                    CaulySpreadViewItem caulySpreadViewItem3 = CaulySpreadUtil.instance().e(arrayList0, "infobar");
                    if(caulySpreadViewItem3 == null) {
                        return;
                    }
                    if(!TextUtils.isEmpty(caulySpreadViewItem3.url)) {
                        ImageCacheManager.getInstance(this.getContext()).setImageBitmap(caulySpreadViewItem3.url, ((ImageView)view1));
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void c(float f, int v) {
        if(f > ((float)(this.getScreenY() * 4 / 5)) && this.getLayoutParams().height <= this.c) {
            return;
        }
        if(this.getLayoutParams().height + v >= this.d) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            viewGroup$LayoutParams0.height = this.d;
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams1 = this.getLayoutParams();
        viewGroup$LayoutParams1.height = (int)(((double)viewGroup$LayoutParams1.height) + ((double)v) * 2.5);
    }

    private void d(int v, int v1) {
        float f = this.getCoordinateY();
        if(v > 0) {
            this.c(f, v1);
        }
        else {
            this.i(f, v1);
        }
        this.h();
        this.requestLayout();
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(Canvas canvas0) {
        if(this.g) {
            Path path0 = this.j;
            if(path0 != null) {
                path0.reset();
            }
            if(this.j == null) {
                this.j = new Path();
            }
            this.j.addRoundRect(new RectF(0.0f, 0.0f, ((float)canvas0.getWidth()), ((float)canvas0.getHeight())), this.h, this.i, Path.Direction.CW);
            canvas0.clipPath(this.j);
        }
        super.dispatchDraw(canvas0);
    }

    private void e(RelativeLayout relativeLayout0, float f) {
        View view0 = relativeLayout0.getChildAt(1);
        if(view0 != null) {
            view0.setAlpha(1.0f - f);
            if(view0 instanceof TextView) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                viewGroup$LayoutParams0.height = (int)(((float)(50 * this.e / 360)) - ((float)(13 * this.e / 360)) * f);
            }
        }
    }

    public void enableRoundCorner(boolean z) {
        this.g = z;
    }

    private boolean g() {
        return ((ViewGroup)this.getChildAt(0)) == null;
    }

    private float getCoordinateY() {
        int[] arr_v = new int[2];
        this.getLocationOnScreen(arr_v);
        return (float)arr_v[1];
    }

    public MyRecyclerViewScrollListener getRecyclerViewScrollListener() {
        return this.b;
    }

    private int getScreenY() {
        return this.getResources().getDisplayMetrics().heightPixels;
    }

    private void h() {
        if(this.g()) {
            return;
        }
        float f = ((float)(this.getLayoutParams().height - this.c)) / ((float)(this.d - this.c));
        ViewGroup viewGroup0 = (ViewGroup)this.getChildAt(0);
        if(viewGroup0 == null) {
            return;
        }
        RelativeLayout relativeLayout0 = (RelativeLayout)viewGroup0.getChildAt(0);
        if(relativeLayout0 == null) {
            return;
        }
        ViewGroup viewGroup1 = (ViewGroup)relativeLayout0.getChildAt(0);
        if(viewGroup1 == null) {
            return;
        }
        for(int v = 0; v < viewGroup1.getChildCount(); ++v) {
            viewGroup1.getChildAt(v).setAlpha(0.7f * f + 0.3f);
        }
        this.e(relativeLayout0, f);
    }

    private void i(float f, int v) {
        if(f < ((float)(this.getScreenY() / 3)) && this.getLayoutParams().height >= this.d) {
            return;
        }
        if(this.getLayoutParams().height - v <= this.c) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            viewGroup$LayoutParams0.height = this.c;
        }
        else if(this.getLayoutParams().height >= this.c) {
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = this.getLayoutParams();
            viewGroup$LayoutParams1.height = (int)(((double)viewGroup$LayoutParams1.height) - ((double)v) * 2.5);
        }
        if(this.getLayoutParams().height < 0) {
            this.getLayoutParams().height = 0;
        }
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        this.f = true;
        super.onAttachedToWindow();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        this.f = false;
        super.onDetachedFromWindow();
    }

    public void setBigResize() {
        if(this.g()) {
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        viewGroup$LayoutParams0.height = this.d;
        this.h();
        this.requestLayout();
    }

    public void setMaxHeight(int v) {
        this.d = v * this.e / 360;
    }

    public void setMinHeight(int v) {
        this.c = v * this.e / 360;
    }

    public void setRoundRadius(float f, float f1) {
        this.h = f;
        this.i = f1;
    }

    public void setSmallResize() {
        if(this.g()) {
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        viewGroup$LayoutParams0.height = this.c;
        this.h();
        this.requestLayout();
    }
}

