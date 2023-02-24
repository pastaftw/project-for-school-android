package Interface;

//Common Imports
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;

import ae.ogrenci_usulu.R;
import ae.ogrenci_usulu.R.layout;

public class Common {
    public static int Get_ID_From_R(Context context, String type, String name) {
        return context.getResources().getIdentifier(name, type, context.getPackageName());
    }
    public static void Add_Layout(Context context, String layout_name, ScrollView add_to) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(Get_ID_From_R(context, "layout", layout_name), null);
        add_to.addView(view);
    }
}