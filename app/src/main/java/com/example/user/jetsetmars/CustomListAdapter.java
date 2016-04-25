package com.example.user.jetsetmars;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final String[] firstLine;
    private final String[] secondLine;
    private final String[] thirdLine;



    public CustomListAdapter(Activity context, String[] itemname, String[] firstLine, String[] secondLine, String[] thirdLine) {
        super(context, R.layout.list, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
    }

    public View getView(int position,View view,ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();

        View rowView=inflater.inflate(R.layout.list,null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.title_materials);
        TextView txtFirstLine = (TextView) rowView.findViewById(R.id.first_line);
        TextView txtSecondLine = (TextView) rowView.findViewById(R.id.second_line);
        TextView txtThirdLine = (TextView) rowView.findViewById(R.id.third_line);


        txtTitle.setText(itemname[position]);
        txtFirstLine.setText(firstLine[position]);
        txtSecondLine.setText(secondLine[position]);
        txtThirdLine.setText(thirdLine[position]);

        return rowView;

    };
}