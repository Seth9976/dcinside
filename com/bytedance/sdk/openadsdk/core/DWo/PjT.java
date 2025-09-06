package com.bytedance.sdk.openadsdk.core.DWo;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.drawable.a;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.JQp.DWo;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.JQp.xE;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.XX;
import com.bytedance.sdk.openadsdk.SM.cr;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;
import jeb.synthetic.TWR;

public class PjT implements com.bytedance.adsdk.ugeno.PjT {
    public interface com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT {
        void PjT(Drawable arg1);
    }

    static class Zh implements xE {
        private final WeakReference PjT;
        private final int ReZ;
        private final PjT Zh;
        private final int cr;

        public Zh(ImageView imageView0, PjT pjT0, int v, int v1) {
            this.PjT = new WeakReference(imageView0);
            this.Zh = pjT0;
            this.ReZ = v;
            this.cr = v1;
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(int v, String s, Throwable throwable0) {
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(qj qj0) {
            try {
                ImageView imageView0 = (ImageView)this.PjT.get();
                if(imageView0 == null) {
                    return;
                }
                Object object0 = qj0.Zh();
                if(object0 instanceof byte[]) {
                    if(qj0.JQp()) {
                        if(Build.VERSION.SDK_INT <= 30) {
                            this.Zh.PjT(((byte[])object0), imageView0);
                            return;
                        }
                        this.Zh.PjT(imageView0, ((byte[])object0), this.ReZ, this.cr);
                        return;
                    }
                    if(this.Zh.PjT(((byte[])object0))) {
                        this.Zh.PjT(imageView0, ((byte[])object0), this.ReZ, this.cr);
                        return;
                    }
                    ImageView.ScaleType imageView$ScaleType0 = imageView0.getScaleType();
                    Bitmap bitmap0 = new com.bytedance.sdk.component.JQp.cr.ReZ.Zh.PjT(this.ReZ, this.cr, imageView$ScaleType0, Bitmap.Config.RGB_565, this.ReZ, this.cr).PjT(((byte[])object0));
                    if(bitmap0 != null) {
                        Jo.PjT(new Au("load_static_img") {
                            final Zh ReZ;

                            @Override
                            public void run() {
                                imageView0.setImageBitmap(bitmap0);
                            }
                        });
                    }
                    return;
                }
                if(object0 instanceof Bitmap) {
                    Jo.PjT(new Au("ug_load_bitmap") {
                        final Zh ReZ;

                        @Override
                        public void run() {
                            imageView0.setImageBitmap(((Bitmap)object0));
                        }
                    });
                }
                return;
            }
            catch(Throwable throwable0) {
            }
            RD.Zh("ImageLoaderProvider", throwable0.getMessage());
        }
    }

    private String PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return s;
        }
        if(!s.startsWith("http://") && !s.startsWith("https://")) {
            if(s.indexOf(46) < 0) {
                s = s + ".png";
            }
            return xs.Gr().ix() + "static/" + s;
        }
        return s;
    }

