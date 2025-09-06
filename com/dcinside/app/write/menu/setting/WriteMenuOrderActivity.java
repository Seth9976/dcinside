package com.dcinside.app.write.menu.setting;

import Y.H0;
import Z.c;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dcinside.app.base.d;
import com.dcinside.app.util.dl;
import com.dcinside.app.write.menu.MenuVisible;
import com.dcinside.app.write.menu.b;
import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nWriteMenuOrderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteMenuOrderActivity.kt\ncom/dcinside/app/write/menu/setting/WriteMenuOrderActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1557#2:99\n1628#2,3:100\n1557#2:103\n1628#2,3:104\n774#2:107\n865#2,2:108\n*S KotlinDebug\n*F\n+ 1 WriteMenuOrderActivity.kt\ncom/dcinside/app/write/menu/setting/WriteMenuOrderActivity\n*L\n64#1:99\n64#1:100,3\n75#1:103\n75#1:104,3\n79#1:107\n79#1:108,2\n*E\n"})
public final class WriteMenuOrderActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0, @m MenuVisible menuVisible0) {
            L.p(appCompatActivity0, "activity");
            Intent intent0 = new Intent(appCompatActivity0, WriteMenuOrderActivity.class);
            intent0.putExtra("com.dcinside.app.EXTRA_MENU_INFO", menuVisible0);
            appCompatActivity0.startActivityForResult(intent0, 1040);
        }
    }

    private H0 u;
    @l
    private final J v;
    @m
    private ItemTouchHelper w;
    @l
    public static final a x = null;
    @l
    private static final String y = "com.dcinside.app.EXTRA_MENU_INFO";
    @l
    private static final String z = "com.dcinside.app.EXTRA_ORDER_COMPLETE";

    static {
        WriteMenuOrderActivity.x = new a(null);
    }

    public WriteMenuOrderActivity() {
        this.v = new J();
    }

    @m
    public final ItemTouchHelper E1() {
        return this.w;
    }

    private final void F1() {
        Iterable iterable0 = this.v.w();
        ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(((b)object0).f());
        }
        ArrayList arrayList1 = new ArrayList();
        arrayList1.addAll(arrayList0);
        dl.a.i5(arrayList1);
        Intent intent0 = new Intent();
        intent0.putExtra("com.dcinside.app.EXTRA_ORDER_COMPLETE", true);
        this.setResult(-1, intent0);
    }

    public final void G1(@m ItemTouchHelper itemTouchHelper0) {
        this.w = itemTouchHelper0;
    }

    private final void H1() {
        ArrayList arrayList1;
        ArrayList arrayList0 = dl.a.s1();
        if(arrayList0 == null) {
            ArrayList arrayList2 = new ArrayList();
            u.s0(arrayList2, b.values());
            arrayList1 = new ArrayList();
            for(Object object1: arrayList2) {
                if(((b)object1) != b.t) {
                    arrayList1.add(object1);
                }
            }
        }
        else {
            arrayList1 = new ArrayList(u.b0(arrayList0, 10));
            for(Object object0: arrayList0) {
                arrayList1.add(b.e.b(((Number)object0).intValue()));
            }
        }
        this.v.A(arrayList1);
    }

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        this.F1();
        super.onBackPressed();
        this.w = null;
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        H0 h00 = H0.c(this.getLayoutInflater());
        L.o(h00, "inflate(...)");
        this.u = h00;
        H0 h01 = null;
        if(h00 == null) {
            L.S("binding");
            h00 = null;
        }
        this.setContentView(h00.b());
        H0 h02 = this.u;
        if(h02 == null) {
            L.S("binding");
            h02 = null;
        }
        this.S0(h02.c);
        kr.bhbfhfb.designcompat.a.d(this);
        MenuVisible menuVisible0 = (MenuVisible)this.getIntent().getParcelableExtra("com.dcinside.app.EXTRA_MENU_INFO");
        this.v.B(menuVisible0);
        H0 h03 = this.u;
        if(h03 == null) {
            L.S("binding");
            h03 = null;
        }
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(h03.b.getContext());
        h03.b.setLayoutManager(linearLayoutManager0);
        h03.b.setAdapter(this.v);
        com.dcinside.app.util.ql.b.d(h03.b);
        ItemTouchHelper itemTouchHelper0 = new ItemTouchHelper(new c(this.v, false));
        this.w = itemTouchHelper0;
        H0 h04 = this.u;
        if(h04 == null) {
            L.S("binding");
        }
        else {
            h01 = h04;
        }
        itemTouchHelper0.m(h01.b);
        this.H1();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

