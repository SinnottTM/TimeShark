/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tim.application.timeShark.db;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "STAFF")
@Getter
@Setter
@Entity
@NoArgsConstructor
public class StaffEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "management")
    private Boolean management;

    @Column(name = "name")
    private String staffName;

    @Column(name = "contract")
    private String contract;

    @Column(name = "hours")
    private Integer hours;

}