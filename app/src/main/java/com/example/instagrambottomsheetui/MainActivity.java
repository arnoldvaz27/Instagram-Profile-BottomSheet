package com.example.instagrambottomsheetui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;


public class MainActivity extends AppCompatActivity {

    private BottomSheetDialog bottomSheetDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void BottomSheet() {
        bottomSheetDialog = new BottomSheetDialog(MainActivity.this,R.style.BottomSheetTheme);
        bottomSheetDialog.setCanceledOnTouchOutside(false);

        final View sheetView = LayoutInflater.from(MainActivity.this).inflate(R.layout.bottomsheetdialog, findViewById(R.id.CreateNew));

        final LinearLayout post,reel,story,highlight,videos,guide;

        post = sheetView.findViewById(R.id.post);
        reel = sheetView.findViewById(R.id.reel);
        story = sheetView.findViewById(R.id.stories);
        highlight = sheetView.findViewById(R.id.highlight);
        videos =  sheetView.findViewById(R.id.video);
        guide = sheetView.findViewById(R.id.guide);


        post.setOnClickListener(v -> {
            bottomSheetDialog.cancel();
            Toast.makeText(MainActivity.this, "Post Clicked", Toast.LENGTH_SHORT).show();
        });

        reel.setOnClickListener(v -> {
            bottomSheetDialog.cancel();
            Toast.makeText(MainActivity.this, "Reel Clicked", Toast.LENGTH_SHORT).show();
        });

        story.setOnClickListener(v -> {
            bottomSheetDialog.cancel();
            Toast.makeText(MainActivity.this, "Stories Clicked", Toast.LENGTH_SHORT).show();
        });

        highlight.setOnClickListener(v -> {
            bottomSheetDialog.cancel();
            Toast.makeText(MainActivity.this, "Highlight Clicked", Toast.LENGTH_SHORT).show();
        });

        videos.setOnClickListener(v -> {
            bottomSheetDialog.cancel();
            Toast.makeText(MainActivity.this, "Videos Clicked", Toast.LENGTH_SHORT).show();
        });

        guide.setOnClickListener(v -> {
            bottomSheetDialog.cancel();
            Toast.makeText(MainActivity.this, "Guide Clicked", Toast.LENGTH_SHORT).show();
        });

        bottomSheetDialog.setContentView(sheetView);
        bottomSheetDialog.show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.main_menu, menu);


        return true;
    }


    @SuppressLint("SetTextI18n")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == R.id.add) {
            BottomSheet();
        }
        if (item.getItemId() == R.id.more) {
            Toast.makeText(this, "More Settings Clicked", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

}