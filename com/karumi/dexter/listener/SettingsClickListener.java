package com.karumi.dexter.listener;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public class SettingsClickListener implements View.OnClickListener {
    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        Context context0 = view0.getContext();
        Intent intent0 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:com.dcinside.app.android"));
        intent0.addCategory("android.intent.category.DEFAULT");
        intent0.setFlags(0x10000000);
        context0.startActivity(intent0);
    }
}

