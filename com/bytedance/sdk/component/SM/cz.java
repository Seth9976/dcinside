package com.bytedance.sdk.component.SM;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.cRA;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class cz extends FrameLayout {
    public static class PjT extends WebViewClient {
        @Override  // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
            if(Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView0, renderProcessGoneDetail0);
            }
            if(webView0 != null) {
                webView0.post(new Runnable() {
                    final PjT Zh;

                    @Override
                    public void run() {
                        try {
                            ViewGroup viewGroup0 = (ViewGroup)webView0.getParent();
                            if(viewGroup0 != null) {
                                viewGroup0.removeView(webView0);
                            }
                            webView0.destroy();
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                });
            }
            return true;
        }
    }

    public interface ReZ {
        WebView createWebView(Context arg1, AttributeSet arg2, int arg3);
    }

    public interface Zh {
    }

    public interface cr {
    }

    private float Au;
    private Context Co;
    private long DWo;
    private long IJ;
    private String JQp;
    private AttributeSet Jo;
    private int KM;
    private boolean Lrd;
    private boolean Owx;
    public int PjT;
    private Zh Qf;
    private boolean RD;
    public int ReZ;
    private float SM;
    private boolean Sks;
    private boolean XX;
    private float Yo;
    private cRA ZX;
    private AtomicBoolean Zd;
    public int Zh;
    private WebViewClient cRA;
    private com.bytedance.sdk.component.SM.Zh.PjT cr;
    private JSONObject cz;
    private volatile WebView fDm;
    private List gK;
    private float iZZ;
    private cr ig;
    private long kph;
    private com.bytedance.sdk.component.SM.cr ltE;
    private AtomicBoolean qZS;
    private long qj;
    private View qla;
    private static ReZ rds;
    private boolean tT;
    private com.bytedance.sdk.component.SM.PjT ub;
    private AtomicBoolean wN;
    private com.bytedance.sdk.component.SM.PjT.PjT xE;
    private long xf;
    private boolean xs;
    private float yIW;

    public cz(Context context0) {
        this(cz.PjT(context0), false);
    }

    public cz(Context context0, boolean z) {
        super(cz.PjT(context0));
        this.Au = 0.0f;
        this.SM = 0.0f;
        this.DWo = 0L;
        this.qj = 0L;
        this.xf = 0L;
        this.xs = false;
        this.yIW = 20.0f;
        this.Yo = 50.0f;
        this.wN = new AtomicBoolean();
        this.qZS = new AtomicBoolean();
        this.Zd = new AtomicBoolean();
        this.Co = context0;
        if(z) {
            return;
        }
        try {
            this.fDm = this.PjT(null, 0);
            this.cz();
        }
        catch(Throwable unused_ex) {
        }
        this.Zh(cz.PjT(context0));
    }

    public void Au() {
        try {
            this.fDm.reload();
        }
        catch(Throwable unused_ex) {
        }
    }

    public void DWo() {
        try {
            this.fDm.goBack();
        }
        catch(Throwable unused_ex) {
        }
    }

    public void JQp() {
        try {
            this.fDm = this.PjT(this.Jo, 0);
            this.cz();
            this.Zh(cz.PjT(this.Co));
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
    }

    private void Owx() {
        try {
            WebSettings webSettings0 = this.fDm.getSettings();
            if(webSettings0 != null) {
                webSettings0.setSavePassword(false);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    private static Context PjT(Context context0) {
        return Build.VERSION.SDK_INT >= 23 ? context0 : context0.createConfigurationContext(new Configuration());
    }

    private WebView PjT(AttributeSet attributeSet0, int v) {
        ReZ cz$ReZ0 = cz.rds;
        if(cz$ReZ0 != null) {
            return cz$ReZ0.createWebView(this.getContext(), attributeSet0, v);
        }
        return attributeSet0 == null ? new WebView(cz.PjT(this.Co)) : new WebView(cz.PjT(this.Co), attributeSet0);
    }

    private void PjT(MotionEvent motionEvent0) {
        if(this.XX && this.cr != null && (this.JQp != null || this.cz != null) && motionEvent0 != null) {
            try {
                switch(motionEvent0.getAction()) {
                    case 0: {
                        this.Au = motionEvent0.getRawX();
                        this.SM = motionEvent0.getRawY();
                        this.DWo = System.currentTimeMillis();
                        this.cz = new JSONObject();
                        if(this.fDm != null) {
                            this.kph = this.DWo;
                            return;
                        }
                        break;
                    }
                    case 1: 
                    case 3: {
                        this.cz.put("start_x", String.valueOf(this.Au));
                        this.cz.put("start_y", String.valueOf(this.SM));
                        this.cz.put("offset_x", String.valueOf(motionEvent0.getRawX() - this.Au));
                        this.cz.put("offset_y", String.valueOf(motionEvent0.getRawY() - this.SM));
                        this.cz.put("url", this.getUrl());
                        this.cz.put("tag", "");
                        this.qj = System.currentTimeMillis();
                        if(this.fDm != null) {
                            this.IJ = this.qj;
                        }
                        this.cz.put("down_time", this.DWo);
                        this.cz.put("up_time", this.qj);
                        if(com.bytedance.sdk.component.SM.PjT.PjT.PjT().Zh() != null) {
                            long v = this.DWo;
                            if(this.xf != v) {
                                this.xf = v;
                                com.bytedance.sdk.component.SM.PjT.PjT.PjT().Zh().PjT(this.cr, this.JQp, "in_web_click", this.cz, this.qj - this.DWo);
                                return;
                            }
                        }
                        break;
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    // 去混淆评级： 低(30)
    protected ViewParent PjT(View view0) {
        ViewParent viewParent0 = view0.getParent();
        return viewParent0 instanceof AbsListView || viewParent0 instanceof ScrollView || viewParent0 instanceof HorizontalScrollView || !(viewParent0 instanceof View) || cz.Zh(((View)viewParent0)) || cz.ReZ(((View)viewParent0)) ? viewParent0 : this.PjT(((View)viewParent0));
    }

    public void PjT(int v, long v1) {
        if(this.fDm != null && this.fDm instanceof JQp) {
            this.ltE = new com.bytedance.sdk.component.SM.cr(this.Co, this.ub, v, v1, this);
            if(!TextUtils.isEmpty(this.JQp)) {
                this.ltE.PjT(this.JQp);
            }
            ((JQp)this.fDm).setTouchListenerProxy(this.ltE);
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void PjT(Object object0, String s) {
        try {
            this.fDm.addJavascriptInterface(object0, s);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void PjT(String s, String s1, String s2, String s3, String s4) {
        try {
            this.setJavaScriptEnabled(s);
            this.fDm.loadDataWithBaseURL(s, s1, s2, s3, s4);
        }
        catch(Throwable unused_ex) {
        }
    }

    @TargetApi(19)
    public void PjT(String s, Map map0) {
        try {
            this.setJavaScriptEnabled(s);
            this.fDm.loadUrl(s, map0);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void PjT(boolean z) {
        try {
            this.fDm.clearCache(z);
        }
        catch(Throwable unused_ex) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void PjT(boolean z, int v, int v1, List list0, int v2, List list1) {
        if(z && this.fDm != null && this.fDm instanceof JQp) {
            this.ub = new com.bytedance.sdk.component.SM.PjT(this.Co, v, v1, list0, v2);
            this.gK = list1;
            if(!TextUtils.isEmpty(this.JQp)) {
                this.ub.PjT(this.JQp);
            }
            ((JQp)this.fDm).setTouchListenerProxy(this.ub);
            this.xE = this.ub.PjT();
        }
    }

    public void PjT(boolean z, View view0) {
        if(z) {
            this.qla = view0;
            view0.setVisibility(8);
            if(this.qla != null && this.qla.getParent() == null) {
                this.addView(this.qla, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    private void RD() {
        if(this.ZX == null) {
            this.Zd.set(false);
            this.ZX = new cRA(this.getContext());
        }
        new Object() {
            final cz PjT;

        };
        this.Zd.set(true);
    }

    private static void ReZ(Context context0) {
    }

    private static boolean ReZ(View view0) {
        try {
            Class class0 = view0.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if(class0 != null && class0.isInstance(view0)) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            Class class1 = view0.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if(class1 != null && class1.isInstance(view0)) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public boolean ReZ() {
        return this.Sks;
    }

    public boolean SM() {
        if(this.fDm == null) {
            return false;
        }
        try {
            return this.fDm.canGoBack();
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public void XX() {
        try {
            this.fDm.stopLoading();
        }
        catch(Throwable unused_ex) {
        }
    }

    private void Zh(Context context0) {
        this.Owx();
        this.ltE();
    }

    private static boolean Zh(View view0) {
        try {
            Class class0 = view0.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if(class0 != null && class0.isInstance(view0)) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            Class class1 = view0.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if(class1 != null && class1.isInstance(view0)) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public boolean Zh() {
        return this.RD;
    }

    public void a_(String s) {
        try {
            this.setJavaScriptEnabled(s);
            this.fDm.loadUrl(s);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void b_(String s) {
        try {
            this.fDm.removeJavascriptInterface(s);
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // android.view.View
    public void computeScroll() {
        if(this.fDm == null) {
            return;
        }
        try {
            this.fDm.computeScroll();
        }
        catch(Throwable unused_ex) {
        }
    }

    public boolean cr() {
        return this.tT;
    }

    public void cz() {
        if(this.fDm != null) {
            this.removeAllViews();
            this.setBackground(null);
            try {
                this.fDm.setId(0x1F000008);
            }
            catch(Throwable unused_ex) {
            }
            this.addView(this.fDm, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        return super.dispatchTouchEvent(motionEvent0);
    }

    public void fDm() {
        try {
            this.fDm.clearHistory();
        }
        catch(Throwable unused_ex) {
        }
    }

    public boolean f_() {
        return this.Owx;
    }

    public void gK() {
        try {
            this.fDm.pauseTimers();
        }
        catch(Throwable unused_ex) {
        }
    }

    public View getArbitrageLoadingView() {
        return this.qla;
    }

    public int getContentHeight() {
        if(this.fDm == null) {
            return 0;
        }
        try {
            return this.fDm.getContentHeight();
        }
        catch(Throwable unused_ex) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.kph;
    }

    public long getLandingPageClickEnd() {
        return this.IJ;
    }

    public com.bytedance.sdk.component.SM.Zh.PjT getMaterialMeta() {
        return this.cr;
    }

    public String getOriginalUrl() {
        if(this.fDm == null) {
            return null;
        }
        try {
            String s = this.fDm.getOriginalUrl();
            if(s == null || !s.startsWith("data:text/html")) {
                return s;
            }
            String s1 = this.fDm.getUrl();
            return s1 == null || !s1.startsWith("file://") ? s : s1;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public int getProgress() {
        if(this.fDm == null) {
            return 0;
        }
        try {
            return this.fDm.getProgress();
        }
        catch(Throwable unused_ex) {
            return 100;
        }
    }

    @Override  // android.view.View
    public Object getTag() {
        return this.getTag();
    }

    public String getTag() {
        return this.JQp;
    }

    public String getUrl() {
        if(this.fDm == null) {
            return null;
        }
        try {
            return this.fDm.getUrl();
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public String getUserAgentString() {
        if(this.fDm == null) {
            return "";
        }
        try {
            return this.fDm.getSettings().getUserAgentString();
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.fDm;
    }

    public WebViewClient getWebViewClient() {
        return this.cRA;
    }

    @Override  // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    private void ltE() {
        if(this.fDm == null) {
            return;
        }
        try {
            this.fDm.removeJavascriptInterface("searchBoxJavaBridge_");
            this.fDm.removeJavascriptInterface("accessibility");
            this.fDm.removeJavascriptInterface("accessibilityTraversal");
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.wN.set(true);
        if(this.qZS.get() && !this.Zd.get()) {
            this.RD();
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.wN.set(false);
    }

    @Override  // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        try {
            this.PjT(motionEvent0);
            boolean z = super.onInterceptTouchEvent(motionEvent0);
            switch(motionEvent0.getActionMasked()) {
                case 0: 
                case 2: {
                    if(this.xs) {
                        ViewParent viewParent0 = this.PjT(this);
                        if(viewParent0 != null) {
                            viewParent0.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    return z;
                }
                default: {
                    return z;
                }
            }
        }
        catch(Throwable unused_ex) {
            return super.onInterceptTouchEvent(motionEvent0);
        }
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public boolean qj() {
        if(this.fDm == null) {
            return false;
        }
        try {
            return this.fDm.canGoForward();
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public void qla() {
        if(this.fDm == null) {
            return;
        }
        try {
            this.fDm.onPause();
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.fDm.removeAllViews();
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.fDm.getSettings().setAllowFileAccess(z);
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // android.view.View
    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.fDm.setAlpha(f);
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        try {
            this.fDm.setBackgroundColor(v);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.fDm.getSettings().setBuiltInZoomControls(z);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setCacheMode(int v) {
        try {
            this.fDm.getSettings().setCacheMode(v);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setCalculationMethod(int v) {
        this.KM = v;
    }

    public static void setDataDirectorySuffix(String s) {
        if(Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(s);
        }
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.fDm.getSettings().setDatabaseEnabled(z);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setDeepShakeValue(float f) {
        this.iZZ = f;
    }

    public void setDefaultFontSize(int v) {
        try {
            this.fDm.getSettings().setDefaultFontSize(v);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setDefaultTextEncodingName(String s) {
        try {
            this.fDm.getSettings().setDefaultTextEncodingName(s);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.fDm.getSettings().setDisplayZoomControls(z);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.fDm.getSettings().setDomStorageEnabled(z);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener0) {
        try {
            this.fDm.setDownloadListener(downloadListener0);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.xs = z;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.fDm.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        }
        catch(Throwable unused_ex) {
        }
    }

    private void setJavaScriptEnabled(String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            WebSettings webSettings0 = this.fDm.getSettings();
            if(webSettings0 == null) {
                return;
            }
            if(Uri.parse(s).getScheme().equalsIgnoreCase("file")) {
                webSettings0.setJavaScriptEnabled(false);
                return;
            }
            webSettings0.setJavaScriptEnabled(true);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.fDm.getSettings().setJavaScriptEnabled(z);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setLandingPage(boolean z) {
        this.XX = z;
    }

    public void setLandingPageClickBegin(long v) {
        this.kph = v;
    }

    public void setLandingPageClickEnd(long v) {
        this.IJ = v;
    }

    @Override  // android.view.View
    public void setLayerType(int v, Paint paint0) {
        try {
            this.fDm.setLayerType(v, paint0);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm webSettings$LayoutAlgorithm0) {
        try {
            this.fDm.getSettings().setLayoutAlgorithm(webSettings$LayoutAlgorithm0);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.fDm.getSettings().setLoadWithOverviewMode(z);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setLpPreRender(boolean z) {
        this.Owx = z;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.SM.Zh.PjT pjT0) {
        this.cr = pjT0;
    }

    public void setMixedContentMode(int v) {
        try {
            this.fDm.getSettings().setMixedContentMode(v);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.fDm.setNetworkAvailable(z);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setOnShakeListener(Zh cz$Zh0) {
        this.Qf = cz$Zh0;
    }

    @Override  // android.view.View
    public void setOverScrollMode(int v) {
        try {
            this.fDm.setOverScrollMode(v);
            super.setOverScrollMode(v);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setPreError(boolean z) {
        this.Lrd = z;
    }

    public void setPreFinish(boolean z) {
        this.Sks = z;
    }

    public void setPreProgressHundred(boolean z) {
        this.tT = z;
    }

    public void setPreStart(boolean z) {
        this.RD = z;
    }

    public void setRecycler(boolean z) {
        if(this.fDm != null && this.fDm instanceof JQp) {
            ((JQp)this.fDm).setRecycler(z);
        }
    }

    public void setShakeValue(float f) {
        this.yIW = f;
    }

    public void setSupportZoom(boolean z) {
        try {
            this.fDm.getSettings().setSupportZoom(z);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setTag(String s) {
        this.JQp = s;
        com.bytedance.sdk.component.SM.PjT pjT0 = this.ub;
        if(pjT0 != null) {
            pjT0.PjT(s);
        }
        com.bytedance.sdk.component.SM.cr cr0 = this.ltE;
        if(cr0 != null) {
            cr0.PjT(s);
        }
    }

    public void setTouchStateListener(cr cz$cr0) {
        this.ig = cz$cr0;
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.fDm.getSettings().setUseWideViewPort(z);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setUserAgentString(String s) {
        try {
            this.fDm.getSettings().setUserAgentString(s);
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        try {
            super.setVisibility(v);
            this.fDm.setVisibility(v);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient0) {
        try {
            this.fDm.setWebChromeClient(webChromeClient0);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient0) {
        try {
            if(webViewClient0 instanceof cr) {
                this.setTouchStateListener(((cr)webViewClient0));
            }
            else {
                this.setTouchStateListener(null);
            }
            if(webViewClient0 == null) {
                webViewClient0 = new PjT();
            }
            this.cRA = webViewClient0;
            this.fDm.setWebViewClient(new XX(this.xE, webViewClient0, this.gK));
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void setWebViewProvider(ReZ cz$ReZ0) {
        cz.rds = cz$ReZ0;
    }

    public void setWriggleValue(float f) {
        this.Yo = f;
    }

    public void ub() {
        try {
            this.fDm.clearView();
        }
        catch(Throwable unused_ex) {
        }
    }

    public void xE() {
        if(this.fDm == null) {
            return;
        }
        try {
            this.fDm.destroy();
        }
        catch(Throwable unused_ex) {
        }
    }

    public void xf() {
        try {
            this.fDm.goForward();
        }
        catch(Throwable unused_ex) {
        }
    }

    public void xs() {
        if(this.fDm != null) {
            this.fDm.onResume();
        }
    }
}

