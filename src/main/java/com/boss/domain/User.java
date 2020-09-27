package com.boss.domain;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author ZX
 * @Date 2020/9/27 21:06
 * @Version 1.0
 */
@Data
@Accessors(chain = true)
public class User {
    private String id;
    private String name;
}
