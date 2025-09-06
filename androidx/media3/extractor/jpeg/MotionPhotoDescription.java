package androidx.media3.extractor.jpeg;

import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import java.util.List;

final class MotionPhotoDescription {
    public static final class ContainerItem {
        public final String a;
        public final String b;
        public final long c;
        public final long d;

        public ContainerItem(String s, String s1, long v, long v1) {
            this.a = s;
            this.b = s1;
            this.c = v;
            this.d = v1;
        }
    }

    public final long a;
    public final List b;

    public MotionPhotoDescription(long v, List list0) {
        this.a = v;
        this.b = list0;
    }

    @Nullable
    public MotionPhotoMetadata a(long v) {
        long v8;
        if(this.b.size() < 2) {
            return null;
        }
        int v1 = this.b.size() - 1;
        long v2 = v;
        long v3 = -1L;
        long v4 = -1L;
        long v5 = -1L;
        long v6 = -1L;
        boolean z = false;
        while(v1 >= 0) {
            ContainerItem motionPhotoDescription$ContainerItem0 = (ContainerItem)this.b.get(v1);
            int v7 = "video/mp4".equals(motionPhotoDescription$ContainerItem0.a) | z;
            if(v1 == 0) {
                v2 -= motionPhotoDescription$ContainerItem0.d;
                v8 = 0L;
            }
            else {
                v8 = v2 - motionPhotoDescription$ContainerItem0.c;
            }
            long v9 = v2;
            v2 = v8;
            long v10 = v9;
            if(v7 == 0 || v2 == v10) {
                z = v7;
            }
            else {
                v6 = v10 - v2;
                v5 = v2;
                z = false;
            }
            if(v1 == 0) {
                v3 = v2;
                v4 = v10;
            }
            --v1;
        }
        return v5 == -1L || v6 == -1L || v3 == -1L || v4 == -1L ? null : new MotionPhotoMetadata(v3, v4, this.a, v5, v6);
    }
}

