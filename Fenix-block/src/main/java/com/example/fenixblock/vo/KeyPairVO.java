package com.example.fenixblock.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "table_block_key_pair")
public class KeyPairVO {

    @TableField(value = "id")
    Integer id;

    @TableField(value = "user_id")
    Integer userId;

    @TableField(value = "currency_type")
    String currencyType;

    @TableField(value = "private_key")
    String privateKey;

    @TableField(value = "public_key")
    String publicKey;
}
