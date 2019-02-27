package com.xie.mapper;

import com.xie.domain.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {

    Product selProductById(@Param("productId") Integer productId);
}
