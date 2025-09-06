package com.dcinside.app.browser.views;

import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.VideoView;

public class a extends WebChromeClient implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    public interface com.dcinside.app.browser.views.a.a {
        void a(boolean arg1);
    }

    private View a;
    private ViewGroup b;
    private View c;
    private WebView d;
    private boolean e;
    private FrameLayout f;
    private WebChromeClient.CustomViewCallback g;
    private com.dcinside.app.browser.views.a.a h;

    public a() {
    }

    public a(View view0, ViewGroup viewGroup0) {
        this.a = view0;
        this.b = viewGroup0;
        this.c = null;
        this.d = null;
        this.e = false;
    }

    public a(View view0, ViewGroup viewGroup0, View view1) {
        this.a = view0;
        this.b = viewGroup0;
        this.c = view1;
        this.d = null;
        this.e = false;
    }

    public a(View view0, ViewGroup viewGroup0, View view1, WebView webView0) {
        this.a = view0;
        this.b = viewGroup0;
        this.c = view1;
        this.d = webView0;
        this.e = false;
    }

    public boolean a() {
        return this.e;
    }

    public boolean b() {
        if(this.e) {
            this.onHideCustomView();
            return true;
        }
        return false;
    }

    public void c(com.dcinside.app.browser.views.a.a a$a0) {
        this.h = a$a0;
    }

    @Override  // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        View view0 = this.c;
        if(view0 != null) {
            view0.setVisibility(0);
            return this.c;
        }
        return super.getVideoLoadingProgressView();
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer0) {
        this.onHideCustomView();
    }

    @Override  // android.media.MediaPlayer$OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
        return false;
    }

    @Override  // android.webkit.WebChromeClient
    public void onHideCustomView() {
        if(this.e) {
            this.b.setVisibility(4);
            this.b.removeView(this.f);
            this.a.setVisibility(0);
            if(this.g != null && !this.g.getClass().getName().contains(".chromium.")) {
                this.g.onCustomViewHidden();
            }
            this.e = false;
            this.f = null;
            this.g = null;
            com.dcinside.app.browser.views.a.a a$a0 = this.h;
            if(a$a0 != null) {
                a$a0.a(false);
            }
        }
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer0) {
        View view0 = this.c;
        if(view0 != null) {
            view0.setVisibility(8);
        }
    }

    @Override  // android.webkit.WebChromeClient
    public void onShowCustomView(View view0, int v, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        this.onShowCustomView(view0, webChromeClient$CustomViewCallback0);
    }

    @Override  // android.webkit.WebChromeClient
    public void onShowCustomView(View view0, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        if(view0 instanceof FrameLayout) {
            View view1 = ((FrameLayout)view0).getFocusedChild();
            this.e = true;
            this.f = (FrameLayout)view0;
            this.g = webChromeClient$CustomViewCallback0;
            this.a.setVisibility(4);
            this.b.setVisibility(0);
            this.b.addView(this.f, new ViewGroup.LayoutParams(-1, -1));
            this.b.setVisibility(0);
            if(view1 instanceof VideoView) {
                ((VideoView)view1).setOnPreparedListener(this);
                ((VideoView)view1).setOnCompletionListener(this);
                ((VideoView)view1).setOnErrorListener(this);
            }
            else if(this.d != null && this.d.getSettings().getJavaScriptEnabled() && view1 instanceof SurfaceView) {
                this.d.loadUrl("javascript:var _ytrp_html5_video_last;var _ytrp_html5_video = document.getElementsByTagName(\'video\')[0];if (_ytrp_html5_video != undefined && _ytrp_html5_video != _ytrp_html5_video_last) {_ytrp_html5_video_last = _ytrp_html5_video;function _ytrp_html5_video_ended() {_VideoEnabledWebView.notifyVideoEnd();}_ytrp_html5_video.addEventListener(\'ended\', _ytrp_html5_video_ended);}");
            }
            com.dcinside.app.browser.views.a.a a$a0 = this.h;
            if(a$a0 != null) {
                a$a0.a(true);
            }
        }
    }
}

