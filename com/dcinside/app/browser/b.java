package com.dcinside.app.browser;

import android.os.Bundle;
import androidx.fragment.app.FragmentResultListener;

public final class b implements FragmentResultListener {
    public final AwesomeWebViewActivity a;

    public b(AwesomeWebViewActivity awesomeWebViewActivity0) {
        this.a = awesomeWebViewActivity0;
    }

    @Override  // androidx.fragment.app.FragmentResultListener
    public final void e(String s, Bundle bundle0) {
        AwesomeWebViewActivity.s5(this.a, s, bundle0);
    }
}

