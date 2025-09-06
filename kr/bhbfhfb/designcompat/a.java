package kr.bhbfhfb.designcompat;

import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public final class a {
    public static void a(ActionBar actionBar0, View view0) {
        if(actionBar0 != null) {
            actionBar0.U(view0);
            actionBar0.a0(true);
        }
    }

    public static void b(AppCompatActivity appCompatActivity0, View view0) {
        if(appCompatActivity0 != null) {
            a.a(appCompatActivity0.I0(), view0);
        }
    }

    public static void c(ActionBar actionBar0) {
        if(actionBar0 != null) {
            actionBar0.X(true);
        }
    }

    public static void d(AppCompatActivity appCompatActivity0) {
        if(appCompatActivity0 != null) {
            a.c(appCompatActivity0.I0());
        }
    }

    public static void e(ActionBar actionBar0, int v) {
        if(actionBar0 != null) {
            actionBar0.y0(v);
        }
    }

    public static void f(ActionBar actionBar0, String s) {
        if(actionBar0 != null) {
            actionBar0.z0(s);
        }
    }

    public static void g(AppCompatActivity appCompatActivity0, int v) {
        if(appCompatActivity0 != null) {
            a.e(appCompatActivity0.I0(), v);
        }
    }

    public static void h(AppCompatActivity appCompatActivity0, String s) {
        if(appCompatActivity0 != null) {
            a.f(appCompatActivity0.I0(), s);
        }
    }
}

