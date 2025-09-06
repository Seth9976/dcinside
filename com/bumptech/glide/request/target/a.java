package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.transition.f;
import com.bumptech.glide.util.m;

public class a extends e {
    private final int[] d;
    private final ComponentName e;
    private final RemoteViews f;
    private final Context g;
    private final int h;

    public a(Context context0, int v, int v1, int v2, RemoteViews remoteViews0, ComponentName componentName0) {
        super(v, v1);
        this.g = (Context)m.f(context0, "Context can not be null!");
        this.f = (RemoteViews)m.f(remoteViews0, "RemoteViews object can not be null!");
        this.e = (ComponentName)m.f(componentName0, "ComponentName can not be null!");
        this.h = v2;
        this.d = null;
    }

    public a(Context context0, int v, int v1, int v2, RemoteViews remoteViews0, int[] arr_v) {
        super(v, v1);
        if(arr_v.length == 0) {
            throw new IllegalArgumentException("WidgetIds must have length > 0");
        }
        this.g = (Context)m.f(context0, "Context can not be null!");
        this.f = (RemoteViews)m.f(remoteViews0, "RemoteViews object can not be null!");
        this.d = (int[])m.f(arr_v, "WidgetIds can not be null!");
        this.h = v2;
        this.e = null;
    }

    public a(Context context0, int v, RemoteViews remoteViews0, ComponentName componentName0) {
        this(context0, 0x80000000, 0x80000000, v, remoteViews0, componentName0);
    }

    public a(Context context0, int v, RemoteViews remoteViews0, int[] arr_v) {
        this(context0, 0x80000000, 0x80000000, v, remoteViews0, arr_v);
    }

    @Override  // com.bumptech.glide.request.target.p
    public void B(@Nullable Drawable drawable0) {
        this.b(null);
    }

    @Override  // com.bumptech.glide.request.target.p
    public void C(@NonNull Object object0, @Nullable f f0) {
        this.a(((Bitmap)object0), f0);
    }

    public void a(@NonNull Bitmap bitmap0, @Nullable f f0) {
        this.b(bitmap0);
    }

    private void b(@Nullable Bitmap bitmap0) {
        this.f.setImageViewBitmap(this.h, bitmap0);
        this.c();
    }

    private void c() {
        AppWidgetManager appWidgetManager0 = AppWidgetManager.getInstance(this.g);
        ComponentName componentName0 = this.e;
        if(componentName0 != null) {
            appWidgetManager0.updateAppWidget(componentName0, this.f);
            return;
        }
        appWidgetManager0.updateAppWidget(this.d, this.f);
    }
}

