package androidx.profileinstaller;

import androidx.annotation.NonNull;

class WritableFileSection {
    final FileSectionType a;
    final int b;
    final byte[] c;
    final boolean d;

    WritableFileSection(@NonNull FileSectionType fileSectionType0, int v, @NonNull byte[] arr_b, boolean z) {
        this.a = fileSectionType0;
        this.b = v;
        this.c = arr_b;
        this.d = z;
    }
}

