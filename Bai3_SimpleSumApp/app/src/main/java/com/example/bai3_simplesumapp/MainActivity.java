package com.example.bai3_simplesumapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        public void calculateSum(View view) {
            EditText number1 = findViewById(R.id.number1);
            EditText number2 = findViewById(R.id.number2);
            TextView resultText = findViewById(R.id.resultText);

            // Lấy giá trị từ EditText
            String num1Str = number1.getText().toString();
            String num2Str = number2.getText().toString();

            // Kiểm tra và chuyển đổi số
            if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
                int num1 = Integer.parseInt(num1Str);
                int num2 = Integer.parseInt(num2Str);
                int sum = num1 + num2;

                // Hiển thị kết quả
                resultText.setText("Kết quả: " + sum);
            } else {
                resultText.setText("Vui lòng nhập đủ số!");
            }
        }

    }
}