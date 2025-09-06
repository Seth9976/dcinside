package com.bumptech.glide.request.target;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.bumptech.glide.request.transition.f;
import com.bumptech.glide.util.m;

public class l extends e {
    private final RemoteViews d;
    private final Context e;
    private final int f;
    private final String g;
    private final Notification h;
    private final int i;

    @SuppressLint({"InlinedApi"})
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public l(Context context0, int v, int v1, int v2, RemoteViews remoteViews0, Notification notification0, int v3, String s) {
        super(v, v1);
        this.e = (Context)m.f(context0, "Context must not be null!");
        this.h = (Notification)m.f(notification0, "Notification object can not be null!");
        this.d = (RemoteViews)m.f(remoteViews0, "RemoteViews object can not be null!");
        this.i = v2;
        this.f = v3;
        this.g = s;
    }

    @SuppressLint({"InlinedApi"})
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public l(Context context0, int v, RemoteViews remoteViews0, Notification notification0, int v1) {
        this(context0, v, remoteViews0, notification0, v1, null);
    }

    @SuppressLint({"InlinedApi"})
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public l(Context context0, int v, RemoteViews remoteViews0, Notification notification0, int v1, String s) {
        this(context0, 0x80000000, 0x80000000, v, remoteViews0, notification0, v1, s);
    }

    @Override  // com.bumptech.glide.request.target.p
    @SuppressLint({"InlinedApi"})
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void B(@Nullable Drawable drawable0) {
        this.b(null);
    }

    @Override  // com.bumptech.glide.request.target.p
    @SuppressLint({"InlinedApi"})
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void C(@NonNull Object object0, @Nullable f f0) {
        this.a(((Bitmap)object0), f0);
    }

    @SuppressLint({"InlinedApi"})
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void a(@NonNull Bitmap bitmap0, @Nullable f f0) {
        this.b(bitmap0);
    }

    @SuppressLint({"InlinedApi"})
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    private void b(@Nullable Bitmap bitmap0) {
        this.d.setImageViewBitmap(this.i, bitmap0);
        this.c();
    }

    @SuppressLint({"InlinedApi"})
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    private void c() {
        ((NotificationManager)m.e(((NotificationManager)this.e.getSystemService("notification")))).notify(this.g, this.f, this.h);
    }
}

