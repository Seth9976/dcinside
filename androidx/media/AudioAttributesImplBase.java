package androidx.media;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo({Scope.a})
public class AudioAttributesImplBase implements AudioAttributesImpl {
    static class Builder implements androidx.media.AudioAttributesImpl.Builder {
        private int a;
        private int b;
        private int c;
        private int d;

        Builder() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = -1;
        }

        Builder(AudioAttributesCompat audioAttributesCompat0) {
            this.b = 0;
            this.c = 0;
            this.d = -1;
            this.a = audioAttributesCompat0.C0();
            this.b = audioAttributesCompat0.x();
            this.c = audioAttributesCompat0.getFlags();
            this.d = audioAttributesCompat0.E0();
        }

        @Override  // androidx.media.AudioAttributesImpl$Builder
        @NonNull
        public androidx.media.AudioAttributesImpl.Builder a(int v) {
            return this.h(v);
        }

        @Override  // androidx.media.AudioAttributesImpl$Builder
        @NonNull
        public androidx.media.AudioAttributesImpl.Builder b(int v) {
            return this.g(v);
        }

        @Override  // androidx.media.AudioAttributesImpl$Builder
        @NonNull
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.b, this.c, this.a, this.d);
        }

        @Override  // androidx.media.AudioAttributesImpl$Builder
        @NonNull
        public androidx.media.AudioAttributesImpl.Builder c(int v) {
            return this.d(v);
        }

        @NonNull
        public Builder d(int v) {
            if(v != 0 && v != 1 && v != 2 && v != 3 && v != 4) {
                this.b = 0;
                return this;
            }
            this.b = v;
            return this;
        }

        @NonNull
        public Builder e(int v) {
            this.c |= v & 0x3FF;
            return this;
        }

        private Builder f(int v) {
            switch(v) {
                case 0: {
                    this.b = 1;
                    break;
                }
                case 1: {
                    this.b = 4;
                    break;
                }
                case 2: {
                    this.b = 4;
                    break;
                }
                case 3: {
                    this.b = 2;
                    break;
                }
                case 4: {
                    this.b = 4;
                    break;
                }
                case 5: {
                    this.b = 4;
                    break;
                }
                case 6: {
                    this.b = 1;
                    this.c |= 4;
                    break;
                }
                case 7: {
                    this.c |= 1;
                    this.b = 4;
                    break;
                }
                case 8: {
                    this.b = 4;
                    break;
                }
                case 9: {
                    this.b = 4;
                    break;
                }
                case 10: {
                    this.b = 1;
                    break;
                }
                default: {
                    Log.e("AudioAttributesCompat", "Invalid stream type " + v + " for AudioAttributesCompat");
                }
            }
            this.a = AudioAttributesImplBase.a(v);
            return this;
        }

        @NonNull
        public Builder g(int v) {
            if(v == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.d = v;
            return this.f(v);
        }

        @NonNull
        public Builder h(int v) {
            switch(v) {
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: {
                    this.a = v;
                    return this;
                }
                case 16: {
                    this.a = 12;
                    return this;
                }
                default: {
                    this.a = 0;
                    return this;
                }
            }
        }

        @Override  // androidx.media.AudioAttributesImpl$Builder
        @NonNull
        public androidx.media.AudioAttributesImpl.Builder setFlags(int v) {
            return this.e(v);
        }
    }

    @RestrictTo({Scope.a})
    public int a;
    @RestrictTo({Scope.a})
    public int b;
    @RestrictTo({Scope.a})
    public int c;
    @RestrictTo({Scope.a})
    public int d;

    @RestrictTo({Scope.a})
    public AudioAttributesImplBase() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
    }

    AudioAttributesImplBase(int v, int v1, int v2, int v3) {
        this.b = v;
        this.c = v1;
        this.a = v2;
        this.d = v3;
    }

    @Override  // androidx.media.AudioAttributesImpl
    public int C0() {
        return this.a;
    }

    @Override  // androidx.media.AudioAttributesImpl
    public int D0() {
        int v = this.d;
        return v == -1 ? AudioAttributesCompat.b(false, this.c, this.a) : v;
    }

    @Override  // androidx.media.AudioAttributesImpl
    public int E0() {
        return this.d;
    }

    @Override  // androidx.media.AudioAttributesImpl
    public int F0() {
        return AudioAttributesCompat.b(true, this.c, this.a);
    }

    static int a(int v) {
        switch(v) {
            case 0: {
                return 2;
            }
            case 2: {
                return 6;
            }
            case 3: {
                return 1;
            }
            case 4: {
                return 4;
            }
            case 5: {
                return 5;
            }
            case 6: {
                return 2;
            }
            case 1: 
            case 7: {
                return 13;
            }
            case 8: {
                return 3;
            }
            case 10: {
                return 11;
            }
            default: {
                return 0;
            }
        }
    }

    @Override  // androidx.media.AudioAttributesImpl
    @Nullable
    public Object d() {
        return null;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof AudioAttributesImplBase ? this.b == ((AudioAttributesImplBase)object0).x() && this.c == ((AudioAttributesImplBase)object0).getFlags() && this.a == ((AudioAttributesImplBase)object0).C0() && this.d == ((AudioAttributesImplBase)object0).d : false;
    }

    @Override  // androidx.media.AudioAttributesImpl
    public int getFlags() {
        int v = this.c;
        int v1 = this.D0();
        if(v1 == 6) {
            return (v | 4) & 273;
        }
        if(v1 == 7) {
            v |= 1;
        }
        return v & 273;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.a, this.d});
    }

    @Override
    @NonNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AudioAttributesCompat:");
        if(this.d != -1) {
            stringBuilder0.append(" stream=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(" derived");
        }
        stringBuilder0.append(" usage=");
        stringBuilder0.append(AudioAttributesCompat.e(this.a));
        stringBuilder0.append(" content=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(" flags=0x");
        stringBuilder0.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder0.toString();
    }

    @Override  // androidx.media.AudioAttributesImpl
    public int x() {
        return this.b;
    }
}

