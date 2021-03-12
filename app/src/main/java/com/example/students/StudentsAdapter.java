package com.example.students;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.StudentViewHolder> {

    private final List<Student> students;
    private final Listener onStudentClickListener;

    public StudentsAdapter(List<Student> students, Listener onStudentClickListener) {
        this.students = students;
        this.onStudentClickListener = onStudentClickListener;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_add_student, parent, false);
        view.setOnClickListener(v -> {
            onStudentClickListener.onStudentClick((Student) v.getTag());
        });
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = students.get(position);
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

    interface Listener {
        void onStudentClick(Student student);
    }
}
