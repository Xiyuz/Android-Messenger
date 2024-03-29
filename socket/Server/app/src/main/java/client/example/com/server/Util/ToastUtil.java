package client.example.com.server.Util;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    private static Toast toast;

    public static void show(Context context, String text, final int duration) {
        if (toast == null) {
            toast = Toast.makeText(context, text, duration);
        } else {
            toast.setText(text);
            toast.setDuration(duration);
        }
        toast.show();
    }

    public static void showShort(Context context, String text) {
        show(context, text, Toast.LENGTH_SHORT);
    }
}