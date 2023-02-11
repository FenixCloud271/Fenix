package com.example.fenixblock.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName(value = "table_block_category")
public class CategoryVO {

    @TableField(value = "id")
    Integer id;

    @TableField(value = "name")
    String name;

    @TableField(value = "parent_id")
    Integer parentId;

    @TableField(value = "level")
    Integer level;

    @TableField(value = "show_status")
    Integer status;

    @TableField(exist = false)
    private List<CategoryVO> children;
}
