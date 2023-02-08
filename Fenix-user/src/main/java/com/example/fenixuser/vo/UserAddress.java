package com.example.fenixuser.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "table_user_address")
public class UserAddress {

    @TableField(value = "id")
    private int id;

    @TableField(value = "user_id")
    private int userId;

    @TableField(value = "chain")
    private String chain;

    @TableField(value = "net")
    private String net;

    @TableField(value = "from_address")
    private String fromAddress;
}
