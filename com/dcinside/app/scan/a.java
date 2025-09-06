package com.dcinside.app.scan;

import android.content.Intent;
import android.net.Uri;
import com.dcinside.app.Application;
import java.io.File;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class a {
    public static final class com.dcinside.app.scan.a.a {
        private com.dcinside.app.scan.a.a() {
        }

        public com.dcinside.app.scan.a.a(w w0) {
        }

        public final void a(@m String s) {
            @f(c = "com.dcinside.app.scan.FileScanner$Companion$scan$1", f = "FileScanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class com.dcinside.app.scan.a.a.a extends o implements A3.o {
                int k;
                final File l;

                com.dcinside.app.scan.a.a.a(File file0, d d0) {
                    this.l = file0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new com.dcinside.app.scan.a.a.a(this.l, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((com.dcinside.app.scan.a.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    Intent intent0 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(this.l));
                    Application.e.c().sendBroadcast(intent0);
                    return S0.a;
                }
            }

            if(s == null) {
                return;
            }
            com.dcinside.app.scan.a.a.a a$a$a0 = new com.dcinside.app.scan.a.a.a(new File(s), null);
            k.f(() -> i.a, null, null, a$a$a0, 3, null);
        }
    }

    @l
    public static final com.dcinside.app.scan.a.a a;

    static {
        a.a = new com.dcinside.app.scan.a.a(null);
    }
}

