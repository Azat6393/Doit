package com.kastudio.doit.Note;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.kastudio.doit.R;

public class NotePopUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_pop_up);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.note_pop_up_activity);

        fragment = NotePopUp.newInstance();
        fragmentManager.beginTransaction().add(R.id.note_pop_up_activity,fragment).commit();

    }

    public static Intent newIntent(Context context){
        Intent intent = new Intent(context, NotePopUpActivity.class);
        return intent;
    }
}