package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;

public final class j6 implements ViewBinding {
    @NonNull
    private final NativeAdView a;
    @NonNull
    public final TextView b;
    @NonNull
    public final View c;
    @NonNull
    public final ConstraintLayout d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final MediaView g;
    @NonNull
    public final TextView h;
    @NonNull
    public final View i;

    private j6(@NonNull NativeAdView nativeAdView0, @NonNull TextView textView0, @NonNull View view0, @NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull MediaView mediaView0, @NonNull TextView textView3, @NonNull View view1) {
        this.a = nativeAdView0;
        this.b = textView0;
        this.c = view0;
        this.d = constraintLayout0;
        this.e = textView1;
        this.f = textView2;
        this.g = mediaView0;
        this.h = textView3;
        this.i = view1;
    }

    @NonNull
    public static j6 a(@NonNull View view0) {
        int v = 0x7F0B0A77;  // id:post_list_item_native_action
        View view1 = ViewBindings.a(view0, 0x7F0B0A77);  // id:post_list_item_native_action
        if(((TextView)view1) != null) {
            v = 0x7F0B0A78;  // id:post_list_item_native_bottom
            View view2 = ViewBindings.a(view0, 0x7F0B0A78);  // id:post_list_item_native_bottom
            if(view2 != null) {
                v = 0x7F0B0A79;  // id:post_list_item_native_content
                View view3 = ViewBindings.a(view0, 0x7F0B0A79);  // id:post_list_item_native_content
                if(((ConstraintLayout)view3) != null) {
                    v = 0x7F0B0A7A;  // id:post_list_item_native_desc
                    View view4 = ViewBindings.a(view0, 0x7F0B0A7A);  // id:post_list_item_native_desc
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0A7B;  // id:post_list_item_native_hint
                        View view5 = ViewBindings.a(view0, 0x7F0B0A7B);  // id:post_list_item_native_hint
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0A7C;  // id:post_list_item_native_media
                            View view6 = ViewBindings.a(view0, 0x7F0B0A7C);  // id:post_list_item_native_media
                            if(((MediaView)view6) != null) {
                                v = 0x7F0B0A7D;  // id:post_list_item_native_title
                                View view7 = ViewBindings.a(view0, 0x7F0B0A7D);  // id:post_list_item_native_title
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B0A7E;  // id:post_list_item_native_top
                                    View view8 = ViewBindings.a(view0, 0x7F0B0A7E);  // id:post_list_item_native_top
                                    if(view8 != null) {
                                        return new j6(((NativeAdView)view0), ((TextView)view1), view2, ((ConstraintLayout)view3), ((TextView)view4), ((TextView)view5), ((MediaView)view6), ((TextView)view7), view8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public NativeAdView b() {
        return this.a;
    }

    @NonNull
    public static j6 c(@NonNull LayoutInflater layoutInflater0) {
        return j6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static j6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E022D, viewGroup0, false);  // layout:view_post_list_item_ad_native_admob
        if(z) {
            viewGroup0.addView(view0);
        }
        return j6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

