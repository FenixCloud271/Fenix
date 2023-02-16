package entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "table_block_transaction_testnet")
public class TransactionVO {

    @TableField(value = "id")
    private int id;

    @TableField(value = "chain")
    private String chain;

    @TableField(value = "block_number")
    private String blockNumber;

    @TableField(value = "block_hash")
    private String blockHash;

    @TableField(value = "from_address")
    private String fromAddress;

    @TableField(value = "to_address")
    private String toAddress;

    @TableField(value = "tx_hash")
    private String txHash;

    @TableField(value = "value")
    private String value;

    @TableField(value = "gas")
    private String gas;

    @TableField(value = "tx_type")
    private String txType;

    @TableField(value = "nonce")
    private String nonce;

    @TableField(value = "timestamp")
    private String timestamp;
}
