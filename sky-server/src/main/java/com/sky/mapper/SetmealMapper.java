package com.sky.mapper;

import com.sky.entity.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface SetmealMapper {
    /**
     * 根据分类id查询套餐数量
     * @param id
     * @return
     */
    @Select("select  count(id) from setmeal where category_id = #{categoryId}")
    Integer countByCategoryId(Long id);
}
