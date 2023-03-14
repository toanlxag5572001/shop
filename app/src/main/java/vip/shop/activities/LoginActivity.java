package vip.shop.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import vip.shop.R;
import vip.shop.databinding.ActivityLoginBinding;
import vip.shop.databinding.ActivityMainBinding;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {
ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        //nút hiện ẩn pass. chưa có phương thức get pass nên chưa hoàn thiện phần này hoàn thiện khi làm xong full login
//        ImageView imageViewShowHidePass = findViewById(R.id.show_hidepass);
//        imageViewShowHidePass.setImageResource(R.drawable.ic_hide_pwd);
//        imageViewShowHidePass.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }


}