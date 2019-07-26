/*
 * Copyright (c) 2016-2018
 * 上加下信息技术成都有限公司
 * 保留所有权利
 */
package com.wy.demo.dao.shipper;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @Description: 货主po
 * @Auther: wangyan
 * @Date: 2018/8/13
 */
@Entity
@Setter
@Getter
@Table(name = "shipper",indexes = {
        @Index(name = "idx_shipper_unique",columnList = "materialCode",unique = true),
        @Index(name = "idx_shipper_common",columnList = ",materialCode,companyCode")
})
public class Shipper {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * 物料code
     */
    @Column(length = 18, nullable = false)
    private String materialCode;
    /**
     * 公司code
     */
    @Column(length = 4, nullable = false)
    private String companyCode;
    /**
     * 地区code
     */
    @Column(length = 4, nullable = false)
    private String region;
    /**
     * 开始时间
     */
    private LocalDate startDate;
    /**
     * 结束时间
     */
    private LocalDate endDate;
    /**
     * 模式
     */
    @Column(length = 8)
    private String mode;
}
