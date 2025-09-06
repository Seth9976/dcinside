package androidx.media3.extractor.metadata.id3;

import O1.l;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O2;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR;
    @Nullable
    public final String b;
    @Deprecated
    public final String c;
    public final O2 d;

    static {
        TextInformationFrame.CREATOR = new Parcelable.Creator() {
            public TextInformationFrame a(Parcel parcel0) {
                return new TextInformationFrame(parcel0, null);
            }

            public TextInformationFrame[] b(int v) {
                return new TextInformationFrame[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        };
    }

    private TextInformationFrame(Parcel parcel0) {
        this(((String)Assertions.g(parcel0.readString())), parcel0.readString(), O2.x(((String[])Assertions.g(parcel0.createStringArray()))));
    }

    TextInformationFrame(Parcel parcel0, androidx.media3.extractor.metadata.id3.TextInformationFrame.1 textInformationFrame$10) {
        this(parcel0);
    }

    @l(imports = {"com.google.common.collect.ImmutableList"}, replacement = "this(id, description, ImmutableList.of(value))")
    @Deprecated
    public TextInformationFrame(String s, @Nullable String s1, String s2) {
        this(s, s1, O2.B(s2));
    }

    public TextInformationFrame(String s, @Nullable String s1, List list0) {
        super(s);
        Assertions.a(!list0.isEmpty());
        this.b = s1;
        O2 o20 = O2.r(list0);
        this.d = o20;
        this.c = (String)o20.get(0);
    }

    private static List a(String s) {
        List list0 = new ArrayList();
        try {
            if(s.length() >= 10) {
                list0.add(Integer.parseInt(s.substring(0, 4)));
                list0.add(Integer.parseInt(s.substring(5, 7)));
                list0.add(Integer.parseInt(s.substring(8, 10)));
                return list0;
            }
            if(s.length() >= 7) {
                list0.add(Integer.parseInt(s.substring(0, 4)));
                list0.add(Integer.parseInt(s.substring(5, 7)));
                return list0;
            }
            if(s.length() >= 4) {
                list0.add(Integer.parseInt(s.substring(0, 4)));
            }
            return list0;
        }
        catch(NumberFormatException unused_ex) {
            return new ArrayList();
        }
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return TextInformationFrame.class == class0 && (Util.g(this.a, ((TextInformationFrame)object0).a) && Util.g(this.b, ((TextInformationFrame)object0).b) && this.d.equals(((TextInformationFrame)object0).d));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? (v + 0x20F) * 961 + this.d.hashCode() : ((v + 0x20F) * 0x1F + this.b.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override  // androidx.media3.extractor.metadata.id3.Id3Frame
    public void r3(Builder mediaMetadata$Builder0) {
        this.a.hashCode();
        switch(this.a) {
            case "TAL": 
            case "TALB": {
                mediaMetadata$Builder0.O(((CharSequence)this.d.get(0)));
                return;
            }
            case "TCM": 
            case "TCOM": {
                mediaMetadata$Builder0.U(((CharSequence)this.d.get(0)));
                return;
            }
            case "TCON": {
                Integer integer1 = com.google.common.primitives.l.F(((String)this.d.get(0)));
                if(integer1 == null) {
                    mediaMetadata$Builder0.c0(((CharSequence)this.d.get(0)));
                    return;
                }
                String s1 = Id3Util.a(((int)integer1));
                if(s1 != null) {
                    mediaMetadata$Builder0.c0(s1);
                    return;
                }
                return;
            }
            case "TDA": 
            case "TDAT": {
                try {
                    String s = (String)this.d.get(0);
                    int v = Integer.parseInt(s.substring(2, 4));
                    int v1 = Integer.parseInt(s.substring(0, 2));
                    mediaMetadata$Builder0.i0(v).h0(v1);
                }
                catch(NumberFormatException | StringIndexOutOfBoundsException unused_ex) {
                }
                return;
            }
            case "TDRC": {
                List list0 = TextInformationFrame.a(((String)this.d.get(0)));
                switch(list0.size()) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        mediaMetadata$Builder0.i0(((Integer)list0.get(1)));
                        break;
                    }
                    case 3: {
                        mediaMetadata$Builder0.h0(((Integer)list0.get(2)));
                        mediaMetadata$Builder0.i0(((Integer)list0.get(1)));
                        break;
                    }
                    default: {
                        return;
                    }
                }
                mediaMetadata$Builder0.j0(((Integer)list0.get(0)));
                return;
            }
            case "TDRL": {
                List list1 = TextInformationFrame.a(((String)this.d.get(0)));
                switch(list1.size()) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        mediaMetadata$Builder0.l0(((Integer)list1.get(1)));
                        break;
                    }
                    case 3: {
                        mediaMetadata$Builder0.k0(((Integer)list1.get(2)));
                        mediaMetadata$Builder0.l0(((Integer)list1.get(1)));
                        break;
                    }
                    default: {
                        return;
                    }
                }
                mediaMetadata$Builder0.m0(((Integer)list1.get(0)));
                return;
            }
            case "TEXT": 
            case "TXT": {
                mediaMetadata$Builder0.u0(((CharSequence)this.d.get(0)));
                return;
            }
            case "TIT2": 
            case "TT2": {
                mediaMetadata$Builder0.p0(((CharSequence)this.d.get(0)));
                return;
            }
            case "TP1": 
            case "TPE1": {
                mediaMetadata$Builder0.P(((CharSequence)this.d.get(0)));
                return;
            }
            case "TPE2": 
            case "TP2": {
                mediaMetadata$Builder0.N(((CharSequence)this.d.get(0)));
                return;
            }
            case "TP3": 
            case "TPE3": {
                mediaMetadata$Builder0.V(((CharSequence)this.d.get(0)));
                return;
            }
            case "TRCK": 
            case "TRK": {
                String[] arr_s = Util.m2(((String)this.d.get(0)), "/");
                try {
                    int v2 = Integer.parseInt(arr_s[0]);
                    Integer integer0 = arr_s.length <= 1 ? null : Integer.parseInt(arr_s[1]);
                    mediaMetadata$Builder0.s0(v2).r0(integer0);
                }
                catch(NumberFormatException unused_ex) {
                }
                return;
            }
            case "TYE": 
            case "TYER": {
                try {
                    mediaMetadata$Builder0.j0(Integer.parseInt(((String)this.d.get(0))));
                }
                catch(NumberFormatException unused_ex) {
                }
            }
        }
    }

    @Override  // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.d;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeStringArray(((String[])this.d.toArray(new String[0])));
    }
}

