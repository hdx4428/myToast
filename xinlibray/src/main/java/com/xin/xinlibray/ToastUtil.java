package com.xin.xinlibray;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 项目名称：鼎品
 * 类描述：
 * 创建人：${Peter}
 * 创建时间： 2018/7/31.
 */
public class ToastUtil extends Toast {

    public ToastUtil(Context context) {
        super(context);
        mContext = context;
    }

    private static Context mContext;

    private static ToastUtil toast;

    public static void showToast(String msg) {
        try {
            TextView textView = null;
            View view = null;
            if (view == null) {
                view = LayoutInflater.from(mContext).inflate(R.layout.toast_view, null);
                textView = (TextView) view.findViewById(R.id.textView1);
            }
            if (toast == null) {
                toast = new ToastUtil(mContext);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 200);
            }
            textView.setText(msg);
            toast.setView(view);
            toast.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


