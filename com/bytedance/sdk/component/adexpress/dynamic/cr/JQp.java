package com.bytedance.sdk.component.adexpress.dynamic.cr;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class JQp {
    private cz JQp;
    public static final Map PjT;
    private String ReZ;
    private String Zh;
    private cz cr;
    private String cz;

    static {
        HashMap hashMap0 = new HashMap();
        JQp.PjT = hashMap0;
        hashMap0.put("root", 8);
        hashMap0.put("footer", 6);
        hashMap0.put("empty", 6);
        hashMap0.put("title", 0);
        hashMap0.put("subtitle", 0);
        hashMap0.put("source", 0);
        hashMap0.put("score-count", 0);
        hashMap0.put("text_star", 0);
        hashMap0.put("text", 0);
        hashMap0.put("tag-group", 17);
        hashMap0.put("app-version", 0);
        hashMap0.put("development-name", 0);
        hashMap0.put("privacy-detail", 23);
        hashMap0.put("image", 1);
        hashMap0.put("image-wide", 1);
        hashMap0.put("image-square", 1);
        hashMap0.put("image-long", 1);
        hashMap0.put("image-splash", 1);
        hashMap0.put("image-cover", 1);
        hashMap0.put("app-icon", 1);
        hashMap0.put("icon-download", 1);
        hashMap0.put("logoad", 4);
        hashMap0.put("logounion", 5);
        hashMap0.put("logo-union", 9);
        hashMap0.put("dislike", 3);
        hashMap0.put("close", 3);
        hashMap0.put("close-fill", 3);
        hashMap0.put("webview-close", 22);
        hashMap0.put("feedback-dislike", 12);
        hashMap0.put("button", 2);
        hashMap0.put("downloadWithIcon", 2);
        hashMap0.put("downloadButton", 2);
        hashMap0.put("fillButton", 2);
        hashMap0.put("laceButton", 2);
        hashMap0.put("cardButton", 2);
        hashMap0.put("colourMixtureButton", 2);
        hashMap0.put("arrowButton", 1);
        hashMap0.put("download-progress-button", 2);
        hashMap0.put("vessel", 6);
        hashMap0.put("image-group", 6);
        hashMap0.put("custom-component-vessel", 6);
        hashMap0.put("carousel", 24);
        hashMap0.put("carousel-vessel", 26);
        hashMap0.put("leisure-interact", 25);
        hashMap0.put("video-hd", 7);
        hashMap0.put("video", 7);
        hashMap0.put("video-vd", 7);
        hashMap0.put("video-sq", 7);
        hashMap0.put("muted", 10);
        hashMap0.put("star", 11);
        hashMap0.put("skip-countdowns", 19);
        hashMap0.put("skip-with-countdowns-skip-btn", 21);
        hashMap0.put("skip-with-countdowns-video-countdown", 13);
        hashMap0.put("skip-with-countdowns-skip-countdown", 20);
        hashMap0.put("skip-with-time", 14);
        hashMap0.put("skip-with-time-countdown", 13);
        hashMap0.put("skip-with-time-skip-btn", 15);
        hashMap0.put("skip", 27);
        hashMap0.put("timedown", 13);
        hashMap0.put("icon", 16);
        hashMap0.put("scoreCountWithIcon", 6);
        hashMap0.put("split-line", 18);
        hashMap0.put("creative-playable-bait", 0);
        hashMap0.put("score-count-type-2", 0);
        hashMap0.put("lottie", 28);
    }

    public cz JQp() {
        return this.cr;
    }

    public int PjT() {
        if(TextUtils.isEmpty(this.Zh)) {
            return 0;
        }
        if(this.Zh.equals("logo")) {
            String s = this.Zh + this.ReZ;
            this.Zh = s;
            if(s.contains("logoad")) {
                return 4;
            }
            if(this.Zh.contains("logounion")) {
                return 5;
            }
        }
        return JQp.PjT.get(this.Zh) == null ? -1 : ((int)(((Integer)JQp.PjT.get(this.Zh))));
    }

    public void PjT(cz cz0) {
        this.cr = cz0;
    }

    public void PjT(String s) {
        this.Zh = s;
    }

    public String ReZ() {
        return this.ReZ;
    }

    public void ReZ(String s) {
        this.cz = s;
    }

    public cz XX() {
        return this.JQp;
    }

    public String Zh() {
        return this.Zh;
    }

    public void Zh(cz cz0) {
        this.JQp = cz0;
    }

    public void Zh(String s) {
        this.ReZ = s;
    }

    public String cr() {
        return this.cz;
    }

    public int cz() {
        return this.cr.RV();
    }

    @Override
    public String toString() {
        return "DynamicLayoutBrick{type=\'" + this.Zh + '\'' + ", data=\'" + this.ReZ + '\'' + ", value=" + this.cr + ", themeValue=" + this.JQp + ", dataExtraInfo=\'" + this.cz + '\'' + '}';
    }
}

