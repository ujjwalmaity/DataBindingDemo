package dev.ujjwal.databindingdemo1;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MainActivityClickHandlers {

    private Context context;

    public MainActivityClickHandlers(Context context) {
        this.context = context;
    }

    public void onEnrolledButtonClicked(View view) {
        Toast.makeText(context, "Enrolled clicked", Toast.LENGTH_SHORT).show();
    }

    public void onCancelButtonClicked(View view) {
        Toast.makeText(context, "Cancel clicked", Toast.LENGTH_SHORT).show();
    }
}
