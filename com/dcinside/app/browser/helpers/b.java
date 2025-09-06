package com.dcinside.app.browser.helpers;

import android.graphics.Color;

public class b {
    public static int a(int v) {
        return Color.argb(((int)(((float)Color.alpha(v)) * 0.2f)), Color.red(v), Color.green(v), Color.blue(v));
    }
}

