package com.example.thanhcao.apphenho.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.thanhcao.apphenho.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ThanhCao on 5/29/2017.
 */

public class Adapter  extends ArrayAdapter<contact> {
    private Context cnt;
    private int recource;
    private List<contact> arrcontact;

    public Adapter(Context context, int resource, ArrayList<contact> arrContact) {
        super(context, resource, arrContact);
        this.cnt = context;
        this.recource = resource;
        this.arrcontact = arrContact;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(cnt).inflate(R.layout.lisviewer, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.textView4);
            viewHolder.tvSex = (TextView) convertView.findViewById(R.id.textView6);
            viewHolder.tvNoidung = (TextView) convertView.findViewById(R.id.noidung);
            viewHolder.tvAvatar = (TextView) convertView.findViewById(R.id.id_icon_user);
            viewHolder.tvRelasion = (TextView) convertView.findViewById(R.id.textView7);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        contact contact = arrcontact.get(position);
        viewHolder.tvAvatar.setBackgroundColor(contact.getColor());
        viewHolder.tvAvatar.setText(String.valueOf(position+1));
        viewHolder.tvName.setText(contact.getName());
        viewHolder.tvSex.setText(contact.getSex());
        viewHolder.tvRelasion.setText(contact.getRelasion());
        viewHolder.tvNoidung.setText(contact.getNoidung());
        return convertView;
    }

    public class ViewHolder {
        TextView tvName, tvSex,tvNoidung, tvAvatar, tvRelasion;
    }
}
