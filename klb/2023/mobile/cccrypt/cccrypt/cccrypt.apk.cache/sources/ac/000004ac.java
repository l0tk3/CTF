package ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oo0oO0oo00o00O0oOo0O0ooO0oOoo00oOOoO0oO0oooOO0o00O0oOOooOooOo.ooOoooOo00o0oooooooO0oOoOoOoooooOOooOo0oOoOOo0OOOoooOoooOOooooOoo0oOo0oOoo00Oo0oOOO0oooOooOOooOoOOoOOOoOooo00ooOo0OO0oOoOo00OOOOOOoOOoo0oOOOOoo0oOOOo00;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooO0oO0oo0OoOOO0ooOOooOoO0oooOO0oOOoooO0ooOOo00oOOooo.ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOOooOO0OOOooooOOoOOooOoOooooOo0ooO;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooO0oO0oo0OoOOO0ooOOooOoO0oooOO0oOOoooO0ooOOo00oOOooo.ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooo0o00o0ooooooOO0oo0OoOOoO0oO0oo0o0oOo0OO0OO0ooooOooOOooOoOOO0oOO0ooOo00O0ooOOOO0ooOOOoOoooooo0OOoo;

/* compiled from: 对话框类.java */
@ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOOooOO0OOOooooOOoOOooOoOooooOo0ooO
/* loaded from: classes.dex */
public final class oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0 {
    private static MyAdapter o419C1F17505667;
    private static List<Map<String, String>> o64990A06;
    private static ProgressDialog o708A1100565666EF3B5E43DA9659;
    private static boolean oBF31B6C6EBC8 = false;
    private static int o49960E1250676CEC1A = 4;
    private static String o4FB3 = "确定";
    private static String o43B93024617F = "取消";

