package com.kakao.adfit.d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.kakao.adfit.ads.R.id;
import com.kakao.adfit.ads.R.layout;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class a extends FrameLayout {
    private final ImageView a;
    private final ImageView b;
    private final ProgressBar c;
    private final ProgressBar d;

    public a(Context context0, AttributeSet attributeSet0, int v) {
        public static final class com.kakao.adfit.d.a.a extends View.AccessibilityDelegate {
            @Override  // android.view.View$AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfo accessibilityNodeInfo0) {
                L.p(view0, "host");
                L.p(accessibilityNodeInfo0, "info");
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
                if(accessibilityNodeInfo0.isClickable()) {
                    accessibilityNodeInfo0.setClassName("android.widget.Button");
                }
            }
        }


        public static final class b extends View.AccessibilityDelegate {
            @Override  // android.view.View$AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfo accessibilityNodeInfo0) {
                L.p(view0, "host");
                L.p(accessibilityNodeInfo0, "info");
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
                if(accessibilityNodeInfo0.isClickable()) {
                    accessibilityNodeInfo0.setClassName("android.widget.Button");
                }
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        LayoutInflater.from(context0).inflate(layout.adfit_video_panel_view, this, true);
        View view0 = this.findViewById(id.videoPlayButton);
        L.o(view0, "findViewById(R.id.videoPlayButton)");
        this.a = (ImageView)view0;
        ((ImageView)view0).setAccessibilityDelegate(new com.kakao.adfit.d.a.a());
        View view1 = this.findViewById(id.videoSoundButton);
        L.o(view1, "findViewById(R.id.videoSoundButton)");
        this.b = (ImageView)view1;
        ((ImageView)view1).setAccessibilityDelegate(new b());
        View view2 = this.findViewById(id.videoProgressBar);
        L.o(view2, "findViewById(R.id.videoProgressBar)");
        this.c = (ProgressBar)view2;
        View view3 = this.findViewById(id.videoLoadingProgressBar);
        L.o(view3, "findViewById(R.id.videoLoadingProgressBar)");
        this.d = (ProgressBar)view3;
    }

    public a(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @l
    public final ProgressBar getLoadingProgressBar() {
        return this.d;
    }

    @l
    public final ImageView getPlayButton() {
        return this.a;
    }

    @l
    public final ProgressBar getProgressBar() {
        return this.c;
    }

    @l
    public final ImageView getSoundButton() {
        return this.b;
    }
}

