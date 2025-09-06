package com.dcinside.app.post;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dcinside.app.response.PostItem;

public final class SearchItem implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public SearchItem a(Parcel parcel0) {
            return new SearchItem(parcel0);
        }

        public SearchItem[] b(int v) {
            return new SearchItem[v];
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

    public static final Parcelable.Creator CREATOR;
    @Nullable
    private final PostItem a;
    private final int b;
    private final int c;

    static {
        SearchItem.CREATOR = new a();
    }

    public SearchItem(int v) {
        this.a = null;
        this.b = v;
        this.c = 0;
    }

    public SearchItem(int v, int v1) {
        this.a = null;
        this.b = v;
        this.c = v1;
    }

    protected SearchItem(Parcel parcel0) {
        this.a = (PostItem)parcel0.readParcelable(PostItem.class.getClassLoader());
        this.b = parcel0.readInt();
        this.c = parcel0.readInt();
    }

    public SearchItem(@NonNull PostItem postItem0, int v) {
        this.a = postItem0;
        this.b = v;
        this.c = 0;
    }

    public int a() {
        return this.c;
    }

    @Nullable
    public PostItem c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.a, v);
        parcel0.writeInt(this.b);
        parcel0.writeInt(this.c);
    }
}

