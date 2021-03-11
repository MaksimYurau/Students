package com.example.students;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.StudentViewHolder> {

    private final List<Student> students;

    public StudentsAdapter(List<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    static final class StudentViewHolder extends RecyclerView.ViewHolder {

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
