package com.mirea.kornelyuk.galperina.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mirea.kornelyuk.galperina.myapp.model.Order;
import com.mirea.kornelyuk.galperina.myapp.model.Recipe;
import com.mirea.kornelyuk.galperina.myapp.viewmodel.RecipeViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class RecipePage extends AppCompatActivity {
    ConstraintLayout courseBg;
    ImageView courseImage;
    TextView courseTitle;
    TextView courseData;
    TextView courseLvl;
    TextView courseText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);

        RecipeViewModel viewModel = new ViewModelProvider(this).get(RecipeViewModel.class);
        //int recipeId Получаете recipe id через intent.getInt
        int recipeId = 1;
        Observer<Recipe> recipeObserver = new Observer<Recipe>() {
            // Полученное значение
            @Override
            public void onChanged(Recipe receivedRecipe) {
                if (receivedRecipe == null) {
                    Toast.makeText(RecipePage.this, "Ошибка запроса рецепта", Toast.LENGTH_SHORT).show();
                    return;
                }
                courseTitle.setText(receivedRecipe.getTitle());
                courseData.setText(receivedRecipe.getDate());
                courseLvl.setText(receivedRecipe.getLvl());
                courseText.setText(receivedRecipe.getText());
            }
        };
        viewModel.getRecipe(recipeId).observe(this, recipeObserver);

        courseBg = findViewById(R.id.coursePageBg);
        courseImage =  findViewById(R.id.coursePageImage);
        courseTitle =  findViewById(R.id.coursePageTitle);
        courseData =  findViewById(R.id.coursePageDate);
        courseLvl =  findViewById(R.id.coursePageLvl);
        courseText =  findViewById(R.id.coursePageText);

        courseBg.setBackgroundColor(getIntent().getIntExtra("courseBg",0));
        courseImage.setImageResource(getIntent().getIntExtra("courseImge", 0));
        courseTitle.setText(getIntent().getStringExtra("courseTitle"));
        courseData.setText(getIntent().getStringExtra("courseData"));
        courseLvl.setText(getIntent().getStringExtra("courseLvl"));
        courseText.setText(getIntent().getStringExtra("courseText"));
    }

    public void addToCard(View view){
        int item_id = getIntent().getIntExtra("courseId",0);
        Order.items_id.add(item_id);
        Toast.makeText(this,"Добавлено", Toast.LENGTH_LONG).show();
    }
}