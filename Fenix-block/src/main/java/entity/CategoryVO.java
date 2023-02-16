package entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
    @TableLogic(value = "1", delval = "0")
    Integer status;

    @TableField(exist = false)
    private List<CategoryVO> children;
}
