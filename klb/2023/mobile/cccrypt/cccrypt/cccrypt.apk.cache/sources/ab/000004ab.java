package ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooO0oO0oo0OoOOO0ooOOooOoO0oooOO0oOOoooO0ooOOo00oOOooo.ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOOooOO0OOOooooOOoOOooOoOooooOo0ooO;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooO0oO0oo0OoOOO0ooOOooOoO0oooOO0oOOoooO0ooOOo00oOOooo.ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o;

/* compiled from: 加密操作.java */
@ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOOooOO0OOOooooOOoOOooOoOooooOo0ooO
/* renamed from: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOOo0ooOOoOOoOOOoOoOOoOo00oO0OOOOooOo0ooOoO0OoO */
/* loaded from: classes.dex */
public final class encclass {
    private encclass() {
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOo0o0OoOOo00oo0oo0ooOoo0ooooooOOOoOOOooO0o(byte[] bytes) {
        char[] o689D06234D547CE80C = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            MessageDigest o6D9C37095747 = MessageDigest.getInstance("MD5");
            o6D9C37095747.update(bytes);
            byte[] o6D9C = o6D9C37095747.digest();
            int o6A = o6D9C.length;
            char[] o738C0C = new char[o6A * 2];
            int o6B = 0;
            for (byte o62810A0214 : o6D9C) {
                int o6B2 = o6B + 1;
                o738C0C[o6B] = o689D06234D547CE80C[(o62810A0214 >>> 4) & 15];
                o6B = o6B2 + 1;
                o738C0C[o6B2] = o689D06234D547CE80C[o62810A0214 & 15];
            }
            return new String(o738C0C);
        } catch (Exception o65) {
            o65.printStackTrace();
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String ooOOooOOoOOoOoOoOooOOoOoOOO0o0oOO0O0oOo0o00(String data, String key) {
        if (data == null || key == null) {
            return "";
        }
        try {
            byte[] o61 = ooOOooOOoOOoOoOoOooooOoOOoOooOOoOoO0oo0oO0o(data.getBytes("GBK"), key);
            char[] o689D06234D547CE80C = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int o6A = o61.length;
            char[] o738C0C = new char[o6A * 2];
            int o6B = 0;
            for (byte o62810A0214 : o61) {
                int o6B2 = o6B + 1;
                o738C0C[o6B] = o689D06234D547CE80C[(o62810A0214 >>> 4) & 15];
                o6B = o6B2 + 1;
                o738C0C[o6B2] = o689D06234D547CE80C[o62810A0214 & 15];
            }
            return new String(o738C0C);
        } catch (Exception o65) {
            o65.printStackTrace();
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    /* renamed from: ooOOooOOoOOoOoOoOooOOoOooOo0oO0OO0O0oOo0o00 */
    public static String enc2(String data, String key) {
        if (data == null || key == null) {
            return "";
        }
        try {
            return new String(ooOOooOOoOOoOoOoOooooOoOOoOooOOoOoO0oo0oO0o(ooOoo0Oo00OOoO0ooO0oo0oOooOOO0ooOooooo0oOo0OO0ooOoooo0OO0ooOOoO0O0oOo0OO0o0OOOooOOOoOoo0ooO(data), key), "GBK");
        } catch (Exception o65) {
            o65.printStackTrace();
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static byte[] ooOOooOOoOOoOoOoOooOOoOoOOO0o0oOO0O0oOo0o00OooOOO(byte[] data, String key) {
        if (data == null || key == null) {
            return new byte[0];
        }
        try {
            byte[] o61 = ooOOooOOoOOoOoOoOooooOoOOoOooOOoOoO0oo0oO0o(data, key);
            byte[] o689D06234D547CE80C = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
            int o6A = o61.length;
            byte[] o738C0C = new byte[o6A * 2];
            int o6B = 0;
            for (byte o62810A0214 : o61) {
                int o6B2 = o6B + 1;
                o738C0C[o6B] = o689D06234D547CE80C[(o62810A0214 >>> 4) & 15];
                o6B = o6B2 + 1;
                o738C0C[o6B2] = o689D06234D547CE80C[o62810A0214 & 15];
            }
            return o738C0C;
        } catch (Exception o65) {
            o65.printStackTrace();
            return new byte[0];
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static byte[] ooOOooOOoOOoOoOoOooOOoOooOo0oO0OO0O0oOo0o00OooOOO(byte[] data, String key) {
        if (data == null || key == null) {
            return new byte[0];
        }
        try {
            return ooOOooOOoOOoOoOoOooooOoOOoOooOOoOoO0oo0oO0o(data, key);
        } catch (Exception o65) {
            o65.printStackTrace();
            return new byte[0];
        }
    }

    private static byte[] ooOoo0Oo00OOoO0ooO0oo0oOooOOO0ooOooooo0oOo0OO0ooOoooo0OO0ooOOoO0O0oOo0OO0o0OOOooOOOoOoo0ooO(String src) {
        try {
            int o73910402 = src.length();
            byte[] o729D0A = new byte[o73910402 / 2];
            byte[] o74950E = src.getBytes("GBK");
            for (int o69 = 0; o69 < o73910402 / 2; o69++) {
                o729D0A[o69] = oo0ooOOo00oO0oooo0oooooo0oOooooo0oooooO0Oo0OOOo0OoooOoooOooOo(o74950E[o69 * 2], o74950E[(o69 * 2) + 1]);
            }
            return o729D0A;
        } catch (Exception o65) {
            o65.printStackTrace();
            return new byte[0];
        }
    }

    private static byte oo0ooOOo00oO0oooo0oooooo0oOooooo0oooooO0Oo0OOOo0OoooOoooOooOo(byte src0, byte src1) {
        char o5F9A4E = (char) Byte.decode("0x" + new String(new byte[]{src0})).byteValue();
        char o5F9A4F = (char) Byte.decode("0x" + new String(new byte[]{src1})).byteValue();
        byte o729D0A = (byte) (((char) (o5F9A4E << 4)) ^ o5F9A4F);
        return o729D0A;
    }

    private static byte[] ooOOooOOoOOoOoOoOooooOoOOoOooOOoOoO0oo0oO0o(byte[] input, String mKkey) {
        int o78 = 0;
        int o79 = 0;
        byte[] o6B9D07 = ooO0o00o00oO0oooo0oooooo0oO0OO0oOOoO0oO0Oo0(mKkey);
        byte[] o729D0D124847 = new byte[input.length];
        for (int o69 = 0; o69 < input.length; o69++) {
            o78 = (o78 + 1) & 255;
            o79 = ((o6B9D07[o78] & 255) + o79) & 255;
            byte o74950E = o6B9D07[o78];
            o6B9D07[o78] = o6B9D07[o79];
            o6B9D07[o79] = o74950E;
            int o78970C2E4A5770E4 = ((o6B9D07[o78] & 255) + (o6B9D07[o79] & 255)) & 255;
            o729D0D124847[o69] = (byte) (input[o69] ^ o6B9D07[o78970C2E4A5770E4]);
        }
        return o729D0D124847;
    }

    private static byte[] ooO0o00o00oO0oooo0oooooo0oO0OO0oOOoO0oO0Oo0(String aKey) {
        try {
            byte[] o62A715025D = aKey.getBytes("GBK");
            byte[] o738C1F1341 = new byte[256];
            for (int o69 = 0; o69 < 256; o69++) {
                o738C1F1341[o69] = (byte) o69;
            }
            int o69961A025C02 = 0;
            int o69961A025C01 = 0;
            if (o62A715025D == null || o62A715025D.length == 0) {
                return null;
            }
            for (int o692 = 0; o692 < 256; o692++) {
                o69961A025C01 = ((o62A715025D[o69961A025C02] & 255) + (o738C1F1341[o692] & 255) + o69961A025C01) & 255;
                byte o74950E = o738C1F1341[o692];
                o738C1F1341[o692] = o738C1F1341[o69961A025C01];
                o738C1F1341[o69961A025C01] = o74950E;
                o69961A025C02 = (o69961A025C02 + 1) % o62A715025D.length;
            }
            return o738C1F1341;
        } catch (Exception o65) {
            o65.printStackTrace();
            return null;
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String ooOooOoOoOOOoooOOOoOOoOoOOO0o0oOO0O0oOo0o00(String encryptString, String encryptKey) throws Exception {
        try {
            byte[] o698E = {1, 2, 3, 4, 5, 6, 7, 8};
            IvParameterSpec o7A9D0C086D45 = new IvParameterSpec(o698E);
            SecretKeySpec o6B9D07 = new SecretKeySpec(encryptKey.getBytes("GBK"), "DES");
            Cipher o63910E0F4141 = Cipher.getInstance("DES/CBC/PKCS5Padding");
            o63910E0F4141.init(1, o6B9D07, o7A9D0C086D45);
            byte[] o65961D155D4361F91B7343C298 = o63910E0F4141.doFinal(encryptString.getBytes("GBK"));
            return ooOoooOOoOo00ooOOOoooOooOoooooOO0oo0oOoooOoo0oOo0OoOOOoOOoOo0(o65961D155D4361F91B7343C298);
        } catch (Exception e) {
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    /* renamed from: ooOooOoOoOOOoooOOOoOOoOooOo0oO0OO0O0oOo0o00 */
    public static String enc1(String decryptString, String decryptKey) throws Exception {
        try {
            byte[] o698E = {1, 2, 3, 4, 5, 6, 7, 8};
            byte[] o62810A02695A = ooOoooOOoOo00ooOOOoooOooOoooooOO0oo0oOooo0Oo0oOOOOoOOOoOOoOo0(decryptString);
            IvParameterSpec o7A9D0C086D45 = new IvParameterSpec(o698E);
            SecretKeySpec o6B9D07 = new SecretKeySpec(decryptKey.getBytes("GBK"), "DES");
            Cipher o63910E0F4141 = Cipher.getInstance("DES/CBC/PKCS5Padding");
            o63910E0F4141.init(2, o6B9D07, o7A9D0C086D45);
            byte[] o649D1D155D4361F91B7343C298 = o63910E0F4141.doFinal(o62810A02695A);
            return new String(o649D1D155D4361F91B7343C298, "GBK");
        } catch (Exception e) {
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String ooOoooOOoOo00ooOOOoooOooOoooooOO0oo0oOoooOoo0oOo0OoOOOoOOoOo0(byte[] data) {
        try {
            return ooOoooOo00o00O0oOOoO0oooOoooooOO0oo0o.encode(data);
        } catch (Exception e) {
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static byte[] ooOoooOOoOo00ooOOOoooOooOoooooOO0oo0oOooo0Oo0oOOOOoOOOoOOoOo0(String data) {
        try {
            return ooOoooOo00o00O0oOOoO0oooOoooooOO0oo0o.decode(data);
        } catch (UnsupportedEncodingException e) {
            return new byte[0];
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String ooOooooo0OOOoO0oOooO0oOO0oOoo0ooOOOo0o0ooooOO0o00Oo0oo0OOOoOoOOOooooO0Ooo(String source, String key) {
        try {
            return ooOooooo0OOOoO0oOooO0oOO0oOoo0ooOOOo0o0ooooOO0o00.Encode(source, key);
        } catch (Exception e) {
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String ooOooooo0OOOoO0oOooO0oOO0oOoo0ooOOOo0o0ooooOO0o00Oo0ooOOOooOOOOOooooO0Ooo(String source, String key) {
        try {
            return ooOooooo0OOOoO0oOooO0oOO0oOoo0ooOOOo0o0ooooOO0o00.Decode(source, key);
        } catch (Exception e) {
            return "";
        }
    }
}