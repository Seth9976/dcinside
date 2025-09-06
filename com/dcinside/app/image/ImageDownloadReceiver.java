package com.dcinside.app.image;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class ImageDownloadReceiver extends BroadcastReceiver {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final a a = null;
    @l
    public static final String b = "com.dcinside.app.action.RETRY_DOWNLOAD";

    static {
        ImageDownloadReceiver.a = new a(null);
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(@m Context context0, @m Intent intent0) {
        String s = intent0 == null ? null : intent0.getAction();
        if(s != null && s.hashCode() == 1206029220 && s.equals("com.dcinside.app.action.RETRY_DOWNLOAD")) {
            String s1 = intent0.getStringExtra("download_fail_data");
            ImageDownloadWorker.a.a(s1);
        }
    }
}

