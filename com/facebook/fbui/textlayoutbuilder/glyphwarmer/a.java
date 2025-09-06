package com.facebook.fbui.textlayoutbuilder.glyphwarmer;

import android.annotation.SuppressLint;
import android.graphics.Picture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import androidx.annotation.VisibleForTesting;
import com.facebook.fbui.textlayoutbuilder.b;

public class a implements b {
    static class com.facebook.fbui.textlayoutbuilder.glyphwarmer.a.a extends Handler {
        private final Picture a;
        private static final int b = 1;

        com.facebook.fbui.textlayoutbuilder.glyphwarmer.a.a(Looper looper0) {
            super(looper0);
            this.a = new Picture();
        }

        @Override  // android.os.Handler
        public void handleMessage(Message message0) {
            Layout layout0 = (Layout)message0.obj;
            try {
                int v = H0.a.c(layout0);
                int v1 = H0.a.b(layout0);
                layout0.draw(this.a.beginRecording(v, v1));
                this.a.endRecording();
            }
            catch(Exception unused_ex) {
            }
        }
    }

    private static com.facebook.fbui.textlayoutbuilder.glyphwarmer.a.a a;

    @Override  // com.facebook.fbui.textlayoutbuilder.b
    public void a(Layout layout0) {
        com.facebook.fbui.textlayoutbuilder.glyphwarmer.a.a a$a0 = this.b();
        a$a0.sendMessage(a$a0.obtainMessage(1, layout0));
    }

    @SuppressLint({"BadMethodUse-android.os.HandlerThread._Constructor", "BadMethodUse-java.lang.Thread.start"})
    private com.facebook.fbui.textlayoutbuilder.glyphwarmer.a.a b() {
        if(a.a == null) {
            HandlerThread handlerThread0 = new HandlerThread("GlyphWarmer");
            handlerThread0.start();
            a.a = new com.facebook.fbui.textlayoutbuilder.glyphwarmer.a.a(handlerThread0.getLooper());
        }
        return a.a;
    }

    @VisibleForTesting
    Looper c() {
        return this.b().getLooper();
    }
}

