package com.example.demo3h.mapper;

import com.example.demo3h.model.Porduct;
import com.example.demo3h.model.ProductType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PorductMapper {
    @Select("<script> SELECT p.*,pt.ptname AS ptname FROM porduct p  INNER JOIN product_type pt ON p.ptid = pt.ptid<where> <if test=\"ptid != null\">and p.ptid=#{ptid}</if> <if test=\"proname != null and proname !=''\"> and proname LIKE CONCAT ('%',#{proname},'%')</if> </where> </script>")
    List<Porduct> selectAll(Porduct porduct);

    @Select("select * from product_type")
    List<ProductType> selectNameAll();

    int deleteByPrimaryKey(Integer proid);

    int insert(Porduct record);

    int insertSelective(Porduct record);

    Porduct selectByPrimaryKey(Integer proid);

    int updateByPrimaryKeySelective(Porduct record);

    int updateByPrimaryKey(Porduct record);
}