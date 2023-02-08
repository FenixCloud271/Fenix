package com.example.fenixblock.vo;

import lombok.Data;

import java.util.List;

@Data
public class BalanceVO {
    // 查询的用户
    private String identify;
    // 货币
    private List<CurrencyVO> currencyVOList;
}
