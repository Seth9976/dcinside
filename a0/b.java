package A0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import java.io.FileDescriptor;
import java.io.InputStream;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public interface b {
    public interface A0.b.a {
        void a(String arg1, @h String arg2);
    }

    void a(A0.a arg1);

    @h
    Bitmap b(InputStream arg1, @h Rect arg2, @h BitmapFactory.Options arg3);

    @h
    Bitmap c(String arg1, @h BitmapFactory.Options arg2);

    void d(A0.b.a arg1);

    @h
    Bitmap e(FileDescriptor arg1, @h Rect arg2, @h BitmapFactory.Options arg3);

    @h
    Bitmap f(byte[] arg1, int arg2, int arg3, @h BitmapFactory.Options arg4);
}

