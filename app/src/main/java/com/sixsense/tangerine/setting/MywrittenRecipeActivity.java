package com.sixsense.tangerine.setting;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.sixsense.tangerine.R;
import com.sixsense.tangerine.home.RecipeListFragment;

public class MywrittenRecipeActivity extends AppCompatActivity {
    public static int sMyId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_activity_mywritten_recipe);

        sMyId = getIntent().getIntExtra("EXTRA_USER_ID",-1);
        if(sMyId!=-1){

            RecipeListFragment recipeListFragment = new RecipeListFragment("written", null);

            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.my_written_frame, recipeListFragment).commit();
        }
    }
}