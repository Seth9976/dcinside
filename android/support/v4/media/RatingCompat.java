package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public RatingCompat a(Parcel parcel0) {
            return new RatingCompat(parcel0.readInt(), parcel0.readFloat());
        }

        public RatingCompat[] b(int v) {
            return new RatingCompat[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    @RequiresApi(19)
    static class b {
        @DoNotInline
        static float a(Rating rating0) {
            return rating0.getPercentRating();
        }

        @DoNotInline
        static int b(Rating rating0) {
            return rating0.getRatingStyle();
        }

        @DoNotInline
        static float c(Rating rating0) {
            return rating0.getStarRating();
        }

        @DoNotInline
        static boolean d(Rating rating0) {
            return rating0.hasHeart();
        }

        @DoNotInline
        static boolean e(Rating rating0) {
            return rating0.isRated();
        }

        @DoNotInline
        static boolean f(Rating rating0) {
            return rating0.isThumbUp();
        }

        @DoNotInline
        static Rating g(boolean z) {
            return Rating.newHeartRating(z);
        }

        @DoNotInline
        static Rating h(float f) {
            return Rating.newPercentageRating(f);
        }

        @DoNotInline
        static Rating i(int v, float f) {
            return Rating.newStarRating(v, f);
        }

        @DoNotInline
        static Rating j(boolean z) {
            return Rating.newThumbRating(z);
        }

        @DoNotInline
        static Rating k(int v) {
            return Rating.newUnratedRating(v);
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public static final Parcelable.Creator CREATOR = null;
    private final int a;
    private final float b;
    private Object c;
    private static final String d = "Rating";
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 6;
    private static final float l = -1.0f;

    static {
        RatingCompat.CREATOR = new a();
    }

    RatingCompat(int v, float f) {
        this.a = v;
        this.b = f;
    }

    public static RatingCompat a(Object object0) {
        RatingCompat ratingCompat0 = null;
        if(object0 != null) {
            int v = b.b(((Rating)object0));
            if(b.e(((Rating)object0))) {
                switch(v) {
                    case 1: {
                        ratingCompat0 = RatingCompat.l(b.d(((Rating)object0)));
                        break;
                    }
                    case 2: {
                        ratingCompat0 = RatingCompat.q(b.f(((Rating)object0)));
                        break;
                    }
                    case 3: 
                    case 4: 
                    case 5: {
                        ratingCompat0 = RatingCompat.o(v, b.c(((Rating)object0)));
                        break;
                    }
                    case 6: {
                        ratingCompat0 = RatingCompat.m(b.a(((Rating)object0)));
                        break;
                    }
                    default: {
                        return null;
                    }
                }
            }
            else {
                ratingCompat0 = RatingCompat.r(v);
            }
            ratingCompat0.c = object0;
        }
        return ratingCompat0;
    }

    public float c() {
        return this.a != 6 || !this.h() ? -1.0f : this.b;
    }

    public Object d() {
        if(this.c == null) {
            if(this.h()) {
                int v = this.a;
                switch(v) {
                    case 1: {
                        this.c = b.g(this.g());
                        return this.c;
                    }
                    case 2: {
                        this.c = b.j(this.i());
                        return this.c;
                    }
                    case 3: 
                    case 4: 
                    case 5: {
                        this.c = b.i(v, this.f());
                        return this.c;
                    }
                    case 6: {
                        this.c = b.h(this.c());
                        return this.c;
                    }
                    default: {
                        return null;
                    }
                }
            }
            this.c = b.k(this.a);
        }
        return this.c;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return this.a;
    }

    public int e() {
        return this.a;
    }

    public float f() {
        return this.a != 3 && this.a != 4 && this.a != 5 || !this.h() ? -1.0f : this.b;
    }

    public boolean g() {
        return this.a == 1 ? this.b == 1.0f : false;
    }

    public boolean h() {
        return this.b >= 0.0f;
    }

    public boolean i() {
        return this.a == 2 ? this.b == 1.0f : false;
    }

    // 去混淆评级： 低(20)
    public static RatingCompat l(boolean z) {
        return z ? new RatingCompat(1, 1.0f) : new RatingCompat(1, 0.0f);
    }

    public static RatingCompat m(float f) {
        if(f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat o(int v, float f) {
        float f1;
        switch(v) {
            case 3: {
                f1 = 3.0f;
                break;
            }
            case 4: {
                f1 = 4.0f;
                break;
            }
            case 5: {
                f1 = 5.0f;
                break;
            }
            default: {
                Log.e("Rating", "Invalid rating style (" + v + ") for a star rating");
                return null;
            }
        }
        if(f >= 0.0f && f <= f1) {
            return new RatingCompat(v, f);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    // 去混淆评级： 低(20)
    public static RatingCompat q(boolean z) {
        return z ? new RatingCompat(2, 1.0f) : new RatingCompat(2, 0.0f);
    }

    public static RatingCompat r(int v) {
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                return new RatingCompat(v, -1.0f);
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public String toString() {
        return "Rating:style=" + this.a + " rating=" + (this.b < 0.0f ? "unrated" : String.valueOf(this.b));
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
        parcel0.writeFloat(this.b);
    }
}

