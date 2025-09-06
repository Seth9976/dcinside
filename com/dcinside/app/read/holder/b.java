package com.dcinside.app.read.holder;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.read.x;
import com.dcinside.app.wv.VideoEnabledWebView;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nContentHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentHolder.kt\ncom/dcinside/app/read/holder/ContentHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,19:1\n1#2:20\n25#3:21\n*S KotlinDebug\n*F\n+ 1 ContentHolder.kt\ncom/dcinside/app/read/holder/ContentHolder\n*L\n16#1:21\n*E\n"})
public class b extends ViewHolder {
    @m
    private final VideoEnabledWebView a;

    @j
    public b(@l View view0) {
        L.p(view0, "itemView");
        this(view0, null, 2, null);
    }

    @j
    public b(@l View view0, @m VideoEnabledWebView videoEnabledWebView0) {
        L.p(view0, "itemView");
        super(view0);
        this.a = videoEnabledWebView0;
    }

    public b(View view0, VideoEnabledWebView videoEnabledWebView0, int v, w w0) {
        if((v & 2) != 0) {
            videoEnabledWebView0 = null;
        }
        this(view0, videoEnabledWebView0);
    }

    @m
    public final x e() {
        Integer integer0 = this.getBindingAdapterPosition();
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            ViewParent viewParent0 = this.itemView.getParent();
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 != null) {
                Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
                if(recyclerView$Adapter0 instanceof x) {
                    return recyclerView$Adapter0;
                }
            }
        }
        return null;
    }

    @m
    public final VideoEnabledWebView f() {
        return this.a;
    }
}