    private oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0() {
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOo0o00oooO0oOooo0OOoooOoo00ooOOOOo0oOooOOOooOOo0Oo0O0oOo0oOOOO0ooooOOo00ooOo0OOOOOooo0OoooooOOOOoo0OOoO0ooOO(int value) {
        if (value == 1) {
            o4FB3 = "确定";
            o43B93024617F = "取消";
            return;
        }
        o4FB3 = "OK";
        o43B93024617F = "Cancel";
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOo0o00oooO0oOooo0OOoooOoo00o00Oo0OoOOoooo0oOOoOoOo0o00OOOoo0o00o00O0ooO0oOooO0Oo0Oo0OO0OOOO0oo0oooOoOOoO0o00o00oOOo00ooo(boolean value) {
        oBF31B6C6EBC8 = value;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOo0OO0ooOOo0OoOoOoOOoo00o00o00Oo0OoOOoooo0oOOoOoOo0o00OOOoo0o00o00O0ooO0oOooO0Oo0Oo0(String msg) {
        o708A1100565666EF3B5E43DA9659 = ProgressDialog.show(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext(), "", msg, true, oBF31B6C6EBC8);
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOo0o00oooO0oOooo0OOoooOoo00o00Oo0OoOOoooo0oOOoOoOo0o00OOOoo0o00o00O0ooO0oOooO0Oo0Oo0o00oooO0oOoOooOooOoO0Ooo(String msg) {
        if (o708A1100565666EF3B5E43DA9659 != null) {
            o708A1100565666EF3B5E43DA9659.setMessage(msg);
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOoOo00ooOO0oOo0OO0OoOooOo00o00Oo0OoOOoooo0oOOoOoOo0o00OOOoo0o00o00O0ooO0oOooO0Oo0Oo0() {
        if (o708A1100565666EF3B5E43DA9659 != null) {
            o708A1100565666EF3B5E43DA9659.dismiss();
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOo0OO0ooOOo0OoOoOoOOoo00o00o00Oo0OoOOoooo0oOOoOoOo0o00OOOoo0o00o00O0ooO0oOooO0Oo0Oo0o0ooo0(String title, String msg, boolean cancelable) {
        o708A1100565666EF3B5E43DA9659 = new ProgressDialog(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
        o708A1100565666EF3B5E43DA9659.setTitle(title);
        o708A1100565666EF3B5E43DA9659.setMessage(msg);
        o708A1100565666EF3B5E43DA9659.setIndeterminate(false);
        o708A1100565666EF3B5E43DA9659.setCancelable(cancelable);
        o708A1100565666EF3B5E43DA9659.setProgressStyle(1);
        o708A1100565666EF3B5E43DA9659.setProgress(0);
        o708A1100565666EF3B5E43DA9659.show();
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOo0o00oooO0oOooo0OOoooOoo00o00Oo0OoOOoooo0oOOoOoOo0o00OOOoo0o00o00O0ooO0oOooO0Oo0Oo0OO0Oo0oo0oO0oOOOoOO0oO0o(int progress) {
        if (o708A1100565666EF3B5E43DA9659 != null) {
            o708A1100565666EF3B5E43DA9659.setProgress(progress);
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static int oOOoO0ooo0OOoOoOoooOo0oOOo00OoOOo0ooo(String title, String msg, String btnOK) {
        AlertDialog.Builder o628D170B405667 = new AlertDialog.Builder(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
        MessageBox o6D9A = new MessageBox();
        return o6D9A.showDialog(o628D170B405667, title, msg, btnOK);
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static int oOOoO0ooo0OOoOoOoooOo0oOOo00OoOOo0oooooOo0o(String title, String msg, String btnOK, String btnNO) {
        AlertDialog.Builder o628D170B405667 = new AlertDialog.Builder(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
        MessageBox o6D9A = new MessageBox();
        return o6D9A.oo0ooo0o00O0ooooooooooO0ooO0O0ooOOOooo0ooOoOO0O0ooooO0ooOOO0ooooO0o(o628D170B405667, title, msg, btnOK, btnNO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: 对话框类.java */
    /* loaded from: classes.dex */
    public static class MessageBox {
        private int o64911F0B4B5447F90C424EC2;
        private Handler o6DB01F09405F70EE;

        private MessageBox() {
            this.o64911F0B4B5447F90C424EC2 = 0;
        }

        public int ooO0o0oo00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO() {
            return this.o64911F0B4B5447F90C424EC2;
        }

        public void oo0ooo0o00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO(int dialogResult) {
            this.o64911F0B4B5447F90C424EC2 = dialogResult;
        }

        public void ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(int result) {
            oo0ooo0o00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO(result);
            Message o6D = this.o6DB01F09405F70EE.obtainMessage();
            this.o6DB01F09405F70EE.sendMessage(o6D);
        }

        public int showDialog(AlertDialog.Builder builder, String title, String message, String btnOK) {
            builder.setTitle(title).setMessage(message).setCancelable(false).setPositiveButton(btnOK, new DialogInterface.OnClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.MessageBox.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    MessageBox.this.ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(0);
                }
            }).show();
            this.o6DB01F09405F70EE = new Handler(Looper.getMainLooper()) { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.MessageBox.2
                @Override // android.os.Handler
                public void handleMessage(Message mesg) {
                    throw new RuntimeException();
                }
            };
            try {
                Looper.getMainLooper();
                Looper.loop();
            } catch (RuntimeException o729D) {
                o729D.printStackTrace();
            }
            return this.o64911F0B4B5447F90C424EC2;
        }

        public int oo0ooo0o00O0ooooooooooO0ooO0O0ooOOOooo0ooOoOO0O0ooooO0ooOOO0ooooO0o(AlertDialog.Builder builder, String title, String message, String btnOK, String btnNO) {
            builder.setTitle(title).setMessage(message).setCancelable(false).setPositiveButton(btnOK, new DialogInterface.OnClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.MessageBox.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    MessageBox.this.ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(0);
                }
            }).setNegativeButton(btnNO, new DialogInterface.OnClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.MessageBox.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    MessageBox.this.ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(1);
                }
            }).show();
            this.o6DB01F09405F70EE = new Handler(Looper.getMainLooper()) { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.MessageBox.5
                @Override // android.os.Handler
                public void handleMessage(Message mesg) {
                    throw new RuntimeException();
                }
            };
            try {
                Looper.getMainLooper();
                Looper.loop();
            } catch (RuntimeException o729D) {
                o729D.printStackTrace();
            }
            return this.o64911F0B4B5447F90C424EC2;
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static int oOOoO0ooo0OOoOoOoooOo0oOOo00OoOOo0oooooOoO0(String title, String message1, String message2, String btnOK, String btnNO, boolean state, ooOoooOo00o0oooooooO0oOoOoOoooooOOooOo0oOoOOo0OOOoooOoooOOooooOoo0oOo0oOoo00Oo0oOOO0oooOooOOooOoOOoOOOoOooo00ooOo0OO0oOoOo00OOOOOOoOOoo0oOOOOoo0oOOOo00 accept) {
        AlertDialog.Builder o628D170B405667 = new AlertDialog.Builder(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
        MessageBox3 o6D9A = new MessageBox3();
        return o6D9A.showDialog(o628D170B405667, title, message1, message2, btnOK, btnNO, state, accept);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: 对话框类.java */
    /* loaded from: classes.dex */
    public static class MessageBox3 {
        private int o64911F0B4B5447F90C424EC2;
        private Handler o6DB01F09405F70EE;

        private MessageBox3() {
            this.o64911F0B4B5447F90C424EC2 = 0;
        }

        public int ooO0o0oo00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO() {
            return this.o64911F0B4B5447F90C424EC2;
        }

        public void oo0ooo0o00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO(int dialogResult) {
            this.o64911F0B4B5447F90C424EC2 = dialogResult;
        }

        public void ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(int result) {
            oo0ooo0o00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO(result);
            Message o6D = this.o6DB01F09405F70EE.obtainMessage();
            this.o6DB01F09405F70EE.sendMessage(o6D);
        }

        public int showDialog(AlertDialog.Builder builder, String title, String message1, String message2, String btnOK, String btnNO, boolean state, final ooOoooOo00o0oooooooO0oOoOoOoooooOOooOo0oOoOOo0OOOoooOoooOOooooOoo0oOo0oOoo00Oo0oOOO0oooOooOOooOoOOoOOOoOooo00ooOo0OO0oOoOo00OOOOOOoOOoo0oOOOOoo0oOOOo00 accept) {
            builder.setTitle(title).setCancelable(false);
            LinearLayout o6C9907085147 = new LinearLayout(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
            o6C9907085147.setOrientation(1);
            LinearLayout.LayoutParams o70990C0649 = new LinearLayout.LayoutParams(-1, -1);
            o70990C0649.weight = 1.0f;
            TextView o749D0613 = new TextView(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
            o749D0613.setText(message1);
            CheckBox o63901B044F = new CheckBox(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
            o63901B044F.setText(message2);
            o63901B044F.setChecked(state);
            o63901B044F.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.MessageBox3.1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    accept.set(isChecked);
                }
            });
            o6C9907085147.addView(o749D0613, o70990C0649);
            o6C9907085147.addView(o63901B044F, o70990C0649);
            builder.setView(o6C9907085147);
            builder.setPositiveButton(btnOK, new DialogInterface.OnClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.MessageBox3.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    MessageBox3.this.ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(0);
                }
            });
            builder.setNegativeButton(btnNO, new DialogInterface.OnClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.MessageBox3.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    MessageBox3.this.ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(1);
                }
            });
            builder.show();
            this.o6DB01F09405F70EE = new Handler(Looper.getMainLooper()) { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.MessageBox3.4
                @Override // android.os.Handler
                public void handleMessage(Message mesg) {
                    throw new RuntimeException();
                }
            };
            try {
                Looper.getMainLooper();
                Looper.loop();
            } catch (RuntimeException o729D) {
                o729D.printStackTrace();
            }
            return this.o64911F0B4B5447F90C424EC2;
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOoOoOOoOOOOoOooOO0Oo0oO0o00ooOOOOo0oOooOOOooOOo0Oo0O0oOo0oOO(String title, String[] items, boolean[] state) {
        AlertDialog.Builder o73911000485657E9165B46D38B = new AlertDialog.Builder(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
        DialogBox o649A = new DialogBox();
        return o649A.showDialog(o73911000485657E9165B46D38B, title, items, state);
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOoOoO0oooo0OOooOO0Oo0oO0o00ooOOOOo0oOooOOOooOOo0Oo0O0oOo0oOO(String title, String[] items, boolean[] state) {
        AlertDialog.Builder o6D8D12134D7160F5135347C4 = new AlertDialog.Builder(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
        DialogBox o649A = new DialogBox();
        return o649A.oo0ooo0o00O0ooooooooooO0ooO0O0ooOOOooo0ooOoOO0O0ooooO0ooOOO0ooooO0o(o6D8D12134D7160F5135347C4, title, items, state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: 对话框类.java */
    /* loaded from: classes.dex */
    public static class DialogBox {
        private String[] o498C1B0A57;
        private boolean[] o538C1F1341;
        private String o64911F0B4B5447F90C424EC2;
        private Handler o6DB01F09405F70EE;

        private DialogBox() {
        }

        public String ooO0o0oo00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO() {
            return this.o64911F0B4B5447F90C424EC2;
        }

        public void oo0ooo0o00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO(String dialogResult) {
            this.o64911F0B4B5447F90C424EC2 = dialogResult;
        }

        public String[] getItems() {
            return this.o498C1B0A57;
        }

        public void setItems(String[] items) {
            this.o498C1B0A57 = items;
        }

        public boolean[] getState() {
            return this.o538C1F1341;
        }

        public void setState(boolean[] state) {
            this.o538C1F1341 = state;
        }

        public void ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(String result) {
            oo0ooo0o00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO(result);
            Message o6D = this.o6DB01F09405F70EE.obtainMessage();
            this.o6DB01F09405F70EE.sendMessage(o6D);
        }

        public String showDialog(AlertDialog.Builder builder, String title, String[] items, boolean[] state) {
            this.o498C1B0A57 = items;
            this.o538C1F1341 = state;
            int o63901B044F5671D50B524F = 0;
            int o6B = 0;
            while (true) {
                if (o6B >= state.length) {
                    break;
                } else if (!state[o6B]) {
                    o6B++;
                } else {
                    o63901B044F5671D50B524F = o6B;
                    break;
                }
            }
            builder.setTitle(title).setCancelable(false);
            builder.setSingleChoiceItems(items, o63901B044F5671D50B524F, new DialogInterface.OnClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.DialogBox.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    boolean[] o73 = DialogBox.this.getState();
                    for (int o69 = 0; o69 < o73.length; o69++) {
                        if (o69 == which) {
                            o73[o69] = true;
                        } else {
                            o73[o69] = false;
                        }
                    }
                    DialogBox.this.setState(o73);
                }
            });
            builder.setPositiveButton(oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o4FB3, new DialogInterface.OnClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.DialogBox.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    String o729D0D124847 = "";
                    boolean[] o73 = DialogBox.this.getState();
                    String[] o698C = DialogBox.this.getItems();
                    for (int o69 = 0; o69 < o73.length; o69++) {
                        if (o73[o69]) {
                            o729D0D124847 = o698C[o69];
                        }
                    }
                    DialogBox.this.ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(o729D0D124847);
                }
            });
            builder.setNegativeButton(oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o43B93024617F, new DialogInterface.OnClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.DialogBox.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    DialogBox.this.ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O("");
                }
            });
            builder.show();
            this.o6DB01F09405F70EE = new Handler(Looper.getMainLooper()) { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.DialogBox.4
                @Override // android.os.Handler
                public void handleMessage(Message mesg) {
                    throw new RuntimeException();
                }
            };
            try {
                Looper.getMainLooper();
                Looper.loop();
            } catch (RuntimeException o729D) {
                o729D.printStackTrace();
            }
            return this.o64911F0B4B5447F90C424EC2;
        }

        public String oo0ooo0o00O0ooooooooooO0ooO0O0ooOOOooo0ooOoOO0O0ooooO0ooOOO0ooooO0o(AlertDialog.Builder builder, String title, String[] items, boolean[] state) {
            this.o498C1B0A57 = items;
            this.o538C1F1341 = state;
            builder.setTitle(title).setCancelable(false);
            builder.setMultiChoiceItems(items, state, new DialogInterface.OnMultiChoiceClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.DialogBox.5
                @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    boolean[] o73 = DialogBox.this.getState();
                    o73[which] = isChecked;
                    DialogBox.this.setState(o73);
                }
            });
            builder.setPositiveButton(oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o4FB3, new DialogInterface.OnClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.DialogBox.6
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    String o729D0D124847 = "";
                    boolean[] o73 = DialogBox.this.getState();
                    String[] o698C = DialogBox.this.getItems();
                    for (int o69 = 0; o69 < o73.length; o69++) {
                        if (o73[o69]) {
                            if (o729D0D124847 == "") {
                                o729D0D124847 = o698C[o69];
                            } else {
                                o729D0D124847 = o729D0D124847 + "\n" + o698C[o69];
                            }
                        }
                    }
                    DialogBox.this.ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(o729D0D124847);
                }
            });
            builder.setNegativeButton(oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o43B93024617F, new DialogInterface.OnClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.DialogBox.7
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    DialogBox.this.ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O("");
                }
            });
            builder.show();
            this.o6DB01F09405F70EE = new Handler(Looper.getMainLooper()) { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.DialogBox.8
                @Override // android.os.Handler
                public void handleMessage(Message mesg) {
                    throw new RuntimeException();
                }
            };
            try {
                Looper.getMainLooper();
                Looper.loop();
            } catch (RuntimeException o729D) {
                o729D.printStackTrace();
            }
            return this.o64911F0B4B5447F90C424EC2;
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOOooO0oo0OoOOoOoOoo0Ooo0OOOOo0OOoo0OOooOoooO0OOOOoOoOOOOooo0OOOOoooOOOOooOoOOOo0Ooo0o0OOoOo0ooo0(int method) {
        o49960E1250676CEC1A = method;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOo0OoooooOo0OoOoO0o0OOo0o00OoOOo0ooo(String title, String text, ooOoooOo00o0oooooooO0oOoOoOoooooOOooOo0oOoOOo0OOOoooOoooOOooooOoo0oOo0oOoo00Oo0oOOO0oooOooOOooOoOOoOOOoOooo00ooOo0OO0oOoOo00OOOOOOoOOoo0oOOOOoo0oOOOo00 accept) {
        AlertDialog.Builder o628D170B405667 = new AlertDialog.Builder(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
        InputBox o699A = new InputBox();
        return o699A.showDialog(o628D170B405667, title, text, accept);
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOo0oo0ooOoOoOoOOo0o0OOo0OOOOOOOOoo0oOOoOOoo0oo0oOo0O0oOo0oOO(String str, String str2, String str3, String str4, String str5, ooOoooOo00o0oooooooO0oOoOoOoooooOOooOo0oOoOOo0OOOoooOoooOOooooOoo0oOo0oOoo00Oo0oOOO0oooOooOOooOoOOoOOOoOooo00ooOo0OO0oOoOo00OOOOOOoOOoo0oOOOOoo0oOOOo00 oooooooo00o0oooooooo0ooooooooooooooooo0oooooo0ooooooooooooooooooo0ooo0oooo00oo0oooo0ooooooooooooooooooooooo00oooo0oo0ooooo00ooooooooooo0ooooooo0ooooo00) {
        AlertDialog.Builder o628D170B405667 = new AlertDialog.Builder(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
        InputBox o699A = new InputBox();
        return o699A.oo0ooo0o00O0ooooooooooO0ooO0O0ooOOOooo0ooOoOO0O0ooooO0ooOOO0ooooO0o(o628D170B405667, str, str2, str3, str4, str5, oooooooo00o0oooooooo0ooooooooooooooooo0oooooo0ooooooooooooooooooo0ooo0oooo00oo0oooo0ooooooooooooooooooooooo00oooo0oo0ooooo00ooooooooooo0ooooooo0ooooo00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: 对话框类.java */
    /* loaded from: classes.dex */
    public static class InputBox {
        private String o64911F0B4B5447F90C424EC2;
        private Handler o6DB01F09405F70EE;

        private InputBox() {
        }

        public String ooO0o0oo00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO() {
            return this.o64911F0B4B5447F90C424EC2;
        }

        public void oo0ooo0o00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO(String dialogResult) {
            this.o64911F0B4B5447F90C424EC2 = dialogResult;
        }

        public void ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(String result) {
            oo0ooo0o00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO(result);
            Message o6D = this.o6DB01F09405F70EE.obtainMessage();
            this.o6DB01F09405F70EE.sendMessage(o6D);
        }

        public String showDialog(AlertDialog.Builder builder, String title, String text, final ooOoooOo00o0oooooooO0oOoOoOoooooOOooOo0oOoOOo0OOOoooOoooOOooooOoo0oOo0oOoo00Oo0oOOO0oooOooOOooOoOOoOOOoOooo00ooOo0OO0oOoOo00OOOOOOoOOoo0oOOOOoo0oOOOo00 accept) {
            final EditText o69960E12506070EE095250 = new EditText(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
            switch (oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o49960E1250676CEC1A) {
                case 1:
                    o69960E12506070EE095250.setInputType(1);
                    break;
                case 2:
                    o69960E12506070EE095250.setInputType(3);
                    break;
                case 3:
                    o69960E12506070EE095250.setInputType(0);
                    break;
                case 4:
                    o69960E12506070EE095250.setInputType(131073);
                    break;
            }
            o69960E12506070EE095250.setText(text);
            o69960E12506070EE095250.setFocusable(true);
            builder.setTitle(title).setView(o69960E12506070EE095250).setCancelable(false).setPositiveButton(oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o4FB3, new DialogInterface.OnClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.InputBox.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    accept.set(true);
                    String o69960E12504770E40B = o69960E12506070EE095250.getText().toString();
                    InputBox.this.ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(o69960E12504770E40B);
                }
            }).setNegativeButton(oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o43B93024617F, new DialogInterface.OnClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.InputBox.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    accept.set(false);
                    InputBox.this.ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O("");
                }
            }).show();
            this.o6DB01F09405F70EE = new Handler(Looper.getMainLooper()) { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.InputBox.3
                @Override // android.os.Handler
                public void handleMessage(Message mesg) {
                    throw new RuntimeException();
                }
            };
            try {
                Looper.getMainLooper();
                Looper.loop();
            } catch (RuntimeException o729D) {
                o729D.printStackTrace();
            }
            return this.o64911F0B4B5447F90C424EC2;
        }

        public String oo0ooo0o00O0ooooooooooO0ooO0O0ooOOOooo0ooOoOO0O0ooooO0ooOOO0ooooO0o(AlertDialog.Builder builder, String str, String str2, String str3, String str4, String str5, final ooOoooOo00o0oooooooO0oOoOoOoooooOOooOo0oOoOOo0OOOoooOoooOOooooOoo0oOo0oOoo00Oo0oOOO0oooOooOOooOoOOoOOOoOooo00ooOo0OO0oOoOo00OOOOOOoOOoo0oOOOOoo0oOOOo00 oooooooo00o0oooooooo0ooooooooooooooooo0oooooo0ooooooooooooooooooo0ooo0oooo00oo0oooo0ooooooooooooooooooooooo00oooo0oo0ooooo00ooooooooooo0ooooooo0ooooo00) {
            LinearLayout o6C9907085147 = new LinearLayout(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
            o6C9907085147.setOrientation(1);
            LinearLayout.LayoutParams o70990C0649 = new LinearLayout.LayoutParams(-1, -1);
            o70990C0649.weight = 1.0f;
            ListView o6C910D13525A70EB = new ListView(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
            o6C910D13525A70EB.setFocusable(true);
            List unused = oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o64990A06 = new ArrayList();
            MyAdapter unused2 = oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o419C1F17505667 = new MyAdapter();
            o6C910D13525A70EB.setAdapter((ListAdapter) oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o419C1F17505667);
            HashMap hashMap = new HashMap();
            hashMap.put("title", str2);
            oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o64990A06.add(hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("title", str3);
            oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o64990A06.add(hashMap2);
            oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o419C1F17505667.notifyDataSetChanged();
            final EditText o69960E12506070EE095250 = new EditText(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
            o69960E12506070EE095250.setFocusable(true);
            o69960E12506070EE095250.setInputType(1);
            o69960E12506070EE095250.setTransformationMethod(PasswordTransformationMethod.getInstance());
            o69960E12506070EE095250.setText(str4);
            o69960E12506070EE095250.setHint(str5);
            o6C9907085147.addView(o6C910D13525A70EB, o70990C0649);
            o6C9907085147.addView(o69960E12506070EE095250, o70990C0649);
            builder.setTitle(str).setView(o6C9907085147).setCancelable(false).setPositiveButton(oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o4FB3, new DialogInterface.OnClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.InputBox.5
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    oooooooo00o0oooooooo0ooooooooooooooooo0oooooo0ooooooooooooooooooo0ooo0oooo00oo0oooo0ooooooooooooooooooooooo00oooo0oo0ooooo00ooooooooooo0ooooooo0ooooo00.set(true);
                    String o69960E12504770E40B = o69960E12506070EE095250.getText().toString();
                    InputBox.this.ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(o69960E12504770E40B);
                }
            }).setNegativeButton(oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o43B93024617F, new DialogInterface.OnClickListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.InputBox.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    oooooooo00o0oooooooo0ooooooooooooooooo0oooooo0ooooooooooooooooooo0ooo0oooo00oo0oooo0ooooooooooooooooooooooo00oooo0oo0ooooo00ooooooooooo0ooooooo0ooooo00.set(false);
                    InputBox.this.ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O("");
                }
            }).show();
            this.o6DB01F09405F70EE = new Handler(Looper.getMainLooper()) { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.InputBox.6
                @Override // android.os.Handler
                public void handleMessage(Message mesg) {
                    throw new RuntimeException();
                }
            };
            try {
                Looper.getMainLooper();
                Looper.loop();
            } catch (RuntimeException o729D) {
                o729D.printStackTrace();
            }
            return this.o64911F0B4B5447F90C424EC2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: 对话框类.java */
    /* loaded from: classes.dex */
    public static class MyAdapter extends BaseAdapter {
        private MyAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o64990A06.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            return Integer.valueOf(position);
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView o729D0D124847 = (TextView) convertView;
            if (o729D0D124847 == null) {
                o729D0D124847 = new TextView(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
                o729D0D124847.setPadding(15, 15, 15, 15);
                o729D0D124847.setGravity(4);
            }
            o729D0D124847.setText((CharSequence) ((Map) oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o64990A06.get(position)).get("title"));
            o729D0D124847.setTextSize(0, relatedio.oOOoo0ooOOooOOo0oOOOOoOo0OO0oo0OOOoOOOOoo00o0oo00Oo0OoOOo0oOoOO0ooOoooo0o(9.0f));
            return o729D0D124847;
        }
    }

    private static boolean oOo0Ooooo0OO0Oo0o00o00oO0OOOOooo00o00OOoOO0oO0oO0OoOo00OO0oO0(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static int oOOooooooOOOoOoOo0oOo0Oo0OO0oOOo00ooOOo0ooooO0OOoOo0O0oOo0oOO(String title, int initalColor) {
        ColorBox o639A = new ColorBox();
        return o639A.showDialog(title, initalColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: 对话框类.java */
    /* loaded from: classes.dex */
    public static class ColorBox {
        private int o64911F0B4B5447F90C424EC2;
        private Handler o6DB01F09405F70EE;

        private ColorBox() {
        }

        public int ooO0o0oo00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO() {
            return this.o64911F0B4B5447F90C424EC2;
        }

        public void oo0ooo0o00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO(int dialogResult) {
            this.o64911F0B4B5447F90C424EC2 = dialogResult;
        }

        public void ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(int result) {
            oo0ooo0o00OOoO0oOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0OoO0oOOoOoo0oOo0oOOo0OOo0oOOooOoo0oOO(result);
            Message o6D = this.o6DB01F09405F70EE.obtainMessage();
            this.o6DB01F09405F70EE.sendMessage(o6D);
        }

        public int showDialog(String title, int initalColor) {
            ooOooo0o00o0ooooooOO0oo0OoOOoO0oO0oo0o0oOo0OO0OO0ooooOooOOooOoOOO0oOO0ooOo00O0ooOOOO0ooOOOoOoooooo0OOoo o64911F0B4B54 = new ooOooo0o00o0ooooooOO0oo0OoOOoO0oO0oo0o0oOo0OO0OO0ooooOooOOooOoOOO0oOO0ooOo00O0ooOOOO0ooOOOoOoooooo0OOoo(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext(), title, oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.o4FB3, initalColor, new ooOooo0o00o0ooooooOO0oo0OoOOoO0oO0oo0o0oOo0OO0OO0ooooOooOOooOoOOO0oOO0ooOo00O0ooOOOO0ooOOOoOoooooo0OOoo.OnColorChangedListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.ColorBox.1
                @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooo0o00o0ooooooOO0oo0OoOOoO0oO0oo0o0oOo0OO0OO0ooooOooOOooOoOOO0oOO0ooOo00O0ooOOOO0ooOOOoOoooooo0OOoo.OnColorChangedListener
                public void ooO0oo0o00o0ooooooOO0oo0OoOOoO0o0oO0oo0oOOoOO0OOooooooooOOO0ooOoo0oOOoooO(int color) {
                    ColorBox.this.ooO0oOOo00oO0oooOooooOoo0oOoOOooOOooOo0oo00OO0oo0oooo0O(color);
                }
            });
            o64911F0B4B54.setCancelable(false);
            o64911F0B4B54.show();
            this.o6DB01F09405F70EE = new Handler(Looper.getMainLooper()) { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOoOoO0ooOOo0Oo0oOOOOoo0oo00OoOOo0oooOOooOOo0oOo0.ColorBox.2
                @Override // android.os.Handler
                public void handleMessage(Message mesg) {
                    throw new RuntimeException();
                }
            };
            try {
                Looper.getMainLooper();
                Looper.loop();
            } catch (RuntimeException o729D) {
                o729D.printStackTrace();
            }
            return this.o64911F0B4B5447F90C424EC2;
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOOooO0oo0OoOOoOoO0OoOooOOOOooOOOOo00Oo0oOooo0OOoOooOoOOo0oO0o00OOooOooOooOoOooOo0OoOo0OOoOo0oooOooOoOOoooOOoo00Oo0OoOO0o(int year, int monthOfYear, int dayOfMonth) {
        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.oB30DB4DBE0D9 = year;
        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.oB30DB4DBF0F1 = monthOfYear - 1;
        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.oB30DB4DBECE6 = dayOfMonth;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOo0OO0ooOOo0OoOoOoOOoo00OOOOo0OOOoO0OOooo0oOooO0OooOOOo00oO0OO0oO0oOoo0ooOooO0Oo0Oo0() {
        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().showDialog(0);
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOOooO0oo0OoOOoOoOoOOooO0o00o0OOOoo0oOo0oOooo0OOoOooOoOOo0oO0o00OOooOooOooOoOooOo0OoOo0OOoOo0oooOooOo0oo0oo00OOOoO0o0OOOO(int hourOfDay, int minute) {
        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.oB30DB4DBEE82 = hourOfDay;
        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.oB30DB4DB93E5 = minute;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOo0OO0ooOOo0OoOoOoOOoo00OOOOOOo0OooOOooo00o0oo0OOooOOOo00oO0OO0oO0oOoo0ooOooO0Oo0Oo0() {
        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().showDialog(1);
    }
}