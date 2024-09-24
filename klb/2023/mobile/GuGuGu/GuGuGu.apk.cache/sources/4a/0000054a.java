package com.e4a.runtime;

import com.e4a.runtime.annotations.SimpleFunction;
import com.e4a.runtime.annotations.SimpleObject;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@SimpleObject
/* renamed from: com.e4a.runtime.加密操作  reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0022 {
    private C0022() {
    }

    @SimpleFunction
    /* renamed from: 取MD5值  reason: contains not printable characters */
    public static String m347MD5(byte[] bytes) {
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

    @SimpleFunction
    /* renamed from: RC4加密  reason: contains not printable characters */
    public static String m343RC4(String data, String key) {
        if (data == null || key == null) {
            return "";
        }
        try {
            byte[] o61 = RC4Base(data.getBytes("GBK"), key);
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

    @SimpleFunction
    /* renamed from: RC4解密  reason: contains not printable characters */
    public static String m345RC4(String data, String key) {
        if (data == null || key == null) {
            return "";
        }
        try {
            return new String(RC4Base(HexString2Bytes(data), key), "GBK");
        } catch (Exception o65) {
            o65.printStackTrace();
            return "";
        }
    }

    @SimpleFunction
    /* renamed from: RC4加密2  reason: contains not printable characters */
    public static byte[] m344RC42(byte[] data, String key) {
        if (data == null || key == null) {
            return new byte[0];
        }
        try {
            byte[] o61 = RC4Base(data, key);
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

    @SimpleFunction
    /* renamed from: RC4解密2  reason: contains not printable characters */
    public static byte[] m346RC42(byte[] data, String key) {
        if (data == null || key == null) {
            return new byte[0];
        }
        try {
            return RC4Base(data, key);
        } catch (Exception o65) {
            o65.printStackTrace();
            return new byte[0];
        }
    }

    private static byte[] HexString2Bytes(String src) {
        try {
            int o73910402 = src.length();
            byte[] o729D0A = new byte[o73910402 / 2];
            byte[] o74950E = src.getBytes("GBK");
            for (int o69 = 0; o69 < o73910402 / 2; o69++) {
                o729D0A[o69] = uniteBytes(o74950E[o69 * 2], o74950E[(o69 * 2) + 1]);
            }
            return o729D0A;
        } catch (Exception o65) {
            o65.printStackTrace();
            return new byte[0];
        }
    }

    private static byte uniteBytes(byte src0, byte src1) {
        char o5F9A4E = (char) Byte.decode("0x" + new String(new byte[]{src0})).byteValue();
        char o5F9A4F = (char) Byte.decode("0x" + new String(new byte[]{src1})).byteValue();
        byte o729D0A = (byte) (((char) (o5F9A4E << 4)) ^ o5F9A4F);
        return o729D0A;
    }

    private static byte[] RC4Base(byte[] input, String mKkey) {
        int o78 = 0;
        int o79 = 0;
        byte[] o6B9D07 = initKey(mKkey);
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

    private static byte[] initKey(String aKey) {
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

    @SimpleFunction
    /* renamed from: DES加密  reason: contains not printable characters */
    public static String m341DES(String encryptString, String encryptKey) throws Exception {
        try {
            byte[] o698E = {1, 2, 3, 4, 5, 6, 7, 8};
            IvParameterSpec o7A9D0C086D45 = new IvParameterSpec(o698E);
            SecretKeySpec o6B9D07 = new SecretKeySpec(encryptKey.getBytes("GBK"), "DES");
            Cipher o63910E0F4141 = Cipher.getInstance("DES/CBC/PKCS5Padding");
            o63910E0F4141.init(1, o6B9D07, o7A9D0C086D45);
            byte[] o65961D155D4361F91B7343C298 = o63910E0F4141.doFinal(encryptString.getBytes("GBK"));
            return m339BASE64(o65961D155D4361F91B7343C298);
        } catch (Exception e) {
            return "";
        }
    }

    @SimpleFunction
    /* renamed from: DES解密  reason: contains not printable characters */
    public static String m342DES(String decryptString, String decryptKey) throws Exception {
        try {
            byte[] o698E = {1, 2, 3, 4, 5, 6, 7, 8};
            byte[] o62810A02695A = m340BASE64(decryptString);
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

    @SimpleFunction
    /* renamed from: BASE64编码  reason: contains not printable characters */
    public static String m339BASE64(byte[] data) {
        try {
            return Base64.encode(data);
        } catch (Exception e) {
            return "";
        }
    }

    @SimpleFunction
    /* renamed from: BASE64解码  reason: contains not printable characters */
    public static byte[] m340BASE64(String data) {
        try {
            return Base64.decode(data);
        } catch (UnsupportedEncodingException e) {
            return new byte[0];
        }
    }

    @SimpleFunction
    /* renamed from: Authcode加密  reason: contains not printable characters */
    public static String m337Authcode(String source, String key) {
        try {
            return Authcode.Encode(source, key);
        } catch (Exception e) {
            return "";
        }
    }

    @SimpleFunction
    /* renamed from: Authcode解密  reason: contains not printable characters */
    public static String m338Authcode(String source, String key) {
        try {
            return Authcode.Decode(source, key);
        } catch (Exception e) {
            return "";
        }
    }
}