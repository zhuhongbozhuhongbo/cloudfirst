package com.example.service_hi.enums;

import lombok.Getter;

/**
 * All Rights Reserved, Designed By ZHB.
 *
 * @author:
 * @date:
 * @copyright:
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
