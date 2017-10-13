/**
 * Created by Arif on 10/13/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import android.widget.Toast;

/**
 * Created by Arif on 8/23/2017.
 */

public class custom_list_class extends BaseAdapter {

    String[] name;
    int[] imz;

    Context Ct;
    public static LayoutInflater inflater = null;
    //constructor
    custom_list_class(aInterView mainAct, String[] nameofhero, int[] imazofhero)
    {
        name = nameofhero;
        imz = imazofhero;
        Ct = mainAct;
        inflater = (LayoutInflater) mainAct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {

        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    public class MyHolder{
        TextView tv;
        ImageView im;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        MyHolder mh = new MyHolder();

        View myview;

        myview = (View) inflater.inflate(R.layout.custom_list_view, null);
        mh.tv = (TextView) myview.findViewById(R.id.textviewid);
        mh.im = (ImageView) myview.findViewById(R.id.imageviewid);

        mh.tv.setText(name[i]);
        mh.im.setImageResource(imz[i]);
        return myview;
    }
}
