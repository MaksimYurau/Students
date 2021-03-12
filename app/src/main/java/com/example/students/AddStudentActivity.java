package com.example.students;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class AddStudentActivity extends AppCompatActivity {

    private EditText firstName;
    private EditText lastName;
    private CheckBox gender;
    private Button saveButton;
    private Button deleteButton;
    private CircleImageView photoView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
    }
}
