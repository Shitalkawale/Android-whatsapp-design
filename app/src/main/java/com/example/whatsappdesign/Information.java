package com.example.whatsappdesign;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Information extends BaseAdapter{

    Context mContext;
    int[] profile;
    String[] name;
    int[] delevermsg;



    String[] msg;
    String[] timing;


    public Information(Context mContext, int[] profile, String[] name, int[] delevermsg, String[] msg, String[] timing) {
        this.mContext = mContext;
        this.profile = profile;
        this.name = name;
        this.delevermsg = delevermsg;
        this.msg = msg;
        this.timing = timing;
    }

    @Override
    public int getCount() {
        return profile.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        View myview=null;
        if (myview==null)
        {
            LayoutInflater layoutInflater=LayoutInflater.from(mContext);
            myview=layoutInflater.inflate(R.layout.my_whatsapp_adapter,null);

        }
        else
        {
            myview=view;
        }

        CircleImageView circleImageView=myview.findViewById(R.id.profile);
        TextView myname=myview.findViewById(R.id.name);
        ImageView deliverstaus=myview.findViewById(R.id.delivermsg);
        TextView msg1=myview.findViewById(R.id.msg);
        TextView time=myview.findViewById(R.id.delevertime);


        circleImageView.setImageResource(profile[i]);
        myname.setText(name[i]);

        msg1.setText(msg[i]);
        time.setText(timing[i]);



        return myview;
    }
}
