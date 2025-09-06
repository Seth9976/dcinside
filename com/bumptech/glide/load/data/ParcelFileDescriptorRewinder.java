package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements e {
    @RequiresApi(21)
    static final class InternalRewinder {
        private final ParcelFileDescriptor a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor0) {
            this.a = parcelFileDescriptor0;
        }

        ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.a;
            }
            catch(ErrnoException errnoException0) {
                throw new IOException(errnoException0);
            }
        }
    }

    @RequiresApi(21)
    public static final class a implements com.bumptech.glide.load.data.e.a {
        @Override  // com.bumptech.glide.load.data.e$a
        @NonNull
        public Class a() {
            return ParcelFileDescriptor.class;
        }

        @Override  // com.bumptech.glide.load.data.e$a
        @NonNull
        public e b(@NonNull Object object0) {
            return this.c(((ParcelFileDescriptor)object0));
        }

        @NonNull
        public e c(@NonNull ParcelFileDescriptor parcelFileDescriptor0) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor0);
        }
    }

    private final InternalRewinder a;

    @RequiresApi(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor0) {
        this.a = new InternalRewinder(parcelFileDescriptor0);
    }

    @Override  // com.bumptech.glide.load.data.e
    @NonNull
    @RequiresApi(21)
    public Object a() throws IOException {
        return this.d();
    }

    @Override  // com.bumptech.glide.load.data.e
    public void b() {
    }

    // 去混淆评级： 低(30)
    public static boolean c() [...] // 潜在的解密器

    @NonNull
    @RequiresApi(21)
    public ParcelFileDescriptor d() throws IOException {
        return this.a.rewind();
    }
}

