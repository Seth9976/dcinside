package com.dcinside.app.browser;

import android.view.View.OnClickListener;
import android.view.View;
import com.dcinside.app.browser.objects.CustomMenu;

public final class d implements View.OnClickListener {
    public final AwesomeWebViewActivity a;
    public final AwesomeWebViewActivity b;
    public final CustomMenu c;

    public d(AwesomeWebViewActivity awesomeWebViewActivity0, AwesomeWebViewActivity awesomeWebViewActivity1, CustomMenu customMenu0) {
        this.a = awesomeWebViewActivity0;
        this.b = awesomeWebViewActivity1;
        this.c = customMenu0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        AwesomeWebViewActivity.j5(this.a, this.b, this.c, view0);
    }
}

