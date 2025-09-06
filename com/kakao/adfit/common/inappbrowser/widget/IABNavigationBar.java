package com.kakao.adfit.common.inappbrowser.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.kakao.adfit.ads.R.dimen;
import com.kakao.adfit.ads.R.drawable;
import com.kakao.adfit.ads.R.id;
import com.kakao.adfit.ads.R.layout;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nIABNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IABNavigationBar.kt\ncom/kakao/adfit/common/inappbrowser/widget/IABNavigationBar\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
public final class IABNavigationBar extends LinearLayout {
    public interface a {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();

        void g();
    }

    private View a;
    private TextView b;
    private TextView c;
    private View d;
    private View e;
    private View f;
    private a g;
    private PopupWindow h;

    @j
    public IABNavigationBar(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public IABNavigationBar(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public IABNavigationBar(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        LayoutInflater.from(context0).inflate(layout.adfit_web_layout_navigation, this, true);
        View view0 = this.findViewById(id.webview_navi_close_button);
        L.o(view0, "findViewById(R.id.webview_navi_close_button)");
        this.a = view0;
        View view1 = this.findViewById(id.webview_navi_title);
        L.o(view1, "findViewById(R.id.webview_navi_title)");
        this.b = (TextView)view1;
        View view2 = this.findViewById(id.webview_navi_address);
        L.o(view2, "findViewById(R.id.webview_navi_address)");
        this.c = (TextView)view2;
        View view3 = this.findViewById(id.webview_navi_back_button);
        L.o(view3, "findViewById(R.id.webview_navi_back_button)");
        this.d = view3;
        View view4 = this.findViewById(id.webview_navi_forward_button);
        L.o(view4, "findViewById(R.id.webview_navi_forward_button)");
        this.e = view4;
        View view5 = this.findViewById(id.webview_navi_more_button);
        L.o(view5, "findViewById(R.id.webview_navi_more_button)");
        this.f = view5;
        this.a.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            a iABNavigationBar$a0 = this.g;
            if(iABNavigationBar$a0 != null) {
                iABNavigationBar$a0.g();
            }
        });
        this.d.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            a iABNavigationBar$a0 = this.g;
            if(iABNavigationBar$a0 != null) {
                iABNavigationBar$a0.d();
            }
        });
        this.d.setEnabled(false);
        this.e.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            a iABNavigationBar$a0 = this.g;
            if(iABNavigationBar$a0 != null) {
                iABNavigationBar$a0.b();
            }
        });
        this.e.setEnabled(false);
        this.f.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.c();
        });
    }

    public IABNavigationBar(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final int a(View view0) {
        view0.measure(View.MeasureSpec.makeMeasureSpec(view0.getResources().getDimensionPixelSize(dimen.adfit_webview_menu_max_width), 0x80000000), 0);
        return view0.getMeasuredWidth();
    }

    private final String a(String s) {
        try {
            String s1 = new URL(s).getHost();
            L.o(s1, "URL(url).host");
            return s1;
        }
        catch(MalformedURLException unused_ex) {
            int v = v.s3(s, "://", 0, false, 6, null);
            if(v > 0) {
                s = s.substring(v + 3);
                L.o(s, "this as java.lang.String).substring(startIndex)");
            }
            int v1 = v.s3(s, "/", 0, false, 6, null);
            if(v1 > 0) {
                s = s.substring(0, v1);
                L.o(s, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            return s;
        }
    }

    private final void a() {
        PopupWindow popupWindow0 = this.h;
        if(popupWindow0 != null) {
            popupWindow0.dismiss();
        }
    }

    // 检测为 Lambda 实现
    private static final void a(IABNavigationBar iABNavigationBar0, View view0) [...]

    public final void a(WebView webView0) {
        L.p(webView0, "webView");
        this.d.setEnabled(webView0.canGoBack());
        this.e.setEnabled(webView0.canGoForward());
    }

    // 检测为 Lambda 实现
    private static final void b(IABNavigationBar iABNavigationBar0, View view0) [...]

    public final void b() {
        this.c.setVisibility(8);
    }

    public final void b(String s) {
        L.p(s, "url");
        this.c.setVisibility(0);
        this.c.setText(this.a(s));
    }

    private final void c() {
        PopupWindow popupWindow0 = this.h;
        if(popupWindow0 == null) {
            View view0 = LayoutInflater.from(this.getContext()).inflate(layout.adfit_web_popup_layout, null);
            L.o(view0, "from(context).inflate(R.…t_web_popup_layout, null)");
            view0.findViewById(id.menu_copy).setOnClickListener((View view0) -> {
                L.p(this, "this$0");
                this.a();
                a iABNavigationBar$a0 = this.g;
                if(iABNavigationBar$a0 != null) {
                    iABNavigationBar$a0.c();
                }
            });
            view0.findViewById(id.menu_share).setOnClickListener((View view0) -> {
                L.p(this, "this$0");
                this.a();
                a iABNavigationBar$a0 = this.g;
                if(iABNavigationBar$a0 != null) {
                    iABNavigationBar$a0.e();
                }
            });
            view0.findViewById(id.menu_open_web).setOnClickListener((View view0) -> {
                L.p(this, "this$0");
                this.a();
                a iABNavigationBar$a0 = this.g;
                if(iABNavigationBar$a0 != null) {
                    iABNavigationBar$a0.f();
                }
            });
            view0.findViewById(id.menu_reload).setOnClickListener((View view0) -> {
                L.p(this, "this$0");
                this.a();
                a iABNavigationBar$a0 = this.g;
                if(iABNavigationBar$a0 != null) {
                    iABNavigationBar$a0.a();
                }
            });
            PopupWindow popupWindow1 = new PopupWindow(this.getContext());
            popupWindow1.setElevation(this.getResources().getDimension(dimen.adfit_webview_menu_popup_elevation));
            popupWindow1.setBackgroundDrawable(ContextCompat.getDrawable(this.getContext(), drawable.adfit_inapp_popup_window_bg));
            popupWindow1.setWidth(this.a(view0) + this.getResources().getDimensionPixelSize(dimen.adfit_webview_menu_popup_bg_padding));
            popupWindow1.setHeight(-2);
            popupWindow1.setContentView(view0);
            popupWindow1.setFocusable(true);
            popupWindow1.setOutsideTouchable(true);
            this.h = popupWindow1;
            popupWindow0 = popupWindow1;
        }
        Rect rect0 = new Rect();
        this.getWindowVisibleDisplayFrame(rect0);
        popupWindow0.showAsDropDown(this, rect0.width() - (popupWindow0.getWidth() + this.getResources().getDimensionPixelSize(dimen.adfit_webview_menu_popup_offset_x)), this.getResources().getDimensionPixelOffset(dimen.adfit_webview_menu_popup_offset_y));
    }

    // 检测为 Lambda 实现
    private static final void c(IABNavigationBar iABNavigationBar0, View view0) [...]

    public final void c(String s) {
        L.p(s, "title");
        this.b.setText(s);
    }

    // 检测为 Lambda 实现
    private static final void d(IABNavigationBar iABNavigationBar0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void e(IABNavigationBar iABNavigationBar0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void f(IABNavigationBar iABNavigationBar0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void g(IABNavigationBar iABNavigationBar0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void h(IABNavigationBar iABNavigationBar0, View view0) [...]

    @Override  // android.view.View
    protected void onConfigurationChanged(Configuration configuration0) {
        L.p(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        this.a();
        this.h = null;
    }

    public final void setOnItemClickListener(@m a iABNavigationBar$a0) {
        this.g = iABNavigationBar$a0;
    }
}

