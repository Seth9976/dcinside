package com.dcinside.app.memo;

import android.graphics.Color;
import h3.c;
import io.realm.J1;
import io.realm.d1;
import io.realm.internal.s;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class q extends d1 implements J1 {
    @s0({"SMAP\nUserMemoItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMemoItem.kt\ncom/dcinside/app/memo/UserMemoItem$Companion\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,37:1\n404#2:38\n*S KotlinDebug\n*F\n+ 1 UserMemoItem.kt\ncom/dcinside/app/memo/UserMemoItem$Companion\n*L\n30#1:38\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        public final Integer a(@m String s) {
            if(s != null) {
                try {
                    return Color.parseColor(s);
                }
                catch(Exception unused_ex) {
                }
            }
            return null;
        }
    }

    @c
    @m
    private String d;
    @m
    private String e;
    @m
    private String f;
    @l
    public static final a g;

    static {
        q.g = new a(null);
    }

    public q() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.J1
    public String M() {
        return this.e;
    }

    @m
    public String Q5() {
        return this.m0();
    }

    @m
    public String R5() {
        return this.M();
    }

    @m
    public String S5() {
        return this.n5();
    }

    public void T5(@m String s) {
        this.a2(s);
    }

    public void U5(@m String s) {
        this.d0(s);
    }

    public void V5(@m String s) {
        this.b1(s);
    }

    @Override  // io.realm.J1
    public void a2(String s) {
        this.f = s;
    }

    @Override  // io.realm.J1
    public void b1(String s) {
        this.d = s;
    }

    @Override  // io.realm.J1
    public void d0(String s) {
        this.e = s;
    }

    @Override  // io.realm.J1
    public String m0() {
        return this.f;
    }

    @Override  // io.realm.J1
    public String n5() {
        return this.d;
    }
}

