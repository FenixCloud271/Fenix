package com.example.fenixblock.vo;

import lombok.Data;

@Data
public class CurrencyVO {
    // 货币种类
    private String symbol;
    // 金额
    private Integer decimals;
}
