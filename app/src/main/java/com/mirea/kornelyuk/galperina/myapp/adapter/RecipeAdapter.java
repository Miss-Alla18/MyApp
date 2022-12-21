package com.mirea.kornelyuk.galperina.myapp.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.mirea.kornelyuk.galperina.myapp.RecipePage;
import com.mirea.kornelyuk.galperina.myapp.R;
import com.mirea.kornelyuk.galperina.myapp.model.Recipe;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.CourseViewHolder> {

    Context context;
    List<Recipe> cours;

    public RecipeAdapter(Context context, List<Recipe> cours) {
        this.context = context;
        this.cours = cours;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View courseItem = LayoutInflater.from(context).inflate(R.layout.course_item, parent, false);//для всех эл определенный дизайн
        return new CourseViewHolder(courseItem);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.courseBg.setCardBackgroundColor(Color.parseColor(cours.get(position).getColour())); //цвет фона
        int imageId = context.getResources().getIdentifier("ic_" + cours.get(position).getImg(), "drawable", context.getPackageName()); //получаем картинку из строки в id
        holder.courseImage.setImageResource(imageId); //изображение
        holder.courseTitle.setText(cours.get(position).getTitle());
        holder.courseData.setText(cours.get(position).getDate());
        holder.courseLvl.setText(cours.get(position).getLvl());
        holder.itemView.setOnClickListener(new View.OnClickListener() { //обработка событий перелистывания
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, RecipePage.class);

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation((Activity) context, new Pair<View, String>(holder.courseImage, "courseImage"));

                intent.putExtra("courseBg",Color.parseColor(cours.get(position).getColour()));
                intent.putExtra("courseImage", imageId);
                intent.putExtra("courseTitle", cours.get(position).getTitle());
                intent.putExtra("courseData", cours.get(position).getDate());
                intent.putExtra("courseLvl", cours.get(position).getLvl());
                intent.putExtra("courseText", cours.get(position).getText());
                intent.putExtra("courseId", cours.get(position).getId());
                context.startActivity(intent, options.toBundle());

            }
        });

    }


    @Override
    public int getItemCount() {
        return cours.size();
    }

    public  static final class CourseViewHolder extends RecyclerView.ViewHolder{
        CardView courseBg;
        ImageView courseImage;
        TextView courseTitle, courseLvl, courseData;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);

            courseBg = itemView.findViewById(R.id.courseBg);
            courseImage = itemView.findViewById(R.id.courseImage);
            courseTitle = itemView.findViewById(R.id.courseTitle);
            courseData = itemView.findViewById(R.id.courseDate);
            courseLvl = itemView.findViewById(R.id.courseLvl);
        }
    }
}
