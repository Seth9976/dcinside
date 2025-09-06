package com.unity3d.services.banners.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.webplayer.WebPlayerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import org.json.JSONObject;

public class BannerWebPlayerContainer extends RelativeLayout {
    private String _bannerAdId;
    private int _lastVisibility;
    private UnityBannerSize _size;
    private Runnable _unsubscribeLayoutChange;
    private JSONObject _webPlayerEventSettings;
    private JSONObject _webPlayerSettings;
    private WebPlayerView _webPlayerView;
    private JSONObject _webSettings;

    public BannerWebPlayerContainer(Context context0, String s, JSONObject jSONObject0, JSONObject jSONObject1, JSONObject jSONObject2, UnityBannerSize unityBannerSize0) {
        super(context0);
        this._lastVisibility = -1;
        this._unsubscribeLayoutChange = null;
        this._size = unityBannerSize0;
        this._bannerAdId = s;
        this._webSettings = jSONObject0;
        this._webPlayerSettings = jSONObject1;
        this._webPlayerEventSettings = jSONObject2;
        WebPlayerView webPlayerView0 = new WebPlayerView(context0, s, this._webSettings, this._webPlayerSettings);
        this._webPlayerView = webPlayerView0;
        webPlayerView0.setEventSettings(this._webPlayerEventSettings);
        this.subscribeOnLayoutChange();
        this.addView(this._webPlayerView);
        this.setupLayoutParams();
    }

    public void destroy() {
        Runnable runnable0 = this._unsubscribeLayoutChange;
        if(runnable0 != null) {
            runnable0.run();
        }
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                this.removeAllViews();
                ViewParent viewParent0 = this.getParent();
                if(viewParent0 != null && viewParent0 instanceof ViewGroup) {
                    ((ViewGroup)viewParent0).removeView(this);
                }
                if(this._webPlayerView != null) {
                    this._webPlayerView.destroy();
                }
                this._webPlayerView = null;
            }
        });
    }

    public WebPlayerView getWebPlayer() {
        return this._webPlayerView;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        BannerBridge.didAttach(this._bannerAdId);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BannerBridge.didDetach(this._bannerAdId);
    }

    // 检测为 Lambda 实现
    public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) [...]

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(v2 != 0 || v3 != 0) {
            int v4 = this.getLeft();
            int v5 = this.getRight();
            float f = this.getAlpha();
            BannerBridge.resize(this._bannerAdId, v4, v5, v, v1, f);
            Rect rect0 = new Rect();
            this.getHitRect(rect0);
            if(((View)this.getParent()).getLocalVisibleRect(rect0)) {
                this.onVisibilityChanged(this, 8);
            }
        }
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(View view0, int v) {
        if(view0 == this) {
            int v1 = this._lastVisibility;
            if(v1 == -1) {
                this._lastVisibility = v;
                return;
            }
            if(v != 0 && v1 == 0) {
                BannerBridge.visibilityChanged(this._bannerAdId, v);
            }
            this._lastVisibility = v;
        }
    }

    @Override  // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        this.onLayoutChange(this, this.getLeft(), this.getTop(), this.getRight(), this.getBottom(), this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
    }

    public void setWebPlayerEventSettings(JSONObject jSONObject0) {
        this._webPlayerEventSettings = jSONObject0;
    }

    public void setWebPlayerSettings(JSONObject jSONObject0, JSONObject jSONObject1) {
        this._webSettings = jSONObject0;
        this._webPlayerSettings = jSONObject1;
    }

    private void setupLayoutParams() {
        this.setLayoutParams(new RelativeLayout.LayoutParams(Math.round(ViewUtilities.pxFromDp(this.getContext(), ((float)this._size.getWidth()))), Math.round(ViewUtilities.pxFromDp(this.getContext(), ((float)this._size.getHeight())))));
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this._webPlayerView.getLayoutParams();
        viewGroup$LayoutParams0.height = -1;
        viewGroup$LayoutParams0.width = -1;
        this._webPlayerView.setLayoutParams(viewGroup$LayoutParams0);
    }

    private void subscribeOnLayoutChange() {
        Runnable runnable0 = this._unsubscribeLayoutChange;
        if(runnable0 != null) {
            runnable0.run();
        }
        com.unity3d.services.banners.view.BannerWebPlayerContainer.1 bannerWebPlayerContainer$10 = (View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) -> {
            float f = BannerWebPlayerContainer.this.getAlpha();
            BannerBridge.resize(BannerWebPlayerContainer.this._bannerAdId, v, v1, v2, v3, f);
            if(BannerWebPlayerContainer.this.getParent() != null) {
                Rect rect0 = new Rect();
                BannerWebPlayerContainer.this.getHitRect(rect0);
                if(BannerWebPlayerContainer.this.getParent() instanceof View && !((View)BannerWebPlayerContainer.this.getParent()).getLocalVisibleRect(rect0)) {
                    BannerWebPlayerContainer.this.onVisibilityChanged(BannerWebPlayerContainer.this, 8);
                }
            }
        };
        this.addOnLayoutChangeListener(bannerWebPlayerContainer$10);
        this._unsubscribeLayoutChange = new Runnable() {
            @Override
            public void run() {
                BannerWebPlayerContainer.this.removeOnLayoutChangeListener(bannerWebPlayerContainer$10);
            }
        };

        class com.unity3d.services.banners.view.BannerWebPlayerContainer.1 implements View.OnLayoutChangeListener {
            @Override  // android.view.View$OnLayoutChangeListener
            public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                BannerWebPlayerContainer.this.onLayoutChange(view0, v, v1, v2, v3, v4, v5, v6, v7);
            }
        }

    }
}

