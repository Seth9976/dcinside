package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;

public class Utf8Old extends Utf8 {
    static class Cache {
        final CharsetEncoder a;
        final CharsetDecoder b;
        CharSequence c;
        ByteBuffer d;

        Cache() {
            this.c = null;
            this.d = null;
            Charset charset0 = StandardCharsets.UTF_8;
            this.a = charset0.newEncoder();
            this.b = charset0.newDecoder();
        }
    }

    private static final ThreadLocal b;

    static {
        Utf8Old.b = new b(() -> new Cache());
    }

    @Override  // androidx.emoji2.text.flatbuffer.Utf8
    public String a(ByteBuffer byteBuffer0, int v, int v1) {
        CharsetDecoder charsetDecoder0 = ((Cache)Utf8Old.b.get()).b;
        charsetDecoder0.reset();
        ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
        byteBuffer1.position(v);
        byteBuffer1.limit(v + v1);
        try {
            return charsetDecoder0.decode(byteBuffer1).toString();
        }
        catch(CharacterCodingException characterCodingException0) {
            throw new IllegalArgumentException("Bad encoding", characterCodingException0);
        }
    }

    @Override  // androidx.emoji2.text.flatbuffer.Utf8
    public void b(CharSequence charSequence0, ByteBuffer byteBuffer0) {
        Cache utf8Old$Cache0 = (Cache)Utf8Old.b.get();
        if(utf8Old$Cache0.c != charSequence0) {
            this.c(charSequence0);
        }
        byteBuffer0.put(utf8Old$Cache0.d);
    }

    @Override  // androidx.emoji2.text.flatbuffer.Utf8
    public int c(CharSequence charSequence0) {
        Cache utf8Old$Cache0 = (Cache)Utf8Old.b.get();
        int v = (int)(((float)charSequence0.length()) * utf8Old$Cache0.a.maxBytesPerChar());
        if(utf8Old$Cache0.d == null || utf8Old$Cache0.d.capacity() < v) {
            utf8Old$Cache0.d = ByteBuffer.allocate(Math.max(0x80, v));
        }
        utf8Old$Cache0.d.clear();
        utf8Old$Cache0.c = charSequence0;
        CharBuffer charBuffer0 = charSequence0 instanceof CharBuffer ? ((CharBuffer)charSequence0) : CharBuffer.wrap(charSequence0);
        CoderResult coderResult0 = utf8Old$Cache0.a.encode(charBuffer0, utf8Old$Cache0.d, true);
        if(coderResult0.isError()) {
            try {
                coderResult0.throwException();
            }
            catch(CharacterCodingException characterCodingException0) {
                throw new IllegalArgumentException("bad character encoding", characterCodingException0);
            }
        }
        utf8Old$Cache0.d.flip();
        return utf8Old$Cache0.d.remaining();
    }

    // 检测为 Lambda 实现
    private static Cache g() [...]
}

