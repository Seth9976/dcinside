package com.dcinside.app.image;

import android.database.Cursor;
import android.net.Uri;
import com.dcinside.app.internal.t;
import java.io.File;
import kotlin.V;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;
import y4.m;

@s0({"SMAP\nImageViewerItemWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewerItemWrapper.kt\ncom/dcinside/app/image/ImageViewerCursorItemWrapper\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n147#2:67\n36#3:68\n1#4:69\n*S KotlinDebug\n*F\n+ 1 ImageViewerItemWrapper.kt\ncom/dcinside/app/image/ImageViewerCursorItemWrapper\n*L\n33#1:67\n48#1:68\n*E\n"})
public final class b0 implements d0 {
    private final int a;
    @l
    private final t b;
    @m
    private String c;

    public b0(@m Cursor cursor0, int v) {
        this.a = v;
        this.b = new t(cursor0);
    }

    @Override  // com.dcinside.app.image.d0
    @l
    public V a() {
        return r0.a(this.c(), this.b(false));
    }

    @Override  // com.dcinside.app.image.d0
    @m
    public String b(boolean z) {
        String s = this.c;
        if(s == null) {
            String s1 = this.c();
            s = s1 == null ? null : Uri.fromFile(new File(s1)).toString();
            this.c = s == null ? "" : s;
            return s;
        }
        return s.length() > 0 ? s : null;
    }

    private final String c() {
        Cursor cursor0 = (Cursor)this.b.a();
        if(cursor0 != null) {
            if(cursor0.isClosed()) {
                cursor0 = null;
            }
            return cursor0 == null || !cursor0.moveToPosition(this.a) ? null : cursor0.getString(1);
        }
        return null;
    }
}

