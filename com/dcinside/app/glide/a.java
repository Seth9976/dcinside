package com.dcinside.app.glide;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import java.io.File;

public final class a {
    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    public static void a() {
        c.d();
    }

    @NonNull
    public static c b(@NonNull Context context0) {
        return c.e(context0);
    }

    @Nullable
    public static File c(@NonNull Context context0) {
        return c.l(context0);
    }

    @Nullable
    public static File d(@NonNull Context context0, @NonNull String s) {
        return c.m(context0, s);
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    public static void e(@NonNull Context context0, @NonNull d d0) {
        c.q(context0, d0);
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    @Deprecated
    public static void f(c c0) {
        c.r(c0);
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    public static void g() {
        c.u();
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    public static void h() {
        c.z();
    }

    @NonNull
    @Deprecated
    public static com.dcinside.app.glide.d i(@NonNull Activity activity0) {
        return (com.dcinside.app.glide.d)c.D(activity0);
    }

    @NonNull
    @Deprecated
    public static com.dcinside.app.glide.d j(@NonNull Fragment fragment0) {
        return (com.dcinside.app.glide.d)c.E(fragment0);
    }

    @NonNull
    public static com.dcinside.app.glide.d k(@NonNull Context context0) {
        return (com.dcinside.app.glide.d)c.F(context0);
    }

    @NonNull
    public static com.dcinside.app.glide.d l(@NonNull View view0) {
        return (com.dcinside.app.glide.d)c.G(view0);
    }

    @NonNull
    public static com.dcinside.app.glide.d m(@NonNull androidx.fragment.app.Fragment fragment0) {
        return (com.dcinside.app.glide.d)c.H(fragment0);
    }

    @NonNull
    public static com.dcinside.app.glide.d n(@NonNull FragmentActivity fragmentActivity0) {
        return (com.dcinside.app.glide.d)c.I(fragmentActivity0);
    }
}

