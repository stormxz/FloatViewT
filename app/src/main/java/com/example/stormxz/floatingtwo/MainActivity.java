package com.example.stormxz.floatingtwo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
/**
 * author：stormXZ on 17-8-29 14:20
 */
public class MainActivity extends Activity implements View.OnClickListener{

    private FloatingActionsMenu menu = null;
    private FloatingActionButton shareButtom = null;
    private FloatingActionButton copyButtom = null;
    private FloatingActionButton archiveButtom = null;
    private FloatingActionButton cutButtom = null;
    private FloatingActionButton deleteButtom = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        menu = findViewById(R.id.multiple_actions);
        shareButtom = findViewById(R.id.float_action_share);
        copyButtom = findViewById(R.id.float_action_copy);
        archiveButtom = findViewById(R.id.float_action_archive);
        cutButtom = findViewById(R.id.float_action_cut);
        deleteButtom = findViewById(R.id.float_action_delete);
        shareButtom.setOnClickListener(this);
        copyButtom.setOnClickListener(this);
        archiveButtom.setOnClickListener(this);
        cutButtom.setOnClickListener(this);
        deleteButtom.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.float_action_share:
                Toast.makeText(this, "分享", Toast.LENGTH_SHORT).show();
                closeMune();
                break;
            case R.id.float_action_copy:
                Toast.makeText(this, "复制", Toast.LENGTH_SHORT).show();
                closeMune();
                break;
            case R.id.float_action_archive:
                Toast.makeText(this, "移动", Toast.LENGTH_SHORT).show();
                closeMune();
                break;
            case R.id.float_action_cut:
                Toast.makeText(this, "剪切", Toast.LENGTH_SHORT).show();
                closeMune();
                break;
            case R.id.float_action_delete:
                Toast.makeText(this, "删除", Toast.LENGTH_SHORT).show();
                closeMune();
                break;
        }
    }

    private void closeMune(){
        if (menu != null) {
            if (menu.isExpanded()) {
                menu.collapse();
            }

        }
    }
}