    private void PjT(ImageView imageView0, byte[] arr_b, int v, int v1) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        if(Build.VERSION.SDK_INT >= 28) {
            ImageDecoder.Source imageDecoder$Source0 = ImageDecoder.createSource(byteBuffer0);
            try {
                Drawable drawable0 = ImageDecoder.decodeDrawable(imageDecoder$Source0);
                if(drawable0 != null) {
                    Jo.PjT(new Au("loadAnimatedDrawable") {
                        final PjT ReZ;

                        @Override
                        public void run() {
                            imageView0.setImageDrawable(drawable0);
                        }
                    });
                    return;
                }
            }
            catch(IOException iOException0) {
                RD.Zh("ImageLoaderProvider", iOException0.getMessage());
            }
            return;
        }
        this.Zh(imageView0, arr_b, v, v1);
    }

    private void PjT(com.bytedance.adsdk.ugeno.core.Au au0, @NonNull DWo dWo0, String s) {
        if(au0 != null) {
            Map map0 = au0.Zh();
            if(map0 != null) {
                Object object0 = map0.get("image_info");
                if(object0 instanceof Map) {
                    dWo0.PjT(((String)((Map)object0).get(s)));
                }
                String s1 = (String)map0.get("cache_dir");
                if(!TextUtils.isEmpty(s1)) {
                    dWo0.Zh(s1);
                }
            }
        }
    }

    private void PjT(byte[] arr_b, ImageView imageView0) {
        try {
            this.PjT(arr_b, new com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT() {
                final PjT Zh;

                @Override  // com.bytedance.sdk.openadsdk.core.DWo.PjT$PjT
                public void PjT(Drawable drawable0) {
                    Jo.PjT(new Runnable() {
                        final com.bytedance.sdk.openadsdk.core.DWo.PjT.3 Zh;

                        @Override
                        public void run() {
                            if(Build.VERSION.SDK_INT >= 28 && a.a(drawable0)) {
                                ((AnimatedImageDrawable)drawable0).start();
                            }
                            com.bytedance.sdk.openadsdk.core.DWo.PjT.3.this.PjT.setImageDrawable(drawable0);
                        }
                    });
                }
            });
        }
        catch(Exception exception0) {
            RD.Zh("ImageLoaderProvider", exception0.getMessage());
        }
    }

    private void PjT(byte[] arr_b, com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT pjT$PjT0) {
        Jo.Zh(new Au("pag_animation_drawable") {
            final PjT ReZ;

            @Override
            public void run() {
                Drawable drawable0 = PjT.this.Zh(arr_b);
                com.bytedance.sdk.openadsdk.core.DWo.PjT.PjT pjT$PjT0 = pjT$PjT0;
                if(pjT$PjT0 != null) {
                    pjT$PjT0.PjT(drawable0);
                }
            }
        });
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT
    public void PjT(com.bytedance.adsdk.ugeno.core.Au au0, String s, ImageView imageView0, int v, int v1) {
        String s1 = this.PjT(s);
        DWo dWo0 = cr.PjT(s1).ReZ(1);
        this.PjT(au0, dWo0, s1);
        dWo0.PjT(new Zh(imageView0, this, v, v1), 4);
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT
    public void PjT(com.bytedance.adsdk.ugeno.core.Au au0, String s, com.bytedance.adsdk.ugeno.PjT.PjT pjT$PjT0) {
        this.Zh(au0, this.PjT(s), pjT$PjT0);
    }

    public boolean PjT(byte[] arr_b) {
        return com.bytedance.sdk.component.utils.qj.PjT(arr_b, 0);
    }

    private Drawable Zh(byte[] arr_b) {
        Drawable drawable1;
        FileOutputStream fileOutputStream0;
        try {
            boolean z = com.bytedance.sdk.openadsdk.multipro.Zh.ReZ();
            File file0 = XX.PjT(ub.PjT(), z, (z ? "UGEN_GIF_AD_CACHE/" : "/UGEN_GIF_CACHE/"), "TT_UGEN_GIF_FILE");
            fileOutputStream0 = null;
            fileOutputStream0 = new FileOutputStream(file0);
            fileOutputStream0.write(arr_b, 0, arr_b.length);
            if(Build.VERSION.SDK_INT >= 28) {
                Drawable drawable0 = ImageDecoder.decodeDrawable(ImageDecoder.createSource(file0));
                try {
                    fileOutputStream0.close();
                }
                catch(Throwable unused_ex) {
                }
                return drawable0;
            }
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
            drawable1 = new BitmapDrawable(ub.PjT().getResources(), bitmap0);
        }
        catch(Throwable throwable0) {
            try {
                RD.PjT("ImageLoaderProvider", "GifView  getSourceByFile fail : ", throwable0);
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(fileOutputStream0, throwable1);
                throw throwable1;
            }
            if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.close();
                }
                catch(Throwable unused_ex) {
                }
            }
            return null;
        }
        try {
            fileOutputStream0.close();
        }
        catch(Throwable unused_ex) {
        }
        return drawable1;
    }

    private void Zh(ImageView imageView0, byte[] arr_b, int v, int v1) {
        Bitmap bitmap0 = new com.bytedance.sdk.component.JQp.cr.ReZ.Zh.PjT(v, v1, imageView0.getScaleType(), Bitmap.Config.ARGB_4444, v, v1).PjT(arr_b);
        if(bitmap0 != null) {
            Jo.PjT(new Au("loadStaticImage") {
                final PjT ReZ;

                @Override
                public void run() {
                    imageView0.setImageBitmap(bitmap0);
                }
            });
        }
    }

    public void Zh(com.bytedance.adsdk.ugeno.core.Au au0, String s, com.bytedance.adsdk.ugeno.PjT.PjT pjT$PjT0) {
        DWo dWo0 = cr.PjT(s).ReZ(2);
        this.PjT(au0, dWo0, s);
        dWo0.PjT(new xE() {
            final PjT Zh;

            @Override  // com.bytedance.sdk.component.JQp.xE
            public void PjT(int v, String s, Throwable throwable0) {
                com.bytedance.adsdk.ugeno.PjT.PjT pjT$PjT0 = pjT$PjT0;
                if(pjT$PjT0 != null) {
                    pjT$PjT0.PjT(null);
                }
            }

            @Override  // com.bytedance.sdk.component.JQp.xE
            public void PjT(qj qj0) {
                if(qj0 == null) {
                    pjT$PjT0.PjT(null);
                    return;
                }
                if(pjT$PjT0 != null) {
                    Object object0 = qj0.Zh();
                    if(object0 instanceof Bitmap) {
                        pjT$PjT0.PjT(((Bitmap)object0));
                        return;
                    }
                    if(qj0.Zh() instanceof byte[]) {
                        try {
                            Bitmap bitmap0 = BitmapFactory.decodeByteArray(((byte[])qj0.Zh()), 0, ((byte[])qj0.Zh()).length);
                            pjT$PjT0.PjT(bitmap0);
                            return;
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                    pjT$PjT0.PjT(null);
                }
            }
        }, 4);
    }
}

