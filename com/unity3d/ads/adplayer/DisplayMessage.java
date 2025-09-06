package com.unity3d.ads.adplayer;

import android.webkit.WebView;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class DisplayMessage {
    public static final class DisplayDestroyed extends DisplayMessage {
        public DisplayDestroyed(@l String s) {
            L.p(s, "opportunityId");
            super(s, null);
        }
    }

    public static final class DisplayError extends DisplayMessage {
        @l
        private final String reason;

        public DisplayError(@l String s, @l String s1) {
            L.p(s, "opportunityId");
            L.p(s1, "reason");
            super(s, null);
            this.reason = s1;
        }

        @l
        public final String getReason() {
            return this.reason;
        }
    }

    public static final class DisplayFinishRequest extends DisplayMessage {
        public DisplayFinishRequest(@l String s) {
            L.p(s, "opportunityId");
            super(s, null);
        }
    }

    public static final class DisplayReady extends DisplayMessage {
        @m
        private final Map showOptions;

        public DisplayReady(@l String s, @m Map map0) {
            L.p(s, "opportunityId");
            super(s, null);
            this.showOptions = map0;
        }

        public DisplayReady(String s, Map map0, int v, w w0) {
            if((v & 2) != 0) {
                map0 = null;
            }
            this(s, map0);
        }

        @m
        public final Map getShowOptions() {
            return this.showOptions;
        }
    }

    public static final class FocusChanged extends DisplayMessage {
        private final boolean isFocused;

        public FocusChanged(@l String s, boolean z) {
            L.p(s, "opportunityId");
            super(s, null);
            this.isFocused = z;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }
    }

    public static final class SetOrientation extends DisplayMessage {
        private final int orientation;

        public SetOrientation(@l String s, int v) {
            L.p(s, "opportunityId");
            super(s, null);
            this.orientation = v;
        }

        public final int getOrientation() {
            return this.orientation;
        }
    }

    public static final class VisibilityChanged extends DisplayMessage {
        private final boolean isVisible;

        public VisibilityChanged(@l String s, boolean z) {
            L.p(s, "opportunityId");
            super(s, null);
            this.isVisible = z;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }
    }

    public static final class WebViewInstanceRequest extends DisplayMessage {
        public WebViewInstanceRequest(@l String s) {
            L.p(s, "opportunityId");
            super(s, null);
        }
    }

    public static final class WebViewInstanceResponse extends DisplayMessage {
        @l
        private final WebView webView;

        public WebViewInstanceResponse(@l String s, @l WebView webView0) {
            L.p(s, "opportunityId");
            L.p(webView0, "webView");
            super(s, null);
            this.webView = webView0;
        }

        @l
        public final WebView getWebView() {
            return this.webView;
        }
    }

    @l
    private final String opportunityId;

    private DisplayMessage(String s) {
        this.opportunityId = s;
    }

    public DisplayMessage(String s, w w0) {
        this(s);
    }

    @l
    public final String getOpportunityId() {
        return this.opportunityId;
    }
}

