package com.example.crud;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Empl1 {
    @Id
    private int empcode;
    private String ename;

    private int empage;
    private int esalary;

}
