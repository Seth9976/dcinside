package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@AnyThread
@RequiresApi(19)
public final class MetadataRepo {
    @RestrictTo({Scope.a})
    static class Node {
        private final SparseArray a;
        private TypefaceEmojiRasterizer b;

        private Node() {
            this(1);
        }

        Node(int v) {
            this.a = new SparseArray(v);
        }

        Node a(int v) {
            return this.a == null ? null : ((Node)this.a.get(v));
        }

        final TypefaceEmojiRasterizer b() {
            return this.b;
        }

        void c(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer0, int v, int v1) {
            Node metadataRepo$Node0 = this.a(typefaceEmojiRasterizer0.b(v));
            if(metadataRepo$Node0 == null) {
                metadataRepo$Node0 = new Node();
                int v2 = typefaceEmojiRasterizer0.b(v);
                this.a.put(v2, metadataRepo$Node0);
            }
            if(v1 > v) {
                metadataRepo$Node0.c(typefaceEmojiRasterizer0, v + 1, v1);
                return;
            }
            metadataRepo$Node0.b = typefaceEmojiRasterizer0;
        }
    }

    @NonNull
    private final MetadataList a;
    @NonNull
    private final char[] b;
    @NonNull
    private final Node c;
    @NonNull
    private final Typeface d;
    private static final int e = 0x400;
    private static final String f = "EmojiCompat.MetadataRepo.create";

    private MetadataRepo(@NonNull Typeface typeface0, @NonNull MetadataList metadataList0) {
        this.d = typeface0;
        this.a = metadataList0;
        this.c = new Node(0x400);
        this.b = new char[metadataList0.K() * 2];
        this.a(metadataList0);
    }

    private void a(MetadataList metadataList0) {
        int v = metadataList0.K();
        for(int v1 = 0; v1 < v; ++v1) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer0 = new TypefaceEmojiRasterizer(this, v1);
            typefaceEmojiRasterizer0.g();
            this.k(typefaceEmojiRasterizer0);
        }
    }

    @NonNull
    public static MetadataRepo b(@NonNull AssetManager assetManager0, @NonNull String s) throws IOException {
        try {
            TraceCompat.b("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(Typeface.createFromAsset(assetManager0, s), MetadataListReader.b(assetManager0, s));
        }
        finally {
            TraceCompat.d();
        }
    }

    @NonNull
    @RestrictTo({Scope.e})
    public static MetadataRepo c(@NonNull Typeface typeface0) {
        try {
            TraceCompat.b("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(typeface0, new MetadataList());
        }
        finally {
            TraceCompat.d();
        }
    }

    @NonNull
    public static MetadataRepo d(@NonNull Typeface typeface0, @NonNull InputStream inputStream0) throws IOException {
        try {
            TraceCompat.b("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(typeface0, MetadataListReader.c(inputStream0));
        }
        finally {
            TraceCompat.d();
        }
    }

    @NonNull
    public static MetadataRepo e(@NonNull Typeface typeface0, @NonNull ByteBuffer byteBuffer0) throws IOException {
        try {
            TraceCompat.b("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(typeface0, MetadataListReader.d(byteBuffer0));
        }
        finally {
            TraceCompat.d();
        }
    }

    @NonNull
    @RestrictTo({Scope.a})
    public char[] f() {
        return this.b;
    }

    @NonNull
    @RestrictTo({Scope.a})
    public MetadataList g() {
        return this.a;
    }

    @RestrictTo({Scope.a})
    int h() {
        return this.a.S();
    }

    @NonNull
    @RestrictTo({Scope.a})
    Node i() {
        return this.c;
    }

    @NonNull
    @RestrictTo({Scope.a})
    Typeface j() {
        return this.d;
    }

    @RestrictTo({Scope.a})
    @VisibleForTesting
    void k(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer0) {
        Preconditions.m(typefaceEmojiRasterizer0, "emoji metadata cannot be null");
        Preconditions.b(typefaceEmojiRasterizer0.c() > 0, "invalid metadata codepoint length");
        int v = typefaceEmojiRasterizer0.c();
        this.c.c(typefaceEmojiRasterizer0, 0, v - 1);
    }
}

