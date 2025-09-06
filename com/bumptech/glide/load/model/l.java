package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.signature.e;
import java.io.File;
import java.io.FileNotFoundException;
import jeb.synthetic.TWR;

public final class l implements o {
    public static final class a implements p {
        private final Context a;

        public a(Context context0) {
            this.a = context0;
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(s s0) {
            return new l(this.a);
        }
    }

    static class b implements d {
        private final Context a;
        private final Uri b;
        private static final String[] c;

        static {
            b.c = new String[]{"_data"};
        }

        b(Context context0, Uri uri0) {
            this.a = context0;
            this.b = uri0;
        }

        @Override  // com.bumptech.glide.load.data.d
        @NonNull
        public Class a() {
            return File.class;
        }

        @Override  // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override  // com.bumptech.glide.load.data.d
        @NonNull
        public com.bumptech.glide.load.a c() {
            return com.bumptech.glide.load.a.a;
        }

        @Override  // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override  // com.bumptech.glide.load.data.d
        public void d(@NonNull j j0, @NonNull com.bumptech.glide.load.data.d.a d$a0) {
            Cursor cursor0 = this.a.getContentResolver().query(this.b, b.c, null, null, null);
            CharSequence charSequence0 = null;
            if(cursor0 != null) {
                try {
                    if(cursor0.moveToFirst()) {
                        charSequence0 = cursor0.getString(cursor0.getColumnIndexOrThrow("_data"));
                    }
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
                cursor0.close();
            }
            if(TextUtils.isEmpty(charSequence0)) {
                d$a0.f(new FileNotFoundException("Failed to find file path for: " + this.b));
                return;
            }
            d$a0.e(new File(((String)charSequence0)));
        }
    }

    private final Context a;

    public l(Context context0) {
        this.a = context0;
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull com.bumptech.glide.load.j j0) {
        return this.c(((Uri)object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.d(((Uri)object0));
    }

    public com.bumptech.glide.load.model.o.a c(@NonNull Uri uri0, int v, int v1, @NonNull com.bumptech.glide.load.j j0) {
        return new com.bumptech.glide.load.model.o.a(new e(uri0), new b(this.a, uri0));
    }

    public boolean d(@NonNull Uri uri0) {
        return com.bumptech.glide.load.data.mediastore.b.c(uri0);
    }
}

