package com.vitelco.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "order")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//otomatik id uretme
    private long id;
    private String title;
    private LocalDateTime createdDate;
    @ManyToOne(fetch = FetchType.EAGER)//coktan bire - Eager useri cekince orderlarida cek
    @JoinColumn(name = "userid", nullable = false)
    private User assignedUser;
    private Category category;

    public Order(Long id, String title, User user, Category category){
        this.id = id;
        this.title = title;
        this.createdDate = LocalDateTime.now();
        this.assignedUser = user;
        this.category = category;
    }
    public enum Category{
        WORK,PERSONAL

    }


}
