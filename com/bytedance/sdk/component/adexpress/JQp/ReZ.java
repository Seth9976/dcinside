package com.bytedance.sdk.component.adexpress.JQp;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

public class ReZ {
    private WeakReference PjT;

    public ReZ(Zh zh0) {
        this.PjT = new WeakReference(zh0);
    }

    public void PjT(Zh zh0) {
        this.PjT = new WeakReference(zh0);
    }

    @JavascriptInterface
    public void adAnalysisData(String s) {
        if(this.PjT != null && this.PjT.get() != null) {
            this.PjT.get();
        }
    }

    @JavascriptInterface
    public String adInfo() {
        return this.PjT == null || this.PjT.get() == null ? "" : ((Zh)this.PjT.get()).adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        return this.PjT == null || this.PjT.get() == null ? "" : ((Zh)this.PjT.get()).appInfo();
    }

    @JavascriptInterface
    public void changeVideoState(String s) {
        if(this.PjT != null && this.PjT.get() != null) {
            ((Zh)this.PjT.get()).changeVideoState(s);
        }
    }

    @JavascriptInterface
    public void chooseAdResult(String s) {
        if(this.PjT != null && this.PjT.get() != null) {
            ((Zh)this.PjT.get()).chooseAdResult(s);
        }
    }

    @JavascriptInterface
    public void clickEvent(String s) {
        if(this.PjT != null && this.PjT.get() != null) {
            ((Zh)this.PjT.get()).clickEvent(s);
        }
    }

    @JavascriptInterface
    public void dynamicTrack(String s) {
        if(this.PjT != null && this.PjT.get() != null) {
            ((Zh)this.PjT.get()).dynamicTrack(s);
        }
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        return this.PjT == null || this.PjT.get() == null ? "" : ((Zh)this.PjT.get()).getCurrentVideoState();
    }

    @JavascriptInterface
    public String getData(String s) {
        return this.PjT == null || this.PjT.get() == null ? "" : ((Zh)this.PjT.get()).getData(s);
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        return this.PjT == null || this.PjT.get() == null ? "" : ((Zh)this.PjT.get()).getTemplateInfo();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        if(this.PjT != null && this.PjT.get() != null) {
            ((Zh)this.PjT.get()).initRenderFinish();
        }
    }

    @JavascriptInterface
    public void muteVideo(String s) {
        if(this.PjT != null && this.PjT.get() != null) {
            ((Zh)this.PjT.get()).muteVideo(s);
        }
    }

    @JavascriptInterface
    public void renderDidFinish(String s) {
        if(this.PjT != null && this.PjT.get() != null) {
            ((Zh)this.PjT.get()).renderDidFinish(s);
        }
    }

    @JavascriptInterface
    public void requestPauseVideo(String s) {
        if(this.PjT != null && this.PjT.get() != null) {
            ((Zh)this.PjT.get()).PjT(s);
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        if(this.PjT != null && this.PjT.get() != null) {
            ((Zh)this.PjT.get()).skipVideo();
        }
    }

    @JavascriptInterface
    public void videoFrameChanged(String s) {
        if(this.PjT != null && this.PjT.get() != null) {
            ((Zh)this.PjT.get()).videoFrameChanged(s);
        }
    }
}

