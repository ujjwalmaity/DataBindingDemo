package dev.ujjwal.databindingdemo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import dev.ujjwal.databindingdemo1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Student student = new Student("Ujjwal Maity", "ujjwalmaity@gmail.com");
        activityMainBinding.setStudentVariable(student);
    }
}
