package com.furnitureapp.factory.stockcontrol;

/**
 * @author @Siba182
 * Description: Factory for Category entity
 */

import com.furnitureapp.entity.stockcontrol.Category;
import com.furnitureapp.utility.Helper;

public class CategoryFactory {

    public static Category createProductCategory(String categoryName){

        return new Category.ProductCategoryBuilder()
                .setCategoryCode(Helper.generateCode())
                .setCategoryName(categoryName)
                .build();
    }
}
