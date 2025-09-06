package com.dcinside.app.image;

import Y.M0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.OptIn;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlayer.Builder;
import androidx.media3.exoplayer.ExoPlayer;
import com.dcinside.app.base.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class VideoPreviewActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, @l String s) {
            L.p(context0, "context");
            L.p(s, "path");
            Intent intent0 = new Intent(context0, VideoPreviewActivity.class);
            intent0.putExtra("com.dcinside.app.image.VideoPreviewActivity.EXTRA_VIDEO_PATH", s);
            context0.startActivity(intent0);
        }
    }

    private M0 u;
    @m
    private ExoPlayer v;
    @l
    public static final a w = null;
    @l
    public static final String x = "com.dcinside.app.image.VideoPreviewActivity.EXTRA_VIDEO_PATH";

    static {
        VideoPreviewActivity.w = new a(null);
    }

    @OptIn(markerClass = {UnstableApi.class})
    private final ExoPlayer E1() {
        M0 m00 = this.u;
        if(m00 == null) {
            L.S("binding");
            m00 = null;
        }
        m00.c.setControllerAutoShow(false);
        ExoPlayer exoPlayer0 = new Builder(this).q0(5000L).p0(5000L).w();
        L.o(exoPlayer0, "build(...)");
        return exoPlayer0;
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        M0 m00 = M0.c(this.getLayoutInflater());
        L.o(m00, "inflate(...)");
        this.u = m00;
        M0 m01 = null;
        if(m00 == null) {
            L.S("binding");
            m00 = null;
        }
        this.setContentView(m00.b());
        M0 m02 = this.u;
        if(m02 == null) {
            L.S("binding");
            m02 = null;
        }
        this.S0(m02.d);
        kr.bhbfhfb.designcompat.a.d(this);
        this.getWindow().setStatusBarColor(0);
        M0 m03 = this.u;
        if(m03 == null) {
            L.S("binding");
            m03 = null;
        }
        m03.d.setBackgroundColor(0);
        String s = "";
        this.setTitle("");
        String s1 = this.getIntent().getStringExtra("com.dcinside.app.image.VideoPreviewActivity.EXTRA_VIDEO_PATH");
        if(s1 != null) {
            s = s1;
        }
        ExoPlayer exoPlayer0 = this.E1();
        this.v = exoPlayer0;
        M0 m04 = this.u;
        if(m04 == null) {
            L.S("binding");
        }
        else {
            m01 = m04;
        }
        m01.c.setPlayer(exoPlayer0);
        MediaItem mediaItem0 = MediaItem.d(s);
        L.o(mediaItem0, "fromUri(...)");
        exoPlayer0.p0(mediaItem0);
        exoPlayer0.D1(true);
        exoPlayer0.n();
        exoPlayer0.c();
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        ExoPlayer exoPlayer0 = this.v;
        if(exoPlayer0 != null) {
            exoPlayer0.release();
        }
        this.v = null;
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

